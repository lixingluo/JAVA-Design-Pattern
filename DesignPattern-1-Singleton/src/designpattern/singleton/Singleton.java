package designpattern.singleton;

class Singleton1 {
	private static Singleton1 singleton = null; 
	
  private Singleton1() {}
  /**
   * private Singleton1 means : any other class except Singleton1 cannot create Singleton1 object using Singleton1 xxx = new Singleton1()
   */

  public static Singleton1 getInstance() {
    if(singleton == null) {
      synchronized(Singleton1.class) {
        if(singleton == null) {
          singleton = new Singleton1();
        }
      }
    }
    /**
     * synchronized : lock the thread, handle multi-thread access problem
     * first singleton == null : if A first access then B will be locked to wait after A created, singleton created
     * second singleton == null : double check whether singleton is created or not
     */
    return singleton;
  }
}

class Singleton2{
  private static final Singleton2 singleton = new Singleton2();
  /**
   * Initialize singleton as the process loading no giving any chance of other process to invoke the class
   */

  private Singleton2() {}

  public static Singleton2 getInstance() {
    return singleton;
  }
}