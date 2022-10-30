public class BicycleRegistration
{
    public static void main(String[]args){
	Bicycle bike1, bike2, bike3;
	String owner1, owner2, tag;
	
	bike1 = new Bicycle();
	bike1.setOwnerName("Adam Smith");
	
	bike2 = new Bicycle();
	bike2.setOwnerName("Ben Jones");
	
	bike3 = new Bicycle();
    bike3.setTagNo("2004 - 134R");
	
	owner1 = bike1.getOwnerName();
	owner2 = bike2.getOwnerName();
	tag = bike3.getTagNo();
	
	
	System.out.println(owner1 + " owns a bicycle." );
	System.out.println(owner2 + " also owns a bicycle.");
	System.out.println(tag + " Tag Number.");


    }
}
