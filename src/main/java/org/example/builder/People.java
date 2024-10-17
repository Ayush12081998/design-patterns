package org.example.builder;

public class People {

    private String name;
    private int age;
    private String sex;

    People(PeopleBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;
    }

    public static PeopleBuilder builder() {
        return new PeopleBuilder();
    }


    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public static class PeopleBuilder {

        private String name;
        private int age;
        private String sex;

        PeopleBuilder name(String name) {
            this.name = name;
            return this;
        }

        PeopleBuilder age(int age) {
            this.age = age;
            return this;
        }

        PeopleBuilder sex(String sex) {
            this.sex = sex;
            return this;
        }

        People build() {
            return new People(this);
        }
    }
}
