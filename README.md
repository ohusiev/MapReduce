# MapReduce Assignment
Map/Reduce simplified system which tokenize input *.txt file. Output creates a text file, which contain each token and its count.

## Details
The Map/Reduce system has been built using the following two classes:
1. Map class
This class contain:
- a private ArrayList<String>
- a public method map(), which tokenize  workshop.txt into  its words, each of which is inserted into the Arraylist (duplicates are allowed). 
- a public method getList() to return the ArrayList (getter)

2. Reduce class 
This class contain:
- a private Hashtable<String, Integer>
- a public method reduce(ArrayList<String>), which 
    (a) load all the tokens of the ArrayList, passed as argument, into the Hashtable, 
    (b) count the number of  times (count)  each token appears in the ArrayList, and store each count in the Hashtable <key: token,        value:count>, 
    (c) creates a text file, which contain each token and its count, e.g., author: 15. Each line of the text file contain one such tuple.

The Reduce class host the main part, which drive the workflow of the application.
