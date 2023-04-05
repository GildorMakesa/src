/******************************************************
 Cours:   LOG121
 Session: H2023
 Groupe:
 Projet: Laboratoire #2
 Étudiant(e)s: Émile Laforce, Tristan Giguere,
 Mvuemba Gildor Makesa.
 Enseignant : Benoit Galarneau
 Nom du fichier: viewEventObserver.java
 Date créé: 2023-04-05
 Date dern. modif. 2023-04-XX
 *******************************************************
 Historique des modifications
 *******************************************************
 2023-04-05 Premier fichier du projet.
 2023-04-XX Ajout javadoc.
 *******************************************************/


package src.controller;

import src.view.CustomPerspectivePanel;

import java.awt.*;

public interface ViewEventObserver {
    public void zoomCommand(int notches, CustomPerspectivePanel sender);

    public void translateCommand(Point centerOffset, CustomPerspectivePanel sender);

    public void undo(CustomPerspectivePanel sender);

    public void redo(CustomPerspectivePanel sender);

}
