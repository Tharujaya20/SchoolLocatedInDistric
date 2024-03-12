public class District {Schools colomboSchools = new Schools();
    Schools kandySchools = new Schools();
    Schools gampahaSchools = new Schools();
    Schools galleSchools = new Schools();
    Schools mataraSchools = new Schools();

    void printSchools(String districtName) {
        System.out.println("Schools in " + districtName + " district:");
        switch (districtName.toLowerCase()) {
            case "colombo":
                printSchoolDetails(colomboSchools);
                break;
            case "kandy":
                printSchoolDetails(kandySchools);
                break;
            case "gampaha":
                printSchoolDetails(gampahaSchools);
                break;
            case "galle":
                printSchoolDetails(galleSchools);
                break;
            case "matara":
                printSchoolDetails(mataraSchools);
                break;
            default:
                System.out.println("Invalid district name: " + districtName);
        }
    }

    private void printSchoolDetails(Schools schools) {
        System.out.println("1. " + schools.school1);
        System.out.println("2. " + schools.school2);
        System.out.println("3. " + schools.school3);
        System.out.println("4. " + schools.school4);
        System.out.println("5. " + schools.school5 + "\n");
    }
}

