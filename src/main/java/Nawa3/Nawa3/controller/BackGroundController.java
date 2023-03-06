package Nawa3.Nawa3.controller;


import Nawa3.Nawa3.dto.BackgroundDto;
import Nawa3.Nawa3.dto.CrawlingDto;
import Nawa3.Nawa3.service.BackgroundService;
import Nawa3.Nawa3.service.CrawlingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BackGroundController {
    @Autowired
    private BackgroundService backgroundService;

    @GetMapping("/test2/{id}")
    @ResponseBody
    public BackgroundDto testDataA (@PathVariable("id") Integer key) {
        return backgroundService.getBackground(key);
    }

    @GetMapping("/test3/{id}")
    public String backgroundDataPage (Model model, @PathVariable("id") Integer key) {
         model.addAttribute("back", backgroundService.getBackground(key));
        return "BackGroundImg";
    }
}
