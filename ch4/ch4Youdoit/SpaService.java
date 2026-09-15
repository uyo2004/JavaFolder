// Uyoojo Okene
// p.138

public class SpaService {
    private String serviceName;
    private double Price;

    public SpaService() {
        this("XXX", 0.0);
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