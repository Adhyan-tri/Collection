import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>();
//
//        set.add(12);
//        set.add(40);
//        set.add(50);
//        set.add(40);
//        set.add(30);
//        set.add(20);
//
//        System.out.println(set);
//
//
//        set.remove(50);
//        System.out.println(set);
//
//        System.out.println(set.contains(100));
//
//        System.out.println(set.isEmpty());
//
//        System.out.println(set.size());
//
//        set.clear();
//
//        System.out.println(set);








//        Set<Integer> set = new LinkedHashSet<>();
//        set.add(12);
//        set.add(40);
//        set.add(50);
//        set.add(40);
//        set.add(30);
//        set.add(20);
//
//        System.out.println(set);
//
//
//        set.remove(50);
//        System.out.println(set);
//
//        System.out.println(set.contains(40));
//
//        System.out.println(set.isEmpty());
//
//        System.out.println(set.size());
//
//        set.clear();
//
//        System.out.println(set);







//        Set<Integer> set = new TreeSet<>();
//        set.add(12);
//        set.add(40);
//        set.add(50);
//        set.add(40);
//        set.add(30);
//        set.add(20);
//
//        System.out.println(set);
//
//
//        set.remove(50);
//        System.out.println(set);
//
//        System.out.println(set.contains(40));
//
//        System.out.println(set.isEmpty());
//
//        System.out.println(set.size());
//
//        set.clear();
//
//        System.out.println(set);
//


        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("Adhyan", 1));
        studentSet.add(new Student("Shikhar", 2));
        studentSet.add(new Student("Ananya", 3));

        studentSet.add(new Student("Shubham", 2));


        Student s1 = new Student("Shikhar", 2);
        Student s2 = new Student("Shubham", 2);

        System.out.println(s1.equals(s2));




        System.out.println(studentSet);

    }
}
