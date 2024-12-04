package com.src.destinations.User.Entitys;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Table(name = "users")
@Entity(name = "users")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class User implements UserDetails {
  @Id
  @Setter
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  @Setter
  @NotNull
  private String name;

  @Setter
  @NotNull
  @Column(unique = true)
  private String username;

  @Setter
  @NotNull
  @Column(unique = true)
  private String email;

  @Setter
  @NotNull
  private String password;

  @Setter
  @NotNull
  private String birthDate;

  @Setter
  @NotNull
  private UserRoleENUM role;

  public User(String name, String username, String email, String password, String birthDate, UserRoleENUM role){
    this.name = name;
    this.username = username;
    this.email = email;
    this.password = password;
    this.birthDate = birthDate;
    this.role = role;
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return List.of(new SimpleGrantedAuthority("ROLE_USER"));
  }

  @Override
  public boolean isAccountNonExpired() {
    return false;
  }

  @Override
  public boolean isAccountNonLocked() {
    return false;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return false;
  }

  @Override
  public boolean isEnabled() {
    return false;
  }
}
