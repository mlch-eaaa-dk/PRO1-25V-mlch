package ex1;

public class Person {
    private String name;
    private String cpr;
    private String phone;

    public Person(String name, String cpr, String phone) {
        this.name = name;
        this.cpr = cpr;
        this.phone = phone;
    }

    public String getCpr() {
        return cpr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person(" + name + ", " + cpr + ", " + phone + ")";
    }
}
