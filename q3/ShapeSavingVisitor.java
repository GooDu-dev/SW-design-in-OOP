public interface ShapeSavingVisitor {
    void visit(Circle circle);

    void visit(Rectangle rectangle);

    void visit(Triangle triangle);
}