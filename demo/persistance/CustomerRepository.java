package demo.persistance;

import demo.domain.model.Customer;
import demo.domain.repository.BaseRepository;

import java.util.List;

/**
 * Created by Marek on 2015-04-23.
 */
public class CustomerRepository implements BaseRepository<Customer> {
    @Override
    public Customer Get(int id) {
        return null;
    }

    @Override
    public List<Customer> Get() {
        return null;
    }

    @Override
    public void Add(Customer item) {

    }

    @Override
    public void Save() {

    }
}
