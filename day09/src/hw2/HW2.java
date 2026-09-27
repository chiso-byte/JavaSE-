package hw2;

public class HW2 {
    public static void main(String[] args) {
        Phone[] phones = new Phone[3];
        Phone phone1 = new Phone("华为", 6999, "红色");
        Phone phone2 = new Phone("vivo", 4000, "黑色");
        Phone phone3 = new Phone("苹果", 12999, "绿色");
        phones[0] = phone1;
        phones[1] = phone2;
        phones[2] = phone3;
        int sum = 0;
        for (int i = 0; i < phones.length; i++) {
            Phone phone = phones[i];
            sum += phone.getPrice();
        }
        int avg = sum / phones.length;
        System.out.println(avg);
    }
}
