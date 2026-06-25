package F4;

import L4.j;
import Td.AbstractC2163n;
import Td.q;
import dg.C4623d;
import dg.E;
import dg.t;
import dg.x;
import ie.InterfaceC5082a;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5506u;
import tg.InterfaceC6684i;
import tg.InterfaceC6685j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lazy f6534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f6535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f6536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f6537d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f6538e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t f6539f;

    /* JADX INFO: renamed from: F4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0085a extends AbstractC5506u implements InterfaceC5082a {
        C0085a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C4623d invoke() {
            return C4623d.f45360n.b(a.this.d());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements InterfaceC5082a {
        b() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x invoke() {
            String strD = a.this.d().d("Content-Type");
            if (strD != null) {
                return x.f45605e.c(strD);
            }
            return null;
        }
    }

    public a(InterfaceC6685j interfaceC6685j) {
        q qVar = q.f17463c;
        this.f6534a = AbstractC2163n.a(qVar, new C0085a());
        this.f6535b = AbstractC2163n.a(qVar, new b());
        this.f6536c = Long.parseLong(interfaceC6685j.D0());
        this.f6537d = Long.parseLong(interfaceC6685j.D0());
        this.f6538e = Integer.parseInt(interfaceC6685j.D0()) > 0;
        int i10 = Integer.parseInt(interfaceC6685j.D0());
        t.a aVar = new t.a();
        for (int i11 = 0; i11 < i10; i11++) {
            j.b(aVar, interfaceC6685j.D0());
        }
        this.f6539f = aVar.e();
    }

    public final C4623d a() {
        return (C4623d) this.f6534a.getValue();
    }

    public final x b() {
        return (x) this.f6535b.getValue();
    }

    public final long c() {
        return this.f6537d;
    }

    public final t d() {
        return this.f6539f;
    }

    public final long e() {
        return this.f6536c;
    }

    public final boolean f() {
        return this.f6538e;
    }

    public final void g(InterfaceC6684i interfaceC6684i) {
        interfaceC6684i.S0(this.f6536c).writeByte(10);
        interfaceC6684i.S0(this.f6537d).writeByte(10);
        interfaceC6684i.S0(this.f6538e ? 1L : 0L).writeByte(10);
        interfaceC6684i.S0(this.f6539f.size()).writeByte(10);
        int size = this.f6539f.size();
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC6684i.s0(this.f6539f.f(i10)).s0(": ").s0(this.f6539f.p(i10)).writeByte(10);
        }
    }

    public a(E e10) {
        q qVar = q.f17463c;
        this.f6534a = AbstractC2163n.a(qVar, new C0085a());
        this.f6535b = AbstractC2163n.a(qVar, new b());
        this.f6536c = e10.G0();
        this.f6537d = e10.B0();
        this.f6538e = e10.w() != null;
        this.f6539f = e10.E();
    }
}
