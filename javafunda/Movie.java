package com.javafunda;

import java.util.Scanner;
/**
 * @author vchimakurthi
 * program to take movie details from user and display them
 *
 */
public class Movie{
    public static void main(String[] args){
        Scanner read= new Scanner(System.in);
        System.out.println("enter movie id:");
        int movieId = read.nextInt();
        System.out.println("enter movie name");
        String movieName= read.next();
        System.out.println("enter movie description");
        String movieDescription= read.next();
        System.out.println("enter movie language");
        String movieLanguage= read.next();
        System.out.println("enter movie genre");
        String movieGenre= read.next();
        System.out.println("enter movie release date:");
        String movieReleasedate= read.next();
        System.out.println("enter movie seat cost:");
        float movieSeatCost= read.nextFloat();
        System.out.println("enter your gender:");
        char gender =read.next().charAt(0);
        System.out.println("Movie ID:"+movieId);
        System.out.println("Movie Name:"+movieName);
        System.out.println("Movie Description:"+movieDescription);
        System.out.println("Movie Language:"+movieLanguage);
        System.out.println("Movie Genre:"+movieGenre);
        System.out.println("Movie Date:"+movieReleasedate);
        System.out.println("Movie Seat Cost:"+movieSeatCost);
        System.out.println("gender:"+gender);
        read.close();
        
        
    }
}