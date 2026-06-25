package v4;

import A4.a;
import A4.b;
import A4.c;
import A4.e;
import A4.f;
import A4.j;
import A4.k;
import A4.l;
import D4.g;
import G4.h;
import G4.i;
import G4.p;
import Gf.AbstractC1617k;
import Gf.C1608f0;
import Gf.L;
import Gf.O;
import Gf.P;
import Gf.W;
import Gf.X0;
import L4.o;
import L4.r;
import L4.t;
import Td.v;
import Ud.AbstractC2279u;
import ae.AbstractC2605b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import dg.u;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v4.InterfaceC6843b;
import x4.d;

/* JADX INFO: renamed from: v4.e */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6846e implements InterfaceC6845d {

    /* JADX INFO: renamed from: o */
    public static final a f61927o = new a(null);

    /* JADX INFO: renamed from: a */
    private final Context f61928a;

    /* JADX INFO: renamed from: b */
    private final G4.c f61929b;

    /* JADX INFO: renamed from: c */
    private final Lazy f61930c;

    /* JADX INFO: renamed from: d */
    private final Lazy f61931d;

    /* JADX INFO: renamed from: e */
    private final Lazy f61932e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC6843b.c f61933f;

    /* JADX INFO: renamed from: g */
    private final C6842a f61934g;

    /* JADX INFO: renamed from: h */
    private final o f61935h;

    /* JADX INFO: renamed from: i */
    private final O f61936i = P.a(X0.b(null, 1, null).w(C1608f0.c().d2()).w(new f(L.f7522J, this)));

    /* JADX INFO: renamed from: j */
    private final t f61937j;

    /* JADX INFO: renamed from: k */
    private final p f61938k;

    /* JADX INFO: renamed from: l */
    private final C6842a f61939l;

    /* JADX INFO: renamed from: m */
    private final List f61940m;

    /* JADX INFO: renamed from: n */
    private final AtomicBoolean f61941n;

    /* JADX INFO: renamed from: v4.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: v4.e$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f61942a;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ h f61944c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h hVar, Zd.e eVar) {
            super(2, eVar);
            this.f61944c = hVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return C6846e.this.new b(this.f61944c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((b) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f61942a;
            if (i10 == 0) {
                v.b(obj);
                C6846e c6846e = C6846e.this;
                h hVar = this.f61944c;
                this.f61942a = 1;
                obj = c6846e.g(hVar, 0, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            C6846e c6846e2 = C6846e.this;
            if (((i) obj) instanceof G4.f) {
                c6846e2.h();
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: v4.e$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f61945a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Object f61946b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ h f61947c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ C6846e f61948d;

        /* JADX INFO: renamed from: v4.e$c$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends l implements Function2 {

            /* JADX INFO: renamed from: a */
            int f61949a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C6846e f61950b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ h f61951c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C6846e c6846e, h hVar, Zd.e eVar) {
                super(2, eVar);
                this.f61950b = c6846e;
                this.f61951c = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new a(this.f61950b, this.f61951c, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f61949a;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                    return obj;
                }
                v.b(obj);
                C6846e c6846e = this.f61950b;
                h hVar = this.f61951c;
                this.f61949a = 1;
                Object objG = c6846e.g(hVar, 1, this);
                return objG == objF ? objF : objG;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(h hVar, C6846e c6846e, Zd.e eVar) {
            super(2, eVar);
            this.f61947c = hVar;
            this.f61948d = c6846e;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            c cVar = new c(this.f61947c, this.f61948d, eVar);
            cVar.f61946b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((c) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f61945a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                return obj;
            }
            v.b(obj);
            W wB = AbstractC1617k.b((O) this.f61946b, C1608f0.c().d2(), null, new a(this.f61948d, this.f61947c, null), 2, null);
            this.f61947c.M();
            this.f61945a = 1;
            Object objM0 = wB.M0(this);
            return objM0 == objF ? objF : objM0;
        }
    }

    /* JADX INFO: renamed from: v4.e$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a */
        Object f61952a;

        /* JADX INFO: renamed from: b */
        Object f61953b;

        /* JADX INFO: renamed from: c */
        Object f61954c;

        /* JADX INFO: renamed from: d */
        Object f61955d;

        /* JADX INFO: renamed from: e */
        Object f61956e;

        /* JADX INFO: renamed from: f */
        /* synthetic */ Object f61957f;

        /* JADX INFO: renamed from: h */
        int f61959h;

        d(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f61957f = obj;
            this.f61959h |= Integer.MIN_VALUE;
            return C6846e.this.g(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: v4.e$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0931e extends l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f61960a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ h f61961b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C6846e f61962c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ H4.h f61963d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ InterfaceC6843b f61964e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ Bitmap f61965f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0931e(h hVar, C6846e c6846e, H4.h hVar2, InterfaceC6843b interfaceC6843b, Bitmap bitmap, Zd.e eVar) {
            super(2, eVar);
            this.f61961b = hVar;
            this.f61962c = c6846e;
            this.f61963d = hVar2;
            this.f61964e = interfaceC6843b;
            this.f61965f = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new C0931e(this.f61961b, this.f61962c, this.f61963d, this.f61964e, this.f61965f, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((C0931e) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f61960a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                return obj;
            }
            v.b(obj);
            B4.c cVar = new B4.c(this.f61961b, this.f61962c.f61940m, 0, this.f61961b, this.f61963d, this.f61964e, this.f61965f != null);
            h hVar = this.f61961b;
            this.f61960a = 1;
            Object objG = cVar.g(hVar, this);
            return objG == objF ? objF : objG;
        }
    }

    /* JADX INFO: renamed from: v4.e$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f extends Zd.a implements L {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C6846e f61966b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(L.b bVar, C6846e c6846e) {
            super(bVar);
            this.f61966b = c6846e;
        }

        @Override // Gf.L
        public void z(Zd.i iVar, Throwable th2) {
            this.f61966b.h();
        }
    }

    public C6846e(Context context, G4.c cVar, Lazy lazy, Lazy lazy2, Lazy lazy3, InterfaceC6843b.c cVar2, C6842a c6842a, o oVar, r rVar) {
        this.f61928a = context;
        this.f61929b = cVar;
        this.f61930c = lazy;
        this.f61931d = lazy2;
        this.f61932e = lazy3;
        this.f61933f = cVar2;
        this.f61934g = c6842a;
        this.f61935h = oVar;
        t tVar = new t(this, context, oVar.d());
        this.f61937j = tVar;
        p pVar = new p(this, tVar, null);
        this.f61938k = pVar;
        this.f61939l = c6842a.h().d(new D4.c(), u.class).d(new g(), String.class).d(new D4.b(), Uri.class).d(new D4.f(), Uri.class).d(new D4.e(), Integer.class).d(new D4.a(), byte[].class).c(new C4.c(), Uri.class).c(new C4.a(oVar.a()), File.class).a(new k.b(lazy3, lazy2, oVar.e()), Uri.class).a(new j.a(), File.class).a(new a.C0003a(), Uri.class).a(new e.a(), Uri.class).a(new l.b(), Uri.class).a(new f.a(), Drawable.class).a(new b.a(), Bitmap.class).a(new c.a(), ByteBuffer.class).e(new d.c(oVar.c(), oVar.b())).f();
        this.f61940m = AbstractC2279u.J0(getComponents().c(), new B4.a(this, pVar, null));
        this.f61941n = new AtomicBoolean(false);
        tVar.c();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:114|116|(2:118|(1:120)(1:121))(0)|122|(1:(4:(1:(7:127|225|128|190|(1:192)(2:193|(1:195))|196|197)(2:132|133))(13:134|219|135|136|137|223|183|184|215|185|186|(5:189|190|(0)(0)|196|197)|188)|227|204|(3:206|207|208)(2:211|212))(4:140|217|141|155))(4:146|226|147|(2:149|(3:151|(2:154|155)|188)(1:158))(2:202|203))|221|159|(11:161|(1:163)(1:166)|(1:168)|(1:171)(1:172)|173|(1:175)|176|(1:178)|179|(9:182|137|223|183|184|215|185|186|(0))|188)|169|(0)(0)|173|(0)|176|(0)|179|(0)|188|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0106, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0107, code lost:
    
        r6 = r2;
        r4 = r5;
        r5 = r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0116 A[Catch: all -> 0x0106, TryCatch #3 {all -> 0x0106, blocks: (B:159:0x00f5, B:161:0x00fb, B:163:0x0101, B:168:0x010e, B:171:0x0116, B:173:0x0128, B:175:0x012e, B:176:0x0131, B:178:0x013a, B:179:0x013d, B:172:0x0124), top: B:221:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0124 A[Catch: all -> 0x0106, TryCatch #3 {all -> 0x0106, blocks: (B:159:0x00f5, B:161:0x00fb, B:163:0x0101, B:168:0x010e, B:171:0x0116, B:173:0x0128, B:175:0x012e, B:176:0x0131, B:178:0x013a, B:179:0x013d, B:172:0x0124), top: B:221:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x012e A[Catch: all -> 0x0106, TryCatch #3 {all -> 0x0106, blocks: (B:159:0x00f5, B:161:0x00fb, B:163:0x0101, B:168:0x010e, B:171:0x0116, B:173:0x0128, B:175:0x012e, B:176:0x0131, B:178:0x013a, B:179:0x013d, B:172:0x0124), top: B:221:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x013a A[Catch: all -> 0x0106, TryCatch #3 {all -> 0x0106, blocks: (B:159:0x00f5, B:161:0x00fb, B:163:0x0101, B:168:0x010e, B:171:0x0116, B:173:0x0128, B:175:0x012e, B:176:0x0131, B:178:0x013a, B:179:0x013d, B:172:0x0124), top: B:221:0x00f5 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x018d A[Catch: all -> 0x004b, TryCatch #5 {all -> 0x004b, blocks: (B:128:0x0046, B:190:0x0187, B:192:0x018d, B:193:0x0198, B:195:0x019c), top: B:225:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0198 A[Catch: all -> 0x004b, TryCatch #5 {all -> 0x004b, blocks: (B:128:0x0046, B:190:0x0187, B:192:0x018d, B:193:0x0198, B:195:0x019c), top: B:225:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01be A[Catch: all -> 0x01cf, TRY_LEAVE, TryCatch #7 {all -> 0x01cf, blocks: (B:204:0x01ba, B:206:0x01be, B:211:0x01d1, B:212:0x01d4), top: B:227:0x01ba }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x01d1 A[Catch: all -> 0x01cf, TRY_ENTER, TryCatch #7 {all -> 0x01cf, blocks: (B:204:0x01ba, B:206:0x01be, B:211:0x01d1, B:212:0x01d4), top: B:227:0x01ba }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(G4.h r20, int r21, Zd.e r22) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.C6846e.g(G4.h, int, Zd.e):java.lang.Object");
    }

    private final void i(h hVar, InterfaceC6843b interfaceC6843b) {
        interfaceC6843b.d(hVar);
        h.b bVarA = hVar.A();
        if (bVarA != null) {
            bVarA.d(hVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void j(G4.f r4, I4.a r5, v4.InterfaceC6843b r6) {
        /*
            r3 = this;
            G4.h r0 = r4.b()
            boolean r1 = r5 instanceof K4.d
            if (r1 != 0) goto Lb
            if (r5 == 0) goto L37
            goto L1e
        Lb:
            G4.h r1 = r4.b()
            K4.c$a r1 = r1.P()
            r2 = r5
            K4.d r2 = (K4.d) r2
            K4.c r1 = r1.a(r2, r4)
            boolean r2 = r1 instanceof K4.b
            if (r2 == 0) goto L26
        L1e:
            android.graphics.drawable.Drawable r1 = r4.a()
            r5.d(r1)
            goto L37
        L26:
            G4.h r5 = r4.b()
            r6.o(r5, r1)
            r1.a()
            G4.h r5 = r4.b()
            r6.p(r5, r1)
        L37:
            r6.a(r0, r4)
            G4.h$b r5 = r0.A()
            if (r5 == 0) goto L43
            r5.a(r0, r4)
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.C6846e.j(G4.f, I4.a, v4.b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void k(G4.q r4, I4.a r5, v4.InterfaceC6843b r6) {
        /*
            r3 = this;
            G4.h r0 = r4.b()
            r4.c()
            boolean r1 = r5 instanceof K4.d
            if (r1 != 0) goto Le
            if (r5 == 0) goto L3a
            goto L21
        Le:
            G4.h r1 = r4.b()
            K4.c$a r1 = r1.P()
            r2 = r5
            K4.d r2 = (K4.d) r2
            K4.c r1 = r1.a(r2, r4)
            boolean r2 = r1 instanceof K4.b
            if (r2 == 0) goto L29
        L21:
            android.graphics.drawable.Drawable r1 = r4.a()
            r5.a(r1)
            goto L3a
        L29:
            G4.h r5 = r4.b()
            r6.o(r5, r1)
            r1.a()
            G4.h r5 = r4.b()
            r6.p(r5, r1)
        L3a:
            r6.b(r0, r4)
            G4.h$b r5 = r0.A()
            if (r5 == 0) goto L46
            r5.b(r0, r4)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.C6846e.k(G4.q, I4.a, v4.b):void");
    }

    @Override // v4.InterfaceC6845d
    public G4.c a() {
        return this.f61929b;
    }

    @Override // v4.InterfaceC6845d
    public G4.e b(h hVar) {
        W wB = AbstractC1617k.b(this.f61936i, null, null, new b(hVar, null), 3, null);
        hVar.M();
        return new G4.l(wB);
    }

    @Override // v4.InterfaceC6845d
    public Object c(h hVar, Zd.e eVar) {
        return P.e(new c(hVar, this, null), eVar);
    }

    @Override // v4.InterfaceC6845d
    public E4.c d() {
        return (E4.c) this.f61930c.getValue();
    }

    @Override // v4.InterfaceC6845d
    public C6842a getComponents() {
        return this.f61939l;
    }

    public final r h() {
        return null;
    }

    public final void l(int i10) {
        E4.c cVar;
        Lazy lazy = this.f61930c;
        if (lazy == null || (cVar = (E4.c) lazy.getValue()) == null) {
            return;
        }
        cVar.a(i10);
    }
}
