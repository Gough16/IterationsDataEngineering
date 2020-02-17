package michaelGough16;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;

public class Main {


  public static void main(String[] args) throws IOException, CsvValidationException {
    //    System.out.println("Hello");
    CsvParser csvP = new CsvParser("src/Data/SEOExample.csv");
    csvP.printCsv();

    Gson gson = new Gson();
    JsonReader jread = new JsonReader(new FileReader("src/Data/authors.json"));
    JsonParser[] authors = gson.fromJson(jread, JsonParser[].class);

    //For loop to loop through the contents in the json file and print it out
    for (JsonParser element : authors){
      System.out.println(element.getAuthorName());
      System.out.println(element.getAuthorEmail());
      System.out.println(element.getAuthorUrl());
    }

  }

}
