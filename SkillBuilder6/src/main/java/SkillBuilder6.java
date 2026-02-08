
/**
 * SkillBuilder6 is a class for completing this Skill
 * Builder assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder6 {

    // replace this line with your constants

    public static String findTYPattern(String s)
    {
        String t = s.toUpperCase();

        int t1 = t.indexOf('T');
        int y1 = t.indexOf('Y');

        if(y1 < t1 | t1 == -1 | y1 == -1) return "";
        return s.substring(t1, y1 + 1);
    }
}
