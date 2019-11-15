package strategyPattern;

public class Main {

	public static void main(String[] args) {
		Atom atom = new Atom("아톰");
		TaekwonV taekwonv = new TaekwonV("태권브이");
		
		atom.setMovingstrategy(new FlyStrategy());
		atom.setAttackstrategy(new PunchStrategy());
		atom.move();
		atom.attack();
		
		taekwonv.setAttackstrategy(new MissileStrategy());
		taekwonv.setMovingstrategy(new WalkStrategy());
		taekwonv.move();
		taekwonv.attack();
		

	}

}
