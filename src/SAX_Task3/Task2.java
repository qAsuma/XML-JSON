package SAX_Task3;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileOutputStream;
import java.io.IOException;
//Создайте класс, используя SAXParser, в котором опишите иерархию XML файла.Необходимо, чтобы проект создавал XML файл и строил дерево (город, название улицы, дом).
// В городе используйте аттрибут(например, <city size=”big>Kiev</city>).
public class Task2 {
    public static void main(String[] args) throws IOException,XMLStreamException {

            XMLOutputFactory factory = XMLOutputFactory.newFactory();
            XMLStreamWriter writer = factory.createXMLStreamWriter(new FileOutputStream("D:\\Java\\SerializationXML&JSON\\src\\Task2\\SAX.xml"));
            writer.writeStartDocument();
            writer.writeStartElement("City");
            writer.writeAttribute("size","big");
            writer.writeCharacters("Kyiv");
            writer.writeStartElement("Street");
            writer.writeCharacters("Улица ");
            writer.writeStartElement("House");
            writer.writeCharacters("Номер_дома");
            writer.writeEndElement();
            writer.writeEndElement();
            writer.writeEndElement();



    }
}
