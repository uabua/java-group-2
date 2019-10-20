package com.company;

public class EasyConverter implements Converter {
    @Override
    /*
    დაწერეთ პროგრამა, რომელიც ათობით რიცხვს გადაიყვანს ორობითში.
     */
    public void exerciseTen(int decimal) {
        System.out.println(String.format("ათობითი: %d\nორობითი: %s", decimal, Integer.toBinaryString(decimal)));
    }

    @Override
    /*
    დაწერეთ პროგრამა, რომელიც ორობით რიცხვს გადაიყვანს ათობითში.
     */
    public void exerciseEleven(int binary) {
        System.out.println(String.format("ორობითი: %d\nათობითი: %d", binary,
                Integer.parseInt(String.format("%d", binary), 2)));
    }
}
