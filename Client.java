import java.util.ArrayList;

public class Client {
    public static final int lastTile = 3; 
    public static ArrayList<Sheep> Entities = new ArrayList<Sheep>();

    public static void main (String[] args)  {
        int height = ScannerStuff.scanInt("Height of world: ");
        int width = ScannerStuff.scanInt("Width of world: ");
        int[][] World = generateWorld(height,width);

        Sheep mySheep = new Sheep(2,3);
        Entities.add(mySheep);
        
        System.out.printf("Height: %d  Width: %d\n",World.length,World[0].length);

        for (int i=0; i<5; i++) {
            System.out.print("Input: ");
            String INPUT = ScannerStuff.input.nextLine();
            switch (INPUT) {
                case "w":
                    mySheep.moveUp(1);
                    break;
                case "s":
                    mySheep.moveUp(-1);
                    break;
                case "d":
                    mySheep.moveRight(1);
                    break;
                case "a":
                    mySheep.moveRight(-1);
                    break;
            }
            drawWorld(World);
        }
	}


    private static int[][] generateWorld(int height, int width) {
        int[][] World = new int[height][width];
        for (int i=0; i<height; i++) {
            for (int j=0; j<width; j++) {
                World[i][j] = (int)(Math.random()*(Client.lastTile+1));
            }
        }
        return World;
    }
    private static void drawWorld(int[][] World) {
        for (int y=0; y < World.length; y++) {
            for (int x=0; x < World[0].length; x++) {
                String color = getColor(World[y][x]);
                String sheep = "　";
                if (checkForSheep(x, y))
                    sheep = "🐑";
                System.out.print(color+sheep+Color.RESET);
            }
            System.out.println();
        }
    }
    private static String getColor(int tileID) {
        switch (tileID) {
            case 0: //Sand
                return ""+Color.YELLOW_BACKGROUND;
            case 1: //Stone
                return ""+Color.BLACK_BACKGROUND;
            case 2: //Grass
                return ""+Color.GREEN_BACKGROUND;
            case 3: //Water
                return ""+Color.BLUE_BACKGROUND;
            default:
                return ""+Color.MAGENTA_UNDERLINED;
        }
    }
    private static boolean checkForSheep(int x, int y) {
        for (int i=0; i<Entities.size(); i++) {
            if (Entities.get(i).getX()==x && Entities.get(i).getY()==y)
                return true;
        }
        return false;
    }
}