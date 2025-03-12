package Base_Concepts;

public class Operators_java{
    public static void main(String args[])
    {
        int arithmatic_num1 = 6;
        int arithmatic_num2 = 10;
        System.out.println("Addition :- "+ (arithmatic_num1+arithmatic_num2));
        System.out.println("Substraction :- "+ (arithmatic_num2-arithmatic_num1));
        System.out.println("Multiplication:- "+ (arithmatic_num2*arithmatic_num1));
        System.out.println("Division :- "+ (arithmatic_num2/arithmatic_num1));
        System.out.println("Modulo :- "+ (arithmatic_num2%arithmatic_num1));

        // Unary Operator
        System.out.println("Pre-Increment");
        int Unary_num1 = 10;
        int Unary_num2 = ++Unary_num1;
        System.out.println("Pre-increment Value Unary_num1 :- "+ Unary_num1);
        System.out.println("Pre-increment Value Unary_num2 :- "+ Unary_num2);

        System.out.println("Post-Increment");
        int post_Unary_num1 = 10;
        int post_Unary_num2 = post_Unary_num1++;
        System.out.println("Pre-increment Value Unary_num1 :- "+ post_Unary_num1);
        System.out.println("Pre-increment Value Unary_num2 :- "+ post_Unary_num2);

        // Relational Operator
        int Relational_num1 = 10;
        int Relational_num2 = 20;
        if(Relational_num1 == Relational_num2){
            System.out.println("Both Are Same USED ==");
        }
        else{
            System.out.println("Both Are Not Same  USED ==");
        }
        if(Relational_num1 != Relational_num2){
            System.out.println("Both Are Not Same USED != ");
        }
        else{   
            System.out.println("Both Are Same USED !=");
        }
        if(Relational_num1 > Relational_num2){
            System.out.println("The Relational_Num1 is greater than Relational_Num2");
        }
        else{
            System.out.println("The Relational_Num2 is greater than Relational_Num1");
        }

    }

}