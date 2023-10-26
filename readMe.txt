readMe.txt

Sorting Program - TeamRiju
Read Me
Date: October 19, 2023

A) Introduction

This is the Sorting Program by TeamRiju. Designed for Eclipse, this application allows users to sort shapes based on various attributes like volume, base area, and height. Multiple sorting algorithms have been integrated to offer both flexibility and a means to compare performances.


B) Setting Up in Eclipse

Prerequisites:
* Eclipse IDE with Java Development Tools (JDT) installed.
* Java Runtime Environment (JRE) version 8 or above.

Steps:
1. Download cprg304-Assignment01-TeamRiju-main.zip from D2L.
2. Extract the contents of the ZIP file.
3. Open Eclipse IDE.
4. Click on File > Import.
5. Choose General > Existing Projects into Workspace.
6. Select the directory where you extracted the ZIP file.
7. Ensure that the project is selected in the Projects list and then click Finish.


C) Setting Up the data file
1. Download textData.zip from D2L.
2. Extract the contents of the ZIP file.
3. Save polyNameBig.txt into the above folder cprg304-Assignment01-TeamRiju-main 


D1) Running the Program in <Command Line>
1. Open Command Prompt
2. Change the directory to the folder cprg304-Assignment01-TeamRiju-main
3. Configure the program arguments:

* -f [path_to_shapes_file]: Specifies the path to the file containing shapes data.
* -t [type]: Options are v (volume), a (base area), or h (height).
* -s [sorting_method]: Choose from b, s, i, m, q, and z for BubbleSort, SelectionSort, InsertionSort, MergeSort, QuickSort, and HeapSort respectively.

Example:
To run the application in Java, inpu commandline as program arguments as: 
java -jar sort.jar -fpolyNameBIG.txt -Ta -Sb

This command will sort the shapes from the polyNameBig.txt file using BubbleSort(b) based on their base area(a).


D2) Running the Program in <Eclipse>

1. In the Eclipse IDE, click Run in the menu bar
2. select Run Configurations
3. Main > Project: select cprg304-Assignment01-TeamRiju-main
4. Main > Main Class: select AppDriver - ShapeTestApplication
5. Configure the program arguments:
6. Run

* -f [path_to_shapes_file]: Specifies the path to the file containing shapes data.
* -t [type]: Options are v (volume), a (base area), or h (height).
* -s [sorting_method]: Choose from b, s, i, m, q, and z for BubbleSort, SelectionSort, InsertionSort, MergeSort, QuickSort, and HeapSort respectively.

Example:
To run the application in Eclipse, set the program arguments as: 
-fpolyNameBIG.txt -Ta -Sb

This command will sort the shapes from the polyNameBig.txt file using BubbleSort(b) based on their base area(a).


E) Supported Sorting Algorithms

* BubbleSort (b): Simple comparison-based sorting mechanism.
* SelectionSort (s): Picks the minimum/maximum element from the list and swaps it with the first element.
* InsertionSort (i): Constructs the sorted list one item at a time.
* MergeSort (m): Splits the list into halves, sorts them individually, and then combines the sorted halves.
* QuickSort (q): Segregates the list using a pivot, then sorts the divided lists.
* HeapSort (z): Constructs a heap and subsequently sorts the elements.


F) Troubleshooting in Eclipse

* Issue: Program doesn't start.
* Solution: Ensure Eclipse is configured with the necessary JRE version.

* Issue: File not located error.
* Solution: Double-check that the path set for the shapes file within Eclipse is accurate.