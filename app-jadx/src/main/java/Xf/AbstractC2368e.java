package Xf;

import Tf.l;
import Tf.m;
import Wf.AbstractC2358b;
import Wf.C2363g;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Xf.e */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
abstract class AbstractC2368e extends Vf.V implements Wf.s {

    /* JADX INFO: renamed from: b */
    private final AbstractC2358b f21977b;

    /* JADX INFO: renamed from: c */
    private final Function1 f21978c;

    /* JADX INFO: renamed from: d */
    protected final C2363g f21979d;

    /* JADX INFO: renamed from: e */
    private String f21980e;

    /* JADX INFO: renamed from: f */
    private String f21981f;

    /* JADX INFO: renamed from: Xf.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends Uf.b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f21983b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Tf.e f21984c;

        a(String str, Tf.e eVar) {
            this.f21983b = str;
            this.f21984c = eVar;
        }

        @Override // Uf.b, Uf.f
        public void F(String value) {
            AbstractC5504s.h(value, "value");
            AbstractC2368e.this.v0(this.f21983b, new Wf.v(value, false, this.f21984c));
        }

        @Override // Uf.f
        public Yf.e a() {
            return AbstractC2368e.this.d().a();
        }
    }

    /* JADX INFO: renamed from: Xf.e$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b extends Uf.b {

        /* JADX INFO: renamed from: a */
        private final Yf.e f21985a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f21987c;

        b(String str) {
            this.f21987c = str;
            this.f21985a = AbstractC2368e.this.d().a();
        }

        @Override // Uf.b, Uf.f
        public void E(int i10) {
            J(Long.toString(((long) Td.D.b(i10)) & 4294967295L, 10));
        }

        public final void J(String s10) {
            AbstractC5504s.h(s10, "s");
            AbstractC2368e.this.v0(this.f21987c, new Wf.v(s10, false, null, 4, null));
        }

        @Override // Uf.f
        public Yf.e a() {
            return this.f21985a;
        }

        @Override // Uf.b, Uf.f
        public void j(byte b10) {
            J(Td.B.k(Td.B.b(b10)));
        }

        @Override // Uf.b, Uf.f
        public void s(long j10) {
            J(AbstractC2371h.a(Td.F.b(j10), 10));
        }

