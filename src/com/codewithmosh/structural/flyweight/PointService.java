package com.codewithmosh.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    private PointIconFactory factory;

    public PointService(PointIconFactory factory){
        this.factory = factory;
    }

    public List<Point> getPoints(){
        List<Point> points = new ArrayList<>();
        var point = new Point(1,2, factory.getPointIcon(PointType.CAFE));
        points.add(point);

        return points;
    }
}
