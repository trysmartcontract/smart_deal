package ru.github.try_contract.service;

public interface CheckBugTrackingSystemService {
    int countCriticalIssue();

    int countAverageIssue();

    int countMinorIssue();
}