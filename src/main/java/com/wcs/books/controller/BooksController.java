package com.wcs.books;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @RequestMapping("/")
    public String index() {
        return "Congratulations from BlogController.java";
    }

}