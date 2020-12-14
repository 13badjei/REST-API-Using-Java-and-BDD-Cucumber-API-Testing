package com.api.project.model.medicalPojo;

/**
 * Created by Benjamin Adjei on 14/12/20
 */
public class ClassName
{
    private AssociatedDrug[] associatedDrug;

    private AssociatedDrug2[] associatedDrug2;

    public AssociatedDrug[] getAssociatedDrug ()
    {
        return associatedDrug;
    }

    public void setAssociatedDrug (AssociatedDrug[] associatedDrug)
    {
        this.associatedDrug = associatedDrug;
    }

    public AssociatedDrug2[] getAssociatedDrug2 ()
    {
        return associatedDrug2;
    }

    public void setAssociatedDrug2 (AssociatedDrug2[] associatedDrug2)
    {
        this.associatedDrug2 = associatedDrug2;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [associatedDrug = "+associatedDrug+", associatedDrug2 = "+associatedDrug2+"]";
    }
}
