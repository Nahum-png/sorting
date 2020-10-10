package uaslp.enginering.labs;

public class StudentBirthdayComparator implements Comparator{

    public int compare(Object left, Object right){
        Alumno studentLeft = (Alumno)left;
        Alumno studentRight = (Alumno)right;

        return studentLeft.getBirthday().compareTo(studentRight.getBirthday());
    }
}
