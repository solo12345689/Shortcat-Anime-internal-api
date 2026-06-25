package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Z {
    public static U a(U u10) {
        return ((u10 instanceof X) || (u10 instanceof V)) ? u10 : u10 instanceof Serializable ? new V(u10) : new X(u10);
    }

    public static U b(Object obj) {
        return new Y(obj);
    }
}
