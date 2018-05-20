package website.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import website.entity.User;

public interface UserService extends UserDetailsService {
    void save(User user);
}
