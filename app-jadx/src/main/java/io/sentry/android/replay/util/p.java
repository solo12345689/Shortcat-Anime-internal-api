package io.sentry.android.replay.util;

import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C6385r0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6385r0 f50439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f50440b;

    public /* synthetic */ p(C6385r0 c6385r0, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(c6385r0, z10);
    }

    public final C6385r0 a() {
        return this.f50439a;
    }

    public final boolean b() {
        return this.f50440b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return AbstractC5504s.c(this.f50439a, pVar.f50439a) && this.f50440b == pVar.f50440b;
    }

    public int hashCode() {
        C6385r0 c6385r0 = this.f50439a;
        return ((c6385r0 == null ? 0 : C6385r0.y(c6385r0.A())) * 31) + Boolean.hashCode(this.f50440b);
    }

    public String toString() {
        return "TextAttributes(color=" + this.f50439a + ", hasFillModifier=" + this.f50440b + ')';
    }

    private p(C6385r0 c6385r0, boolean z10) {
        this.f50439a = c6385r0;
        this.f50440b = z10;
    }
}
