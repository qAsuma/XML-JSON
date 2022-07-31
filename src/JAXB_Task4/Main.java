package JAXB_Task4;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class Main {
    public static void main(String[] args) throws JAXBException {
        JAXB_City JAXBCity = new JAXB_City();
        JAXBCity.setCity("Kyiv");
        JAXBCity.setSize("big");
        JAXBCity.setStreet("Shevchenka");
        JAXBCity.setHouse(123);

        JAXBContext context = JAXBContext.newInstance(JAXB_City.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
        marshaller.marshal(JAXBCity,new File("D:\\Java\\SerializationXML&JSON\\src\\JAXB_Task4\\JAXB.xml"));
        marshaller.marshal(JAXBCity,System.out);
    }
}
