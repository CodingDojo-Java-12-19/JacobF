package com.codingdojo.pets.models;

public class Dog extends Animal {

	public Dog(String name, String breed, double weight) {
		super(name, breed, weight);
	}
	public String sayGreeting() {
		return "Bark bark! My name is " +  this.name + ". I am a " + this.breed + " and I weigh " + this.weight + ".";
	}

}