package shapeTestApplication;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

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
    	Map<String, String> argMap = parseArguments(args);

        ShapeManager shapeManager = new ShapeManager();

        shapeManager.fillShapeList(argMap.get("file"));

        Shape[] testingShapeList = shapeManager.getShapeList();

        String sortType = argMap.get("sort");
        Comparator<Shape> comparator; 
        
        switch (argMap.get("type")) {
	        case "v":
	            comparator = new VolumeCompare();
	            break;
	        case "a":
	            comparator = new BaseareaCompare();
	            break;
	        case "h":
	        	comparator = null;
	            break;
	        default:
	            System.out.println("Invalid type provided: " + argMap.get("type"));
	            return;
	    }
        long startTime = System.currentTimeMillis();
        benchmarkSort(sortType, testingShapeList, comparator);
        long endTime = System.currentTimeMillis();
        long sortTime = endTime - startTime;
        printSelectedValues(testingShapeList);
        
        System.out.println(getSortFullName(sortType) + " sort took " + sortTime + " milliseconds.");

    }
    public static Map<String, String> parseArguments(String[] args) throws Exception {
        Map<String, String> argMap = new HashMap<>();

        for (int i = 0; i < args.length; i++) {
            switch (args[i].toLowerCase()) {
                case "-f":
                    if (i + 1 < args.length) {
                        argMap.put("file", args[i + 1]);
                        i++;
                    } else {
                        throw new Exception("File path not provided after -f");
                    }
                    break;
                case "-t":
                    if (i + 1 < args.length && (args[i + 1].equalsIgnoreCase("v") || args[i + 1].equalsIgnoreCase("h") || args[i + 1].equalsIgnoreCase("a"))) {
                        argMap.put("type", args[i + 1].toLowerCase());
                        i++;
                    } else {
                        throw new Exception("Invalid type provided after -t");
                    }
                    break;
                case "-s":
                    if (i + 1 < args.length && (args[i + 1].equalsIgnoreCase("b") || args[i + 1].equalsIgnoreCase("s") || args[i + 1].equalsIgnoreCase("i") || args[i + 1].equalsIgnoreCase("m") || args[i + 1].equalsIgnoreCase("q") || args[i + 1].equalsIgnoreCase("z"))) {
                        argMap.put("sort", args[i + 1].toLowerCase());
                        i++; 
                    } else {
                        throw new Exception("Invalid sort method provided after -s");
                    }
                    break;
                default:
                    if (args[i].toLowerCase().startsWith("-f")) {
                        String filePath = args[i].substring(2); // skip "-f"
                        argMap.put("file", filePath);
                    } else if (args[i].toLowerCase().startsWith("-t")) {
                        String type = args[i].substring(2); // skip "-t"
                        if (type.equalsIgnoreCase("v") || type.equalsIgnoreCase("h") || type.equalsIgnoreCase("a")) {
                            argMap.put("type", type.toLowerCase());
                        } else {
                            throw new Exception("Invalid type provided: " + type);
                        }
                    } else if (args[i].toLowerCase().startsWith("-s")) {
                        String sort = args[i].substring(2); // skip "-s"
                        if (sort.equalsIgnoreCase("b") || sort.equalsIgnoreCase("s") || sort.equalsIgnoreCase("i") || sort.equalsIgnoreCase("m") || sort.equalsIgnoreCase("q") || sort.equalsIgnoreCase("z")) {
                            argMap.put("sort", sort.toLowerCase());
                        } else {
                            throw new Exception("Invalid sort method provided: " + sort);
                        }
                    } else {
                        throw new Exception("Invalid argument provided: " + args[i]);
                    }
                    break;
            }
        }
        
        return argMap;
        
//      Testing Code
        
//      ShapeManager shapeManager = new ShapeManager();
//
//      // Create the comparators for sorting the shapes by base area and volume
//      
//      BaseareaCompare bc = new BaseareaCompare();
//      VolumeCompare vc = new VolumeCompare();
//
//      // Get the shape list
//      Shape[] testingShapeList = shapeManager.getShapeList();
//
//      // Print the height of shape in shape list before sorting
//      System.out.println("Before sorting: ");
//      ShapeManager.printShapeList(testingShapeList, "height");
//      
//      //print class,height and volume of the shape in shape list
//      System.out.println("Shape in shape list: ");
//      for (Shape shape : testingShapeList) {
//          System.out.println(shape);
//      }
//
//
//      // Sort the shape list by height using BubbleSort sort
//      System.out.println("After BubbleSort: ");
//  
//      BubbleSort<Shape> BubbleSort = new BubbleSort<Shape>();
//      BubbleSort.bubbleSort(testingShapeList);
//      ShapeManager.printShapeList(testingShapeList, "height");
//    
//
//      // Reset the shape list
//      testingShapeList = shapeManager.getShapeList();
//
//      // Sort the shape list by base area using BubbleSort sort
//      System.out.println("After BubbleSort: ");
//      BubbleSort.bubbleSort(testingShapeList, bc);
//      ShapeManager.printShapeList(testingShapeList, "basearea");
//
//      // Reset the shape list
//      testingShapeList = shapeManager.getShapeList();
//
//      // Sort the shape list by volume using BubbleSort sort
//      System.out.println("After BubbleSort: ");
//      BubbleSort.bubbleSort(testingShapeList, vc);
//      ShapeManager.printShapeList(testingShapeList, "volume");
//
//      // Reset the shape list
//      testingShapeList = shapeManager.getShapeList();
    }
    
    private static void benchmarkSort(String sortType, Shape[] shapes, Comparator<Shape> comparator) {
        long startTime = System.currentTimeMillis();

        switch (sortType) {
        case "b":
            if (comparator == null) {
                new BubbleSort<Shape>().bubbleSort(shapes);
            } else {
                new BubbleSort<Shape>().bubbleSort(shapes, comparator);
            }
            break;
        case "s":
            if (comparator == null) {
                new SelectionSort<Shape>().selectionSort(shapes);
            } else {
                new SelectionSort<Shape>().selectionSort(shapes, comparator);
            }
            break;
        case "i":
            if (comparator == null) {
                new InsertionSort<Shape>().insertionSort(shapes);
            } else {
                new InsertionSort<Shape>().insertionSort(shapes, comparator);
            }
            break;
        case "m":
            if (comparator == null) {
                new MergeSort<Shape>().mergeSort(shapes);
            } else {
                new MergeSort<Shape>().mergeSort(shapes, comparator);
            }
            break;
        case "q":
            if (comparator == null) {
                new QuickSort<Shape>().quickSort(shapes);
            } else {
                new QuickSort<Shape>().quickSort(shapes, comparator);
            }
            break;
        case "z":
            if (comparator == null) {
                new HeapSort<Shape>().heapSort(shapes);
            } else {
                new HeapSort<Shape>().heapSort(shapes, comparator);
            }
            break;
        default:
            System.out.println("Invalid sort type provided: " + sortType);
            return;
        }
    }
    
    private static String getSortFullName(String sortType) {
        switch (sortType) {
            case "b":
                return "Bubble Sort";
            case "s":
                return "Selection Sort";
            case "i":
                return "Insertion Sort";
            case "m":
                return "Merge Sort";
            case "q":
                return "Quick Sort";
            case "z":
                return "Heap Sort";
            default:
                return "Unknown Sort";
        }
    }
    
    public static void printSelectedValues(Shape[] shapes) {
        System.out.println("First value: \n" + shapes[0]);
        for (int i = 1000; i < shapes.length; i += 1000) {
            System.out.println("Value at index " + i + ": \n" + shapes[i]);
        }
        System.out.println("Last value: \n" + shapes[shapes.length - 1]);
    }


}
