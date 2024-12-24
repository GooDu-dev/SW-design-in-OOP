import java.util.List;
public interface IRelationshipBrowser {
    List<Person> findAllChildrenOf(String name);
}
