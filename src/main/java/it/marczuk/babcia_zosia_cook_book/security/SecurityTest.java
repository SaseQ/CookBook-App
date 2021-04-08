package it.marczuk.babcia_zosia_cook_book.security;

import it.marczuk.babcia_zosia_cook_book.security.model.AppUser;
import it.marczuk.babcia_zosia_cook_book.security.repository.AppUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityTest {

    private AppUserRepo appUserRepo;
    private PasswordEncoder passwordEncoder;

    @Autowired
    public SecurityTest(AppUserRepo appUserRepo, PasswordEncoder passwordEncoder) {
        this.appUserRepo = appUserRepo;
        this.passwordEncoder = passwordEncoder;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void createAppUser() {
        AppUser appUser = new AppUser();
        appUser.setUsername("admin");
        appUser.setPassword(passwordEncoder.encode("admin"));
        appUser.setRole("ROLE_ADMIN");
        appUserRepo.save(appUser);
    }


}
