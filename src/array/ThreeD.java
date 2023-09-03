public class ThreeD {
    public static void main(String[] args) {
        // declare four variables
        int dept , student , marks , tot = 0;

        // take the marks of student in 3D Array
        int [][][] ar = {{{50, 40, 52},{50, 60, 59}},
                {{69,65,60},{40,59,69}},
                {{60,79,64},{74,59,85}}};
        System.out.println("----------- Print 3D Array -----------\n");
        for (dept = 0; dept < 3 ; dept++ )
        {
            System.out.println("Department "+(dept+1)+": " );
            for ( student=0 ; student < 2 ; student++ )
            {
                System.out.print("Student Marks : ");
                for ( marks=0 ; marks < 3 ; marks++)
                {
                    System.out.print(ar[dept][student][marks] +"  ");
                    tot += ar[dept][student][marks];
                }
                System.out.println(" Total : " + tot);
                tot = 0;
            }
            System.out.println();
        }
    }
}
