import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class ValidarUIDs {
    public static void main(String[] args) {
        List<String> uids = Arrays.asList(
            "B1CD102354",
            "B1CDEF2354"
        );

        for (String uid : uids) {
            if (esValido(uid)) {
                System.out.println(uid + " - Válido");
            } else {
                System.out.println(uid + " - Inválido");
            }
        }
    }

    public static boolean esValido(String uid) {
       
        if (uid.length() != 10) return false;

        if (uid.chars().filter(Character::isUpperCase).count() < 2) return false;

        if (uid.chars().filter(Character::isDigit).count() < 3) return false;

        
        if (!Pattern.matches("[A-Za-z0-9]+", uid)) return false;

        
        Set<Character> set = new HashSet<>();
        for (char c : uid.toCharArray()) {
            if (!set.add(c)) return false;
        }

        return true;
    }
}
