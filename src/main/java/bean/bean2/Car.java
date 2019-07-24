package main.java.bean.bean2;/**
 * Created by Administrator on 2019/7/24 0024.
 */

/**
 * @ClassName Car
 * @Description TODO
 * @Author Administrator
 * @Date 2019/7/24 0024 上午 8:10
 * @Version 1.0
 **/
public class Car {

    private String brand;

    private int maxspeed;

    private int price;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", maxspeed=" + maxspeed +
                ", price=" + price +
                '}';
    }
}
