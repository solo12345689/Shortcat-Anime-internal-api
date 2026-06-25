package com.google.common.util.concurrent;

import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f43175a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f43176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Logger f43177c;

    o(Class cls) {
        this.f43176b = cls.getName();
    }

    Logger a() {
        Logger logger = this.f43177c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f43175a) {
            try {
                Logger logger2 = this.f43177c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f43176b);
                this.f43177c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
