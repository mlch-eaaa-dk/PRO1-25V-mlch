package ex3;

public class Ex3Test {

    public static void main(String[] args) {
        Person jens = new Person("Jens", 45);
        Person ulla = new Person("Ulla", 40);

        Person august = new Person("August", 2);
        Person sebastian = new Person("Sebastian", 5);

        Gift fireTruck = new Gift("FireTruck", 300, jens); // link Gift -> Person(giver)
        august.addGift(fireTruck); // link Person(receiver) -> Gift

        Gift duplo = new Gift("Duplo", 300, jens); // link Gift -> Person(giver)
        august.addGift(duplo); // link Person(receiver) -> Gift

        Gift tools = new Gift("Tools", 500, jens); // link Gift -> Person(giver)
        sebastian.addGift(tools); // link Person(receiver) -> Gift

        Gift monsterTruck = new Gift("MonsterTruck", 400, ulla); // link Gift -> Person(giver)
        august.addGift(monsterTruck); // link Person(receiver) -> Gift

        Gift lego = new Gift("Lego", 450, ulla); // link Gift -> Person(giver)
        sebastian.addGift(lego); // link Person(receiver) -> Gift

        System.out.println(august.getName() + "'s gifts: " + august.getGiftsReceived());
        System.out.println(sebastian.getName() + "'s gifts: " + sebastian.getGiftsReceived());
        System.out.println();

        System.out.printf("Total value of %s's gifts: kr %d\n",
                august.getName(), august.giftsValue()
        );
        System.out.printf("Total value of %s's gifts: kr %d\n",
                sebastian.getName(), sebastian.giftsValue()
        );
        System.out.println();

        System.out.printf("Givers of %s's gifts: %s\n",
                august.getName(), august.giftGivers()
        );
        System.out.printf("Givers of %s's gifts: %s\n",
                sebastian.getName(), sebastian.giftGivers());
        System.out.println();
    }
}
