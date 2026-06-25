package com.amazon.device.iap.internal.util;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public enum d {
    LEGACY(0),
    V1(1),
    V2(2),
    V3(3);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35151e;

    d(int i10) {
        this.f35151e = i10;
    }

    int a() {
        return this.f35151e;
    }

    public boolean a(d dVar) {
        return dVar != null && this.f35151e < dVar.f35151e;
    }
}
