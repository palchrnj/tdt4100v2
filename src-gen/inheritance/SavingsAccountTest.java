package inheritance;

import inheritance.SavingsAccount;
import junit.framework.TestCase;
import no.hal.jex.runtime.JExercise;

@JExercise(description = "Tests inheritance.SavingsAccount")
@SuppressWarnings("all")
public class SavingsAccountTest extends TestCase {
  private SavingsAccount savingsAccount;
  
  private SavingsAccount _init_savingsAccount() {
    SavingsAccount _savingsAccount = new SavingsAccount("Ola Nordmann", 0.10);
    return _savingsAccount;
  }
  
  @Override
  protected void setUp() {
    savingsAccount = _init_savingsAccount();
    
  }
  
  @JExercise(tests = "SavingsAccount(String,double);void deposit(double)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>savingsAccount.deposit(100.0)</li>\n\t\t</ul>\n")
  public void testBalanceInterestFields() {
    _transition_exprAction__balanceInterestFields_transitions0_actions0(savingsAccount);
    _test__balanceInterestFields_transitions0_effect_state(savingsAccount);
    
  }
  
  @JExercise(tests = "SavingsAccount(String,double);void deposit(double);void withdraw(double)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>savingsAccount.deposit(100.0), savingsAccount.withdraw(40.0)</li>\n\t\t</ul>\n")
  public void testDepositAndWithdraw() {
    _transition_exprAction__depositAndWithdraw_transitions0_actions0(savingsAccount);
    _transition_exprAction__depositAndWithdraw_transitions0_actions1(savingsAccount);
    _test__depositAndWithdraw_transitions0_effect_state(savingsAccount);
    
  }
  
