import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//a utility class called DuplicateRemover
class DuplicateRemover
{
//   The unique words should be stored in an instance variable called uniqueWords.
   ArrayList<String> uniqueWords = new ArrayList<String>();
//   an instance method called remove that takes a single parameter called dataFile (representing the path to a text file) and uses a Set of Strings to eliminate duplicate uniqueWords from dataFile.
   public void remove(String fileName) throws IOException {
BufferedReader br1 = new BufferedReader(new FileReader(fileName));
String line1 = br1.readLine();
while(line1 != null)
{
   String temp[] = line1.split(" ");
   for(String i:temp)
   {
       if(!uniqueWords.contains(i))   uniqueWords.add(i);
   }
line1 = br1.readLine();
}

br1.close();
   }
//   Create an instance method called write that takes a single parameter called outputFile (representing the path to a text file) and writes the words contained in uniqueWords to the file pointed to by outputFile.
   public void write(String fileName) throws FileNotFoundException {
       PrintWriter pw = new PrintWriter(fileName);
       for(String i:uniqueWords)
       {
       pw.println(i);
   }
       pw.close();
   }
}