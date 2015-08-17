package com.navercorp.pinpoint.web.filter.agent;

/**
 * @author emeroad
 */
public class FromPreAgentFilter implements PreAgentFilter {

    private final AgentFilter agentFilter;

    public FromPreAgentFilter(AgentFilter agentFilter) {
        if (agentFilter == null) {
            throw new NullPointerException("agentFilter must not be null");
        }
        this.agentFilter = agentFilter;
    }

    @Override
    public boolean accept(String agentId) {
        return agentFilter.acceptFrom(agentId);
    }
}