import java.util.List;

public interface IRelationshipBrowser {
    // List<Person> findAllChildrenOf(String name);
    List<Person> findAllStatusOf(String name, RelationshipStatus status);
}
