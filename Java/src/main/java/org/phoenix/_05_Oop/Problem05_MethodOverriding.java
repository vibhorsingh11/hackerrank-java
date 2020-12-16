package org.phoenix._05_Oop;

/*
 * When a subclass inherits from a superclass, it also inherits its methods; however, it can also override the
 * superclass methods (as well as declare and implement new ones).
 * Note: When overriding a method, you should precede it with the @Override annotation. The parameter(s) and return type
 * of an overridden method must be exactly the same as those of the method inherited from the supertype.
 *
 * Task
 * Complete the code in your editor by writing an overridden getNumberOfTeamMembers method that prints the same
 * statement as the superclass' getNumberOfTeamMembers method, except that it replaces n with 11
 * (the number of players on a Soccer team).*/

public class Problem05_MethodOverriding {
    public static void main(String[] args) {
        Sports c1 = new Sports();
        Soccer c2 = new Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
    }
}

class Sports {

    String getName() {
        return "Generic Sports";
    }

    void getNumberOfTeamMembers() {
        System.out.println("Each team has n players in " + getName());
    }
}

class Soccer extends Sports {
    @Override
    String getName() {
        return "Soccer Class";
    }

    // Write your overridden getNumberOfTeamMembers method here
    @Override
    void getNumberOfTeamMembers() {
        System.out.println("Each team has 11 players in " + getName());
    }
}