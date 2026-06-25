package k0;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: k0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C5413c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5433w f51972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f51973b;

    public C5413c(C5433w c5433w, Integer num) {
        this.f51972a = c5433w;
        this.f51973b = num;
    }

    public static /* synthetic */ C5413c b(C5413c c5413c, C5433w c5433w, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c5433w = c5413c.f51972a;
        }
        if ((i10 & 2) != 0) {
            num = c5413c.f51973b;
        }
        return c5413c.a(c5433w, num);
    }

    public final C5413c a(C5433w c5433w, Integer num) {
        return new C5413c(c5433w, num);
    }

    public final Integer c() {
        return this.f51973b;
    }

    public final C5433w d() {
        return this.f51972a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5413c)) {
            return false;
        }
        C5413c c5413c = (C5413c) obj;
        return AbstractC5504s.c(this.f51972a, c5413c.f51972a) && AbstractC5504s.c(this.f51973b, c5413c.f51973b);
    }

    public int hashCode() {
        int iHashCode = this.f51972a.hashCode() * 31;
        Integer num = this.f51973b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "ComposeStackTraceFrame(sourceInfo=" + this.f51972a + ", groupOffset=" + this.f51973b + ')';
    }
}
