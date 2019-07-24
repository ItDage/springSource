package main.java;/**
 * Created by Administrator on 2019/7/23 0023.
 */

import main.java.bean.Role;
import main.java.bean.User;
import main.java.bean.bean2.Car;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @ClassName SpringSource
 * @Description TODO
 * @Author Administrator
 * @Date 2019/7/23 0023 上午 7:42
 * @Version 1.0
 **/
public class SpringSource {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("main/resources/spring-config.xml"));
        User user = (User) factory.getBean("user");
        System.out.println(user);
        Role role = (Role) factory.getBean("role");
        System.out.println(role);
        Car car = (Car) factory.getBean("car");
        System.out.println(car);
    }
}
