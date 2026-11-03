/*
 * Copyright The WildFly Authors
 * SPDX-License-Identifier: Apache-2.0
 */
package org.wildfly.plugin.tools.bootablejar;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Minimal CycloneDX component POJO used when injecting the bootable-jar boot
 * component into the provisioned SBOM.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
class CdxComponent {

    private String type;
    @JsonProperty("bom-ref")
    private String bomRef;
    private String group;
    private String name;
    private String version;
    private String purl;

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getBomRef() { return bomRef; }
    public void setBomRef(String bomRef) { this.bomRef = bomRef; }

    public String getGroup() { return group; }
    public void setGroup(String group) { this.group = group; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }

    public String getPurl() { return purl; }
    public void setPurl(String purl) { this.purl = purl; }
}
