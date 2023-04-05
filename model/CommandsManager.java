/******************************************************
Cours:   LOG121
Session: H2023
Groupe:  
Projet: Laboratoire #1
Étudiant(e)s: Émile Laforce, Tristan Giguere,
	          Mvuemba Gildor Makesa.
Enseignant : Benoit Galarneau
Nom du fichier: CommandsManager.java
Date créé: 2023-03-23
Date dern. modif. 2023-03-23
*******************************************************
Historique des modifications
*******************************************************
2023-03-23 Création du fichier.
*******************************************************/

package src.model;

public class CommandsManager {

    private static volatile CommandsManager instance;

    private CommandsManager() {

    }

    /**
     * The getInstance method from the Singleton design pattern.
     * <p>
     * Optimised and made thread safe by Geekific in his video on the
     * Singleton design pattern : https://youtu.be/tSZn4wkBIu8.
     * 
     * @return the single instance of the CommandsManager
     * @author Geekific
     */
    public static CommandsManager getInstance() {
        CommandsManager result = instance;

        if (result == null) {
            synchronized (CommandsManager.class) {
                result = instance;

                if (result == null)
                    instance = result = new CommandsManager();
            }
        }

        return result;
    }

}
