/*
 * Bybit API
 * ## REST API for the Bybit Exchange. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: support@bybit.com
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
import io.swagger.client.model.FundingRecords;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Get funding record response
 */
@ApiModel(description = "Get funding record response")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-12-02T22:18:53.713+08:00")
public class FundRecordBase {
  @SerializedName("ret_code")
  private BigDecimal retCode = null;

  @SerializedName("ret_msg")
  private String retMsg = null;

  @SerializedName("ext_code")
  private String extCode = null;

  @SerializedName("ext_info")
  private String extInfo = null;

  @SerializedName("result")
  private List<FundingRecords> result = null;

  @SerializedName("time_now")
  private String timeNow = null;

  public FundRecordBase retCode(BigDecimal retCode) {
    this.retCode = retCode;
    return this;
  }

   /**
   * Get retCode
   * @return retCode
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getRetCode() {
    return retCode;
  }

  public void setRetCode(BigDecimal retCode) {
    this.retCode = retCode;
  }

  public FundRecordBase retMsg(String retMsg) {
    this.retMsg = retMsg;
    return this;
  }

   /**
   * Get retMsg
   * @return retMsg
  **/
  @ApiModelProperty(value = "")
  public String getRetMsg() {
    return retMsg;
  }

  public void setRetMsg(String retMsg) {
    this.retMsg = retMsg;
  }

  public FundRecordBase extCode(String extCode) {
    this.extCode = extCode;
    return this;
  }

   /**
   * Get extCode
   * @return extCode
  **/
  @ApiModelProperty(value = "")
  public String getExtCode() {
    return extCode;
  }

  public void setExtCode(String extCode) {
    this.extCode = extCode;
  }

  public FundRecordBase extInfo(String extInfo) {
    this.extInfo = extInfo;
    return this;
  }

   /**
   * Get extInfo
   * @return extInfo
  **/
  @ApiModelProperty(value = "")
  public String getExtInfo() {
    return extInfo;
  }

  public void setExtInfo(String extInfo) {
    this.extInfo = extInfo;
  }

  public FundRecordBase result(List<FundingRecords> result) {
    this.result = result;
    return this;
  }

  public FundRecordBase addResultItem(FundingRecords resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<FundingRecords>();
    }
    this.result.add(resultItem);
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @ApiModelProperty(value = "")
  public List<FundingRecords> getResult() {
    return result;
  }

  public void setResult(List<FundingRecords> result) {
    this.result = result;
  }

  public FundRecordBase timeNow(String timeNow) {
    this.timeNow = timeNow;
    return this;
  }

   /**
   * Get timeNow
   * @return timeNow
  **/
  @ApiModelProperty(value = "")
  public String getTimeNow() {
    return timeNow;
  }

  public void setTimeNow(String timeNow) {
    this.timeNow = timeNow;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundRecordBase fundRecordBase = (FundRecordBase) o;
    return Objects.equals(this.retCode, fundRecordBase.retCode) &&
        Objects.equals(this.retMsg, fundRecordBase.retMsg) &&
        Objects.equals(this.extCode, fundRecordBase.extCode) &&
        Objects.equals(this.extInfo, fundRecordBase.extInfo) &&
        Objects.equals(this.result, fundRecordBase.result) &&
        Objects.equals(this.timeNow, fundRecordBase.timeNow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retCode, retMsg, extCode, extInfo, result, timeNow);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundRecordBase {\n");
    
    sb.append("    retCode: ").append(toIndentedString(retCode)).append("\n");
    sb.append("    retMsg: ").append(toIndentedString(retMsg)).append("\n");
    sb.append("    extCode: ").append(toIndentedString(extCode)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    timeNow: ").append(toIndentedString(timeNow)).append("\n");
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

