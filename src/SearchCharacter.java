public class SearchCharacter {
    public static void main(String[] args){
        String str = "shaik";
        char target = 'i';
        System.out.println(searchCharacter(str, target));
    }

    public static int searchCharacter(String element,char target){
        for(int i = 0; i < element.length(); i++){
            if(target == element.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}