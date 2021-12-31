
package my.website.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lkxl
 */

@RestController
public class GetsUpController {
    @Value("${server.port}")
    String port;


    @RequestMapping("/getup")
    public String home(@RequestParam String time) {
        return "I am from port: " +port +" to call you get up at "+time;
    }
}
