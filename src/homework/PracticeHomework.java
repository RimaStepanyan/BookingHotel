package homework;

public class PracticeHomework {

    //փոխակերպել տրված րոպեն վայրկյանի ու վերադարձնել

    long convert(int minutes) {
        int seconds = minutes * 60;
        return seconds;
    }

    //ընդունել տարին, վերադարձնել օրերի քանակը։

    int calcAge(int years) {
        int days = years * 365;
        return days;
    }

    //վերադարձնել տրված թվի հաջորդ թիվը

    int nextNumber(int number) {
        int nextNum = number + 1;
        return nextNum;
    }

    //վերադարձնել true եթե տրված a և b թվերը իրար հավասար են, եթե ոչ՝ false

    boolean isSameNum(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    //վերադարձնել true-եթե թիվը փոքր կամ հավասար է 0-ին։
//մնացած դեպքերում վերադարձնել false

    boolean lessThanOrEqualToZero(int number) {
        if (number <= 0) {
            return true;
        } else {
            return false;
        }
    }

    //վերադարձնել ընդունող բուլյանի ժխտված արժեքը։

    boolean reverseBool(boolean value) {

        return !value;
    }

    //վերադարձնել երկու մասիվի ամենամեծ length-ը

    int maxLength(int[] array1, int[] array2) {
        if (array1.length > array2.length) {
            return array1.length;
        } else {
            return array2.length;
        }
    }
}
