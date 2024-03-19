import java.util.*;
class pqofobj
{
    static class Student implements Comparable<Student>
    {
        String name;
        int rank;
        public Student(String name , int rank)
        {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2)
        {
            return this.rank - s2.rank;
        }

    }
    public static void main(String args[])
    {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("prashu" , 9));
        pq.add(new Student("vandy" , 0));
        pq.add(new Student ("sandy",11));
        pq.add(new Student ("lila" , 1));

        while (!pq.isEmpty())
        {
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }
    }
}