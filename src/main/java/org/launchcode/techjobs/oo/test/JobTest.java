package org.launchcode.techjobs.oo.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();

        Assert.assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Assert.assertTrue(job1 instanceof Job);
        Assert.assertTrue(job1.getEmployer() instanceof Employer);
        Assert.assertTrue(job1.getLocation() instanceof Location);
        Assert.assertTrue(job1.getPositionType() instanceof PositionType);
        Assert.assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);

        Assert.assertEquals("Product tester", job1.getName());
        Assert.assertEquals("ACME", job1.getEmployer().getValue());
        Assert.assertEquals("Desert", job1.getLocation().getValue());
        Assert.assertEquals("Quality control", job1.getPositionType().getValue());
        Assert.assertEquals("Persistence", job1.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {

        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Assert.assertFalse(job1.getId() == job2.getId());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {

        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Assert.assertEquals('\n', job1.toString().charAt(0));
        Assert.assertEquals('\n', job1.toString().charAt(job1.toString().length()-1));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {

        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        Assert.assertEquals(("\n" +
                "ID: " + job1.getId() + "\n" +
                "Name: " + job1.getName() + "\n" +
                "Employer: " + job1.getEmployer() + "\n" +
                "Location: " + job1.getLocation() + "\n" +
                "Position Type: " + job1.getPositionType() + "\n" +
                "Core Competency: " + job1.getCoreCompetency() + "\n"), job1.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job1 = new Job("Product tester", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

        Assert.assertEquals(("\n" +
                "ID: " + job1.getId() + "\n" +
                "Name: " + job1.getName() + "\n" +
                "Employer: " + "Data not available" + "\n" +
                "Location: " + "Data not available" + "\n" +
                "Position Type: " + "Data not available" + "\n" +
                "Core Competency: " + "Data not available" + "\n"), job1.toString());

    }

}
