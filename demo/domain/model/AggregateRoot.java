package demo.domain.model;

/**
 * Created by Marek on 2015-04-23.
 */
public abstract class AggregateRoot {
    private int id;

    public AggregateRoot(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}