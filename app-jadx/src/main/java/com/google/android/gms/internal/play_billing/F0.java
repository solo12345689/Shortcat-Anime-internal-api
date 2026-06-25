package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class F0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final G f40205a = new G();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f40206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Logger f40207c;

    F0(Class cls) {
        this.f40206b = cls.getName();
    }

    final Logger a() {
        Logger logger = this.f40207c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f40205a) {
            try {
                Logger logger2 = this.f40207c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f40206b);
                this.f40207c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
