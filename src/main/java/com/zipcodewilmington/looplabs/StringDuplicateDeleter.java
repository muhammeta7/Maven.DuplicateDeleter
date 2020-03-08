package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {

    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            int counter = countDuplicates(i);
            if (counter < maxNumberOfDuplications) {
                sb.append(array[i]).append(" ");
            }
        }

        String[] answer = sb.toString().split(" ");
        if ("".equals(answer[0])) {
            return new String[0];
        } else {
            return answer;
        }

    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            int counter = countDuplicates(i);

            if (counter != exactNumberOfDuplications) {
                sb.append(array[i]).append(" ");
            }
        }
        return sb.toString().split(" ");

    }

}


