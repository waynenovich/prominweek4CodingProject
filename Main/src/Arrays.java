//Wayne Novich
import java.util.Random;

public class Arrays {
    public static void main(String[] args) {

        //int randomINT = intRND(); //Establish a random integer to be used.
        //double randomDUB = doubleRND(); //Establish a random double to be used.
    //PART ONE --------------------------------------------------------------------------------------------------
        //Array One (Age Group One).
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; //Creates an integer Array of 8 values.
        //Array Two (Age Group Two).
        int[] ages2 = {intRND(), intRND(), intRND(), intRND(), intRND(), intRND(), intRND(), intRND(), intRND()}; //Creates an integer for the second set of 9 values. 
       
        int result = ages[ages.length - 1] - ages[0]; //Subtracts the first and last values of the integers.
         /* The ages.length - 1 allows access to the last value in Array One.
         *  The ages[0] represent the first value of Array One.
         *  This code will work regardless of array size.
         *  In the given case of Array One, the int result is pulling 93 - 3, which equals 90.
         */ 
        int result2 = ages2[ages2.length - 1] - ages2[0];
        /* The ages2.length - 1 allows access to the last value in Array One.
         *  The ages2[0] represent the first value of Array Two.
         *  This code will work regardless of array size.
         *  In the given case of Array One, the int result will be random.
         */
        
        int sum = 0; //Initializes the sum variable (value set to 0) for both arrays.
        //For loop for Array One.
        for (int age : ages) { 
            sum += age; //Pulls the values of Array One to the loop.
        }
        //For loop for Array Two.
        for (int age : ages2) {
            sum += age; //Pulls the values of Array Two to the loop.
        }

        int totalSum = ages.length + ages2.length; //Creates an integer totalSum that adds Array One with Array Two.
        double average = (double) sum / totalSum; //Calculates the average.

        System.out.println("Subtracted result of Age Group One: " + result); //Shows the results of the Subtraction to the terminal for Array One.
        System.out.println("Subtracted result of Age Group Two: " + result2);//Shows the results for the second Array to the terminal.
        System.out.println("Average Age result: " + average); //Shows the result of the average for both Arrays.

    //PART TWO --------------------------------------------------------------------------------------------------
        //String Array.
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; //Creates an string Array with 6 values.
        StringBuilder concatenatedNames = new StringBuilder(); //Creates a new string to concate names.
        
        int sumLetters = 0; //Initializes the sum variable (value set to 0) for the string array.
        //For Loop One for name lengths.
        for (String name : names) {
            sumLetters += name.length(); //For Loop to bring in name legths.
        }
        //For Loop Two for concatenations.
        for (int i = 0; i < names.length; i++) {
            concatenatedNames.append(names[i]);  
            if (i < names.length - 1) {  //Allows the last space to be removed if its the last value (name).
                concatenatedNames.append(" ");
            }
        }

        double avgLetters = (double) sumLetters / names.length; //Caculates the average.

        System.out.println("Average number of letters per name: " + avgLetters); //Displays the average letters of the Array.
        System.out.println("Concatenated Names: " + concatenatedNames.toString()); //Displays the concatenated names from the Array.


    //PART THREE --------------------------------------------------------------------------------------------------
        String startName = names[0]; //Pulls the first value of the String Array.
        System.out.println("The first name of the list: " + startName); //Displays the first value in the String Array.

    //PART FOUR --------------------------------------------------------------------------------------------------
        String finalName = names[names.length - 1]; //Pulls the last value of the String Array.
        System.out.println("Final name of the list: " + finalName); //Displays the last value in the String Array.

    //PART FIVE --------------------------------------------------------------------------------------------------
        //Integer Array nameLengths.
        int[] nameLengths = new int[names.length]; //Initialize the nameLengths to a new array.

        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();  //Add the length of each name to nameLengths
        }
        System.out.print("Lengths of each name: "); //Displays the name to the terminal.
        for (int length : nameLengths) {
            System.out.print(length + " "); //For Loop to add to the print out display the values.
        }

        System.out.println(); //Makes the list indent for part six.
    //PART SIX --------------------------------------------------------------------------------------------------
        int sumOfLengths = 0; //Integer 

        for (int length : nameLengths) {
        sumOfLengths += length;  //Pulls the value lengths.
        }

        System.out.println("Sum of all name lengths: " + sumOfLengths); //Displays the sum to the terminal.

    //PART SEVEN --------------------------------------------------------------------------------------------------
        //String Word.
        String word = "Word"; //Establish the Word.
        int n = intRND(); //Integer to mark the number of concatentate.

        String resultWord = repeatWord(word, n);  //Calls to the method "repeatWord".
        System.out.println("Result: " + resultWord);  //Displays the final result to the terminal.

    //PART EIGHT--------------------------------------------------------------------------------------------------
        //Full Name two strings.
        String firstName = "Namesomy"; //String One.
        String lastName = "Lastnamed"; //String Two.

        String fullName = stringFullName(firstName, lastName);  //Calls to the method "stringFullName".
        System.out.println("Full Name: " + fullName); //Displays the full name from the two strings.

