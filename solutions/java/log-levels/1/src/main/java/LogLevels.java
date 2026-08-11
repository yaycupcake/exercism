public class LogLevels {
    
    public static String message(String logLine) {
        int colonIndex = logLine.indexOf(":", 0);
        String message = logLine.substring(colonIndex+1).trim();
        return(message);
    }
    
    public static String logLevel(String logLine) {
        int openingBracketIndex = logLine.indexOf("[", 0);
        int closingBracketIndex = logLine.indexOf("]", openingBracketIndex);
        String level = logLine.substring(openingBracketIndex+1, closingBracketIndex).toLowerCase();
        return(level);
    }

    public static String reformat(String logLine) {
        String reformattedLogLine = message(logLine) + " (" + logLevel(logLine) + ")";
        return(reformattedLogLine);
    }
}
