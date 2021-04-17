package pl.pjatk.kackac;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwo {


    public ComponentTwo(){
        System.out.println("Hello From Component Two");

    }
    public static void helloFromComponent(){
        System.out.println("Hello from my Component");
    }
}