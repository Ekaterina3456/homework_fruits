package homework;

import java.util.ArrayList;

public class Box<T extends Fruit>{

    protected ArrayList<T> fructs;

    private int quantity;

    public double getWeightOfBox() {
        double weight = 0;
        for (Fruit fruit : fructs) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public int size () {
        return this.fructs.size();
    }

    public Box() {
        this.fructs = new ArrayList<>();
    }


    public void addFruit (T fruct) {
        fructs.add(fruct);
        quantity = quantity + 1;
    }


    public boolean compare (Box<?> box) {
        return (this.getWeightOfBox() - box.getWeightOfBox()) == 0;
    }

    public Fruit get (int i) {
        return fructs.get(0);
    }

    public boolean isFructsDifferent (Box<?> box1) {
        return box1.get(0).getClass() == this.get(0).getClass();
    }

    public void removeFructs (Box<T> box) {
        if (box.size() > 0) {
            if (isFructsDifferent(box)){
                for (T fruct : fructs) {
                    box.addFruit(fruct);
                }
                fructs.clear();
                System.out.println("Фрукты были переложены в другую коробку");
            } else {
                System.out.println("В этой коробке уже лежат фрукты другого типа");
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Количество фруктов в коробке: %d; Вес коробки: %.2f", quantity, getWeightOfBox());
    }
}
