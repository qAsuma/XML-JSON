package FREEPRACTICE;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class Task3 {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\Java\\SerializationXML&JSON\\src\\Task3\\1.xml");

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            Element root = doc.getDocumentElement();
            System.out.println("root element " + root.getNodeName());
            NodeList nl = root.getChildNodes();


            for (int i = 0; i < nl.getLength(); i++) {
                Node node = nl.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) node;
                    System.out.println("author: " + element.getElementsByTagName("author").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("Title: " + element.getElementsByTagName("title").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("chapters: " + element.getElementsByTagName("chapters").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("info: " + element.getElementsByTagName("info").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("commentaries: " + element.getElementsByTagName("commentaries").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("relise_date: " + element.getElementsByTagName("relise_date").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println(" ");
                }
            }
        }catch (ParserConfigurationException | SAXException | IOException e){
            e.printStackTrace();
        }
    }
}
