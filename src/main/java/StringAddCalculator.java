import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    String[] strNumbers;
    private final String no;
    CheckNumber checkNumber;

    public StringAddCalculator(String no) {
        this.no = no;
        checkNumber = new CheckNumber(this.no);
    }



    private Integer makeSum(String[] strNumbers) {
        int[] intNumbers = Arrays.asList(strNumbers).stream().mapToInt(Integer::parseInt).toArray();
        return Arrays.stream(intNumbers).sum();
    }

    public Integer splitAndSum() {


        return makeSum(strNumbers);
    }
}
