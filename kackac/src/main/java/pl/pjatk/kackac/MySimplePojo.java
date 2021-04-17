package pl.pjatk.kackac;

import java.sql.SQLOutput;

public class MySimplePojo {
    private String someStringValue;

    public MySimplePojo(String someStringValue) {
        this.someStringValue = someStringValue;
        System.out.println("IM HERE");
    }

    public String getSomeStringValue() {
        return someStringValue;
    }

    public void printOutMe() {
        System.out.println("Value from MySimplePojo is: " + someStringValue);
    }

    @Override
    public String toString() {
        return "MySimplePojo{" + "someStringValue='" + someStringValue + '\'' + '}';
    }
}
