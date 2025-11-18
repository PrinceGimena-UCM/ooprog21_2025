public class Average {
    public static int Average(int[] arr) {
        int count = 0;
        int sum = arr[0];   

        for(int i = 1; i < arr.length; i++) {
            double average = sum / (double)i;  

            if(arr[i] > average) {
                count++;
            }

            sum += arr[i];  
        }
        return count;
    }

    public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300};
        System.out.println(Average(responseTimes)); 
    }
}
