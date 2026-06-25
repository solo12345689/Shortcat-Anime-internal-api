package x;

import androidx.compose.ui.e;
import i1.C5015h;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import p0.AbstractC5912g;
import r0.C6226h;
import r0.C6230l;
import s0.AbstractC6362i1;
import s0.E1;

/* JADX INFO: renamed from: x.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7014l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f63368a = C5015h.n(30);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final androidx.compose.ui.e f63369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final androidx.compose.ui.e f63370c;

    /* JADX INFO: renamed from: x.l$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements E1 {
        a() {
        }

        @Override // s0.E1
        /* JADX INFO: renamed from: createOutline-Pq9zytI */
        public AbstractC6362i1 mo6createOutlinePq9zytI(long j10, EnumC5027t enumC5027t, InterfaceC5011d interfaceC5011d) {
            float fS0 = interfaceC5011d.s0(AbstractC7014l.b());
            return new AbstractC6362i1.b(new C6226h(0.0f, -fS0, C6230l.i(j10), C6230l.g(j10) + fS0));
        }
    }

    /* JADX INFO: renamed from: x.l$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements E1 {
        b() {
        }

        @Override // s0.E1
        /* JADX INFO: renamed from: createOutline-Pq9zytI */
        public AbstractC6362i1 mo6createOutlinePq9zytI(long j10, EnumC5027t enumC5027t, InterfaceC5011d interfaceC5011d) {
            float fS0 = interfaceC5011d.s0(AbstractC7014l.b());
            return new AbstractC6362i1.b(new C6226h(-fS0, 0.0f, C6230l.i(j10) + fS0, C6230l.g(j10)));
        }
    }

    static {
        e.a aVar = androidx.compose.ui.e.f26613a;
        f63369b = AbstractC5912g.a(aVar, new a());
        f63370c = AbstractC5912g.a(aVar, new b());
    }

    public static final androidx.compose.ui.e a(androidx.compose.ui.e eVar, z.q qVar) {
        return eVar.then(qVar == z.q.Vertical ? f63370c : f63369b);
    }

    public static final float b() {
        return f63368a;
    }
}
