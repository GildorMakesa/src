/******************************************************
Cours:   LOG121
Session: H2023
Groupe:  
Projet: Laboratoire #1
Étudiant(e)s: Émile Laforce, Tristan Giguere,
	          Mvuemba Gildor Makesa.
Enseignant : Benoit Galarneau
Nom du fichier: Perspective.java
Date créé: 2023-03-23
Date dern. modif. 2023-03-23
*******************************************************
Historique des modifications
*******************************************************
2023-03-23 Création du fichier.
*******************************************************/

package src.model;

import java.awt.Point;

public class lPerspective {
    private Point position;
    private float rotation;
    private float scale;
    
    public Perspective() {
        this(new Point(), 0, 1);
    }

    public Perspective(Point position, float rotation, float scale) {
        this.position = position;
        this.rotation = rotation;
        this.scale = scale;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public float getRotation() {
        return rotation;
    }

    public void setRotation(float rotation) {
        this.rotation = rotation;
    }

    public float getScale() {
        return scale;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }
}