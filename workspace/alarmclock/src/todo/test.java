package todo;

import se.lth.cs.realtime.semaphore.MutexSem;
import se.lth.cs.realtime.semaphore.Semaphore;

public class test {
	private static Semaphore flag = new MutexSem();

	public static void main(String[] args) {
		flag.take();
		System.out.println("taken 1");
		flag.give();
		System.out.println("given 1");
		flag.take();
		System.out.println("taken 2");
		flag.take();
		System.out.println("taken 3");
		flag.give();
		System.out.println("given 2");
	}
	

}
//if (!(last == next)) {
//	switch (input.getChoice()) {
//	case 1:
//		// ac.setAlarmTime(next);
//		last = next;
//		break;
//	case 2:s
//		ac.setTime(next);
//		last = next;
//		break;
//	}
//}