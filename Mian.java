class SolutionLeet {
    public static boolean isPowerOfTwo(int n) {
        boolean g = false;
        int result = (int)(Math.log(n) / Math.log(2));
        for(int i=0;i<=result;i++){
            if(n==(Math.pow(2,i))){
                g=true;
                break;
            }
            else{
                g=false;
            }
        }
        return g;
    }
    public static void main(String ar[]){
        Scanner  h = new Scanner(System.in);
        int j = h.nextInt();
        boolean l = Solution.isPowerOfTwo(j);
        System.out.println(l);

    }
}