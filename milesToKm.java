����   7 P  	milesToKm  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LmilesToKm; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V?�����	      out Ljava/io/PrintStream; " Enter a value for miles:
 $ & % java/io/PrintStream ' ( println (Ljava/lang/String;)V
  * + , 
nextDouble ()D . java/lang/StringBuilder
 0 2 1 java/lang/String 3 4 valueOf (D)Ljava/lang/String;
 - 6  ( 8  miles is equal to 
 - : ; < append -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 - > ; ? (D)Ljava/lang/StringBuilder; A  Kilometers.
 - C D E toString ()Ljava/lang/String; args [Ljava/lang/String; scan Ljava/util/Scanner; mi D km KILO_CONVERT 
SourceFile milesToKm.java !               /     *� �    
       
             	       �     H� Y� � L 9� !� #+� )I( k9� � -Y(� /� 57� 9� =@� 9� B� #�    
                $   G !    4    H F G    = H I   + J K  $ $ L K   8 M K   N    O