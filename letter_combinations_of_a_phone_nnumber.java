class Solution {
    public List<String> letterCombinations(String digits) {
        String[] alpha = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        return combi("",digits,alpha);
    }
    List<String> combi(String process, String digits,String[] alpha){

        if(digits.isEmpty()){
            List<String> ans = new ArrayList<>();
            if(!process.isEmpty())
            ans.add(process);
            return ans;
        }

        List<String> res = new ArrayList<>();
        int digit = digits.charAt(0) - '0';
        String str = alpha[digit-2];
        
          for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            res.addAll(combi(process+c,digits.substring(1),alpha));
        } 
       
        
        return res;
    }
}
