//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class NewClass {
    public static int getLargest(int arr[], int sz) {
        int iterate1 = 0; /// Initializing the first iterator
        int iterate2 = 0; // Initialize the second iterator
        int largest = 0; // Initialize the variable to store the largest product

        // Outer loop runs O(sz) times
        while (iterate1 < sz - 1) {
            iterate2++; // Increment the second iterator

            // Check if the second iterator reaches the end of the array
            if (iterate2 == sz) {
                iterate1++; // Increment the first iterator
                iterate2 = iterate1; // Reset the second iterator to the value of the first
                continue;
            }
            int product = arr[iterate1] * arr[iterate2];

            // Update the largest product if the current product is greater
            if (product > largest)
                largest = product;
        }
        return largest; // Return the largest product
    }
}

// the outer loop runs sz times.
// the inner loop runs a total of sz iterations across all iterations of the outer loop.
// the total number of basic operations is proportional to sz * sz, which simplifies to O(sz^2), being the time complexity of the algorithms .