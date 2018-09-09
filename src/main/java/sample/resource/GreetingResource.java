package sample.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sample.model.Greeting;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingResource {

    private static final String template = "Teste para %s.";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/exemplo")
    public Greeting greeting(@RequestParam(value="name", defaultValue="exemplo") String nome){
        return new Greeting(counter.incrementAndGet(),
                String.format(template, nome));
    }

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
