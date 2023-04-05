/******************************************************
 Cours:   LOG121
 Session: H2023
 Groupe:
 Projet: Laboratoire #2
 Étudiant(e)s: Émile Laforce, Tristan Giguere,
 Mvuemba Gildor Makesa.
 Enseignant : Benoit Galarneau
 Nom du fichier: controller.java
 Date créé: 2023-04-05
 Date dern. modif. 2023-04-XX
 *******************************************************
 Historique des modifications
 *******************************************************
 2023-04-05 Premier fichier du projet.
 2023-04-06 Ajout javadoc.
 *******************************************************/

package src.controller;

import java.awt.*;
import java.util.HashMap;
import java.util.List;
import src.view.*;


/**
 * The Controller Class handles the interaction between the view and the model.
 * It receives events from the view and updates the model accordingly.
 */
public class controller implements ViewEventObserver{
    private HashMapHashMap<CustomPerspectivePanel, PanelModel> viewtoModel;

    /**
     * Creates a new Controller object.
     * @param customPanels A list of CustomPerspectivePanel objects representing the views.
     * @param panelModels A list of PanelModel objects representing the models.
     */
    public controller (List<CustomPerspectivePanel> customPanels, List<PanelModel> panelModels){
        this.viewtoModel = new HashMap<customPanels, panelModels>();
    }

    /**
     * The zoomCommand method is called when the user zooms in/out on the view.
     * @param notches The number of notches the mouse wheel was scrolled.
     * @param sender The CustomPerspectivePanel object that triggered the event.
     * @return An Object representing the zoom action performed.
     */
    public void zoomCommand(int notches, CustomPerspectivePanel sender){

    }

    /**
     * The translateCommand method is called when the user translates the view.
     * @param centerOffset The Point object representing the center of the view.
     * @param sender The CustomPerspectivePanel object that triggered the event.
     * @return An integer representing the translation distance.
     */
    public void translateCommand(Point centerOffset, CustomPerspectivePanel sender){

    }

    /**
     * The undo method is called when the user undoes an action.
     * @param sender The CustomPerspectivePanel object that triggered the event.
     */
    public void undo(CustomPerspectivePanel sender){

    }


    /**
     * The redo method is called when the user redoes an action.
     * @param sender The CustomPerspectivePanel object that triggered the event.
     */
    public void redo(CustomPerspectivePanel sender){

    }


}
