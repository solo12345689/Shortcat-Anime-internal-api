package Qe;

import Qe.x;
import Ud.AbstractC2279u;
import df.AbstractC4598g;
import df.AbstractC4603l;
import df.C4587A;
import df.C4588B;
import df.C4589C;
import df.C4590D;
import df.C4592a;
import df.C4595d;
import df.C4597f;
import df.C4600i;
import df.C4602k;
import df.C4605n;
import df.C4610s;
import df.C4611t;
import df.C4614w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import mf.C5676g;
import qf.S;
import ye.AbstractC7246y;
import ye.InterfaceC7227e;
import ye.M;
import ye.h0;
import ye.t0;
import ze.C7370d;
import ze.InterfaceC7369c;

/* JADX INFO: renamed from: Qe.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2089h extends AbstractC2085d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ye.H f14854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final M f14855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C5676g f14856f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Ue.c f14857g;

    /* JADX INFO: renamed from: Qe.h$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private abstract class a implements x.a {

        /* JADX INFO: renamed from: Qe.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class C0250a implements x.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ x.a f14859a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ x.a f14860b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ a f14861c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Xe.f f14862d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ ArrayList f14863e;

            C0250a(x.a aVar, a aVar2, Xe.f fVar, ArrayList arrayList) {
                this.f14860b = aVar;
                this.f14861c = aVar2;
                this.f14862d = fVar;
                this.f14863e = arrayList;
                this.f14859a = aVar;
            }

            @Override // Qe.x.a
            public void a() {
                this.f14860b.a();
                this.f14861c.h(this.f14862d, new C4592a((InterfaceC7369c) AbstractC2279u.M0(this.f14863e)));
            }

            @Override // Qe.x.a
            public void b(Xe.f fVar, Xe.b enumClassId, Xe.f enumEntryName) {
                AbstractC5504s.h(enumClassId, "enumClassId");
                AbstractC5504s.h(enumEntryName, "enumEntryName");
                this.f14859a.b(fVar, enumClassId, enumEntryName);
            }

            @Override // Qe.x.a
            public x.a c(Xe.f fVar, Xe.b classId) {
                AbstractC5504s.h(classId, "classId");
                return this.f14859a.c(fVar, classId);
            }

            @Override // Qe.x.a
            public void d(Xe.f fVar, Object obj) {
                this.f14859a.d(fVar, obj);
            }

            @Override // Qe.x.a
            public x.b e(Xe.f fVar) {
                return this.f14859a.e(fVar);
            }

            @Override // Qe.x.a
            public void f(Xe.f fVar, C4597f value) {
                AbstractC5504s.h(value, "value");
                this.f14859a.f(fVar, value);
            }
        }

        /* JADX INFO: renamed from: Qe.h$a$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b implements x.b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ArrayList f14864a = new ArrayList();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C2089h f14865b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Xe.f f14866c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f14867d;

            /* JADX INFO: renamed from: Qe.h$a$b$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            public static final class C0251a implements x.a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final /* synthetic */ x.a f14868a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ x.a f14869b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ b f14870c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ ArrayList f14871d;

                C0251a(x.a aVar, b bVar, ArrayList arrayList) {
                    this.f14869b = aVar;
                    this.f14870c = bVar;
                    this.f14871d = arrayList;
                    this.f14868a = aVar;
                }

                @Override // Qe.x.a
                public void a() {
                    this.f14869b.a();
                    this.f14870c.f14864a.add(new C4592a((InterfaceC7369c) AbstractC2279u.M0(this.f14871d)));
                }

                @Override // Qe.x.a
                public void b(Xe.f fVar, Xe.b enumClassId, Xe.f enumEntryName) {
                    AbstractC5504s.h(enumClassId, "enumClassId");
                    AbstractC5504s.h(enumEntryName, "enumEntryName");
                    this.f14868a.b(fVar, enumClassId, enumEntryName);
                }

                @Override // Qe.x.a
                public x.a c(Xe.f fVar, Xe.b classId) {
                    AbstractC5504s.h(classId, "classId");
                    return this.f14868a.c(fVar, classId);
                }

                @Override // Qe.x.a
                public void d(Xe.f fVar, Object obj) {
                    this.f14868a.d(fVar, obj);
                }

                @Override // Qe.x.a
                public x.b e(Xe.f fVar) {
                    return this.f14868a.e(fVar);
                }

                @Override // Qe.x.a
                public void f(Xe.f fVar, C4597f value) {
                    AbstractC5504s.h(value, "value");
                    this.f14868a.f(fVar, value);
                }
            }

            b(C2089h c2089h, Xe.f fVar, a aVar) {
                this.f14865b = c2089h;
                this.f14866c = fVar;
                this.f14867d = aVar;
            }

            @Override // Qe.x.b
            public void a() {
                this.f14867d.g(this.f14866c, this.f14864a);
            }

            @Override // Qe.x.b
            public x.a b(Xe.b classId) {
                AbstractC5504s.h(classId, "classId");
                ArrayList arrayList = new ArrayList();
                C2089h c2089h = this.f14865b;
                h0 NO_SOURCE = h0.f65112a;
                AbstractC5504s.g(NO_SOURCE, "NO_SOURCE");
                x.a aVarX = c2089h.x(classId, NO_SOURCE, arrayList);
                AbstractC5504s.e(aVarX);
                return new C0251a(aVarX, this, arrayList);
            }

            @Override // Qe.x.b
            public void c(Xe.b enumClassId, Xe.f enumEntryName) {
                AbstractC5504s.h(enumClassId, "enumClassId");
                AbstractC5504s.h(enumEntryName, "enumEntryName");
                this.f14864a.add(new C4602k(enumClassId, enumEntryName));
            }

            @Override // Qe.x.b
            public void d(C4597f value) {
                AbstractC5504s.h(value, "value");
                this.f14864a.add(new C4610s(value));
            }

            @Override // Qe.x.b
            public void e(Object obj) {
                this.f14864a.add(this.f14865b.O(this.f14866c, obj));
            }
        }

        public a() {
        }

        @Override // Qe.x.a
        public void b(Xe.f fVar, Xe.b enumClassId, Xe.f enumEntryName) {
            AbstractC5504s.h(enumClassId, "enumClassId");
            AbstractC5504s.h(enumEntryName, "enumEntryName");
            h(fVar, new C4602k(enumClassId, enumEntryName));
        }

        @Override // Qe.x.a
        public x.a c(Xe.f fVar, Xe.b classId) {
            AbstractC5504s.h(classId, "classId");
            ArrayList arrayList = new ArrayList();
            C2089h c2089h = C2089h.this;
            h0 NO_SOURCE = h0.f65112a;
            AbstractC5504s.g(NO_SOURCE, "NO_SOURCE");
            x.a aVarX = c2089h.x(classId, NO_SOURCE, arrayList);
            AbstractC5504s.e(aVarX);
            return new C0250a(aVarX, this, fVar, arrayList);
        }

        @Override // Qe.x.a
        public void d(Xe.f fVar, Object obj) {
            h(fVar, C2089h.this.O(fVar, obj));
        }

        @Override // Qe.x.a
        public x.b e(Xe.f fVar) {
            return new b(C2089h.this, fVar, this);
        }

        @Override // Qe.x.a
        public void f(Xe.f fVar, C4597f value) {
            AbstractC5504s.h(value, "value");
            h(fVar, new C4610s(value));
        }

        public abstract void g(Xe.f fVar, ArrayList arrayList);

        public abstract void h(Xe.f fVar, AbstractC4598g abstractC4598g);
    }

    /* JADX INFO: renamed from: Qe.h$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HashMap f14872b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC7227e f14874d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Xe.b f14875e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f14876f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ h0 f14877g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC7227e interfaceC7227e, Xe.b bVar, List list, h0 h0Var) {
            super();
            this.f14874d = interfaceC7227e;
            this.f14875e = bVar;
            this.f14876f = list;
            this.f14877g = h0Var;
            this.f14872b = new HashMap();
        }

        @Override // Qe.x.a
        public void a() {
            if (C2089h.this.F(this.f14875e, this.f14872b) || C2089h.this.w(this.f14875e)) {
                return;
            }
            this.f14876f.add(new C7370d(this.f14874d.p(), this.f14872b, this.f14877g));
        }

        @Override // Qe.C2089h.a
        public void g(Xe.f fVar, ArrayList elements) {
            AbstractC5504s.h(elements, "elements");
            if (fVar == null) {
                return;
            }
            t0 t0VarB = Ie.a.b(fVar, this.f14874d);
            if (t0VarB != null) {
                HashMap map = this.f14872b;
                C4600i c4600i = C4600i.f45156a;
                List listC = Af.a.c(elements);
                S type = t0VarB.getType();
                AbstractC5504s.g(type, "getType(...)");
                map.put(fVar, c4600i.b(listC, type));
                return;
            }
            if (C2089h.this.w(this.f14875e) && AbstractC5504s.c(fVar.b(), "value")) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : elements) {
                    if (obj instanceof C4592a) {
                        arrayList.add(obj);
                    }
                }
                List list = this.f14876f;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    list.add((InterfaceC7369c) ((C4592a) it.next()).b());
                }
            }
        }

        @Override // Qe.C2089h.a
        public void h(Xe.f fVar, AbstractC4598g value) {
            AbstractC5504s.h(value, "value");
            if (fVar != null) {
                this.f14872b.put(fVar, value);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2089h(ye.H module, M notFoundClasses, pf.n storageManager, v kotlinClassFinder) {
        super(storageManager, kotlinClassFinder);
        AbstractC5504s.h(module, "module");
        AbstractC5504s.h(notFoundClasses, "notFoundClasses");
        AbstractC5504s.h(storageManager, "storageManager");
        AbstractC5504s.h(kotlinClassFinder, "kotlinClassFinder");
        this.f14854d = module;
        this.f14855e = notFoundClasses;
        this.f14856f = new C5676g(module, notFoundClasses);
        this.f14857g = Ue.c.f19575i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC4598g O(Xe.f fVar, Object obj) {
        AbstractC4598g abstractC4598gE = C4600i.f45156a.e(obj, this.f14854d);
        if (abstractC4598gE != null) {
            return abstractC4598gE;
        }
        return AbstractC4603l.f45159b.a("Unsupported annotation argument: " + fVar);
    }

    private final InterfaceC7227e R(Xe.b bVar) {
        return AbstractC7246y.d(this.f14854d, bVar, this.f14855e);
    }

    @Override // Qe.AbstractC2086e, mf.InterfaceC5677h
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public InterfaceC7369c d(Se.b proto, Ue.d nameResolver) {
        AbstractC5504s.h(proto, "proto");
        AbstractC5504s.h(nameResolver, "nameResolver");
        return this.f14856f.a(proto, nameResolver);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Qe.AbstractC2085d
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public AbstractC4598g I(String desc, Object initializer) {
        AbstractC5504s.h(desc, "desc");
        AbstractC5504s.h(initializer, "initializer");
        if (Df.r.W("ZBCS", desc, false, 2, null)) {
            int iIntValue = ((Integer) initializer).intValue();
            int iHashCode = desc.hashCode();
            if (iHashCode == 66) {
                if (desc.equals("B")) {
                    initializer = Byte.valueOf((byte) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 67) {
                if (desc.equals("C")) {
                    initializer = Character.valueOf((char) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 83) {
                if (desc.equals("S")) {
                    initializer = Short.valueOf((short) iIntValue);
                }
                throw new AssertionError(desc);
            }
            if (iHashCode == 90 && desc.equals("Z")) {
                initializer = Boolean.valueOf(iIntValue != 0);
            }
            throw new AssertionError(desc);
        }
        return C4600i.f45156a.e(initializer, this.f14854d);
    }

    public void S(Ue.c cVar) {
        AbstractC5504s.h(cVar, "<set-?>");
        this.f14857g = cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Qe.AbstractC2085d
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public AbstractC4598g M(AbstractC4598g constant) {
        AbstractC5504s.h(constant, "constant");
        return constant instanceof C4595d ? new C4587A(((Number) ((C4595d) constant).b()).byteValue()) : constant instanceof C4614w ? new C4590D(((Number) ((C4614w) constant).b()).shortValue()) : constant instanceof C4605n ? new C4588B(((Number) ((C4605n) constant).b()).intValue()) : constant instanceof C4611t ? new C4589C(((Number) ((C4611t) constant).b()).longValue()) : constant;
    }

    @Override // Qe.AbstractC2086e
    public Ue.c v() {
        return this.f14857g;
    }

    @Override // Qe.AbstractC2086e
    protected x.a x(Xe.b annotationClassId, h0 source, List result) {
        AbstractC5504s.h(annotationClassId, "annotationClassId");
        AbstractC5504s.h(source, "source");
        AbstractC5504s.h(result, "result");
        return new b(R(annotationClassId), annotationClassId, result, source);
    }
}
