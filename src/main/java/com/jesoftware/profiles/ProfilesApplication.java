package com.jesoftware.profiles;

import com.jesoftware.profiles.service.DevService;
import com.jesoftware.profiles.service.ProdService;
import com.jesoftware.profiles.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProfilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfilesApplication.class, args);
	}

}
