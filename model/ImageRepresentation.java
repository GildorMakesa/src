/******************************************************
Cours:   LOG121
Session: H2023
Groupe:  
Projet: Laboratoire #1
Étudiant(e)s: Émile Laforce, Tristan Giguere,
	          Mvuemba Gildor Makesa.
Enseignant : Benoit Galarneau
Nom du fichier: ImageRepresentation.java
Date créé: 2023-03-23
Date dern. modif. 2023-03-23
*******************************************************
Historique des modifications
*******************************************************
2023-03-23 Création du fichier.
*******************************************************/

package src.model;

import java.awt.image.BufferedImage;

/**
 * This class represents an image. 
 * 
 * @author Emile Laforce
 */
public class ImageRepresentation {
    private BufferedImage image;
    private Perspective perspective;
    
    public ImageRepresentation(BufferedImage image) {
        this(image, new Perspective());
    }

    public ImageRepresentation(BufferedImage image, Perspective perspective) {
        this.image = image;
        this.perspective = perspective;
    }

    /**
     * Get this image.
     * 
     * @return this image
     */
    public BufferedImage getImage() {
        return image;
    }

    /**
     * Get a thumbnail version of this image.
     * 
     * @param width  of the thumbnail
     * @param height of the thumbnail
     * @return this image's thumbnail with the given width and height
     */
    public BufferedImage getThumbnail(int width, int height) {
        return (BufferedImage) image.getScaledInstance(width, height, BufferedImage.SCALE_SMOOTH);
    }
}