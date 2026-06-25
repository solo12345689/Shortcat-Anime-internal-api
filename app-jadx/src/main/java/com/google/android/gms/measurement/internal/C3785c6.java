package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C3583t3;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.c6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3785c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f41133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f41134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j9.G f41135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3583t3 f41136d;

    C3785c6(String str, Map map, j9.G g10, C3583t3 c3583t3) {
        this.f41133a = str;
        this.f41134b = map;
        this.f41135c = g10;
        this.f41136d = c3583t3;
    }

    public final String a() {
        return this.f41133a;
    }

    public final Map b() {
        Map map = this.f41134b;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    public final j9.G c() {
        return this.f41135c;
    }

    public final C3583t3 d() {
        return this.f41136d;
    }
}
