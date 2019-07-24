package main.java.bean;/**
 * Created by Administrator on 2019/7/23 0023.
 */

/**
 * @ClassName Role
 * @Description TODO
 * @Author Administrator
 * @Date 2019/7/23 0023 上午 8:00
 * @Version 1.0
 **/
public class Role {

    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
