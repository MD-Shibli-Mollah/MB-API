/*
 * AcBal
 * AcBalance
 *
 * OpenAPI spec version: v1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * AcBalResponseBodyInner
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-14T09:38:17.140Z")
public class AcBalResponseBodyInner {
  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("accountIBAN")
  private String accountIBAN = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("availableBalance")
  private BigDecimal availableBalance = null;

  public AcBalResponseBodyInner accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Identifier of the account. Often referred to as the account number, yet for consistency this is always referred to as accountId. Accepts both IBAN &amp; BBAN
   * @return accountId
  **/
  @ApiModelProperty(value = "Identifier of the account. Often referred to as the account number, yet for consistency this is always referred to as accountId. Accepts both IBAN & BBAN")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public AcBalResponseBodyInner accountIBAN(String accountIBAN) {
    this.accountIBAN = accountIBAN;
    return this;
  }

   /**
   * Represents the International Bank Account Number (IBAN) of the account.  E.g. GB29 NWBK 6016 1331 9268 19
   * @return accountIBAN
  **/
  @ApiModelProperty(value = "Represents the International Bank Account Number (IBAN) of the account.  E.g. GB29 NWBK 6016 1331 9268 19")
  public String getAccountIBAN() {
    return accountIBAN;
  }

  public void setAccountIBAN(String accountIBAN) {
    this.accountIBAN = accountIBAN;
  }

  public AcBalResponseBodyInner currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Identifies the currency. E.g. USD, GBP etc
   * @return currency
  **/
  @ApiModelProperty(value = "Identifies the currency. E.g. USD, GBP etc")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public AcBalResponseBodyInner availableBalance(BigDecimal availableBalance) {
    this.availableBalance = availableBalance;
    return this;
  }

   /**
   * Available balance of the account which is the projected balance which includes the net movements of both debits and credits against the account.
   * maximum: 25
   * @return availableBalance
  **/
  @ApiModelProperty(value = "Available balance of the account which is the projected balance which includes the net movements of both debits and credits against the account.")
  public BigDecimal getAvailableBalance() {
    return availableBalance;
  }

  public void setAvailableBalance(BigDecimal availableBalance) {
    this.availableBalance = availableBalance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AcBalResponseBodyInner acBalResponseBodyInner = (AcBalResponseBodyInner) o;
    return Objects.equals(this.accountId, acBalResponseBodyInner.accountId) &&
        Objects.equals(this.accountIBAN, acBalResponseBodyInner.accountIBAN) &&
        Objects.equals(this.currency, acBalResponseBodyInner.currency) &&
        Objects.equals(this.availableBalance, acBalResponseBodyInner.availableBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountIBAN, currency, availableBalance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcBalResponseBodyInner {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountIBAN: ").append(toIndentedString(accountIBAN)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

