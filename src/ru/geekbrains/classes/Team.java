package ru.geekbrains.classes;

public class Team {
    private Participant[] participants;

    public Team(Participant[] particapantsArray) {
        this.participants=particapantsArray;

    }

    public void ShowResults() {
        System.out.println("Итоги:");
        for (Participant pt : participants) {
            System.out.println(pt);
        }
    }

    public Participant[] GetParticipants() {
        return this.participants;

    }

}
