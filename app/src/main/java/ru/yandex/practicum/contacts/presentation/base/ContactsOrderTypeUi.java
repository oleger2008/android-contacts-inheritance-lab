package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;

abstract public class ContactsOrderTypeUi {
    private final String type;
    private final boolean isSelected;

    public ContactsOrderTypeUi(@NonNull final String type, final boolean isSelected) {
        this.type = type;
        this.isSelected = isSelected;
    }

    public String getType() {
        return type;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public abstract String createLogMessage();
}
