package enums;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum RegisterMenuCommands {
    EnterLogin("menu enter login menu"),
    Exit("menu exit"),
    Register("register -u (?<username>.+) -p (?<password>.+) (?<passwordConfirm>.+)" +
            " -n (?<nickname>.+) -e (?<email>.+)"),
    PickQuestion("pick -q (?<question_number>.+) -a (?<answer>.+) -c (?<answer_confirm>.+)"),
    ShowName("show current menu");

    public final String pattern;

    RegisterMenuCommands(String pattern) {
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
