class Solution {
    public int rotatedDigits(int n) {
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(isrotate(i)){
                cnt++;
            }
        }
        return cnt;
    }
    private boolean isrotate(int num){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(4);
        int n=num;
        boolean flag=false;
        while(num>0){
            int rem=num%10;
            if(list.contains(rem)) return false;
            if(rem==2||rem==5||rem==6||rem==9) flag=true;
            num=num/10;
        }
        return flag==true;
    }
}