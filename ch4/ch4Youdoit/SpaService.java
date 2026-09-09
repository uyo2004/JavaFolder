// Uyoojo Okene
// p.133

public class SpaService {
    private String serviceName;
    private double Price;
    public SpaService() {
        serviceName = "XXX";
        Price = 0;
    }
    public SpaService(String name, double pr) {
        serviceName = name;
        Price = pr;
    }

    public void setServiceName(String service) {
        serviceName = service;
    }
    public void setServicePrice(double price) {
        Price = price;
    }
    public String getServiceName() {
        return serviceName;
    }
    public double getServicePrice() {
        return Price;
    }
}