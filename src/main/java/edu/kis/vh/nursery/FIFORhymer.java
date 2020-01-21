package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

	public final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

	@Override
	public int countOut() {
		while (!callCheck())
			temp.push(super.countOut());
		int ret = temp.countOut();
		while (!temp.callCheck())
			push(temp.countOut());
		return ret;
	}
}
