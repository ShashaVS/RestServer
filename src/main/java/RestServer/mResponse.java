package RestServer;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class mResponse {

    public String name;
    public int age;

    public mResponse() {
    }

    public mResponse(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
