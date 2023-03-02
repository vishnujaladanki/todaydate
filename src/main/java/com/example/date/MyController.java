package com.example.date;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDate;
import java.time.format.*;

@RestController
public class MyController {
    @GetMapping("/")
    static String getDate(){
        LocalDate date = LocalDate.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyy");
        String S = date.format(format1);
        return S;
    }
}
