package com.inukacoaching;

import com.inukacoaching.enums.ERole;
import com.inukacoaching.model.Role;
import com.inukacoaching.repository.RoleRepository;
import com.inukacoaching.security.jwt.AuthEntryPointJwt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class InukacoachingAssessmentApplication implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(InukacoachingAssessmentApplication.class);

    @Autowired
    private RoleRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(InukacoachingAssessmentApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Set<Role> roles = new HashSet<>();
        Role admin = new Role(1, ERole.ROLE_ADMIN);
        roles.add(admin);
        Role user = new Role(2, ERole.ROLE_USER);
        roles.add(user);
        Role moderator = new Role(3, ERole.ROLE_MODERATOR);
        roles.add(moderator);

        repository.saveAll(roles);
        logger.info("Application is started and roles are added: {}", roles);
    }
}
