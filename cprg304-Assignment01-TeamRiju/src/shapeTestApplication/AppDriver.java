package shapeTestApplication;

import ShapeDomain.Shape;
import comparableVsComparator.BaseareaCompare;
import comparableVsComparator.VolumeCompare;
import utilities.BubbleSort;
import utilities.SelectionSort;
import utilities.InsertionSort;

public class AppDriver {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        ShapeManager shapeManager = new ShapeManager();

        // Create the comparators for sorting the shapes by base area and volume
        
        BaseareaCompare bc = new BaseareaCompare();
        VolumeCompare vc = new VolumeCompare();

        // Get the shape list
        Shape[] testingShapeList = shapeManager.getShapeList();

        // Print the shape list before sorting
        System.out.println("Before sorting: ");
        ShapeManager.printShapeList(testingShapeList, "height");



        System.out.println("After BubbleSort: ");
    
        BubbleSort<Shape> BubbleSort = new BubbleSort<Shape>();
        BubbleSort.bubbleSort(testingShapeList);

      
        ShapeManager.printShapeList(testingShapeList, "height");
      

        // Reset the shape list
        testingShapeList = shapeManager.getShapeList();





    


    }
}
