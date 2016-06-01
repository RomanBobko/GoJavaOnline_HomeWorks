package com.gojavaonline3.dlenchuk.module03.flowers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by DLenchuk on 26.05.2016.
 *
 */
public class Rosebush {

    private final Color color;
    private final boolean hasSmell;

    public Rosebush(Color color, boolean hasSmell) {
        this.color = color;
        this.hasSmell = hasSmell;
    }

    List<Flower> roses = new ArrayList<>();

    public void grow() {
        Iterator<Flower> iterator = roses.iterator();
        while (iterator.hasNext()) {
            Flower rose = iterator.next();
            rose.setHeight(rose.getHeight() + (int)(Math.random()*40));
            switch (rose.getState()) {
                case SPROUT:
                    rose.setState(State.BUD);
                    break;
                case BUD:
                    rose.setState(State.OPENED);
                    break;
                case OPENED:
                    rose.setState(State.WILT);
                    break;
                case WILT:
                    iterator.remove();
            }
        }
        int newRosesCount = (int)(Math.random()*5);
        for (int i = 0; i < newRosesCount; i++) {
            roses.add(new Rose(color, (int)(Math.random()*60), hasSmell, State.SPROUT));
        }
    }

    public List<Flower> trim() {
        List<Flower> roses = new ArrayList<Flower>(this.roses);
        this.roses.clear();
        return roses;
    }

    public List<Flower> trim(State state, int height) {
        List<Flower> roses = new ArrayList<>();
        Iterator<Flower> iterator = this.roses.iterator();
        while (iterator.hasNext()) {
            Flower rose = iterator.next();
            if (rose.getState() == state && rose.getHeight() <= height) {
                roses.add(rose);
                iterator.remove();
                rose.setHeight(height);
            }
        }
        return roses;
    }

    @Override
    public String toString() {
        return "Rosebush{" +
                "color=" + color +
                ", hasSmell=" + hasSmell +
                ", roses=" + roses +
                '}';
    }
}
