package org.example.practice.arrays;

public class JustOneMistake {
    public static void main(String[] args) {
        String[] fruits = {"bana","apple","mongg","mongo","banaba","pineapp"};
        String findFruit = "mango";
        findClosedWord(fruits, findFruit);
    }

    public static void findClosedWord(String[] fruits, String fruit){
        String gotFruit = "";
        for (String aFruit : fruits){

            if (aFruit.length() == fruit.length()){
                int count = 0;
                for (int i = 0; i < fruit.length(); i++){

                    if (aFruit.charAt(i) != fruit.charAt(i)){
                        count++;
                    }
                }
                if (count<=1){
                    gotFruit = aFruit;
                }

            }

        }

        if (gotFruit.isEmpty()) {
            System.out.println("no similar word found");
        } else {
            System.out.println("the closest word found is : "+gotFruit);
        }
    }
}
