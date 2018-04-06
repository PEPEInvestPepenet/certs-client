package com.oneops.certs.model;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class PreConditionsTest {

  @Test
  void checkCN() {
    String cn = "test-app.oneops.com";
    PreConditions.checkCN(cn);

    String longCn =
        "aaaaaaaaaaaaaaaaaaaaa.bbbbbbbbbbbbbbbbbbb.cccccccccccccccccc.xxxxxxxxxxxxxxxxxxxxxxxxx.com";
    assertThrows(IllegalArgumentException.class, () -> PreConditions.checkCN(longCn));
  }

  @Test
  void checkPassword() {
    String validPasswd = "@j2o@#JOwel";
    PreConditions.checkPassword(validPasswd);

    String invalidPasswd = "test123";
    assertThrows(IllegalArgumentException.class, () -> PreConditions.checkPassword(invalidPasswd));
  }
}
