Summary of Multidimensional Arrays
<ul>
<li>An array can have elements that are arrays.</li>
<li>An array that has elements that are arrays is a 2d array. In other words, an array of arrays is a 2d array.</li>
<li>An array of arrays of arrays is a 3d array.</li>
<li>How to create a 2d array with specific elements:
<pre><code>String[][] arr = { {"a","b"},{"c","d"},{"e","f"} };</code></pre></li>
<li>How to create an empty 2d array:
<pre><code>double[][] arr = new double[7][5];</code></pre>
This would create an array with 7 rows and 5 columns. Remember that when creating an array in this manner, it gets filled up with the default values for that type. See <a href="https://www.geeksforgeeks.org/default-array-values-in-java/">here</a> for what the default values are for each data type.</li>
</ul>
<ol>
<li>Create the below array:</li>

```java
int[][] arr = {
                {1,10,111,222},
                {7,19,333,444},
                {4,22,555,666},
                {6,77,777,888},
                        };
```

<ol>
<li>Write a for-loop that prints out:</li>
<pre><code>1,7,4,6</code></pre>
<details><summary>Solution</summary>

```java
for(int row=0; row<arr.length; row++){
    System.out.print(arr[row][0]+",");
}
```
</details>

<li>Write a for-loop that prints out:</li>
<pre>10,19,22,77</pre>
<details><summary>Solution</summary>

```java
for(int row=0; row<arr.length; row++){
        System.out.print(arr[row][1]+",");
        }
```
</details>

<li>Write a for-loop that prints out:</li>
<pre>1,10,111,222</pre>
<details><summary>Solution</summary>

````java
for(int col=0; col<arr[0].length; col++){
    System.out.print(arr[0][col]+",");
        }
````
</details>

<li>Write a for-loop that prints out:</li>
<pre>7,19,333,444</pre>
<details><summary>Solution</summary>

````java
for(int col=0; col<arr[0].length; col++){
    System.out.print(arr[1][col]+",");
        }
````
</details>


<li>Write a for-loop that prints out:
<pre>1,10,111,222
7,19,333,444
4,22,555,666
6,77,777,888</pre>
<details><summary>Solution</summary>

````java
for(int row=0; row<arr.length; row++){
    for(int col=0; col<arr[0].length; col++){
        System.out.print(arr[row][col]+",");
    }
    System.out.println();
}
````
</details>

NOTE: After you have written your for-loop to print out the above, try running the below code
<code><pre>System.out.println(Arrays.deepToString(arr));</pre></code>
</li>
<li>Write a double for-loop (a for-loop nested inside another for-loop) that prints out:</li>
<pre><code>1,10
1,19
1,22
1,77
7,10
7,19
7,22
7,77
4,10
4,19
4,22
4,77
6,10
6,19
6,22
6,77</code></pre>

</ol>

</ol>