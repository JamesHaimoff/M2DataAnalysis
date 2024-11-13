import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //you may also need to implement a function for number of words in the calculations thing
        Handler file1 = new Handler("C:/CODE/WLAB/gta6news.txt",1);
        file1.processingNComputations();
        Handler file2 = new Handler("C:/CODE/WLAB/gta6news1.txt",2);
        file2.processingNComputations();
        Handler file3 = new Handler("C:/CODE/WLAB/gta6news2.txt",3);
        file3.processingNComputations();

        //prints which has the richest vocab with the number of words

//        System.out.println("----------------------------------------------");
        System.out.println("Richest Vocabulary Test of the Three Articles:");
        richnessComparison(file1,file2,file3);

    }
    public static void richnessComparison(Handler file1,Handler file2,Handler file3){
        int file1vocab = file1.getUniqueWords();
        int file2vocab = file2.getUniqueWords();
        int file3vocab = file3.getUniqueWords();
        if (file1vocab > file2vocab && file1vocab > file3vocab) {
            System.out.println("File 1 has the richest vocabulary with " + file1vocab + " unique words.");
        } else if (file2vocab > file1vocab && file2vocab > file3vocab) {
            System.out.println("File 2 has the richest vocabulary with " + file2vocab + " unique words.");
        } else if (file3vocab > file1vocab && file3vocab > file2vocab) {
            System.out.println("File 3 has the richest vocabulary with " + file3vocab + " unique words.");
        } else {
            System.out.println("There is a tie for the richest vocabulary.");
        }
    }
}
