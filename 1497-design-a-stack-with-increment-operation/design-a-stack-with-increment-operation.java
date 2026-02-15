class CustomStack {
    int maxSize;
    ArrayList<Integer> stack;

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new ArrayList<>();
    }

    public void push(int x) {
        if (stack.size() < maxSize) {
            stack.add(x);
        }
    }

    public int pop() {
        if (stack.size() == 0) return -1;
        return stack.remove(stack.size() - 1);
    }

    public void increment(int k, int val) {
        int limit = Math.min(k, stack.size());

        for (int i = 0; i < limit; i++) {
            stack.set(i, stack.get(i) + val);
        }
    }
}
