package pl.albumweb.demo.model;

import com.sun.istack.NotNull;
import lombok.Data;
import javax.persistence.*;
//@Table(name="users")

@Entity
@Data
public class UserDTO {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String login;
    @NotNull
    private String password;
    public UserDTO(){};
    public UserDTO(String login,String password){
        this.login=login;
        this.password=password;
    }
}

