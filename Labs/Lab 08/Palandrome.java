public class Palandrome {
    public static boolean pal(String str,int left, int right){
        if(left==right){
            return true;
        }
        if(str.charAt(left)!=str.charAt(right)){
        return false;
        }
        return pal(str, left+1,right-1);

    }
 public static void main(String[] args) {
        Palandrome pp=new Palandrome();
        String str="madam";
        System.out.println(pal(str,0, str.length()-1));
        
    
}
}