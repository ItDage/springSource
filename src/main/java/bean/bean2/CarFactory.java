package main.java.bean.bean2;/**
 * Created by Administrator on 2019/7/24 0024.
 */

import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName CarFactory
 * @Description TODO
 * @Author Administrator
 * @Date 2019/7/24 0024 上午 8:09
 * @Version 1.0
 **/
public class CarFactory implements FactoryBean<Car> {

    private String carInfo;

    public String getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }

    @Override
    public Car getObject() throws Exception {
        Car car = new Car();
        String[] strings = carInfo.split(",");
        car.setBrand(strings[0]);
        car.setMaxspeed(Integer.valueOf(strings[1]));
        car.setPrice(Integer.valueOf(strings[2]));
        return car;
    }

    @Override
    public Class<Car> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
