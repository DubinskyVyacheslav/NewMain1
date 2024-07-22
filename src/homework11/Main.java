package homework11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Constant constant = new Constant();

        Cpu cpu1 = new Cpu(constant.getName(), random.nextInt(3000));
        Cpu cpu2 = new Cpu(constant.getName(), random.nextInt(3000));
        Cpu cpu3 = new Cpu(constant.getName(), random.nextInt(3000));
        Cpu cpu4 = new Cpu(constant.getName(), random.nextInt(3000));
        Cpu cpu5 = new Cpu(constant.getName(), random.nextInt(3000));
        Cpu cpu6 = new Cpu(constant.getName(), random.nextInt(3000));
        Cpu cpu7 = new Cpu(constant.getName(), random.nextInt(3000));
        Cpu cpu8 = new Cpu(constant.getName(), random.nextInt(3000));
        Cpu cpu9 = new Cpu(constant.getName(), random.nextInt(3000));
        Cpu cpu10 = new Cpu(constant.getName(), random.nextInt(3000));

        ArrayList<Cpu> cpuList = new ArrayList<>();
        cpuList.add(cpu1);
        cpuList.add(cpu2);
        cpuList.add(cpu3);
        cpuList.add(cpu4);
        cpuList.add(cpu5);
        cpuList.add(cpu6);
        cpuList.add(cpu7);
        cpuList.add(cpu8);
        cpuList.add(cpu9);
        cpuList.add(cpu10);


//        Comparator<ArrayList<Cpu>> comparator =  (Cpu o1, Cpu o2) -> Integer.max(o1.frequency, o2.frequency);

        cpuList.stream()
                .sorted(new MyComparator())
                .filter(x->x.frequency>300)
                .skip(1)
//                .map(x->x.frequency+=11)
//                .map(x->x.name+=" !!")
                .forEach(x-> System.out.println(x.name+" "+x.frequency));

    }
}
class MyComparator implements Comparator<Cpu>{
    public int compare(Cpu a, Cpu b){
        return a.frequency-b.frequency;
    }
}
