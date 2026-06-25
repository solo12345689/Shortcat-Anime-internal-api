package Ze;

import Ze.a;
import Ze.h;
import Ze.j;
import Ze.p;
import Ze.y;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class i extends Ze.a implements Serializable {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23322a;

        static {
            int[] iArr = new int[y.c.values().length];
            f23322a = iArr;
            try {
                iArr[y.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23322a[y.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class b extends a.AbstractC0406a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Ze.d f23323a = Ze.d.f23287a;

        protected b() {
        }

        public final Ze.d i() {
            return this.f23323a;
        }

        public abstract b j(i iVar);

        public final b k(Ze.d dVar) {
            this.f23323a = dVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class c extends b implements q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private h f23324b = h.g();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f23325c;

        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public h n() {
            this.f23324b.q();
            this.f23325c = false;
            return this.f23324b;
        }

        private void p() {
            if (this.f23325c) {
                return;
            }
            this.f23324b = this.f23324b.clone();
            this.f23325c = true;
        }

        protected final void q(d dVar) {
            p();
            this.f23324b.r(dVar.f23326b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e implements h.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final j.b f23331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f23332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final y.b f23333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f23334d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f23335e;

        e(j.b bVar, int i10, y.b bVar2, boolean z10, boolean z11) {
            this.f23331a = bVar;
            this.f23332b = i10;
            this.f23333c = bVar2;
            this.f23334d = z10;
            this.f23335e = z11;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return this.f23332b - eVar.f23332b;
        }

        public j.b b() {
            return this.f23331a;
        }

        @Override // Ze.h.b
        public int d() {
            return this.f23332b;
        }

        @Override // Ze.h.b
        public boolean e() {
            return this.f23334d;
        }

        @Override // Ze.h.b
        public y.b f() {
            return this.f23333c;
        }

        @Override // Ze.h.b
        public boolean g() {
            return this.f23335e;
        }

        @Override // Ze.h.b
        public p.a i(p.a aVar, p pVar) {
            return ((b) aVar).j((i) pVar);
        }

        @Override // Ze.h.b
        public y.c o() {
            return this.f23333c.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final p f23336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f23337b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final p f23338c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final e f23339d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Class f23340e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Method f23341f;

        f(p pVar, Object obj, p pVar2, e eVar, Class cls) {
            if (pVar == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (eVar.f() == y.b.f23403m && pVar2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f23336a = pVar;
            this.f23337b = obj;
            this.f23338c = pVar2;
            this.f23339d = eVar;
            this.f23340e = cls;
            if (j.a.class.isAssignableFrom(cls)) {
                this.f23341f = i.j(cls, "valueOf", Integer.TYPE);
            } else {
                this.f23341f = null;
            }
        }

        Object a(Object obj) {
            if (!this.f23339d.e()) {
                return e(obj);
            }
            if (this.f23339d.o() != y.c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(e(it.next()));
            }
            return arrayList;
        }

        public p b() {
            return this.f23336a;
        }

        public p c() {
            return this.f23338c;
        }

        public int d() {
            return this.f23339d.d();
        }

        Object e(Object obj) {
            return this.f23339d.o() == y.c.ENUM ? i.k(this.f23341f, null, (Integer) obj) : obj;
        }

        Object f(Object obj) {
            return this.f23339d.o() == y.c.ENUM ? Integer.valueOf(((j.a) obj).d()) : obj;
        }
    }

    protected i() {
    }

    static Method j(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            String name = cls.getName();
            String strValueOf = String.valueOf(str);
            StringBuilder sb2 = new StringBuilder(name.length() + 45 + strValueOf.length());
            sb2.append("Generated message class \"");
            sb2.append(name);
            sb2.append("\" missing method \"");
            sb2.append(strValueOf);
            sb2.append("\".");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    static Object k(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static f m(p pVar, p pVar2, j.b bVar, int i10, y.b bVar2, boolean z10, Class cls) {
        return new f(pVar, Collections.EMPTY_LIST, pVar2, new e(bVar, i10, bVar2, true, z10), cls);
    }

    public static f o(p pVar, Object obj, p pVar2, j.b bVar, int i10, y.b bVar2, Class cls) {
        return new f(pVar, obj, pVar2, new e(bVar, i10, bVar2, false, false), cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean q(Ze.h r5, Ze.p r6, Ze.e r7, Ze.f r8, Ze.g r9, int r10) throws Ze.k {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ze.i.q(Ze.h, Ze.p, Ze.e, Ze.f, Ze.g, int):boolean");
    }

    protected boolean p(Ze.e eVar, Ze.f fVar, g gVar, int i10) {
        return eVar.O(i10, fVar);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class d extends i implements q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h f23326b;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        protected class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Iterator f23327a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Map.Entry f23328b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f23329c;

            /* synthetic */ a(d dVar, boolean z10, a aVar) {
                this(z10);
            }

            public void a(int i10, Ze.f fVar) {
                while (true) {
                    Map.Entry entry = this.f23328b;
                    if (entry == null || ((e) entry.getKey()).d() >= i10) {
                        return;
                    }
                    e eVar = (e) this.f23328b.getKey();
                    if (this.f23329c && eVar.o() == y.c.MESSAGE && !eVar.e()) {
                        fVar.e0(eVar.d(), (p) this.f23328b.getValue());
                    } else {
                        h.z(eVar, this.f23328b.getValue(), fVar);
                    }
                    if (this.f23327a.hasNext()) {
                        this.f23328b = (Map.Entry) this.f23327a.next();
                    } else {
                        this.f23328b = null;
                    }
                }
            }

            private a(boolean z10) {
                Iterator itP = d.this.f23326b.p();
                this.f23327a = itP;
                if (itP.hasNext()) {
                    this.f23328b = (Map.Entry) itP.next();
                }
                this.f23329c = z10;
            }
        }

        protected d() {
            this.f23326b = h.t();
        }

        private void A(f fVar) {
            if (fVar.b() != c()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // Ze.i
        protected void l() {
            this.f23326b.q();
        }

        @Override // Ze.i
        protected boolean p(Ze.e eVar, Ze.f fVar, g gVar, int i10) {
            return i.q(this.f23326b, c(), eVar, fVar, gVar, i10);
        }

        protected boolean t() {
            return this.f23326b.n();
        }

        protected int u() {
            return this.f23326b.k();
        }

        public final Object v(f fVar) {
            A(fVar);
            Object objH = this.f23326b.h(fVar.f23339d);
            return objH == null ? fVar.f23337b : fVar.a(objH);
        }

        public final Object w(f fVar, int i10) {
            A(fVar);
            return fVar.e(this.f23326b.i(fVar.f23339d, i10));
        }

        public final int x(f fVar) {
            A(fVar);
            return this.f23326b.j(fVar.f23339d);
        }

        public final boolean y(f fVar) {
            A(fVar);
            return this.f23326b.m(fVar.f23339d);
        }

        protected a z() {
            return new a(this, false, null);
        }

        protected d(c cVar) {
            this.f23326b = cVar.n();
        }
    }

    protected i(b bVar) {
    }

    protected void l() {
    }
}
