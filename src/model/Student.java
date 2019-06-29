package model;

public class Student {
    public String name;
    public int age;
    public String sex;
    public int id;
    public  Student(String n,int a,String s,int i){
        name=n;
        age=a;
        sex=s;
        id=i;
    }
    public void setName(String i){
        name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int i){
        age=i;
    }
    public int getAge(){
        return age;
    }
    public void setSex(String s){
        sex=s;
    }
    public String getSex(){
        return sex;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
}




