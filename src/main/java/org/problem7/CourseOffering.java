package org.problem7;

import java.util.Date;

public class CourseOffering {
    private int studentId;
    private int instructorId;
    private int courseId;
    private Date time;
    private int sectionNo;
    private int roomId;
    private int year;
    private String semester;

    public CourseOffering(int studentId, int instructorId, int courseId, Date time, int sectionNo, int roomId, int year, String semester) {
        this.studentId = studentId;
        this.instructorId = instructorId;
        this.courseId = courseId;
        this.time = time;
        this.sectionNo = sectionNo;
        this.roomId = roomId;
        this.year = year;
        this.semester = semester;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getSectionNo() {
        return sectionNo;
    }

    public void setSectionNo(int sectionNo) {
        this.sectionNo = sectionNo;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}

