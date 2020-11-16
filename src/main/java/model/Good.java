package model;

import java.io.Serializable;

public class Good implements Serializable {

  private static final long serialVersionUID = 123L;
  private Integer code;
  private String title;

  public Good(Integer code, String title) {
    this.code = code;
    this.title = title;
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
