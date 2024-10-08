class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for (char ms : my_string.toCharArray()) {
            if (Character.isDigit(ms)) {
                answer += Character.getNumericValue(ms);
            }
        }
        return answer;
    }
}