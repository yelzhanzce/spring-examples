package com.example.testing.annotations;

@Service(name = "lazyService")
public class LazyService {

    @Init
    public void lazyInit() throws Exception{
        System.out.println("lazyInit");
    }

    public void notLazyInit(){
        System.out.println("not lazy init");
    }
}
