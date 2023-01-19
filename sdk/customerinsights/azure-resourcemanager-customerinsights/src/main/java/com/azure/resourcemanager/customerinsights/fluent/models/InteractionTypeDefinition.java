// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.customerinsights.models.DataSourcePrecedence;
import com.azure.resourcemanager.customerinsights.models.DataSourceType;
import com.azure.resourcemanager.customerinsights.models.EntityTypeDefinition;
import com.azure.resourcemanager.customerinsights.models.EntityTypes;
import com.azure.resourcemanager.customerinsights.models.Participant;
import com.azure.resourcemanager.customerinsights.models.PropertyDefinition;
import com.azure.resourcemanager.customerinsights.models.Status;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The Interaction Type Definition. */
@Fluent
public final class InteractionTypeDefinition extends EntityTypeDefinition {
    /*
     * The id property names. Properties which uniquely identify an interaction instance.
     */
    @JsonProperty(value = "idPropertyNames")
    private List<String> idPropertyNames;

    /*
     * Profiles that participated in the interaction.
     */
    @JsonProperty(value = "participantProfiles")
    private List<Participant> participantProfiles;

    /*
     * The primary participant property name for an interaction ,This is used to logically represent the agent of the
     * interaction, Specify the participant name here from ParticipantName.
     */
    @JsonProperty(value = "primaryParticipantProfilePropertyName")
    private String primaryParticipantProfilePropertyName;

