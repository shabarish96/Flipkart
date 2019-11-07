package logopage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class homepagetest  {
homepageobject hp;


public homepagetest() {
	hp = new homepageobject();
}

@Test
public void verify() {
	hp.clickdresstab();
	Assert.assertTrue(hp.getTitlte().contains("Dresses"));
}



}
