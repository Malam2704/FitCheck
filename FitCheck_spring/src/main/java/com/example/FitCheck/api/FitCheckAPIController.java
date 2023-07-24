import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/") // Base URL mapping for all endpoints in this controller
public class MyController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    // POST: initially adding clothing piece to the db (clothing attributes...)
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    //PUT: updating attributes of the clothing piece (id)
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    //DELETE: removing clothing piece from db (id)
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    // GET: getting clothing pieces from the db (id)
    @GetMapping("/clothing/{id}")
    public String greetByName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
    // Add more methods for other API endpoints as needed
}
