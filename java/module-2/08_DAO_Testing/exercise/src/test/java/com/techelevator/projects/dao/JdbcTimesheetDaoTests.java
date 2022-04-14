package com.techelevator.projects.dao;

import com.techelevator.projects.model.Timesheet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

public class JdbcTimesheetDaoTests extends BaseDaoTests {

    private static final Timesheet TIMESHEET_1 = new Timesheet(1L, 1L, 1L, 
            LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 1");
    private static final Timesheet TIMESHEET_2 = new Timesheet(2L, 1L, 1L,
            LocalDate.parse("2021-01-02"), 1.5, true, "Timesheet 2");
    private static final Timesheet TIMESHEET_3 = new Timesheet(3L, 2L, 1L,
            LocalDate.parse("2021-01-01"), 0.25, true, "Timesheet 3");
    private static final Timesheet TIMESHEET_4 = new Timesheet(4L, 2L, 2L,
            LocalDate.parse("2021-02-01"), 2.0, false, "Timesheet 4");

    private Timesheet testSheet;
    private JdbcTimesheetDao sut;


    @Before
    public void setup() {
        sut = new JdbcTimesheetDao(dataSource);
        testSheet = new Timesheet(5L,2L,2L,LocalDate.parse("2021-02-01"), 3.0,true, "Timesheet 5");

    }

    @Test
    public void getTimesheet_returns_correct_timesheet_for_id() {
        Timesheet timesheet = sut.getTimesheet(1L);
        assertTimesheetsMatch(TIMESHEET_1, timesheet);
    }

    @Test
    public void getTimesheet_returns_null_when_id_not_found() {
        Timesheet timesheet = sut.getTimesheet(5L);
        Assert.assertNull(timesheet);
    }

    @Test
    public void getTimesheetsByEmployeeId_returns_list_of_all_timesheets_for_employee() {
        List<Timesheet> timesheet = sut.getTimesheetsByEmployeeId(1L);
        Assert.assertEquals(2, timesheet.size());
        assertTimesheetsMatch(TIMESHEET_1, timesheet.get(0));
        assertTimesheetsMatch(TIMESHEET_2,timesheet.get(1));
    }

    @Test
    public void getTimesheetsByProjectId_returns_list_of_all_timesheets_for_project() {
        List<Timesheet> timesheet = sut.getTimesheetsByProjectId(1L);
        Assert.assertEquals(3, timesheet.size());
        assertTimesheetsMatch(TIMESHEET_1, timesheet.get(0));
        assertTimesheetsMatch(TIMESHEET_2,timesheet.get(1));
        assertTimesheetsMatch(TIMESHEET_3, timesheet.get(2));




    }

    @Test
    public void createTimesheet_returns_timesheet_with_id_and_expected_values() {

        Timesheet createdTimesheet = sut.createTimesheet(testSheet);

        long newId = createdTimesheet.getTimesheetId();
        Assert.assertTrue(newId > 0);

        testSheet.setTimesheetId(newId);
        assertTimesheetsMatch(testSheet, createdTimesheet);

    }

    @Test
    public void created_timesheet_has_expected_values_when_retrieved() {

        Timesheet createdTimesheet = sut.createTimesheet(testSheet);

        long newId = createdTimesheet.getTimesheetId();
        Timesheet retrievedTimesheet = sut.getTimesheet(newId);

        assertTimesheetsMatch(createdTimesheet, retrievedTimesheet);


    }

    @Test
    public void updated_timesheet_has_expected_values_when_retrieved() {

        Timesheet timesheetToUpdate = sut.getTimesheet(1L);

        timesheetToUpdate.setEmployeeId(2L);
        timesheetToUpdate.setProjectId(2L);
        timesheetToUpdate.setDateWorked(LocalDate.parse("2021-02-03"));
        timesheetToUpdate.setHoursWorked(3.5);
        timesheetToUpdate.setDescription("Updated TimeSheet");

        sut.updateTimesheet(timesheetToUpdate);

        Timesheet retrievedTimesheet = sut.getTimesheet(1L);
        assertTimesheetsMatch(timesheetToUpdate, retrievedTimesheet);

    }

    @Test
    public void deleted_timesheet_cant_be_retrieved() {

        sut.deleteTimesheet(1L);

        Timesheet retrievedTimesheet = sut.getTimesheet(1L);

        Assert.assertNull(retrievedTimesheet);



    }

    @Test
    public void getBillableHours_returns_correct_total() {

        double timesheetToCheckHours = sut.getBillableHours(1L,1L);
        double actual = TIMESHEET_1.getHoursWorked() + TIMESHEET_2.getHoursWorked();

        Assert.assertEquals(timesheetToCheckHours,actual,1);

        double timesheetCheckHoursEmployee2 = sut.getBillableHours(2L,1L) + sut.getBillableHours(2L,2L);
        double actualEmployee2 = TIMESHEET_3.getHoursWorked() + TIMESHEET_3.getHoursWorked();

        Assert.assertEquals(timesheetCheckHoursEmployee2,actualEmployee2,1);
    }



    private void assertTimesheetsMatch(Timesheet expected, Timesheet actual) {
        Assert.assertEquals(expected.getTimesheetId(), actual.getTimesheetId());
        Assert.assertEquals(expected.getEmployeeId(), actual.getEmployeeId());
        Assert.assertEquals(expected.getProjectId(), actual.getProjectId());
        Assert.assertEquals(expected.getDateWorked(), actual.getDateWorked());
        Assert.assertEquals(expected.getHoursWorked(), actual.getHoursWorked(), 0.001);
        Assert.assertEquals(expected.isBillable(), actual.isBillable());
        Assert.assertEquals(expected.getDescription(), actual.getDescription());
    }

}
