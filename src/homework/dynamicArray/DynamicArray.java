package homework.dynamicArray;

public class DynamicArray {

    int[] array = new int[10];
    int size = 0;

    public void add(int value) {
        if (size == array.length) {
            increaseArray();
        }
        array[size++] = value;
    }

    private void increaseArray() {
        int[] temp = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }


    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

    }

    //Գրել մեթոդ isEmpty անունով, որը կվերադարձնի true եթե մեր dynamicArray-ի մեջ չունենանք ոչ մի էլեմենտ. Եթե ունենք՝ false

    //Գրել մեթոդ getByIndex անունով, որը կընդունի ինդեքս, և կվերադարձնի այդ ինդեքսի տակ ընկած թիվը, եթե չկա թող վերադարձնի 0;
    public int getByIndex(int i) {
        if (i > array.length) {
            return 0;
        } else
            return array[i];
    }
//Գրել մեթոդ getFirstIndexByValue, որը կընդունի int value, և
// եթե մեր մասիվի մեջ ունենք այդ թվից, կվերադարձնի իր ինդեքսը. եթե շատ ունենք, պետք է վերադարձնել առաջինի ինդեքսը

    public int getFirstIndexByValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                return i;
            }
        }
        return 0;
    }
//Գրել մեթոդ set անունով, որը կընդունի int index, int value և վալյուն կդնի տրված ինդեքսի տեղը(կփոխարինի էղած արժեքին).

    public void set(int index, int value) {
        for (int i = 0; i < array.length; i++) {
            i = index;
            array[i] = value;
        }
        System.out.println(array);


    }
//Գրել մեթոդ add(int index, int value) որը տրված վելյուն կդնի տրված ինդեքսի տեղը, իսկ էղած թիվը ու կողքի բոլոր թվերը կտանի աջ, ոչ մի թիվ չի կորի

    public void add(int index, int value) {
        for (int i = 0; i < array.length; i++) {
            if (index == i) {
                array[i] = value;
            }
        }
        increaseArray();

    }

//Գրել մեթոդ delete(int index) որ տանք ինդեքսը, այդ ինդեքսի տակ գտնվող թիվը հեռացնի մասիվից. (նոր մասիվ պետք չէ սարքել)

}
