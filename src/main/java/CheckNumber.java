import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckNumber {
    private String no;

    public CheckNumber(String no) {
        this.no = no;
    }

    boolean isNumberZero(String no) {
        return no.equals("0") || no.length() == 0;
    }

    boolean isNumberSingle(String no) {
        return no.length() == 1;
    }

    boolean isNumberCommaOrColon(String no) {
        return this.no.contains(",") || this.no.contains(",");
    }

    boolean isNumberNegative(String no) {
        return Integer.parseInt(no) < 0;
    }


}
