package test.Fourth;

public class Rectangle extends Shape {

    EnumColor[] enumColors = EnumColor.values();

    @Override
    public void draw() {
        System.out.println("▬");

    }

    public void draw(String color) {
        try {
            int i = Integer.parseInt(color.trim());
            System.out.println("\u001b[38;5;" + color + "m" + "▬" + enumColors[0].getCodColor());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

//        System.out.println(enumColors[designationСolor(color)].getCodColor()+"▬"+enumColors[0].getCodColor());
    }

    public void draw(int quantity) {
        for (int i = 0; i < quantity; i++) {
            System.out.println("▬");
        }
    }

    public void draw(int quantity, String color) {
        for (int i = 0; i < quantity; i++) {
            System.out.println("\u001b[38;5;" + color + "m" + "▬" + enumColors[0].getCodColor());
        }
    }

//    private int designationСolor(String colorSecond){
//        EnumColor enumColor123 = EnumColor.valueOf(colorSecond.toUpperCase());
//        int count = 0;
//        for (int i = 0; i <enumColors.length; i++) {
//            if (enumColor123==enumColors[i]){
//                count=i;
//                break;
//            }
//
//        }
//
//
//        return count;
//    }

}
