package pl.tomskr.rise_calculator.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.tomskr.rise_calculator.model.Rise;

public interface RiseRepository extends CrudRepository<Rise,Long> {
}
