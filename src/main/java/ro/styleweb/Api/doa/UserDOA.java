package ro.styleweb.Api.doa;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDOA {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String passwordHash;
}
