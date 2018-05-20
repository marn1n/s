package website.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class User implements UserDetails{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public User() {
    }

    private String username;
    public String getUsername() {
        return username;
    }

    private String password;
    public String getPassword() {
        return password;
    }

    @Enumerated(EnumType.STRING)
    private ProjectRoles role = ProjectRoles.ROLE_USER;
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority(role.toString()));
        return authorities;
    }


    private boolean accNonExp = true;
    public boolean isAccountNonExpired() {
        return accNonExp;
    }

    private boolean accNonLocked = true;
    public boolean isAccountNonLocked() {
        return accNonLocked;
    }

    private boolean credsNonExp = true;
    public boolean isCredentialsNonExpired() {
        return credsNonExp;
    }

    private boolean isEnabled = true;
    public boolean isEnabled() {
        return isEnabled;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(ProjectRoles role) {
        this.role = role;
    }

    public void setAccNonExp(boolean accNonExp) {
        this.accNonExp = accNonExp;
    }

    public void setAccNonLocked(boolean accNonLocked) {
        this.accNonLocked = accNonLocked;
    }

    public void setCredsNonExp(boolean credsNonExp) {
        this.credsNonExp = credsNonExp;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
}
