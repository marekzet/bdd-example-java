package demo.persistance;

import demo.domain.model.OrderItem;
import demo.domain.repository.BaseRepository;

import java.util.List;

/**
 * Created by Marek on 2015-04-23.
 */
public class OrderItemRepository implements BaseRepository<OrderItem> {
    @Override
    public OrderItem Get(int id) {
        return null;
    }

    @Override
    public List<OrderItem> Get() {
        return null;
    }

    @Override
    public void Add(OrderItem item) {

    }

    @Override
    public void Save() {

    }
}
