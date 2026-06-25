package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class K2 implements com.google.android.gms.internal.measurement.S5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f40828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ P2 f40829b;

    K2(P2 p22, String str) {
        this.f40828a = str;
        Objects.requireNonNull(p22);
        this.f40829b = p22;
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final String a(String str) {
        Map map = (Map) this.f40829b.p().get(this.f40828a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
