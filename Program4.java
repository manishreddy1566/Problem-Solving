import java.util.PriorityQueue;

public class LastStoneWeight {

    public static int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxHeap =
                new PriorityQueue<>((a, b) -> b - a);

        for (int stone : stones) {
            maxHeap.add(stone);
        }

        while (maxHeap.size() > 1) {
            int heaviest = maxHeap.poll();
            int secondHeaviest = maxHeap.poll();

            if (heaviest != secondHeaviest) {
                maxHeap.add(heaviest - secondHeaviest);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }

    public static void main(String[] args) {
        int[] stones1 = {2,3,6,2,4};
        System.out.println(lastStoneWeight(stones1)); // 1

        int[] stones2 = {1,2};
        System.out.println(lastStoneWeight(stones2)); // 1
    }
}
