package d1;

import U0.C2197e;
import U0.I0;
import U0.InterfaceC2236y;
import U0.Y0;
import V0.O;
import Y.h2;
import Y0.AbstractC2485u;
import Y0.H;
import Y0.I;
import Y0.L;
import Y0.t0;
import android.graphics.Typeface;
import i1.InterfaceC5011d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceC2236y {

    /* JADX INFO: renamed from: a */
    private final String f44941a;

    /* JADX INFO: renamed from: b */
    private final Y0 f44942b;

    /* JADX INFO: renamed from: c */
    private final List f44943c;

    /* JADX INFO: renamed from: d */
    private final List f44944d;

    /* JADX INFO: renamed from: e */
    private final AbstractC2485u.b f44945e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC5011d f44946f;

    /* JADX INFO: renamed from: g */
    private final i f44947g;

    /* JADX INFO: renamed from: h */
    private final CharSequence f44948h;

    /* JADX INFO: renamed from: i */
    private final O f44949i;

    /* JADX INFO: renamed from: j */
    private v f44950j;

    /* JADX INFO: renamed from: k */
    private final boolean f44951k;

    /* JADX INFO: renamed from: l */
    private final int f44952l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    public e(String str, Y0 y02, List list, List list2, AbstractC2485u.b bVar, InterfaceC5011d interfaceC5011d) {
        Object obj;
        ?? arrayList;
        this.f44941a = str;
        this.f44942b = y02;
        this.f44943c = list;
        this.f44944d = list2;
        this.f44945e = bVar;
        this.f44946f = interfaceC5011d;
        i iVar = new i(1, interfaceC5011d.getDensity());
        this.f44947g = iVar;
        this.f44951k = !f.c(y02) ? false : ((Boolean) q.f44971a.a().getValue()).booleanValue();
        this.f44952l = f.d(y02.D(), y02.w());
        ie.p pVar = new ie.p() { // from class: d1.d
            @Override // ie.p
            public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                return e.c(this.f44940a, (AbstractC2485u) obj2, (L) obj3, (H) obj4, (I) obj5);
            }
        };
        e1.e.e(iVar, y02.G());
        I0 i0O = y02.O();
        int size = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i10);
            if (((C2197e.d) obj).g() instanceof I0) {
                break;
            } else {
                i10++;
            }
        }
        I0 i0A = e1.e.a(iVar, i0O, pVar, interfaceC5011d, obj != null);
        if (i0A != null) {
            int size2 = this.f44943c.size() + 1;
            arrayList = new ArrayList(size2);
            int i11 = 0;
            while (i11 < size2) {
                arrayList.add(i11 == 0 ? new C2197e.d(i0A, 0, this.f44941a.length()) : (C2197e.d) this.f44943c.get(i11 - 1));
                i11++;
            }
        } else {
            arrayList = this.f44943c;
        }
        CharSequence charSequenceA = c.a(this.f44941a, this.f44947g.getTextSize(), this.f44942b, arrayList, this.f44944d, this.f44946f, pVar, this.f44951k);
        this.f44948h = charSequenceA;
        this.f44949i = new O(charSequenceA, this.f44947g, this.f44952l);
    }

    public static final Typeface c(e eVar, AbstractC2485u abstractC2485u, L l10, H h10, I i10) {
        h2 h2VarB = eVar.f44945e.b(abstractC2485u, l10, h10.i(), i10.m());
        if (h2VarB instanceof t0.b) {
            Object value = ((t0.b) h2VarB).getValue();
            AbstractC5504s.f(value, "null cannot be cast to non-null type android.graphics.Typeface");
            return (Typeface) value;
        }
        v vVar = new v(h2VarB, eVar.f44950j);
        eVar.f44950j = vVar;
        return vVar.a();
    }

    @Override // U0.InterfaceC2236y
    public boolean a() {
        v vVar = this.f44950j;
        if (vVar != null ? vVar.b() : false) {
            return true;
        }
        return !this.f44951k && f.c(this.f44942b) && ((Boolean) q.f44971a.a().getValue()).booleanValue();
    }

    @Override // U0.InterfaceC2236y
    public float d() {
        return this.f44949i.i();
    }

    public final CharSequence e() {
        return this.f44948h;
    }

    @Override // U0.InterfaceC2236y
    public float f() {
        return this.f44949i.j();
    }

    public final O g() {
        return this.f44949i;
    }

    public final Y0 h() {
        return this.f44942b;
    }

    public final int i() {
        return this.f44952l;
    }

    public final i j() {
        return this.f44947g;
    }
}
