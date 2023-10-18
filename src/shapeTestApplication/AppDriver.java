package shapeTestApplication;

import ShapeDomain.Shape;
import comparableVsComparator.BaseareaCompare;
import comparableVsComparator.VolumeCompare;
import utilities.BubbleSort;
import utilities.SelectionSort;
import utilities.InsertionSort;
import utilities.QuickSort;
import utilities.MergeSort;
import utilities.HeapSort;

public class AppDriver {
    public static void main(String[] args) throws Exception {

        ShapeManager shapeManager = new ShapeManager();

        // Create the comparators for sorting the shapes by base area and volume
        
        BaseareaCompare bc = new BaseareaCompare();
        VolumeCompare vc = new VolumeCompare();

        // Get the shape list
        Shape[] testingShapeList = shapeManager.getShapeList();

        // Print the height of shape in shape list before sorting
        System.out.println("Before sorting: ");
        ShapeManager.printShapeList(testingShapeList, "height");
        
        //print class,height and volume of the shape in shape list
        System.out.println("Shape in shape list: ");
        for (Shape shape : testingShapeList) {
            System.out.println(shape);
        }


        // Sort the shape list by height using BubbleSort sort
        System.out.println("After BubbleSort: ");
    
        BubbleSort<Shape> BubbleSort = new BubbleSort<Shape>();
        BubbleSort.bubbleSort(testingShapeList);
        ShapeManager.printShapeList(testingShapeList, "height");
      

        // Reset the shape list
        testingShapeList = shapeManager.getShapeList();

        // Sort the shape list by base area using BubbleSort sort
        System.out.println("After BubbleSort: ");
        BubbleSort.bubbleSort(testingShapeList, bc);
        ShapeManager.printShapeList(testingShapeList, "basearea");

        // Reset the shape list
        testingShapeList = shapeManager.getShapeList();

        // Sort the shape list by volume using BubbleSort sort
        System.out.println("After BubbleSort: ");
        BubbleSort.bubbleSort(testingShapeList, vc);
        ShapeManager.printShapeList(testingShapeList, "volume");

        // Reset the shape list
        testingShapeList = shapeManager.getShapeList();

    


    

       
      





    


    }
}
