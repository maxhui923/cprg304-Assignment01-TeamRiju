/**
 * Created on Oct 14, 2023
 *
 * Project: cprg304-Assignment01-TeamRiju
 */

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

/**
 * The main application class for sorting shapes and benchmarking sorting
 * algorithms.
 */
public class AppDriver {
    public static void main(String[] args) throws Exception {
        // Parse command line arguments into a map
        Map<String, String> argMap = parseArguments(args);

        // Initialize a ShapeManager to manage shapes
        ShapeManager shapeManager = new ShapeManager();

        // Load shapes from the specified file
        shapeManager.fillShapeList(argMap.get("file"));

        // Get the list of shapes to be sorted
        Shape[] testingShapeList = shapeManager.getShapeList();

        // Determine the sort type
        String sortType = argMap.get("sort");
        Comparator<Shape> comparator;

        // Choose the appropriate comparator based on the provided type
        switch (argMap.get("type")) {
            case "v":
                comparator = new VolumeCompare();
                break;
            case "a":
                comparator = new BaseareaCompare();
                break;
            case "h":
                comparator = null; // No sorting
                break;
            default:
                System.out.println("Invalid type provided: " + argMap.get("type"));
                return;
        }

        // Record the start time for benchmarking
        long startTime = System.currentTimeMillis();

        // Sort the shapes using the selected method
        benchmarkSort(sortType, testingShapeList, comparator);

        // Record the end time for benchmarking
        long endTime = System.currentTimeMillis();
        long sortTime = endTime - startTime;

        // Print the selected values from the sorted list
        printSelectedValues(testingShapeList);

        // Print the sort method and the time it took
        System.out.println(getSortFullName(sortType) + " sort took " + sortTime + " milliseconds.");
    }

    /**
     * Parse command line arguments and return a map of key-value pairs.
     * 
     * @param args The command line arguments.
     * @return A map containing the parsed arguments.
     * @throws Exception if there are issues with the arguments.
     */
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
                    if (i + 1 < args.length && (args[i + 1].equalsIgnoreCase("v") || args[i + 1].equalsIgnoreCase("h")
                            || args[i + 1].equalsIgnoreCase("a"))) {
                        argMap.put("type", args[i + 1].toLowerCase());
                        i++;
                    } else {
                        throw new Exception("Invalid type provided after -t");
                    }
                    break;
                case "-s":
                    if (i + 1 < args.length && (args[i + 1].equalsIgnoreCase("b") || args[i + 1].equalsIgnoreCase("s")
                            || args[i + 1].equalsIgnoreCase("i") || args[i + 1].equalsIgnoreCase("m")
                            || args[i + 1].equalsIgnoreCase("q") || args[i + 1].equalsIgnoreCase("z"))) {
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
                        if (sort.equalsIgnoreCase("b") || sort.equalsIgnoreCase("s") || sort.equalsIgnoreCase("i")
                                || sort.equalsIgnoreCase("m") || sort.equalsIgnoreCase("q")
                                || sort.equalsIgnoreCase("z")) {
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
    }

    // Benchmark the specified sorting method and comparator
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

    // Map sort type codes to their full names
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

    // Print selected values from the sorted shape list
    public static void printSelectedValues(Shape[] shapes) {
        System.out.println("First value: \n" + shapes[0]);
        for (int i = 1000; i < shapes.length; i += 1000) {
            System.out.println("Value at index " + i + ": \n" + shapes[i]);
        }
        System.out.println("Last value: \n" + shapes[shapes.length - 1]);
    }
}
