class Solution {
    public static boolean winnerOfGame(String colors) {
        if(colors.length() <= 2){
            return false;
        }
        int Acount = 0;
        int Bcount = 0;
        for(int i = 0; i < colors.length()-2;i++){
            if(colors.charAt(i) == colors.charAt(i+1) && colors.charAt(i+1) == colors.charAt(i+2) && colors.charAt(i) == 'A'){
                Acount++;
            }
            if(colors.charAt(i) == colors.charAt(i+1) && colors.charAt(i+1) == colors.charAt(i+2) && colors.charAt(i) == 'B'){
                Bcount++;
            }
        }
        return Acount > Bcount;
    }
    public static void main(String[] args) {
        String colors = "ABBBBBBBAAA";
      System.out.println(winnerOfGame(colors));
  }
}