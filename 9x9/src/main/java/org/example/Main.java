package org.example;


class Main {
	public static void main(String[] args) {
        for(int i = 1; i<10; i++) {

            for(int j = i; j<10; j++) {
                System.out.printf("%d x %d = %-2d  ", i , j , i * j );
            }
            System.out.print("\n");
        }
    }

}