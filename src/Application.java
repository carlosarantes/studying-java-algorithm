import java.util.*;

public class Application {

    public static void main(String[] args) {
/*
        int[] test0 = {1, 2, 3, 15, 1, 2, 2, 3, 2, 5, 1};
        int[] test1 = {1, 2, 10, 3, 15, 1, 2, 2};
        int[] test2 = {5, 2, 10, 3, 15, 1, 2, 2};
        int[] test3 = {1, 2, 10, 3, 15, 16, 2, 2};
        int[] test4 = {3, 2, 18, 1, 0, 3, -11, 1, 3};
        int[] test5 = {2, 3, 1, 1, 18};
        int[] test6 = {8, 2, 1, 1, 18, 3, 5};
        int[] test7 = {3, 3, 3, 3, 3, 3};
        int[] test8 = {1};
        int[] test9 = {};

        System.out.println(isMercurial(test9));
        */

        int[] test1 = {1, 3, 9, 27};
        int[] test2 = {1, 3, 200, 500};
        int[] test3 = {1};
        int[] test4 = {1, 3, 9, 26};
        int[] test5 = {1, 3, 7, 26};
        int[] test6 = {1, 3, 8, 26};

        System.out.println(isRapidlyIncreasing(test6));

    }

    static int isMercurial(int[] array) {
        List positionOcurrencesOnce = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 1) {
                positionOcurrencesOnce.add(i);
            }
        }

        if (positionOcurrencesOnce.size() <= 1) return 1;

        int arrIsMercurial = 1;
        boolean finish = false;
        int shift = 0;
        do {
            int firstPosition = Integer.parseInt(positionOcurrencesOnce.get(shift).toString());
            int finalPosition = Integer.parseInt(positionOcurrencesOnce.get(shift + 1).toString());
            for (int i = firstPosition+1; i < finalPosition; i++) {
                if (array[i] == 3) {
                    arrIsMercurial = 0;
                    finish = true;
                    break;
                }
            }

            if(finish) {
                break;
            }

            shift++;
        } while (shift < positionOcurrencesOnce.size()-1);

        return arrIsMercurial;
    }



    static int isRapidlyIncreasing(int[] a) {
        if (a.length == 0) return 0;

        if (a.length == 1) return 1;

        int arrRapidlyIncreading = 0;
        for (int i = 1; i < a.length; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += a[j];
            }
            sum *= 2;

            if(a[i] > sum) {
                arrRapidlyIncreading = 1;
            } else {
                arrRapidlyIncreading = 0;
                break;
            }
        }

        return arrRapidlyIncreading;
    }





}

