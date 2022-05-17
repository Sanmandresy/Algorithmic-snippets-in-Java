public class DnaStrand {
    public static String makeComplement(String dna) {
        char[] everyBase = dna.toCharArray();
        for(int i = 0; i < everyBase.length ; i++){
          switch(everyBase[i]){
              case 'A' -> everyBase[i] = 'T';
              case 'T' -> everyBase[i] = 'A';
              case 'C' -> everyBase[i] = 'G';
              case 'G' -> everyBase[i] = 'C';
          }
        } return String.valueOf(everyBase);
    }
  }