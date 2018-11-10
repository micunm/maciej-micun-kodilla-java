class Element {
	private String value;
	private Element next;
	private Element prev;
	
	public Element (String value) {
		this.value=value;	
	}
	
	public String getValue () {
		return this.value;	
	}
	
	public Element getPrevElem () {
		return this.prev;
	}
	public Element getNextElem () {
		return this.next;		
	}	

	public void setPrevElem (Element prev) {
		this.prev=prev;		
	}
	public void setNextElem (Element next) {
		this.next=next;	
	}		
}

class StringCollection {
	private Element collectionHead;
	
	public String getElement(int n) {
		Element temp2 = collectionHead;

		if (n==0) {
			temp2=collectionHead;	
		} else {
			for(int i=0; i<n; i++) {
    			temp2 = temp2.getNextElem();  			
			}
		}
		return temp2.getValue();	
	}
	
	public void addElement(String s) {		
		Element elementToAdd=new Element(s);
		Element temp = collectionHead;
		
		if (collectionHead==null) {
			collectionHead=elementToAdd;
			collectionHead.setNextElem(null);
			collectionHead.setPrevElem(null);			
		} else if (collectionHead!=null && collectionHead.getNextElem()==null)  {
			elementToAdd.setPrevElem(collectionHead);
			collectionHead.setNextElem(elementToAdd);
		} else if (collectionHead!=null && collectionHead.getNextElem()!=null) { 
			while(temp.getNextElem()!=null) {
    			temp = temp.getNextElem();
			}
			elementToAdd.setPrevElem(temp);
			temp.setNextElem(elementToAdd);
		}		
	}
	
	boolean removeElement(String s) {
		boolean isFindElement=false;
		Element tempValue=collectionHead;
		
		if (collectionHead==null) {
			isFindElement=false;
		} else if (collectionHead.getValue()==s && collectionHead.getNextElem()!=null) {
			isFindElement=true;
			collectionHead=collectionHead.getNextElem();
			collectionHead.setPrevElem(null);
		} else if (collectionHead.getValue()==s && collectionHead.getNextElem()==null) {
			isFindElement=true;
			collectionHead=null;
		} else if (collectionHead!=null && collectionHead.getValue()!=s && collectionHead.getNextElem()!=null) {
			while (tempValue.getNextElem()!=null) {
				tempValue=tempValue.getNextElem();
				if (tempValue.getValue()==s) {
					isFindElement=true;
					if (tempValue.getNextElem()!=null) {
						tempValue.getPrevElem().setNextElem(tempValue.getNextElem());
						tempValue.getNextElem().setPrevElem(tempValue.getPrevElem());
					} else {
						tempValue.getPrevElem().setNextElem(null);						
					}
					break;
				}
			}
		} else {
			isFindElement=false;
		}
		return isFindElement;
	}
}

class Kodilla {
   public static void main (String[] args) {
       // your code goes here
       StringCollection myCollection=new StringCollection();
       myCollection.addElement("jajko");
       myCollection.addElement("drewno");
       myCollection.addElement("ogórek");
       myCollection.addElement("papryka");
       myCollection.addElement("siano");
       
       System.out.println("element o indeksie nr 0: "+myCollection.getElement(0));
       System.out.println("element o indeksie nr 1: "+myCollection.getElement(1));
       System.out.println("element o indeksie nr 2: "+myCollection.getElement(2));
       System.out.println("element o indeksie nr 3: "+myCollection.getElement(3));
       System.out.println("element o indeksie nr 4: "+myCollection.getElement(4));
       
       System.out.println("usunięto element drewno: "+myCollection.removeElement("drewno"));       
       System.out.println("usunięto element ogórek: "+myCollection.removeElement("ogórek"));

       System.out.println("element o indeksie nr 0: "+myCollection.getElement(0));       
       System.out.println("element o indeksie nr 1: "+myCollection.getElement(1));
       System.out.println("element o indeksie nr 2: "+myCollection.getElement(2));    
       
       myCollection.addElement("jedzenie");      
       System.out.println("element o indeksie nr 3: "+myCollection.getElement(3));  
       
       System.out.println("usunięto element jajko: "+myCollection.removeElement("jajko"));
       
       System.out.println("element o indeksie nr 0: "+myCollection.getElement(0));
       System.out.println("element o indeksie nr 1: "+myCollection.getElement(1));
       
       System.out.println("usunięto element jedzenie: "+myCollection.removeElement("jedzenie"));
       
       System.out.println("element o indeksie nr 1: "+myCollection.getElement(1));
       myCollection.addElement("tablica");  
       System.out.println("element o indeksie nr 2: "+myCollection.getElement(2));   
   }
}