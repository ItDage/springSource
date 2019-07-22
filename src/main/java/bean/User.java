package main.java.bean;/**
 * Created by Administrator on 2019/7/23 0023.
 */

/**
 * @ClassName User
 * @Description TODO
 * @Author Administrator
 * @Date 2019/7/23 0023 上午 7:42
 * @Version 1.0
 **/
public class User {
    private String name;

    private String gender;

    public User(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
