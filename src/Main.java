public class Main {
    public static void main(String[] args) {
//sleepIn's warmup 1
        boolean isWeekday = true;
        boolean isVacation = false;

        boolean shouldSleepIn = sleepIn(isWeekday, isVacation);
        System.out.println("Should sleep in? " + shouldSleepIn);

//Monkeys' warmup 2
        boolean isASmiling = true;
        boolean isBSmiling = false;

        boolean inTrouble = monkeyTrouble(isASmiling, isBSmiling);
        System.out.println("Are we in trouble? " + inTrouble);

//Sum's warmup 3
        int result1 = sumDouble(1, 2);
        System.out.println(result1); // Output: 3

        int result2 = sumDouble(3, 2);
        System.out.println(result2); // Output: 5

        int result3 = sumDouble(2, 2);
        System.out.println(result3); // Output: 8

//Diff21's warmup 4
        int diff1 = diff21(19);
        System.out.println(diff1);
        int diff2 = diff21(10);
        System.out.println(diff2);
        int diff3 = diff21(21);
        System.out.println(diff3);

//Talking-parrot's warmup 5
        boolean case1 = parrotTrouble(true, 6);
        System.out.println("Are we in trouble because the parrot is talking:  "+case1);
        boolean case2 = parrotTrouble(true, 7);
        System.out.println("Are we in trouble because the parrot is talking:  "+case2);
        boolean case3 = parrotTrouble(false, 6);
        System.out.println("Are we in trouble because the parrot is talking:  "+case1);

//Makes10's warmup 6
        boolean makes10Case1 = makes10(9, 10);
        System.out.println("Is a/b = 10, or is (a+b)= 10? "+ makes10Case1);
        boolean makes10Case2 = makes10(9, 9);
        System.out.println("Is a/b = 10, or is (a+b)= 10? "+ makes10Case2);
        boolean makes10Case3 = makes10(1, 10);
        System.out.println("Is a/b = 10, or is (a+b)= 10? "+ makes10Case3);

//nearHundred's warmup 7
        System.out.println(nearHundred(93));  // Output: true
        System.out.println(nearHundred(90));  // Output: true
        System.out.println(nearHundred(89));  // Output: false

//posNeg's warmup 8
        System.out.println(posNeg(1, -1, false));
        System.out.println(posNeg(-1, 1, false));
        System.out.println(posNeg(-4, -5, true));
    }
//SleepIn's method
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) { //Checks if it's not a weekday or if the person is on vacation.
            System.out.println("Don't worry, sleep more if you need!");//printed if the statement is true.
            return true;
        } else {
            System.out.println("It's time to work!"); //printed if the statement is false.
            return false;
        }

    }

//monkeyTrouble's method
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    return (aSmile && bSmile) || (!aSmile && !bSmile); // return true if both monkeys are smiling or(||) if neither of them are.
    }

// sumDouble's method
    public static int sumDouble(int a, int b) {
        int sum = a+b;
        if( a == b) {
            sum*= 2;
        }
        return sum;
    }
//Diff21's method
    public static int diff21(int n) {
        if (n <= 21) { // Evaluates if n is <= than 21 and returns the difference.
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }
//Talking-parrot's method
    public static boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20); // If talking is true and the hour is < 7 or(||) >20, print "we are in tro

    }

//Makes10's method
    public static boolean makes10(int a, int b) {
    return a == 10 || b == 10 || (a+b) == 10;
    }

//nearHundred's method
    public static boolean nearHundred(int n) {
        return (Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10);
        //Mat.abs() calculate the absolute difference between n and 100 or 200.
        //If the absolute difference is <= 10 it returns 'true'. otherwise, it returns 'false'.
    }

//posNeg's method
public static boolean posNeg(int a, int b, boolean negative) {
    if(negative) {
        return (a < 0 && b < 0); //returns 'true' if: negative is 'true', a and b are negatives.
    } else {
        return ((a < 0 && b > 0) || (a > 0 && b < 0)); //returns 'true' if one is negative and one is positive.
    }
}
}

