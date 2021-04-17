package pl.pjatk.kackac;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ComponentOne {


    public ComponentOne(
            List<String> defaultData,
            List<String> anotherDefaultData

    ){
        System.out.println("Hello From ComponentOne");
        System.out.println(defaultData);
        System.out.println(anotherDefaultData);


    }

}