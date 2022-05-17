public class Maskify {
    public static String maskify(String str) {
       char[] everyChar = str.toCharArray();
        var newStr = "";
      for(int i = 0 ; i <(everyChar.length-4); i++ ){
          everyChar[i] = '#';
      }
      for(char letter : everyChar){
        newStr += letter;
      } return newStr;
    }
}
