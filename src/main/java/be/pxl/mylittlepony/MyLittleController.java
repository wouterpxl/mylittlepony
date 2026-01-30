package be.pxl.mylittlepony;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyLittleController {

    @GetMapping("/hoi")
    public String hoi() {
        someNastyStuff(111);
        moreShizzle(2);
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

    private void moreShizzle(int n) {
        if (n > 1) {
        }
        if (n > 2) {
        }
        if (n > 3) {
        }
        if (n > 4) {
        }
        if (n > 5) {
        }
        if (n > 6) {
        }
        if (n > 7) {
        }
        if (n > 8) {
        }
        if (n > 9) {
        }
        if (n > 10) {
        }
        System.out.println("lol");

    }
}
