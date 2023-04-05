/******************************************************
 Cours:   LOG121
 Session: H2023
 Groupe:
 Projet: Laboratoire #2
 Étudiant(e)s: Émile Laforce, Tristan Giguere,
 Mvuemba Gildor Makesa.
 Enseignant : Benoit Galarneau
 Nom du fichier: ViewEventSubject.java
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

public interface ViewEventSubject {

     public void attach(ViewEventObserver o);

     public void detach(ViewEventObserver o);

     public void notifyZoomCommand(int notches, CustomPerspectivePanel sender);

     public void notifyTranslateCommand(Point centerOffset, CustomPerspectivePanel sender);

     public void  notifyUndo(CustomPerspectivePanel sender);

     public void notifyRedo(CustomPerspectivePanel sender);

}
