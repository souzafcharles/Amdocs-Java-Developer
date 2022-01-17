package org.souza.charles;
/**
 * Bootcamp title: Amdocs Java Developer
 * Instructor: Bruno Flávio Ferreira
 * Example adapted by: Charles Fernandes de Souza
 * Date: January 12, 2022
 */
public class Person {
    private String name;
    private String adress;
    private String email;
    private int age;

    public Person(String name, String adress, String email, int age) {
        super();
        this.name = name;
        this.adress = adress;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person {name=" + name
                + ", adress="+ adress
                + ", email=" + email
                + ", age=" + age + "}";
    }
}
