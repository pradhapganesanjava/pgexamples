package tmp;

public class Tmp {

}
/*
interface Hunter {
	public void hunt(Animal animal);
}

class MammutHunter implements Hunter {
	@Override
	public void hunt(Mammut animal) {
	} 
}

class BearHunter implements Hunter {
	@Override
	public void hunt(Bear animal) {
	} 
}

AnimalHunter hunter = new MammutHunter();
hunter.hunt(new Bear()); //TO AVOID THIS MESS

interface AnimalHunter<T extends Animal> {
	void hunt(T animal); }

class MammutHunter implements AnimalHunter<Mammut> {
	void hunt(Mammut m){ }  }

class BearHunter implements AnimalHunter<Bear> {
	void hunt(Bear animal) { } } 

AnimalHunter<? super Feline> hunter = new MammalHunter();
hunter.hunt(new Lion());
hunter.hunt(new Puma());*/