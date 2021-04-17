package pl.pjatk.kackac;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(
        value = "my.boolean.value",
        havingValue = "true"
)
public class AnotherComponent {

    public AnotherComponent(){
        System.out.println("-------------------------");
        System.out.println("Only on JAZ profile");
        System.out.println("-------------------------");
    }
}
