����   7 X  	printSecs  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LprintSecs; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   8Enter hours, minutes, and seconds, separated by spaces: 
 " $ # java/io/PrintStream % & print (Ljava/lang/String;)V
  ( ) * nextInt ()I , java/lang/StringBuilder
 . 0 / java/lang/String 1 2 valueOf (I)Ljava/lang/String;
 + 4  & 6 	 hour(s) 
 + 8 9 : append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 + < 9 = (I)Ljava/lang/StringBuilder; ?  minute(s) and  A  second(s) comes out to  C  total seconds.
 + E F G toString ()Ljava/lang/String;
 " I J & println args [Ljava/lang/String; h I m s result 	HOUR_CONV MIN_CONV scan Ljava/util/Scanner; 
SourceFile printSecs.java !               /     *� �    
                    	           s6<6� Y� � :� � !� '<� '=� '>h<h``6� � +Y� -� 35� 7� ;>� 7� ;@� 7� ;B� 7� D� H�    
   * 
      	      #  )  /   = # r $    R    s K L   # P M N  ) J O N  / D P N  = 6 Q N   n R N  	 j S N   ^ T U   V    W