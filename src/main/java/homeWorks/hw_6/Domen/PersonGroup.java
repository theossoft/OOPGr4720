package homeWorks.hw_6.Domen;

import java.util.Iterator;
import java.util.List;

public class PersonGroup implements Iterable<Person>, Comparable<PersonGroup> {
    static private int groupCount = 0;
    private List<Person> group;
    private Integer idGroup;

    public PersonGroup(List<Person> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
        groupCount++;
    }


    public static int getGroupCount() {
        return groupCount;
    }
    public List<Person> getGroup() {
        return group;
    }

    public void setGroup(List<Person> group) {
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
        return "PersonGroup{" +
                "group=" + group +
                ", idGroup=" + idGroup +
                '}';
    }

    @Override
    public Iterator<Person> iterator() {
       return new Iterator<Person>() {

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
        public Person next() {
            return group.get(counter++);
        }
        
       };
        
    }


    @Override
    public int compareTo(PersonGroup o) {
        if (group.size() == o.group.size()) {
            if(idGroup == o.idGroup) return 0;
            if(idGroup>o.idGroup)return 1;
            else return -1;
        }
        if (group.size() > o.group.size()) return 1;
        else return 0;
    }
}
