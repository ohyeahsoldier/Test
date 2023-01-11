
public class Sheep {
    private int x;
    private int y;
    private int age;
    
    Sheep(int x, int y) {
        this.x = x;
        this.y = y;
        this.age = (int)(Math.random()*5);
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public int getAge() { return age; }
    /**
     * @param x this.x += x
     */
    public void moveRight(int x) {
        this.x += x;
    }
    /**
     * @param y this.y -= y //Due to the 2d array, index 0 is the top and index 5 is 5 from the top
     */
    public void moveUp(int y) {
        this.y -= y;
    }
}
