/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CorridaDeMotos;

/**
 *
 * @author Admin
 */
 public class Moto {
     
     iMotor motor;
     
      Moto(iMotor m ){
      this.motor = m;
     }
     public String acelerar (){
         return this.motor.acelerar();
     }
 }
