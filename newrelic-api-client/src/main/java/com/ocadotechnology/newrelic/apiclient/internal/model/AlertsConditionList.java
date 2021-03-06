package com.ocadotechnology.newrelic.apiclient.internal.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.ocadotechnology.newrelic.apiclient.model.conditions.AlertsCondition;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
public class AlertsConditionList extends ObjectList<AlertsCondition, AlertsConditionList> {
    @JsonCreator
    public AlertsConditionList(@JsonProperty("conditions") List<AlertsCondition> items) {
        super(items, AlertsConditionList::new);
    }
}
