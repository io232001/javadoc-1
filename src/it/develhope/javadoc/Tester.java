package it.develhope.javadoc;
/**
 * Classe Tester che verifica il corretto funzionamento dei metodi della classe WordGames.
 * Autore: Ionut
 */
public class Tester
{
    public static void main(String args[])
    {
        WordGames WordGames=new WordGames();
        System.out.println(WordGames.addHelloWord("Word"));
        System.out.println(WordGames.getFullName("Dwayne","Jhonson"));
    }
}
