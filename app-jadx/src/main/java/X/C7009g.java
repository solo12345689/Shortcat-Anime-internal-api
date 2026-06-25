package x;

import i1.C5015h;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.AbstractC6358h0;

/* JADX INFO: renamed from: x.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C7009g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f63362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AbstractC6358h0 f63363b;

    public /* synthetic */ C7009g(float f10, AbstractC6358h0 abstractC6358h0, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, abstractC6358h0);
    }

    public final AbstractC6358h0 a() {
        return this.f63363b;
    }

    public final float b() {
        return this.f63362a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7009g)) {
            return false;
        }
        C7009g c7009g = (C7009g) obj;
        return C5015h.q(this.f63362a, c7009g.f63362a) && AbstractC5504s.c(this.f63363b, c7009g.f63363b);
    }

    public int hashCode() {
        return (C5015h.r(this.f63362a) * 31) + this.f63363b.hashCode();
    }

    public String toString() {
        return "BorderStroke(width=" + ((Object) C5015h.s(this.f63362a)) + ", brush=" + this.f63363b + ')';
    }

    private C7009g(float f10, AbstractC6358h0 abstractC6358h0) {
        this.f63362a = f10;
        this.f63363b = abstractC6358h0;
    }
}
