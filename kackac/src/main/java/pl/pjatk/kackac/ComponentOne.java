package pl.pjatk.kackac;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ComponentOne {


    public ComponentOne(
            MySimplePojo mySimplePojo,
            List<String> defaultData,
            List<String> anotherDefaultData,
            List<MySimplePojo> mySimplePojoList,
            int someInt
    ){
        System.out.println("Hello From ComponentOne");
        mySimplePojo.printOutMe();
        System.out.println(defaultData);
        System.out.println(anotherDefaultData);
        System.out.println(mySimplePojoList);
        System.out.println(someInt);
    }

}