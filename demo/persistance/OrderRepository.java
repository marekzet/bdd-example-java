package demo.persistance;

import demo.domain.model.Order;
import demo.domain.repository.BaseRepository;

import java.util.List;

/**
 * Created by Marek on 2015-04-23.
 */
public class OrderRepository implements BaseRepository<Order>{
    @Override
    public Order Get(int id) {
        return null;
    }

    @Override
    public List<Order> Get() {
        return null;
    }

    @Override
    public void Add(Order item) {

    }

    @Override
    public void Save() {

    }
}
