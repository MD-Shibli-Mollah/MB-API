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

/**
 * QueryErrorResponseBody
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-02-14T09:38:17.140Z")
public class QueryErrorResponseBody {
  @SerializedName("message")
  private String message = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("code")
  private String code = null;

  public QueryErrorResponseBody message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The actual Transact error message 
   * @return message
  **/
  @ApiModelProperty(value = "The actual Transact error message ")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public QueryErrorResponseBody type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The identifier of error type: 
   * @return type
  **/
  @ApiModelProperty(value = "The identifier of error type: ")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public QueryErrorResponseBody code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The identifier of the error message
   * @return code
  **/
  @ApiModelProperty(value = "The identifier of the error message")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryErrorResponseBody queryErrorResponseBody = (QueryErrorResponseBody) o;
    return Objects.equals(this.message, queryErrorResponseBody.message) &&
        Objects.equals(this.type, queryErrorResponseBody.type) &&
        Objects.equals(this.code, queryErrorResponseBody.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, type, code);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryErrorResponseBody {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

