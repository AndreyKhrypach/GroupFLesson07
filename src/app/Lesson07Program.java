package app;


import java.util.Arrays;
import java.util.Random;

public class Lesson07Program {

    public static void main(String[] args) {
        Random random = new Random();

        int[] arr = new int[16];
        // 0, 0, 0, 0
        // 0, 0, 0, 0
        // 0, 0, 0, 0
        // 0, 0, 0, 0

        for (int index = 0; index < arr.length; index++) {
            if (index % 4 == 0 && index > 0)
                System.out.println();
            System.out.print(arr[index] + " ");
        }

        //to do with %2 == 0
//        int[] arr = new int[20];
//        int temp = 0;
//        for (int i = 0; i < arr.length; i++) {
//            temp += 2;
//            arr[i] = temp;
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(arr));

//        byte[] byteArr = new byte[5];
//        short[] shortArr = new short[5];
//        char[] charsArr = new char[5];
//        int[] intArr = new int[5];
//        long[] longArr = new long[5];
//        float[] floatArr = new float[5];
//        double[] doubleArr = new double[5];
//        boolean[] boolArr = new boolean[5];
//        String[] strArr = new String[5];

        //add new element to array
//        int addPupils = 2;
//        int[] arrInt = new int[5];
//        for (int i = 0; i < arrInt.length; i++) {
//            arrInt[i] = i + 1;
//        }
//        int[] arrInt2 = new int[8];
//        for (int index = 0; index < arrInt.length; index++) {
//            arrInt2[index] = arrInt[index];
//        }
//        arrInt2[5] = 6;
//        arrInt2[6] = 7;
//        System.out.println(Arrays.toString(arrInt2));
//        for (int index = 0; index < arrInt.length + addPupils; index++) {
//            System.out.print(arrInt2[index] + " ");
//        }

//        int[] arr = new int[5];
//        arr[0] = random.nextInt(10);
//        arr[1] = random.nextInt(10);
//        arr[2] = random.nextInt(10);
//        arr[3] = random.nextInt(10);
//        arr[4] = random.nextInt(10);
//        System.out.println(Arrays.toString(arr));

//        int[] manualArray2 = {2, 1, 3, 4, 5, 0, 8, 7};

//        int[] manualArray = new int[]{3, 5, 8, 1, 0, 4, 5, 6, 2, 2, 1, 2,};
//        System.out.println(manualArray.length);
//        int sum = 0;
//        for (int element :
//                manualArray){
//            System.out.print(element + " ");
//            sum += element;
//        }
//        System.out.println();
//        System.out.println(sum);


//        int[] arrayInt = new int[random.nextInt(10) + 1];
//        System.out.println(arrayInt.length);
//        for (int index = 0; index < arrayInt.length; index++) {
//            System.out.print(arrayInt[index] + " ");
//        }
//        for (int index = 0; index < arrayInt.length; index++) {
//            arrayInt[index] = random.nextInt(10);
//        }
//        System.out.println();
//        System.out.println("____________________________");
//        System.out.println(Arrays.toString(arrayInt));
    }

}

