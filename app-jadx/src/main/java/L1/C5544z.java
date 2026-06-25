package l1;

import android.util.Log;
import androidx.compose.ui.layout.AbstractC2679h;
import androidx.compose.ui.layout.s;
import i1.AbstractC5026s;
import i1.C5009b;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import t.AbstractC6562l;
import t1.AbstractC6599l;
import t1.C6592e;
import t1.C6593f;
import t1.C6595h;
import u1.C6718b;

/* JADX INFO: renamed from: l1.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class C5544z implements C6718b.InterfaceC0913b, InterfaceC5536r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f52523a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C6593f f52524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f52525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f52526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f52527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C5515C f52528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f52529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f52530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f52531i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList f52532j;

    /* JADX INFO: renamed from: l1.z$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52533a;

        static {
            int[] iArr = new int[C6592e.b.values().length];
            try {
                iArr[C6592e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C6592e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C6592e.b.MATCH_CONSTRAINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C6592e.b.MATCH_PARENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f52533a = iArr;
        }
    }

    public C5544z(InterfaceC5011d interfaceC5011d) {
        C6593f c6593f = new C6593f(0, 0);
        c6593f.S1(this);
        this.f52524b = c6593f;
        this.f52525c = new LinkedHashMap();
        this.f52526d = new LinkedHashMap();
        this.f52527e = new LinkedHashMap();
        this.f52528f = new C5515C(interfaceC5011d);
        this.f52529g = new int[2];
        this.f52530h = new int[2];
        this.f52531i = Float.NaN;
        this.f52532j = new ArrayList();
    }

    private final void e(Integer[] numArr, C6718b.a aVar) {
        numArr[0] = Integer.valueOf(aVar.f61133e);
        numArr[1] = Integer.valueOf(aVar.f61134f);
        numArr[2] = Integer.valueOf(aVar.f61135g);
    }

    private final long f(C6592e c6592e, long j10) {
        Object objS = c6592e.s();
        String str = c6592e.f60381o;
        int i10 = 0;
        if (c6592e instanceof AbstractC6599l) {
            int i11 = C5009b.j(j10) ? 1073741824 : C5009b.h(j10) ? Integer.MIN_VALUE : 0;
            if (C5009b.i(j10)) {
                i10 = 1073741824;
            } else if (C5009b.g(j10)) {
                i10 = Integer.MIN_VALUE;
            }
            AbstractC6599l abstractC6599l = (AbstractC6599l) c6592e;
            abstractC6599l.y1(i11, C5009b.l(j10), i10, C5009b.k(j10));
            return AbstractC6562l.a(abstractC6599l.t1(), abstractC6599l.s1());
        }
        if (objS instanceof I0.A) {
            androidx.compose.ui.layout.s sVarV0 = ((I0.A) objS).v0(j10);
            this.f52525c.put(objS, sVarV0);
            return AbstractC6562l.a(sVarV0.W0(), sVarV0.P0());
        }
        Log.w("CCL", "Nothing to measure for widget: " + str);
        return AbstractC6562l.a(0, 0);
    }

    private final boolean g(C6592e.b bVar, int i10, int i11, int i12, boolean z10, boolean z11, int i13, int[] iArr) {
        int i14 = a.f52533a[bVar.ordinal()];
        if (i14 == 1) {
            iArr[0] = i10;
            iArr[1] = i10;
            return false;
        }
        if (i14 == 2) {
            iArr[0] = 0;
            iArr[1] = i13;
            return true;
        }
        if (i14 != 3) {
            if (i14 == 4) {
                iArr[0] = i13;
                iArr[1] = i13;
                return false;
            }
            throw new IllegalStateException((bVar + " is not supported").toString());
        }
        if (AbstractC5528j.f52483a) {
            Log.d("CCL", "Measure strategy " + i12);
            Log.d("CCL", "DW " + i11);
            Log.d("CCL", "ODR " + z10);
            Log.d("CCL", "IRH " + z11);
        }
        boolean z12 = z11 || ((i12 == C6718b.a.f61127l || i12 == C6718b.a.f61128m) && (i12 == C6718b.a.f61128m || i11 != 1 || z10));
        if (AbstractC5528j.f52483a) {
            Log.d("CCL", "UD " + z12);
        }
        iArr[0] = z12 ? i10 : 0;
        if (!z12) {
            i10 = i13;
        }
        iArr[1] = i10;
        return !z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    @Override // u1.C6718b.InterfaceC0913b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(t1.C6592e r20, u1.C6718b.a r21) {
        /*
            Method dump skipped, instruction units count: 591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.C5544z.b(t1.e, u1.b$a):void");
    }

    protected final void c(long j10) {
        this.f52524b.g1(C5009b.l(j10));
        this.f52524b.H0(C5009b.k(j10));
        this.f52531i = Float.NaN;
    }

    public void d() {
        C6592e c6592e;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{ ");
        sb2.append("  root: {");
        sb2.append("interpolated: { left:  0,");
        sb2.append("  top:  0,");
        sb2.append("  right:   " + this.f52524b.V() + " ,");
        sb2.append("  bottom:  " + this.f52524b.x() + " ,");
        sb2.append(" } }");
        for (C6592e c6592e2 : this.f52524b.o1()) {
            Object objS = c6592e2.s();
            if (objS instanceof I0.A) {
                q1.h hVar = null;
                if (c6592e2.f60381o == null) {
                    I0.A a10 = (I0.A) objS;
                    Object objA = AbstractC2679h.a(a10);
                    if (objA == null) {
                        objA = AbstractC5531m.a(a10);
                    }
                    c6592e2.f60381o = objA != null ? objA.toString() : null;
                }
                q1.h hVar2 = (q1.h) this.f52527e.get(objS);
                if (hVar2 != null && (c6592e = hVar2.f56292a) != null) {
                    hVar = c6592e.f60379n;
                }
                if (hVar != null) {
                    sb2.append(' ' + c6592e2.f60381o + ": {");
                    sb2.append(" interpolated : ");
                    hVar.e(sb2, true);
                    sb2.append("}, ");
                }
            } else if (c6592e2 instanceof C6595h) {
                sb2.append(' ' + c6592e2.f60381o + ": {");
                C6595h c6595h = (C6595h) c6592e2;
                if (c6595h.o1() == 0) {
                    sb2.append(" type: 'hGuideline', ");
                } else {
                    sb2.append(" type: 'vGuideline', ");
                }
                sb2.append(" interpolated: ");
                sb2.append(" { left: " + c6595h.W() + ", top: " + c6595h.X() + ", right: " + (c6595h.W() + c6595h.V()) + ", bottom: " + (c6595h.X() + c6595h.x()) + " }");
                sb2.append("}, ");
            }
        }
        sb2.append(" }");
        this.f52523a = sb2.toString();
    }

    public final void h(s.a aVar, List list) {
        I0.A a10;
        androidx.compose.ui.layout.s sVar;
        s.a aVar2;
        Object next;
        int i10 = 0;
        if (this.f52527e.isEmpty()) {
            ArrayList arrayListO1 = this.f52524b.o1();
            int size = arrayListO1.size();
            for (int i11 = 0; i11 < size; i11++) {
                C6592e c6592e = (C6592e) arrayListO1.get(i11);
                Object objS = c6592e.s();
                if (objS instanceof I0.A) {
                    this.f52527e.put(objS, new q1.h(c6592e.f60379n.j()));
                }
            }
        }
        int size2 = list.size();
        while (i10 < size2) {
            I0.A a11 = (I0.A) list.get(i10);
            if (this.f52527e.containsKey(a11)) {
                a10 = a11;
            } else {
                Iterator it = this.f52527e.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    I0.A a12 = (I0.A) next;
                    if (AbstractC2679h.a(a12) != null && AbstractC5504s.c(AbstractC2679h.a(a12), AbstractC2679h.a(a11))) {
                        break;
                    }
                }
                a10 = (I0.A) next;
                if (a10 == null) {
                    aVar2 = aVar;
                }
                i10++;
                aVar = aVar2;
            }
            q1.h hVar = (q1.h) this.f52527e.get(a10);
            if (hVar == null || (sVar = (androidx.compose.ui.layout.s) this.f52525c.get(a10)) == null) {
                return;
            }
            if (this.f52527e.containsKey(a11)) {
                aVar2 = aVar;
                AbstractC5528j.f(aVar2, sVar, hVar, 0L, 4, null);
            } else {
                aVar2 = aVar;
                AbstractC5528j.f(aVar2, a11.v0(C5009b.f48540b.c(sVar.W0(), sVar.P0())), hVar, 0L, 4, null);
            }
            i10++;
            aVar = aVar2;
        }
        if (EnumC5541w.BOUNDS == null) {
            d();
        }
    }

    public final long i(long j10, EnumC5027t enumC5027t, InterfaceC5532n interfaceC5532n, List list, int i10) {
        String string;
        Object objA;
        if (list.isEmpty()) {
            return AbstractC5026s.a(C5009b.n(j10), C5009b.m(j10));
        }
        this.f52528f.C(C5009b.j(j10) ? q1.d.b(C5009b.l(j10)) : q1.d.h().n(C5009b.n(j10)));
        this.f52528f.m(C5009b.i(j10) ? q1.d.b(C5009b.k(j10)) : q1.d.h().n(C5009b.m(j10)));
        this.f52528f.f56233f.E().a(this.f52528f, this.f52524b, 0);
        this.f52528f.f56233f.C().a(this.f52528f, this.f52524b, 1);
        this.f52528f.G(j10);
        this.f52528f.x(enumC5027t == EnumC5027t.f48574b);
        j();
        if (interfaceC5532n.a(list)) {
            this.f52528f.u();
            interfaceC5532n.b(this.f52528f, list);
            AbstractC5528j.c(this.f52528f, list);
            this.f52528f.a(this.f52524b);
        } else {
            AbstractC5528j.c(this.f52528f, list);
        }
        c(j10);
        this.f52524b.X1();
        if (AbstractC5528j.f52483a) {
            this.f52524b.y0("ConstraintLayout");
            ArrayList arrayListO1 = this.f52524b.o1();
            int size = arrayListO1.size();
            for (int i11 = 0; i11 < size; i11++) {
                C6592e c6592e = (C6592e) arrayListO1.get(i11);
                Object objS = c6592e.s();
                I0.A a10 = objS instanceof I0.A ? (I0.A) objS : null;
                if (a10 == null || (objA = AbstractC2679h.a(a10)) == null || (string = objA.toString()) == null) {
                    string = "NOTAG";
                }
                c6592e.y0(string);
            }
            Log.d("CCL", "ConstraintLayout is asked to measure with " + ((Object) C5009b.q(j10)));
            Log.d("CCL", AbstractC5528j.g(this.f52524b));
            ArrayList arrayListO12 = this.f52524b.o1();
            int size2 = arrayListO12.size();
            for (int i12 = 0; i12 < size2; i12++) {
                Log.d("CCL", AbstractC5528j.g((C6592e) arrayListO12.get(i12)));
            }
        }
        this.f52524b.T1(i10);
        C6593f c6593f = this.f52524b;
        c6593f.O1(c6593f.G1(), 0, 0, 0, 0, 0, 0, 0, 0);
        if (AbstractC5528j.f52483a) {
            Log.d("CCL", "ConstraintLayout is at the end " + this.f52524b.V() + ' ' + this.f52524b.x());
        }
        return AbstractC5026s.a(this.f52524b.V(), this.f52524b.x());
    }

    public final void j() {
        this.f52525c.clear();
        this.f52526d.clear();
        this.f52527e.clear();
    }

    @Override // u1.C6718b.InterfaceC0913b
    public void a() {
    }
}
