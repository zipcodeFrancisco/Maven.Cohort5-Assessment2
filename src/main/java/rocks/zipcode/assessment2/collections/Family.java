package rocks.zipcode.assessment2.collections;

import rocks.zipcode.assessment2.objectorientation.Person;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author leon on 28/11/2018.
 */
public class Family {
    /**
     * @param newFamilyMember - person object to be added to family
     */
    public void add(Person newFamilyMember) {
    }

    /**
     * @param newFamilyMember - family member to be evaluated
     * @return true if `newFamilyMember` is a member of this family
     */
    public Boolean contains(Person newFamilyMember) {
        return null;
    }

    /**
     * @param newFamilyMember - family member to be removed
     */
    public void remove(Person newFamilyMember) {

    }

    /**
     * @param index - index of family member to be retrieved
     * @return family member at the specified index
     */
    public Person get(int index) {
        return null;
    }

    /**
     * @param predicate - expression to evaluate for filtering
     * @return all `Person` objects whose `predicate` evaluation returns `true`
     */
    public List<Person> where(Predicate<Person> predicate) {
        return null;
    }

    /**
     * @param startingCharacter - starting character of `Person` name
     * @return List of person objects whose name starts with the specified character
     */
    public List<Person> whereNameStartsWith(String startingCharacter) {
        return null;
    }
}
