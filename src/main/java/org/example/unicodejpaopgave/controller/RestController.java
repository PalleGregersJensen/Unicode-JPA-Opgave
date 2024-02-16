package org.example.unicodejpaopgave.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/unicode/{i}")

    public String unicodeToChar(@PathVariable int i) {

        char c = (char)i;

        return "unicode=" + i + " char=" + c;

    }

    //Get value of letter/character as unicode value on website
    @GetMapping("/char-to-unicode/{c}")
    public String charToUnicode(@PathVariable char c){
        int unicodeValue = (int) c;
        return  "char=" + c + "unicode="+unicodeValue;
    }

}
