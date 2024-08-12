import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int todayDate = converDateToDays(today);
        Map<String, Integer> map = new HashMap<>();
        for(String term : terms) {
            String[] parts = term.split("");
            String termType = parts[parts.length - 1];
            int termDate = converDateToDays(term);
            map.put(termType, termDate);

        }
        List<Integer> list = new ArrayList<>();
        for(int i =0; i<privacies.length; i++) {
            String[] parts = privacies[i].split("");
            String privacyDate = parts[0];
            String privacyRermType = parts[1];

            int collectionDate = converDateToDays(privacyDate);
            int validMonths = map.get(privacyRermType);
            int expirationDate = addMonthsToDate(collectionDate, validMonths);

            if(expirationDate < todayDate) {
                list.add(i+1);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    private int converDateToDays(String date) {
        String[] parts = date.split("\\.");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        return (year * 12 * 28 ) + month * 30 + day;

    }

    private static int addMonthsToDate(int date, int months) {
        return date + (months * 28);
    }
}