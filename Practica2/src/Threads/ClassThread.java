package Threads;

import java.util.LinkedList;
import java.util.List;

/* 
 *Thread class
 * */
class ClassThreads extends Thread {
	
	/* Create the object */
	private static ClassThreads objClassThread = new ClassThreads();

	private ClassThreads() {
		// TODO Auto-generated constructor stub
	}

	private synchronized static void createInstance() {
		if (objClassThread == null) {
			objClassThread = new ClassThreads();
		}
	}

	public static ClassThreads getInstance() {
		createInstance();
		return objClassThread;
	}

	List<Integer> list = new LinkedList<Integer>();

	public void run(int num) {

		int valor = 0;

		for (int cont1 = 0; cont1 <= num; cont1++) {
			list.add(cont1);

		}
		for (int cont2 = 0; cont2 <= list.size() - 1; cont2++) {
			valor = list.get(cont2);

			System.out.println(valor);
		}

	}

	public void run2() {
		System.out.println("Adios");
	}

}
