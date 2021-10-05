import java.util.Arrays;
import java.util.OptionalInt;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {

    public static int splitAndSum(String no) {

        if (isNullOrEmpty(no)) {
            return 0;
        }

        if (isLengthOne(no)) {
            return Integer.parseInt(no);
        }

        if (isContainCommaOrColon(no)) {
            return addCommaOrColon(no);
        }

        if (isContainCustom(no)) {
            return addCustom(no);
        }

        return 0;
    }

    private static boolean isNullOrEmpty(String no) {
        return no == null || no.isEmpty();
    }

    private static boolean isLengthOne(String no) {
        return no.length() == 1;
    }

    private static boolean isContainCommaOrColon(String no) {
        return no.contains(",") || no.contains(":");
    }

    private static int addCommaOrColon(String no) {
        String[] numbers = no.split(",|:");
        int[] nums = makeInteger(numbers);
        return makeArraySum(nums);
    }

    private static int makeArraySum(int[] nums) {
        return Arrays.stream(nums).sum();
    }

    private static boolean isContainCustom(String no) {
        return no.contains("//");
    }

    private static int addCustom(String no) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(no);
        m.find();
        String customDelimiter = m.group(1);
        String[] numbers = m.group(2).split(customDelimiter);
        // 덧셈 구현
        int[] nums = makeInteger(numbers);
        return makeArraySum(nums);
    }

    private static int[] makeInteger(String[] numbers) {
        int[] nums = Arrays.stream(numbers).mapToInt(Integer::parseInt).toArray();

        if(isNegative(nums)) {
            throw new RuntimeException();
        }

        return nums;
    }

    private static boolean isNegative(int[] nums) {
        if(Arrays.stream(nums).min().getAsInt() < 0) {
            return true;
        }
        return false;
    }

}
