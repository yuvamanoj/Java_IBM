package com.ibm.sec.dtos.JenkinsConfigDtos;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@Getter
@Setter
@XmlAccessorType(XmlAccessType.FIELD)
public class SubmoduleCfg {
    @XmlAttribute(name = "class")
    private String _class;
}