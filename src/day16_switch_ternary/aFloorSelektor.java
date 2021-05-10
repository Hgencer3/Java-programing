package day16_switch_ternary;

public class aFloorSelektor {
    public static void main(String[] args) {
        int floorNum = 3;

        if (floorNum == 1) {
            System.out.println("Floor 1 selected. Companies: Lobby, Starbucs");
        } else if (floorNum == 2) {
            System.out.println("Floor 2 selected. Companies: Cybertek, Intelsat");
        } else if (floorNum == 3) {
            System.out.println("Floor 3 selected. Companies: Lyft, BofA");
        } else {
            System.out.println("Invalid Floor " + floorNum);
        }
        floorNum = 2;

        switch (floorNum) {
            case 1:
                System.out.println("Floor 1 selected. Companies: Lobby, Starbucs");
                break;
            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek, Intelsat");
                break;
            case 3:
                System.out.println("Floor 3 selected. Companies: Lyft, BofA");
                break;
            default:
                System.out.println("Invalid Floor " + floorNum);
                break;

        }
    }
}
