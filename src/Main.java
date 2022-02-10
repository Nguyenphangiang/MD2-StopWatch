public class Main {
    public static void main(String[] args) {
        StopWatch watch1 = new StopWatch();
        watch1.setTime();
        watch1.start();
        double[] arr= new double[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random()*100000;
        }
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            double temp = arr[minIndex];
            arr[minIndex]= arr[i];
            arr[i]=temp;
        };
        System.out.println("End selection sort!");
        watch1.end();
        System.out.println("Thời gian thực thi thuật toán(millis): " + watch1.getElapsedTime());
    }
}
