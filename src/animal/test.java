package animal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
       Cat c1=new Cat(11,"花花",true,11);
        Cat c2=new Cat(12,"草草",false,12);

        Dog d1=new Dog(11,"狗一",false,13);
        LocalDate dd1=LocalDate.of(2023,9,26);
        LocalDate dd2=LocalDate.of(2023,8,26);



        Customer cu1=new Customer("华强",33,dd1);
        Customer cu2=new Customer("撒日朗",33,dd2);



        MyAnimalShop mine=new MyAnimalShop(200,true);

        ArrayList list1=new ArrayList<Animal>();
        list1.add(c1); list1.add(c2); list1.add(d1);

        mine.setList1(list1);



    }


}
