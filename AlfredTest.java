
public class AlfredTest {

    /*

    * This main method will always be the launch point for a Java application

    * For now, we are using the main to test all our 

    * AlfredQuotes methods.

    */

    public static void main(String[] args) {

        // Make an instance of AlfredQuotes to access all its methods.

        AlfredQuotes alfredBot = new AlfredQuotes();



        // Make some test greetings, providing any necessary data

        String testGreeting = alfredBot.basicGreeting();


        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane");


        String testGuestGreeting2 = alfredBot.guestGreeting2("Bane", "evening");


        String testDateAnnouncement = alfredBot.dateAnnouncement();


        String alexisTest = alfredBot.respondBeforeAlexis(

                            "Alexis! Play some low-fi beats."

                            );


        String alfredTest = alfredBot.respondBeforeAlfred(

            "I can't find my yo-yo. Maybe Alfred will know where it is."

            );


        String notRelevantTest = alfredBot.respondBeforeBatman(

            "Maybe that's what Batman is about. Not winning. But failing.."

        );




        // Print the greetings to test.

                System.out.println("");

        System.out.println(testGreeting); // #1

                System.out.println("");

        
        // Uncomment these one at a time as you implement each method.

        System.out.println(testGuestGreeting); // #2

                System.out.println("");


        System.out.println(testDateAnnouncement); // #3

                System.out.println("");


        System.out.println(alexisTest); // #4

                System.out.println("");


        System.out.println(alfredTest); // #5

                System.out.println("");


        System.out.println(testGuestGreeting2); // #6

                System.out.println("");


        System.out.println(notRelevantTest); // #7

                System.out.println("");

    }
}
