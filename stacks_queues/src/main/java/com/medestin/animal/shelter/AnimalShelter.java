package com.medestin.animal.shelter;

import com.medestin.MyQueue;

public class AnimalShelter {
    private MyQueue<AnimalWrapper> dogs = new MyQueue<>();
    private MyQueue<AnimalWrapper> cats = new MyQueue<>();
    private int nextAdmissionNumber = 1;

    public void enque(Animal animal){
        AnimalWrapper wrapped = new AnimalWrapper(animal, nextAdmissionNumber);
        ++nextAdmissionNumber;
        if(animal instanceof Dog){
            dogs.add(wrapped);
        } else {
            cats.add(wrapped);
        }
    }

    public Animal dequeAny(){
        if(cats.isEmpty()){
            return dequeDog();
        } else if (dogs.isEmpty()){
            return dequeCat();
        } else if(dogs.peek().admissionNumber > cats.peek().admissionNumber){
            return dequeCat();
        } else {
            return dequeDog();
        }
    }

    public Dog dequeDog(){
        return (Dog) dogs.remove().animal;
    }

    public Cat dequeCat(){
        return (Cat) cats.remove().animal;
    }

    private class AnimalWrapper{
        private final Animal animal;
        private final int admissionNumber;

        private AnimalWrapper(Animal animal, int admissionNumber) {
            this.animal = animal;
            this.admissionNumber = admissionNumber;
        }
    }
}
