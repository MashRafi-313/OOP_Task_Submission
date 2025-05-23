package org.problem7;

public class Student {
    private int id;
    private String name;
    private String program;

    public Student(int id, String name, String program) {
        this.id = id;
        this.name = name;
        this.program = program;
    }


    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

