//hdsuivf
public class Player {
    private Rectangle[] rectangles;

    public void render(GameArena arena) {

        int i = 0;
        for (i = 0; i < rectangles.length; i++) {
            arena.addRectangle(rectangles[i]);
        }
    }

    public void move(double dx, double dy) {
        
        for (int i = 0; i < rectangles.length; i++) {
            rectangles[i].setXPosition(rectangles[i].getXPosition() + dx);
            rectangles[i].setYPosition(rectangles[i].getYPosition() + dy);
        }
    }

    public Player(GameArena arena) {
        rectangles = new Rectangle[2];
        rectangles[0] = new Rectangle(200, 480, 30, 50, "RED");
        rectangles[1] = new Rectangle(205, 485, 20, 40, "ORANGE");

        render(arena);

    }

}