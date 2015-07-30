package demo.persistance;

import demo.domain.model.Product;
import demo.domain.repository.BaseRepository;

import java.util.List;

/**
 * Created by Marek on 2015-04-23.
 */
public class ProductRepository implements BaseRepository<Product> {
    @Override
    public Product Get(int id) {
        return null;
    }

    @Override
    public List<Product> Get() {
        return null;
    }

    @Override
    public void Add(Product item) {

    }

    @Override
    public void Save() {

    }
}
