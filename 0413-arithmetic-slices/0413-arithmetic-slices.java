class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int cnt=0;
        int n=nums.length;
        for(int start=0;start<=n-3;start++){
            ArrayList<Integer> list=new ArrayList<>();
            for(int end=start;end<n;end++){
                list.add(nums[end]);
                if(list.size()>=3){
                    int diff=list.get(0)-list.get(1);
                    for(int i=1;i<list.size();i++){
                        if(diff!=list.get(i-1)-list.get(i)){
                            break;
                        }else if(i==list.size()-1) cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}