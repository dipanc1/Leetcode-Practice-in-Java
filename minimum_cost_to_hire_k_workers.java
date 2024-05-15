import java.util.*;

class Solution271 {
    //    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
//        int n = quality.length;
//        double minCost = Double.MAX_VALUE;
//        double qualityTillNow = 0;
//
//        List<Worker> workers = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            workers.add(new Worker(wage[i] / (double) quality[i], quality[i]));
//        }
//
//        Collections.sort(workers);
//
//        PriorityQueue<Integer> highQualityWorkers = new PriorityQueue<>(Comparator.reverseOrder());
//
//        for (Worker worker : workers) {
//            double ratio = worker.ratio;
//            int qua = worker.quality;
//
//            qualityTillNow += qua;
//            highQualityWorkers.add(qua);
//
//            if (highQualityWorkers.size() > k) qualityTillNow -= highQualityWorkers.poll();
//
//            if (highQualityWorkers.size() == k) minCost = Math.min(
//                    minCost, qualityTillNow * ratio
//            );
//        }
//
//        return minCost;
//
//    }
//
//    private class Worker implements Comparable<Worker> {
//        double ratio;
//        int quality;
//
//        Worker(double ratio, int quality) {
//            this.ratio = ratio;
//            this.quality = quality;
//        }
//
//        @Override
//        public int compareTo(Worker other) {
//            return Double.compare(this.ratio, other.ratio);
//        }
//    }
    public double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int n = quality.length;
        Worker[] workers = new Worker[n];

        for (int i = 0; i < n; i++) {
            workers[i] = new Worker(quality[i], wage[i]);
        }

        Arrays.sort(workers, (a, b) -> Double.compare((double) a.wage / a.quality, (double) b.wage / b.quality));

        double minCost = Double.MAX_VALUE;
        int workQuality = 0;
        PriorityQueue<Integer> res = new PriorityQueue<>((a, b) -> b - a);

        for (Worker worker: workers) {
            workQuality += worker.quality;
            res.offer(worker.quality);

            if (res.size() > k) workQuality -= res.poll();

            if (res.size() == k) minCost = Math.min(
                    minCost,
                    workQuality * ((double) worker.wage / worker.quality)
            );
        }

        return minCost;
    }

}

class Worker {
    int quality;
    int wage;

    public Worker(int quality, int wage) {
        this.quality = quality;
        this.wage = wage;
    }
}

public class minimum_cost_to_hire_k_workers {
    public static void main(String[] args) {
        Solution271 s = new Solution271();
        System.out.println(s.mincostToHireWorkers(new int[]{10, 20, 5}, new int[]{70, 50, 30}, 2));
    }
}
