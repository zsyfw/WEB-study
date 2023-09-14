package webstudy.Class;

import lombok.*;

@Data//集成了@Getter@Setter@EqualsAndHashCode@ToString这四个注解
@NoArgsConstructor//自动添加无参构造方法
@AllArgsConstructor//自动添加有参构造方法，添加除static外的所有属性
public class User {
    private Integer id;
    private String avatar;
    private String nickname;
    private String password;
    private String openid;
    private String mobile;

}
