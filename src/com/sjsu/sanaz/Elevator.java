package com.sjsu.sanaz;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by sanazk on 9/17/18.
 */
public class Elevator {

    public class Request{
        int requestTimeStamp;
        int currentFloor;
        int requestedFloor;
         String direction;


        public Request(int time, int cFloor, int rFloor){
            this.currentFloor = cFloor;
          //  this.direction = dir;
            this.requestTimeStamp = time;
            this.requestedFloor = rFloor;
        }

    }

    String[] elevatorDirection = {"UP", "DOWN"};
    boolean state = false;
    Queue<Request> upRequest = new PriorityQueue<>();
    Queue<Request> downRequest = new PriorityQueue<>();

    String determineRequestDirection(int currentFloor, int requestedFloor){
        if(requestedFloor > currentFloor){
            return "UP";
        }else{
            return "DOWN";
        }
    }

    void getAllRequest(Request r){
        if(determineRequestDirection(r.currentFloor, r.requestedFloor) == "UP"){
            upRequest.add(r);
        }else{
            downRequest.add(r);
        }
    }

  /*  Request[] handleRequests(Queue<Request> upRequest, Queue<Request> downRequest){
        Request r1 = upRequest.peek();
        Request r2 = downRequest.peek();

        if(state == false){
            if(r1.requestTimeStamp > r2.requestTimeStamp){

            }
        }
    } */

}
