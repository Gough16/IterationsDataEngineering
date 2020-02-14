package michaelGough16;

import com.opencsv.exceptions.CsvValidationException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


public class CsvParser {

  //List that holds the data from the csv file
  private List fileRows = new ArrayList();


  /**
   * This method parses through the csv file to read the data
   * @param infile
   * @throws IOException
   * @throws CsvValidationException
   */
  public CsvParser(String infile) throws IOException, CsvValidationException {
    if (checkFile(infile)) {
      readCsv(infile);
    }
  }

  /** Read the csv file
   * @param csvinfile CSV file with path information for loading
   */
  protected void readCsv(String csvinfile) throws IOException, CsvValidationException {

    // Open a file & input stream for use with CSVReader (to create a reader object)
    FileInputStream csvStream = new FileInputStream(csvinfile);
    InputStreamReader inputStream = new InputStreamReader(csvStream,
        StandardCharsets.UTF_8);
    CSVReader reader = new CSVReader(inputStream);

    String[] nextLine;
    while ((nextLine = reader.readNext()) != null) {
      fileRows.add(nextLine);
    }
    // Close the reader
    reader.close();
  }

  /** This method is used to prints out the csv
   */
  protected void printCsv() {

    for (Object row : fileRows) {
      for (String fields : (String[]) row) {
        System.out.print(fields + ", ");
      }
      //Tabs to the next line
      System.out.println("\n");
    }
  }

  /** This method checks to see if a file exist
   * @return type true if found and false if the file is not found
   */
  private boolean checkFile(String csvfile) {
    if (!Files.exists(Paths.get(csvfile))) {
      System.out.println("File does not exist");
      return false;
    }
    return true;
  }
}

