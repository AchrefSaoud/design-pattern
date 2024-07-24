package flightweight;

public class Test {
    public static void main(String[] args) {
        ParticleFactory factory = new ParticleFactory();
        Particle bullet = factory.getParticle("red", "bulletSprite");
        Particle missile = factory.getParticle("gray", "missileSprite");
        Particle shrapnel = factory.getParticle("black", "shrapnelSprite");
        ParticleContext[] particles = new ParticleContext[1000];
        
        for (int i = 0; i < particles.length; i++) {
            int x = (int) (Math.random() * 100);
            int y = (int) (Math.random() * 100);
            int vector = (int) (Math.random() * 360);
            int speed = (int) (Math.random() * 10);
            if (i % 3 == 0) {
                particles[i] = new ParticleContext(x, y, vector, speed, bullet);
            } else if (i % 3 == 1) {
                particles[i] = new ParticleContext(x, y, vector, speed, missile);
            } else {
                particles[i] = new ParticleContext(x, y, vector, speed, shrapnel);
            }
        }

        for (ParticleContext context : particles) {
            context.render();
        }

    }
}
