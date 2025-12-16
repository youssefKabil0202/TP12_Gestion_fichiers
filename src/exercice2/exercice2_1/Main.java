package exercice2.exercice2_1;

public class Main {
    public static void main(String[] args) {
        LogManager logger = new LogManager("application.log");

        logger.log("INFO",  "Démarrage de l’application");
        logger.log("DEBUG", "Chargement de la configuration");
        logger.log("ERROR", "Impossible de se connecter à la base");
        System.out.println("Journal écrit dans application.log");
    }
}
