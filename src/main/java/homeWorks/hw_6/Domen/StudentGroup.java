package homeWorks.hw_6.Domen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    static private int groupCount = 0;
    private List<Student> group;
    private Integer idGroup;

    public StudentGroup(List<Student> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
        groupCount++;
    }


    public static int getGroupCount() {
        return groupCount;
    }
    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    public Integer getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {
        this.idGroup = idGroup;
    }

     @Override
    public String toString() {
        return "StudentGroup{" +
                "group=" + group +
                ", idGroup=" + idGroup +
                '}';
    }

    @Override
    public Iterator<Student> iterator() {
       return new Iterator<Student>() {

        private int counter;

        @Override
        public boolean hasNext() {

            if(counter<group.size())
            {
                return true;
            }
            else
            {
                return false;
            }            
        }

        @Override
        public Student next() {            
            return group.get(counter++);
        }
        
       };
        
    }


    @Override
    public int compareTo(StudentGroup o) {
        if (group.size() == o.group.size()) {
            if(idGroup == o.idGroup) return 0;
            if(idGroup>o.idGroup)return 1;
            else return -1;
        }
        if (group.size() > o.group.size()) return 1;
        else return 0;
    }
}
