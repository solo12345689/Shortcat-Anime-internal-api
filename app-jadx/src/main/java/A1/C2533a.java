package a1;

import U0.C2197e;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: renamed from: a1.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2533a implements InterfaceC2541i {

    /* JADX INFO: renamed from: a */
    private final C2197e f23577a;

    /* JADX INFO: renamed from: b */
    private final int f23578b;

    public C2533a(C2197e c2197e, int i10) {
        this.f23577a = c2197e;
        this.f23578b = i10;
    }

    @Override // a1.InterfaceC2541i
    public void a(C2545m c2545m) {
        if (c2545m.l()) {
            c2545m.m(c2545m.f(), c2545m.e(), c());
        } else {
            c2545m.m(c2545m.k(), c2545m.j(), c());
        }
        int iG = c2545m.g();
        int i10 = this.f23578b;
        c2545m.o(AbstractC5874j.m(i10 > 0 ? (iG + i10) - 1 : (iG + i10) - c().length(), 0, c2545m.h()));
    }

    public final int b() {
        return this.f23578b;
    }

    public final String c() {
        return this.f23577a.j();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2533a)) {
            return false;
        }
        C2533a c2533a = (C2533a) obj;
        return AbstractC5504s.c(c(), c2533a.c()) && this.f23578b == c2533a.f23578b;
    }

    public int hashCode() {
        return (c().hashCode() * 31) + this.f23578b;
    }

    public String toString() {
        return "CommitTextCommand(text='" + c() + "', newCursorPosition=" + this.f23578b + ')';
    }

    public C2533a(String str, int i10) {
        this(new C2197e(str, null, 2, null), i10);
    }
}
