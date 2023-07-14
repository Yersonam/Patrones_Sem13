package Visitor.src;

public class App {

    public static void main(String[] args) {
        Artwork painting = new Painting();
        Artwork sculpture = new Sculpture();

        ArtworkCollection artworkCollection = new ArtworkCollection();
        artworkCollection.addArtwork(painting);
        artworkCollection.addArtwork(sculpture);

        ArtworkVisitor priceCalculator = new VisitorPriceCalculator();
        ArtworkVisitor styleAnalyzer = new VisitorStyleAnalyzer();

        artworkCollection.accept(priceCalculator);

        System.out.println();

        artworkCollection.accept(styleAnalyzer);
    }
}
