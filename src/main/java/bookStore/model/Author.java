package bookStore.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Author implements Comparable<Author>, Serializable {
    private String lastName;
    private String firstName;
    private UUID id;

    public Author(String lastName, String firstName, UUID id) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Author: " + id + " " + firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(id, author.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    @Override
    public int compareTo(Author o) {
        return lastName.compareTo(o.lastName);
    }
}
