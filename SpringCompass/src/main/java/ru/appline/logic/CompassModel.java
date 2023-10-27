package ru.appline.logic;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class CompassModel implements Serializable {
    private static final CompassModel instance = new CompassModel();

    private final Map<String, Compass> model;

    public CompassModel() {
        model = new HashMap<String, Compass>();
    }

    public static CompassModel getInstance() {
        return instance;
    }

    public void add(Compass compass, String side) {
        model.put(side, compass);
    }

    public Map<String, Compass> getAll() {
        return model;
    }

    public Compass get(String north) {
        return model.get(north);
    }
}
