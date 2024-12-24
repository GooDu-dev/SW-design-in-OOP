import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class Relationships implements IRelationshipBrowser { // low level module
    private List<Triplet<Person, RelationshipStatus, Person>> relations = new ArrayList<>();

    /*
     * public List<Triplet<Person, RelationshipStatus, Person>> getRelations()
     * {
     * return relations;
     * }
     */
    public void addParentAndChild(Person parent, Person child) {
        relations.add(new Triplet<>(parent, RelationshipStatus.PARENT, child));
        relations.add(new Triplet<>(child, RelationshipStatus.CHILD, parent));
    }
    // @Override
    // public List<Person> findAllChildrenOf(String name) {
    // return relations.stream()
    // .filter(x -> Objects.equals(x.getValue0().name, name)
    // && x.getValue1() == RelationshipStatus.PARENT)
    // .map(Triplet::getValue2)
    // .collect(Collectors.toList());
    // }

    @Override
    public List<Person> findAllStatusOf(String name, RelationshipStatus status) {
        // TODO Auto-generated method stub
        return relations.stream().filter(x -> Objects.equals(x.getValue0().name, name) && x.getValue1() == status)
                .map(Triplet::getValue2).collect(Collectors.toList());
    }

    public void addSibling(Person older, Person younger) {
        relations.add(new Triplet<>(older, RelationshipStatus.SIBLING, younger));
        relations.add(new Triplet<>(younger, RelationshipStatus.SIBLING, older));
        return;
    }

}
