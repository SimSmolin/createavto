package services;

import dao.Dao;
import models.Avto;
import models.Creater;

import java.util.List;

public class Service {

    private Dao creatersDao = new Dao();

    public Service() {
    }

    public Creater findCreater(int id) {
        return creatersDao.findById(id);
    }

    public void saveCreater(Creater creater) {
        creatersDao.save(creater);
    }

    public void deleteCreater(Creater creater) {
        creatersDao.delete(creater);
    }

    public void updateCreater(Creater creater) {
        creatersDao.update(creater);
    }

    public List<Creater> findAllCreaters() {
        return creatersDao.findAll();
    }

    public Avto findAutoById(int id) {
        return creatersDao.findAutoById(id);
    }


}
