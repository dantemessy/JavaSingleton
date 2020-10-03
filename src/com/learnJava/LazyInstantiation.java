package com.learnJava;


// to get instant we we need it, not like singleton.
public class LazyInstantiation {

    private static LazyInstantiation lazyInstantiation;
    private LazyInstantiation(){}
    // will work only in single threaded app.
    // to solve multi threaded issue, we use synchronized keyword. so it will run as a synchronized block.
    // using synchronized is not efficient, decrease performance.
    public static synchronized LazyInstantiation getInstance(){
        if(lazyInstantiation == null) {
            lazyInstantiation = new LazyInstantiation();
        }
        return lazyInstantiation;
    }

}
