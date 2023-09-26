package homeWorks.hw_6.Domen;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {

    private int steamNumber;
    private List<StudentGroup> studentGroupList;

    public StudentSteam(int steamNumber, List<StudentGroup> studentGroupList) {
        this.steamNumber = steamNumber;
        this.studentGroupList = studentGroupList;
    }

    public int getSteamNumber() {
        return steamNumber;
    }

    public void setSteamNumber(int steamNumber) {
        this.steamNumber = steamNumber;
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    public void setStudentGroupList(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {

            private int counter;

            @Override
            public boolean hasNext() {

                if(counter<studentGroupList.size())
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }

            @Override
            public StudentGroup next() {
                return studentGroupList.get(counter++);
            }

        };

    }

    @Override
    public String toString() {
        return "Поток " + steamNumber + ", Количество групп в потоке: " + StudentGroup.getGroupCount() + "" + "\n"
                + studentGroupList;


    }
}
