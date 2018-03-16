package com.kakhanov.luxoft.mlp.interview.concurrency;

public interface ReadWriteLockInterface {
    void acquireReadLock();
    void releaseReadLock();
    void acquireWriteLock();
    void releaseWriteLock();
}