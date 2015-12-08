package logic;

public class Zombie implements ICharacter {
	int x, y, hp, atk, moveSpeed, moveDirection;

	public Zombie(int x, int y, int hp, int atk, int moveSpeed, int moveDirection) {
		this.x= x;
		this.y =y;
		this.hp = hp;
		
	}

	@Override
	public void move() {

	}

	@Override
	public void decreaseHP() {

	}

	@Override
	public boolean isDead() {
		// TODO Auto-generated method stub
		return false;
	}

}
