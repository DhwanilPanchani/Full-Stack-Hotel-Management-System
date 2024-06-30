package ProjectModel.services;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ProjModel.Services;
import ProjModel.Organization;
import UserInterface.Main.DateUtils;

public abstract class Service {

    protected static final String TAB = "      ";

    static enum ServiceType {
        BUSINESS_EVENT,
        RESTURANT,
        HEALTH_CLUB,
        HOTEL,
    }

    public static enum Status {
        PENDING, CONFIRMED, REJECTED;
    }

    private ServiceType serviceType;
    private int cost;
    private Date date;
    protected Services enterprise;
    private Status status;
    protected int totalCost;
    private List<Organization> listOfOrg;

    Service(Services enterprise, ServiceType serviceType, Date date) {
        this.enterprise = enterprise;
        this.serviceType = serviceType;
        this.date = (date == null) ? null : DateUtils.formatDate(date);
        this.status = Status.PENDING;
        this.listOfOrg = new ArrayList<>();
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Services getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Services enterprise) {
        this.enterprise = enterprise;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void addOrganization(Organization org) {
        listOfOrg.add(org);
    }

    public List<Organization> getListOfOrg() {
        return listOfOrg;
    }

    public void setListOfOrg(List<Organization> listOfOrg) {
        this.listOfOrg = listOfOrg;
    }

    public abstract String toString();
}
