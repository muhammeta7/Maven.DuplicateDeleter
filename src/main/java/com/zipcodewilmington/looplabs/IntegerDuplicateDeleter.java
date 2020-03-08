package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length ; i++) {
            int counter = countOccurences(i);
            if(counter < maxNumberOfDuplications){
                sb.append(array[i]);
            }
        }
        return stringToIntegerArray(sb.toString());

    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            int counter = countOccurences(i);
            if (counter != exactNumberOfDuplications) {
                sb.append(array[i]);
            }
        }
        return stringToIntegerArray(sb.toString());

    }

    public Integer[] stringToIntegerArray(String value) {

        String[] stringArray = value.split("");
        Integer[] intArray = new Integer[stringArray.length];

        if (!stringArray[0].equals("")) {
            for (int i = 0; i < stringArray.length; i++) {
                intArray[i] = Integer.valueOf(stringArray[i]);
            }
            return intArray;
        } else {
            return new Integer[0];
        }

    }

}
