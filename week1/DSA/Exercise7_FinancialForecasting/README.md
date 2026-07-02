# Exercise 7: Financial Forecasting

## Aim

To implement a financial forecasting system using recursion and analyze its time complexity.

## Problem Statement

Predict the future value of an investment based on its current value, annual growth rate, and number of years using a recursive approach.

## Algorithm

1. Accept present value, growth rate, and number of years.
2. If years = 0, return the current value.
3. Otherwise multiply the value by (1 + growth rate).
4. Recursively call the function for the remaining years.
5. Display the future value.

## Program Explanation

The program uses recursion to calculate compound growth over multiple years.

Formula:

Future Value = Present Value × (1 + Growth Rate)^Years

Input:

* Present Value = 1000
* Growth Rate = 10% (0.10)
* Years = 5

Output:
Future Value after 5 years = 1610.51

## Time Complexity

O(n)

The recursive function is called once for each year.

## Space Complexity

O(n)

Due to recursive call stack usage.

## Output

Future Value after 5 years = 1610.51

## Conclusion

The recursive approach successfully forecasts future investment value based on compound growth. Recursion provides a simple and elegant solution for this problem.
