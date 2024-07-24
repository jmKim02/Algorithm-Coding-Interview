// 배열의 절반을 교환하는 과정이 필요하기에 최선이라고 생각
// 시간 복잡도 O(n)

class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
        }
    }
}
