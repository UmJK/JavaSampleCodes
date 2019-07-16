
class FixedArrayStack implements Stack{
	public Object[] arr;
	public int top=-1,rear =-1;
	
	public FixedArrayStack(int capacity) {
		arr = new Object[capacity];
	}
	@Override
	public void push(Object ele)
	{
		if(top==-1)
		{
			top = top+1;
			rear = rear+1;
			arr[rear] = ele;
		}
		else 
		{
			rear = rear+1;
			arr[rear] = ele;
		}
		System.out.println("element pushed is "+ele);
	}
	public Object pop() {
		rear = rear-1;
		if(rear ==-1)
		{
			System.out.println("Cant happen");
		}
		else {
			rear = rear-1;
			if(rear==-1)
			{
				top = -1;
			}
		}
		System.out.println("element popped is "+arr[rear+1]);
		return arr[rear+1];
	}
}