        @Override // Uf.b, Uf.f
        public void w(short s10) {
            J(Td.I.k(Td.I.b(s10)));
        }
    }

    public /* synthetic */ AbstractC2368e(AbstractC2358b abstractC2358b, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC2358b, function1);
    }

    public static final Td.L e0(AbstractC2368e abstractC2368e, Wf.i node) {
        AbstractC5504s.h(node, "node");
        abstractC2368e.v0((String) abstractC2368e.U(), node);
        return Td.L.f17438a;
    }

    private final a t0(String str, Tf.e eVar) {
        return new a(str, eVar);
    }

    private final b u0(String str) {
        return new b(str);
    }

    @Override // Vf.B0, Uf.f
    public Uf.f D(Tf.e descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        if (V() == null) {
            return new H(this.f21977b, this.f21978c).D(descriptor);
        }
        if (this.f21980e != null) {
            this.f21981f = descriptor.o();
        }
        return super.D(descriptor);
    }

    @Override // Vf.B0
    protected void T(Tf.e descriptor) {
        AbstractC5504s.h(descriptor, "descriptor");
        this.f21978c.invoke(r0());
    }

    @Override // Vf.V
    protected String Z(String parentName, String childName) {
        AbstractC5504s.h(parentName, "parentName");
        AbstractC5504s.h(childName, "childName");
        return childName;
    }

    @Override // Uf.f
    public final Yf.e a() {
        return this.f21977b.a();
    }

    @Override // Vf.V
    protected String a0(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return E.h(descriptor, this.f21977b, i10);
    }

    @Override // Uf.f
    public Uf.d b(Tf.e descriptor) {
        AbstractC2368e n10;
        AbstractC5504s.h(descriptor, "descriptor");
        Function1 function1 = V() == null ? this.f21978c : new Function1() { // from class: Xf.d
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractC2368e.e0(this.f21976a, (Wf.i) obj);
            }
        };
        Tf.l lVarH = descriptor.h();
        if (AbstractC5504s.c(lVarH, m.b.f17535a) || (lVarH instanceof Tf.c)) {
            n10 = new N(this.f21977b, function1);
        } else if (AbstractC5504s.c(lVarH, m.c.f17536a)) {
            AbstractC2358b abstractC2358b = this.f21977b;
            Tf.e eVarA = f0.a(descriptor.n(0), abstractC2358b.a());
            Tf.l lVarH2 = eVarA.h();
            if ((lVarH2 instanceof Tf.d) || AbstractC5504s.c(lVarH2, l.b.f17533a)) {
                n10 = new P(this.f21977b, function1);
            } else {
                if (!abstractC2358b.f().c()) {
                    throw C.d(eVarA);
                }
                n10 = new N(this.f21977b, function1);
            }
        } else {
            n10 = new L(this.f21977b, function1);
        }
        String str = this.f21980e;
        if (str != null) {
            if (n10 instanceof P) {
                P p10 = (P) n10;
                p10.v0(SubscriberAttributeKt.JSON_NAME_KEY, Wf.j.c(str));
                String strO = this.f21981f;
                if (strO == null) {
                    strO = descriptor.o();
                }
                p10.v0("value", Wf.j.c(strO));
            } else {
                String strO2 = this.f21981f;
                if (strO2 == null) {
                    strO2 = descriptor.o();
                }
                n10.v0(str, Wf.j.c(strO2));
            }
            this.f21980e = null;
            this.f21981f = null;
        }
        return n10;
    }

    @Override // Wf.s
    public final AbstractC2358b d() {
        return this.f21977b;
    }

    @Override // Vf.B0
    /* JADX INFO: renamed from: f0 */
    public void I(String tag, boolean z10) {
        AbstractC5504s.h(tag, "tag");
        v0(tag, Wf.j.a(Boolean.valueOf(z10)));
    }

    @Override // Uf.d
    public boolean g(Tf.e descriptor, int i10) {
        AbstractC5504s.h(descriptor, "descriptor");
        return this.f21979d.i();
    }

    @Override // Vf.B0
    /* JADX INFO: renamed from: g0 */
    public void J(String tag, byte b10) {
        AbstractC5504s.h(tag, "tag");
        v0(tag, Wf.j.b(Byte.valueOf(b10)));
    }

    @Override // Vf.B0
    /* JADX INFO: renamed from: h0 */
    public void K(String tag, char c10) {
        AbstractC5504s.h(tag, "tag");
        v0(tag, Wf.j.c(String.valueOf(c10)));
    }

    @Override // Vf.B0
    /* JADX INFO: renamed from: i0 */
    public void L(String tag, double d10) {
        AbstractC5504s.h(tag, "tag");
        v0(tag, Wf.j.b(Double.valueOf(d10)));
        if (this.f21979d.b()) {
            return;
        }
        if (Double.isInfinite(d10) || Double.isNaN(d10)) {
            throw C.c(Double.valueOf(d10), tag, r0().toString());
        }
    }

    @Override // Vf.B0
    /* JADX INFO: renamed from: j0 */
    public void M(String tag, Tf.e enumDescriptor, int i10) {
        AbstractC5504s.h(tag, "tag");
        AbstractC5504s.h(enumDescriptor, "enumDescriptor");
        v0(tag, Wf.j.c(enumDescriptor.l(i10)));
    }

    @Override // Vf.B0
    /* JADX INFO: renamed from: k0 */
    public void N(String tag, float f10) {
        AbstractC5504s.h(tag, "tag");
        v0(tag, Wf.j.b(Float.valueOf(f10)));
        if (this.f21979d.b()) {
            return;
        }
        if (Float.isInfinite(f10) || Float.isNaN(f10)) {
            throw C.c(Float.valueOf(f10), tag, r0().toString());
        }
    }

    @Override // Vf.B0
    /* JADX INFO: renamed from: l0 */
    public Uf.f O(String tag, Tf.e inlineDescriptor) {
        AbstractC5504s.h(tag, "tag");
        AbstractC5504s.h(inlineDescriptor, "inlineDescriptor");
        return W.b(inlineDescriptor) ? u0(tag) : W.a(inlineDescriptor) ? t0(tag, inlineDescriptor) : super.O(tag, inlineDescriptor);
    }

    @Override // Vf.B0
    /* JADX INFO: renamed from: m0 */
    public void P(String tag, int i10) {
        AbstractC5504s.h(tag, "tag");
        v0(tag, Wf.j.b(Integer.valueOf(i10)));
    }

    @Override // Vf.B0
    /* JADX INFO: renamed from: n0 */
    public void Q(String tag, long j10) {
        AbstractC5504s.h(tag, "tag");
        v0(tag, Wf.j.b(Long.valueOf(j10)));
    }

    protected void o0(String tag) {
        AbstractC5504s.h(tag, "tag");
        v0(tag, Wf.z.INSTANCE);
    }

    @Override // Vf.B0
    /* JADX INFO: renamed from: p0 */
    public void R(String tag, short s10) {
        AbstractC5504s.h(tag, "tag");
        v0(tag, Wf.j.b(Short.valueOf(s10)));
    }

    @Override // Vf.B0
    /* JADX INFO: renamed from: q0 */
    public void S(String tag, String value) {
        AbstractC5504s.h(tag, "tag");
        AbstractC5504s.h(value, "value");
        v0(tag, Wf.j.c(value));
    }

    public abstract Wf.i r0();

    protected final Function1 s0() {
        return this.f21978c;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0087  */
    @Override // Vf.B0, Uf.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t(Rf.k r4, java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Xf.AbstractC2368e.t(Rf.k, java.lang.Object):void");
    }

    @Override // Uf.f
    public void v() {
        String str = (String) V();
        if (str == null) {
            this.f21978c.invoke(Wf.z.INSTANCE);
        } else {
            o0(str);
        }
    }

    public abstract void v0(String str, Wf.i iVar);

    private AbstractC2368e(AbstractC2358b abstractC2358b, Function1 function1) {
        this.f21977b = abstractC2358b;
        this.f21978c = function1;
        this.f21979d = abstractC2358b.f();
    }

    @Override // Uf.f
    public void A() {
    }
}
