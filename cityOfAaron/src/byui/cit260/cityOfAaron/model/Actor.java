/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.cityOfAaron.model;

    import java.awt.Point;

/**
 *
 * @author Gordon/McKay/Mitchell
 */
public enum Actor {
    
    MemberOne("Gordon", "Member 1", new Point(1,1)),
    MemberTwo("McKay", "Member 2", new Point(2,2)),
    MemberThree("Mitchell", "Member 3", new Point(3,3));
    
    private String name;
    private String title;
    private Point coordinates;
 

    Actor(String name, String title, Point coordinates) {
        this.name = name;
        this.title = title;
        this.coordinates = coordinates;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", title=" + title + ", coordinates=" + coordinates + '}';
    }
    
}


