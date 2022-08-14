package com.adventureoutdoors.AdventureOutdoors.models;

//import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

//@Entity
public class User {
//    @Id
//    @GeneratedValue
//    @Column(name = "id", nullable = false)
    private Long id;

    @NotBlank(message = "Must enter a first name.")
    private String firstName;
    @NotBlank(message = "Must enter a last name.")
    private String lastName;
    @NotBlank(message = "Must enter an email.")
    @Email(message = "Must be a valid email.")
    private String email;
    @NotBlank(message = "Must enter a password.")
    @Size(min = 6, max = 20)
    private String password;

    @NotNull(message = "Must enter a birthdate.")
    private LocalDate birthdate;

//    @OneToMany
//    private List<Reservation> reservations;

    public Long getId() {
        return id;
    }

    public User(String firstName, String lastName, String email, String password, LocalDate birthdate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.birthdate = birthdate;
    }

    public User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getPassword() {
        return password;
    }

    //    public List<Reservation> getReservations() {
//        return reservations;
//    }
//
//
}
