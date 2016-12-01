import classes.Day;
import classes.Group;
import classes.Lecture;
import classes.Schedule;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.*;

public class Main {

    public static void main(String[] args){
        Schedule schedule = unmarshaling("res/schedule.xml");
        marshaling(schedule);
        staxWrite(schedule);
    }

    private static Schedule unmarshaling(String path) {
        JAXBContext jaxbContext;
        try {
            jaxbContext = JAXBContext.newInstance(Schedule.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            FileReader reader = new FileReader(path);
            return (Schedule) unmarshaller.unmarshal(reader);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void marshaling(Schedule schedule){
        try {
            JAXBContext context = JAXBContext.newInstance(Schedule.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            File file=new File("res/marshaling.xml");
            file.createNewFile();
            marshaller.marshal(schedule, file);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void staxWrite(Schedule schedule){
        XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
        XMLStreamWriter xmlStreamWriter = null;
        try {
            xmlStreamWriter = xmlOutputFactory.createXMLStreamWriter(new FileWriter("res/stax_schedule.xml"));
            xmlStreamWriter.writeStartDocument();
            xmlStreamWriter.writeStartElement("schedule");
            xmlStreamWriter.writeAttribute("xmlns", "http://www.example.org/schedule");
            xmlStreamWriter.writeAttribute("xmlns:l", "http://www.example.org/lecturer");

            for(Group group: schedule.getGroup()){
                xmlStreamWriter.writeStartElement("group");
                xmlStreamWriter.writeAttribute("id", group.getId());
                for(Day day: group.getDay()){
                    xmlStreamWriter.writeStartElement("day");
                    xmlStreamWriter.writeAttribute("name", day.getName());
                    for (Lecture lecture: day.getLecture()) {
                        xmlStreamWriter.writeStartElement("lecture");
                        xmlStreamWriter.writeAttribute("sequence", lecture.getSequence().toString());
                        xmlStreamWriter.writeAttribute("week", lecture.getWeek());

                        if(lecture.getSubject()!=null) {
                            xmlStreamWriter.writeStartElement("subject");
                            xmlStreamWriter.writeCharacters(lecture.getSubject());
                            xmlStreamWriter.writeEndElement();
                        }

                        if(lecture.getType()!=null) {
                            xmlStreamWriter.writeStartElement("type");
                            xmlStreamWriter.writeCharacters(lecture.getType());
                            xmlStreamWriter.writeEndElement();
                        }

                        if(lecture.getLectureHall()!=null) {
                            xmlStreamWriter.writeStartElement("lecture_hall");
                            xmlStreamWriter.writeCharacters(lecture.getLectureHall());
                            xmlStreamWriter.writeEndElement();
                        }

                        if(lecture.getLecturer()!=null) {
                            xmlStreamWriter.writeStartElement("lecturer");
                            xmlStreamWriter.writeStartElement("l:name");
                            xmlStreamWriter.writeCharacters(lecture.getLecturer().getName());
                            xmlStreamWriter.writeEndElement();

                            xmlStreamWriter.writeStartElement("l:position");
                            xmlStreamWriter.writeCharacters(lecture.getLecturer().getPosition());
                            xmlStreamWriter.writeEndElement();

                            xmlStreamWriter.writeStartElement("l:chair");
                            xmlStreamWriter.writeCharacters(lecture.getLecturer().getChair());
                            xmlStreamWriter.writeEndElement();

                            xmlStreamWriter.writeStartElement("l:university");
                            xmlStreamWriter.writeCharacters(lecture.getLecturer().getUniversity());
                            xmlStreamWriter.writeEndElement();

                            if (lecture.getLecturer().getPhone().size() > 0) {
                                for (Object phone : lecture.getLecturer().getPhone()) {
                                    xmlStreamWriter.writeStartElement("l:phone");
                                    xmlStreamWriter.writeCharacters(phone.toString());
                                    xmlStreamWriter.writeEndElement();
                                }
                            }
                            if (lecture.getLecturer().getPhone().size() > 0) {
                                for (Object mail : lecture.getLecturer().getMail()) {
                                    xmlStreamWriter.writeStartElement("l:mail");
                                    xmlStreamWriter.writeCharacters(mail.toString());
                                    xmlStreamWriter.writeEndElement();
                                }
                            }
                            xmlStreamWriter.writeEndElement();
                        }
                        xmlStreamWriter.writeEndElement();
                    }
                    xmlStreamWriter.writeEndElement();
                }
                xmlStreamWriter.writeEndElement();
            }
            xmlStreamWriter.writeEndElement();
            xmlStreamWriter.writeEndDocument();
        } catch (XMLStreamException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        } finally {
            try {
                xmlStreamWriter.close();
            } catch (XMLStreamException e) {
                e.printStackTrace();
            }
    }
    }
}
