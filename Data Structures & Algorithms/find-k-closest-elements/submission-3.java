public class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }

        list.sort((a, b) -> {
            int diff = Math.abs(a - x) - Math.abs(b - x);
            return diff == 0 ? Integer.compare(a, b) : diff;
        });

        List<Integer> result = list.subList(0, k);
        Collections.sort(result);
        return result;
    }
}
/*
When Java compares two elements, a and b, the comparator must return an integer:Negative number ( < 0 ) $\rightarrow$ Means a comes before b (i.e., a is smaller or has higher priority).Zero (0) $\rightarrow$ Means a and b are equal in priority.Positive number ( > 0 ) $\rightarrow$ Means b comes before a (i.e., b is smaller or has higher priority).
*/