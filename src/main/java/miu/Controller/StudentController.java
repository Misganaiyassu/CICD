package miu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {
    @GetMapping(value={"/","/home","/miu"})
    public String getStudents() {
        return "home/index";
    }

}
