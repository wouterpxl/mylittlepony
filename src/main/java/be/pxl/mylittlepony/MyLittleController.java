package be.pxl.mylittlepony;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyLittleController {

    @GetMapping("/hoi")
    public String hoi() {
        someNastyStuff(111);
        return "dfsdf";
    }

    private void someNastyStuff(int n) {
        if (true) {
            if (!false) {
                for (int i = 0; i < 1000; i++) {
                    if (true) {
                        if (n > 10) {
                            System.out.println("hallokes");
                        }
                    }
                }
            }
        }
    }
}
