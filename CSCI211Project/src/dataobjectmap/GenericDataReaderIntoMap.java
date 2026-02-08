package dataobjectmap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class GenericDataReaderIntoMap {
    public Map<String, List<String>> keyValuePairs;
    public String keyTitle;
    public String valueTitle;

    public GenericDataReaderIntoMap(String fileName) {
        Map<String, List<String>> testKeyValuePairs = new TreeMap<>();

        String line;
        int lineno = 0;
        String[] data;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while ((line = br.readLine()) != null) {
                if (lineno == 0) {
                    data = line.split(",", 2);
                    if (data.length == 2) {
                        this.keyTitle = data[0].trim();
                        this.valueTitle = data[1].trim();
                    }
                } else {
                    data = line.split(",", 2);
                    if (data.length == 2) {
                        String keyInput = data[0].trim();
                        String valueInput = data[1].trim();
                        testKeyValuePairs.putIfAbsent(keyInput, new ArrayList<>());
                        testKeyValuePairs.get(keyInput).add(valueInput);
                    }
                }
                lineno++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        keyValuePairs = testKeyValuePairs;
    }

    public void keyValueLookup() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a key (" + this.keyTitle + ") or 'quit' to exit: ");
            String key = scanner.nextLine().trim();
            if (key.equalsIgnoreCase("quit")) {
                break;
            }

            List<String> values = keyValuePairs.get(key);
            if (values != null) {
                System.out.println("Value(s) (" + this.valueTitle + "):");
                for (int i = 0; i < values.size(); i++) {
                    System.out.println((i + 1) + ". " + values.get(i));
                }
            } else {
                System.out.println("Key not found.");
            }
        }
        System.out.println("Thank you for using the Key-Value Lookup program");
    }

    public static void test() {
        String fileName = "DataFiles/ThirdPartyDataCSVFiles/CityAndPopulation.csv";
        GenericDataReaderIntoMap mapReader = new GenericDataReaderIntoMap(fileName);
        mapReader.keyValueLookup();
    }

    public static void main(String[] args) {
        test();
    }
}
