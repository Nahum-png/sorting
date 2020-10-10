package uaslp.enginering.labs;

public class StudentClaveComparator implements Comparator{

    public int compare(Object left, Object right){
        Alumno studentLeft = (Alumno)left;
        Alumno studentRight = (Alumno)right;

        return studentLeft.getClave() - studentRight.getClave();
    }
}
