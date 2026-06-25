package U0;

import Td.AbstractC2163n;
import U0.C2197e;
import Ud.AbstractC2279u;
import Y0.AbstractC2485u;
import g1.C4832l;
import i1.InterfaceC5011d;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;

/* JADX INFO: renamed from: U0.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2221q implements InterfaceC2236y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2197e f18862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f18863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f18864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f18865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f18866e;

    public C2221q(C2197e c2197e, Y0 y02, List list, InterfaceC5011d interfaceC5011d, AbstractC2485u.b bVar) {
        this.f18862a = c2197e;
        this.f18863b = list;
        Td.q qVar = Td.q.f17463c;
        this.f18864c = AbstractC2163n.a(qVar, new InterfaceC5082a() { // from class: U0.o
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return Float.valueOf(C2221q.k(this.f18860a));
            }
        });
        this.f18865d = AbstractC2163n.a(qVar, new InterfaceC5082a() { // from class: U0.p
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return Float.valueOf(C2221q.j(this.f18861a));
            }
        });
        B bN = y02.N();
        List listK = AbstractC2201g.k(c2197e, bN);
        ArrayList arrayList = new ArrayList(listK.size());
        int size = listK.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2197e.d dVar = (C2197e.d) listK.get(i10);
            C2197e c2197eL = AbstractC2201g.l(c2197e, dVar.h(), dVar.f());
            B bL = l((B) dVar.g(), bN);
            String strJ = c2197eL.j();
            Y0 y0J = y02.J(bL);
            List listB = c2197eL.b();
            if (listB == null) {
                listB = AbstractC2279u.m();
            }
            arrayList.add(new C2234x(AbstractC2238z.a(strJ, y0J, listB, interfaceC5011d, bVar, r.b(i(), dVar.h(), dVar.f())), dVar.h(), dVar.f()));
        }
        this.f18866e = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float j(C2221q c2221q) {
        Object obj;
        InterfaceC2236y interfaceC2236yB;
        List list = c2221q.f18866e;
        if (list.isEmpty()) {
            obj = null;
        } else {
            Object obj2 = list.get(0);
            float fD = ((C2234x) obj2).b().d();
            int iO = AbstractC2279u.o(list);
            int i10 = 1;
            if (1 <= iO) {
                while (true) {
                    Object obj3 = list.get(i10);
                    float fD2 = ((C2234x) obj3).b().d();
                    if (Float.compare(fD, fD2) < 0) {
                        obj2 = obj3;
                        fD = fD2;
                    }
                    if (i10 == iO) {
                        break;
                    }
                    i10++;
                }
            }
            obj = obj2;
        }
        C2234x c2234x = (C2234x) obj;
        if (c2234x == null || (interfaceC2236yB = c2234x.b()) == null) {
            return 0.0f;
        }
        return interfaceC2236yB.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float k(C2221q c2221q) {
        Object obj;
        InterfaceC2236y interfaceC2236yB;
        List list = c2221q.f18866e;
        if (list.isEmpty()) {
            obj = null;
        } else {
            Object obj2 = list.get(0);
            float f10 = ((C2234x) obj2).b().f();
            int iO = AbstractC2279u.o(list);
            int i10 = 1;
            if (1 <= iO) {
                while (true) {
                    Object obj3 = list.get(i10);
                    float f11 = ((C2234x) obj3).b().f();
                    if (Float.compare(f10, f11) < 0) {
                        obj2 = obj3;
                        f10 = f11;
                    }
                    if (i10 == iO) {
                        break;
                    }
                    i10++;
                }
            }
            obj = obj2;
        }
        C2234x c2234x = (C2234x) obj;
        if (c2234x == null || (interfaceC2236yB = c2234x.b()) == null) {
            return 0.0f;
        }
        return interfaceC2236yB.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final B l(B b10, B b11) {
        return !C4832l.j(b10.i(), C4832l.f47292b.f()) ? b10 : B.b(b10, 0, b11.i(), 0L, null, null, null, 0, 0, null, 509, null);
    }

    @Override // U0.InterfaceC2236y
    public boolean a() {
        List list = this.f18866e;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((C2234x) list.get(i10)).b().a()) {
                return true;
            }
        }
        return false;
    }

    @Override // U0.InterfaceC2236y
    public float d() {
        return ((Number) this.f18865d.getValue()).floatValue();
    }

    @Override // U0.InterfaceC2236y
    public float f() {
        return ((Number) this.f18864c.getValue()).floatValue();
    }

    public final C2197e g() {
        return this.f18862a;
    }

    public final List h() {
        return this.f18866e;
    }

    public final List i() {
        return this.f18863b;
    }
}
