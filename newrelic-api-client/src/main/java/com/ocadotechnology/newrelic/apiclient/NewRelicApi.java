package com.ocadotechnology.newrelic.apiclient;

import com.ocadotechnology.newrelic.apiclient.internal.NewRelicInternalApi;
import lombok.Getter;

/**
 * API facade - object exposing NewRelic API endpoints as Java methods. Requires API key.
 */
@Getter
public class NewRelicApi {

    private static final String NEWRELIC_HOST_URL = "https://api.newrelic.com";

    private final ApplicationsApi applicationsApi;

    private final AlertsChannelsApi alertsChannelsApi;

    private final AlertsPoliciesApi alertsPoliciesApi;

    private final AlertsConditionsApi alertsConditionsApi;

    private final AlertsNrqlConditionsApi alertsNrqlConditionsApi;

    private final AlertsExternalServiceConditionsApi alertsExternalServiceConditionsApi;

    private final KeyTransactionsApi keyTransactionsApi;

    private final DeploymentsApi deploymentsApi;

    private final ServersApi serversApi;

    private final UsersApi usersApi;

    /**
     * NewRelic API constructor.
     *
     * @param apiKey API Key for given NewRelic account
     */
    public NewRelicApi(String apiKey) {
        this(NEWRELIC_HOST_URL, apiKey);
    }

    /**
     * NewRelic API constructor.
     *
     * @param hostUrl NewRelic API host URL, for example https://api.newrelic.com
     * @param apiKey  API Key for given NewRelic account
     */
    public NewRelicApi(String hostUrl, String apiKey) {
        NewRelicInternalApi internalApi = new NewRelicInternalApi(hostUrl, apiKey);
        applicationsApi = internalApi.getApplicationsApi();
        alertsChannelsApi = internalApi.getAlertsChannelsApi();
        alertsPoliciesApi = internalApi.getAlertsPoliciesApi();
        alertsConditionsApi = internalApi.getAlertsConditionsApi();
        alertsNrqlConditionsApi = internalApi.getAlertsNrqlConditionsApi();
        alertsExternalServiceConditionsApi = internalApi.getAlertsExternalServiceConditionsApi();
        keyTransactionsApi = internalApi.getKeyTransactionsApi();
        deploymentsApi = internalApi.getDeploymentsApi();
        serversApi = internalApi.getServersApi();
        usersApi = internalApi.getUsersApi();
    }
}
