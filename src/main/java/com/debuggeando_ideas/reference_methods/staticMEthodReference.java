package com.debuggeando_ideas.reference_methods;

import java.util.UUID;
import java.util.function.Supplier;

public class staticMEthodReference {
    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString());

        Supplier<UUID> geToken = () -> UUID.randomUUID();
        Supplier<UUID> geTokenReferenceMEthod = UUID::randomUUID;

        System.out.println(geToken.get());
        System.out.println(geTokenReferenceMEthod);
    }
}
