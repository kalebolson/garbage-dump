����   7 N  coinJar  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this 	LcoinJar; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   KEnter number of quarters, dimes, nickels, and pennies, separated by spaces.
 " $ # java/io/PrintStream % & print (Ljava/lang/String;)V
  ( ) * nextInt ()I?�z�G�{ . java/lang/StringBuilder 0 Your total is $
 - 2  &
 - 4 5 6 append (D)Ljava/lang/StringBuilder;
 - 8 9 : toString ()Ljava/lang/String;
 " < = & println args [Ljava/lang/String; q I d n p Q D N scan Ljava/util/Scanner; 
totalCents total 
SourceFile coinJar.java !               /     *� �    
                    	      )     k6
66� Y� � :� � !� '<� '=� '>� '6h
h`h``6		� +k9
� � -Y/� 1
� 3� 7� ;�    
   6               %  +  1   8 # J $ S ' j (    p    k > ?   % F @ A  + @ B A  1 : C A  8 3 D A   g E A   c F A   ` G A   T H I  J ! J A 	 S  K F 
  L    M