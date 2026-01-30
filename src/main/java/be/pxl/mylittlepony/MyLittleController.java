package be.pxl.mylittlepony;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyLittleController {

    @GetMapping("/hoi")
    public String hoi() {
        return "dfsdf";
    }
}

