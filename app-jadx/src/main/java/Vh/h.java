package Vh;

import Vh.c;
import Vh.i;
import Vh.j;
import Vh.k;
import Vh.l;
import Vh.q;
import Vh.u;
import Yh.AbstractC2491a;
import Yh.B;
import Yh.C2492b;
import Yh.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public class h implements ai.h {

    /* JADX INFO: renamed from: r */
    private static final Set f20412r = new LinkedHashSet(Arrays.asList(C2492b.class, Yh.j.class, Yh.h.class, Yh.k.class, B.class, Yh.q.class, Yh.n.class));

    /* JADX INFO: renamed from: s */
    private static final Map f20413s;

    /* JADX INFO: renamed from: a */
    private Zh.f f20414a;

    /* JADX INFO: renamed from: e */
    private boolean f20418e;

    /* JADX INFO: renamed from: i */
    private boolean f20422i;

    /* JADX INFO: renamed from: j */
    private final List f20423j;

    /* JADX INFO: renamed from: k */
    private final Zh.d f20424k;

    /* JADX INFO: renamed from: l */
    private final List f20425l;

    /* JADX INFO: renamed from: m */
    private final Zh.a f20426m;

    /* JADX INFO: renamed from: n */
    private final g f20427n;

    /* JADX INFO: renamed from: b */
    private int f20415b = -1;

    /* JADX INFO: renamed from: c */
    private int f20416c = 0;

    /* JADX INFO: renamed from: d */
    private int f20417d = 0;

    /* JADX INFO: renamed from: f */
    private int f20419f = 0;

    /* JADX INFO: renamed from: g */
    private int f20420g = 0;

    /* JADX INFO: renamed from: h */
    private int f20421h = 0;

    /* JADX INFO: renamed from: o */
    private final p f20428o = new p();

    /* JADX INFO: renamed from: p */
    private final List f20429p = new ArrayList();

    /* JADX INFO: renamed from: q */
    private final List f20430q = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a implements ai.g {

        /* JADX INFO: renamed from: a */
        private final ai.d f20431a;

        public a(ai.d dVar) {
            this.f20431a = dVar;
        }

        @Override // ai.g
        public ai.d a() {
            return this.f20431a;
        }

        @Override // ai.g
        public Zh.g b() {
            ai.d dVar = this.f20431a;
            return dVar instanceof s ? ((s) dVar).k() : Zh.g.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b {

        /* JADX INFO: renamed from: a */
        private final ai.d f20432a;

        /* JADX INFO: renamed from: b */
        private int f20433b;

        b(ai.d dVar, int i10) {
            this.f20432a = dVar;
            this.f20433b = i10;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(C2492b.class, new c.a());
        map.put(Yh.j.class, new j.a());
        map.put(Yh.h.class, new i.a());
        map.put(Yh.k.class, new k.b());
        map.put(B.class, new u.a());
        map.put(Yh.q.class, new q.a());
        map.put(Yh.n.class, new l.a());
        f20413s = Collections.unmodifiableMap(map);
    }

    public h(List list, Zh.d dVar, List list2, Zh.a aVar) {
        this.f20423j = list;
        this.f20424k = dVar;
        this.f20425l = list2;
        this.f20426m = aVar;
        g gVar = new g();
        this.f20427n = gVar;
        f(new b(gVar, 0));
    }

    private void f(b bVar) {
        this.f20429p.add(bVar);
    }

    private void g(b bVar) {
        while (!e().c(bVar.f20432a.f())) {
            m(1);
        }
        e().f().b(bVar.f20432a.f());
        f(bVar);
    }

    private void h(s sVar) {
        for (Yh.p pVar : sVar.j()) {
            sVar.f().i(pVar);
            this.f20428o.a(pVar);
        }
    }

    private void i() {
        CharSequence charSequenceA;
        if (this.f20418e) {
            CharSequence charSequenceSubSequence = this.f20414a.a().subSequence(this.f20416c + 1, this.f20414a.a().length());
            int iA = Xh.f.a(this.f20417d);
            StringBuilder sb2 = new StringBuilder(charSequenceSubSequence.length() + iA);
            for (int i10 = 0; i10 < iA; i10++) {
                sb2.append(' ');
            }
            sb2.append(charSequenceSubSequence);
            charSequenceA = sb2.toString();
        } else {
            charSequenceA = this.f20416c == 0 ? this.f20414a.a() : this.f20414a.a().subSequence(this.f20416c, this.f20414a.a().length());
        }
        e().e(Zh.f.c(charSequenceA, this.f20426m == Zh.a.BLOCKS_AND_INLINES ? x.d(this.f20415b, this.f20416c, charSequenceA.length()) : null));
        j();
    }

    private void j() {
        if (this.f20426m != Zh.a.NONE) {
            for (int i10 = 1; i10 < this.f20429p.size(); i10++) {
                b bVar = (b) this.f20429p.get(i10);
                int i11 = bVar.f20433b;
                int length = this.f20414a.a().length() - i11;
                if (length != 0) {
                    bVar.f20432a.g(x.d(this.f20415b, i11, length));
                }
            }
        }
    }

    private void k() {
        char cCharAt = this.f20414a.a().charAt(this.f20416c);
        this.f20416c++;
        if (cCharAt != '\t') {
            this.f20417d++;
        } else {
            int i10 = this.f20417d;
            this.f20417d = i10 + Xh.f.a(i10);
        }
    }

    public static List l(List list, Set set) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(f20413s.get((Class) it.next()));
        }
        return arrayList;
    }

    private void m(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            ai.d dVar = n().f20432a;
            o(dVar);
            this.f20430q.add(dVar);
        }
    }

    private b n() {
        return (b) this.f20429p.remove(r0.size() - 1);
    }

    private void o(ai.d dVar) {
        if (dVar instanceof s) {
            h((s) dVar);
        }
        dVar.h();
    }

    private Yh.f p() {
        m(this.f20429p.size());
        w();
        return this.f20427n.f();
    }

    private d q(ai.d dVar) {
        a aVar = new a(dVar);
        Iterator it = this.f20423j.iterator();
        while (it.hasNext()) {
            ai.f fVarA = ((ai.e) it.next()).a(this, aVar);
            if (fVarA instanceof d) {
                return (d) fVarA;
            }
        }
        return null;
    }

    private void r() {
        int i10 = this.f20416c;
        int i11 = this.f20417d;
        this.f20422i = true;
        int length = this.f20414a.a().length();
        while (true) {
            if (i10 >= length) {
                break;
            }
            char cCharAt = this.f20414a.a().charAt(i10);
            if (cCharAt == '\t') {
                i10++;
                i11 += 4 - (i11 % 4);
            } else if (cCharAt != ' ') {
                this.f20422i = false;
                break;
            } else {
                i10++;
                i11++;
            }
        }
        this.f20419f = i10;
        this.f20420g = i11;
        this.f20421h = i11 - this.f20417d;
    }

    public static Set s() {
        return f20412r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0115, code lost:
    
        z(r11.f20419f);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void u(java.lang.CharSequence r12) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Vh.h.u(java.lang.CharSequence):void");
    }

    private AbstractC2491a v() {
        ai.d dVar = n().f20432a;
        if (dVar instanceof s) {
            h((s) dVar);
        }
        dVar.h();
        dVar.f().m();
        return dVar.f();
    }

    private void w() {
        Zh.b bVarA = this.f20424k.a(new m(this.f20425l, this.f20428o));
        Iterator it = this.f20430q.iterator();
        while (it.hasNext()) {
            ((ai.d) it.next()).b(bVarA);
        }
    }

    private void x(CharSequence charSequence) {
        this.f20415b++;
        this.f20416c = 0;
        this.f20417d = 0;
        this.f20418e = false;
        CharSequence charSequenceL = Xh.f.l(charSequence);
        this.f20414a = Zh.f.c(charSequenceL, this.f20426m != Zh.a.NONE ? x.d(this.f20415b, 0, charSequenceL.length()) : null);
    }

    private void y(int i10) {
        int i11;
        int i12 = this.f20420g;
        if (i10 >= i12) {
            this.f20416c = this.f20419f;
            this.f20417d = i12;
        }
        int length = this.f20414a.a().length();
        while (true) {
            i11 = this.f20417d;
            if (i11 >= i10 || this.f20416c == length) {
                break;
            } else {
                k();
            }
        }
        if (i11 <= i10) {
            this.f20418e = false;
            return;
        }
        this.f20416c--;
        this.f20417d = i10;
        this.f20418e = true;
    }

    private void z(int i10) {
        int i11 = this.f20419f;
        if (i10 >= i11) {
            this.f20416c = i11;
            this.f20417d = this.f20420g;
        }
        int length = this.f20414a.a().length();
        while (true) {
            int i12 = this.f20416c;
            if (i12 >= i10 || i12 == length) {
                break;
            } else {
                k();
            }
        }
        this.f20418e = false;
    }

    @Override // ai.h
    public Zh.f a() {
        return this.f20414a;
    }

    @Override // ai.h
    public int b() {
        return this.f20421h;
    }

    @Override // ai.h
    public boolean c() {
        return this.f20422i;
    }

    @Override // ai.h
    public int d() {
        return this.f20419f;
    }

    @Override // ai.h
    public ai.d e() {
        return ((b) this.f20429p.get(r0.size() - 1)).f20432a;
    }

    @Override // ai.h
    public int getColumn() {
        return this.f20417d;
    }

    @Override // ai.h
    public int getIndex() {
        return this.f20416c;
    }

    public Yh.f t(String str) {
        int i10 = 0;
        while (true) {
            int iC = Xh.f.c(str, i10);
            if (iC == -1) {
                break;
            }
            u(str.substring(i10, iC));
            i10 = iC + 1;
            if (i10 < str.length() && str.charAt(iC) == '\r' && str.charAt(i10) == '\n') {
                i10 = iC + 2;
            }
        }
        if (str.length() > 0 && (i10 == 0 || i10 < str.length())) {
            u(str.substring(i10));
        }
        return p();
    }
}
