package org.telegram.solo;

public interface GenericProvider<F, T> {
    T provide(F obj);
}
