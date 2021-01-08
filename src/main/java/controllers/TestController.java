package controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class TestController {

    @GetMapping("/do")
    public ResponseEntity test(){
        String t = "<html>test</html>";
        return new ResponseEntity<>(t, HttpStatus.OK);
    }
}
