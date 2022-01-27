package com.gdm.unitbv.itsec.spoofing.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Credentials {

    private @NonNull String emailAddressSender;
    private @NonNull String emailAddressSenderPassword;
    private @NonNull String emailAddressRecipient;
}
