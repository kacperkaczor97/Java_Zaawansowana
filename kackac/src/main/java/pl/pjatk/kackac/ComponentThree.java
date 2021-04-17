package pl.pjatk.kackac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.nio.channels.ClosedSelectorException;
import java.nio.channels.SocketChannel;

@Component
public class ComponentThree {

//    public ComponentThree(ApplicationContext applicationContext) {
//        ComponentOne componentOne = applicationContext.getBean("componentOne", ComponentOne.class);
//        ComponentTwo componentTwo = applicationContext.getBean("componentTwo", ComponentTSwo.class);
//        componentTwo.helloFromComponent();
//
//        System.out.println("Hello From Component Three");
//    }
//
//    public ComponentThree(ComponentOne componentOne, ComponentTwo componentTwo) {
//        componentTwo.helloFromComponent();
//
//        System.out.println("Hello From Component Three");
//    }

//    public ComponentThree(ComponentOne componentOne, ComponentTwo componentTwo, MySimpleClass mySimpleClass, MySimpleClass mySecondSimpleClass) {
//
//        ComponentTwo.helloFromComponent();
//        System.out.println("Hello From ComponentThree");
//        System.out.println(mySimpleClass.getName());
//        System.out.println(mySecondSimpleClass.getName());
//
//    }

    public ComponentThree(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Hello from ComponentThree");
        MySimpleClass myFirstSimpleClass = context.getBean("myFirstSimpleClass", MySimpleClass.class);
        MySimpleClass mySecondSimpleClass = context.getBean("mySecondSimpleClass", MySimpleClass.class);

        System.out.println(myFirstSimpleClass.getName());
        System.out.println(mySecondSimpleClass.getName());
    }
}
