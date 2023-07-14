package Visitor.src;

public interface ArtworkVisitor {

    void visit(Painting painting);
    void visit(Sculpture sculpture);

}
