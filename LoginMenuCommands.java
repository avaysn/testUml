package enums;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum LoginMenuCommands {
    EnterRegister("menu enter register menu"),
    Login("login -u (?<username).+ -p (?<password>.+) -stay-logged-in"),
    ForgetPassword("forget password -u (?<username>.+)"),
    AnswerQuestion("answer -q (?<question_number>.+) -a (?<answer>)"),
    SetPassword("set password -p (?<password>.+)"),
    Exit("menu exit"),
    ShowName("show current menu");

    public final String pattern;

    LoginMenuCommands(String pattern) {
        this.pattern = pattern;
    }

    public Matcher getMather(String input) {
        Matcher matcher = Pattern.compile(this.pattern).matcher(input);

        if (matcher.matches()) {
            return matcher;
        }
        return null;
    }
}
