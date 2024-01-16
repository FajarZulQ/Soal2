import java.util.ArrayList;

public class UAS1D {
    public static void main(String[] args) {
        String client_key = "wSCoGfXjRczziGCxJzKGOAHeDDD1AvZKxjOOPjco";
        String[] p = client_key.split("");
        ArrayList<Integer> s = getCounts(client_key);

        for (int index = 0; index < s.size(); index++) {
            int count = s.get(index);
            char currentChar = p[index].charAt(0);

            int multiplier = (Character.isLowerCase(currentChar)) ? 2 : 3;

            System.out.println("Character '" + currentChar + "' count is: " + count * multiplier);
        }
    }
    private static ArrayList<Integer> getCounts(String clientKey) {
        String[] characters = clientKey.split("");
        ArrayList<Integer> counts = new ArrayList<>();

        for(int index = 0; index < characters.length; index++) {
            int count = getCountTheSame(characters[index], characters);
            counts.add(count);
        }

        return counts;
    }
    private static int getCountTheSame(String character, String[] array) {
        int count = 0;
        for (String element : array) {
            if (character.equals(element)) {
                count++;
            }
        }
        return count;
    }
}