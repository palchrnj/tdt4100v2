package encapsulation;

import encapsulation.MobileUsage;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests encapsulation.MobileUsage")
@SuppressWarnings("all")
public class MobileUsageTest extends TestCase {
  private MobileUsage mobileUsage;
  
  private MobileUsage _init_mobileUsage() {
    MobileUsage _mobileUsage = new MobileUsage();
    return _mobileUsage;
  }
  
  @Override
  protected void setUp() {
    mobileUsage = _init_mobileUsage();
    
  }
  
  @JExercise(tests = "MobileUsage();void registerCall(int)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>mobileUsage.registerCall(5), mobileUsage.registerCall(10), mobileUsage.registerCall(15)</li>\n\t\t</ul>\n")
  public void testCall() {
    _transition_exprAction__call_transitions0_actions0(mobileUsage);
    _transition_exprAction__call_transitions0_actions1(mobileUsage);
    _transition_exprAction__call_transitions0_actions2(mobileUsage);
    _test__call_transitions0_effect_state(mobileUsage);
    
  }
  
  @JExercise(tests = "MobileUsage();void registerMessage()", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>registerMessage(), registerMessage(), registerMessage()</li>\n\t\t</ul>\n")
  public void testMessage() {
    _transition_exprAction__message_transitions0_actions0(mobileUsage);
    _transition_exprAction__message_transitions0_actions1(mobileUsage);
    _transition_exprAction__message_transitions0_actions2(mobileUsage);
    _test__message_transitions0_effect_state(mobileUsage);
    
  }
  
  @JExercise(tests = "MobileUsage();void registerBytes(int,int)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>registerBytes(0, 1024), registerBytes(1024, 0), registerBytes(1024, 1024)</li>\n\t\t</ul>\n")
  public void testBytes() {
    _transition_exprAction__bytes_transitions0_actions0(mobileUsage);
    _transition_exprAction__bytes_transitions0_actions1(mobileUsage);
    _transition_exprAction__bytes_transitions0_actions2(mobileUsage);
    _test__bytes_transitions0_effect_state(mobileUsage);
    
  }
  
  @JExercise(tests = "MobileUsage();void registerCall(int)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>registerCall(5), registerCall(-5)</li>\n\t\t</ul>\n")
  public void testCallInvalidInput() {
    try {
      _transition_exprAction__callInvalidInput_transitions0_actions0(mobileUsage);
      _transition_exprAction__callInvalidInput_transitions0_actions1(mobileUsage);
      fail("IllegalArgumentException should be thrown after registerCall(5), registerCall(-5)");
    } catch (Exception e) {
      assertTrue("IllegalArgumentException should be thrown after registerCall(5), registerCall(-5)", e instanceof IllegalArgumentException);
    }
    _test__callInvalidInput_transitions1_effect_state(mobileUsage);
    
  }
  
  private void _transition_exprAction__call_transitions0_actions0(final MobileUsage it) {
    try {
      
      this.mobileUsage.registerCall(5);
      } catch (junit.framework.AssertionFailedError error) {
      fail("mobileUsage.registerCall(5) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__call_transitions0_actions1(final MobileUsage it) {
    try {
      
      this.mobileUsage.registerCall(10);
      } catch (junit.framework.AssertionFailedError error) {
      fail("mobileUsage.registerCall(10) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__call_transitions0_actions2(final MobileUsage it) {
    try {
      
      this.mobileUsage.registerCall(15);
      } catch (junit.framework.AssertionFailedError error) {
      fail("mobileUsage.registerCall(15) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__call_transitions0_effect_state(final MobileUsage it) {
    _test__call_transitions0_effect_state_objectTests0_test(mobileUsage);
    
  }
  
  private void _test__call_transitions0_effect_state_objectTests0_test(final MobileUsage it) {
    
    int _callCount = this.mobileUsage.getCallCount();
    assertEquals("mobileUsage.getCallCount() == 3 failed after mobileUsage.registerCall(5) ,mobileUsage.registerCall(10) ,mobileUsage.registerCall(15)", 3, _callCount);
    
    int _callSeconds = this.mobileUsage.getCallSeconds();
    assertEquals("mobileUsage.getCallSeconds() == 30 failed after mobileUsage.registerCall(5) ,mobileUsage.registerCall(10) ,mobileUsage.registerCall(15)", 30, _callSeconds);
    
  }
  
  private void _transition_exprAction__message_transitions0_actions0(final MobileUsage it) {
    try {
      
      it.registerMessage();
      } catch (junit.framework.AssertionFailedError error) {
      fail("registerMessage() failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__message_transitions0_actions1(final MobileUsage it) {
    try {
      
      it.registerMessage();
      } catch (junit.framework.AssertionFailedError error) {
      fail("registerMessage() failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__message_transitions0_actions2(final MobileUsage it) {
    try {
      
      it.registerMessage();
      } catch (junit.framework.AssertionFailedError error) {
      fail("registerMessage() failed: " + error.getMessage());
    }
    
  }
  
  private void _test__message_transitions0_effect_state(final MobileUsage it) {
    _test__message_transitions0_effect_state_objectTests0_test(mobileUsage);
    
  }
  
  private void _test__message_transitions0_effect_state_objectTests0_test(final MobileUsage it) {
    
    int _messageCount = it.getMessageCount();
    assertEquals("messageCount == 3 failed after registerMessage() ,registerMessage() ,registerMessage()", 3, _messageCount);
    
  }
  
  private void _transition_exprAction__bytes_transitions0_actions0(final MobileUsage it) {
    try {
      
      it.registerBytes(0, 1024);
      } catch (junit.framework.AssertionFailedError error) {
      fail("registerBytes(0, 1024) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__bytes_transitions0_actions1(final MobileUsage it) {
    try {
      
      it.registerBytes(1024, 0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("registerBytes(1024, 0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__bytes_transitions0_actions2(final MobileUsage it) {
    try {
      
      it.registerBytes(1024, 1024);
      } catch (junit.framework.AssertionFailedError error) {
      fail("registerBytes(1024, 1024) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__bytes_transitions0_effect_state(final MobileUsage it) {
    _test__bytes_transitions0_effect_state_objectTests0_test(mobileUsage);
    
  }
  
  private void _test__bytes_transitions0_effect_state_objectTests0_test(final MobileUsage it) {
    
    int _bytesReceived = it.getBytesReceived();
    assertEquals("bytesReceived == 2048 failed after registerBytes(0, 1024) ,registerBytes(1024, 0) ,registerBytes(1024, 1024)", 2048, _bytesReceived);
    
    int _bytesSent = it.getBytesSent();
    assertEquals("bytesSent == 2048 failed after registerBytes(0, 1024) ,registerBytes(1024, 0) ,registerBytes(1024, 1024)", 2048, _bytesSent);
    
  }
  
  private void _transition_exprAction__callInvalidInput_transitions0_actions0(final MobileUsage it) {
    try {
      
      it.registerCall(5);
      } catch (junit.framework.AssertionFailedError error) {
      fail("registerCall(5) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__callInvalidInput_transitions0_actions1(final MobileUsage it) {
    try {
      
      int _minus = (-5);
      it.registerCall(_minus);
      } catch (junit.framework.AssertionFailedError error) {
      fail("registerCall(-5) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__callInvalidInput_transitions1_effect_state(final MobileUsage it) {
    _test__callInvalidInput_transitions1_effect_state_objectTests0_test(mobileUsage);
    
  }
  
  private void _test__callInvalidInput_transitions1_effect_state_objectTests0_test(final MobileUsage it) {
    
    int _callCount = it.getCallCount();
    assertEquals("callCount == 1 failed", 1, _callCount);
    
    int _callSeconds = it.getCallSeconds();
    assertEquals("callSeconds == 5 failed", 5, _callSeconds);
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(MobileUsageTest.class);
  }
}
