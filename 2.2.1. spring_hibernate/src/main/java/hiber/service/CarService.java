package hiber.service;

import hiber.dao.CarDao;
import hiber.dao.UserDao;
import hiber.model.Car;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarService {
    private CarDao carDao;

    @Autowired
    public void setCarDao(CarDao carDao) {
        this.carDao = carDao;
    }

    @Transactional
    public void add(Car car) {
        carDao.add(car);
    }

    @Transactional(readOnly = true)
    public List<Car> listUsers() {
        return carDao.listCar();
    }
}
