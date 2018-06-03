package com.cma.pojo;

import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

@Table(name = "staff_authorization")
public class StaffAuthorization {
    @Id
    @Column(name = "id")
    private Long authorizationId;

    @Column(name = "authorizer_id")
    private Long authorizerId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "authorizer_date")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date authorizerDate;

    private String content;

    /**
     * @return id
     */
    public Long getAuthorizationId() {
        return authorizationId;
    }

    /**
     * @param authorizationId
     */
    public void setAuthorizationId(Long authorizationId) {
        this.authorizationId = authorizationId;
    }

    /**
     * @return authorizer_id
     */
    public Long getAuthorizerId() {
        return authorizerId;
    }

    /**
     * @param authorizerId
     */
    public void setAuthorizerId(Long authorizerId) {
        this.authorizerId = authorizerId;
    }

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return authorizer_date
     */
    public Date getAuthorizerDate() {
        return authorizerDate;
    }

    /**
     * @param authorizerDate
     */
    public void setAuthorizerDate(Date authorizerDate) {
        this.authorizerDate = authorizerDate;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }
}