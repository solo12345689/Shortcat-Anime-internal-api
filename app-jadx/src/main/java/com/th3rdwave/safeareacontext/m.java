package com.th3rdwave.safeareacontext;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f44873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f44874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f44875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f44876d;

    public m(l top, l right, l bottom, l left) {
        AbstractC5504s.h(top, "top");
        AbstractC5504s.h(right, "right");
        AbstractC5504s.h(bottom, "bottom");
        AbstractC5504s.h(left, "left");
        this.f44873a = top;
        this.f44874b = right;
        this.f44875c = bottom;
        this.f44876d = left;
    }

    public final l a() {
        return this.f44875c;
    }

    public final l b() {
        return this.f44876d;
    }

    public final l c() {
        return this.f44874b;
    }

    public final l d() {
        return this.f44873a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f44873a == mVar.f44873a && this.f44874b == mVar.f44874b && this.f44875c == mVar.f44875c && this.f44876d == mVar.f44876d;
    }

    public int hashCode() {
        return (((((this.f44873a.hashCode() * 31) + this.f44874b.hashCode()) * 31) + this.f44875c.hashCode()) * 31) + this.f44876d.hashCode();
    }

    public String toString() {
        return "SafeAreaViewEdges(top=" + this.f44873a + ", right=" + this.f44874b + ", bottom=" + this.f44875c + ", left=" + this.f44876d + ")";
    }
}
