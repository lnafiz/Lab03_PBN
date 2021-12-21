# Peanut Butter and Nutella 
## Prattay Dey + Winnie, Brian Li + Robert, Nafiz Labib + Martha

### Tests Performed
In our main method in the SearchDriver.java file, we created 5 long arrays:

- 3 of the arrays are test arrays for our search methods, each with varying indices. The test arrays have 200k, 400k, and 600k indices each containing a value.
- The other 2 arrays store the total time it took each method to search for every index within each of our 3 test arrays via linear search and binary search, respectively. 

- We tested each index as a target through iteration and searched for a value not present in the dataset, so that we can take into account all possible cases - including the "best" and "worst" cases for each search.

The times stored represent the total times it took to search for every value within each test array. We then found the average time per search within each test array and displayed them to show the results of our experiment. The average time represents how long it took the search method to find each value within the test array, which takes care of the outliers resulting from the best and worst cases of the searches. 

### Results
- Relative to the size of the dataset, binary search is faster than linear search.
- Additionally, linear search takes exponentially longer as the size of the dataset increases.
- Binary search appears to also take longer as the size of the dataset increases, but this difference is negligible compared to that of linear search.
- Binary search becomes exponentially faster than linear search as the size of the dataset increases.

#### TRIAL 0
<pre>
total time for linear search within test0 (ms):         14480
total time for binary search within test0 (ms):         32
total time for linear search within test1 (ms):         75358
total time for binary search within test1 (ms):         36
total time for linear search within test2 (ms):         202958
total time for binary search within test2 (ms):         56

avg time for linear search within test0 (ms):           0.07239963800180998
avg time for binary search within test0 (ms):           1.5999920000399999E-4
binary search was 452.49999999999994x faster
avg time for linear search within test1 (ms):           0.18839452901367745
avg time for binary search within test1 (ms):           8.99997750005625E-5
binary search was 2093.277777777778x faster
avg time for linear search within test2 (ms):           0.3382627695620507
avg time for binary search within test2 (ms):           9.333317777803704E-5
binary search was 3624.2499999999995x faster
</pre>

#### TRIAL 1
<pre>
total time for linear search within test0 (ms):         14589
total time for binary search within test0 (ms):         29
total time for linear search within test1 (ms):         76394
total time for binary search within test1 (ms):         46
total time for linear search within test2 (ms):         200651
total time for binary search within test2 (ms):         51

avg time for linear search within test0 (ms):           0.07294463527682361
avg time for binary search within test0 (ms):           1.4499927500362497E-4
binary search was 503.0689655172414x faster
avg time for linear search within test1 (ms):           0.19098452253869366
avg time for binary search within test1 (ms):           1.1499971250071875E-4
binary search was 1660.7391304347827x faster
avg time for linear search within test2 (ms):           0.33441777597037337
avg time for binary search within test2 (ms):           8.499985833356944E-5
binary search was 3934.3333333333335x faster
</pre>

#### TRIAL 2
<pre>
total time for linear search within test0 (ms):         15111
total time for binary search within test0 (ms):         26
total time for linear search within test1 (ms):         75889
total time for binary search within test1 (ms):         46
total time for linear search within test2 (ms):         199134
total time for binary search within test2 (ms):         59

avg time for linear search within test0 (ms):           0.07555462222688887
avg time for binary search within test0 (ms):           1.2999935000325E-4
binary search was 581.1923076923077x faster
avg time for linear search within test1 (ms):           0.18972202569493576
avg time for binary search within test1 (ms):           1.1499971250071875E-4
binary search was 1649.7608695652175x faster
avg time for linear search within test2 (ms):           0.3318894468509219
avg time for binary search within test2 (ms):           9.83331694447176E-5
binary search was 3375.1525423728813x faster
</pre>

Additional trials were performed but omitted, for the sake of readability.

### Conclusions
- Binary search is much faster than linear search when working with large datasets.
- As the length of a dataset increases, the time required for searches also increases. This change in time is much more pronounced in linear search, as it takes exponentially much more time to search for every element within the dataset compared to binary search. 
