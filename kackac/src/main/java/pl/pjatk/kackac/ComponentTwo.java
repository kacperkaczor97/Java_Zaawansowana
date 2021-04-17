package pl.pjatk.kackac;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ComponentTwo {

//
//    public ComponentTwo(
//       @Value("${my.custom.property}") String valueFromProperties,
//       @Value("${my.custom.random:some default value from @value}") String randomValueFromProperties
//    ){
//        System.out.println("Hello From Component Two");
//        System.out.println("--------------");
//        System.out.println(valueFromProperties);
//        System.out.println("--------------");
//        System.out.println(randomValueFromProperties);
//        System.out.println("--------------");
//    }
    public static void helloFromComponent(){
        System.out.println("Hello from my ComponentTwo");
    }
}