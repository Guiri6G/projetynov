package projetynov.client.proxies;

import java.util.List;
import java.util.Optional;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import projetynov.firstclient.model.User;

@FeignClient(name = "userms")
@RibbonClient(name= "userms")
public interface MSUserProxy {

	@GetMapping(value = "/users")
	List<User> getUsers();
	
	@GetMapping( value = "/user/{id}")
	Optional<User> getUser(@PathVariable("id") Long id);
}
