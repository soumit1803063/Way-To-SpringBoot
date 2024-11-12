import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFilePath = "/home/soumit/Documents/way to spring boot/Leetcode/Test/input.txt";
        String outputFilePath = "/home/soumit/Documents/way to spring boot/Leetcode/Test/output.txt";
        boolean local = new File(inputFilePath).exists() && new File(outputFilePath).exists();

        BufferedReader reader = local ? new BufferedReader(new FileReader(inputFilePath)) : new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = local ? new BufferedWriter(new FileWriter(outputFilePath)) : new BufferedWriter(new OutputStreamWriter(System.out));

        // Call the solve function with reader and writer
        solve(reader, writer);

        // Close the reader and writer to flush the output if using files
        reader.close();
        writer.close();
    }

    public static void solve(BufferedReader reader, BufferedWriter writer) throws IOException {
        // Read the target value
        int target = Integer.parseInt(reader.readLine().trim());

        // Read the array of integers
        String[] numberStrings = reader.readLine().trim().split(",");
        int[] nums = new int[numberStrings.length];
        for (int i = 0; i < numberStrings.length; i++) {
            nums[i] = Integer.parseInt(numberStrings[i]);
        }

        // Create an instance of Solution and call minSubArrayLen
        Solution solution = new Solution();
        int result = solution.minSubArrayLen(target, nums);

        // Write the result to the output
        writer.write(String.valueOf(result));
        writer.newLine();
    }
}
