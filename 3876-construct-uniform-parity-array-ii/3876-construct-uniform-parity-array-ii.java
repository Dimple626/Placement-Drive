class Solution {
    public boolean uniformArray(int[] nums1) {
        int oddno=Integer.MAX_VALUE;
        int evenno=Integer.MAX_VALUE;
        for(int num:nums1){
            if(num%2==1){
                oddno=Math.min(oddno,num);
            }else{
                evenno=Math.min(evenno,num);
            }
        }
       return oddno < evenno || oddno == Integer.MAX_VALUE;
       
        

        }
    }
