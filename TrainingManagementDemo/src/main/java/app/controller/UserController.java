package app.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@PreAuthorize("hasAnyRole('USER')")
	@GetMapping("/")
	public String welcome() {
		return "Welcome!";
	}
}
