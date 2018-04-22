package ru.github.try_contract.service;

import java.util.Date;

/**
 * Github or other storage API
 */
public interface CheckStorageService {
    Date latestVersion();
}
