package pl.pjatk.kackac;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/homework")


public class HomeworkNewController {

    @GetMapping("/{data}")
    public ResponseEntity<String> getFromPathVariable(
            @PathVariable String data) {

        return ResponseEntity.ok(data);
    }

    @GetMapping
    public ResponseEntity<String> getFromRequestParam(
            @RequestParam String data) {

        return ResponseEntity.ok(data);
    }

    @PutMapping("/{data}")
    public ResponseEntity<String> getFromPutMethod(
            @PathVariable String data) {

        return ResponseEntity.ok(data);
    }

    @PostMapping
    public ResponseEntity<String> getFromPostMethod(
            @RequestBody String data) {

        return ResponseEntity.ok(data);
    }

    @DeleteMapping
    public ResponseEntity getStatus() {
        return ResponseEntity.status(HttpStatus.OK).build();
    }



}
