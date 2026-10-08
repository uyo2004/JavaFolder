// Uyoojo Okene
// p.387

public class Rock
{
    protected int sampleNumber;
    protected String description;
    protected double weight;

    public Rock(int sampleNumber, double weight)
    {
        this.sampleNumber = sampleNumber;
        this.weight = weight;
        description = "Unclassified";
    }

    public int getSampleNumber()
    {
        return sampleNumber;
    }

    public String getDescription()
    {
        return description;
    }

    public double getWeight()
    {
        return weight;
    }
}
