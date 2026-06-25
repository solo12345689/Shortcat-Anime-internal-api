package wd;

import Gf.O;
import Jf.InterfaceC1742e;
import Jf.InterfaceC1743f;
import Td.L;
import ae.AbstractC2605b;
import android.content.Context;
import android.os.HandlerThread;
import be.AbstractC3048a;
import com.revenuecat.purchases.hybridcommon.ui.HybridPurchaseLogicBridge;
import java.io.File;
import java.util.Date;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import pd.C5998c;
import pd.C5999d;
import rd.C6306a;
import vd.InterfaceC6861b;
import wd.i;
import wd.u;
import wd.w;
import xd.C7136g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f63066r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f63067s = o.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f63068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final expo.modules.updates.d f63069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C5998c f63070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f63071d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final wd.g f63072e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Bd.h f63073f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C7136g f63074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b f63075h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final O f63076i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f63077j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f63078k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f63079l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f63080m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f63081n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final HandlerThread f63082o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private InterfaceC6861b f63083p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private InterfaceC6861b f63084q;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
        void a();

        void b(yd.q qVar);

        boolean c(rd.d dVar);

        void d();

        void e(c cVar);

        void f(e eVar, rd.d dVar, Exception exc);

        void g();

        void h(double d10);

        void i(InterfaceC6861b interfaceC6861b, boolean z10);

        void j(C6306a c6306a, int i10, int i11, int i12);

        void onFailure(Exception exc);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final EnumC0950c f63085a;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final d f63086b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d reason) {
                super(EnumC0950c.f63088a, null);
                AbstractC5504s.h(reason, "reason");
                this.f63086b = reason;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Date f63087b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Date commitTime) {
                super(EnumC0950c.f63090c, null);
                AbstractC5504s.h(commitTime, "commitTime");
                this.f63087b = commitTime;
            }

            public final Date a() {
                return this.f63087b;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: wd.o$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        private static final class EnumC0950c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final EnumC0950c f63088a = new EnumC0950c("NO_UPDATE_AVAILABLE", 0);

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final EnumC0950c f63089b = new EnumC0950c("UPDATE_AVAILABLE", 1);

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final EnumC0950c f63090c = new EnumC0950c("ROLL_BACK_TO_EMBEDDED", 2);

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ EnumC0950c[] f63091d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ EnumEntries f63092e;

            static {
                EnumC0950c[] enumC0950cArrA = a();
                f63091d = enumC0950cArrA;
                f63092e = AbstractC3048a.a(enumC0950cArrA);
            }

            private EnumC0950c(String str, int i10) {
            }

            private static final /* synthetic */ EnumC0950c[] a() {
                return new EnumC0950c[]{f63088a, f63089b, f63090c};
            }

            public static EnumC0950c valueOf(String str) {
                return (EnumC0950c) Enum.valueOf(EnumC0950c.class, str);
            }

            public static EnumC0950c[] values() {
                return (EnumC0950c[]) f63091d.clone();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class d extends c {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final JSONObject f63093b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(JSONObject manifest) {
                super(EnumC0950c.f63089b, null);
                AbstractC5504s.h(manifest, "manifest");
                this.f63093b = manifest;
            }

            public final JSONObject a() {
                return this.f63093b;
            }
        }

        public /* synthetic */ c(EnumC0950c enumC0950c, DefaultConstructorMarker defaultConstructorMarker) {
            this(enumC0950c);
        }

        private c(EnumC0950c enumC0950c) {
            this.f63085a = enumC0950c;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f63094b = new d("NO_UPDATE_AVAILABLE_ON_SERVER", 0, "noUpdateAvailableOnServer");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f63095c = new d("UPDATE_REJECTED_BY_SELECTION_POLICY", 1, "updateRejectedBySelectionPolicy");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f63096d = new d("UPDATE_PREVIOUSLY_FAILED", 2, "updatePreviouslyFailed");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f63097e = new d("ROLLBACK_REJECTED_BY_SELECTION_POLICY", 3, "rollbackRejectedBySelectionPolicy");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f63098f = new d("ROLLBACK_NO_EMBEDDED", 4, "rollbackNoEmbeddedConfiguration");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ d[] f63099g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f63100h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f63101a;

        static {
            d[] dVarArrA = a();
            f63099g = dVarArrA;
            f63100h = AbstractC3048a.a(dVarArrA);
        }

        private d(String str, int i10, String str2) {
            this.f63101a = str2;
        }

        private static final /* synthetic */ d[] a() {
            return new d[]{f63094b, f63095c, f63096d, f63097e, f63098f};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f63099g.clone();
        }

        public final String b() {
            return this.f63101a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f63102a = new e(HybridPurchaseLogicBridge.RESULT_ERROR, 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f63103b = new e("NO_UPDATE_AVAILABLE", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f63104c = new e("UPDATE_AVAILABLE", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ e[] f63105d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f63106e;

        static {
            e[] eVarArrA = a();
            f63105d = eVarArrA;
            f63106e = AbstractC3048a.a(eVarArrA);
        }

        private e(String str, int i10) {
        }

        private static final /* synthetic */ e[] a() {
            return new e[]{f63102a, f63103b, f63104c};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f63105d.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f63107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f63108b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f63109c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f63110d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f63112f;

        f(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f63110d = obj;
            this.f63112f |= Integer.MIN_VALUE;
            return o.this.k(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f63113a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f63115c;

        g(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f63113a = obj;
            this.f63115c |= Integer.MIN_VALUE;
            return o.this.m(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f63116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f63117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f63118c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f63119d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f63121f;

        h(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f63119d = obj;
            this.f63121f |= Integer.MIN_VALUE;
            return o.this.n(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class i extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f63122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f63123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ o f63124c;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class a implements InterfaceC1743f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f63125a;

            a(o oVar) {
                this.f63125a = oVar;
            }

            @Override // Jf.InterfaceC1743f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(i.a aVar, Zd.e eVar) {
                this.f63125a.f63075h.j(aVar.a(), aVar.c(), aVar.b(), aVar.d());
                return L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(s sVar, o oVar, Zd.e eVar) {
            super(2, eVar);
            this.f63123b = sVar;
            this.f63124c = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new i(this.f63123b, this.f63124c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((i) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f63122a;
            if (i10 == 0) {
                Td.v.b(obj);
                InterfaceC1742e interfaceC1742eI = this.f63123b.i();
                a aVar = new a(this.f63124c);
                this.f63122a = 1;
                if (interfaceC1742eI.collect(aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Td.v.b(obj);
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class j extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f63126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f63127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f63128c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f63130e;

        j(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f63128c = obj;
            this.f63130e |= Integer.MIN_VALUE;
            return o.this.s(this);
        }
    }

    public o(Context context, expo.modules.updates.d configuration, C5998c databaseHolder, File directory, wd.g fileDownloader, Bd.h selectionPolicy, C7136g logger, b callback, O scope) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(configuration, "configuration");
        AbstractC5504s.h(databaseHolder, "databaseHolder");
        AbstractC5504s.h(directory, "directory");
        AbstractC5504s.h(fileDownloader, "fileDownloader");
        AbstractC5504s.h(selectionPolicy, "selectionPolicy");
        AbstractC5504s.h(logger, "logger");
        AbstractC5504s.h(callback, "callback");
        AbstractC5504s.h(scope, "scope");
        this.f63068a = context;
        this.f63069b = configuration;
        this.f63070c = databaseHolder;
        this.f63071d = directory;
        this.f63072e = fileDownloader;
        this.f63073f = selectionPolicy;
        this.f63074g = logger;
        this.f63075h = callback;
        this.f63076i = scope;
        this.f63082o = new HandlerThread("expo-updates-timer");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0031 A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:3:0x0001, B:8:0x0008, B:11:0x0014, B:14:0x001e, B:22:0x003d, B:24:0x0041, B:26:0x0046, B:17:0x002d, B:19:0x0031, B:21:0x003a), top: B:31:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final synchronized void i(java.lang.Exception r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f63080m     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L7
            monitor-exit(r3)
            return
        L7:
            r0 = 1
            r3.f63080m = r0     // Catch: java.lang.Throwable -> L2b
            vd.b r0 = r3.f63083p     // Catch: java.lang.Throwable -> L2b
            r3.f63084q = r0     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r3.f63078k     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L2d
            if (r0 == 0) goto L2d
            kotlin.jvm.internal.AbstractC5504s.e(r0)     // Catch: java.lang.Throwable -> L2b
            rd.d r0 = r0.d()     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L1e
            goto L2d
        L1e:
            wd.o$b r0 = r3.f63075h     // Catch: java.lang.Throwable -> L2b
            vd.b r1 = r3.f63084q     // Catch: java.lang.Throwable -> L2b
            kotlin.jvm.internal.AbstractC5504s.e(r1)     // Catch: java.lang.Throwable -> L2b
            boolean r2 = r3.f63081n     // Catch: java.lang.Throwable -> L2b
            r0.i(r1, r2)     // Catch: java.lang.Throwable -> L2b
            goto L3d
        L2b:
            r4 = move-exception
            goto L51
        L2d:
            wd.o$b r0 = r3.f63075h     // Catch: java.lang.Throwable -> L2b
            if (r4 != 0) goto L39
            java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = "LoaderTask encountered an unexpected error and could not launch an update."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2b
            goto L3a
        L39:
            r1 = r4
        L3a:
            r0.onFailure(r1)     // Catch: java.lang.Throwable -> L2b
        L3d:
            boolean r0 = r3.f63079l     // Catch: java.lang.Throwable -> L2b
            if (r0 != 0) goto L44
            r3.u()     // Catch: java.lang.Throwable -> L2b
        L44:
            if (r4 == 0) goto L4f
            xd.g r0 = r3.f63074g     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = "Unexpected error encountered while loading this app"
            xd.b r2 = xd.EnumC7131b.f64350l     // Catch: java.lang.Throwable -> L2b
            r0.f(r1, r4, r2)     // Catch: java.lang.Throwable -> L2b
        L4f:
            monitor-exit(r3)
            return
        L51:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2b
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.o.i(java.lang.Exception):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0114, code lost:
    
        if (r4.i(r5, r2) != r3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0127, code lost:
    
        if (r5.i(r15, r2) == r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0134, code lost:
    
        if (r11.i(r0, r2) == r3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(Zd.e r23) {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.o.k(Zd.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i.e l(v vVar) {
        AbstractC5504s.h(vVar, "<unused var>");
        return new i.e(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(Zd.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof wd.o.g
            if (r0 == 0) goto L13
            r0 = r6
            wd.o$g r0 = (wd.o.g) r0
            int r1 = r0.f63115c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f63115c = r1
            goto L18
        L13:
            wd.o$g r0 = new wd.o$g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f63113a
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.f63115c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            Td.v.b(r6)     // Catch: java.lang.Exception -> L2a
            goto L40
        L2a:
            r6 = move-exception
            goto L58
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            Td.v.b(r6)
            r0.f63115c = r4     // Catch: java.lang.Exception -> L2a
            java.lang.Object r6 = r5.n(r0)     // Catch: java.lang.Exception -> L2a
            if (r6 != r1) goto L40
            return r1
        L40:
            monitor-enter(r5)     // Catch: java.lang.Exception -> L2a
            r5.f63078k = r4     // Catch: java.lang.Throwable -> L55
            Td.L r6 = Td.L.f17438a     // Catch: java.lang.Throwable -> L55
            monitor-exit(r5)     // Catch: java.lang.Exception -> L2a
            r6 = 0
            r5.i(r6)     // Catch: java.lang.Exception -> L2a
            r5.f63077j = r3     // Catch: java.lang.Exception -> L2a
            r5.r()     // Catch: java.lang.Exception -> L2a
            wd.o$b r6 = r5.f63075h     // Catch: java.lang.Exception -> L2a
            r6.g()     // Catch: java.lang.Exception -> L2a
            goto L65
        L55:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Exception -> L2a
            throw r6     // Catch: java.lang.Exception -> L2a
        L58:
            r5.i(r6)
            r5.f63077j = r3
            r5.r()
            wd.o$b r6 = r5.f63075h
            r6.g()
        L65:
            Td.L r6 = Td.L.f17438a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.o.m(Zd.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ec A[Catch: all -> 0x016e, TryCatch #3 {all -> 0x016e, blocks: (B:72:0x0155, B:79:0x0163, B:81:0x0166, B:86:0x0173, B:89:0x0180, B:90:0x0181, B:91:0x0182, B:92:0x0192, B:66:0x0115, B:68:0x0144, B:127:0x01e6, B:129:0x01ec, B:133:0x0207, B:132:0x01f7), top: B:136:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f7 A[Catch: all -> 0x016e, TryCatch #3 {all -> 0x016e, blocks: (B:72:0x0155, B:79:0x0163, B:81:0x0166, B:86:0x0173, B:89:0x0180, B:90:0x0181, B:91:0x0182, B:92:0x0192, B:66:0x0115, B:68:0x0144, B:127:0x01e6, B:129:0x01ec, B:133:0x0207, B:132:0x01f7), top: B:136:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0156 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0153  */
    /* JADX WARN: Type inference failed for: r0v44, types: [wd.o$b] */
    /* JADX WARN: Type inference failed for: r0v46, types: [wd.o$b] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v27, types: [java.lang.Exception, java.lang.Object, java.util.concurrent.CancellationException, rd.d] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [Gf.C0] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(Zd.e r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.o.n(Zd.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L o(o oVar, double d10) {
        oVar.f63075h.h(d10);
        return L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i.e p(o oVar, v updateResponse) {
        AbstractC5504s.h(updateResponse, "updateResponse");
        w.a aVarA = updateResponse.a();
        u uVarA = aVarA != null ? aVarA.a() : null;
        if (uVarA != null) {
            if (uVarA instanceof u.c) {
                oVar.f63081n = true;
                oVar.f63075h.e(new c.b(((u.c) uVarA).b()));
                return new i.e(false);
            }
            if (!(uVarA instanceof u.b)) {
                throw new Td.r();
            }
            oVar.f63081n = true;
            oVar.f63075h.e(new c.a(d.f63094b));
            return new i.e(false);
        }
        w.b bVarB = updateResponse.b();
        yd.q qVarA = bVarB != null ? bVarB.a() : null;
        if (qVarA == null) {
            oVar.f63081n = true;
            oVar.f63075h.e(new c.a(d.f63094b));
            return new i.e(false);
        }
        Bd.h hVar = oVar.f63073f;
        rd.d dVarC = qVarA.c();
        InterfaceC6861b interfaceC6861b = oVar.f63083p;
        rd.d dVarD = interfaceC6861b != null ? interfaceC6861b.d() : null;
        yd.n nVarC = updateResponse.c();
        if (!hVar.c(dVarC, dVarD, nVarC != null ? nVarC.d() : null)) {
            oVar.f63081n = true;
            oVar.f63075h.e(new c.a(d.f63095c));
            return new i.e(false);
        }
        oVar.f63081n = false;
        oVar.f63075h.b(qVarA);
        oVar.f63075h.e(new c.d(qVarA.d().i()));
        oVar.f63075h.d();
        return new i.e(true);
    }

    private final synchronized void q() {
        if (this.f63078k && this.f63079l) {
            i(null);
        }
    }

    private final void r() {
        synchronized (this) {
            try {
                InterfaceC6861b interfaceC6861b = this.f63084q;
                rd.d dVarD = interfaceC6861b != null ? interfaceC6861b.d() : null;
                if (dVarD != null) {
                    C5999d.a(this.f63069b, this.f63070c.c(), this.f63071d, dVarD, this.f63073f);
                }
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(o oVar) {
        oVar.v();
    }

    private final synchronized void u() {
        this.f63079l = true;
        this.f63082o.quitSafely();
    }

    private final synchronized void v() {
        try {
            if (!this.f63079l) {
                this.f63079l = true;
                q();
            }
            u();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean j() {
        return this.f63077j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v0, types: [wd.o] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(Zd.e r13) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: wd.o.s(Zd.e):java.lang.Object");
    }
}
