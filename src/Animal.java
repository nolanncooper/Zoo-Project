
public abstract class Animal {
	
	protected int balance;
	protected int hungerValue;
	// 24 pounds of food per day
		protected int monetaryValue;
		protected int avgLifeSpan;
		protected int income;
		protected String animalType;
		protected int numberOf;
		protected int age;
	
	public void feed() {
		balance -= (((100-hungerValue)/4) * numberOf);
		hungerValue = 50;
		System.out.println("A single dollar pays for 4 hungerValue points. If your animals do not reach 50 hungerValue points, they will die.");
	}
	public void sell() {
		balance += monetaryValue;
		numberOf -= 1;
		hungerValue-=5;

	}
	public void purchase() {
		balance-=monetaryValue;
		System.out.println("Your current balance = $" + balance);
		hungerValue-=5;
		numberOf+=1;
		System.out.println("You're up to: " + numberOf + " " + animalType);

	}

	public void collectItems() {
		balance += (income * numberOf);
		age += 1;
		hungerValue-=5;


	}
	
	public void setBalance(int n) {
		balance = n;
	}
	public abstract void printAnimal();
	
	
	
	
	public int getBalance() {
		return balance;
	}
	public void setHungerValue(int n) {
		hungerValue = n;
	}
	public void setMonetaryValue(int n) {
		monetaryValue = n;
	}
	public void setAvgLifeSpan(int n) {
		avgLifeSpan = n;
	}
	public void setIncome(int n) {
		income = n;
	}
	public void setAnimalType(String str) {
		animalType = str;
	}
	public void setNumberOf(int n) {
		numberOf = n;
	}
	public void setAge(int n) {
		age = n;
	}
	
	
	public int getHungerValue() {
		return hungerValue;
	}
	public int getMonetaryValue() {
		return monetaryValue;
	}
	public int getAvgLifeSpan() {
		return avgLifeSpan;
	}
	public int getIncome() {
		return income;
	}
	public String getAnimalType() {
		return animalType;
	}
	public int getNumberOf() {
		return numberOf;
	}
	public int getAge() {
		return age;
	}

	
}
