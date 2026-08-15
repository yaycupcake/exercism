import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime appointmentDateTime = LocalDateTime.parse(appointmentDateDescription, parser);
        return appointmentDateTime;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime today = LocalDateTime.now();
        return appointmentDate.isBefore(today);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int appointmentHour = appointmentDate.getHour();
        return appointmentHour >= 12 && appointmentHour < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        return DateTimeFormatter.ofPattern("'You have an appointment on' EEEE, MMMM d, yyyy, 'at' h:mm a.").format(appointmentDate);        
    }

    public LocalDate getAnniversaryDate() {
        LocalDateTime today = LocalDateTime.now();
        int thisYear = today.getYear();
        LocalDate thisAnniversary = LocalDate.of(thisYear, 9, 15);
        return thisAnniversary;
    }
}
