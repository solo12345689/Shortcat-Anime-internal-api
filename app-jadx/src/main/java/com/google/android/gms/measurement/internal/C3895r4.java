package com.google.android.gms.measurement.internal;

import java.util.Comparator;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.r4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class C3895r4 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ C3895r4 f41577a = new C3895r4();

    private /* synthetic */ C3895r4() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
    }
}
