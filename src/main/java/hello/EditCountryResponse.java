//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package hello;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"country"}
)
@XmlRootElement(
        name = "editCountryResponse",
        namespace="http://hello"
)
public class EditCountryResponse {

    protected Country country;

    public EditCountryResponse() {
    }

    public Country getCountry() {
        return this.country;
    }

    public void setCountry(Country value) {
        this.country = value;
    }
}
