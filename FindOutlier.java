public class FindOutlier{
    static boolean isEven(int n){
      if(n % 2 == 0) return true;
      return false;
    }
  
    static int[] oddRes = new int[1];
    static int[] evenRes = new int[1];
    static int even = 0, odd = 0;

    public static int find(int[] integers){
        for(int x : integers){
            if(isEven(x)){
                even++;
            }
            else odd++;
        }
        if(even > odd){
            for(int a : integers){
                if(a % 2 != 0){
                    oddRes[0] = a;
                }
            } return oddRes[0];
        }
        else if(even < odd){
            for(int a : integers){
                if(a % 2 == 0){
                    evenRes[0] = a;
                }
            } return evenRes[0];
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] exampleTest1 = {2,6,8,-10,3}; 
        int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781}; 
        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
        int[] exampleTest4 = {7,5,3,2,9};

        System.out.println(find(exampleTest1));
        System.out.println(find(exampleTest2));
        System.out.println(find(exampleTest3));
        System.out.println(find(exampleTest4));
    }
}