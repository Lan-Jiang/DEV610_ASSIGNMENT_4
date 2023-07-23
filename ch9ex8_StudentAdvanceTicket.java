public class ch9ex8_StudentAdvanceTicket {


    public class StudentAdvanceTicket extends AdvanceTicket {

        int price = 20;
        int purchaseDayBeforeEvent;
        int ticketNumber;

        public int getTicketNumber() {
            return ticketNumber;
        }

        public void setTicketNumber(int ticketNumber) {
            this.ticketNumber = ticketNumber;
        }

        public int getPrice() {
            return price;
        }



        public int getpurchaseDayBeforeEvent() {
            return purchaseDayBeforeEvent;
        }

        public void setNumberOfDaysBeforeEvent(int purchaseDayBeforeEvent) {
            this.purchaseDayBeforeEvent = purchaseDayBeforeEvent;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public StudentAdvanceTicket(int ticketNumber, int days) {
            this.ticketNumber = ticketNumber;
            this.purchaseDayBeforeEvent = days;

        }

        public StudentAdvanceTicket() {

        }

        @Override
        public String toString() {
            if (this.getpurchaseDayBeforeEvent() > 10)
                this.setPrice(15);

            return "Ticket number: " + this.getTicketNumber() + ", price: " + this.getPrice() + ".(ID required) \n";
        }



}
