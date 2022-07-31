package JAXB_Task4;

import javax.xml.bind.annotation.*;

//Cоздайте класс, используя JAXB, в котором опишите иерархию XML файла.Необходимо,
// чтобы проект создавал XML файл и строил дерево (город, название улицы, дом).
// В городе используйте аттрибут(например, <city size=”big>Kiev</city>).
@XmlRootElement(name = "city")
@XmlType(propOrder = {"size", "city", "street", "house"})
public class JAXB_City {
    private String city;
    private String size;
    private String street;
    private int house;

    public JAXB_City(String city, String size, String street, int house) {
        this.city = city;
        this.size = size;
        this.street = street;
        this.house = house;
    }

    public JAXB_City() {

    }

    @XmlAttribute
    public void setCity(String city) {
        this.city = city;
    }

    @XmlAttribute
    public void setSize(String size) {
        this.size = size;
    }

    @XmlElement
    public void setStreet(String street) {
        this.street = street;
    }

    @XmlElement
    public void setHouse(int house) {
        this.house = house;
    }

    public String getCity() {
        return city;
    }

    public String getSize() {
        return size;
    }


    public String getStreet() {
        return street;
    }

    public int getHouse() {
        return house;
    }


}
