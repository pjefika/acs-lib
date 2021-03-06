/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.net.gvt.efika.acs.parser.device;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import br.net.gvt.efika.acs.model.device.pppoe.PPPoECredentialsInfo;

/**
 *
 * @author G0041775
 */
public class PPPoECredentialsInfoSerializer extends StdSerializer<PPPoECredentialsInfo> {

    public PPPoECredentialsInfoSerializer() {
        this(null);
    }

    public PPPoECredentialsInfoSerializer(Class<PPPoECredentialsInfo> t) {
        super(t);
    }

    @Override
    public void serialize(
            PPPoECredentialsInfo value, JsonGenerator jgen, SerializerProvider provider)
            throws IOException, JsonProcessingException {

        jgen.writeStartObject();
        jgen.writeStringField("Username", value.getUsername());
        jgen.writeStringField("Password", value.getPassword());

        jgen.writeEndObject();
    }
}
