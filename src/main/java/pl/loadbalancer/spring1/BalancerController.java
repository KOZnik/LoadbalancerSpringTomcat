package pl.loadbalancer.spring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/route")
public class BalancerController {

    public BalancerController() {
        System.out.println("BalancerController created");
    }

    @Autowired
    private Balancer balancer;

    @GetMapping("/{clientId}")
    public String route(@PathVariable("clientId") String clientId) {
        return balancer.routeUser(clientId);
    }

}
