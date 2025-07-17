import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();

        for (String email : emails) {
            String[] parts = email.split("@");
            String local = parts[0];
            String domain = parts[1];

            // Remove everything after '+'
            int plusIndex = local.indexOf('+');
            if (plusIndex != -1) {
                local = local.substring(0, plusIndex);
            }

            // Remove all '.' characters
            local = local.replace(".", "");

            // Combine and add to set
            uniqueEmails.add(local + "@" + domain);
        }

        return uniqueEmails.size();
    }

    // Example usage
    public static void main(String[] args) {
        UniqueEmailAddresses obj = new UniqueEmailAddresses();
        String[] emails1 = {
            "test.email+alex@leetcode.com",
            "test.e.mail+bob.cathy@leetcode.com",
            "testemail+david@lee.tcode.com"
        };

        System.out.println(obj.numUniqueEmails(emails1)); // Output: 2

        String[] emails2 = {
            "a@leetcode.com", "b@leetcode.com", "c@leetcode.com"
        };

        System.out.println(obj.numUniqueEmails(emails2)); // Output: 3
    }
}
