/**
 * @author FW
 * @date 2023/9/18 16:12
 * @Software: IntelliJ IDEA WEB-study
 * @version 1.0
 */
package webstudy.Class;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Page {
    private long count;
    private List pageList;
}
