/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.parser.device;

import br.net.gvt.efika.acs.model.device.dhcp.Dhcp;
import br.net.gvt.efika.acs.model.device.wan.WanInfo;
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
public class WanInfoDeserializer extends StdDeserializer<WanInfo> {

    public WanInfoDeserializer() {
        this(null);
    }

    public WanInfoDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public WanInfo deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException, JsonProcessingException {
        WanInfo d = new WanInfo();
        JsonNode node = jp.getCodec().readTree(jp);
        d.setBytesReceived(node.get("BytesReceived").asText());
        d.setBytesSent(node.get("BytesSent").asText());
        d.setDiscardPacketsReceived(node.get("DiscardPacketsReceived").asText());
        d.setDiscardPacketsSent(node.get("DiscardPacketsSent").asText());
        d.setErrorsReceived(node.get("ErrorsReceived").asText());
        d.setErrorsSent(node.get("ErrorsSent").asText());
        d.setPacketsReceived(node.get("PacketsReceived").asText());
        d.setPacketsSent(node.get("PacketsSent").asText());

        return d;
    }
}