  @JExercise(tests = "SavingsAccount(String,double);void deposit(double);void withdraw(double)", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>savingsAccount.deposit(10.0), savingsAccount.deposit(-100.0)</li>\n\t\t<li>savingsAccount.deposit(10.0), savingsAccount.withdraw(-100.0)</li>\n\t\t<li>savingsAccount.deposit(10.0), savingsAccount.withdraw(40.0)</li>\n\t\t</ul>\n")
  public void testDepositAndWithdrawIllegalStateOrInput() {
    try {
      _transition_exprAction__depositAndWithdrawIllegalStateOrInput_transitions0_actions0(savingsAccount);
      _transition_exprAction__depositAndWithdrawIllegalStateOrInput_transitions0_actions1(savingsAccount);
      fail("IllegalArgumentException should be thrown after savingsAccount.deposit(10.0), savingsAccount.deposit(-100.0)");
    } catch (Exception e) {
      assertTrue("IllegalArgumentException should be thrown after savingsAccount.deposit(10.0), savingsAccount.deposit(-100.0)", e instanceof IllegalArgumentException);
    }
    _test__depositAndWithdrawIllegalStateOrInput_transitions1_effect_state(savingsAccount);
    try {
      _transition_exprAction__depositAndWithdrawIllegalStateOrInput_transitions2_actions0(savingsAccount);
      _transition_exprAction__depositAndWithdrawIllegalStateOrInput_transitions2_actions1(savingsAccount);
      fail("IllegalArgumentException should be thrown after savingsAccount.deposit(10.0), savingsAccount.withdraw(-100.0)");
    } catch (Exception e_1) {
      assertTrue("IllegalArgumentException should be thrown after savingsAccount.deposit(10.0), savingsAccount.withdraw(-100.0)", e_1 instanceof IllegalArgumentException);
    }
    _test__depositAndWithdrawIllegalStateOrInput_transitions3_effect_state(savingsAccount);
    try {
      _transition_exprAction__depositAndWithdrawIllegalStateOrInput_transitions4_actions0(savingsAccount);
      _transition_exprAction__depositAndWithdrawIllegalStateOrInput_transitions4_actions1(savingsAccount);
      fail("IllegalStateException should be thrown after savingsAccount.deposit(10.0), savingsAccount.withdraw(40.0)");
    } catch (Exception e_2) {
      assertTrue("IllegalStateException should be thrown after savingsAccount.deposit(10.0), savingsAccount.withdraw(40.0)", e_2 instanceof IllegalStateException);
    }
    _test__depositAndWithdrawIllegalStateOrInput_transitions5_effect_state(savingsAccount);
    
  }
  
  @JExercise(tests = "SavingsAccount(String,double);void deposit(double);void endYearUpdate()", description = "Tests \n\t\tthe following sequence:\n\t\t<ul>\n\t\t<li>savingsAccount.deposit(100.0), savingsAccount.endYearUpdate()</li>\n\t\t</ul>\n")
  public void testEndYearUpdate() {
    _transition_exprAction__endYearUpdate_transitions0_actions0(savingsAccount);
    _transition_exprAction__endYearUpdate_transitions0_actions1(savingsAccount);
    _test__endYearUpdate_transitions0_effect_state(savingsAccount);
    
  }
  
  private void _transition_exprAction__balanceInterestFields_transitions0_actions0(final SavingsAccount it) {
    try {
      
      this.savingsAccount.deposit(100.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("savingsAccount.deposit(100.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__balanceInterestFields_transitions0_effect_state(final SavingsAccount it) {
    _test__balanceInterestFields_transitions0_effect_state_objectTests0_test(savingsAccount);
    
  }
  
  private void _test__balanceInterestFields_transitions0_effect_state_objectTests0_test(final SavingsAccount it) {
    
    double _balance = this.savingsAccount.getBalance();
    assertEquals("savingsAccount.getBalance() == 100.0 failed after savingsAccount.deposit(100.0)", 100.0, _balance);
    
    double _interest = this.savingsAccount.getInterest();
    assertEquals("savingsAccount.getInterest() == 0.10 failed after savingsAccount.deposit(100.0)", 0.10, _interest);
    
  }
  
  private void _transition_exprAction__depositAndWithdraw_transitions0_actions0(final SavingsAccount it) {
    try {
      
      this.savingsAccount.deposit(100.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("savingsAccount.deposit(100.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__depositAndWithdraw_transitions0_actions1(final SavingsAccount it) {
    try {
      
      this.savingsAccount.withdraw(40.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("savingsAccount.withdraw(40.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__depositAndWithdraw_transitions0_effect_state(final SavingsAccount it) {
    _test__depositAndWithdraw_transitions0_effect_state_objectTests0_test(savingsAccount);
    
  }
  
  private void _test__depositAndWithdraw_transitions0_effect_state_objectTests0_test(final SavingsAccount it) {
    
    double _balance = this.savingsAccount.getBalance();
    assertEquals("savingsAccount.getBalance() == 60.0 failed after savingsAccount.deposit(100.0) ,savingsAccount.withdraw(40.0)", 60.0, _balance);
    
  }
  
  private void _transition_exprAction__depositAndWithdrawIllegalStateOrInput_transitions0_actions0(final SavingsAccount it) {
    try {
      
      this.savingsAccount.deposit(10.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("savingsAccount.deposit(10.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__depositAndWithdrawIllegalStateOrInput_transitions0_actions1(final SavingsAccount it) {
    try {
      
      double _minus = (-100.0);
      this.savingsAccount.deposit(_minus);
      } catch (junit.framework.AssertionFailedError error) {
      fail("savingsAccount.deposit(-100.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__depositAndWithdrawIllegalStateOrInput_transitions1_effect_state(final SavingsAccount it) {
    _test__depositAndWithdrawIllegalStateOrInput_transitions1_effect_state_objectTests0_test(savingsAccount);
    
  }
  
  private void _test__depositAndWithdrawIllegalStateOrInput_transitions1_effect_state_objectTests0_test(final SavingsAccount it) {
    
    double _balance = this.savingsAccount.getBalance();
    assertEquals("savingsAccount.getBalance() == 10.0 failed", 10.0, _balance);
    
  }
  
  private void _transition_exprAction__depositAndWithdrawIllegalStateOrInput_transitions2_actions0(final SavingsAccount it) {
    try {
      
      this.savingsAccount.deposit(10.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("savingsAccount.deposit(10.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__depositAndWithdrawIllegalStateOrInput_transitions2_actions1(final SavingsAccount it) {
    try {
      
      double _minus = (-100.0);
      this.savingsAccount.withdraw(_minus);
      } catch (junit.framework.AssertionFailedError error) {
      fail("savingsAccount.withdraw(-100.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__depositAndWithdrawIllegalStateOrInput_transitions3_effect_state(final SavingsAccount it) {
    _test__depositAndWithdrawIllegalStateOrInput_transitions3_effect_state_objectTests0_test(savingsAccount);
    
  }
  
  private void _test__depositAndWithdrawIllegalStateOrInput_transitions3_effect_state_objectTests0_test(final SavingsAccount it) {
    
    double _balance = this.savingsAccount.getBalance();
    assertEquals("savingsAccount.getBalance() == 20.0 failed", 20.0, _balance);
    
  }
  
  private void _transition_exprAction__depositAndWithdrawIllegalStateOrInput_transitions4_actions0(final SavingsAccount it) {
    try {
      
      this.savingsAccount.deposit(10.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("savingsAccount.deposit(10.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__depositAndWithdrawIllegalStateOrInput_transitions4_actions1(final SavingsAccount it) {
    try {
      
      this.savingsAccount.withdraw(40.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("savingsAccount.withdraw(40.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _test__depositAndWithdrawIllegalStateOrInput_transitions5_effect_state(final SavingsAccount it) {
    _test__depositAndWithdrawIllegalStateOrInput_transitions5_effect_state_objectTests0_test(savingsAccount);
    
  }
  
  private void _test__depositAndWithdrawIllegalStateOrInput_transitions5_effect_state_objectTests0_test(final SavingsAccount it) {
    
    double _balance = this.savingsAccount.getBalance();
    assertEquals("savingsAccount.getBalance() == 30.0 failed", 30.0, _balance);
    
  }
  
  private void _transition_exprAction__endYearUpdate_transitions0_actions0(final SavingsAccount it) {
    try {
      
      this.savingsAccount.deposit(100.0);
      } catch (junit.framework.AssertionFailedError error) {
      fail("savingsAccount.deposit(100.0) failed: " + error.getMessage());
    }
    
  }
  
  private void _transition_exprAction__endYearUpdate_transitions0_actions1(final SavingsAccount it) {
    try {
      
      this.savingsAccount.endYearUpdate();
      } catch (junit.framework.AssertionFailedError error) {
      fail("savingsAccount.endYearUpdate() failed: " + error.getMessage());
    }
    
  }
  
  private void _test__endYearUpdate_transitions0_effect_state(final SavingsAccount it) {
    _test__endYearUpdate_transitions0_effect_state_objectTests0_test(savingsAccount);
    
  }
  
  private void _test__endYearUpdate_transitions0_effect_state_objectTests0_test(final SavingsAccount it) {
    
    double _plus = (1 + 0.10);
    double _multiply = (100.0 * _plus);
    double _balance = this.savingsAccount.getBalance();
    assertEquals("savingsAccount.getBalance() == 100.0 * (1 + 0.10) failed after savingsAccount.deposit(100.0) ,savingsAccount.endYearUpdate()", _multiply, _balance);
    
  }
  
  public static void main(final String[] args) {
    no.hal.jex.standalone.JexStandalone.main(SavingsAccountTest.class);
  }
}
