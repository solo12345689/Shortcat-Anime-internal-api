package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class M3 extends Exception {
    public M3(String str) {
        super(str);
    }

    public M3(String str, Throwable th2) {
        super("ContentProvider query failed", th2);
    }
}
