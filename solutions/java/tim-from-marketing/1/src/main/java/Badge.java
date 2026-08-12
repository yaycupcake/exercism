class Badge {
    public String print(Integer id, String name, String department) {
        String idText = "";
        String nameText = name + " - ";
        String departmentText = "OWNER";
        
        if (id != null) {
            idText = "[" + id + "] - ";
        }
        
        if (department != null) {
            departmentText = department.toUpperCase();
        }
        
        String badgeText = idText + nameText + departmentText;
        return badgeText;
    }
}
