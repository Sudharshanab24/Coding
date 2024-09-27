/**
 * This class is an extension of the GuessGame class which contains a guess API method.
 * The guessNumber method aims to find the number which the API is thinking of.
 */
public class Solution extends GuessGame {
    /**
     * Guesses the number by using binary search to minimize the number of calls to the guess API.
     *
     * @param  n  the upper bound of the range to search.
     * @return    the number that matches the guess API's hidden number.
     */
    public int guessNumber(int n) {
        // Initialize the lower bound of the search range.
        int left = 1;
        // Initialize the upper bound of the search range.
        int right = n;

        // Continue searching as long as the range has not been narrowed down to a single element.
        while (left < right) {
            // Calculate the midpoint of the current range to use as our guess.
            int mid = left + (right - left) / 2;

            // Make a guess using the midpoint and get the response from the guess API.
            int apiResponse = guess(mid);

            // If the guess is too high or correct, narrow the range to the lower half (inclusive of mid).
            if (apiResponse <= 0) {
                right = mid;
            } else {
                // If the guess is too low, narrow the range to the upper half (exclusive of mid).
                left = mid + 1;
            }
        }
        // When the loop exits, left and right converge to the target number; return it.
        return left;
    }
}