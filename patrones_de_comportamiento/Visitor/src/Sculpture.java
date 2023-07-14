package Visitor.src;

class Sculpture extends Artwork {
    @Override
    public void accept(ArtworkVisitor visitor) {
        visitor.visit(this);
    }

    public void displaySculpture() {
        System.out.println("Mostrando la escultura");
    }
}

