package com.bell.b11.day8.exceptions;

import java.time.LocalDate;
import java.util.Scanner;

public class AmazonCheckoutDemo {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Provide cvv");
        String cvv = scan.next();
        System.out.println("Provide Date in MM-YYYY format");
        String userDate = scan.next();

        String[]  dateArray = userDate.split("-");
        String monthStr = dateArray[0];
        String yearStr = dateArray[1];

        int month = Integer.parseInt(monthStr);
        int year = Integer.parseInt(yearStr);

        LocalDate userDateFromat = LocalDate.of(year,month,1);
        System.out.println(userDateFromat);

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        try{
            evaluateCreditCard(userDateFromat, currentDate, cvv);
        }
        catch (InvalidExpirationDateException ied){
            System.out.println(ied);
        }
        catch (InvalidCvvException ice){
            System.out.println(ice);
        }
    }
    private static void evaluateCreditCard(LocalDate userDateFromat, LocalDate currentDate, String cvv) throws InvalidExpirationDateException, InvalidCvvException {
        if(cvv.length() ==3){
            if(currentDate.compareTo(userDateFromat)<0){
                System.out.println("Thank you, your order has been processed");
            }else{
                throw new InvalidExpirationDateException();
            }
        }else{
            throw new InvalidCvvException();
        }

    }
}
