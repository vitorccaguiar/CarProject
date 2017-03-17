package br.com.carproject.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "state")
public class State
{

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "uf_code")
    private String ufCode;

    @Column(name = "name")
    private String name;

    @Column(name = "uf")
    private String uf;

    @Column(name = "region")
    private String region;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getUfCode()
    {
        return ufCode;
    }

    public void setUfCode(String ufCode)
    {
        this.ufCode = ufCode;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getUf()
    {
        return uf;
    }

    public void setUf(String uf)
    {
        this.uf = uf;
    }

    public String getRegion()
    {
        return region;
    }

    public void setRegion(String region)
    {
        this.region = region;
    }
}
