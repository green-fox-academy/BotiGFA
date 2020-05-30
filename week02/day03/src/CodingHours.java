public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52
        System.out.println("Total Coding hours all days: " + (17*6*7));
        System.out.println("Total Coding Ours only workdays: " + (17*6*5));
        System.out.println("Average work hours percentage: " + (52./168*100.) + "%");
    }
}
