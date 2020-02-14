package michaelGough16;

import com.opencsv.CSVParser;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException, CsvValidationException {
//    System.out.println("Hello");
    CsvParser csvP = new CsvParser("src/Data/SEOExample.csv");
    csvP.printCsv();
 }

}
