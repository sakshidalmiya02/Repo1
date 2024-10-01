package firstproject;

public class Ticket {
	static int ticketnumber=1;
	int ticketId;
	
	static public void validticket(int ticketnumber) {
		if (ticketnumber>5) {
			System.out.println("More than 5 tickets can not be added");
			System.exit(0);
		}
		
	}
	public void init(int ticketId) {
		this.ticketId=ticketId;
		Ticket.ticketnumber++;
	}
	
	public void show() {
		System.out.println("Ticket Id is:"+this.ticketId);
	}

	}
	


