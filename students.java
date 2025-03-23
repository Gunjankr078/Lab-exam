package practice1;

class Students {
    private Integer id;
    private String name;
    private String course;
    private Double marks;

    public Students(Integer id, String name, String course, Double marks) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Double getMarks() {
        return marks;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Students [ID=" + id + ", Name=" + name + ", Course=" + course + ", Marks=" + marks + "]";
    }
}

