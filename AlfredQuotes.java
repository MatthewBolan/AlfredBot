
import java.util.Date;

public class AlfredQuotes {

    public String basicGreeting() {

        // You do not need to code here, this is an example method

        return "Hello, lovely to see you. How are you?";

    }

    public String guestGreeting(String name) {

        // YOUR CODE HERE

        return "Hello, " + name + ". Lovely to see you.";

    }


        public String guestGreeting2(String name, String dayPeriod) {

        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);

    }



    public String dateAnnouncement() {

        Date date = new Date();

        return "Current date is: " + date;

    }



    public String respondBeforeAlexis(String alexisTest) {

        if (alexisTest.contains("Alexis")) {

        return "Right away, sir. She certainly isn't sophisticated enough for that.";

        }

        return "Right. And with that I shall retire.";

    }



    public String respondBeforeAlfred(String alfredTest) {

        if (alfredTest.contains("Alfred")) {

        return "At your service. As you wish, naturally.";

        }

        return "Right. And with that I shall retire.";

    }


    public String respondBeforeBatman(String notRelevantTest) {

        if (notRelevantTest.contains("Batman")) {

        return "As long as we try nothing else matters!";

        }

        return "its Batman!";

    }




}

