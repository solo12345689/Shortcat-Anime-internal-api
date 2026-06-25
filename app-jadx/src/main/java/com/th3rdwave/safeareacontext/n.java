package com.th3rdwave.safeareacontext;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f44877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o f44878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f44879c;

    public n(a insets, o mode, m edges) {
        AbstractC5504s.h(insets, "insets");
        AbstractC5504s.h(mode, "mode");
        AbstractC5504s.h(edges, "edges");
        this.f44877a = insets;
        this.f44878b = mode;
        this.f44879c = edges;
    }

    public final m a() {
        return this.f44879c;
    }

    public final a b() {
        return this.f44877a;
    }

    public final o c() {
        return this.f44878b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return AbstractC5504s.c(this.f44877a, nVar.f44877a) && this.f44878b == nVar.f44878b && AbstractC5504s.c(this.f44879c, nVar.f44879c);
    }

    public int hashCode() {
        return (((this.f44877a.hashCode() * 31) + this.f44878b.hashCode()) * 31) + this.f44879c.hashCode();
    }

    public String toString() {
        return "SafeAreaViewLocalData(insets=" + this.f44877a + ", mode=" + this.f44878b + ", edges=" + this.f44879c + ")";
    }
}
