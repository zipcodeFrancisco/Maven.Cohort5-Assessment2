package rocks.zipcode.quizweek7.generics.ageable;

import java.util.Objects;


/**
 * @ATTENTION_TO_STUDENTS - You are forbidden from modifying this class.
 */
public abstract class Ageable {
    private int yearOfBirth;

    public Ageable() {
        this(Integer.MIN_VALUE);
    }

    public Ageable(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ageable ageable = (Ageable) o;
        return yearOfBirth == ageable.yearOfBirth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(yearOfBirth);
    }
}
