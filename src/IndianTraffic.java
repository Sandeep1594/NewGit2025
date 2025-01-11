
public class IndianTraffic implements TrafficLight,TrafficRules{
	public static void main(String[] args) {
		IndianTraffic it = new IndianTraffic();
		it.Green();
		it.Yellow();
		it.Red();
		it.mask();
		it.Rules();
		
	}

	@Override
	public void Green() {
		// TODO Auto-generated method stub
		System.out.println("Green to GO");
	}

	@Override
	public void Yellow() {
		// TODO Auto-generated method stub
		System.out.println("Yellow to Get ready to go");
	}

	@Override
	public void Red() {
		// TODO Auto-generated method stub
		System.out.println("Red to Stop");
	}
	public void mask() {
		System.out.println("Pandemic time wear mask!!");
	}

	@Override
	public void Rules() {
		// TODO Auto-generated method stub
		System.out.println("Obey the Rules");
	}
}
