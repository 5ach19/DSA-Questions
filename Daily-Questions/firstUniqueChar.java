public class firstUniqueChar {

    public int firstUniqChar(String s) {
        //create a new array 
      int[] count = new int [26];
      char []ch = s.toCharArray();  

      for (char c : ch){
       count[c-'a']++; // update frequency on index
      }
      int n = s.length();

      for(int i = 0; i < n ; i++){
          if(count[ch[i] - 'a'] ==1) return i;
      }
      return-1;
  }
    
}
