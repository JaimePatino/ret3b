package com.cuatroa.retotres.repository.crud;

import com.cuatroa.retotres.model.Hairproducts;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author jaime
 */
public interface HairproductsCrudRepository extends MongoRepository<Hairproducts, String> {
    
}
