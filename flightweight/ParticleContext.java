package flightweight;

public class ParticleContext {
    private final int x;
    private final int y;
    private final int vector;
    private final int speed;
    private final Particle particle;

    public ParticleContext(int x, int y, int vector, int speed, Particle particle) {
        this.x = x;
        this.y = y;
        this.vector = vector;
        this.speed = speed;
        this.particle = particle;
    }

    public void render() {
        particle.render(x, y, vector, speed);
    }
}
