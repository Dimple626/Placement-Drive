public class Solution extends GuessGame {
    public int guessNumber(int n) {
       int start=1,end=n;
       while(start<=end){
         int mid=start+(end-start)/2;
           int res=guess(mid);
        if (res == 0) {
                return mid;         //  found the number
            } else if (res < 0) {
                end = mid - 1;      // my guess is too high
            } else {
                start = mid + 1;    //  my guess is too low
            }
        }
       
       return -1;
    }
}