package exercice1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CsvParser {

    public static List<Record> readCsv(String path) throws IOException {
        List<Record> records = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    int id = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    double score = Double.parseDouble(parts[2].trim());
                    records.add(new Record( name, score));
                }
            }
        }
        return records;
    }

    public static void writeCsv(List<Record> records, String path) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write("id,name,score");
            bw.newLine();

            for (Record record : records) {
                bw.write(record.getId() + "," +
                        record.getName() + "," +
                        record.getScore());
                bw.newLine();
            }
        }
    }
}