package battleArena;

public class Dragon extends CharacterRole{
		private int attackPower;
		private boolean isSpecialAttackActive;
		
		
		public Dragon(String name, int healthPower, boolean specialAbilityActive, int damage) {
		    super(name, healthPower, specialAbilityActive, damage);
		}



		public int getAttackPower() {
			return attackPower;
		}


		public void setAttackPower(int attackPower) {
			this.attackPower = attackPower;
		}


		public boolean isSpecialAttackActive() {
			return isSpecialAttackActive;
		}


		public void setSpecialAttackActive(boolean isSpecialAttackActive) {
			this.isSpecialAttackActive = isSpecialAttackActive;
		}


		@Override
		public String toString() {
			return "Dragon [attackPower=" + attackPower + ", isSpecialAttackActive=" + isSpecialAttackActive
					+ ", getAttackPower()=" + getAttackPower() + ", isSpecialAttackActive()=" + isSpecialAttackActive()
					+ ", getName()=" + getName() + ", getHealthPower()=" + getHealthPower()
					+ ", isSpecialAbilityActive()=" + isSpecialAbilityActive() + ", getDamage()=" + getDamage()
					+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
					+ "]";
		}
		
		public int randomNumberGenerator(int min, int max) {
			int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
			return random_int;
		}
		
		public int attack() {
			return randomNumberGenerator(15, 25);
		}
		
		
}
