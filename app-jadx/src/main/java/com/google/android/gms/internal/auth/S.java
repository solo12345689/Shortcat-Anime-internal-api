package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class S implements Serializable {
    S() {
    }

    public static S c() {
        return P.f39115a;
    }

    public static S d(Object obj) {
        return new T(obj);
    }

    public abstract Object a();

    public abstract boolean b();
}
