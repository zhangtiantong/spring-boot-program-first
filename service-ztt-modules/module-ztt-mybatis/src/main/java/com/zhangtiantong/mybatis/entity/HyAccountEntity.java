package com.zhangtiantong.mybatis.entity;


import org.springframework.stereotype.Component;

/**
 * @Author zhangtiantong
 * @Date 2017/3/8
 */
@Component
public class HyAccountEntity {
    private long account_id;
    private int district;
    private String account_name;
    private String account_nickname;
    private String account_pwd;
    private Long account_date;
    private String account_state;

    public String getAccount_describe() {
        return account_describe;
    }

    public void setAccount_describe(String account_describe) {
        this.account_describe = account_describe;
    }

    public long getAccount_id() {
        return account_id;
    }

    public void setAccount_id(long account_id) {
        this.account_id = account_id;
    }

    public int getDistrict() {
        return district;
    }

    public void setDistrict(int district) {
        this.district = district;
    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public String getAccount_nickname() {
        return account_nickname;
    }

    public void setAccount_nickname(String account_nickname) {
        this.account_nickname = account_nickname;
    }

    public String getAccount_pwd() {
        return account_pwd;
    }

    public void setAccount_pwd(String account_pwd) {
        this.account_pwd = account_pwd;
    }

    public Long getAccount_date() {
        return account_date;
    }

    public void setAccount_date(Long account_date) {
        this.account_date = account_date;
    }

    public String getAccount_state() {
        return account_state;
    }

    public void setAccount_state(String account_state) {
        this.account_state = account_state;
    }

    public Long getAccount_orgId() {
        return account_orgId;
    }

    public void setAccount_orgId(Long account_orgId) {
        this.account_orgId = account_orgId;
    }

    public String getAccount_linkman() {
        return account_linkman;
    }

    public void setAccount_linkman(String account_linkman) {
        this.account_linkman = account_linkman;
    }

    public String getAccount_linktel() {
        return account_linktel;
    }

    public void setAccount_linktel(String account_linktel) {
        this.account_linktel = account_linktel;
    }

    public String getAccount_company() {
        return account_company;
    }

    public void setAccount_company(String account_company) {
        this.account_company = account_company;
    }

    public Integer getDel_flag() {
        return del_flag;
    }

    public void setDel_flag(Integer del_flag) {
        this.del_flag = del_flag;
    }

    public Integer getAccount_type() {
        return account_type;
    }

    public void setAccount_type(Integer account_type) {
        this.account_type = account_type;
    }

    public Long getCreate_account() {
        return create_account;
    }

    public void setCreate_account(Long create_account) {
        this.create_account = create_account;
    }

    public Integer getJob_type() {
        return job_type;
    }

    public void setJob_type(Integer job_type) {
        this.job_type = job_type;
    }

    public String getLock_account() {
        return lock_account;
    }

    public void setLock_account(String lock_account) {
        this.lock_account = lock_account;
    }

    public Long getError_count() {
        return error_count;
    }

    public void setError_count(Long error_count) {
        this.error_count = error_count;
    }

    public Long getTerm_vilidate() {
        return term_vilidate;
    }

    public void setTerm_vilidate(Long term_vilidate) {
        this.term_vilidate = term_vilidate;
    }

    public Long getLogin_failedTime() {
        return login_failedTime;
    }

    public void setLogin_failedTime(Long login_failedTime) {
        this.login_failedTime = login_failedTime;
    }

    private Long account_orgId;
    private String account_linkman;
    private String account_describe;
    private String account_linktel;
    private String account_company;
    private Integer del_flag;
    private Integer account_type;
    private Long create_account;
    private Integer job_type;
    private String lock_account;
    private Long error_count;
    private Long term_vilidate;
    private Long login_failedTime;

}
