package demo.domain.repository;

import java.util.List;

/**
 * Created by Marek on 2015-04-23.
 */
public interface BaseRepository<T> {
    public T Get(int id);
    public List<T> Get();
    public void Add(T item);
    public void Save();
}
