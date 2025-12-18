import java.util.*;

public class TwoSum {
    public static int[] findTwoSumIndices(int[] numbers, int targetSum) {

        Map<Integer, Integer> numberToIndexMap = new HashMap<>();

        for (int currentIndex = 0; currentIndex < numbers.length; currentIndex++) {

            int currentNumber = numbers[currentIndex];
            int requiredNumber = targetSum - currentNumber;

            if (numberToIndexMap.containsKey(requiredNumber)) {

                int firstIndex = numberToIndexMap.get(requiredNumber);
                int secondIndex = currentIndex;

                if (firstIndex < secondIndex) {
                    return new int[]{firstIndex, secondIndex};
                } else {
                    return new int[]{secondIndex, firstIndex};
                }
            }

            numberToIndexMap.put(currentNumber, currentIndex);
        }

        return new int[0];
    }

    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 6};
        int targetSum = 7;

        int[] result = findTwoSumIndices(numbers, targetSum);
        System.out.println(Arrays.toString(result));
    }
}
