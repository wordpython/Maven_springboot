package App.start;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/*
 * 该启动类有两种注解方法
 */
//方法一，使用该方法后，启动类可以在任何一个包里
@EnableAutoConfiguration//这里的启动类中有了该注解，其他类就不用了
@ComponentScan(basePackages="com.wordpython.controller")//扫描controller包，多个包时={"包名一","包名二"}
//方法二，使用这种方法时，启动类必须与controller类在同一个包下后在controller类的父包下
//@SpringBootApplication
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
