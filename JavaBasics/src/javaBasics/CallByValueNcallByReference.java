package javaBasics;

class CallByValueNcallByReference{  
    int data=50;  
     
    void change(int data){  
    data=data+100;//changes will be in the local variable only  
    }
    
    void change2(CallByValueNcallByReference op2){  
        data=data+100;//changes will be in the instance variable  
        }
        
    public static void main(String args[]){  
    	CallByValueNcallByReference op=new CallByValueNcallByReference();  
     
      System.out.println("before change "+op.data);  
      op.change(500);  
      System.out.println("after change "+op.data); 
      
      CallByValueNcallByReference op2=new CallByValueNcallByReference();
      System.out.println("before change "+op2.data);  
      op2.change2(op2);  
      System.out.println("after change "+op2.data); 
      
     
    }  
   }  

