/*
======================================================================================================================
PROGRAM PURPOSE: The purpose of this program is to create a class that contains the following four methods: high, low,
                avg, and dailyTempDiff. The method high takes an integer array as a parameter, traverses the array to
                determine the maximum value in the array, and returns the maximum value. The method low takes an integer
                array as a parameter, traverses the array to determine the minimum value in the array, and then returns
                the minimum value. The average method takes an integer array as a parameter, calculates the average of
                the array elements, and returns the average value. Method dailyTempDiff functions to take two integer
                arrays as parameters, calculate the difference between the corresponding array elements, and then return
                an array containing the differences. In the main, the arrays highTemps and lowTemps are initlized with
                each containing either the expected daily high or low temperatures for Fevruary 2022. Each method is
                invoked with these arrays passed to parameters in order to find a max, min, and avg for each, as well
                as the dailyTempDiff which requires both arrays to be passed to the function. The results are clearly
                printed to the user in the process.
Name: John Daggs
Date: 2/11/2022
Section: CSC 331-002
======================================================================================================================
*/

class TemperaturesDaggsJohn {
    public static void main(String[] args) {

        int[] highTemps = {48, 48, 46, 66, 46, 46, 41, 42, 57, 60, 50, 50, 42, 35, 30, 35, 39, 39, 37, 51, 51, 51, 59, 66, 55, 48, 62, 75}; // initializing the array of the expected  high temperatures for February 2022
        int[] lowTemps = {35, 33, 30, 50, 33, 28, 33, 35, 30, 37, 37, 30, 39, 24, 19, 17, 24, 32, 33, 35, 35, 35, 39, 44, 48, 42, 42, 53}; // initializing the array of the expected low temperatures for February 2022

        System.out.print("The list of expected high temperatures for February 2022: \n"); // print statement preceeding the list of high temperatures
        for (int k = 0; k < highTemps.length; k++){ // for loop to loop through elements in the array
            System.out.print(highTemps[k]); // print out the current value of highTemps at element position k
            if (k != highTemps.length-1){ // if the element is not the last one in the array
                System.out.print(", "); // follow the value with a comma and a space
            }
        }
        System.out.print("\nThe list of expected low temperatures for February 2022: \n"); // print statement preceeding the list of low temperatures
        for (int k = 0; k < lowTemps.length; k++){ // for loop to loop through elements in the array
            System.out.print(lowTemps[k]); // print out the current value of highTemps at element position k
            if (k != lowTemps.length-1){ // if the element is not the last one in the array
                System.out.print(", "); // follow the value with a comma and a space
            }
        }

        System.out.print("\n-----------------------------------------------------------------------------------------\n");

        int maxHighTemp = high(highTemps); // initializing the variable maxHighTemp to the return of the function max using the array highTemps passed to parameter
        System.out.print("The MAXIMUM value of the list of expected HIGH temperatures for February 2022 is: " + maxHighTemp + "\n"); // print statement displaying the maximum of the array of high temps
        int maxLowTemp = high(lowTemps); // initializing the variable maxLowTemp to the return of the function max using the array lowTemps passed to parameter
        System.out.print("The MAXIMUM value of the list of expected LOW temperatures for February 2022 is: " + maxLowTemp + "\n"); // print statement displaying the maximum of the array of low temps

        System.out.print("-----------------------------------------------------------------------------------------\n");

        int minHighTemp = low(highTemps); // initializing the variable minHighTemp to the return of the function min using the array highTemps passed to parameter
        System.out.print("The MINUMUM value of the list of expected HIGH temperatures for February 2022 is: " + minHighTemp + "\n"); // print statement displaying the minimum of the array of high temps
        int minLowTemp = low(lowTemps); // initializing the variable minHighTemp to the return of the function min using the array highTemps passed to parameter
        System.out.print("The MINUMUM value of the list of expected LOW temperatures for February 2022 is: " + minLowTemp + "\n"); // print statement displaying the minimum of the array of low temps

        System.out.print("-----------------------------------------------------------------------------------------\n");

        int avgHighTemp = average(highTemps); // initializing the variable avgHighTemp to the return of the function average using the array highTemps passed to parameter
        System.out.print("The AVERAGE of the list of expected HIGH temperatures for February 2022 is: " + avgHighTemp + "\n"); // print statement displaying the average of the array of high temps
        int avgLowTemp = average(lowTemps); // initializing the variable avgLowTemp to the return of the function average using the array lowTemps passed to parameter
        System.out.print("The AVERAGE of the list of expected Low temperatures for February 2022 is: " + avgLowTemp + "\n"); // print statement displaying the average of the array of low temps

        System.out.print("-----------------------------------------------------------------------------------------\n");

        int[] difference = dailyTempDiff(highTemps, lowTemps); // initializing an array difference to the array returned by the function dailyTempDiff using the arrays highTemps and lowTemps passed to the parameters
        System.out.print ("The difference by day between the daily high and low temperatures is as follows: \n"); // print statement preceeding printing the difference array

        for (int k = 0; k < difference.length; k++){ // for loop to loop through the elements in the array
            System.out.print(difference[k]); // print the value of the array at element k
            if (k != difference.length-1){ // if the element last printed was not the last element in the array
                System.out.print(", "); // follow the value with a comma followed by a space
            }
        }
    }

    /**
    Takes an integer array as a parameter.
    Traverse the array to determine the maximum value in the array.
    Return the maximum value.
    */
    public static int high (int[] temps){

        int max = temps[0]; // initialize a max variable to the first element in the list passed to the parameter
        for (int k = 0; k < temps.length; k++) { // for loop to loop through elements of the array one by one
            if (max < temps[k]) {  // if the value of max is less than the value of temps at position k . . .
                max = temps[k]; // set max to the the value of temps at position k
            }
        }

        return max; // return the max value
    }

    /**
    Takes an integer array as a parameter.
    Traverse the array to determine the minimum value in the array.
    Return the minimum value.
     */
    public static int low(int[] temps){

        int min = temps[0]; // initialize min variable to the first element in the array passed to parameter temps[]
        for (int k = 0; k < temps.length; k++) { // for loop to loop through elements of the array one by one
            if (min > temps[k]) { // if the value of min is greater than the value of temps at position k
                min = temps[k]; // set min to the value of temps at position k
            }
        }
        return min; // return the min value
    }

    /**
    Takes an integer array as a parameter.
    Calculate the average of the array elements.
    Return the average value.
     */
    public static int average(int[] temps){

        int sum = 0; // initialize the variable sum to zero
        for (int k = 0; k < temps.length; k++){ // for loop to loop through elements of the array one by one
            sum += temps[k]; // add current value temps[k] to the sum - when loop complete, will be sum of all elements
        }
        int avg = sum/temps.length; // set average equal to the sum divided by the length of the array passed to temps

        return avg; // return the average value
    }

    /**
    Takes two integer arrays as parameters.
    Calculates the difference between the corresponding array elements.
    Returns an array containing the differences.
     */
    public static int[] dailyTempDiff(int[] temps1, int[] temps2){

        int[] differenceArray = new int[temps1.length]; // initializing empty array differenceArray to contain differences, with same length as the array passed to temps1[]
        for (int k = 0; k < temps1.length; k++){  // for loop to loop through elements of the arrays
                differenceArray[k] = temps1[k]-temps2[k]; // set the value of differenceArray at position k equal to the value of temps1[k] minus temps2[k]
            }

        return differenceArray; // return the array containg the difference
        }

    }