    //PART NINE--------------------------------------------------------------------------------------------------
        //Greater than 100 array.
        int[] numbers = {intRND(), intRND(), intRND()};  //Integer array, numbers can be changed.

        boolean result100 = Greater100(numbers);  // Call the method
        System.out.println("Greater than 100? " + result100); //Displays the results to the terminal.

    //PART TEN--------------------------------------------------------------------------------------------------
        //Double Array Returns.
        double[] valuesDouble = {doubleRND(), doubleRND(), doubleRND(), doubleRND(), doubleRND()};  //Creates an double Array with 5 values.

        double averageDouble = calculateAverage(valuesDouble);  //Calls to the method "calculateAverage".
        System.out.println("Average of the array: " + averageDouble);  //Displays results to terminal.

    //PART ELEVEN--------------------------------------------------------------------------------------------------
        double[] arrayD1 = {doubleRND(), doubleRND(), doubleRND()};  //Creates two Arrays
        double[] arrayD2 = {doubleRND(), doubleRND(), doubleRND()};    

        boolean isFirstGreater = isGreater(arrayD1, arrayD2); //Calls to the method "isGreater".
        System.out.println("Is Array One Greater? " + isFirstGreater);

    //PART TWELVE--------------------------------------------------------------------------------------------------
        boolean isHotOutside = true;  //Establish a boolean with a value of true.
        double moneyInPocket = doubleRND(); //Establish a double with a value of random.

        // Call the method and print the result
        boolean result12 = willBuyDrink(isHotOutside, moneyInPocket); //Calls to the method "willBuyDrink".
        System.out.println("Should I buy a drink? " + result12); //Displays to the terminal.
        //Result 12 is only there to keep this result from other ones.
    }

    //METHOD FOR PART SEVEN
    public static String repeatWord(String word, int n) { //n equals the number of concatentations.
        StringBuilder resultWord = new StringBuilder(); 

        for (int i = 0; i < n; i++) {
            resultWord.append(word);  //Appends Words
        }

        return resultWord.toString();  //Sends the result back to the "String resultWord = repeatWord(word, n);".
    }

    //METHOD FOR PART EIGHT
    public static String stringFullName(String firstName, String lastName) {
        return firstName + " " + lastName;  //Brings both strings together and adds a space between the two.
    }

    //METHOD FOR PART NINE
    public static boolean Greater100(int[] arr) {
        int sum = 0;  //Initialize the sum and sets the value to 0.

        
        for (int num : arr) {
            sum += num;  //Loop through the array and calculate the sum
        }

        return sum > 100;  //Return true if the sum is greater than 100, else return false.
    }

    //METHOD FOR PART TEN
    public static double calculateAverage(double[] arr) { //Calculates the avarage of the array double.
        double sum = 0; //Initialize
        int count = arr.length; //Pulls the numbers from the array.

        for (double num : arr) { //For Loop to calculate the sum.
            sum += num;  
        }

        return count > 0 ? sum / count : 0.0;  //Return average to "double averageDouble = calculateAverage(valuesDouble);".
    }

    //METHOD FOR PART ELEVEN
    public static boolean isGreater(double[] arr1, double[] arr2) {
        double sum1 = 0;  //Initialize Array 1
        double sum2 = 0;  //Initialize Array 2
        
        for (double num : arr1) { //Calculate the sum of Array 1.
            sum1 += num;  
        }   
        for (double num : arr2) { //Calculate the sum of Array 2.
            sum2 += num;  
        }

        double average1 = arr1.length > 0 ? sum1 / arr1.length : 0.0;  //Calculate average for Array 1.
        double average2 = arr2.length > 0 ? sum2 / arr2.length : 0.0;  //Calculate average for Array 2.

        return average1 > average2;  //Return true if the average of the first array is greater than the second.
    }

    //METHOD FOR PART TWELVE
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;  // Return true if both conditions are met
    }

//PART THIRTEEN
    //MADE RANDOM VALUES TO ENSURE CODES WORK NO MATTER THE NUMBER.
    //METHOD FOR RANDOM INT VALUE TO BE USED
    public static int intRND() { //Generates a random integer between 0 and 200
        int rndINT = (int)(Math.random() * 201);  
        return rndINT;
    }
    //METHOD FOR RANDOM DOUBLE VALUE TO BE USED
    public static double doubleRND() { //Generates a random double between 0.0 and 20.0
        Random random = new Random();
        double randDUB = random.nextDouble() * 20.0; 
        return randDUB;
    }
     /* For question 13 I was asked to "13. Create a method of your own that solves
        a problem. In comments, write what the method does and why you created it.". 
        I decided that I was already having a practical problem with showing how the
        values could change through the other questions but still show a working output.
        I could type out many arrays but that felt like it would come off as sloppy.
        I knew random was a thing but had never tried to figure it out without looking it up.
        I started messing around with the random code and discovered Math.random but that gives
        any number. Which sounds good but some questions only want integers and others doubles.
        I figured out how to lock the Math.random to a set value to ensure it works within
         reasonable grounds for my code. This solves question 13 and makes two methods that ensure dynamicness
         with all other necessary methods. 
         */


        //Wayne Novich

}
