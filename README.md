# Peanut Butter and Nutella 
## Prattay Dey + Winnie, Brian Li + Robert, Nafiz Labib + Martha

### Tests Performed
In our main method in the SearchDriver.java file, we created 5 long arrays:

- 3 of the arrays are test arrays for our search methods, each with varying indices. The test arrays have 200k, 400k, and 600k indices each containing a value.
- The other 2 arrays store the total time it took each method to search for every index within each of our 3 test arrays via linear search and binary search, respectively. 

- We tested each index as a target through iteration, so that we can take into account all possible cases - including the "best" and "worst" cases for each search.

The times stored represent the total times it took to search for every value within each test array. We then found the average time per search within each test array and displayed them to show the results of our experiment. The average time represents how long it took the search method to find each value within the test array, which takes care of the outliers resulting from the best and worst cases of the searches. 

### Results
- Relative to the size of the dataset, binary search is faster than linear search.
- Additionally, linear search takes exponentially longer as the size of the dataset increases.
- Binary search appears to also take longer as the size of the dataset increases, but this difference is negligible compared to that of linear search.
- Binary search becomes exponentially faster than linear search as the size of the dataset increases.

#### TRIAL 0
<pre>
total time for linear search within test0 (ms):         13312
total time for binary search within test0 (ms):         15
total time for linear search within test1 (ms):         69646
total time for binary search within test1 (ms):         30
total time for linear search within test2 (ms):         216646
total time for binary search within test2 (ms):         40

avg time for linear search within test0 (ms):           0.06656
avg time for binary search within test0 (ms):           7.5E-5
binary search was 887.4666666666667x faster
avg time for linear search within test1 (ms):           0.174115
avg time for binary search within test1 (ms):           7.5E-5
binary search was 2321.5333333333333x faster
avg time for linear search within test2 (ms):           0.36107666666666666
avg time for binary search within test2 (ms):           6.666666666666667E-5
binary search was 5416.15x faster
</pre>

#### TRIAL 1
<pre>
total time for linear search within test0 (ms):         18303
total time for binary search within test0 (ms):         22
total time for linear search within test1 (ms):         110709
total time for binary search within test1 (ms):         31
total time for linear search within test2 (ms):         285332
total time for binary search within test2 (ms):         47

avg time for linear search within test0 (ms):           0.091515
avg time for binary search within test0 (ms):           1.1E-4
binary search was 831.9545454545454x faster
avg time for linear search within test1 (ms):           0.2767725
avg time for binary search within test1 (ms):           7.75E-5
binary search was 3571.258064516129x faster
avg time for linear search within test2 (ms):           0.47555333333333333
avg time for binary search within test2 (ms):           7.833333333333333E-5
binary search was 6070.893617021276x faster
</pre>

#### TRIAL 2
<pre>
total time for linear search within test0 (ms):         14687
total time for binary search within test0 (ms):         13
total time for linear search within test1 (ms):         104466
total time for binary search within test1 (ms):         48
total time for linear search within test2 (ms):         299805
total time for binary search within test2 (ms):         55

avg time for linear search within test0 (ms):           0.073435
avg time for binary search within test0 (ms):           6.5E-5
binary search was 1129.769230769231x faster
avg time for linear search within test1 (ms):           0.261165
avg time for binary search within test1 (ms):           1.2E-4
binary search was 2176.375x faster
avg time for linear search within test2 (ms):           0.499675
avg time for binary search within test2 (ms):           9.166666666666667E-5
binary search was 5451.0x faster
</pre>

Additional trials were performed but omitted, for the sake of readability.

### Conclusions
- Binary search is much faster than linear search when working with large datasets.
- As the length of a dataset increases, the time required for searches also increases. This change in time is much more pronounced in linear search, as it takes exponentially much more time to search for every element within the dataset compared to binary search. 
