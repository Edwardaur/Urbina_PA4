public class Application {
   public static void main(String[] args) throws IOException
{
    //       a separate class called Application that contains a main method which illustrates the use of DuplicateCounter by calling both the remove and write methods. Your input file must be called problem2.txt and your output file must be called unique_word_counts.txt.
       DuplicateCounter duplicateCounter = new DuplicateCounter();
       duplicateCounter.count("problem2.txt");
       duplicateCounter.write("unique_word_counts.txt");
       System.out.println("Duplicate Counter Operation successfully done");
}
}