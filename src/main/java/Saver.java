import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ListIterator;

public class Saver extends CarModel {
    int COUNT = 1;

    public void saverData(List<String> list){
        
        BufferedWriter bufferedWriter =
                null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter("tmp/" + "car" + COUNT + ".txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        COUNT ++;
        StringBuilder stringBuilder = new StringBuilder();

        ListIterator<String> logs = list.listIterator();
        while (logs.hasNext()) {
            stringBuilder.append(logs.next());
            stringBuilder.append(System.lineSeparator());
        }
        try {
            bufferedWriter.write(stringBuilder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}