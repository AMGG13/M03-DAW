/**
 * ADT for country.
 * @author Jose
 */
public class Country {
    private int id;
    private String name;
    private String capital;
    private double surface;
    private int inhabitants;
    private double pib;
    private int lifeexpectancy;

    public Country(int id, String name, String capital, double surface, int inhabitants, double pib, int lifeexpectancy) {
        this.id = id;
        this.name = name;
        this.capital = capital;
        this.surface = surface;
        this.inhabitants = inhabitants;
        this.pib = pib;
        this.lifeexpectancy = lifeexpectancy;
    }

    public Country() {
    }

    public Country(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public int getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(int inhabitants) {
        this.inhabitants = inhabitants;
    }

    public double getPib() {
        return pib;
    }

    public void setPib(double pib) {
        this.pib = pib;
    }

    public int getLifeexpectancy() {
        return lifeexpectancy;
    }

    public void setLifeexpectancy(int lifeexpectancy) {
        this.lifeexpectancy = lifeexpectancy;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Country other = (Country) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Country{" + "id=" + id + ", name=" + name + ", capital=" + capital + ", surface=" + surface + ", inhabitants=" + inhabitants + ", pib=" + pib + ", lifeexpectancy=" + lifeexpectancy + '}';
    }
}