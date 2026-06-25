package E3;

import F3.n;
import P9.AbstractC2011u;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import q2.C6071C;
import q2.Y;
import t2.AbstractC6614a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class O6 extends q2.Y {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final O6 f4766g = new O6(AbstractC2011u.A(), null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f4767h = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AbstractC2011u f4768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f4769f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C6071C f4770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f4771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f4772c;

        public a(C6071C c6071c, long j10, long j11) {
            this.f4770a = c6071c;
            this.f4771b = j10;
            this.f4772c = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4771b == aVar.f4771b && this.f4770a.equals(aVar.f4770a) && this.f4772c == aVar.f4772c;
        }

        public int hashCode() {
            long j10 = this.f4771b;
            int iHashCode = (((JfifUtil.MARKER_EOI + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f4770a.hashCode()) * 31;
            long j11 = this.f4772c;
            return iHashCode + ((int) (j11 ^ (j11 >>> 32)));
        }
    }

    private O6(AbstractC2011u abstractC2011u, a aVar) {
        this.f4768e = abstractC2011u;
        this.f4769f = aVar;
    }

    public static O6 F(List list) {
        AbstractC2011u.a aVar = new AbstractC2011u.a();
        for (int i10 = 0; i10 < list.size(); i10++) {
            n.h hVar = (n.h) list.get(i10);
            aVar.a(new a(AbstractC1466t.x(hVar), hVar.d(), -9223372036854775807L));
        }
        return new O6(aVar.k(), null);
    }

    private a I(int i10) {
        a aVar;
        return (i10 != this.f4768e.size() || (aVar = this.f4769f) == null) ? (a) this.f4768e.get(i10) : aVar;
    }

    public O6 A(C6071C c6071c, long j10) {
        return new O6(this.f4768e, new a(c6071c, -1L, j10));
    }

    public O6 B(int i10, int i11, int i12) {
        ArrayList arrayList = new ArrayList(this.f4768e);
        t2.a0.U0(arrayList, i10, i11, i12);
        return new O6(AbstractC2011u.w(arrayList), this.f4769f);
    }

    public O6 C(int i10, C6071C c6071c, long j10) {
        AbstractC6614a.a(i10 < this.f4768e.size() || (i10 == this.f4768e.size() && this.f4769f != null));
        if (i10 == this.f4768e.size()) {
            return new O6(this.f4768e, new a(c6071c, -1L, j10));
        }
        long j11 = ((a) this.f4768e.get(i10)).f4771b;
        AbstractC2011u.a aVar = new AbstractC2011u.a();
        aVar.j(this.f4768e.subList(0, i10));
        aVar.a(new a(c6071c, j11, j10));
        AbstractC2011u abstractC2011u = this.f4768e;
        aVar.j(abstractC2011u.subList(i10 + 1, abstractC2011u.size()));
        return new O6(aVar.k(), this.f4769f);
    }

    public O6 D(int i10, List list) {
        AbstractC2011u.a aVar = new AbstractC2011u.a();
        aVar.j(this.f4768e.subList(0, i10));
        for (int i11 = 0; i11 < list.size(); i11++) {
            aVar.a(new a((C6071C) list.get(i11), -1L, -9223372036854775807L));
        }
        AbstractC2011u abstractC2011u = this.f4768e;
        aVar.j(abstractC2011u.subList(i10, abstractC2011u.size()));
        return new O6(aVar.k(), this.f4769f);
    }

    public O6 E(int i10, int i11) {
        AbstractC2011u.a aVar = new AbstractC2011u.a();
        aVar.j(this.f4768e.subList(0, i10));
        AbstractC2011u abstractC2011u = this.f4768e;
        aVar.j(abstractC2011u.subList(i11, abstractC2011u.size()));
        return new O6(aVar.k(), this.f4769f);
    }

    public C6071C G(int i10) {
        if (i10 >= t()) {
            return null;
        }
        return I(i10).f4770a;
    }

    public long H(int i10) {
        if (i10 < 0 || i10 >= this.f4768e.size()) {
            return -1L;
        }
        return ((a) this.f4768e.get(i10)).f4771b;
    }

    @Override // q2.Y
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O6)) {
            return false;
        }
        O6 o62 = (O6) obj;
        return Objects.equals(this.f4768e, o62.f4768e) && Objects.equals(this.f4769f, o62.f4769f);
    }

    @Override // q2.Y
    public int f(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // q2.Y
    public int hashCode() {
        return Objects.hash(this.f4768e, this.f4769f);
    }

    @Override // q2.Y
    public Y.b k(int i10, Y.b bVar, boolean z10) {
        a aVarI = I(i10);
        bVar.t(Long.valueOf(aVarI.f4771b), null, i10, t2.a0.V0(aVarI.f4772c), 0L);
        return bVar;
    }

    @Override // q2.Y
    public int m() {
        return t();
    }

    @Override // q2.Y
    public Object q(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // q2.Y
    public Y.d s(int i10, Y.d dVar, long j10) {
        a aVarI = I(i10);
        dVar.h(f4767h, aVarI.f4770a, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, true, false, null, 0L, t2.a0.V0(aVarI.f4772c), i10, i10, 0L);
        return dVar;
    }

    @Override // q2.Y
    public int t() {
        return this.f4768e.size() + (this.f4769f == null ? 0 : 1);
    }

    public boolean x(C6071C c6071c) {
        a aVar = this.f4769f;
        if (aVar != null && c6071c.equals(aVar.f4770a)) {
            return true;
        }
        for (int i10 = 0; i10 < this.f4768e.size(); i10++) {
            if (c6071c.equals(((a) this.f4768e.get(i10)).f4770a)) {
                return true;
            }
        }
        return false;
    }

    public O6 y() {
        return new O6(this.f4768e, this.f4769f);
    }

    public O6 z() {
        return new O6(this.f4768e, null);
    }
}
