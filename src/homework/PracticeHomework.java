package homework;

public class PracticeHomework {

    //փոխակերպել տրված րոպեն վայրկյանի ու վերադարձնել

    long convert(int minutes) {
        return (long) minutes * 60;
    }

    //ընդունել տարին, վերադարձնել օրերի քանակը։

    int calcAge(int years) {
        return years * 366;
    }

    //վերադարձնել տրված թվի հաջորդ թիվը

    int nextNumber(int number) {
        return ++number;
    }

    //վերադարձնել true եթե տրված a և b թվերը իրար հավասար են, եթե ոչ՝ false

    boolean isSameNum(int a, int b) {
        return a == b;
//        if (a == b) {
//            return true;
//        }
//        return false;

    }

    //վերադարձնել true-եթե թիվը փոքր կամ հավասար է 0-ին։
//մնացած դեպքերում վերադարձնել false

    boolean lessThanOrEqualToZero(int number) {
        return number <= 0;
//        if (number <= 0) {
//            return true;
//        } else {
//            return false;
//        }
    }

    //վերադարձնել ընդունող բուլյանի ժխտված արժեքը։

    boolean reverseBool(boolean value) {

        return !value;
    }

    //վերադարձնել երկու մասիվի ամենամեծ length-ը

    int maxLength(int[] array1, int[] array2) {
        return array1.length > array2.length ? array1.length : array2.length;
    }
//        if (array1.length > array2.length) {
//            return array1.length;
//        } else {
//            return array2.length;
//        }
//    }
}
