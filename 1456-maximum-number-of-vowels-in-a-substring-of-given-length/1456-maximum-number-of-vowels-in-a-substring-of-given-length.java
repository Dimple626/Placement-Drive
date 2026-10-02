class Solution {
    public int maxVowels(String s, int k) {
       int maxvowel=0;
       int windowvowel=0;
       Set<Character> vowels=new HashSet<>();
       vowels.add('a');
       vowels.add('e');
       vowels.add('i');
       vowels.add('o');
       vowels.add('u');
         for(int i=0;i<k;i++){
            if(vowels.contains(s.charAt(i))){
                windowvowel++;
            }
            maxvowel=windowvowel;
         }
         for(int  i=k;i<s.length();i++){
            if(vowels.contains(s.charAt(i))){
                windowvowel++;
            }
            if(vowels.contains(s.charAt(i-k))){
                windowvowel--;
            }
            maxvowel=Math.max(maxvowel,windowvowel);
         }
         return maxvowel;
    }
}