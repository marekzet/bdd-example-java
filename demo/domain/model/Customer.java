package demo.domain.model;

/**
 * Created by Marek on 2015-04-23.
 */
public class Customer {
    private int id;
    private String firstName;
    private String lastName;

    public Customer(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
