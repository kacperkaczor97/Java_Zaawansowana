package pl.pjatk.kackac;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataConfig {

    @Bean
    public  MySimplePojo mySimplePojo(){
        return new MySimplePojo("Some String Value");
    }

    @Bean
    public List<String> defaultData() {
        return List.of("1", "2", "3", "4", "5");
    }

    @Bean
    public List<String> anotherDefaultData() {
        return List.of("5", "4", "3", "2", "1");
    }

    @Bean
    public List<MySimplePojo> mySimplePojoList(MySimplePojo mySimplePojo){
        return List.of(mySimplePojo);
    }

    @Bean
    public Integer someInt() {
        return 1;
    }
}
