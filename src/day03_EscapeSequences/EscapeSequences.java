package day03_EscapeSequences;// this is the packahe for the Escape Sequences Class
/* escape sequences: must be gibe with double quote

\n: starts a new line
\t: paragraph space (tab)
\\: single back slash-  if i tupe only one back slash, nothing will happen, if I type a single back slash , the compipelr expects to give a character, because this character back slash is reserved by escape sequences.
                     So, if I type two back slashes, the console will print one back slash
\" double quote
 */
public class EscapeSequences {
    public static void main(String[] args) {

        System.out.println("Java\nPython\n C#");

        System.out.println("---------------------");
        System.out.println("Hy Cydeo\nHow are you all today?\nIt's  nice to see you all!\nWhat class do we have next week?");

        System.out.println("---------------------------------");
        System.out.println("\tJava is a cool programming language");
        System.out.println("-------------------------------");
        System.out.println(" / \\");// in order to print one backward slash, we need to give two backward slashes
        System.out.println("-------------------------------");
        System.out.println("My favourite TV show is \" Games of Throne\"");//in order to print double quote, we need to use \"



    }


}
