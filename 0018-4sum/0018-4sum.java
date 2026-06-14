class Solution {
    public List<List<Integer>> fourSum(int[] a, int target) {
        Set<List<Integer>> h = new HashSet<>();

        Arrays.sort(a);

        int n = a.length;

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {

                int k = j + 1;
                int l = n - 1;

                while (k < l) {

                    long sum = (long)a[i] + a[j] + a[k] + a[l];

                    if (sum == target) {
                        List<Integer> t = new ArrayList<>();
                        t.add(a[i]);
                        t.add(a[j]);
                        t.add(a[k]);
                        t.add(a[l]);

                        h.add(t);

                        k++;
                        l--;
                    }
                    else if (sum < target) {
                        k++;
                    }
                    else {
                        l--;
                    }
                }
            }
        }

        return new ArrayList<>(h);
    }
}