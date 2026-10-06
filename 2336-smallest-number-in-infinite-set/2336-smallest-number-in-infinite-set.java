class SmallestInfiniteSet {
    PriorityQueue<Integer> minheap = new PriorityQueue<>();
    HashSet<Integer> set = new HashSet<>();
    int next = 1;
    public SmallestInfiniteSet() {
    }
    public int popSmallest() {
        if (!minheap.isEmpty()) {
            int num = minheap.poll();
            set.remove(num);
            return num;
        }
        return next++;
    }

    public void addBack(int num) {
        if (num < next && !set.contains(num)) {
            minheap.add(num);
            set.add(num);
        }
    }
}
