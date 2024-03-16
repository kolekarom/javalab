class recursssion {
    public static void mathod1(int n){
        int x = 1;
        if(n>0){
            System.out.println(n);
            mathod1(n-1);

           // System.out.println(n);

            

        }
    }
    public static void mathod2(int n){
        System.out.println((n));
    }
    public static void main(String[] args){
        mathod1(7);
        //mathod2(7);
    }

}
