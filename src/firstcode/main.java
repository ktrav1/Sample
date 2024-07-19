package firstcode;

public class main {

    public static void main(String[] args) {
        int[] boo = {0,1,2,3,4};
        int n = 5;
        System.out.println("The total number of even numbers in boo are "+evencount(boo,n));

        int m = 100;
        int[] bar = new int[100];
        for(int i =0; i<100; i++){
            bar[i]=i;
        }
        System.out.println("The total number of even numbers in bar are "+evencount(bar,m));
    }

    static int evencount(int arr[], int size){
        int count = 0;
        for(int i=0;i<size;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }
}
