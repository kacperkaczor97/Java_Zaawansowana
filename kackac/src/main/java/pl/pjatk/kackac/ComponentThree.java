package pl.pjatk.kackac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ComponentThree {

    public ComponentThree(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Hello from ComponentThree");
        MySimpleClass myFirstSimpleClass = context.getBean("myFirstSimpleClass", MySimpleClass.class);
        MySimpleClass mySecondSimpleClass = context.getBean("mySecondSimpleClass", MySimpleClass.class);

        System.out.println(myFirstSimpleClass.getName());
        System.out.println(mySecondSimpleClass.getName());
    }
}
