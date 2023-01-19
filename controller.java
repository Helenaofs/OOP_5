import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class controller {

  AttendanceService attendanceService;
  AttendanceView attendanceView;

  public controller(AttendanceService attendanceService, AttendanceView attendanceView) {
    this.attendanceService = attendanceService;
    this.attendanceView = attendanceView;
  }

  public void buttonClick() {
    int number = attendanceView.getValue();
    if (number == 1) {
      attendanceView.PrintListAttendance(attendanceService);
    }else if (number == 2) {
      attendanceView.SortIncreaseListAttendance(attendanceService);
    }else  attendanceView.ListLowAttendance(attendanceService);
    }


}