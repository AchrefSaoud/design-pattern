package flightweight;

import java.util.HashMap;
import java.util.Map;

public class ParticleFactory {
    private final Map<String, Particle> particles = new HashMap<>();

    public Particle getParticle(String color, String sprite) {
        String key = color + ":" + sprite;
        if (!particles.containsKey(key)) {
            particles.put(key, new ParticleType(color, sprite));
        }
        return particles.get(key);
    }
}
