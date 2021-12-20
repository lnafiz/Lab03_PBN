# Peanut Butter and Nutella - Prattay Dey + Winnie, Brian Li + Robert, Nafiz Labib + Martha
# APCS
# Lab03
# 2021-12-21

### Tests Performed
In our main method in the SearchDriver.java file, we created 5 long arrays:

- 3 of the arrays are test arrays for our search methods, each with varying indices. The test arrays have 200k, 400k, and 600k indices each containing a value.
- The other 2 arrays store the time it took each method to search for a certain value within each of our 3 test arrays. The time storing arrays have 3 indices, each one storing the time it took the search method to find a value within one of the test arrays.

- We tested each index as a target through iteration, so that we can take into account all possible cases - including the "best" and "worst" cases for each search.

The times stored represent the total time it took to search for every value within each test array, so we then averaged the times in the 2 arrays and displayed them to show the results of our experiment. The average time represents how long it took the search method to find each value within the test array. 

### Results

total time for linear search within test0 (ms): 	13446
total time for binary search within test0 (ms): 	20
total time for linear search within test1 (ms): 	61267
total time for binary search within test1 (ms): 	30
total time for linear search within test2 (ms): 	157264
total time for binary search within test2 (ms): 	45
avg time for linear search within test0 (ms): 	0.06723
avg time for binary search within test0 (ms): 	1.0E-4
avg time for linear search within test1 (ms): 	0.1531675
avg time for binary search within test1 (ms): 	7.5E-5
avg time for linear search within test2 (ms): 	0.26210666666666665
avg time for binary search within test2 (ms): 	7.5E-5

total time for linear search within test0 (ms): 13295
total time for binary search within test0 (ms): 20
total time for linear search within test1 (ms): 62569
total time for binary search within test1 (ms): 30
total time for linear search within test2 (ms): 154806
total time for binary search within test2 (ms): 45
avg time for linear search within test0 (ms): 		0.066475
avg time for binary search within test0 (ms): 		1.0E-4
avg time for linear search within test1 (ms): 		0.1564225
avg time for binary search within test1 (ms): 		7.5E-5
avg time for linear search within test2 (ms): 		0.25801
avg time for binary search within test2 (ms): 		7.5E-5



Trial 3: 
total time for linear search within test0 (ms): 13591
total time for binary search within test0 (ms): 21
total time for linear search within test1 (ms): 61311
total time for binary search within test1 (ms): 30
total time for linear search within test2 (ms): 157295
total time for binary search within test2 (ms): 45
avg time for linear search within test0 (ms): 		0.067955
avg time for binary search within test0 (ms): 		1.05E-4
avg time for linear search within test1 (ms): 		0.1532775
avg time for binary search within test1 (ms): 		7.5E-5
avg time for linear search within test2 (ms): 		0.2621583333333333
avg time for binary search within test2 (ms): 		7.5E-5





### Conclusions
