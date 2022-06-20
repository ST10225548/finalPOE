/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author st10225548
 */
public class ShowReportTest {
    
    public ShowReportTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of statusOfdone method, of class ShowReport.
     */
    @Test
    public void testStatusOfdone() {
        System.out.println("statusOfdone");
        String expResult = "";
        String result = ShowReport.statusOfdone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of longestDuration method, of class ShowReport.
     */
    @Test
    public void testLongestDuration() {
        System.out.println("longestDuration");
        String expResult = "";
        String result = ShowReport.longestDuration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchTaskName method, of class ShowReport.
     */
    @Test
    public void testSearchTaskName() {
        System.out.println("searchTaskName");
        String nameSearch = "";
        String[] developer = null;
        String[] taskName = null;
        String[] taskStatus = null;
        String expResult = "";
        String result = ShowReport.searchTaskName(nameSearch, developer, taskName, taskStatus);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchDeveloper method, of class ShowReport.
     */
    @Test
    public void testSearchDeveloper() {
        System.out.println("searchDeveloper");
        String[] developer = null;
        String nameOfDev = "";
        String[] taskName = null;
        String[] taskStatus = null;
        String expResult = "";
        String result = ShowReport.searchDeveloper(developer, nameOfDev, taskName, taskStatus);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class ShowReport.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        String taskName = "";
        ShowReport.delete(taskName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayreport method, of class ShowReport.
     */
    @Test
    public void testDisplayreport() {
        System.out.println("displayreport");
        String[] nameOfDev = null;
        String[] taskStatus = null;
        String[] taskName = null;
        String[] longestDuration = null;
        String expResult = "";
        String result = ShowReport.displayreport(nameOfDev, taskStatus, taskName, longestDuration);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
