package dev;

import java.util.ResourceBundle;

import com.github.lalyos.jfiglet.FigletFont;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String asciiArt = FigletFont.convertOneLine("hello");
        System.out.println(asciiArt);
        String titre = ResourceBundle.getBundle("application").getString("titre"); 
        String asciiArt2 = FigletFont.convertOneLine(titre);
        System.out.println(asciiArt2);
     // affichage de l'environnement
        String environnement = ResourceBundle.getBundle("application").getString(
        "environnement");
        System.out.println("Environnement : " + environnement);

    }
}