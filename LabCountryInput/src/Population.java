public class Population {
    private String countryName;
    
    public Population(String countryName) {
        this.countryName = countryName;
    }
    
    public String getCountryName() {
        return countryName;
    }
    
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    
    public void displayInfo() {
        System.out.println("Info about " + countryName + " Population");
        System.out.println("---------------------------------");
        switch (countryName) {
            case "Philippines":
                System.out.println("Population: 115.6 million");
                System.out.println("Deaths: Approximately six deaths per 1,000 population");
                System.out.println("Migrants: 2.2 million");
                System.out.println("---------------------------------");
                System.out.println("Info about " + countryName + " Products\n");
                System.out.println("Agriculture: Major agricultural products include rice, coconut, sugarcane, bananas, pineapple, and mangoes.\n");
                System.out.println("Technology: The Philippines has a growing technology sector, particularly in outsourcing and business process outsourcing (BPO).\n");
                System.out.println("Mining: The Philippines is rich in mineral resources such as gold, coppesr, nickel, and chromite.");
                System.out.println("---------------------------------");
                System.out.println("Info about " + countryName + " Income GDP");
                System.out.println("404.3 billion USD (2022)\n");
                break;
            case "Brazil":
                System.out.println("Population: 213.9 million");
                System.out.println("Deaths: Approximately 8.33 deaths per 1,000 population.");
                System.out.println("Migrants: 16,000");
                System.out.println("---------------------------------");
                System.out.println("Info about " + countryName + " Products");
                
                System.out.println("Agriculture: Brazil is a major exporter of agricultural products, including soybeans, sugarcane, coffee, corn, and beef.\n");
                System.out.println("Technology: Brazil has a growing technology sector, particularly in software development, fintech, and e-commerce.\n");
                System.out.println("Mining: Brazil is a major producer of minerals such as iron ore, bauxite, niobium, and manganese.");
                System.out.println("---------------------------------");
                System.out.println("Info about " + countryName + " Income GDP");
                System.out.println("1.92 trillion USD (2022)\n");
                
                break;
            case "Mexico":
                System.out.println("Population: 127.5 million");
                System.out.println("Deaths: Approximately 9.4 deaths per 1,000 population.");
                System.out.println("Migrants: 4,102,143");
                System.out.println("---------------------------------");
                System.out.println("Info about " + countryName + " Products");
                
                System.out.println("Agriculture: Mexico is a major exporter of agricultural products, including avocados, tomatoes, peppers, and berries.\n");
                System.out.println("Technology: Mexico has a growing technology sector, particularly in software development, electronics manufacturing, and aerospace.\n");
                System.out.println("Mining: Mexico is a leading producer of minerals such as silver, copper, gold, and zinc.");
                System.out.println("---------------------------------");
                System.out.println("Info about " + countryName + " Income GDP");
                System.out.println("4.232 trillion USD (2022)\n");
                
                break;
            case "Japan":
                System.out.println("Population: 126.3 million");
                System.out.println("Deaths: Approximately 11.7 deaths per 1,000 population.");
                System.out.println("Migrants: 71,143");
                System.out.println("---------------------------------");
                System.out.println("Info about " + countryName + " Products");
                
                System.out.println("Agriculture: Major agricultural products include rice, vegetables, fruits, and fish.\n");
                System.out.println("Technology: Japan is a global leader in technology and innovation, particularly in electronics, robotics, and automotive.\n");
                System.out.println("Mining: Japan has limited mineral resources, but it imports minerals such as coal, iron ore, and copper.");
                System.out.println("---------------------------------");
                System.out.println("Info about " + countryName + " Income GDP");
                System.out.println("4.232 trillion USD (2022)\n");
                
                break;
            case "China":
                System.out.println("Population: 1.412 billion");
                System.out.println("Deaths: Approximately 7.87 deaths per 1000 population.");
                System.out.println("Migrants: 10,000,000");
                System.out.println("---------------------------------");
                System.out.println("Info about " + countryName + " Products");
                
                System.out.println("Agriculture: Major agricultural products include rice, wheat, corn, soybeans, and pork.\n");
                System.out.println("Technology: China is a global leader in technology and innovation, particularly in electronics, telecommunications, and renewable energy.\n");
                System.out.println("Mining: China is a leading producer and consumer of minerals such as coal, iron ore, copper, and rare earth elements.");
                System.out.println("---------------------------------");
                System.out.println("Info about " + countryName + " Income GDP");
                System.out.println("17.96 trillion USD (2022)\n");
                
                break;
            default:
                System.out.println("Population data not available for " + countryName);
        }
    }
}
