package Nawa3.Nawa3.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NawaController {

    @GetMapping("index")
    public String nawaWelcomePage (Model model) {

        model.addAttribute("textcode","테스트코드");
        System.out.println(model);

        return "/index";
    }
}
