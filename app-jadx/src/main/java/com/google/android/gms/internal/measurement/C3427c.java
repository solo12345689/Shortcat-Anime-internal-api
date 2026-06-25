package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3427c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C3418b f39723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C3418b f39724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f39725c;

    public C3427c() {
        this.f39723a = new C3418b("", 0L, null);
        this.f39724b = new C3418b("", 0L, null);
        this.f39725c = new ArrayList();
    }

    public final C3418b a() {
        return this.f39723a;
    }

    public final void b(C3418b c3418b) {
        this.f39723a = c3418b;
        this.f39724b = c3418b.clone();
        this.f39725c.clear();
    }

    public final C3418b c() {
        return this.f39724b;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        C3427c c3427c = new C3427c(this.f39723a.clone());
        Iterator it = this.f39725c.iterator();
        while (it.hasNext()) {
            c3427c.f39725c.add(((C3418b) it.next()).clone());
        }
        return c3427c;
    }

    public final void d(C3418b c3418b) {
        this.f39724b = c3418b;
    }

    public final void e(String str, long j10, Map map) {
        HashMap map2 = new HashMap();
        for (String str2 : map.keySet()) {
            map2.put(str2, C3418b.h(str2, this.f39723a.e(str2), map.get(str2)));
        }
        this.f39725c.add(new C3418b(str, j10, map2));
    }

    public final List f() {
        return this.f39725c;
    }

    public C3427c(C3418b c3418b) {
        this.f39723a = c3418b;
        this.f39724b = c3418b.clone();
        this.f39725c = new ArrayList();
    }
}
