class AveragePositives{
    public static void main(String[] args){
        if(args.length==0){System.out.println(0);}
        double sum =0;
        if(args.length>=1){
            for(int i=0;i<args.length;i++){
                sum = sum+Double.parseDouble(args[i]);
            }
            double average = sum/args.length;
            System.out.println(average);
        }
    }
}