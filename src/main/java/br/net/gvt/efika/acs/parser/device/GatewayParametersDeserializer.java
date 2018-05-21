/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.parser.device;

import br.net.gvt.efika.acs.model.device.gatewayparameters.GatewayParameters;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;

/**
 *
 * @author G0041775
 */
public class GatewayParametersDeserializer extends StdDeserializer<GatewayParameters> {

    public GatewayParametersDeserializer() {
        this(null);
    }

    public GatewayParametersDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public GatewayParameters deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException, JsonProcessingException {
        GatewayParameters d = new GatewayParameters();
        JsonNode node = jp.getCodec().readTree(jp);
        d.setDHCPLeaseTime(node.get("DHCPLeaseTime").asText());
        d.setDHCPMaxAddress(node.get("DHCPMaxAddress").asText());
        d.setDHCPMinAddress(node.get("DHCPMinAddress").asText());
        d.setDHCPRelay(node.get("DHCPRelay").asText());
        d.setDHCPServerEnable(node.get("DHCPServerEnable").asText());
        d.setDNSServers(node.get("DNSServers").asText());
//        d.setDomainName(node.get("DomainName").asText());
        
        

        return d;
    }
}
