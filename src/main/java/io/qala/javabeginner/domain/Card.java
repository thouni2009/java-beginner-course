package io.qala.javabeginner.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.ZonedDateTime;

public class Card {
    private static final Logger LOG = LoggerFactory.getLogger(Card.class);
    private String id, title, description;
    private User assignee, creator;
    private Column column;
    private ZonedDateTime creationTime;

    public Card(String title, User creator, Column column) {
        this.title = title;
        this.creator = creator;
        this.column = column;
        this.creationTime = ZonedDateTime.now();
        LOG.info("User [{}] created a card [{}] in column [{}]", creator.getEmail(), title, column.getName());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void assignTo(User assignee) {
        this.assignee = assignee;
        LOG.info("Card [{}] was assigned to [{}]", title, assignee.getEmail());
    }

    public User getAssignee() {
        return assignee;
    }

    public void moveTo(Column column) {
        this.column = column;
        LOG.info("Card [{}] was moved to [{}]", title, column.getName());
    }
    public Column getColumn() {
        return column;
    }

    public void setDescription(String description) {
        this.description = description;
        LOG.info("Card [{}] was given a description [{}]", title, description);
    }
    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Card [" + title + ']';
    }
}
