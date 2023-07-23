public class ch9ex7_AdvanceTicket {

    public class Ticket {

        int ticketNumber;
        int ticketPrice;

        public Ticket(int ticketNumber) {

            this.ticketNumber = ticketNumber;

        }

        public Ticket() {

        }

        public int getTicketNumber() {
            return ticketNumber;
        }

        public void setTicketNumber(int ticketNumber) {
            this.ticketNumber = ticketNumber;
        }

        public int getTicketPrice() {
            return ticketPrice;
        }

        public void setTicketPrice(int ticketPrice) {
            this.ticketPrice = ticketPrice;
        }

    }



    public class AdvanceTicket extends Ticket {

        int ticketNumber;
        int purchaseDayBeforeEvent;
        int price = 40;

        public int getTicketNumber() {
            return ticketNumber;
        }

        public void setTicketNumber(int ticketNumber) {
            this.ticketNumber = ticketNumber;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getpurchaseDayBeforeEvent() {
            return purchaseDayBeforeEvent;
        }

        public void setpurchaseDayBeforeEvent(int purchaseDayBeforeEvent) {
            this.purchaseDayBeforeEvent = purchaseDayBeforeEvent;
        }

        public AdvanceTicket(int ticketNumber, int daysBeforeEvent) {
            this.ticketNumber = ticketNumber;
            this.purchaseDayBeforeEvent = daysBeforeEvent;
        }

        public AdvanceTicket() {

        }

        @Override
        public String toString() {

            if (this.getpurchaseDayBeforeEvent() > 10)
                this.setPrice(30);

            return "Ticket number: " + this.getTicketNumber() + ", price: " + this.getPrice() + "." + " purchased "
                    + this.getpurchaseDayBeforeEvent() + " days before the event. \n";
        }
    }


    public static void main(String args[]) {


            AdvanceTicket ad = new AdvanceTicket(113, 10);
            // StudentAdvanceTicket sad = new StudentAdvanceTicket(86, 12);
            // StudentAdvanceTicket sad1 = new StudentAdvanceTicket(24, 4);

            System.out.println(ad);
            // System.out.println(sad);
            // System.out.println(sad1);

        }


}
