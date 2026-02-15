        public class FindMaxEle {

            public static void main(String arg[]) {

                int arr[] = { 3, 7, 2, 9, 5};
                System.out.println(maxEle(arr));
            }

            public static int maxEle(int arr[]) {

                int largest = arr[0];

                for (int i = 0; i < arr.length; i++) {
                    if (largest <= arr[i]) {
                        largest = arr[i];
                    }

                }
                return largest;

            }

        }