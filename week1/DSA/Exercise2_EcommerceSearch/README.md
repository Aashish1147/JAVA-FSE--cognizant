# Exercise 2: E-commerce Platform Search Function

## Aim
Implement search functionality for an e-commerce platform using Linear Search and Binary Search algorithms.

## Problem Statement
Develop a search feature that allows users to search for products by name. Compare the performance of Linear Search and Binary Search.

## Algorithm

### Linear Search
1. Traverse the array sequentially.
2. Compare each product name with the target.
3. Return the product if found.
4. Time Complexity: O(n)

### Binary Search
1. Sort products by name.
2. Divide the search space into two halves.
3. Compare the middle element with the target.
4. Continue searching in the appropriate half.
5. Time Complexity: O(log n)

## Files

- Product.java
- SearchTest.java

## Output

Linear Search Found: Shoes

Binary Search Found: Shoes

Complexity Analysis

Linear Search : O(n)

Binary Search : O(log n)

## Conclusion

Binary Search is more efficient than Linear Search for large datasets because it reduces the search space by half in every iteration. However, Binary Search requires the data to be sorted before searching.