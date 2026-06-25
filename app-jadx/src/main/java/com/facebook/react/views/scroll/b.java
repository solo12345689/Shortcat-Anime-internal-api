package com.facebook.react.views.scroll;

import h7.C4914b;
import kotlin.jvm.internal.AbstractC5504s;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f37994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f37995c;

    public b(int i10, int i11, String id2) {
        AbstractC5504s.h(id2, "id");
        this.f37993a = i10;
        this.f37994b = i11;
        this.f37995c = id2;
    }

    public final int a() {
        return this.f37994b;
    }

    public final String b() {
        return this.f37995c;
    }

    public final int c() {
        return this.f37993a;
    }

    public final boolean d(b other) {
        AbstractC5504s.h(other, "other");
        if (t.a() && C4914b.B()) {
            AbstractC7283a.b("VirtualViewContainerStateExperimental:Interval: intersect", this.f37995c + ":(" + this.f37993a + ", " + this.f37994b + ") vs " + other.f37995c + ":(" + other.f37993a + ", " + other.f37994b + ")");
        }
        return this.f37993a < other.f37994b && other.f37993a < this.f37994b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f37993a == bVar.f37993a && this.f37994b == bVar.f37994b && AbstractC5504s.c(this.f37995c, bVar.f37995c);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f37993a) * 31) + Integer.hashCode(this.f37994b)) * 31) + this.f37995c.hashCode();
    }

    public String toString() {
        return "Interval(start=" + this.f37993a + ", end=" + this.f37994b + ", id=" + this.f37995c + ")";
    }
}
