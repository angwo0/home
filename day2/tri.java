package day2;

public class tri {
    public static void main(String[] args) {

        // 출력
    /*
    높이 : [3]

    *
    **
    ***


    */
        System.out.println("=== 높이 3 ===");
    for (int i = 1; i <= 3; i++) {
        for (int j = 0; j < i; j++) {
            System.out.printf("*");
        }
        System.out.println();
    }
    /*

    높이 : [5]

    *
    **
    ***
    ****
    *****

    */
        System.out.println("=== 높이 5 ===");
    for (int i = 1; i <= 5; i++) {
        for (int j = 0; j < i; j++) {
            System.out.printf("*");
        }
        System.out.println();
    }
    /*

    높이 : [7]

    *
    **
    ***
    ****
    *****
    ******
    *******

    */
        System.out.println("=== 높이 7 ===");
        for (int i = 1; i < 8; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
