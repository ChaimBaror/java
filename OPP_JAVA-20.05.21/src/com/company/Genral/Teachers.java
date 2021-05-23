package com.company.Genral;

public class Teachers extends Professionals implements Bookable {
    protected ClassRoom classRoom;

    public Teachers(String name, int pgone, int hoursForerwork, ClassRoom classRoom) {
        super(name, pgone, hoursForerwork);
        this.classRoom = classRoom;
    }


    @Override
    public ClassRoom BookType() {
        return ClassRoom.JAVA;
    }
}

