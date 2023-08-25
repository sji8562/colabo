package shop.mtcoding.colabo.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

      @GetMapping("/joinForm")
    public String joinForm() {
        return "user/joinForm";
    }

        @PostMapping("/join")
    public String join() {
        return "user/loginForm"; // persist 초기화
    }
}
