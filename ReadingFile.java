import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadingFile {
    //here's where I'm parsing the csv fle
    private String lines;
    private String[] playersInfo;
    private int fileSize;
    private List<String> playersInList = new ArrayList<String>();
    private static final int MAX_CAPACITY = 1000;
    private String result;

    /**
    Default constructor.
     */
    public ReadingFile() {
        playersInfo = new String[MAX_CAPACITY];
    }

    /**
    Accessor for the csv file.
    @return the # of the file liens
     */
    public int getFileSize() {
        return fileSize;
    }

    /**
    Returns parsed comma delimited results.
    @param filename
    @return the string array
     */
    public String[] readFile(String filename) {
        String myString = readString(filename);
        playersInfo = myString.split("[,|\\W+|\\r?\\n]");
        return playersInfo;
    }

    /**
    Reading and returning the file info.
    @param filename
    @return string array of values from file
     */
    public String readString(String filename) {
        try {
            int i = 0;
            result = "";
            BufferedReader fileInfo = new BufferedReader(new FileReader(filename));
            while ((lines = fileInfo.readLine()) != null) {
                result = result.concat(lines);
                i++;
            }
            fileSize = i;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
    Reading and returning the file info.
    @param filename
    @return string array of values from file
     */
    public String[] readFileInfo(String filename) {
        try {
            int i = 0;
            BufferedReader fileInfo = new BufferedReader(new FileReader(filename));
            while ((lines = fileInfo.readLine()) != null) {
                playersInfo = lines.split(",");
                //playersInList.add(playersInfo[i]);
                i++;
            }
            fileSize = i;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return playersInfo;
    }
}
