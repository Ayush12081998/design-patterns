package org.example.builder;

public class BuilderMain {
    public static void main(String[] args) {
        final People.PeopleBuilder peopleBuilder = new People.PeopleBuilder();
        peopleBuilder.age(27).name("Ayush Kumar").sex("M");
        final People people = new People(peopleBuilder);
        System.out.println(people);

        //way 2
        final People baba = People.builder()
                .sex("M")
                .age(28)
                .name("Shiv Kailash Tiwari Baba")
                .build();

        System.out.println(baba);
    }
}
