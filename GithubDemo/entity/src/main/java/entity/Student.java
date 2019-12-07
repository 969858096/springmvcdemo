package entity;

/**
 * @FileName: Student
 * @Description:
 * @AuthOr: lsp
 * @Date: 2019/12/7 17:04
 */
public class Student {
    private int id;
    private String name;

    public Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
