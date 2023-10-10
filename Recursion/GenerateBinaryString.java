import java.util.ArrayList;

public class GenerateBinaryString {

    public static void main(String[] args) {
        generateString(3);
    }

    public static ArrayList<String> generateString(int k) {
        // Write your code here.

        ArrayList<String> result = new ArrayList();
        generateBinary(0, k, 0, "", result);

        System.out.println(result);

        return result;

    }

    static void generateBinary(int index, int k, int lastValue, String temp, ArrayList<String> result) {

        if (index >= k) {
            result.add(temp);
            return;
        }

        generateBinary(index + 1, k, 0, temp + "0", result);

        if (lastValue == 0) {
            generateBinary(index + 1, k, 1, temp + "1", result);
        }

    }
}
