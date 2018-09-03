/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Пользователь2
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Countrylanguage.findAll", query = "SELECT c FROM CountryLanguage c")})
public class CountryLanguage implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CountryLanguagePK countrylanguagePK;
    @Basic(optional = false)
    @NotNull
    private Character isOfficial;
    @Basic(optional = false)
    @NotNull
    private float percentage;
    @JoinColumn(name = "CountryCode", referencedColumnName = "Code", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Country country;

    public CountryLanguage() {
    }

    public CountryLanguage(CountryLanguagePK countrylanguagePK) {
        this.countrylanguagePK = countrylanguagePK;
    }

    public CountryLanguage(CountryLanguagePK countrylanguagePK, Character isOfficial, float percentage) {
        this.countrylanguagePK = countrylanguagePK;
        this.isOfficial = isOfficial;
        this.percentage = percentage;
    }

    public CountryLanguage(String countryCode, String language) {
        this.countrylanguagePK = new CountryLanguagePK(countryCode, language);
    }

    public CountryLanguagePK getCountrylanguagePK() {
        return countrylanguagePK;
    }

    public void setCountrylanguagePK(CountryLanguagePK countrylanguagePK) {
        this.countrylanguagePK = countrylanguagePK;
    }

    public Character getIsOfficial() {
        return isOfficial;
    }

    public void setIsOfficial(Character isOfficial) {
        this.isOfficial = isOfficial;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (countrylanguagePK != null ? countrylanguagePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CountryLanguage)) {
            return false;
        }
        CountryLanguage other = (CountryLanguage) object;
        if ((this.countrylanguagePK == null && other.countrylanguagePK != null) || (this.countrylanguagePK != null && !this.countrylanguagePK.equals(other.countrylanguagePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BD.Countrylanguage[ countrylanguagePK=" + countrylanguagePK + " ]";
    }
    
}
