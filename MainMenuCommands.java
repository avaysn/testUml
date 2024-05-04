package enums;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public enum MainMenuCommands {
    EnterLogin("menu enter main menu"),
    Logout("user logout"),
    ExitToLoginRegister("menu exit"),
    ShowName("show current menu");

    public final String pattern;

    MainMenuCommands(String pattern) {
        this.pattern = pattern;
    }

    public Matcher getMatcher(String input) {
        Matcher matcher = Pattern.compile(this.pattern).matcher(input);

        if (matcher.matches()) {
            return matcher;
        }
        return null;
    }
}


