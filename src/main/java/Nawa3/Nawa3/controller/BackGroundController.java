package Nawa3.Nawa3.controller;


import Nawa3.Nawa3.service.BackgroundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackGroundController {
    @Autowired
    private BackgroundService backgroundService;

//    @GetMapping("/test2/{id}")
//    @ResponseBody
//    public BackgroundDto testDataA (@PathVariable("id") Integer key) {
//        return backgroundService.getBackground(key);
//    }

//    @GetMapping("/test3/{id}")
//    public String backgroundDataPage (Model model, @PathVariable("id") Integer key) {
//         model.addAttribute("back", backgroundService.getBackground(key));
//        return "background/BackGroundImg.html";
//    }
}
