public class ch9ex6_WalkupTicket  extends Ticket {

        static int price = 50;

        public WakeUpTicket(int ticketNumber) {
            super(ticketNumber);

        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            WakeUpTicket.price = price;
        }

        @Override
        public String toString() {
            return "Ticket number: " + this.getTicketNumber() + ", price: " + this.getPrice() + ".";
        }
}


