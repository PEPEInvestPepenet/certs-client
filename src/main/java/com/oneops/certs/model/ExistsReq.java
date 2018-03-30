package com.oneops.certs.model;


import com.google.auto.value.AutoValue;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

/**
 * appId: Application id requesting certificate management system to perform create certificate rest web service call.
 * commonName: Common name of the certificate to renew.
 * teamDL: Team email distribution list set up in the certificate management system, which owns the certificate.
 * alternateId: This is an optional field which can specify who specifically made the request if the appId is owned by a team or group.
 */
@AutoValue
public abstract class ExistsReq {

  public abstract String appId();

  public abstract String commonName();

  public abstract String teamDL();

  public abstract String expirationWindow();

  public static Builder builder() {
    return new AutoValue_ExistsReq.Builder();
  }

  @AutoValue.Builder
  public abstract static class Builder {

    public abstract Builder appId(String appId);

    public abstract Builder commonName(String commonName);

    public abstract Builder teamDL(String teamDL);

    public abstract Builder expirationWindow(String expirationWindow);

    public abstract ExistsReq build();
  }


  public static JsonAdapter<ExistsReq> jsonAdapter(Moshi moshi) {
    return new AutoValue_ExistsReq.MoshiJsonAdapter(moshi);
  }

}
