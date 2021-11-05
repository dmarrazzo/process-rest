package com.examples.model;

import java.io.Serializable;
import java.util.List;

public class Pet implements Serializable {
    private long id;
    private Category category;
    private String name;
    private List<String> photoUrls;
    private List<Tag> tags;
    private String status;

    @Override
    public String toString() {
        return String.format("{category:%s, id:%s, name:%s, photoUrls:%s, status:%s, tags:%s}", category, id, name,
                photoUrls, status, tags);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhotoUrls() {
        return photoUrls;
    }

    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}