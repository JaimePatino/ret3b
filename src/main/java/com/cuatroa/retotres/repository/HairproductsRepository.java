package com.cuatroa.retotres.repository;

import com.cuatroa.retotres.model.Hairproducts;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cuatroa.retotres.repository.crud.HairproductsCrudRepository;

/**
 *
 * @author jaime
 */
@Repository
public class HairproductsRepository {
    @Autowired
    private HairproductsCrudRepository accesoryCrudRepository;

    public List<Hairproducts> getAll() {
        return accesoryCrudRepository.findAll();
    }

    public Optional<Hairproducts> getAccesory(String reference) {
        return accesoryCrudRepository.findById(reference);
    }
    
    public Hairproducts create(Hairproducts accesory) {
        return accesoryCrudRepository.save(accesory);
    }

    public void update(Hairproducts accesory) {
        accesoryCrudRepository.save(accesory);
    }
    
    public void delete(Hairproducts accesory) {
        accesoryCrudRepository.delete(accesory);
    }
}
