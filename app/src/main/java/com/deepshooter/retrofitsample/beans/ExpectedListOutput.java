
package com.deepshooter.retrofitsample.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ExpectedListOutput {

    @SerializedName("errCode")
    @Expose
    private Integer errCode;
    @SerializedName("subErrCode")
    @Expose
    private Integer subErrCode;
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("success")
    @Expose
    private Boolean success;

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public Integer getSubErrCode() {
        return subErrCode;
    }

    public void setSubErrCode(Integer subErrCode) {
        this.subErrCode = subErrCode;
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

}
