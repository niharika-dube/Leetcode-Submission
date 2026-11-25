class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n =s.length();

        for(int l=1; l<=n/2; l++){
            if(n%1==0){
                String sub =s.substring(0,l);
                StringBuilder sb = new StringBuilder();

                int repeats=n/l;
                for(int i=0; i< repeats; i++){
                    sb.append(sub);
                }
                if(sb.toString().equals(s)){
                    return true;
                }
            }
        }
        return false;
    }
}