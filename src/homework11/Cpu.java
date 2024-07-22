package homework11;

public class Cpu {

    String name;
    int frequency;

    public Cpu(String name, int frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    public void getAll() {
        System.out.println(name +" "+ frequency);
    }
}
