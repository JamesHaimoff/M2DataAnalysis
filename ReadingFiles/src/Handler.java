import java.util.ArrayList;

public class Handler {
    private String filepath;
    private int articleNumber;
    private int uniqueWords;
    private String[] words;
    private Integer[] counts;
    public Handler(String filepath, int articleNumber){
        this.filepath = filepath;
        this.articleNumber = articleNumber;
    }
    public void processingNComputations(){
        filepath = this.filepath;
        System.out.println("Article " + this.articleNumber + " Information Display:");
        ArrayList<String> file1 = new ArrayList<>();
        ReadingFiles fileProcessor = new ReadingFiles();
        file1 = fileProcessor.completeClean(filepath);
        Object[] result = Calculations.countWordFrequency(file1);

        String[] words = (String[]) result[0]; //take the return at 0 assigning this to words
        Integer[] counts = (Integer[]) result[1]; //take the return at 1 assigning this to counts

//        for(int i = 0; i < words.length; i++){
//            System.out.println(words[i] + ":" + counts[i]);
//            //made it into array list because we are personally more comforatable with it
//            //just mapped a two array bubble sort

        Statistics statistics = new Statistics();
        statistics.bubbleSortArrays(words, counts);
//        for (int count: counts) {
//            System.out.println(count);
//        }
        this.words = (String[]) result[0];
        this.counts = (Integer[]) result[1];

        statistics.displayStatistics(words, counts);
        int uniqueWords = words.length;
        this.uniqueWords = uniqueWords;

        positiveNegative positiveNegative = new positiveNegative();
        positiveNegative.vocabCalculation(this.words,this.counts);
//        System.out.println(this.words[2]);
//        System.out.println(this.counts[2]);


        //pass this in and get the positve score of these words

    }
    public int getUniqueWords(){
        return this.uniqueWords;
    }
//    public Integer[] counts(){
//        return this.counts;
//    }
//    public String[] words(){
//        return this.words;
//    }
}
