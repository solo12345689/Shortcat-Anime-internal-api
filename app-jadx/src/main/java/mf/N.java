package mf;

import Se.c;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ye.h0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class N {

    /* JADX INFO: renamed from: a */
    private final Ue.d f53366a;

    /* JADX INFO: renamed from: b */
    private final Ue.h f53367b;

    /* JADX INFO: renamed from: c */
    private final h0 f53368c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends N {

        /* JADX INFO: renamed from: d */
        private final Se.c f53369d;

        /* JADX INFO: renamed from: e */
        private final a f53370e;

        /* JADX INFO: renamed from: f */
        private final Xe.b f53371f;

        /* JADX INFO: renamed from: g */
        private final c.EnumC0282c f53372g;

        /* JADX INFO: renamed from: h */
        private final boolean f53373h;

        /* JADX INFO: renamed from: i */
        private final boolean f53374i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Se.c classProto, Ue.d nameResolver, Ue.h typeTable, h0 h0Var, a aVar) {
            super(nameResolver, typeTable, h0Var, null);
            AbstractC5504s.h(classProto, "classProto");
            AbstractC5504s.h(nameResolver, "nameResolver");
            AbstractC5504s.h(typeTable, "typeTable");
            this.f53369d = classProto;
            this.f53370e = aVar;
            this.f53371f = L.a(nameResolver, classProto.J0());
            c.EnumC0282c enumC0282c = (c.EnumC0282c) Ue.b.f19550f.d(classProto.I0());
            this.f53372g = enumC0282c == null ? c.EnumC0282c.CLASS : enumC0282c;
            Boolean boolD = Ue.b.f19551g.d(classProto.I0());
            AbstractC5504s.g(boolD, "get(...)");
            this.f53373h = boolD.booleanValue();
            Boolean boolD2 = Ue.b.f19552h.d(classProto.I0());
            AbstractC5504s.g(boolD2, "get(...)");
            this.f53374i = boolD2.booleanValue();
        }

        @Override // mf.N
        public Xe.c a() {
            return this.f53371f.a();
        }

        public final Xe.b e() {
            return this.f53371f;
        }

        public final Se.c f() {
            return this.f53369d;
        }

        public final c.EnumC0282c g() {
            return this.f53372g;
        }

        public final a h() {
            return this.f53370e;
        }

        public final boolean i() {
            return this.f53373h;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends N {

        /* JADX INFO: renamed from: d */
        private final Xe.c f53375d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Xe.c fqName, Ue.d nameResolver, Ue.h typeTable, h0 h0Var) {
            super(nameResolver, typeTable, h0Var, null);
            AbstractC5504s.h(fqName, "fqName");
            AbstractC5504s.h(nameResolver, "nameResolver");
            AbstractC5504s.h(typeTable, "typeTable");
            this.f53375d = fqName;
        }

        @Override // mf.N
        public Xe.c a() {
            return this.f53375d;
        }
    }

    public /* synthetic */ N(Ue.d dVar, Ue.h hVar, h0 h0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, hVar, h0Var);
    }

    public abstract Xe.c a();

    public final Ue.d b() {
        return this.f53366a;
    }

    public final h0 c() {
        return this.f53368c;
    }

    public final Ue.h d() {
        return this.f53367b;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + a();
    }

    private N(Ue.d dVar, Ue.h hVar, h0 h0Var) {
        this.f53366a = dVar;
        this.f53367b = hVar;
        this.f53368c = h0Var;
    }
}
