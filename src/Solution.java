class Solution {
    public static void main(String[] args){

        System.out.println(areAlmostEqual("bank", "kanb"));
    }
    public static boolean areAlmostEqual(String s1, String s2) {

        String rev = "";
        if(s1.equals(s2)){
            return true;
        }
        for(int i = s2.length()-1; i>=0; i--){
            rev = rev+ s2.charAt(i);
        }
        if(s2.charAt(0) == rev.charAt(rev.length() -1) && s2.charAt(s1.length()-1) == rev.charAt(0)){
            return true;
        }
        System.out.println(rev);
        if(rev.contains(s1)){
            return true;
        }
        return false;
    }
}