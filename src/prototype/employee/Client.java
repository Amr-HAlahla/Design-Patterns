package prototype.employee;

public class Client {
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public Prototype CreateEmployeeRecord() {
        return prototype.getClone();
    }
}
