package com.medestin.animal.shelter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalShelterTestSuite {

    @Test
    public void testAnimalShelter(){
        AnimalShelter shelter = new AnimalShelter();

        shelter.enque(new Dog("Azor"));
        shelter.enque(new Cat("Kot1"));
        shelter.enque(new Dog("Reksio"));
        shelter.enque(new Cat("Kot2"));


        assertEquals("Azor", shelter.dequeAny().getName());
        assertEquals("Reksio", shelter.dequeDog().getName());
        assertEquals("Kot1", shelter.dequeCat().getName());
    }

}