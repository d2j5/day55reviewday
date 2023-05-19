public class SleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) { //
            System.out.println("Don't worry, sleep more if you need!");
            return true;
        } else {
            System.out.println("It's time to work!");
            return false;
        }
    }
}
