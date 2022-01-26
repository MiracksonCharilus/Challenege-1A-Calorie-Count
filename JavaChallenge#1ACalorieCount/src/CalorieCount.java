/**
 * @author 5716504
 * (Mirackson Charilus)
 *
 * Title: Challenge #1A Calorie Count
 * Semester: COP3804 - Spring 2021
 * Professor's Name: Prof. Charters
 * Description of Program’s Functionality: This program demonstrates the use of using global variables and creating/calling multiple methods
 */


import java.util.Scanner;
public class CalorieCount {

    public static int day1CalConsumed, day1CalBurned;
    public static int day2CalConsumed, day2CalBurned;
    public static int day3CalConsumed, day3CalBurned;
    public static int day4CalConsumed, day4CalBurned;
    public static int day5CalConsumed, day5CalBurned;
    public static int day6CalConsumed, day6CalBurned;
    public static int day7CalConsumed, day7CalBurned;
    public static int totalCaloriesConsumed, totalCaloriesBurned;
    public static double averageCaloriesConsumed, averageCaloriesBurned;
    public static double netWeeklyPounds;

    public static void main(String[] args) {
    getUserInput();
    }
    /**
     * (This method asks the user for all the data needed to calculate the calorie count)
     *
     * @param
     * @param
     * @return
     * Preconditions:
     * Postconditions:
     */
    public static void getUserInput()
    {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter calories consumed for day #1:");
        day1CalConsumed = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter calories burned for day #1:");
        day1CalBurned = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter calories consumed for day #2:");
        day2CalConsumed = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter calories burned for day #2:");
        day2CalBurned = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter calories consumed for day #3:");
        day3CalConsumed = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter calories burned for day #3:");
        day3CalBurned = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter calories consumed for day #4:");
        day4CalConsumed = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter calories burned for day #4:");
        day4CalBurned = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter calories consumed for day #5:");
        day5CalConsumed = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter calories burned for day #5:");
        day5CalBurned = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter calories consumed for day #6:");
        day6CalConsumed = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter calories burned for day #6:");
        day6CalBurned = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter calories consumed for day #7:");
        day7CalConsumed = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter calories burned for day #7:");
        day7CalBurned = keyboard.nextInt();
        keyboard.nextLine();

        calculateCalories();
    }
    /**
     * (This method uses the user input from the previous method to calculate the calroie count)
     *
     * @param
     * @param
     * @return
     * Preconditions:
     * Postconditions:
     */
    public static void calculateCalories()
    {
    totalCaloriesConsumed = day1CalConsumed + day2CalConsumed +day3CalConsumed +day4CalConsumed +day5CalConsumed +day6CalConsumed +day7CalConsumed;
    totalCaloriesBurned = day1CalBurned + day2CalBurned + day3CalBurned + day4CalBurned + day5CalBurned + day6CalBurned + day7CalBurned;

    averageCaloriesConsumed = (double)totalCaloriesConsumed / 7;
    averageCaloriesBurned = (double)totalCaloriesBurned / 7;

    netWeeklyPounds = (totalCaloriesBurned - totalCaloriesConsumed) / 3000;

        displayCalories();
    }
    /**
     * (This method displays the total calories consumed/burned, the average, and the net total)
     *
     * @param
     * @param
     * @return
     * Preconditions:
     * Postconditions:
     */
    public static void displayCalories()
    {
        System.out.printf("You consumed a total of %d calories this week %n", totalCaloriesConsumed);
        System.out.printf("You burned a total of %d calories this week %n", totalCaloriesBurned);
        System.out.printf("You consumed an average of %.2f calories a day %n", averageCaloriesConsumed);
        System.out.printf("You consumed an average of %.2f calories a day %n", averageCaloriesBurned);
        System.out.printf("Your net weekly gain/loss were %.2f pounds %n", netWeeklyPounds);


    }




}
