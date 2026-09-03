package com.example;

public class VotingEligibilitySystem {

    public static void main(String[] args) {

        // Built-in voter inputs
        Voter[] voters = {
            new Voter("Rahul", 25, "Indian", "IND1001", true),
            new Voter("Priya", 17, "Indian", "IND1002", true),
            new Voter("John", 30, "American", "USA1003", true),
            new Voter("Arun", 22, "Indian", "IND1004", false),
            new Voter("Sneha", 19, "Indian", "IND1005", true)
        };

        System.out.println("======================================");
        System.out.println("     VOTING ELIGIBILITY SYSTEM");
        System.out.println("======================================");

        for (Voter voter : voters) {

            System.out.println("\nVoter Name : " + voter.getName());
            System.out.println("Age        : " + voter.getAge());
            System.out.println("Citizenship: " + voter.getCitizenship());
            System.out.println("Voter ID   : " + voter.getVoterId());
            System.out.println("ID Valid   : " + voter.isIdValid());

            boolean eligible = true;

            // Check age
            if (voter.getAge() < 18) {
                System.out.println("Result     : NOT ELIGIBLE");
                System.out.println("Reason     : Voter is under 18 years old.");
                eligible = false;
            }

            // Check citizenship
            if (!voter.getCitizenship().equalsIgnoreCase("Indian")) {
                System.out.println("Result     : NOT ELIGIBLE");
                System.out.println("Reason     : Voter is not an Indian citizen.");
                eligible = false;
            }

            // Check voter ID
            if (!voter.isIdValid()) {
                System.out.println("Result     : NOT ELIGIBLE");
                System.out.println("Reason     : Voter ID is invalid.");
                eligible = false;
            }

            // If all conditions are satisfied
            if (eligible) {
                System.out.println("Result     : ELIGIBLE TO VOTE");
                System.out.println("Reason     : All eligibility conditions are satisfied.");
            }

            System.out.println("--------------------------------------");
        }
    }
}
