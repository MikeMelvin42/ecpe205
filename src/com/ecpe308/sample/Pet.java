package com.ecpe308.sample;

public class Pet {
    public String name, breed; //persian, labrador, golden retriever
    public String pet_type;  //cat/dog
    public String age;
    
    //but the getters are the accessors

    public String getName(){
        return name;
    }

    public String getBreed(){
        return breed;
    }

    public String getPet_type(){
        return pet_type;
    }

    public String getAge() {
        return age;
    }

    //these are the mutators

    public void setName (String name){
        this.name = name;
    }

    public void setBreed (String breed){
        this.breed = breed; 
    }
    
    public void setPet_type (String pet_type){
        this.pet_type= pet_type;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

