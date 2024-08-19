import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class test{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = "user_data.csv";

        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            // Adding header to CSV
            String[] header = {"Name", "Class", "Marks"};
            writer.writeNext(header);

            while (true) {
                System.out.print("Enter name (or type 'exit' to finish): ");
                String name = scanner.nextLine();
                if (name.equalsIgnoreCase("exit")) {
                    break;
                }

                System.out.print("Enter class: ");
                String className = scanner.nextLine();

                System.out.print("Enter marks: ");
                String marks = scanner.nextLine();

                // Adding data to CSV
                String[] data = {name, className, marks};
                writer.writeNext(data);
            }

            System.out.println("Data has been written to " + filePath);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Display the contents of the CSV file
        displayCSV(filePath);
    }

    // Method to display the contents of a CSV file
    public static void displayCSV(String filePath) {
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> allData = reader.readAll();

            // Print Data
            for (String[] row : allData) {
                for (String cell : row) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        } catch (IOException | com.opencsv.exceptions.CsvException e) {
            e.printStackTrace();
        }
    }
}
