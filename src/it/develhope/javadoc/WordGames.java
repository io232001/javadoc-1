package it.develhope.javadoc;
/**
 * Classe WordGames che contiene due metodi per manipolare le parole.
 * Autore: Ionut
 */
public class WordGames
{
    /**
     * Aggiunge "Hello " davanti alla parola inserita come parametro.
     *
     * @param word la parola a cui aggiungere "Hello"
     * @return la stringa "Hello " seguita da word
     */
    public String addHelloWord(String Word)
    {
        return "Hello " + Word;
    }
    public String name;
    public String surname;
    /**
     * Concatena il nome e il cognome inseriti come parametro.
     *
     * @param name il nome da concatenare
     * @param surname il cognome da concatenare
     * @return la stringa ottenuta è la concatenazione tra il nome e il cognome inseriti come parametro
     */
    public String getFullName(String name,String surname)
    {
        return name +" "+surname;
    }
}
