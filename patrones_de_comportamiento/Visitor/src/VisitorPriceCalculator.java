package Visitor.src;

class VisitorPriceCalculator implements ArtworkVisitor {
    @Override
    public void visit(Painting painting) {
        System.out.println("Calculando el precio de venta de la pintura");
        painting.displayPainting();
        // Lógica de cálculo del precio de venta para la pintura
    }

    @Override
    public void visit(Sculpture sculpture) {
        System.out.println("Calculando el precio de venta de la escultura");
        sculpture.displaySculpture();
        // Lógica de cálculo del precio de venta para la escultura
    }
}