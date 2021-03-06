package model;

public class Ride {
    Position start;
    Position finish;
    int earliestStart;
    int latestFinish;
    int id;

    public Ride(Position start, Position finish, int earliestStart, int latestFinish, int id) {
        this.start = start;
        this.finish = finish;
        this.earliestStart = earliestStart;
        this.latestFinish = latestFinish;
        this.id = id;
    }

    public int getLength() {
        return Math.abs(start.x - finish.x) + Math.abs(start.y - finish.y);
    }
}
