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
 * ErrorHeaderAudit
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-14T09:38:17.140Z")
public class ErrorHeaderAudit {
  @SerializedName("T24_time")
  private Integer t24Time = null;

  @SerializedName("versionNumber")
  private String versionNumber = null;

  @SerializedName("requestParse_time")
  private BigDecimal requestParseTime = null;

  @SerializedName("responseParse_time")
  private BigDecimal responseParseTime = null;

  public ErrorHeaderAudit t24Time(Integer t24Time) {
    this.t24Time = t24Time;
    return this;
  }

   /**
   * Time taken to response by Transact
   * @return t24Time
  **/
  @ApiModelProperty(value = "Time taken to response by Transact")
  public Integer getT24Time() {
    return t24Time;
  }

  public void setT24Time(Integer t24Time) {
    this.t24Time = t24Time;
  }

  public ErrorHeaderAudit versionNumber(String versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

   /**
   * The CURR.NO. of the record
   * @return versionNumber
  **/
  @ApiModelProperty(value = "The CURR.NO. of the record")
  public String getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(String versionNumber) {
    this.versionNumber = versionNumber;
  }

  public ErrorHeaderAudit requestParseTime(BigDecimal requestParseTime) {
    this.requestParseTime = requestParseTime;
    return this;
  }

   /**
   * Time taken to parse the request by IRIS
   * @return requestParseTime
  **/
  @ApiModelProperty(value = "Time taken to parse the request by IRIS")
  public BigDecimal getRequestParseTime() {
    return requestParseTime;
  }

  public void setRequestParseTime(BigDecimal requestParseTime) {
    this.requestParseTime = requestParseTime;
  }

  public ErrorHeaderAudit responseParseTime(BigDecimal responseParseTime) {
    this.responseParseTime = responseParseTime;
    return this;
  }

   /**
   * Time taken to parse the response by IRIS
   * @return responseParseTime
  **/
  @ApiModelProperty(value = "Time taken to parse the response by IRIS")
  public BigDecimal getResponseParseTime() {
    return responseParseTime;
  }

  public void setResponseParseTime(BigDecimal responseParseTime) {
    this.responseParseTime = responseParseTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorHeaderAudit errorHeaderAudit = (ErrorHeaderAudit) o;
    return Objects.equals(this.t24Time, errorHeaderAudit.t24Time) &&
        Objects.equals(this.versionNumber, errorHeaderAudit.versionNumber) &&
        Objects.equals(this.requestParseTime, errorHeaderAudit.requestParseTime) &&
        Objects.equals(this.responseParseTime, errorHeaderAudit.responseParseTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(t24Time, versionNumber, requestParseTime, responseParseTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorHeaderAudit {\n");
    
    sb.append("    t24Time: ").append(toIndentedString(t24Time)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
    sb.append("    requestParseTime: ").append(toIndentedString(requestParseTime)).append("\n");
    sb.append("    responseParseTime: ").append(toIndentedString(responseParseTime)).append("\n");
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

