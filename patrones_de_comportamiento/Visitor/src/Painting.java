package Visitor.src;

class Painting extends Artwork {
    @Override
    public void accept(ArtworkVisitor visitor) {
        visitor.visit(this);
    }

    public void displayPainting() {
        System.out.println("Mostrando la pintura");
    }
}