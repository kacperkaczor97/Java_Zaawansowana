package pl.pjatk.kackac;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sandbox")

public class SandboxController {

    @GetMapping("/hello")
    public ResponseEntity<String> helloWorld(){
        return ResponseEntity.ok("Hello world");
    }


    @GetMapping("/model")
    public ResponseEntity<Car> getCar() {
        Car skoda = new Car("Skoda");
        return ResponseEntity.ok(skoda);
    }

    @GetMapping("/hello/{someValue}")
    public ResponseEntity<String> getString(@PathVariable String someValue){
        return ResponseEntity.ok(someValue);

    }

    @GetMapping("/hello/abc")
    public ResponseEntity<String> getparam(@RequestParam String reqParama) {
        return ResponseEntity.ok(reqParama);
    }

    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            path = "/model"
    )
    public ResponseEntity<Car> createCar(@RequestBody Car car){
        return ResponseEntity.ok(car);
    }
}
