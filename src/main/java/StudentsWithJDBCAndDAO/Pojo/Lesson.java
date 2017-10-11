package StudentsWithJDBCAndDAO.Pojo;

import java.io.Serializable;

public class Lesson implements Serializable {
    private final long dateTime;
    private final String topic;
    private final short roomNum;
    private final String teacher;

    public Lesson(long dateTime, String topic, short roomNum, String teacher) {
        this.dateTime = dateTime;
        this.topic = topic;
        this.roomNum = roomNum;
        this.teacher = teacher;
    }

    public long getDateTime() {
        return dateTime;
    }

    public String getTopic() {
        return topic;
    }

    public short getRoomNum() {
        return roomNum;
    }

    public String getTeacher() {
        return teacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lesson)) return false;

        Lesson lesson = (Lesson) o;

        if (getDateTime() != lesson.getDateTime()) return false;
        if (getRoomNum() != lesson.getRoomNum()) return false;
        if (!getTopic().equals(lesson.getTopic())) return false;
        return getTeacher().equals(lesson.getTeacher());
    }

    @Override
    public int hashCode() {
        int result = (int) (getDateTime() ^ (getDateTime() >>> 32));
        result = 31 * result + getTopic().hashCode();
        result = 31 * result + (int) getRoomNum();
        result = 31 * result + getTeacher().hashCode();
        return result;
    }
}
