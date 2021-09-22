package rybakov.locality.service.Service;

import rybakov.locality.service.Entity.Infrastructure;

import java.util.List;

public interface InfrastructureService {
    void create(Infrastructure infrastructure);
    Infrastructure getById(int id);
    void update (Infrastructure infrastructure);
    void delete(int id);
    List<Infrastructure> getAll();

}
