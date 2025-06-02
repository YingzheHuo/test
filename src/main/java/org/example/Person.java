package org.example;

public class Person {
    private String name;
    private int age;
    private String gender;
    private String city;

    public static class Builder {
        private String name;
        private int age;
        private String gender;
        private String city;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Person build() {
            Person person = new Person();
            person.name = name;
            person.age = age;
            person.gender = gender;
            person.city = city;
            return person;
        }


    }

    public void showPerson() {
        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender + ", City: " + city);
    }
}
