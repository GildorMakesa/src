/******************************************************
Cours:   LOG121
Session: H2023
Groupe:  
Projet: Laboratoire #1
Étudiant(e)s: Émile Laforce, Tristan Giguere,
	          Mvuemba Gildor Makesa.
Enseignant : Benoit Galarneau
Nom du fichier: CustomPerspectivePanel.java
Date créé: 2023-03-23
Date dern. modif. 2023-03-23
*******************************************************
Historique des modifications
*******************************************************
2023-03-23 Création du fichier.
*******************************************************/

package src.view;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JPanel;

public class CustomPerspectivePanel extends JPanel  {

    public CustomPerspectivePanel() {
        this.addMouseWheelListener(new CustomPerspectiveWheelListener());
    }

    

    private class CustomPerspectiveWheelListener implements MouseWheelListener {
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
            int notches = e.getWheelRotation();
            
           // TODO 
        }
    }
}
