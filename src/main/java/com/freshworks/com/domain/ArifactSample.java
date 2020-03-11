package com.freshworks.com.domain;

public class ArifactSample
{

    private final long id;
    private final String content;

    public ArifactSample(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
