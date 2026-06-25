package Q;

import g1.EnumC4829i;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Q.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2051k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f14136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f14137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f14138c;

    /* JADX INFO: renamed from: Q.k$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EnumC4829i f14139a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f14140b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f14141c;

        public a(EnumC4829i enumC4829i, int i10, long j10) {
            this.f14139a = enumC4829i;
            this.f14140b = i10;
            this.f14141c = j10;
        }

        public static /* synthetic */ a b(a aVar, EnumC4829i enumC4829i, int i10, long j10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                enumC4829i = aVar.f14139a;
            }
            if ((i11 & 2) != 0) {
                i10 = aVar.f14140b;
            }
            if ((i11 & 4) != 0) {
                j10 = aVar.f14141c;
            }
            return aVar.a(enumC4829i, i10, j10);
        }

        public final a a(EnumC4829i enumC4829i, int i10, long j10) {
            return new a(enumC4829i, i10, j10);
        }

        public final int c() {
            return this.f14140b;
        }

        public final long d() {
            return this.f14141c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f14139a == aVar.f14139a && this.f14140b == aVar.f14140b && this.f14141c == aVar.f14141c;
        }

        public int hashCode() {
            return (((this.f14139a.hashCode() * 31) + Integer.hashCode(this.f14140b)) * 31) + Long.hashCode(this.f14141c);
        }

        public String toString() {
            return "AnchorInfo(direction=" + this.f14139a + ", offset=" + this.f14140b + ", selectableId=" + this.f14141c + ')';
        }
    }

    public C2051k(a aVar, a aVar2, boolean z10) {
        this.f14136a = aVar;
        this.f14137b = aVar2;
        this.f14138c = z10;
    }

    public static /* synthetic */ C2051k b(C2051k c2051k, a aVar, a aVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = c2051k.f14136a;
        }
        if ((i10 & 2) != 0) {
            aVar2 = c2051k.f14137b;
        }
        if ((i10 & 4) != 0) {
            z10 = c2051k.f14138c;
        }
        return c2051k.a(aVar, aVar2, z10);
    }

    public final C2051k a(a aVar, a aVar2, boolean z10) {
        return new C2051k(aVar, aVar2, z10);
    }

    public final a c() {
        return this.f14137b;
    }

    public final boolean d() {
        return this.f14138c;
    }

    public final a e() {
        return this.f14136a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2051k)) {
            return false;
        }
        C2051k c2051k = (C2051k) obj;
        return AbstractC5504s.c(this.f14136a, c2051k.f14136a) && AbstractC5504s.c(this.f14137b, c2051k.f14137b) && this.f14138c == c2051k.f14138c;
    }

    public int hashCode() {
        return (((this.f14136a.hashCode() * 31) + this.f14137b.hashCode()) * 31) + Boolean.hashCode(this.f14138c);
    }

    public String toString() {
        return "Selection(start=" + this.f14136a + ", end=" + this.f14137b + ", handlesCrossed=" + this.f14138c + ')';
    }
}
