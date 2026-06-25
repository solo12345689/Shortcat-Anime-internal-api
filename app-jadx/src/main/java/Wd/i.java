package wd;

import Gf.C1608f0;
import Gf.O;
import Gf.P;
import Gf.X0;
import Jf.A;
import Jf.AbstractC1744g;
import Jf.InterfaceC1742e;
import Td.L;
import Ud.AbstractC2279u;
import ae.AbstractC2605b;
import android.content.Context;
import be.AbstractC3048a;
import expo.modules.updates.db.UpdatesDatabase;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;
import rd.C6306a;
import sd.EnumC6452b;
import wd.g;
import wd.w;
import xd.C7136g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c f63009r = new c(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f63010s = i.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f63011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final expo.modules.updates.d f63012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C7136g f63013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final UpdatesDatabase f63014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final File f63015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wd.j f63016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private O f63017g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private v f63018h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private rd.d f63019i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f63020j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List f63021k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private List f63022l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f63023m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Jf.t f63024n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Map f63025o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Function1 f63026p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final InterfaceC1742e f63027q;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C6306a f63028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f63029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f63030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f63031d;

        public a(C6306a asset, int i10, int i11, int i12) {
            AbstractC5504s.h(asset, "asset");
            this.f63028a = asset;
            this.f63029b = i10;
            this.f63030c = i11;
            this.f63031d = i12;
        }

        public final C6306a a() {
            return this.f63028a;
        }

        public final int b() {
            return this.f63030c;
        }

        public final int c() {
            return this.f63029b;
        }

        public final int d() {
            return this.f63031d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC5504s.c(this.f63028a, aVar.f63028a) && this.f63029b == aVar.f63029b && this.f63030c == aVar.f63030c && this.f63031d == aVar.f63031d;
        }

        public int hashCode() {
            return (((((this.f63028a.hashCode() * 31) + Integer.hashCode(this.f63029b)) * 31) + Integer.hashCode(this.f63030c)) * 31) + Integer.hashCode(this.f63031d);
        }

        public String toString() {
            return "AssetLoadProgress(asset=" + this.f63028a + ", successfulAssetCount=" + this.f63029b + ", failedAssetCount=" + this.f63030c + ", totalAssetCount=" + this.f63031d + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f63032a = new b("FINISHED", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f63033b = new b("ALREADY_EXISTS", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f63034c = new b("ERRORED", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f63035d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f63036e;

        static {
            b[] bVarArrA = a();
            f63035d = bVarArrA;
            f63036e = AbstractC3048a.a(bVarArrA);
        }

        private b(String str, int i10) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f63032a, f63033b, f63034c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f63035d.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final rd.d f63037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u f63038b;

        public d(rd.d dVar, u uVar) {
            this.f63037a = dVar;
            this.f63038b = uVar;
        }

        public final u a() {
            return this.f63038b;
        }

        public final rd.d b() {
            return this.f63037a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC5504s.c(this.f63037a, dVar.f63037a) && AbstractC5504s.c(this.f63038b, dVar.f63038b);
        }

        public int hashCode() {
            rd.d dVar = this.f63037a;
            int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
            u uVar = this.f63038b;
            return iHashCode + (uVar != null ? uVar.hashCode() : 0);
        }

        public String toString() {
            return "LoaderResult(updateEntity=" + this.f63037a + ", updateDirective=" + this.f63038b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f63039a;

        public e(boolean z10) {
            this.f63039a = z10;
        }

        public final boolean a() {
            return this.f63039a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f63039a == ((e) obj).f63039a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f63039a);
        }

        public String toString() {
            return "OnUpdateResponseLoadedResult(shouldDownloadManifestIfPresentInResponse=" + this.f63039a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f63040a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f63032a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f63033b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.f63034c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f63040a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f63041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f63042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f63043c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f63044d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f63045e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f63047g;

        g(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f63045e = obj;
            this.f63047g |= Integer.MIN_VALUE;
            return i.this.f(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f63048a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ N f63050c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ yd.q f63051d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ yd.q f63052e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(N n10, yd.q qVar, yd.q qVar2, Zd.e eVar) {
            super(2, eVar);
            this.f63050c = n10;
            this.f63051d = qVar;
            this.f63052e = qVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return i.this.new h(this.f63050c, this.f63051d, this.f63052e, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((h) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            h hVar;
            Object objF = AbstractC2605b.f();
            int i10 = this.f63048a;
            if (i10 == 0) {
                Td.v.b(obj);
                i iVar = i.this;
                C6306a c6306a = (C6306a) this.f63050c.f52259a;
                File file = iVar.f63015e;
                expo.modules.updates.d dVar = i.this.f63012b;
                rd.d dVarC = this.f63051d.c();
                yd.q qVar = this.f63052e;
                rd.d dVarC2 = qVar != null ? qVar.c() : null;
                this.f63048a = 1;
                hVar = this;
                obj = iVar.l(c6306a, file, dVar, dVarC, dVarC2, hVar);
                if (obj != objF) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
                return obj;
            }
            Td.v.b(obj);
            hVar = this;
            g.a aVar = (g.a) obj;
            i iVar2 = i.this;
            C6306a c6306aA = aVar.a();
            b bVar = aVar.b() ? b.f63032a : b.f63033b;
            hVar.f63048a = 2;
            Object objJ = iVar2.j(c6306aA, bVar, this);
            return objJ == objF ? objF : objJ;
        }
    }

    /* JADX INFO: renamed from: wd.i$i, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0949i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f63053a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f63054b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f63056d;

        C0949i(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f63054b = obj;
            this.f63056d |= Integer.MIN_VALUE;
            return i.this.j(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f63057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f63058b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f63060d;

        j(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f63058b = obj;
            this.f63060d |= Integer.MIN_VALUE;
            return i.this.k(null, this);
        }
    }

    protected i(Context context, expo.modules.updates.d configuration, C7136g logger, UpdatesDatabase database, File updatesDirectory, wd.j loaderFiles, O scope) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(configuration, "configuration");
        AbstractC5504s.h(logger, "logger");
        AbstractC5504s.h(database, "database");
        AbstractC5504s.h(updatesDirectory, "updatesDirectory");
        AbstractC5504s.h(loaderFiles, "loaderFiles");
        AbstractC5504s.h(scope, "scope");
        this.f63011a = context;
        this.f63012b = configuration;
        this.f63013c = logger;
        this.f63014d = database;
        this.f63015e = updatesDirectory;
        this.f63016f = loaderFiles;
        this.f63017g = scope;
        this.f63021k = new ArrayList();
        this.f63022l = new ArrayList();
        this.f63023m = new ArrayList();
        Jf.t tVarB = A.b(0, 0, null, 7, null);
        this.f63024n = tVarB;
        this.f63025o = new ConcurrentHashMap();
        this.f63027q = AbstractC1744g.a(tVarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0134, code lost:
    
        if (Gf.AbstractC1607f.a(r12, r10) == r6) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(yd.q r20, Zd.e r21) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.i.f(yd.q, Zd.e):java.lang.Object");
    }

    private final d g() {
        v vVar = this.f63018h;
        AbstractC5504s.e(vVar);
        yd.n nVarC = vVar.c();
        if (nVarC != null) {
            yd.k.f65039a.h(nVarC, this.f63014d, this.f63012b);
        }
        v vVar2 = this.f63018h;
        AbstractC5504s.e(vVar2);
        w.a aVarA = vVar2.a();
        d dVar = new d(this.f63019i, aVarA != null ? aVarA.a() : null);
        p();
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(rd.C6306a r8, wd.i.b r9, Zd.e r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof wd.i.C0949i
            if (r0 == 0) goto L13
            r0 = r10
            wd.i$i r0 = (wd.i.C0949i) r0
            int r1 = r0.f63056d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f63056d = r1
            goto L18
        L13:
            wd.i$i r0 = new wd.i$i
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f63054b
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f63056d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.f63053a
            wd.i$b r8 = (wd.i.b) r8
            Td.v.b(r10)
            return r8
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            Td.v.b(r10)
            int[] r10 = wd.i.f.f63040a
            int r2 = r9.ordinal()
            r10 = r10[r2]
            if (r10 == r3) goto L5a
            r2 = 2
            if (r10 == r2) goto L54
            r2 = 3
            if (r10 != r2) goto L4e
            java.util.List r10 = r7.f63021k
            r10.add(r8)
            goto L5f
        L4e:
            Td.r r8 = new Td.r
            r8.<init>()
            throw r8
        L54:
            java.util.List r10 = r7.f63022l
            r10.add(r8)
            goto L5f
        L5a:
            java.util.List r10 = r7.f63023m
            r10.add(r8)
        L5f:
            wd.i$b r10 = wd.i.b.f63032a
            if (r9 == r10) goto L67
            wd.i$b r10 = wd.i.b.f63033b
            if (r9 != r10) goto L75
        L67:
            java.util.Map r10 = r7.f63025o
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double r2 = kotlin.coroutines.jvm.internal.b.b(r4)
            r10.put(r8, r2)
            r7.n()
        L75:
            Jf.t r10 = r7.f63024n
            wd.i$a r2 = new wd.i$a
            java.util.List r4 = r7.f63023m
            int r4 = r4.size()
            java.util.List r5 = r7.f63022l
            int r5 = r5.size()
            int r4 = r4 + r5
            java.util.List r5 = r7.f63021k
            int r5 = r5.size()
            int r6 = r7.f63020j
            r2.<init>(r8, r4, r5, r6)
            r0.f63053a = r9
            r0.f63056d = r3
            java.lang.Object r8 = r10.emit(r2, r0)
            if (r8 != r1) goto L9c
            return r1
        L9c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.i.j(rd.a, wd.i$b, Zd.e):java.lang.Object");
    }

    private final void n() {
        if (this.f63020j > 0) {
            double dS0 = AbstractC2279u.S0(this.f63025o.values()) / ((double) this.f63020j);
            Function1 function1 = this.f63026p;
            if (function1 != null) {
                function1.invoke(Double.valueOf(dS0));
            }
        }
    }

    private final Object o(yd.q qVar, Zd.e eVar) {
        if (qVar.b()) {
            rd.d dVarC = qVar.c();
            qd.e eVarQ = this.f63014d.Q();
            AbstractC5504s.e(dVarC);
            eVarQ.g(dVarC);
            this.f63014d.Q().s(dVarC);
            this.f63019i = dVarC;
            return g();
        }
        rd.d dVarC2 = qVar.c();
        qd.e eVarQ2 = this.f63014d.Q();
        AbstractC5504s.e(dVarC2);
        rd.d dVarO = eVarQ2.o(dVarC2.d());
        if (dVarO != null && !AbstractC5504s.c(dVarO.l(), dVarC2.l())) {
            C7136g.q(this.f63013c, "Loaded an update with the same ID but a different scopeKey than one we already have on disk. This is a server error. Overwriting the scopeKey and loading the existing update.", null, 2, null);
            this.f63014d.Q().x(dVarO, dVarC2.l());
        }
        if (dVarO != null && dVarO.m() == EnumC6452b.f59348a) {
            this.f63019i = dVarO;
            return g();
        }
        if (dVarO == null) {
            this.f63019i = dVarC2;
            qd.e eVarQ3 = this.f63014d.Q();
            rd.d dVar = this.f63019i;
            AbstractC5504s.e(dVar);
            eVarQ3.g(dVar);
        } else {
            this.f63019i = dVarO;
        }
        return f(qVar, eVar);
    }

    private final void p() {
        this.f63018h = null;
        this.f63019i = null;
        this.f63020j = 0;
        this.f63021k = new ArrayList();
        this.f63022l = new ArrayList();
        this.f63023m = new ArrayList();
        this.f63025o = new ConcurrentHashMap();
        this.f63026p = null;
    }

    public final void e(C6306a asset, double d10) {
        AbstractC5504s.h(asset, "asset");
        this.f63025o.put(asset, Double.valueOf(d10));
        n();
    }

    protected final Context h() {
        return this.f63011a;
    }

    public final InterfaceC1742e i() {
        return this.f63027q;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(kotlin.jvm.functions.Function1 r6, Zd.e r7) throws java.lang.Exception {
        /*
            r5 = this;
            boolean r0 = r7 instanceof wd.i.j
            if (r0 == 0) goto L13
            r0 = r7
            wd.i$j r0 = (wd.i.j) r0
            int r1 = r0.f63060d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f63060d = r1
            goto L18
        L13:
            wd.i$j r0 = new wd.i$j
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f63058b
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f63060d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            Td.v.b(r7)     // Catch: java.lang.Exception -> L2c
            return r7
        L2c:
            r6 = move-exception
            goto L82
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            java.lang.Object r6 = r0.f63057a
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            Td.v.b(r7)     // Catch: java.lang.Exception -> L2c
            goto L50
        L3e:
            Td.v.b(r7)
            expo.modules.updates.db.UpdatesDatabase r7 = r5.f63014d     // Catch: java.lang.Exception -> L2c
            expo.modules.updates.d r2 = r5.f63012b     // Catch: java.lang.Exception -> L2c
            r0.f63057a = r6     // Catch: java.lang.Exception -> L2c
            r0.f63060d = r4     // Catch: java.lang.Exception -> L2c
            java.lang.Object r7 = r5.m(r7, r2, r0)     // Catch: java.lang.Exception -> L2c
            if (r7 != r1) goto L50
            goto L79
        L50:
            wd.v r7 = (wd.v) r7     // Catch: java.lang.Exception -> L2c
            r5.f63018h = r7     // Catch: java.lang.Exception -> L2c
            wd.w$b r2 = r7.b()     // Catch: java.lang.Exception -> L2c
            r4 = 0
            if (r2 == 0) goto L60
            yd.q r2 = r2.a()     // Catch: java.lang.Exception -> L2c
            goto L61
        L60:
            r2 = r4
        L61:
            java.lang.Object r6 = r6.invoke(r7)     // Catch: java.lang.Exception -> L2c
            wd.i$e r6 = (wd.i.e) r6     // Catch: java.lang.Exception -> L2c
            if (r2 == 0) goto L7b
            boolean r6 = r6.a()     // Catch: java.lang.Exception -> L2c
            if (r6 == 0) goto L7b
            r0.f63057a = r4     // Catch: java.lang.Exception -> L2c
            r0.f63060d = r3     // Catch: java.lang.Exception -> L2c
            java.lang.Object r6 = r5.o(r2, r0)     // Catch: java.lang.Exception -> L2c
            if (r6 != r1) goto L7a
        L79:
            return r1
        L7a:
            return r6
        L7b:
            r5.f63019i = r4     // Catch: java.lang.Exception -> L2c
            wd.i$d r6 = r5.g()     // Catch: java.lang.Exception -> L2c
            return r6
        L82:
            xd.g r7 = r5.f63013c
            java.lang.String r0 = "Load error"
            xd.b r1 = xd.EnumC7131b.f64346h
            r7.f(r0, r6, r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.i.k(kotlin.jvm.functions.Function1, Zd.e):java.lang.Object");
    }

    protected abstract Object l(C6306a c6306a, File file, expo.modules.updates.d dVar, rd.d dVar2, rd.d dVar3, Zd.e eVar);

    protected abstract Object m(UpdatesDatabase updatesDatabase, expo.modules.updates.d dVar, Zd.e eVar);

    public final void q(Function1 function1) {
        this.f63026p = function1;
    }

    public /* synthetic */ i(Context context, expo.modules.updates.d dVar, C7136g c7136g, UpdatesDatabase updatesDatabase, File file, wd.j jVar, O o10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, dVar, c7136g, updatesDatabase, file, jVar, (i10 & 64) != 0 ? P.a(X0.b(null, 1, null).w(C1608f0.b())) : o10);
    }
}
