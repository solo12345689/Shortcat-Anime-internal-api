package Y;

import Gf.AbstractC1613i;
import Gf.AbstractC1630q0;
import Gf.C0;
import Gf.C1627p;
import Gf.InterfaceC1623n;
import Jf.AbstractC1744g;
import Td.AbstractC2156g;
import Td.u;
import Ud.AbstractC2279u;
import a0.C2506b;
import a0.C2507c;
import ae.AbstractC2605b;
import b0.AbstractC2964a;
import be.AbstractC3048a;
import i0.AbstractC4993l;
import i0.AbstractC4994m;
import i0.C4985d;
import ie.InterfaceC5082a;
import ie.InterfaceC5096o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import k0.InterfaceC5428r;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t.C6546L;
import t.C6550P;

/* JADX INFO: renamed from: Y.o1 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2433o1 extends AbstractC2460y {

    /* JADX INFO: renamed from: C */
    public static final a f22396C = new a(null);

    /* JADX INFO: renamed from: D */
    public static final int f22397D = 8;

    /* JADX INFO: renamed from: E */
    private static final Jf.u f22398E = Jf.K.a(AbstractC2964a.c());

    /* JADX INFO: renamed from: F */
    private static final AtomicReference f22399F = new AtomicReference(Boolean.FALSE);

    /* JADX INFO: renamed from: A */
    private C6546L f22400A;

    /* JADX INFO: renamed from: B */
    private final c f22401B;

    /* JADX INFO: renamed from: a */
    private long f22402a;

    /* JADX INFO: renamed from: b */
    private final C2401e f22403b;

    /* JADX INFO: renamed from: c */
    private final Object f22404c;

    /* JADX INFO: renamed from: d */
    private Gf.C0 f22405d;

    /* JADX INFO: renamed from: e */
    private Throwable f22406e;

    /* JADX INFO: renamed from: f */
    private final List f22407f;

    /* JADX INFO: renamed from: g */
    private List f22408g;

    /* JADX INFO: renamed from: h */
    private t.Q f22409h;

    /* JADX INFO: renamed from: i */
    private final C2507c f22410i;

    /* JADX INFO: renamed from: j */
    private final List f22411j;

    /* JADX INFO: renamed from: k */
    private final List f22412k;

    /* JADX INFO: renamed from: l */
    private final C6550P f22413l;

    /* JADX INFO: renamed from: m */
    private final E0 f22414m;

    /* JADX INFO: renamed from: n */
    private final C6550P f22415n;

    /* JADX INFO: renamed from: o */
    private final C6550P f22416o;

    /* JADX INFO: renamed from: p */
    private List f22417p;

    /* JADX INFO: renamed from: q */
    private Set f22418q;

    /* JADX INFO: renamed from: r */
    private InterfaceC1623n f22419r;

    /* JADX INFO: renamed from: s */
    private int f22420s;

    /* JADX INFO: renamed from: t */
    private boolean f22421t;

    /* JADX INFO: renamed from: u */
    private b f22422u;

    /* JADX INFO: renamed from: v */
    private boolean f22423v;

    /* JADX INFO: renamed from: w */
    private final Jf.u f22424w;

    /* JADX INFO: renamed from: x */
    private final g0.r f22425x;

    /* JADX INFO: renamed from: y */
    private final Gf.A f22426y;

    /* JADX INFO: renamed from: z */
    private final Zd.i f22427z;

    /* JADX INFO: renamed from: Y.o1$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void c(c cVar) {
            b0.g gVar;
            b0.g gVarAdd;
            do {
                gVar = (b0.g) C2433o1.f22398E.getValue();
                gVarAdd = gVar.add((Object) cVar);
                if (gVar == gVarAdd) {
                    return;
                }
            } while (!C2433o1.f22398E.f(gVar, gVarAdd));
        }

        public final void d(c cVar) {
            b0.g gVar;
            b0.g gVarRemove;
            do {
                gVar = (b0.g) C2433o1.f22398E.getValue();
                gVarRemove = gVar.remove((Object) cVar);
                if (gVar == gVarRemove) {
                    return;
                }
            } while (!C2433o1.f22398E.f(gVar, gVarRemove));
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: Y.o1$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a */
        private final boolean f22428a;

        /* JADX INFO: renamed from: b */
        private final Throwable f22429b;

        public b(boolean z10, Throwable th2) {
            this.f22428a = z10;
            this.f22429b = th2;
        }

        public Throwable a() {
            return this.f22429b;
        }
    }

    /* JADX INFO: renamed from: Y.o1$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class c {
        public c() {
        }
    }

    /* JADX INFO: renamed from: Y.o1$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends Enum {

        /* JADX INFO: renamed from: a */
        public static final d f22431a = new d("ShutDown", 0);

        /* JADX INFO: renamed from: b */
        public static final d f22432b = new d("ShuttingDown", 1);

        /* JADX INFO: renamed from: c */
        public static final d f22433c = new d("Inactive", 2);

        /* JADX INFO: renamed from: d */
        public static final d f22434d = new d("InactivePendingWork", 3);

        /* JADX INFO: renamed from: e */
        public static final d f22435e = new d("Idle", 4);

        /* JADX INFO: renamed from: f */
        public static final d f22436f = new d("PendingWork", 5);

        /* JADX INFO: renamed from: g */
        private static final /* synthetic */ d[] f22437g;

        /* JADX INFO: renamed from: h */
        private static final /* synthetic */ EnumEntries f22438h;

        static {
            d[] dVarArrA = a();
            f22437g = dVarArrA;
            f22438h = AbstractC3048a.a(dVarArrA);
        }

        private d(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ d[] a() {
            return new d[]{f22431a, f22432b, f22433c, f22434d, f22435e, f22436f};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f22437g.clone();
        }
    }

    /* JADX INFO: renamed from: Y.o1$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        int f22439a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f22440b;

        e(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a */
        public final Object invoke(d dVar, Zd.e eVar) {
            return ((e) create(dVar, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            e eVar2 = new e(eVar);
            eVar2.f22440b = obj;
            return eVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f22439a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Td.v.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(((d) this.f22440b) == d.f22431a);
        }
    }

    /* JADX INFO: renamed from: Y.o1$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        Object f22441a;

        /* JADX INFO: renamed from: b */
        int f22442b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ Object f22443c;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ InterfaceC5096o f22445e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ InterfaceC2446t0 f22446f;

        /* JADX INFO: renamed from: Y.o1$f$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a */
            int f22447a;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ Object f22448b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ InterfaceC5096o f22449c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ InterfaceC2446t0 f22450d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC5096o interfaceC5096o, InterfaceC2446t0 interfaceC2446t0, Zd.e eVar) {
                super(2, eVar);
                this.f22449c = interfaceC5096o;
                this.f22450d = interfaceC2446t0;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                a aVar = new a(this.f22449c, this.f22450d, eVar);
                aVar.f22448b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Gf.O o10, Zd.e eVar) {
                return ((a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objF = AbstractC2605b.f();
                int i10 = this.f22447a;
                if (i10 == 0) {
                    Td.v.b(obj);
                    Gf.O o10 = (Gf.O) this.f22448b;
                    InterfaceC5096o interfaceC5096o = this.f22449c;
                    InterfaceC2446t0 interfaceC2446t0 = this.f22450d;
                    this.f22447a = 1;
                    if (interfaceC5096o.invoke(o10, interfaceC2446t0, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Td.v.b(obj);
                }
                return Td.L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(InterfaceC5096o interfaceC5096o, InterfaceC2446t0 interfaceC2446t0, Zd.e eVar) {
            super(2, eVar);
            this.f22445e = interfaceC5096o;
            this.f22446f = interfaceC2446t0;
        }

        /* JADX WARN: Removed duplicated region for block: B:90:0x007a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final Td.L i(Y.C2433o1 r17, java.util.Set r18, i0.AbstractC4993l r19) {
            /*
                r0 = r18
                java.lang.Object r1 = Y.C2433o1.O(r17)
                monitor-enter(r1)
                Jf.u r2 = Y.C2433o1.Q(r17)     // Catch: java.lang.Throwable -> L6f
                java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L6f
                Y.o1$d r2 = (Y.C2433o1.d) r2     // Catch: java.lang.Throwable -> L6f
                Y.o1$d r3 = Y.C2433o1.d.f22435e     // Catch: java.lang.Throwable -> L6f
                int r2 = r2.compareTo(r3)     // Catch: java.lang.Throwable -> L6f
                if (r2 < 0) goto Laa
                t.Q r2 = Y.C2433o1.N(r17)     // Catch: java.lang.Throwable -> L6f
                boolean r3 = r0 instanceof a0.e     // Catch: java.lang.Throwable -> L6f
                r4 = 1
                if (r3 == 0) goto L7f
                a0.e r0 = (a0.e) r0     // Catch: java.lang.Throwable -> L6f
                t.e0 r0 = r0.b()     // Catch: java.lang.Throwable -> L6f
                java.lang.Object[] r3 = r0.f60055b     // Catch: java.lang.Throwable -> L6f
                long[] r0 = r0.f60054a     // Catch: java.lang.Throwable -> L6f
                int r5 = r0.length     // Catch: java.lang.Throwable -> L6f
                int r5 = r5 + (-2)
                if (r5 < 0) goto La5
                r6 = 0
                r7 = r6
            L33:
                r8 = r0[r7]     // Catch: java.lang.Throwable -> L6f
                long r10 = ~r8     // Catch: java.lang.Throwable -> L6f
                r12 = 7
                long r10 = r10 << r12
                long r10 = r10 & r8
                r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r10 = r10 & r12
                int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r10 == 0) goto L7a
                int r10 = r7 - r5
                int r10 = ~r10     // Catch: java.lang.Throwable -> L6f
                int r10 = r10 >>> 31
                r11 = 8
                int r10 = 8 - r10
                r12 = r6
            L4d:
                if (r12 >= r10) goto L78
                r13 = 255(0xff, double:1.26E-321)
                long r13 = r13 & r8
                r15 = 128(0x80, double:6.32E-322)
                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r13 >= 0) goto L74
                int r13 = r7 << 3
                int r13 = r13 + r12
                r13 = r3[r13]     // Catch: java.lang.Throwable -> L6f
                boolean r14 = r13 instanceof i0.AbstractC4977V     // Catch: java.lang.Throwable -> L6f
                if (r14 == 0) goto L71
                r14 = r13
                i0.V r14 = (i0.AbstractC4977V) r14     // Catch: java.lang.Throwable -> L6f
                int r15 = i0.AbstractC4989h.a(r4)     // Catch: java.lang.Throwable -> L6f
                boolean r14 = r14.q(r15)     // Catch: java.lang.Throwable -> L6f
                if (r14 != 0) goto L71
                goto L74
            L6f:
                r0 = move-exception
                goto Lbc
            L71:
                r2.h(r13)     // Catch: java.lang.Throwable -> L6f
            L74:
                long r8 = r8 >> r11
                int r12 = r12 + 1
                goto L4d
            L78:
                if (r10 != r11) goto La5
            L7a:
                if (r7 == r5) goto La5
                int r7 = r7 + 1
                goto L33
            L7f:
                java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L6f
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L6f
            L85:
                boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L6f
                if (r3 == 0) goto La5
                java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L6f
                boolean r5 = r3 instanceof i0.AbstractC4977V     // Catch: java.lang.Throwable -> L6f
                if (r5 == 0) goto La1
                r5 = r3
                i0.V r5 = (i0.AbstractC4977V) r5     // Catch: java.lang.Throwable -> L6f
                int r6 = i0.AbstractC4989h.a(r4)     // Catch: java.lang.Throwable -> L6f
                boolean r5 = r5.q(r6)     // Catch: java.lang.Throwable -> L6f
                if (r5 != 0) goto La1
                goto L85
            La1:
                r2.h(r3)     // Catch: java.lang.Throwable -> L6f
                goto L85
            La5:
                Gf.n r0 = Y.C2433o1.D(r17)     // Catch: java.lang.Throwable -> L6f
                goto Lab
            Laa:
                r0 = 0
            Lab:
                monitor-exit(r1)
                if (r0 == 0) goto Lb9
                Td.u$a r1 = Td.u.f17466b
                Td.L r1 = Td.L.f17438a
                java.lang.Object r1 = Td.u.b(r1)
                r0.resumeWith(r1)
            Lb9:
                Td.L r0 = Td.L.f17438a
                return r0
            Lbc:
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Y.C2433o1.f.i(Y.o1, java.util.Set, i0.l):Td.L");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            f fVar = C2433o1.this.new f(this.f22445e, this.f22446f, eVar);
            fVar.f22443c = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((f) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        /* JADX WARN: Removed duplicated region for block: B:105:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 218
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Y.C2433o1.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: Y.o1$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC5096o {

        /* JADX INFO: renamed from: a */
        Object f22451a;

        /* JADX INFO: renamed from: b */
        Object f22452b;

        /* JADX INFO: renamed from: c */
        Object f22453c;

        /* JADX INFO: renamed from: d */
        Object f22454d;

        /* JADX INFO: renamed from: e */
        Object f22455e;

        /* JADX INFO: renamed from: f */
        Object f22456f;

        /* JADX INFO: renamed from: g */
        Object f22457g;

        /* JADX INFO: renamed from: h */
        Object f22458h;

        /* JADX INFO: renamed from: i */
        int f22459i;

        /* JADX INFO: renamed from: j */
        /* synthetic */ Object f22460j;

        g(Zd.e eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:111:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:125:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x0077  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static final void k(Y.C2433o1 r22, java.util.List r23, java.util.List r24, java.util.List r25, t.Q r26, t.Q r27, t.Q r28, t.Q r29) {
            /*
                Method dump skipped, instruction units count: 269
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Y.C2433o1.g.k(Y.o1, java.util.List, java.util.List, java.util.List, t.Q, t.Q, t.Q, t.Q):void");
        }

        private static final void s(List list, C2433o1 c2433o1) {
            list.clear();
            synchronized (c2433o1.f22404c) {
                try {
                    List list2 = c2433o1.f22412k;
                    int size = list2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        list.add((C2461y0) list2.get(i10));
                    }
                    c2433o1.f22412k.clear();
                    Td.L l10 = Td.L.f17438a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:345:0x016b  */
        /* JADX WARN: Removed duplicated region for block: B:378:0x01e9  */
        /* JADX WARN: Type inference failed for: r13v0, types: [java.util.Collection, java.util.List] */
        /* JADX WARN: Type inference failed for: r25v0, types: [t.Q, t.e0] */
        /* JADX WARN: Type inference failed for: r3v19 */
        /* JADX WARN: Type inference failed for: r3v20, types: [int] */
        /* JADX WARN: Type inference failed for: r3v21 */
        /* JADX WARN: Type inference failed for: r3v22, types: [int] */
        /* JADX WARN: Type inference failed for: r3v26 */
        /* JADX WARN: Type inference failed for: r3v27 */
        /* JADX WARN: Type inference failed for: r4v15, types: [int] */
        /* JADX WARN: Type inference failed for: r4v22, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v23 */
        /* JADX WARN: Type inference failed for: r4v24 */
        /* JADX WARN: Type inference failed for: r8v0 */
        /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Collection, java.util.List] */
        /* JADX WARN: Type inference failed for: r8v4 */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final Td.L t(Y.C2433o1 r23, t.Q r24, t.Q r25, java.util.List r26, java.util.List r27, t.Q r28, java.util.List r29, t.Q r30, java.util.Set r31, long r32) {
            /*
                Method dump skipped, instruction units count: 897
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Y.C2433o1.g.t(Y.o1, t.Q, t.Q, java.util.List, java.util.List, t.Q, java.util.List, t.Q, java.util.Set, long):Td.L");
        }

        @Override // ie.InterfaceC5096o
        /* JADX INFO: renamed from: i */
        public final Object invoke(Gf.O o10, InterfaceC2446t0 interfaceC2446t0, Zd.e eVar) {
            g gVar = C2433o1.this.new g(eVar);
            gVar.f22460j = interfaceC2446t0;
            return gVar.invokeSuspend(Td.L.f17438a);
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0118  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0101 -> B:52:0x0109). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x010f -> B:40:0x00ac). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 283
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Y.C2433o1.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C2433o1(Zd.i iVar) {
        C2401e c2401e = new C2401e(new InterfaceC5082a() { // from class: Y.j1
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return C2433o1.f0(this.f22350a);
            }
        });
        this.f22403b = c2401e;
        this.f22404c = new Object();
        this.f22407f = new ArrayList();
        this.f22409h = new t.Q(0, 1, null);
        this.f22410i = new C2507c(new Q[16], 0);
        this.f22411j = new ArrayList();
        this.f22412k = new ArrayList();
        this.f22413l = C2506b.e(null, 1, null);
        this.f22414m = new E0();
        this.f22415n = t.d0.b();
        this.f22416o = C2506b.e(null, 1, null);
        this.f22424w = Jf.K.a(d.f22433c);
        this.f22425x = new g0.r();
        Gf.A a10 = Gf.F0.a((Gf.C0) iVar.l(Gf.C0.f7490K));
        a10.H(new Function1() { // from class: Y.k1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2433o1.k0(this.f22356a, (Throwable) obj);
            }
        });
        this.f22426y = a10;
        this.f22427z = iVar.w(c2401e).w(a10);
        this.f22401B = new c();
    }

    public final Q A0(final Q q10, final t.Q q11) {
        Set set;
        if (q10.q() || q10.e() || ((set = this.f22418q) != null && set.contains(q10))) {
            return null;
        }
        C4985d c4985dN = AbstractC4993l.f48495e.n(E0(q10), P0(q10, q11));
        try {
            AbstractC4993l abstractC4993lL = c4985dN.l();
            if (q11 != null) {
                try {
                    if (q11.e()) {
                        q10.f(new InterfaceC5082a() { // from class: Y.n1
                            @Override // ie.InterfaceC5082a
                            public final Object invoke() {
                                return C2433o1.B0(q11, q10);
                            }
                        });
                    }
                } catch (Throwable th2) {
                    c4985dN.s(abstractC4993lL);
                    throw th2;
                }
            }
            boolean zK = q10.k();
            c4985dN.s(abstractC4993lL);
            if (zK) {
                return q10;
            }
            return null;
        } finally {
            d0(c4985dN);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final Td.L B0(t.Q r13, Y.Q r14) {
        /*
            java.lang.Object[] r0 = r13.f60055b
            long[] r13 = r13.f60054a
            int r1 = r13.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L43
            r2 = 0
            r3 = r2
        Lb:
            r4 = r13[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L3e
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L25:
            if (r8 >= r6) goto L3c
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.32E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L38
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            r14.s(r9)
        L38:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L25
        L3c:
            if (r6 != r7) goto L43
        L3e:
            if (r3 == r1) goto L43
            int r3 = r3 + 1
            goto Lb
        L43:
            Td.L r13 = Td.L.f17438a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.C2433o1.B0(t.Q, Y.Q):Td.L");
    }

    private final void C0(Throwable th2, Q q10, boolean z10) throws Throwable {
        if (!((Boolean) f22399F.get()).booleanValue() || (th2 instanceof C2419k)) {
            synchronized (this.f22404c) {
                b bVar = this.f22422u;
                if (bVar != null) {
                    throw bVar.a();
                }
                this.f22422u = new b(false, th2);
                Td.L l10 = Td.L.f17438a;
            }
            throw th2;
        }
        synchronized (this.f22404c) {
            try {
                g0.y.a("Error was captured in composition while live edit was enabled.", th2);
                this.f22411j.clear();
                this.f22410i.i();
                this.f22409h = new t.Q(0, 1, null);
                this.f22412k.clear();
                C2506b.c(this.f22413l);
                this.f22415n.k();
                this.f22422u = new b(z10, th2);
                if (q10 != null) {
                    I0(q10);
                }
                i0();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    static /* synthetic */ void D0(C2433o1 c2433o1, Throwable th2, Q q10, boolean z10, int i10, Object obj) throws Throwable {
        if ((i10 & 2) != 0) {
            q10 = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        c2433o1.C0(th2, q10, z10);
    }

    private final Function1 E0(final Q q10) {
        return new Function1() { // from class: Y.i1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2433o1.F0(q10, obj);
            }
        };
    }

    public static final Td.L F0(Q q10, Object obj) {
        q10.a(obj);
        return Td.L.f17438a;
    }

    private final Object G0(InterfaceC5096o interfaceC5096o, Zd.e eVar) {
        Object objG = AbstractC1613i.g(this.f22403b, new f(interfaceC5096o, AbstractC2452v0.a(eVar.getContext()), null), eVar);
        return objG == AbstractC2605b.f() ? objG : Td.L.f17438a;
    }

    public final boolean H0() {
        boolean zQ0;
        AbstractC2279u.m();
        synchronized (this.f22404c) {
            if (this.f22409h.d()) {
                return q0();
            }
            List listV0 = v0();
            Set setA = a0.f.a(this.f22409h);
            this.f22409h = new t.Q(0, 1, null);
            try {
                int size = listV0.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((Q) listV0.get(i10)).o(setA);
                    if (((d) this.f22424w.getValue()).compareTo(d.f22432b) <= 0) {
                        break;
                    }
                }
                synchronized (this.f22404c) {
                    if (i0() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zQ0 = q0();
                }
                return zQ0;
            } catch (Throwable th2) {
                synchronized (this.f22404c) {
                    this.f22409h.i(setA);
                    throw th2;
                }
            }
        }
    }

    public final void I0(Q q10) {
        List arrayList = this.f22417p;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f22417p = arrayList;
        }
        if (!arrayList.contains(q10)) {
            arrayList.add(q10);
        }
        L0(q10);
    }

    private final void J0(Q q10) {
        C6546L c6546l = this.f22400A;
        if (c6546l != null) {
            Object[] objArr = c6546l.f60006a;
            int i10 = c6546l.f60007b;
            for (int i11 = 0; i11 < i10; i11++) {
                android.support.v4.media.session.b.a(objArr[i11]);
                if (q10 instanceof InterfaceC5428r) {
                    throw null;
                }
            }
        }
    }

    public final void K0(Gf.C0 c02) {
        synchronized (this.f22404c) {
            Throwable th2 = this.f22406e;
            if (th2 != null) {
                throw th2;
            }
            if (((d) this.f22424w.getValue()).compareTo(d.f22432b) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (this.f22405d != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            this.f22405d = c02;
            i0();
        }
    }

    private final void L0(Q q10) {
        if (this.f22407f.remove(q10)) {
            this.f22408g = null;
            O0(q10);
        }
    }

    private final void O0(Q q10) {
        C6546L c6546l = this.f22400A;
        if (c6546l != null) {
            Object[] objArr = c6546l.f60006a;
            int i10 = c6546l.f60007b;
            for (int i11 = 0; i11 < i10; i11++) {
                android.support.v4.media.session.b.a(objArr[i11]);
                if (q10 instanceof InterfaceC5428r) {
                    throw null;
                }
            }
        }
    }

    private final Function1 P0(final Q q10, final t.Q q11) {
        return new Function1() { // from class: Y.l1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C2433o1.Q0(q10, q11, obj);
            }
        };
    }

    public static final Td.L Q0(Q q10, t.Q q11, Object obj) {
        q10.s(obj);
        if (q11 != null) {
            q11.h(obj);
        }
        return Td.L.f17438a;
    }

    private final void c0(Q q10) {
        this.f22407f.add(q10);
        this.f22408g = null;
        J0(q10);
    }

    private final void d0(C4985d c4985d) {
        try {
            if (c4985d.C() instanceof AbstractC4994m.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            c4985d.d();
        }
    }

    public final Object e0(Zd.e eVar) {
        C1627p c1627p;
        if (r0()) {
            return Td.L.f17438a;
        }
        C1627p c1627p2 = new C1627p(AbstractC2605b.c(eVar), 1);
        c1627p2.C();
        synchronized (this.f22404c) {
            if (r0()) {
                c1627p = c1627p2;
            } else {
                this.f22419r = c1627p2;
                c1627p = null;
            }
        }
        if (c1627p != null) {
            u.a aVar = Td.u.f17466b;
            c1627p.resumeWith(Td.u.b(Td.L.f17438a));
        }
        Object objV = c1627p2.v();
        if (objV == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objV == AbstractC2605b.f() ? objV : Td.L.f17438a;
    }

    public static final Td.L f0(C2433o1 c2433o1) {
        InterfaceC1623n interfaceC1623nI0;
        synchronized (c2433o1.f22404c) {
            interfaceC1623nI0 = c2433o1.i0();
            if (((d) c2433o1.f22424w.getValue()).compareTo(d.f22432b) <= 0) {
                throw AbstractC1630q0.a("Recomposer shutdown; frame clock awaiter will never resume", c2433o1.f22406e);
            }
        }
        if (interfaceC1623nI0 != null) {
            u.a aVar = Td.u.f17466b;
            interfaceC1623nI0.resumeWith(Td.u.b(Td.L.f17438a));
        }
        return Td.L.f17438a;
    }

    private final void h0() {
        Iterator it = v0().iterator();
        while (it.hasNext()) {
            O0((Q) it.next());
        }
        this.f22407f.clear();
        this.f22408g = AbstractC2279u.m();
    }

    public final InterfaceC1623n i0() {
        d dVar;
        if (((d) this.f22424w.getValue()).compareTo(d.f22432b) <= 0) {
            h0();
            this.f22409h = new t.Q(0, 1, null);
            this.f22410i.i();
            this.f22411j.clear();
            this.f22412k.clear();
            this.f22417p = null;
            InterfaceC1623n interfaceC1623n = this.f22419r;
            if (interfaceC1623n != null) {
                InterfaceC1623n.a.a(interfaceC1623n, null, 1, null);
            }
            this.f22419r = null;
            this.f22422u = null;
            return null;
        }
        if (this.f22422u != null) {
            dVar = d.f22433c;
        } else if (this.f22405d == null) {
            this.f22409h = new t.Q(0, 1, null);
            this.f22410i.i();
            dVar = p0() ? d.f22434d : d.f22433c;
        } else {
            dVar = (this.f22410i.p() == 0 && !this.f22409h.e() && this.f22411j.isEmpty() && this.f22412k.isEmpty() && this.f22420s <= 0 && !p0() && !C2506b.j(this.f22413l)) ? d.f22435e : d.f22436f;
        }
        this.f22424w.setValue(dVar);
        if (dVar != d.f22436f) {
            return null;
        }
        InterfaceC1623n interfaceC1623n2 = this.f22419r;
        this.f22419r = null;
        return interfaceC1623n2;
    }

    public final void j0() {
        int i10;
        t.V vB;
        synchronized (this.f22404c) {
            try {
                if (C2506b.j(this.f22413l)) {
                    t.V vP = C2506b.p(this.f22413l);
                    C2506b.c(this.f22413l);
                    this.f22414m.b();
                    C2506b.c(this.f22416o);
                    C6546L c6546l = new C6546L(vP.d());
                    Object[] objArr = vP.f60006a;
                    int i11 = vP.f60007b;
                    for (int i12 = 0; i12 < i11; i12++) {
                        C2461y0 c2461y0 = (C2461y0) objArr[i12];
                        c6546l.k(Td.z.a(c2461y0, this.f22415n.e(c2461y0)));
                    }
                    this.f22415n.k();
                    vB = c6546l;
                } else {
                    vB = t.W.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object[] objArr2 = vB.f60006a;
        int i13 = vB.f60007b;
        for (i10 = 0; i10 < i13; i10++) {
            Pair pair = (Pair) objArr2[i10];
        }
    }

    public static final Td.L k0(final C2433o1 c2433o1, final Throwable th2) {
        InterfaceC1623n interfaceC1623n;
        InterfaceC1623n interfaceC1623n2;
        CancellationException cancellationExceptionA = AbstractC1630q0.a("Recomposer effect job completed", th2);
        synchronized (c2433o1.f22404c) {
            try {
                Gf.C0 c02 = c2433o1.f22405d;
                interfaceC1623n = null;
                if (c02 != null) {
                    c2433o1.f22424w.setValue(d.f22432b);
                    if (c2433o1.f22421t) {
                        interfaceC1623n2 = c2433o1.f22419r;
                        if (interfaceC1623n2 != null) {
                        }
                        c2433o1.f22419r = null;
                        c02.H(new Function1() { // from class: Y.m1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C2433o1.l0(this.f22375a, th2, (Throwable) obj);
                            }
                        });
                        interfaceC1623n = interfaceC1623n2;
                    } else {
                        c02.k(cancellationExceptionA);
                    }
                    interfaceC1623n2 = null;
                    c2433o1.f22419r = null;
                    c02.H(new Function1() { // from class: Y.m1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C2433o1.l0(this.f22375a, th2, (Throwable) obj);
                        }
                    });
                    interfaceC1623n = interfaceC1623n2;
                } else {
                    c2433o1.f22406e = cancellationExceptionA;
                    c2433o1.f22424w.setValue(d.f22431a);
                    Td.L l10 = Td.L.f17438a;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (interfaceC1623n != null) {
            u.a aVar = Td.u.f17466b;
            interfaceC1623n.resumeWith(Td.u.b(Td.L.f17438a));
        }
        return Td.L.f17438a;
    }

    public static final Td.L l0(C2433o1 c2433o1, Throwable th2, Throwable th3) {
        synchronized (c2433o1.f22404c) {
            if (th2 == null) {
                th2 = null;
            } else if (th3 != null) {
                try {
                    if (th3 instanceof CancellationException) {
                        th3 = null;
                    }
                    if (th3 != null) {
                        AbstractC2156g.a(th2, th3);
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            c2433o1.f22406e = th2;
            c2433o1.f22424w.setValue(d.f22431a);
        }
        return Td.L.f17438a;
    }

    public final boolean o0() {
        boolean zP0;
        synchronized (this.f22404c) {
            zP0 = p0();
        }
        return zP0;
    }

    private final boolean p0() {
        return !this.f22423v && this.f22403b.n();
    }

    private final boolean q0() {
        return this.f22410i.p() != 0 || p0() || C2506b.j(this.f22413l);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r0() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f22404c
            monitor-enter(r0)
            t.Q r1 = r2.f22409h     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r1.e()     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L1f
            a0.c r1 = r2.f22410i     // Catch: java.lang.Throwable -> L1d
            int r1 = r1.p()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L14
            goto L1f
        L14:
            boolean r1 = r2.p0()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1b
            goto L1f
        L1b:
            r1 = 0
            goto L20
        L1d:
            r1 = move-exception
            goto L22
        L1f:
            r1 = 1
        L20:
            monitor-exit(r0)
            return r1
        L22:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.C2433o1.r0():boolean");
    }

    public final boolean s0() {
        boolean z10;
        synchronized (this.f22404c) {
            z10 = this.f22421t;
        }
        if (!z10) {
            return true;
        }
        Iterator it = this.f22426y.g().iterator();
        while (it.hasNext()) {
            if (((Gf.C0) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    public final List u0() {
        List listV0;
        synchronized (this.f22404c) {
            listV0 = v0();
        }
        return listV0;
    }

    public final List v0() {
        List list = this.f22408g;
        if (list != null) {
            return list;
        }
        List list2 = this.f22407f;
        List listM = list2.isEmpty() ? AbstractC2279u.m() : new ArrayList(list2);
        this.f22408g = listM;
        return listM;
    }

    private final void x0(Q q10) {
        synchronized (this.f22404c) {
            List list = this.f22412k;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (AbstractC5504s.c(((C2461y0) list.get(i10)).b(), q10)) {
                    Td.L l10 = Td.L.f17438a;
                    ArrayList arrayList = new ArrayList();
                    y0(arrayList, this, q10);
                    while (!arrayList.isEmpty()) {
                        z0(arrayList, null);
                        y0(arrayList, this, q10);
                    }
                    return;
                }
            }
        }
    }

    private static final void y0(List list, C2433o1 c2433o1, Q q10) {
        list.clear();
        synchronized (c2433o1.f22404c) {
            try {
                Iterator it = c2433o1.f22412k.iterator();
                while (it.hasNext()) {
                    C2461y0 c2461y0 = (C2461y0) it.next();
                    if (AbstractC5504s.c(c2461y0.b(), q10)) {
                        list.add(c2461y0);
                        it.remove();
                    }
                }
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x0126, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x012b, code lost:
    
        if (r4 >= r3) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0137, code lost:
    
        if (((kotlin.Pair) r10.get(r4)).d() == null) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0139, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x013c, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x014a, code lost:
    
        if (r9 >= r4) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x014c, code lost:
    
        r11 = (kotlin.Pair) r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0156, code lost:
    
        if (r11.d() != null) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0158, code lost:
    
        r11 = (Y.C2461y0) r11.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0161, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0162, code lost:
    
        if (r11 == null) goto L244;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0164, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0167, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x016a, code lost:
    
        r4 = r16.f22404c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x016c, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x016d, code lost:
    
        Ud.AbstractC2279u.D(r16.f22412k, r3);
        r3 = Td.L.f17438a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0174, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0175, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0183, code lost:
    
        if (r9 >= r4) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0185, code lost:
    
        r11 = r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0190, code lost:
    
        if (((kotlin.Pair) r11).d() == null) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0192, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0195, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0198, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List z0(java.util.List r17, t.Q r18) {
        /*
            Method dump skipped, instruction units count: 449
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.C2433o1.z0(java.util.List, t.Q):java.util.List");
    }

    public final void M0() {
        InterfaceC1623n interfaceC1623nI0;
        synchronized (this.f22404c) {
            if (this.f22423v) {
                this.f22423v = false;
                interfaceC1623nI0 = i0();
            } else {
                interfaceC1623nI0 = null;
            }
        }
        if (interfaceC1623nI0 != null) {
            u.a aVar = Td.u.f17466b;
            interfaceC1623nI0.resumeWith(Td.u.b(Td.L.f17438a));
        }
    }

    public final Object N0(Zd.e eVar) {
        Object objG0 = G0(new g(null), eVar);
        return objG0 == AbstractC2605b.f() ? objG0 : Td.L.f17438a;
    }

    @Override // Y.AbstractC2460y
    public void a(Q q10, Function2 function2) throws Throwable {
        Throwable th2;
        boolean z10;
        C2433o1 c2433o1;
        boolean zQ = q10.q();
        synchronized (this.f22404c) {
            try {
                if (((d) this.f22424w.getValue()).compareTo(d.f22432b) > 0) {
                    try {
                        boolean zContains = v0().contains(q10);
                        z10 = !zContains;
                        if (!zContains) {
                            c0(q10);
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    z10 = true;
                }
                try {
                    AbstractC4993l.a aVar = AbstractC4993l.f48495e;
                    C4985d c4985dN = aVar.n(E0(q10), P0(q10, null));
                    try {
                        AbstractC4993l abstractC4993lL = c4985dN.l();
                        try {
                            q10.b(function2);
                            Td.L l10 = Td.L.f17438a;
                            c4985dN.s(abstractC4993lL);
                            d0(c4985dN);
                            if (!zQ) {
                                aVar.f();
                            }
                            try {
                                x0(q10);
                                try {
                                    q10.p();
                                    q10.c();
                                    if (zQ) {
                                        return;
                                    }
                                    aVar.f();
                                } catch (Throwable th4) {
                                    D0(this, th4, null, false, 6, null);
                                }
                            } catch (Throwable th5) {
                                C0(th5, q10, true);
                            }
                        } catch (Throwable th6) {
                            c2433o1 = this;
                            try {
                                c4985dN.s(abstractC4993lL);
                                throw th6;
                            } catch (Throwable th7) {
                                th = th7;
                                try {
                                    d0(c4985dN);
                                    throw th;
                                } catch (Throwable th8) {
                                    th = th8;
                                    C0(th, q10, true);
                                    if (z10) {
                                        synchronized (c2433o1.f22404c) {
                                            L0(q10);
                                            Td.L l11 = Td.L.f17438a;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        c2433o1 = this;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    c2433o1 = this;
                }
            } catch (Throwable th11) {
                th2 = th11;
            }
        }
    }

    @Override // Y.AbstractC2460y
    public t.e0 b(Q q10, C1 c12, Function2 function2) {
        try {
            C1 c1I = q10.i(c12);
            try {
                a(q10, function2);
                t.e0 e0VarA = (t.Q) this.f22425x.a();
                if (e0VarA == null) {
                    e0VarA = t.f0.a();
                }
                return e0VarA;
            } finally {
                q10.i(c1I);
            }
        } finally {
            this.f22425x.b(null);
        }
    }

    @Override // Y.AbstractC2460y
    public boolean d() {
        return ((Boolean) f22399F.get()).booleanValue();
    }

    @Override // Y.AbstractC2460y
    public boolean e() {
        return false;
    }

    @Override // Y.AbstractC2460y
    public boolean f() {
        return AbstractC2454w.B();
    }

    @Override // Y.AbstractC2460y
    public long g() {
        return 1000;
    }

    public final void g0() {
        synchronized (this.f22404c) {
            try {
                if (((d) this.f22424w.getValue()).compareTo(d.f22435e) >= 0) {
                    this.f22424w.setValue(d.f22432b);
                }
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C0.a.a(this.f22426y, null, 1, null);
    }

    @Override // Y.AbstractC2460y
    public InterfaceC2457x h() {
        return null;
    }

    @Override // Y.AbstractC2460y
    public Zd.i j() {
        return this.f22427z;
    }

    @Override // Y.AbstractC2460y
    public void l(C2461y0 c2461y0) {
        InterfaceC1623n interfaceC1623nI0;
        synchronized (this.f22404c) {
            this.f22412k.add(c2461y0);
            interfaceC1623nI0 = i0();
        }
        if (interfaceC1623nI0 != null) {
            u.a aVar = Td.u.f17466b;
            interfaceC1623nI0.resumeWith(Td.u.b(Td.L.f17438a));
        }
    }

    @Override // Y.AbstractC2460y
    public void m(Q q10) {
        InterfaceC1623n interfaceC1623nI0;
        synchronized (this.f22404c) {
            if (this.f22410i.l(q10)) {
                interfaceC1623nI0 = null;
            } else {
                this.f22410i.c(q10);
                interfaceC1623nI0 = i0();
            }
        }
        if (interfaceC1623nI0 != null) {
            u.a aVar = Td.u.f17466b;
            interfaceC1623nI0.resumeWith(Td.u.b(Td.L.f17438a));
        }
    }

    public final long m0() {
        return this.f22402a;
    }

    @Override // Y.AbstractC2460y
    public AbstractC2458x0 n(C2461y0 c2461y0) {
        AbstractC2458x0 abstractC2458x0;
        synchronized (this.f22404c) {
            abstractC2458x0 = (AbstractC2458x0) this.f22415n.u(c2461y0);
        }
        return abstractC2458x0;
    }

    public final Jf.I n0() {
        return this.f22424w;
    }

    @Override // Y.AbstractC2460y
    public t.e0 o(Q q10, C1 c12, t.e0 e0Var) {
        try {
            H0();
            q10.o(a0.f.a(e0Var));
            C1 c1I = q10.i(c12);
            try {
                Q qA0 = A0(q10, null);
                if (qA0 != null) {
                    x0(q10);
                    qA0.p();
                    qA0.c();
                }
                t.e0 e0VarA = (t.Q) this.f22425x.a();
                if (e0VarA == null) {
                    e0VarA = t.f0.a();
                }
                return e0VarA;
            } finally {
                q10.i(c1I);
            }
        } finally {
            this.f22425x.b(null);
        }
    }

    @Override // Y.AbstractC2460y
    public void r(C2406f1 c2406f1) {
        t.Q qB = (t.Q) this.f22425x.a();
        if (qB == null) {
            qB = t.f0.b();
            this.f22425x.b(qB);
        }
        qB.h(c2406f1);
    }

    @Override // Y.AbstractC2460y
    public void s(Q q10) {
        synchronized (this.f22404c) {
            try {
                Set linkedHashSet = this.f22418q;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f22418q = linkedHashSet;
                }
                linkedHashSet.add(q10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Object t0(Zd.e eVar) {
        Object objO = AbstractC1744g.o(n0(), new e(null), eVar);
        return objO == AbstractC2605b.f() ? objO : Td.L.f17438a;
    }

    @Override // Y.AbstractC2460y
    public void v(Q q10) {
        synchronized (this.f22404c) {
            L0(q10);
            this.f22410i.w(q10);
            this.f22411j.remove(q10);
            Td.L l10 = Td.L.f17438a;
        }
    }

    public final void w0() {
        synchronized (this.f22404c) {
            this.f22423v = true;
            Td.L l10 = Td.L.f17438a;
        }
    }

    @Override // Y.AbstractC2460y
    public void p(Set set) {
    }
}
