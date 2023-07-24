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
    @PostMapping("/clothing")
    public String addClothing(@PathVariable String color) {
        return "Hello, " + name + "!";
    }

    //PUT: updating attributes of the clothing piece (id)
    @GPutMapping("/clothing/{id}")
    public String updateClothing(@PathVariable String id) {
        return "Hello, " + name + "!";
    }

    //DELETE: removing clothing piece from db (id)
    @DeleteMapping("/clothing/{id}")
    public String removeClothing(@PathVariable String id) {
        return "Hello, " + name + "!";
    }

    // GET: getting clothing pieces from the db (id)
    @GetMapping("/clothing/{id}")
    public String getClothing(@PathVariable String id) {
        return "Hello, " + name + "!";
    }
    // Add more methods for other API endpoints as needed
}
