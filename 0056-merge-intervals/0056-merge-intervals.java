class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int[] row : intervals) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int num : row) {
                temp.add(num);
            }
            list.add(temp);
        }
        for (int i = 1; i < list.size(); i++) {
          if (list.get(i - 1).get(1)  >= list.get(i).get(0)) {
                    list.get(i - 1).set(0, Math.min(list.get(i).get(0),list.get(i-1).get(0)));
                   list.get(i - 1).set(1, Math.max(list.get(i).get(1),list.get(i-1).get(1)));
                list.remove(i);
                i--;
            }
        }
        int n = list.size();
        int m = list.get(0).size();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = list.get(i).get(j);
            }
        }
      return arr;
    }
}