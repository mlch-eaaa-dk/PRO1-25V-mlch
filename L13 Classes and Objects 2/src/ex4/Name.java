package ex4;

public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        middleName = null;
        this.lastName = lastName;
    }

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFullName() {
        if (middleName == null) {
            return firstName + " " + lastName;
        } else {
            return firstName + " " + middleName + " " + lastName;
        }
    }

    // Pre: first name and last name has at least 2 letters
    public String userName() {
        int lengthMiddleName = (middleName != null) ? middleName.length() : 0;
        return firstName.substring(0, 2).toUpperCase() + lengthMiddleName
                + lastName.substring(lastName.length() - 2).toLowerCase();
    }

    public String getInitials() {
        if (middleName == null) {
            return "" + firstName.charAt(0) + lastName.charAt(0);
        } else {
            return "" + firstName.charAt(0) + middleName.charAt(0) + lastName.charAt(0);
        }
    }

    public String getCryptoInitials(int count) {
        char ch1 = (char) (firstName.charAt(0) + count);
        char ch3 = (char) (lastName.charAt(0) + count);
        if (middleName == null) {
            return "" + ch1 + ch3;
        } else {
            char ch2 = (char) (middleName.charAt(0) + count);
            return "" + ch1 + ch2 + ch3;
        }
    }
}
