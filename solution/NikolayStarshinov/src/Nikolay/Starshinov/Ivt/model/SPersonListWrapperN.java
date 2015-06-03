package Nikolay.Starshinov.Ivt.model;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Helper class to wrap a list of persons. This is used for saving the
 * list of persons to XML.
 * 
 * @author Marco Jakob
 */
@XmlRootElement(name = "persons")
public class SPersonListWrapperN {

    private List<SPersonN> persons;

    @XmlElement(name = "person")
    public List<SPersonN> getPersons() {
        return persons;
    }

    public void setPersons(List<SPersonN> persons) {
        this.persons = persons;
    }
}