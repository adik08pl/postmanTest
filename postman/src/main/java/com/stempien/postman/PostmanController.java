package com.stempien.postman;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostmanController {

    @PostMapping("/api/mail/send*/{to}")
    @ResponseBody
    public String sendMail(@PathVariable String to) {
        return "Wiadomość została wysłana do "+to+" z maila pawelmorski5@gmail.com";
    }

}
