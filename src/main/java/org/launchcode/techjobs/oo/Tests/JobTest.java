package org.launchcode.techjobs.oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    //Instead of creating the Job objects inside the test method, you could declare and initialize them using @Before
    @Before
    public void createJobObjects(){
        //Create two Job objects using the empty constructor.
        Job emptyJob1 = new Job();
        Job emptyJob2 = new Job();

    }


    @Test
    public void testSettingJobId(){ //Testing Empty Constructor
        Job emptyJob1 = new Job();
        Job emptyJob2 = new Job();
        //test that the ID values for the two objects are NOT the same and differ by 1
        assertTrue((emptyJob1.getId()+1)==emptyJob2.getId());
        assertFalse(emptyJob1.equals(emptyJob2));

    }

    //Testing the Full Constructor
    @Test
    public void testJobConstructorSetsAllFields(){
        // Declare and initialize a new Job object with the following data:
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        //new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob1 instanceof Job);
        assertTrue(testJob1.getName() =="Product tester");

        assertTrue(testJob1.getEmployer() instanceof Employer);
        assertTrue(testJob1.getEmployer().getValue() == "ACME");

        assertTrue(testJob1.getLocation() instanceof Location);
        assertTrue(testJob1.getLocation().getValue() == "Desert");

        assertTrue(testJob1.getPositionType() instanceof PositionType);
        assertTrue(testJob1.getPositionType().getValue() == "Quality control");

        assertTrue(testJob1.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(testJob1.getCoreCompetency().getValue() == "Persistence");



    }

    //Testing the equals method
    @Test
    public void testJobsForEquality(){
        //Generate two Job objects that have identical field values EXCEPT for id. Test that equals returns false.
        Job testJob2= new Job("Product Manager", new Employer("CoolCompany"), new Location("Beach"), new PositionType("Management"), new CoreCompetency("Joyful"));
        Job testJob3= new Job("Product Manager", new Employer("CoolCompany"), new Location("Beach"), new PositionType("Management"), new CoreCompetency("Joyful"));

        assertFalse(testJob2.equals(testJob3));

    }

    //check that the value assigned to the instance  for each ---

    //Test equals method



}
