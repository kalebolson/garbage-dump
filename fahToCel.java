����   7 U  fahToCel  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this 
LfahToCel; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   &What is the temperature in Fahrenheit?
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * 
nextDouble ()D , java/lang/StringBuilder . You entered 
 + 0  &
 + 2 3 4 append (D)Ljava/lang/StringBuilder; 6 	 as temp.
 + 8 3 9 -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 + ; < = toString ()Ljava/lang/String;@@      ?�������
 C E D java/lang/String F G valueOf (D)Ljava/lang/String; I   degrees Fahrenheit is equal to  K  degrees Celcius args [Ljava/lang/String; scan Ljava/util/Scanner; f D c 
SourceFile fahToCel.java !               /     *� �    
       
             	       �     b� Y� � L� � !+� 'I� � +Y-� /(� 15� 7� :� !( >g @o9� � +Y(� B� /H� 7� 1J� 7� :� !�    
              3  >  a     *    b L M    W N O   J P Q  > $ R Q   S    T