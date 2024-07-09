import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        Map<String, Integer> columnIndex = new HashMap<>();
        columnIndex.put("code", 0);
        columnIndex.put("date", 1);
        columnIndex.put("maximum", 2);
        columnIndex.put("remain", 3);

        int extIndex = columnIndex.get(ext);
        int sortByIndex = columnIndex.get(sort_by);

        List<int[]> filteredData = new ArrayList<>();
        for (int[] row : data) {
            if (row[extIndex] < val_ext) {
                filteredData.add(row);
            }
        }


        filteredData.sort(Comparator.comparingInt(row -> row[sortByIndex]));


        int[][] sortedData = new int[filteredData.size()][];
        for (int i = 0; i < filteredData.size(); i++) {
            sortedData[i] = filteredData.get(i);
        }

        return sortedData;
    }
}