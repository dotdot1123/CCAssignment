package CCchapter3;

import java.util.EmptyStackException;

public class solution01 {
	
 class ThreeStacks{
		//define variables
		private int numberOfStacks = 3;
		private int stackCapacity;
		private int[] values;
		private int[] sizes;
		
			// 1.Constructor
			public ThreeStacks(int stackSize){
				stackCapacity = stackSize;
				values = new int[stackSize*numberOfStacks];
				sizes = new int[numberOfStacks];
			}
		
	
			//2.push() push value onto stack
			public void push(int stackNumber,int value) throws FullStackException{
				
				if(isFull(stackNumber)){
					throw new FullStackException();
				}
				
				sizes[stackNumber]++;
				values[indexOfTop(stackNumber)] = value;
			}
		
			
		
			// 3. pop()  pop item from top stack
			public int pop(int stackNumber){
				if(isEmpty(stackNumber)){
					throw new EmptyStackException();
				}
	
			int topIndex = indexOfTop(stackNumber);
			int value = values[topIndex];  //get top
			values[topIndex] = 0;  //clear
			sizes[stackNumber]--;   //shrink
			return value;
			}
			
			// 4. peek()  return top element
			public int peek(int stackNumber){
				if(isEmpty(stackNumber)){
					throw new EmptyStackException();
				}
				return  values[indexOfTop(stackNumber)];
			}
			
			//5. isEmpty() return if stack is empty
			public boolean isEmpty(int stackNumber){
				return sizes[stackNumber] == 0;
				
			}
			
			//6. isFull() return if stack is full
			public boolean isFull(int stackNumber){
				return sizes[stackNumber] == stackCapacity;
			}
			
			//7. indexOfTop() 
			private int indexOfTop(int stackNumber){
				int offset = stackNumber * stackCapacity;
				int size = sizes[stackNumber];
				return offset + size -1;
			}
	
			
	}
}
	

