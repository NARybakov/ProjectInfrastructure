package rybakov.locality.service.Service;

import org.springframework.data.domain.Page;
import rybakov.locality.service.Entity.Locality;

import java.util.List;

public interface LocalityService {
    void create (Locality locality);
    Locality getById(int id);
    Locality getByCityName(String cityName);
    void update(Locality locality);
    void delete(int id);
    List<Locality> getAll();
    Page<Locality> getLocalities(Integer userId, int page, int pageSize);

}
