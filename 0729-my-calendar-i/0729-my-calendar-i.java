class MyCalendar {
    private List<int[]> bookings;

    public MyCalendar() {
        bookings = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        // Check for overlaps with existing bookings
        for (int[] booking : bookings) {
            // If the current booking overlaps with an existing booking, return false
            if (start < booking[1] && end > booking[0]) {
                return false; // Overlap detected
            }
        }

        // If no overlaps, add the new booking
        bookings.add(new int[]{start, end});
        return true;
    }
}