    /*
     * This is specific to interactions modeled as activities. Data sources are used to determine where data is stored
     * and also in precedence rules.
     */
    @JsonProperty(value = "dataSourcePrecedenceRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<DataSourcePrecedence> dataSourcePrecedenceRules;

    /*
     * Default data source is specifically used in cases where data source is not specified in an instance.
     */
    @JsonProperty(value = "defaultDataSource")
    private DataSource innerDefaultDataSource;

    /*
     * An interaction can be tagged as an activity only during create. This enables the interaction to be editable and
     * can enable merging of properties from multiple data sources based on precedence, which is defined at a link
     * level.
     */
    @JsonProperty(value = "isActivity")
    private Boolean isActivity;

    /** Creates an instance of InteractionTypeDefinition class. */
    public InteractionTypeDefinition() {
    }

    /**
     * Get the idPropertyNames property: The id property names. Properties which uniquely identify an interaction
     * instance.
     *
     * @return the idPropertyNames value.
     */
    public List<String> idPropertyNames() {
        return this.idPropertyNames;
    }

    /**
     * Set the idPropertyNames property: The id property names. Properties which uniquely identify an interaction
     * instance.
     *
     * @param idPropertyNames the idPropertyNames value to set.
     * @return the InteractionTypeDefinition object itself.
     */
    public InteractionTypeDefinition withIdPropertyNames(List<String> idPropertyNames) {
        this.idPropertyNames = idPropertyNames;
        return this;
    }

    /**
     * Get the participantProfiles property: Profiles that participated in the interaction.
     *
     * @return the participantProfiles value.
     */
    public List<Participant> participantProfiles() {
        return this.participantProfiles;
    }

    /**
     * Set the participantProfiles property: Profiles that participated in the interaction.
     *
     * @param participantProfiles the participantProfiles value to set.
     * @return the InteractionTypeDefinition object itself.
     */
    public InteractionTypeDefinition withParticipantProfiles(List<Participant> participantProfiles) {
        this.participantProfiles = participantProfiles;
        return this;
    }

    /**
     * Get the primaryParticipantProfilePropertyName property: The primary participant property name for an interaction
     * ,This is used to logically represent the agent of the interaction, Specify the participant name here from
     * ParticipantName.
     *
     * @return the primaryParticipantProfilePropertyName value.
     */
    public String primaryParticipantProfilePropertyName() {
        return this.primaryParticipantProfilePropertyName;
    }

    /**
     * Set the primaryParticipantProfilePropertyName property: The primary participant property name for an interaction
     * ,This is used to logically represent the agent of the interaction, Specify the participant name here from
     * ParticipantName.
     *
     * @param primaryParticipantProfilePropertyName the primaryParticipantProfilePropertyName value to set.
     * @return the InteractionTypeDefinition object itself.
     */
    public InteractionTypeDefinition withPrimaryParticipantProfilePropertyName(
        String primaryParticipantProfilePropertyName) {
        this.primaryParticipantProfilePropertyName = primaryParticipantProfilePropertyName;
        return this;
    }

    /**
     * Get the dataSourcePrecedenceRules property: This is specific to interactions modeled as activities. Data sources
     * are used to determine where data is stored and also in precedence rules.
     *
     * @return the dataSourcePrecedenceRules value.
     */
    public List<DataSourcePrecedence> dataSourcePrecedenceRules() {
        return this.dataSourcePrecedenceRules;
    }

    /**
     * Get the innerDefaultDataSource property: Default data source is specifically used in cases where data source is
     * not specified in an instance.
     *
     * @return the innerDefaultDataSource value.
     */
    private DataSource innerDefaultDataSource() {
        return this.innerDefaultDataSource;
    }

    /**
     * Get the isActivity property: An interaction can be tagged as an activity only during create. This enables the
     * interaction to be editable and can enable merging of properties from multiple data sources based on precedence,
     * which is defined at a link level.
     *
     * @return the isActivity value.
     */
    public Boolean isActivity() {
        return this.isActivity;
    }

    /**
     * Set the isActivity property: An interaction can be tagged as an activity only during create. This enables the
     * interaction to be editable and can enable merging of properties from multiple data sources based on precedence,
     * which is defined at a link level.
     *
     * @param isActivity the isActivity value to set.
     * @return the InteractionTypeDefinition object itself.
     */
    public InteractionTypeDefinition withIsActivity(Boolean isActivity) {
        this.isActivity = isActivity;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public InteractionTypeDefinition withApiEntitySetName(String apiEntitySetName) {
        super.withApiEntitySetName(apiEntitySetName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public InteractionTypeDefinition withEntityType(EntityTypes entityType) {
        super.withEntityType(entityType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public InteractionTypeDefinition withFields(List<PropertyDefinition> fields) {
        super.withFields(fields);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public InteractionTypeDefinition withInstancesCount(Integer instancesCount) {
        super.withInstancesCount(instancesCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public InteractionTypeDefinition withSchemaItemTypeLink(String schemaItemTypeLink) {
        super.withSchemaItemTypeLink(schemaItemTypeLink);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public InteractionTypeDefinition withTimestampFieldName(String timestampFieldName) {
        super.withTimestampFieldName(timestampFieldName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public InteractionTypeDefinition withTypeName(String typeName) {
        super.withTypeName(typeName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public InteractionTypeDefinition withAttributes(Map<String, List<String>> attributes) {
        super.withAttributes(attributes);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public InteractionTypeDefinition withDescription(Map<String, String> description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public InteractionTypeDefinition withDisplayName(Map<String, String> displayName) {
        super.withDisplayName(displayName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public InteractionTypeDefinition withLocalizedAttributes(Map<String, Map<String, String>> localizedAttributes) {
        super.withLocalizedAttributes(localizedAttributes);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public InteractionTypeDefinition withSmallImage(String smallImage) {
        super.withSmallImage(smallImage);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public InteractionTypeDefinition withMediumImage(String mediumImage) {
        super.withMediumImage(mediumImage);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public InteractionTypeDefinition withLargeImage(String largeImage) {
        super.withLargeImage(largeImage);
        return this;
    }

    /**
     * Get the name property: The data source name.
     *
     * @return the name value.
     */
    public String name() {
        return this.innerDefaultDataSource() == null ? null : this.innerDefaultDataSource().name();
    }

    /**
     * Get the dataSourceType property: The data source type.
     *
     * @return the dataSourceType value.
     */
    public DataSourceType dataSourceType() {
        return this.innerDefaultDataSource() == null ? null : this.innerDefaultDataSource().dataSourceType();
    }

    /**
     * Get the status property: The data source status.
     *
     * @return the status value.
     */
    public Status status() {
        return this.innerDefaultDataSource() == null ? null : this.innerDefaultDataSource().status();
    }

    /**
     * Get the id property: The data source ID.
     *
     * @return the id value.
     */
    public Integer id() {
        return this.innerDefaultDataSource() == null ? null : this.innerDefaultDataSource().id();
    }

    /**
     * Get the dataSourceReferenceId property: The data source reference id.
     *
     * @return the dataSourceReferenceId value.
     */
    public String dataSourceReferenceId() {
        return this.innerDefaultDataSource() == null ? null : this.innerDefaultDataSource().dataSourceReferenceId();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (participantProfiles() != null) {
            participantProfiles().forEach(e -> e.validate());
        }
        if (dataSourcePrecedenceRules() != null) {
            dataSourcePrecedenceRules().forEach(e -> e.validate());
        }
        if (innerDefaultDataSource() != null) {
            innerDefaultDataSource().validate();
        }
    }
}