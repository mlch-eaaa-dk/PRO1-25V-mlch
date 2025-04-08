package ex3;

import java.util.ArrayList;

public class Person {
    private final String name;
    private int age;

    // association Person --> 0..* Gift
    private final ArrayList<Gift> giftsReceived = new ArrayList<>();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Person(%s,%d)", name, age);
    }

    public ArrayList<Gift> getGiftsReceived() {
        return giftsReceived;
    }

    public void addGift(Gift gift) {
        giftsReceived.add(gift);
    }

    public void removeGift(Gift gift) {
        giftsReceived.remove(gift);
    }

    public int giftsValue() {
        int value = 0;
        for (Gift gift : giftsReceived) {
            value += gift.getPrice();
        }
        return value;
    }

    public ArrayList<Person> giftGivers() {
        ArrayList<Person> givers = new ArrayList<>();
        for (Gift gift : giftsReceived) {
            Person giver = gift.getGiver();
            if (!givers.contains(giver))
                givers.add(giver);
        }
        return givers;
    }
}
