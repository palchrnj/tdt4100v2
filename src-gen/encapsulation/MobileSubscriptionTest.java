package encapsulation;

import encapsulation.MobileSubscription;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests encapsulation.MobileSubscription")
@SuppressWarnings("all")
public class MobileSubscriptionTest extends TestCase {
  private MobileSubscription mobileUsage;
  
  private MobileSubscription _init_mobileUsage() {
    MobileSubscription _mobileSubscription = new MobileSubscription();
    return _mobileSubscription;
  }
  
  @Override
  protected void setUp() {
    mobileUsage = _init_mobileUsage();
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(MobileSubscriptionTest.class);
  }
}
