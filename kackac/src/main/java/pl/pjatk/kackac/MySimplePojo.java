package pl.pjatk.kackac;

import java.sql.SQLOutput;

public class MySimplePojo {
    private final String string;


    public MySimplePojo(String someStringValue) {
        this.string = someStringValue;
        System.out.println("----------------------");
        System.out.println("Helo From MySimplePojo");
        System.out.println("----------------------");
    }

    public String getSomeStringValue() {
        return string;
    }

    public void printOutMe() {
        System.out.println("Value from MySimplePojo is: " + string);
    }

    @Override
    public String toString() {
        return "MySimplePojo{" + "someStringValue='" + string + '\'' + '}';
    }
}
