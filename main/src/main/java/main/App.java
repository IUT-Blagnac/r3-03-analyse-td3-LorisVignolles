package main;

/**
 * La classe App est une classe de démonstration pour afficher des messages.
 */
public class App 
{
    /**
     * La méthode principale qui affiche "Hello World!".
     * @param args Les arguments de la ligne de commande.
     */
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
    }

    /**
     * Affiche "Hello World".
     */
    public void Hello() {
        System.out.println("Hello World");
    }

    /**
     * Affiche la chaîne de caractères spécifiée.
     * @param s La chaîne de caractères à afficher.
     */
    public void Hello(String s) {
        System.out.println(s);
    }
}

