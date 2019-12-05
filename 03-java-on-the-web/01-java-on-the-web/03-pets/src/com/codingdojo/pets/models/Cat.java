package com.codingdojo.pets.models;

public class Cat extends Animal {
	public Cat(String name, String breed, double weight) {
		super(name, breed, weight);
	}
	public String sayGreeting() {
		return "Meowww meoww, my name is " +  this.name + ". I am a " + this.breed + " and I weigh " + this.weight + ".";
	}
}