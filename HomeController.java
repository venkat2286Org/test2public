@RestController
public class HomeController {


    @GetMapping("/healthz")
    @ResponseBody
    public String healthz(){

        System.out.println("Healthy!");

        return "Healthy!";

    }
}
