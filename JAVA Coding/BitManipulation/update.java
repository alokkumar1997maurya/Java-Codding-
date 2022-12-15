public class update {

    public static int getTheValue(int number, int i) {
        int bitMask = 1 << i ;
        if((number & bitMask ) == 0  ) {
            return 0;
        }else{
            return 1;
        }
    }

        public static int setTheValue(int number, int i) {
            int bitMask = 1 << i ;
           return number | bitMask;
        
    }
    public static int  clearBitGivenPosion(int number, int i) {
        int bitMask = ~(1<<i);
    
        return number & bitMask;
    }

    public static int  setTheValueGivenPosition(int number, int i, int setBit) {
            if(getTheValue(number, i)!=setBit){
                return setTheValue(number, i);
            }else {
                return clearBitGivenPosion(number, i);
            }

    }
    public static void main(String[] args) {
        System.out.println(setTheValueGivenPosition(4, 0, 1));
    }
}
