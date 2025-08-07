package com.demoms.demoMicroservice;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

    public static boolean done;

    public static void main(String[] args) {

        String filePath = "/home/bahl/WAQAR_JATOI/WAQAR_DOCS/JMS_LOGS/obdx_jms-130.log"; // 🔁 Replace with your actual file path
        Set<String> interfaceIds = new HashSet<>();

        // Pattern to extract <interfaceId>VALUE</interfaceId>
        Pattern pattern = Pattern.compile("<interfaceId>(.*?)</interfaceId>");

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);
                while (matcher.find()) {
                    String id = matcher.group(1).trim();
                    interfaceIds.add(id);
                }
            }

            // Print distinct interfaceIds
            System.out.println("Distinct interface IDs found:");
            for (String id : interfaceIds) {
                System.out.println(id);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
