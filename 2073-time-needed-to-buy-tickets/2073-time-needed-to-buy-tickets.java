class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {

        Queue<Integer> q = new LinkedList<>();

        // Put all person's indexes into queue
        for(int i = 0; i < tickets.length; i++) {
            q.add(i);
        }

        int time = 0;

        while(true) {

            // Take person from front
            int person = q.remove();

            // They buy 1 ticket
            tickets[person]--;
            time++;

            // If this was person k and they finished
            if(person == k && tickets[person] == 0) {
                return time;
            }
            if(tickets[person] > 0) {
                q.add(person);
            }
        }
    }
}
