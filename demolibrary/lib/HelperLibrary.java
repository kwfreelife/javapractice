
public class HelperLibrary {
    public static String covertSecondsToDayHourMinuteSeconds(int xSeconds){
        //nt seconds = 19678;
        int s = xSeconds % 60;      // now 's' is seconds.
        // now get the s , then set xSeconds to minute
        in xMinutes = seconds / 60; // xMinute is minute value.
        int m = xMinutes % 60;      // now 'm' is minute
        int xHour = xMinutes / 60;  // xHour is hour value
        int h = xHour % 24;         // now 'h' is hour
        int xDay = xHour / 24;      // xDay is day value
        int d = xDay;               // ได้วันเป็นตัวสุดท้าย
        return (d + "d" + h + "h" + m + "m" + s + "s");
    }

    public static String lefString(String input, int length){
        if (input == null || length <= 0) {
            return ""; // Handle edge cases
        }
        return input.substring(0, length); 
    }

    public static String rightString(String input, int length) {
        if (input == null || length <= 0) {
            return ""; // Handle edge cases
        }
        return input.substring(Math.max(0, input.length() - length));
    }
    public static String mid(String str, int start, int length) {
        int startIndex = start - 1; // Convert to 0-based index
        int endIndex = Math.min(startIndex + length, str.length()); // Ensure no out-of-bounds
        return str.substring(startIndex, endIndex);
    }
}
