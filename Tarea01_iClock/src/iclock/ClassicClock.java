package iclock;

/**
 * Implementation of a classic (AM/PM) clock.
 * 
 * @author Manuel Olguin
 * 
 */

public class ClassicClock implements IClock {
	
	public static final int AM = 0;
	public static final int PM = 1;
	
	protected int time_seconds;
	
	/**
	 * Constructs a ClassicClock with an initial time of zero hours, zero
	 * minutes and zero seconds AM.
	 */
	
	public ClassicClock () {
	
		time_seconds = 0;
	}
	
	/**
	 * Constructs a ClassicClock with the specified time in hours, minutes and
	 * seconds, along with an AM/PM modifier.
	 * 
	 * @param hours
	 *            The initial number of hours.
	 * @param minutes
	 *            The initial number of minutes.
	 * @param seconds
	 *            The initial number of seconds.
	 * @param ampm
	 *            AM/PM modifier, 0 for AM, 1 for PM. The ClassicClock class has
	 *            static fields associated with these values.
	 */
	
	public ClassicClock (int hours, int minutes, int seconds, int ampm)
			throws TimeOutOfRangeException {
	
		// The following conditional statement verifies that the specified time
		// is correct.
		if (hours < 0 || hours > 11 || minutes < 0 || minutes > 59
				|| seconds < 0 || seconds > 59 || ampm < 0 || ampm > 1) {
			throw new TimeOutOfRangeException ();
		}
		
		// Finally, we convert the time to seconds and store it for future use.
		this.time_seconds = hours * 3600 + minutes * 60 + seconds;
		if (ampm == ClassicClock.PM) {
			this.time_seconds += (12 * 3600);
		}
	}
	
	@Override
	public String toString () {
	
		int hours = time_seconds / 3600;
		int minutes = (time_seconds - hours * 3600) / 60;
		int seconds = time_seconds - hours * 3600 - minutes * 60;
		
		String returnString;
		
		if (hours >= 12) {
			returnString = 
		}
		
		return returnString;
	}
	
	@Override
	public void increment () {
	
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public boolean isSynchronized (IClock clock) {
	
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public void synchronize (IClock clock) {
	
		// TODO Auto-generated method stub
		
	}
}
