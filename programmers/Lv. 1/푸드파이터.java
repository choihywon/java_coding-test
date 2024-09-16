class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        
        
        for (int i = 1; i < food.length; i++) {
            int pattern = food[i] / 2;
            String foodString = Integer.toString(i); 
            for (int j = 0; j < pattern; j++) {
                sb.append(foodString);
            }
        }
        
        
        String leftPart = sb.toString(); 
        String rightPart = sb.reverse().toString(); 
        
        
        String result = leftPart + "0" + rightPart;
        
        return result;
    }
}
