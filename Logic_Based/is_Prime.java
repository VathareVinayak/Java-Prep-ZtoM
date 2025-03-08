class is_Prime {
    public static void main(String[] args){
        int num = 6;
        boolean isPrime = true;

        if(num <= 1){
            isPrime = false;
        }
        else{
            for(int i = 2; i * i <= num ; i++)
            {
                if(num % i == 0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime){
            System.out.println(num + " The Number is prime ");
        }
        else{
            System.out.println(num + " The Number is NOT Prime ");
        }
    }

}
// o(n) = Time Complexity
// o(root n) = time complexity
