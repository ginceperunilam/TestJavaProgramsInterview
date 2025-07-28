package com.JavaProjects.TestProjectsAccessSpecifier;

public class AccessSpecifierParent
{
    int defaultDisplayNumber = 10;//access to same class,same pkg sub class, same pkg non sub class
    private Double privateDisplayNumber = 20d;//access to same class
    protected Boolean protectedDisplay = true;//access to same class,same pkg sub class, same pkg non sub class, diff pakg sub class
    public Long publicDisplayNumber = 30l;//access to same class,same pkg sub class, same pkg non sub class, diff pakg sub class, diff pkg non sub class
    
    public void accessMethods()
    {
	System.out.println("-----AccessSpecifierParent Same Class Starts----");
	callToDefault();
	callToPrivate();
	callToPublic();
	callToProtected();
	System.out.println("-----AccessSpecifierParent Same Class End----");
    }
    
    //default methods can access in the same package
    void callToDefault() 
    {
	System.out.println("-----AccessSpecifierParent inside callToDefault Default----");
	callToPrivate();
    }
    
    //private method can access only in this class, not from any other classes
    private void callToPrivate() 
    {
	System.out.println("-----AccessSpecifierParent inside callToPrivate private----");
	callToProtected();
    }
    
    //protected can access to the same package
    protected void callToProtected() 
    {
	System.out.println("-----AccessSpecifierParent inside callToProtected protected----");
	callToPublic();
    }
    
  //public method can access from any where
    public void callToPublic() 
    {
	System.out.println("-----AccessSpecifierParent inside callToPublic public----");
    }
}
