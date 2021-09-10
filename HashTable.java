package HashMap;

import LinkedList.LinkedList;

public class HashTable<k,v> {
	LinkedList<k> LinkedList;
	
	public HashTable() {
		this.LinkedList = new LinkedList<>();
	}

	public void add(k key, v value) {
		MyMapNode<k,v> myMapNode = (MyMapNode<k,v>) this.LinkedList.searchNode(key);
		if(myMapNode == null) {
			myMapNode = new MyMapNode<>(key,value);
			this.LinkedList.append(myMapNode);
		}else {
			myMapNode.setValue(value);
		}
	}

	public v get(k key) {
		MyMapNode<k, v> myMapNode = (MyMapNode<k, v>) this.LinkedList.searchNode(key);
		return (myMapNode == null) ? null : myMapNode.getValue();
	}

	public String toString() {
		return "HashNode{" + LinkedList.printNodes() + '}';
	}
}
