package fr.hm.resource.topic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class TopicController{

    @GetMapping("/topics")
    public Flux<String> getAllRoles(){
        return null;
    }


}
