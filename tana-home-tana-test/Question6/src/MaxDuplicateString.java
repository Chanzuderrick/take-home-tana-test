/*
 * Question 6
 * given a sentence
 * return three most common strings
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaxDuplicateString {

    private static Iterable<Map.Entry<String, Integer>> sortedWordsByFrequency;
    /*
     * Normalize the sentence:Convert to lowercase and remove punctuation
     * split the normalized sentence into indeividual words or tokens
     * use a hashmap to stor the frequency of each word
     * get all the entries in ascending order based on their frequency and alphabetical order
     * Select the top 3 words from the sorted list
    */
    static List<String> mostCommonStrings(String sentence) {
        //null check
        if (sentence == null || sentence.isEmpty()) {
            return Collections.emptyList();
        }
        //normalization and tokenizing
        Map<String, Integer> frequencyMap = new HashMap<>();
        //using regex to split by non-alphanumeric characters
        // \\b matches word boundary
        //[a-zA-Z0-9]+ matches any non-alphanumeric characters

        Pattern pattern = Pattern.compile("\\b[a-zA-Z0-9]+\\b");
        Matcher matcher = pattern.matcher(sentence.toLowerCase());

        //find thematch and put it in the hashMap
        while (matcher.find()) {
            String word = matcher.group();
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);

        }
        //convert map entries to a list for sorting
        List<Map.Entry<String, Integer>> sortedWordsbyFrequency = new ArrayList<>(frequencyMap.entrySet());

        //sort the list by frequency in descending order
        sortedWordsbyFrequency.sort(new Comparator<Map.Entry<String, Integer>>(){
           /* @Override*/
            public int compare(Map.Entry<String, Integer>entry1, Map.Entry<String, Integer>entry2){
                //comparing frequencies in descending order
                int freqComparison = entry2.getValue().compareTo(entry1.getValue());
                if(freqComparison ==0){
                    //frequencies are the same, compare alphabetically
                    return entry1.getKey().compareTo(entry2.getKey());
                } else {
                }
                return freqComparison;
            }
        });
        //extract top three words
        //since it is ascending, it will return the three least common words
        List<String> topThreeStrings = new ArrayList<>();
        int count = 0;
        Iterable<Map.Entry<String, Integer>> sortedWordsByFrequencyy;
        for(Map.Entry<String, Integer>entry : sortedWordsByFrequency){
            if(count<3){
                topThreeStrings.add(entry.getKey());
                count++;
            }else{
                break;
            }

        }
        //sort the extracted top 3 words alphabetically

        Collections.sort(topThreeStrings);
        return topThreeStrings;
    }


    public static void main(String[] args) throws Exception {
        String sentence1 = "hi there care to discuss algorithm basis or how to solve algorithm or";
        mostCommonStrings(sentence1);
        
    }
}
