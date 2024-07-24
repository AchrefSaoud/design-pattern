package flightweight;

class ParticleType implements Particle {
    private final String color;
    private final String sprite;

    public ParticleType(String color, String sprite) {
        this.color = color;
        this.sprite = sprite;
    }

    @Override
    public void render(int x, int y, int vector, int speed) {
        // Render particle using intrinsic (color, sprite) and extrinsic state (x, y, vector, speed)
        System.out.println("Rendering particle at (" + x + ", " + y + ") with vector " + vector +  ", speed " + speed + ", color " + color + ", sprite " + sprite);
    }
}
