package androidx.compose.ui.platform;

import Gf.AbstractC1617k;
import Gf.C0;
import Jf.AbstractC1744g;
import Jf.E;
import Jf.InterfaceC1743f;
import Td.C2160k;
import Y.AbstractC2460y;
import Y.C2433o1;
import Y.InterfaceC2446t0;
import ae.AbstractC2605b;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import androidx.lifecycle.AbstractC2857k;
import androidx.lifecycle.InterfaceC2861o;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class K1 {

    /* JADX INFO: renamed from: a */
    private static final Map f27253a = new LinkedHashMap();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements InterfaceC2861o {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Gf.O f27256a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Y.P0 f27257b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C2433o1 f27258c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ kotlin.jvm.internal.N f27259d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ View f27260e;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f27261a;

            static {
                int[] iArr = new int[AbstractC2857k.a.values().length];
                try {
                    iArr[AbstractC2857k.a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AbstractC2857k.a.ON_START.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AbstractC2857k.a.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AbstractC2857k.a.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AbstractC2857k.a.ON_PAUSE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AbstractC2857k.a.ON_RESUME.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AbstractC2857k.a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f27261a = iArr;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.platform.K1$b$b */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0467b extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a */
            int f27262a;

            /* JADX INFO: renamed from: b */
            private /* synthetic */ Object f27263b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ kotlin.jvm.internal.N f27264c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ C2433o1 f27265d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ androidx.lifecycle.r f27266e;

            /* JADX INFO: renamed from: f */
            final /* synthetic */ b f27267f;

            /* JADX INFO: renamed from: g */
            final /* synthetic */ View f27268g;

            /* JADX INFO: renamed from: androidx.compose.ui.platform.K1$b$b$a */
            /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
            static final class a extends kotlin.coroutines.jvm.internal.l implements Function2 {

                /* JADX INFO: renamed from: a */
                int f27269a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ Jf.I f27270b;

                /* JADX INFO: renamed from: c */
                final /* synthetic */ C2682a1 f27271c;

                /* JADX INFO: renamed from: androidx.compose.ui.platform.K1$b$b$a$a */
                /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
                static final class C0468a implements InterfaceC1743f {

                    /* JADX INFO: renamed from: a */
                    final /* synthetic */ C2682a1 f27272a;

                    C0468a(C2682a1 c2682a1) {
                        this.f27272a = c2682a1;
                    }

                    public final Object a(float f10, Zd.e eVar) {
                        this.f27272a.a(f10);
                        return Td.L.f17438a;
                    }

                    @Override // Jf.InterfaceC1743f
                    public /* bridge */ /* synthetic */ Object emit(Object obj, Zd.e eVar) {
                        return a(((Number) obj).floatValue(), eVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(Jf.I i10, C2682a1 c2682a1, Zd.e eVar) {
                    super(2, eVar);
                    this.f27270b = i10;
                    this.f27271c = c2682a1;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Zd.e create(Object obj, Zd.e eVar) {
                    return new a(this.f27270b, this.f27271c, eVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Gf.O o10, Zd.e eVar) {
                    return ((a) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = AbstractC2605b.f();
                    int i10 = this.f27269a;
                    if (i10 == 0) {
                        Td.v.b(obj);
                        Jf.I i11 = this.f27270b;
                        C0468a c0468a = new C0468a(this.f27271c);
                        this.f27269a = 1;
                        if (i11.collect(c0468a, this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Td.v.b(obj);
                    }
                    throw new C2160k();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0467b(kotlin.jvm.internal.N n10, C2433o1 c2433o1, androidx.lifecycle.r rVar, b bVar, View view, Zd.e eVar) {
                super(2, eVar);
                this.f27264c = n10;
                this.f27265d = c2433o1;
                this.f27266e = rVar;
                this.f27267f = bVar;
                this.f27268g = view;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                C0467b c0467b = new C0467b(this.f27264c, this.f27265d, this.f27266e, this.f27267f, this.f27268g, eVar);
                c0467b.f27263b = obj;
                return c0467b;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Gf.O o10, Zd.e eVar) {
                return ((C0467b) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1 */
            /* JADX WARN: Type inference failed for: r1v12, types: [Gf.C0] */
            /* JADX WARN: Type inference failed for: r1v15 */
            /* JADX WARN: Type inference failed for: r1v16 */
            /* JADX WARN: Type inference failed for: r1v17 */
            /* JADX WARN: Type inference failed for: r1v2, types: [Gf.C0] */
            /* JADX WARN: Type inference failed for: r1v4 */
            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Throwable th2;
                ?? r12;
                Gf.C0 c0D;
                Object objF = AbstractC2605b.f();
                ?? r13 = this.f27262a;
                try {
                    if (r13 == 0) {
                        Td.v.b(obj);
                        Gf.O o10 = (Gf.O) this.f27263b;
                        try {
                            C2682a1 c2682a1 = (C2682a1) this.f27264c.f52259a;
                            if (c2682a1 != null) {
                                Jf.I iE = K1.e(this.f27268g.getContext().getApplicationContext());
                                c2682a1.a(((Number) iE.getValue()).floatValue());
                                c0D = AbstractC1617k.d(o10, null, null, new a(iE, c2682a1, null), 3, null);
                            } else {
                                c0D = null;
                            }
                            C2433o1 c2433o1 = this.f27265d;
                            this.f27263b = c0D;
                            this.f27262a = 1;
                            r13 = c0D;
                            if (c2433o1.N0(this) == objF) {
                                return objF;
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            r12 = 0;
                            if (r12 != 0) {
                                C0.a.a(r12, null, 1, null);
                            }
                            this.f27266e.getLifecycle().removeObserver(this.f27267f);
                            throw th2;
                        }
                    } else {
                        if (r13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Gf.C0 c02 = (Gf.C0) this.f27263b;
                        Td.v.b(obj);
                        r13 = c02;
                    }
                    if (r13 != 0) {
                        C0.a.a(r13, null, 1, null);
                    }
                    this.f27266e.getLifecycle().removeObserver(this.f27267f);
                    return Td.L.f17438a;
                } catch (Throwable th4) {
                    th2 = th4;
                    r12 = r13;
                }
            }
        }

        b(Gf.O o10, Y.P0 p02, C2433o1 c2433o1, kotlin.jvm.internal.N n10, View view) {
            this.f27256a = o10;
            this.f27257b = p02;
            this.f27258c = c2433o1;
            this.f27259d = n10;
            this.f27260e = view;
        }

        @Override // androidx.lifecycle.InterfaceC2861o
        public void g(androidx.lifecycle.r rVar, AbstractC2857k.a aVar) {
            switch (a.f27261a[aVar.ordinal()]) {
                case 1:
                    AbstractC1617k.d(this.f27256a, null, Gf.Q.f7532d, new C0467b(this.f27259d, this.f27258c, rVar, this, this.f27260e, null), 1, null);
                    return;
                case 2:
                    Y.P0 p02 = this.f27257b;
                    if (p02 != null) {
                        p02.c();
                    }
                    this.f27258c.M0();
                    return;
                case 3:
                    this.f27258c.w0();
                    return;
                case 4:
                    this.f27258c.g0();
                    return;
                case 5:
                case 6:
                case 7:
                    return;
                default:
                    throw new Td.r();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a */
        Object f27273a;

        /* JADX INFO: renamed from: b */
        int f27274b;

        /* JADX INFO: renamed from: c */
        private /* synthetic */ Object f27275c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ ContentResolver f27276d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Uri f27277e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ d f27278f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ If.g f27279g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ Context f27280h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ContentResolver contentResolver, Uri uri, d dVar, If.g gVar, Context context, Zd.e eVar) {
            super(2, eVar);
            this.f27276d = contentResolver;
            this.f27277e = uri;
            this.f27278f = dVar;
            this.f27279g = gVar;
            this.f27280h = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            c cVar = new c(this.f27276d, this.f27277e, this.f27278f, this.f27279g, this.f27280h, eVar);
            cVar.f27275c = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC1743f interfaceC1743f, Zd.e eVar) {
            return ((c) create(interfaceC1743f, eVar)).invokeSuspend(Td.L.f17438a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:58:0x007f, code lost:
        
            if (r4.emit(r9, r8) == r0) goto L59;
         */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0060 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {all -> 0x001b, blocks: (B:40:0x0016, B:51:0x0048, B:55:0x0058, B:57:0x0060, B:47:0x002d, B:50:0x0042), top: B:64:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0082  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x007f -> B:41:0x0019). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = ae.AbstractC2605b.f()
                int r1 = r8.f27274b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L31
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r8.f27273a
                If.i r1 = (If.i) r1
                java.lang.Object r4 = r8.f27275c
                Jf.f r4 = (Jf.InterfaceC1743f) r4
                Td.v.b(r9)     // Catch: java.lang.Throwable -> L1b
            L19:
                r9 = r4
                goto L48
            L1b:
                r9 = move-exception
                goto L8c
            L1d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L25:
                java.lang.Object r1 = r8.f27273a
                If.i r1 = (If.i) r1
                java.lang.Object r4 = r8.f27275c
                Jf.f r4 = (Jf.InterfaceC1743f) r4
                Td.v.b(r9)     // Catch: java.lang.Throwable -> L1b
                goto L58
            L31:
                Td.v.b(r9)
                java.lang.Object r9 = r8.f27275c
                Jf.f r9 = (Jf.InterfaceC1743f) r9
                android.content.ContentResolver r1 = r8.f27276d
                android.net.Uri r4 = r8.f27277e
                r5 = 0
                androidx.compose.ui.platform.K1$d r6 = r8.f27278f
                r1.registerContentObserver(r4, r5, r6)
                If.g r1 = r8.f27279g     // Catch: java.lang.Throwable -> L1b
                If.i r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1b
            L48:
                r8.f27275c = r9     // Catch: java.lang.Throwable -> L1b
                r8.f27273a = r1     // Catch: java.lang.Throwable -> L1b
                r8.f27274b = r3     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r4 = r1.a(r8)     // Catch: java.lang.Throwable -> L1b
                if (r4 != r0) goto L55
                goto L81
            L55:
                r7 = r4
                r4 = r9
                r9 = r7
            L58:
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L1b
                boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L1b
                if (r9 == 0) goto L82
                r1.next()     // Catch: java.lang.Throwable -> L1b
                android.content.Context r9 = r8.f27280h     // Catch: java.lang.Throwable -> L1b
                android.content.ContentResolver r9 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L1b
                java.lang.String r5 = "animator_duration_scale"
                r6 = 1065353216(0x3f800000, float:1.0)
                float r9 = android.provider.Settings.Global.getFloat(r9, r5, r6)     // Catch: java.lang.Throwable -> L1b
                java.lang.Float r9 = kotlin.coroutines.jvm.internal.b.c(r9)     // Catch: java.lang.Throwable -> L1b
                r8.f27275c = r4     // Catch: java.lang.Throwable -> L1b
                r8.f27273a = r1     // Catch: java.lang.Throwable -> L1b
                r8.f27274b = r2     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r9 = r4.emit(r9, r8)     // Catch: java.lang.Throwable -> L1b
                if (r9 != r0) goto L19
            L81:
                return r0
            L82:
                android.content.ContentResolver r9 = r8.f27276d
                androidx.compose.ui.platform.K1$d r0 = r8.f27278f
                r9.unregisterContentObserver(r0)
                Td.L r9 = Td.L.f17438a
                return r9
            L8c:
                android.content.ContentResolver r0 = r8.f27276d
                androidx.compose.ui.platform.K1$d r1 = r8.f27278f
                r0.unregisterContentObserver(r1)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.K1.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends ContentObserver {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ If.g f27281a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(If.g gVar, Handler handler) {
            super(handler);
            this.f27281a = gVar;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10, Uri uri) {
            this.f27281a.d(Td.L.f17438a);
        }
    }

    public static final C2433o1 b(View view, Zd.i iVar, AbstractC2857k abstractC2857k) {
        Y.P0 p02;
        if (iVar.l(Zd.f.f23273S) == null || iVar.l(InterfaceC2446t0.f22548R) == null) {
            iVar = S.f27366m.a().w(iVar);
        }
        InterfaceC2446t0 interfaceC2446t0 = (InterfaceC2446t0) iVar.l(InterfaceC2446t0.f22548R);
        if (interfaceC2446t0 != null) {
            Y.P0 p03 = new Y.P0(interfaceC2446t0);
            p03.a();
            p02 = p03;
        } else {
            p02 = null;
        }
        kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
        Zd.i c2682a1 = (l0.k) iVar.l(l0.k.f52346h0);
        if (c2682a1 == null) {
            c2682a1 = new C2682a1();
            n10.f52259a = c2682a1;
        }
        Zd.i iVarW = iVar.w(p02 != null ? p02 : Zd.j.f23275a).w(c2682a1);
        C2433o1 c2433o1 = new C2433o1(iVarW);
        c2433o1.w0();
        Gf.O oA = Gf.P.a(iVarW);
        if (abstractC2857k == null) {
            androidx.lifecycle.r rVarA = androidx.lifecycle.Z.a(view);
            abstractC2857k = rVarA != null ? rVarA.getLifecycle() : null;
        }
        if (abstractC2857k != null) {
            view.addOnAttachStateChangeListener(new a(view, c2433o1));
            abstractC2857k.addObserver(new b(oA, p02, c2433o1, n10, view));
            return c2433o1;
        }
        H0.a.c("ViewTreeLifecycleOwner not found from " + view);
        throw new C2160k();
    }

    public static /* synthetic */ C2433o1 c(View view, Zd.i iVar, AbstractC2857k abstractC2857k, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = Zd.j.f23275a;
        }
        if ((i10 & 2) != 0) {
            abstractC2857k = null;
        }
        return b(view, iVar, abstractC2857k);
    }

    public static final AbstractC2460y d(View view) {
        AbstractC2460y abstractC2460yF = f(view);
        if (abstractC2460yF != null) {
            return abstractC2460yF;
        }
        Object parent = view.getParent();
        while (abstractC2460yF == null && (parent instanceof View)) {
            View view2 = (View) parent;
            abstractC2460yF = f(view2);
            parent = view2.getParent();
        }
        return abstractC2460yF;
    }

    public static final Jf.I e(Context context) {
        Jf.I i10;
        Map map = f27253a;
        synchronized (map) {
            try {
                Object objW = map.get(context);
                if (objW == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    If.g gVarB = If.j.b(-1, null, null, 6, null);
                    objW = AbstractC1744g.w(AbstractC1744g.q(new c(contentResolver, uriFor, new d(gVarB, G1.h.a(Looper.getMainLooper())), gVarB, context, null)), Gf.P.b(), E.a.b(Jf.E.f9525a, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    map.put(context, objW);
                }
                i10 = (Jf.I) objW;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }

    public static final AbstractC2460y f(View view) {
        Object tag = view.getTag(l0.l.f52354G);
        if (tag instanceof AbstractC2460y) {
            return (AbstractC2460y) tag;
        }
        return null;
    }

    private static final View g(View view) {
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                break;
            }
            parent = view2.getParent();
            view = view2;
        }
        return view;
    }

    public static final C2433o1 h(View view) {
        if (!view.isAttachedToWindow()) {
            H0.a.b("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        View viewG = g(view);
        AbstractC2460y abstractC2460yF = f(viewG);
        if (abstractC2460yF == null) {
            return J1.f27239a.a(viewG);
        }
        if (abstractC2460yF instanceof C2433o1) {
            return (C2433o1) abstractC2460yF;
        }
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
    }

    public static final void i(View view, AbstractC2460y abstractC2460y) {
        view.setTag(l0.l.f52354G, abstractC2460y);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ View f27254a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C2433o1 f27255b;

        a(View view, C2433o1 c2433o1) {
            this.f27254a = view;
            this.f27255b = c2433o1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            this.f27254a.removeOnAttachStateChangeListener(this);
            this.f27255b.g0();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
