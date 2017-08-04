package com.example.hxyz.controller;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonView;


public class Result<T> implements Serializable{

	private static final long serialVersionUID = 551695079254394877L;


    

    public static interface OnlyHintView {

    }

    public static interface OnlyObjectView {

    }

    public static interface AllView extends OnlyHintView, OnlyObjectView {

    }

    /**
     * 状态
     */
    @JsonView({ OnlyHintView.class, AllView.class })
    private String status;

    /**
     * 状态文本
     */
    @JsonView({ OnlyHintView.class, AllView.class })
    private String text;

    /**
     * 描述
     */
    @JsonView({ OnlyHintView.class, AllView.class })
    private String description;

    /**
     * 内容
     */
    @JsonView({ OnlyObjectView.class, AllView.class })
    private T t;

    public Result() {
    }

    public Result(String status, String text) {
        this.status = status;
        this.text = text;
    }

    public Result(String status, String text, String description) {
        this.status = status;
        this.text = text;
        this.description = description;
    }

    public Result(String status, String text, T t) {
        this.status = status;
        this.text = text;
        this.t = t;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

}
