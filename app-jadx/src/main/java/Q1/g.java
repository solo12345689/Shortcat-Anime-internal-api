package q1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import r1.C6232a;
import r1.C6233b;
import r1.C6234c;
import r1.i;
import r1.j;
import t1.AbstractC6597j;
import t1.C6592e;
import t1.C6593f;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: k */
    public static final Integer f56227k = 0;

    /* JADX INFO: renamed from: a */
    private q1.c f56228a;

    /* JADX INFO: renamed from: b */
    private boolean f56229b = true;

    /* JADX INFO: renamed from: c */
    protected HashMap f56230c = new HashMap();

    /* JADX INFO: renamed from: d */
    protected HashMap f56231d = new HashMap();

    /* JADX INFO: renamed from: e */
    HashMap f56232e = new HashMap();

    /* JADX INFO: renamed from: f */
    public final C6068a f56233f;

    /* JADX INFO: renamed from: g */
    private int f56234g;

    /* JADX INFO: renamed from: h */
    ArrayList f56235h;

    /* JADX INFO: renamed from: i */
    ArrayList f56236i;

    /* JADX INFO: renamed from: j */
    boolean f56237j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends Enum {

        /* JADX INFO: renamed from: a */
        public static final a SPREAD;

        /* JADX INFO: renamed from: b */
        public static final a SPREAD_INSIDE;

        /* JADX INFO: renamed from: c */
        public static final a PACKED;

        /* JADX INFO: renamed from: f */
        private static final /* synthetic */ a[] f56243f = a();

        /* JADX INFO: renamed from: d */
        public static Map f56241d = new HashMap();

        /* JADX INFO: renamed from: e */
        public static Map f56242e = new HashMap();

        static {
            a aVar = new a();
            SPREAD = aVar;
            a aVar2 = new a();
            SPREAD_INSIDE = aVar2;
            a aVar3 = new a();
            PACKED = aVar3;
            f56243f = a();
            f56241d = new HashMap();
            f56242e = new HashMap();
            f56241d.put("packed", aVar3);
            f56241d.put("spread_inside", aVar2);
            f56241d.put("spread", aVar);
            f56242e.put("packed", 2);
            f56242e.put("spread_inside", 1);
            f56242e.put("spread", 0);
        }

        private a(String str, int i10) {
            super(str, i10);
        }

        private static /* synthetic */ a[] a() {
            return new a[]{SPREAD, SPREAD_INSIDE, PACKED};
        }

        public static int b(String str) {
            if (f56242e.containsKey(str)) {
                return ((Integer) f56242e.get(str)).intValue();
            }
            return -1;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f56243f.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum b {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        TOP_TO_BASELINE,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BOTTOM_TO_BASELINE,
        BASELINE_TO_BASELINE,
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum c {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum d {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        HORIZONTAL_FLOW,
        VERTICAL_FLOW,
        GRID,
        ROW,
        COLUMN,
        FLOW
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends Enum {

        /* JADX INFO: renamed from: a */
        public static final e NONE;

        /* JADX INFO: renamed from: b */
        public static final e CHAIN;

        /* JADX INFO: renamed from: c */
        public static final e ALIGNED;

        /* JADX INFO: renamed from: f */
        private static final /* synthetic */ e[] f56290f = a();

        /* JADX INFO: renamed from: d */
        public static Map f56288d = new HashMap();

        /* JADX INFO: renamed from: e */
        public static Map f56289e = new HashMap();

        static {
            e eVar = new e();
            NONE = eVar;
            e eVar2 = new e();
            CHAIN = eVar2;
            e eVar3 = new e();
            ALIGNED = eVar3;
            f56290f = a();
            f56288d = new HashMap();
            f56289e = new HashMap();
            f56288d.put("none", eVar);
            f56288d.put("chain", eVar2);
            f56288d.put("aligned", eVar3);
            f56289e.put("none", 0);
            f56289e.put("chain", 3);
            f56289e.put("aligned", 2);
        }

        private e(String str, int i10) {
            super(str, i10);
        }

        private static /* synthetic */ e[] a() {
            return new e[]{NONE, CHAIN, ALIGNED};
        }

        public static int b(String str) {
            if (f56289e.containsKey(str)) {
                return ((Integer) f56289e.get(str)).intValue();
            }
            return -1;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f56290f.clone();
        }
    }

    public g() {
        C6068a c6068a = new C6068a(this);
        this.f56233f = c6068a;
        this.f56234g = 0;
        this.f56235h = new ArrayList();
        this.f56236i = new ArrayList();
        this.f56237j = true;
        Integer num = f56227k;
        c6068a.c(num);
        this.f56230c.put(num, c6068a);
    }

    private String g() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("__HELPER_KEY_");
        int i10 = this.f56234g;
        this.f56234g = i10 + 1;
        sb2.append(i10);
        sb2.append("__");
        return sb2.toString();
    }

    public j A() {
        return (j) n(null, d.VERTICAL_CHAIN);
    }

    public r1.h B(Object obj) {
        return l(obj, 1);
    }

    public g C(q1.d dVar) {
        return z(dVar);
    }

    public void a(C6593f c6593f) {
        q1.e eVar;
        AbstractC6597j abstractC6597jU0;
        AbstractC6597j abstractC6597jU02;
        c6593f.r1();
        this.f56233f.E().a(this, c6593f, 0);
        this.f56233f.C().a(this, c6593f, 1);
        for (Object obj : this.f56231d.keySet()) {
            AbstractC6597j abstractC6597jU03 = ((q1.e) this.f56231d.get(obj)).u0();
            if (abstractC6597jU03 != null) {
                f fVarD = (f) this.f56230c.get(obj);
                if (fVarD == null) {
                    fVarD = d(obj);
                }
                fVarD.b(abstractC6597jU03);
            }
        }
        for (Object obj2 : this.f56230c.keySet()) {
            f fVar = (f) this.f56230c.get(obj2);
            if (fVar != this.f56233f && (fVar.d() instanceof q1.e) && (abstractC6597jU02 = ((q1.e) fVar.d()).u0()) != null) {
                f fVarD2 = (f) this.f56230c.get(obj2);
                if (fVarD2 == null) {
                    fVarD2 = d(obj2);
                }
                fVarD2.b(abstractC6597jU02);
            }
        }
        Iterator it = this.f56230c.keySet().iterator();
        while (it.hasNext()) {
            f fVar2 = (f) this.f56230c.get(it.next());
            if (fVar2 != this.f56233f) {
                C6592e c6592eA = fVar2.a();
                c6592eA.y0(fVar2.getKey().toString());
                c6592eA.Y0(null);
                if (fVar2.d() instanceof r1.h) {
                    fVar2.apply();
                }
                c6593f.c(c6592eA);
            } else {
                fVar2.b(c6593f);
            }
        }
        Iterator it2 = this.f56231d.keySet().iterator();
        while (it2.hasNext()) {
            q1.e eVar2 = (q1.e) this.f56231d.get(it2.next());
            if (eVar2.u0() != null) {
                Iterator it3 = eVar2.f56225o0.iterator();
                while (it3.hasNext()) {
                    eVar2.u0().c(((f) this.f56230c.get(it3.next())).a());
                }
                eVar2.apply();
            } else {
                eVar2.apply();
            }
        }
        Iterator it4 = this.f56230c.keySet().iterator();
        while (it4.hasNext()) {
            f fVar3 = (f) this.f56230c.get(it4.next());
            if (fVar3 != this.f56233f && (fVar3.d() instanceof q1.e) && (abstractC6597jU0 = (eVar = (q1.e) fVar3.d()).u0()) != null) {
                for (Object obj3 : eVar.f56225o0) {
                    f fVar4 = (f) this.f56230c.get(obj3);
                    if (fVar4 != null) {
                        abstractC6597jU0.c(fVar4.a());
                    } else if (obj3 instanceof f) {
                        abstractC6597jU0.c(((f) obj3).a());
                    } else {
                        System.out.println("couldn't find reference for " + obj3);
                    }
                }
                fVar3.apply();
            }
        }
        for (Object obj4 : this.f56230c.keySet()) {
            f fVar5 = (f) this.f56230c.get(obj4);
            fVar5.apply();
            C6592e c6592eA2 = fVar5.a();
            if (c6592eA2 != null && obj4 != null) {
                c6592eA2.f60381o = obj4.toString();
            }
        }
    }

    public C6234c b(Object obj, c cVar) {
        C6068a c6068aD = d(obj);
        if (c6068aD.d() == null || !(c6068aD.d() instanceof C6234c)) {
            C6234c c6234c = new C6234c(this);
            c6234c.w0(cVar);
            c6068aD.X(c6234c);
        }
        return (C6234c) c6068aD.d();
    }

    public void c(Object obj) {
        this.f56235h.add(obj);
        this.f56237j = true;
    }

    public C6068a d(Object obj) {
        f fVarF = (f) this.f56230c.get(obj);
        if (fVarF == null) {
            fVarF = f(obj);
            this.f56230c.put(obj, fVarF);
            fVarF.c(obj);
        }
        if (fVarF instanceof C6068a) {
            return (C6068a) fVarF;
        }
        return null;
    }

    public int e(Object obj) {
        if (obj instanceof Float) {
            return Math.round(((Float) obj).floatValue());
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public C6068a f(Object obj) {
        return new C6068a(this);
    }

    q1.c h() {
        return this.f56228a;
    }

    public r1.f i(Object obj, boolean z10) {
        C6068a c6068aD = d(obj);
        if (c6068aD.d() == null || !(c6068aD.d() instanceof r1.f)) {
            c6068aD.X(z10 ? new r1.f(this, d.VERTICAL_FLOW) : new r1.f(this, d.HORIZONTAL_FLOW));
        }
        return (r1.f) c6068aD.d();
    }

    public r1.g j(Object obj, String str) {
        C6068a c6068aD = d(obj);
        if (c6068aD.d() == null || !(c6068aD.d() instanceof r1.g)) {
            d dVar = d.GRID;
            if (str.charAt(0) == 'r') {
                dVar = d.ROW;
            } else if (str.charAt(0) == 'c') {
                dVar = d.COLUMN;
            }
            c6068aD.X(new r1.g(this, dVar));
        }
        return (r1.g) c6068aD.d();
    }

    public ArrayList k(String str) {
        if (this.f56232e.containsKey(str)) {
            return (ArrayList) this.f56232e.get(str);
        }
        return null;
    }

    public r1.h l(Object obj, int i10) {
        C6068a c6068aD = d(obj);
        if (c6068aD.d() == null || !(c6068aD.d() instanceof r1.h)) {
            r1.h hVar = new r1.h(this);
            hVar.g(i10);
            hVar.c(obj);
            c6068aD.X(hVar);
        }
        return (r1.h) c6068aD.d();
    }

    public g m(q1.d dVar) {
        return w(dVar);
    }

    public q1.e n(Object obj, d dVar) {
        if (obj == null) {
            obj = g();
        }
        q1.e iVar = (q1.e) this.f56231d.get(obj);
        if (iVar == null) {
            switch (dVar) {
                case HORIZONTAL_CHAIN:
                    iVar = new i(this);
                    break;
                case VERTICAL_CHAIN:
                    iVar = new j(this);
                    break;
                case ALIGN_HORIZONTALLY:
                    iVar = new C6232a(this);
                    break;
                case ALIGN_VERTICALLY:
                    iVar = new C6233b(this);
                    break;
                case BARRIER:
                    iVar = new C6234c(this);
                    break;
                case LAYER:
                default:
                    iVar = new q1.e(this, dVar);
                    break;
                case HORIZONTAL_FLOW:
                case VERTICAL_FLOW:
                    iVar = new r1.f(this, dVar);
                    break;
                case GRID:
                case ROW:
                case COLUMN:
                    iVar = new r1.g(this, dVar);
                    break;
            }
            iVar.c(obj);
            this.f56231d.put(obj, iVar);
        }
        return iVar;
    }

    public i o() {
        return (i) n(null, d.HORIZONTAL_CHAIN);
    }

    public r1.h p(Object obj) {
        return l(obj, 0);
    }

    public boolean q(C6592e c6592e) {
        if (this.f56237j) {
            this.f56236i.clear();
            Iterator it = this.f56235h.iterator();
            while (it.hasNext()) {
                C6592e c6592eA = ((f) this.f56230c.get(it.next())).a();
                if (c6592eA != null) {
                    this.f56236i.add(c6592eA);
                }
            }
            this.f56237j = false;
        }
        return this.f56236i.contains(c6592e);
    }

    public boolean r() {
        return !this.f56229b;
    }

    public void s(Object obj, Object obj2) {
        C6068a c6068aD = d(obj);
        if (c6068aD != null) {
            c6068aD.e0(obj2);
        }
    }

    f t(Object obj) {
        return (f) this.f56230c.get(obj);
    }

    public void u() {
        Iterator it = this.f56230c.keySet().iterator();
        while (it.hasNext()) {
            ((f) this.f56230c.get(it.next())).a().s0();
        }
        this.f56230c.clear();
        this.f56230c.put(f56227k, this.f56233f);
        this.f56231d.clear();
        this.f56232e.clear();
        this.f56235h.clear();
        this.f56237j = true;
    }

    public void v(q1.c cVar) {
        this.f56228a = cVar;
    }

    public g w(q1.d dVar) {
        this.f56233f.Y(dVar);
        return this;
    }

    public void x(boolean z10) {
        this.f56229b = !z10;
    }

    public void y(String str, String str2) {
        ArrayList arrayList;
        C6068a c6068aD = d(str);
        if (c6068aD != null) {
            c6068aD.b0(str2);
            if (this.f56232e.containsKey(str2)) {
                arrayList = (ArrayList) this.f56232e.get(str2);
            } else {
                arrayList = new ArrayList();
                this.f56232e.put(str2, arrayList);
            }
            arrayList.add(str);
        }
    }

    public g z(q1.d dVar) {
        this.f56233f.f0(dVar);
        return this;
    }
}
