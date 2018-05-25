/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.parser.device;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;
import br.net.gvt.efika.acs.model.device.interfacestatistics.InterfaceStatistics;

/**
 *
 * @author G0041775
 */
public class InterfaceStatisticsDeserializer extends StdDeserializer<InterfaceStatistics> {

    public InterfaceStatisticsDeserializer() {
        this(null);
    }

    public InterfaceStatisticsDeserializer(Class<?> vc) {
        super(vc);
    }

    protected String getValueFromNode(JsonNode node, String paramName) {
        try {
            return node.get(paramName).asText();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public InterfaceStatistics deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException, JsonProcessingException {
        InterfaceStatistics i = new InterfaceStatistics();
        JsonNode node = jp.getCodec().readTree(jp);

        String ifType = getValueFromNode(node, "ifType") == null ? this.getValueFromNode(node, "iftype"): getValueFromNode(node, "ifType");
        i.setIfType(ifType);
        i.setAdminStatus(node.get("adminStatus").asText());
        i.setOperStatus(node.get("operStatus").asText());
        i.setIfName(node.get("ifName").asText());
        i.setErrRecv(node.get("errRecv").asText());
        i.setIpAddrType(node.get("ipAddrType").asText());
        i.setIpAddress(node.get("ipAddress").asText());
        i.setMacAddress(node.get("macAddress").asText());
        i.setBytesSent(node.get("bytesSent").asText());
        i.setBytesRecv(node.get("bytesRecv").asText());
        i.setPctSent(node.get("pctSent").asText());
        i.setPctRecv(node.get("pctRecv").asText());
        i.setMcSent(node.get("mcSent").asText());
        i.setMcRecv(node.get("mcRecv").asText());
        i.setBcSent(node.get("bcSent").asText());
        i.setBcRecv(node.get("bcRecv").asText());
        i.setErrSent(node.get("errSent").asText());
        i.setErrRecv(node.get("errRecv").asText());

        return i;
    }
}
