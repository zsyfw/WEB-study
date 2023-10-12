/**
 * @author FW
 * @date 2023/10/10 16:39
 * @Software: IntelliJ IDEA WEB-study
 * @version 1.0
 */
package webstudy.Class;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//集成了@Getter@Setter@EqualsAndHashCode@ToString这四个注解
@NoArgsConstructor//自动添加无参构造方法
@AllArgsConstructor//自动添加有参构造方法，添加除static外的所有属性
public class News {
    private String title;//新闻标题
    private String cover;//新闻封面
    private String content;//新闻内容
    private String author;//作者名
    private String authorOpenid;//作者openid

}
