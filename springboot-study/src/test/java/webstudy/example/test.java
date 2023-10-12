/**
 * @author FW
 * @date 2023/9/25 19:45
 * @Software: IntelliJ IDEA WEB-study
 * @version 1.0
 */
package webstudy.example;

import org.junit.jupiter.api.Test;

public class test {
int a=10,b=20,c=30;
@Test
    public int f(int a ,int b ,int c){
        if (c<=0){
            if(b<=0){
                if(a<=0){
                    System.out.println( a+b+c);
                }else {
                    System.out.println( f(a-1,b,c)+1);
                }
            }else {
                System.out.println(f(a,b-1,c)-1);
            }
        }else {
            System.out.println( f(a,b,c-1));
        }
        return 0;
    }

}
