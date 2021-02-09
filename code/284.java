class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iter;
    private Integer nextNum;
	  public PeekingIterator(Iterator<Integer> iterator) {
	    this.iter = iterator;
        nextNum = iterator.next();
  	}
	
    // Returns the next element in the iteration without advancing the iterator.
  	public Integer peek() {
        return nextNum;
  	}
	
	  // hasNext() and next() should behave the same as in the Iterator interface.
	  // Override them if needed.
	  @Override
	  public Integer next() {
        Integer returnVal = nextNum;
        if(iter.hasNext()){
            nextNum = iter.next();
        }
        else{
            nextNum = null;
        }
	    return returnVal;
  	}
	
	@Override
	public boolean hasNext() {
	    return nextNum != null;
	}
}
