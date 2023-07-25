package demos;

public class Condition {
    public static void main(String[] args) {
        // if
        if (3 > 2){
            System.out.println("3 est supérieur à 2 ! ! !");
        }

        if (3 > 2) System.out.println(" 3 est supérieur à 2 ! ! ! ");

        double note = 12.5;

        // if else if else
        if (note >= 16) {
            System.out.println("très bien");
        } else if (note >= 14){
            System.out.println("bien");
        } else if (note >= 12) {
            System.out.println("assez bien");
        } else {
            System.out.println("Nul");
        }

        System.out.println("1-dire bonjour");
        System.out.println("2-dire au revoir");
        System.out.println("3-dire bonne nuit");

        int choix = 2;

        switch (choix) {
            case 1:
                System.out.println("bonjour !!!");
                break;
            case 2:
                System.out.println("au revoir !!!");
                break;
            case 3:
                System.out.println("bonne nuit");
                break;
            default:
                System.out.println("je n'ai pas compris votre choix");
                break;
        }
        switch (choix) {
            case 1 -> System.out.println("bonjour !!!");
            case 2 -> System.out.println("au revoir !!!");
            case 3 -> System.out.println("bonne nuit");
            default -> System.out.println("je n'ai pas compris votre choix");
        }

    }
}
