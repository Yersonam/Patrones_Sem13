package Visitor.src;

import java.util.ArrayList;
import java.util.List;

class ArtworkCollection {
    private List<Artwork> artworks = new ArrayList<>();

    public void addArtwork(Artwork artwork) {
        artworks.add(artwork);
    }

    public void removeArtwork(Artwork artwork) {
        artworks.remove(artwork);
    }

    public void accept(ArtworkVisitor visitor) {
        for (Artwork artwork : artworks) {
            artwork.accept(visitor);
        }
    }
}