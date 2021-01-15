// import java.util.ArrayList;
// import java.util.List;

public class Exam {

    /**
     *
     * Main method.
    @param args
     */
    public static void main(String[] args) {

        ScoreCalc doesItWork = new ScoreCalc();
        String output = doesItWork.toString();
        ReadingFile read = new ReadingFile();
        //List<String> readResults = new ArrayList<String>();
        String[] readResults = read.readFile("sampleInput.txt");

        for (int i = 0; i < 20; i++) {
            System.out.println(readResults[i]);
        }

        // String results = read.readString("sampleInput.txt");
        // System.out.println(results);
    }
}
