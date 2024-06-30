package ProjModel;

public class Services {

    protected String name;
    protected String contact;

    public Services() {
        
    }
    
    public Services(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String toString() {
        return name;
    }
}
