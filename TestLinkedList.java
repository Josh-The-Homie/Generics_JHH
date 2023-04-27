
public class TestLinkedList {

	public static void main(String[] args) {
		
		LinkedList myList=new LinkedList();
		
		Node aNode=new Node();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new Node();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		Node tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);
		
		GenericLinkedList<Integer> myGenericList=new GenericLinkedList<Integer>();
		GenericLinkedList<Double> myGenericListdouble=new GenericLinkedList<Double>();
		GenericLinkedList<String> myGenericListstring=new GenericLinkedList<String>();
		GenericNode<Integer> aGenericNodeinteger=new GenericNode<Integer>();
		GenericNode<String> aGenericNodestring=new GenericNode<String>();
		GenericNode<Double> aGenericNodeDouble=new GenericNode<Double>();
		aGenericNodeinteger.setData(12);
		aGenericNodestring.setData("Something");
		aGenericNodeDouble.setData(23.3);
		myGenericList.addNode(aGenericNodeinteger);
		myGenericListdouble.addNode(aGenericNodeDouble);
		myGenericListstring.addNode(aGenericNodestring);
		
		GenericNode<Integer> tempnodeInteger = myGenericList.getList();
	    while (tempnodeInteger != null) {
	        System.out.println(tempnodeInteger.getobj());
	        tempnodeInteger = tempnodeInteger.getNextNode();
	    }

	    GenericNode<String> tempnodeString = myGenericListstring.getList();
	    while (tempnodeString != null) {
	        System.out.println(tempnodeString.getobj());
	        tempnodeString = tempnodeString.getNextNode();
	    }

	    GenericNode<Double> tempnodeDouble = myGenericListdouble.getList();
	    while (tempnodeDouble != null) {
	        System.out.println(tempnodeDouble.getobj());
	        tempnodeDouble = tempnodeDouble.getNextNode();
	    }
		

	}//end main

}//end class
