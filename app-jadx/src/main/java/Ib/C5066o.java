package ib;

import Gf.AbstractC1617k;
import Gf.AbstractC1646z;
import Gf.C1608f0;
import Gf.InterfaceC1642x;
import Gf.P;
import Gf.Q;
import Td.AbstractC2163n;
import Td.L;
import Td.u;
import Td.v;
import Ub.z;
import Ud.AbstractC2279u;
import ae.AbstractC2605b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC2864s;
import com.facebook.react.C3279t;
import com.facebook.react.C3323w;
import com.facebook.react.H;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactHost;
import com.facebook.react.W;
import ie.InterfaceC5082a;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import sb.h;
import t.C6551a;

/* JADX INFO: renamed from: ib.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C5066o extends C3279t {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f48795q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f48796r = O.b(C3279t.class).v();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ReactActivity f48797f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f48798g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C3279t f48799h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f48800i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f48801j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C6551a f48802k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Lazy f48803l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Lazy f48804m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC1642x f48805n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Pf.a f48806o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Lazy f48807p;

    /* JADX INFO: renamed from: ib.o$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: ib.o$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Zd.e f48808a;

        b(Zd.e eVar) {
            this.f48808a = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() throws cc.g {
            z zVar = z.f19458a;
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                Zd.e eVar = this.f48808a;
                u.a aVar = u.f17466b;
                eVar.resumeWith(u.b(L.f17438a));
            } else {
                String name = Thread.currentThread().getName();
                AbstractC5504s.g(name, "getName(...)");
                String name2 = Looper.getMainLooper().getThread().getName();
                AbstractC5504s.g(name2, "getName(...)");
                throw new cc.g(name, name2);
            }
        }
    }

    /* JADX INFO: renamed from: ib.o$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f48809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f48810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f48811c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f48812d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2 f48814f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function2 function2, Zd.e eVar) {
            super(2, eVar);
            this.f48814f = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            c cVar = C5066o.this.new c(this.f48814f, eVar);
            cVar.f48812d = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((c) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Gf.O o10;
            Pf.a aVar;
            Function2 function2;
            Pf.a aVar2;
            Throwable th2;
            Object objF = AbstractC2605b.f();
            int i10 = this.f48811c;
            try {
                if (i10 == 0) {
                    v.b(obj);
                    o10 = (Gf.O) this.f48812d;
                    aVar = C5066o.this.f48806o;
                    function2 = this.f48814f;
                    this.f48812d = o10;
                    this.f48809a = aVar;
                    this.f48810b = function2;
                    this.f48811c = 1;
                    if (aVar.c(null, this) != objF) {
                    }
                    return objF;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (Pf.a) this.f48812d;
                    try {
                        v.b(obj);
                        L l10 = L.f17438a;
                        aVar2.e(null);
                        return L.f17438a;
                    } catch (Throwable th3) {
                        th2 = th3;
                        aVar2.e(null);
                        throw th2;
                    }
                }
                function2 = (Function2) this.f48810b;
                Pf.a aVar3 = (Pf.a) this.f48809a;
                o10 = (Gf.O) this.f48812d;
                v.b(obj);
                aVar = aVar3;
                this.f48812d = aVar;
                this.f48809a = null;
                this.f48810b = null;
                this.f48811c = 2;
                if (function2.invoke(o10, this) != objF) {
                    aVar2 = aVar;
                    L l102 = L.f17438a;
                    aVar2.e(null);
                    return L.f17438a;
                }
                return objF;
            } catch (Throwable th4) {
                aVar2 = aVar;
                th2 = th4;
                aVar2.e(null);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ib.o$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f48815a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f48817c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Zd.e eVar) {
            super(2, eVar);
            this.f48817c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return C5066o.this.new d(this.f48817c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((d) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f48815a;
            if (i10 == 0) {
                v.b(obj);
                C5066o c5066o = C5066o.this;
                String str = this.f48817c;
                this.f48815a = 1;
                if (c5066o.F(str, true, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: ib.o$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f48818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f48819b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f48821d;

        e(Zd.e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f48819b = obj;
            this.f48821d |= Integer.MIN_VALUE;
            return C5066o.this.F(null, false, this);
        }
    }

    /* JADX INFO: renamed from: ib.o$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f48822a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f48824c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f48825d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Intent f48826e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i10, int i11, Intent intent, Zd.e eVar) {
            super(2, eVar);
            this.f48824c = i10;
            this.f48825d = i11;
            this.f48826e = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return C5066o.this.new f(this.f48824c, this.f48825d, this.f48826e, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((f) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f48822a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC1642x interfaceC1642x = C5066o.this.f48805n;
                this.f48822a = 1;
                if (interfaceC1642x.M0(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            C5066o.this.z().onActivityResult(this.f48824c, this.f48825d, this.f48826e);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: ib.o$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class g extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f48827a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Configuration f48829c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Configuration configuration, Zd.e eVar) {
            super(2, eVar);
            this.f48829c = configuration;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return C5066o.this.new g(this.f48829c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((g) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f48827a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC1642x interfaceC1642x = C5066o.this.f48805n;
                this.f48827a = 1;
                if (interfaceC1642x.M0(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            C5066o.this.z().onConfigurationChanged(this.f48829c);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: ib.o$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class h extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f48830a;

        h(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return C5066o.this.new h(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((h) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x009d, code lost:
        
            if (r8.F(r1, false, r7) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException {
            /*
                r7 = this;
                java.lang.Object r0 = ae.AbstractC2605b.f()
                int r1 = r7.f48830a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                Td.v.b(r8)
                goto La0
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                Td.v.b(r8)
                goto L31
            L1f:
                Td.v.b(r8)
                ib.o r8 = ib.C5066o.this
                sb.h$a r1 = ib.C5066o.n(r8)
                r7.f48830a = r3
                java.lang.Object r8 = ib.C5066o.l(r8, r1, r7)
                if (r8 != r0) goto L31
                goto L9f
            L31:
                ib.o r8 = ib.C5066o.this
                Gf.x r8 = ib.C5066o.o(r8)
                Td.L r1 = Td.L.f17438a
                r8.O(r1)
                int r8 = android.os.Build.VERSION.SDK_INT
                r1 = 26
                if (r8 < r1) goto L57
                ib.o r8 = ib.C5066o.this
                boolean r8 = r8.isWideColorGamutEnabled()
                if (r8 == 0) goto L57
                ib.o r8 = ib.C5066o.this
                com.facebook.react.ReactActivity r8 = ib.C5066o.m(r8)
                android.view.Window r8 = r8.getWindow()
                com.facebook.react.AbstractC3252q.a(r8, r3)
            L57:
                ib.o r8 = ib.C5066o.this
                android.os.Bundle r8 = r8.composeLaunchOptions()
                com.facebook.react.w r1 = new com.facebook.react.w
                ib.o r4 = ib.C5066o.this
                android.app.Activity r4 = r4.getPlainActivity()
                ib.o r5 = ib.C5066o.this
                com.facebook.react.ReactHost r5 = r5.getReactHost()
                ib.o r6 = ib.C5066o.this
                java.lang.String r6 = r6.getMainComponentName()
                r1.<init>(r4, r5, r6, r8)
                java.lang.Class<com.facebook.react.t> r8 = com.facebook.react.C3279t.class
                java.lang.String r4 = "e"
                java.lang.reflect.Field r8 = r8.getDeclaredField(r4)
                r8.setAccessible(r3)
                ib.o r3 = ib.C5066o.this
                com.facebook.react.t r3 = r3.z()
                r8.set(r3, r1)
                ib.o r8 = ib.C5066o.this
                java.lang.String r8 = r8.getMainComponentName()
                if (r8 == 0) goto La0
                ib.o r8 = ib.C5066o.this
                java.lang.String r1 = r8.getMainComponentName()
                r7.f48830a = r2
                r2 = 0
                java.lang.Object r8 = ib.C5066o.s(r8, r1, r2, r7)
                if (r8 != r0) goto La0
            L9f:
                return r0
            La0:
                Td.L r8 = Td.L.f17438a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ib.C5066o.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ib.o$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class i extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f48832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f48833b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f48834c;

        i(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return C5066o.this.new i(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((i) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x006c A[Catch: all -> 0x001b, LOOP:0: B:22:0x0066->B:24:0x006c, LOOP_END, TryCatch #2 {all -> 0x001b, blocks: (B:7:0x0017, B:21:0x005e, B:22:0x0066, B:24:0x006c, B:25:0x007a, B:27:0x0080, B:32:0x00a0, B:31:0x0099, B:30:0x008b), top: B:43:0x0017, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0099 A[Catch: all -> 0x001b, TryCatch #2 {all -> 0x001b, blocks: (B:7:0x0017, B:21:0x005e, B:22:0x0066, B:24:0x006c, B:25:0x007a, B:27:0x0080, B:32:0x00a0, B:31:0x0099, B:30:0x008b), top: B:43:0x0017, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = ae.AbstractC2605b.f()
                int r1 = r5.f48834c
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L33
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r0 = r5.f48833b
                ib.o r0 = (ib.C5066o) r0
                java.lang.Object r1 = r5.f48832a
                Pf.a r1 = (Pf.a) r1
                Td.v.b(r6)     // Catch: java.lang.Throwable -> L1b
                goto L5e
            L1b:
                r6 = move-exception
                goto Lab
            L1e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L26:
                java.lang.Object r1 = r5.f48833b
                ib.o r1 = (ib.C5066o) r1
                java.lang.Object r3 = r5.f48832a
                Pf.a r3 = (Pf.a) r3
                Td.v.b(r6)
                r6 = r3
                goto L4b
            L33:
                Td.v.b(r6)
                ib.o r6 = ib.C5066o.this
                Pf.a r6 = ib.C5066o.p(r6)
                ib.o r1 = ib.C5066o.this
                r5.f48832a = r6
                r5.f48833b = r1
                r5.f48834c = r3
                java.lang.Object r3 = r6.c(r4, r5)
                if (r3 != r0) goto L4b
                goto L5b
            L4b:
                Gf.x r3 = ib.C5066o.o(r1)     // Catch: java.lang.Throwable -> La8
                r5.f48832a = r6     // Catch: java.lang.Throwable -> La8
                r5.f48833b = r1     // Catch: java.lang.Throwable -> La8
                r5.f48834c = r2     // Catch: java.lang.Throwable -> La8
                java.lang.Object r2 = r3.M0(r5)     // Catch: java.lang.Throwable -> La8
                if (r2 != r0) goto L5c
            L5b:
                return r0
            L5c:
                r0 = r1
                r1 = r6
            L5e:
                java.util.List r6 = ib.C5066o.q(r0)     // Catch: java.lang.Throwable -> L1b
                java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L1b
            L66:
                boolean r2 = r6.hasNext()     // Catch: java.lang.Throwable -> L1b
                if (r2 == 0) goto L7a
                java.lang.Object r2 = r6.next()     // Catch: java.lang.Throwable -> L1b
                sb.i r2 = (sb.i) r2     // Catch: java.lang.Throwable -> L1b
                com.facebook.react.ReactActivity r3 = ib.C5066o.m(r0)     // Catch: java.lang.Throwable -> L1b
                r2.b(r3)     // Catch: java.lang.Throwable -> L1b
                goto L66
            L7a:
                sb.h$a r6 = ib.C5066o.n(r0)     // Catch: java.lang.Throwable -> L1b
                if (r6 == 0) goto L99
                com.facebook.react.t r6 = r0.z()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L8a
                r6.onDestroy()     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L8a
                Td.L r6 = Td.L.f17438a     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L8a
                goto La0
            L8a:
                r6 = move-exception
                java.lang.String r0 = ib.C5066o.r()     // Catch: java.lang.Throwable -> L1b
                java.lang.String r2 = "Exception occurred during onDestroy with delayed app loading"
                int r6 = android.util.Log.e(r0, r2, r6)     // Catch: java.lang.Throwable -> L1b
                kotlin.coroutines.jvm.internal.b.d(r6)     // Catch: java.lang.Throwable -> L1b
                goto La0
            L99:
                com.facebook.react.t r6 = r0.z()     // Catch: java.lang.Throwable -> L1b
                r6.onDestroy()     // Catch: java.lang.Throwable -> L1b
            La0:
                Td.L r6 = Td.L.f17438a     // Catch: java.lang.Throwable -> L1b
                r1.e(r4)
                Td.L r6 = Td.L.f17438a
                return r6
            La8:
                r0 = move-exception
                r1 = r6
                r6 = r0
            Lab:
                r1.e(r4)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ib.C5066o.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ib.o$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class j extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f48836a;

        j(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return C5066o.this.new j(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((j) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f48836a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC1642x interfaceC1642x = C5066o.this.f48805n;
                this.f48836a = 1;
                if (interfaceC1642x.M0(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            List list = C5066o.this.f48800i;
            C5066o c5066o = C5066o.this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((sb.i) it.next()).e(c5066o.f48797f);
            }
            if (C5066o.this.y() != null) {
                try {
                    C5066o.this.z().onPause();
                    L l10 = L.f17438a;
                } catch (Exception e10) {
                    kotlin.coroutines.jvm.internal.b.d(Log.e(C5066o.f48796r, "Exception occurred during onPause with delayed app loading", e10));
                }
            } else {
                C5066o.this.z().onPause();
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: ib.o$k */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class k extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f48838a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f48840c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String[] f48841d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int[] f48842e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(int i10, String[] strArr, int[] iArr, Zd.e eVar) {
            super(2, eVar);
            this.f48840c = i10;
            this.f48841d = strArr;
            this.f48842e = iArr;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return C5066o.this.new k(this.f48840c, this.f48841d, this.f48842e, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((k) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f48838a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC1642x interfaceC1642x = C5066o.this.f48805n;
                this.f48838a = 1;
                if (interfaceC1642x.M0(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            C5066o.this.z().onRequestPermissionsResult(this.f48840c, this.f48841d, this.f48842e);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: ib.o$l */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class l extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f48843a;

        l(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return C5066o.this.new l(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((l) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f48843a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC1642x interfaceC1642x = C5066o.this.f48805n;
                this.f48843a = 1;
                if (interfaceC1642x.M0(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            C5066o.this.z().onResume();
            List list = C5066o.this.f48800i;
            C5066o c5066o = C5066o.this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((sb.i) it.next()).c(c5066o.f48797f);
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: ib.o$m */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class m extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f48845a;

        m(Zd.e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return C5066o.this.new m(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((m) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f48845a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC1642x interfaceC1642x = C5066o.this.f48805n;
                this.f48845a = 1;
                if (interfaceC1642x.M0(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            List list = C5066o.this.f48800i;
            C5066o c5066o = C5066o.this;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((sb.i) it.next()).onUserLeaveHint(c5066o.f48797f);
            }
            C5066o.this.z().onUserLeaveHint();
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: ib.o$n */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class n extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f48847a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f48849c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(boolean z10, Zd.e eVar) {
            super(2, eVar);
            this.f48849c = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return C5066o.this.new n(this.f48849c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((n) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f48847a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC1642x interfaceC1642x = C5066o.this.f48805n;
                this.f48847a = 1;
                if (interfaceC1642x.M0(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            C5066o.this.z().onWindowFocusChanged(this.f48849c);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: ib.o$o, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0777o extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f48850a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String[] f48852c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f48853d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q7.g f48854e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0777o(String[] strArr, int i10, q7.g gVar, Zd.e eVar) {
            super(2, eVar);
            this.f48852c = strArr;
            this.f48853d = i10;
            this.f48854e = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return C5066o.this.new C0777o(this.f48852c, this.f48853d, this.f48854e, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((C0777o) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f48850a;
            if (i10 == 0) {
                v.b(obj);
                InterfaceC1642x interfaceC1642x = C5066o.this.f48805n;
                this.f48850a = 1;
                if (interfaceC1642x.M0(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            C5066o.this.z().requestPermissions(this.f48852c, this.f48853d, this.f48854e);
            return L.f17438a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5066o(ReactActivity activity, boolean z10, C3279t delegate) {
        super(activity, (String) null);
        AbstractC5504s.h(activity, "activity");
        AbstractC5504s.h(delegate, "delegate");
        this.f48797f = activity;
        this.f48798g = z10;
        this.f48799h = delegate;
        List listA = C5054c.f48769b.a();
        ArrayList arrayList = new ArrayList();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            List listB = ((sb.g) it.next()).b(this.f48797f);
            AbstractC5504s.g(listB, "createReactActivityLifecycleListeners(...)");
            AbstractC2279u.D(arrayList, listB);
        }
        this.f48800i = arrayList;
        List listA2 = C5054c.f48769b.a();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = listA2.iterator();
        while (it2.hasNext()) {
            List listD = ((sb.g) it2.next()).d(this.f48797f);
            AbstractC5504s.g(listD, "createReactActivityHandlers(...)");
            AbstractC2279u.D(arrayList2, listD);
        }
        this.f48801j = arrayList2;
        this.f48802k = new C6551a();
        this.f48803l = AbstractC2163n.b(new InterfaceC5082a() { // from class: ib.k
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return C5066o.k(this.f48792a);
            }
        });
        this.f48804m = AbstractC2163n.b(new InterfaceC5082a() { // from class: ib.l
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return C5066o.v(this.f48793a);
            }
        });
        this.f48805n = AbstractC1646z.b(null, 1, null);
        this.f48806o = Pf.g.b(false, 1, null);
        this.f48807p = AbstractC2163n.b(new InterfaceC5082a() { // from class: ib.m
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return C5066o.t();
            }
        });
    }

    private final ReactHost A() {
        return (ReactHost) this.f48803l.getValue();
    }

    private final Object B(String str) throws NoSuchMethodException {
        Method declaredMethod = (Method) this.f48802k.get(str);
        if (declaredMethod == null) {
            declaredMethod = C3279t.class.getDeclaredMethod(str, null);
            declaredMethod.setAccessible(true);
            this.f48802k.put(str, declaredMethod);
        }
        AbstractC5504s.e(declaredMethod);
        return declaredMethod.invoke(this.f48799h, null);
    }

    private final void D(Q q10, Function2 function2) {
        AbstractC1617k.d(AbstractC2864s.a(this.f48797f), null, q10, new c(function2, null), 1, null);
    }

    static /* synthetic */ void E(C5066o c5066o, Q q10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            q10 = Q.f7529a;
        }
        c5066o.D(q10, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object F(java.lang.String r7, boolean r8, Zd.e r9) throws java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.NoSuchMethodException {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ib.C5066o.F(java.lang.String, boolean, Zd.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup G(C5066o c5066o, sb.h hVar) {
        return hVar.b(c5066o.f48797f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3279t H(C5066o c5066o, sb.h hVar) {
        return hVar.a(c5066o.f48797f, c5066o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactHost k(C5066o c5066o) {
        return c5066o.f48799h.getReactHost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gf.O t() {
        return P.a(C1608f0.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u(h.a aVar, Zd.e eVar) throws Throwable {
        if (aVar == null) {
            return L.f17438a;
        }
        Zd.k kVar = new Zd.k(AbstractC2605b.c(eVar));
        aVar.a(new b(kVar));
        Object objA = kVar.a();
        if (objA == AbstractC2605b.f()) {
            kotlin.coroutines.jvm.internal.h.c(eVar);
        }
        return objA == AbstractC2605b.f() ? objA : L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h.a v(final C5066o c5066o) {
        return (h.a) Cf.l.D(Cf.l.L(AbstractC2279u.c0(c5066o.f48801j), new Function1() { // from class: ib.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5066o.w(this.f48794a, (sb.h) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h.a w(C5066o c5066o, sb.h hVar) {
        return hVar.c(c5066o.f48797f, c5066o.getReactHost());
    }

    private final Gf.O x() {
        return (Gf.O) this.f48807p.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h.a y() {
        return (h.a) this.f48804m.getValue();
    }

    public final Object C(String name, Class[] argTypes, Object[] args) throws NoSuchMethodException {
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(argTypes, "argTypes");
        AbstractC5504s.h(args, "args");
        Method declaredMethod = (Method) this.f48802k.get(name);
        if (declaredMethod == null) {
            declaredMethod = C3279t.class.getDeclaredMethod(name, (Class[]) Arrays.copyOf(argTypes, argTypes.length));
            declaredMethod.setAccessible(true);
            this.f48802k.put(name, declaredMethod);
        }
        AbstractC5504s.e(declaredMethod);
        return declaredMethod.invoke(this.f48799h, Arrays.copyOf(args, args.length));
    }

    @Override // com.facebook.react.C3279t
    protected Bundle composeLaunchOptions() {
        return (Bundle) B("composeLaunchOptions");
    }

    @Override // com.facebook.react.C3279t
    protected W createRootView() {
        return (W) B("createRootView");
    }

    @Override // com.facebook.react.C3279t
    protected Context getContext() {
        return (Context) B("getContext");
    }

    @Override // com.facebook.react.C3279t
    protected Bundle getLaunchOptions() {
        return (Bundle) B("getLaunchOptions");
    }

    @Override // com.facebook.react.C3279t
    public String getMainComponentName() {
        return this.f48799h.getMainComponentName();
    }

    @Override // com.facebook.react.C3279t
    protected Activity getPlainActivity() {
        return (Activity) B("getPlainActivity");
    }

    @Override // com.facebook.react.C3279t
    protected C3323w getReactDelegate() {
        return (C3323w) B("getReactDelegate");
    }

    @Override // com.facebook.react.C3279t
    public ReactHost getReactHost() {
        return A();
    }

    @Override // com.facebook.react.C3279t
    public H getReactInstanceManager() {
        H reactInstanceManager = this.f48799h.getReactInstanceManager();
        AbstractC5504s.g(reactInstanceManager, "getReactInstanceManager(...)");
        return reactInstanceManager;
    }

    @Override // com.facebook.react.C3279t
    protected boolean isFabricEnabled() {
        return ((Boolean) B("isFabricEnabled")).booleanValue();
    }

    @Override // com.facebook.react.C3279t
    protected boolean isWideColorGamutEnabled() {
        return ((Boolean) B("isWideColorGamutEnabled")).booleanValue();
    }

    @Override // com.facebook.react.C3279t
    protected void loadApp(String str) {
        D(Q.f7532d, new d(str, null));
    }

    @Override // com.facebook.react.C3279t
    public void onActivityResult(int i10, int i11, Intent intent) {
        E(this, null, new f(i10, i11, intent, null), 1, null);
    }

    @Override // com.facebook.react.C3279t
    public boolean onBackPressed() {
        boolean z10;
        if (!this.f48805n.j()) {
            return false;
        }
        List list = this.f48800i;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((sb.i) it.next()).onBackPressed()));
        }
        Iterator it2 = arrayList.iterator();
        loop1: while (true) {
            z10 = false;
            while (it2.hasNext()) {
                boolean zBooleanValue = ((Boolean) it2.next()).booleanValue();
                if (z10 || zBooleanValue) {
                    z10 = true;
                }
            }
        }
        return z10 || this.f48799h.onBackPressed();
    }

    @Override // com.facebook.react.C3279t
    public void onConfigurationChanged(Configuration newConfig) {
        AbstractC5504s.h(newConfig, "newConfig");
        E(this, null, new g(newConfig, null), 1, null);
    }

    @Override // com.facebook.react.C3279t
    public void onCreate(Bundle bundle) throws IllegalAccessException, NoSuchFieldException {
        C3279t c3279t = (C3279t) Cf.l.D(Cf.l.L(AbstractC2279u.c0(this.f48801j), new Function1() { // from class: ib.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C5066o.H(this.f48790a, (sb.h) obj);
            }
        }));
        Iterator it = this.f48801j.iterator();
        while (it.hasNext()) {
            ((sb.h) it.next()).d(this.f48797f, c3279t);
        }
        if (c3279t == null || AbstractC5504s.c(c3279t, this)) {
            D(Q.f7532d, new h(null));
        } else {
            Field declaredField = ReactActivity.class.getDeclaredField("h");
            declaredField.setAccessible(true);
            Field declaredField2 = Field.class.getDeclaredField("accessFlags");
            declaredField2.setAccessible(true);
            declaredField2.setInt(declaredField, declaredField.getModifiers() & (-17));
            declaredField.set(this.f48797f, c3279t);
            this.f48799h = c3279t;
            c3279t.onCreate(bundle);
        }
        Iterator it2 = this.f48800i.iterator();
        while (it2.hasNext()) {
            ((sb.i) it2.next()).a(this.f48797f, bundle);
        }
    }

    @Override // com.facebook.react.C3279t
    public void onDestroy() {
        AbstractC1617k.d(x(), null, null, new i(null), 3, null);
    }

    @Override // com.facebook.react.C3279t
    public boolean onKeyDown(int i10, KeyEvent event) {
        boolean z10;
        AbstractC5504s.h(event, "event");
        if (!this.f48805n.j()) {
            return false;
        }
        List list = this.f48801j;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((sb.h) it.next()).onKeyDown(i10, event)));
        }
        Iterator it2 = arrayList.iterator();
        loop1: while (true) {
            z10 = false;
            while (it2.hasNext()) {
                boolean zBooleanValue = ((Boolean) it2.next()).booleanValue();
                if (z10 || zBooleanValue) {
                    z10 = true;
                }
            }
        }
        return z10 || this.f48799h.onKeyDown(i10, event);
    }

    @Override // com.facebook.react.C3279t
    public boolean onKeyLongPress(int i10, KeyEvent event) {
        boolean z10;
        AbstractC5504s.h(event, "event");
        if (!this.f48805n.j()) {
            return false;
        }
        List list = this.f48801j;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((sb.h) it.next()).onKeyLongPress(i10, event)));
        }
        Iterator it2 = arrayList.iterator();
        loop1: while (true) {
            z10 = false;
            while (it2.hasNext()) {
                boolean zBooleanValue = ((Boolean) it2.next()).booleanValue();
                if (z10 || zBooleanValue) {
                    z10 = true;
                }
            }
        }
        return z10 || this.f48799h.onKeyLongPress(i10, event);
    }

    @Override // com.facebook.react.C3279t
    public boolean onKeyUp(int i10, KeyEvent event) {
        boolean z10;
        AbstractC5504s.h(event, "event");
        if (!this.f48805n.j()) {
            return false;
        }
        List list = this.f48801j;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((sb.h) it.next()).onKeyUp(i10, event)));
        }
        Iterator it2 = arrayList.iterator();
        loop1: while (true) {
            z10 = false;
            while (it2.hasNext()) {
                boolean zBooleanValue = ((Boolean) it2.next()).booleanValue();
                if (z10 || zBooleanValue) {
                    z10 = true;
                }
            }
        }
        return z10 || this.f48799h.onKeyUp(i10, event);
    }

    @Override // com.facebook.react.C3279t
    public boolean onNewIntent(Intent intent) {
        boolean z10;
        if (!this.f48805n.j()) {
            return false;
        }
        List list = this.f48800i;
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((sb.i) it.next()).onNewIntent(intent)));
        }
        Iterator it2 = arrayList.iterator();
        loop1: while (true) {
            z10 = false;
            while (it2.hasNext()) {
                boolean zBooleanValue = ((Boolean) it2.next()).booleanValue();
                if (z10 || zBooleanValue) {
                    z10 = true;
                }
            }
        }
        return z10 || this.f48799h.onNewIntent(intent);
    }

    @Override // com.facebook.react.C3279t
    public void onPause() {
        E(this, null, new j(null), 1, null);
    }

    @Override // com.facebook.react.C3279t
    public void onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        AbstractC5504s.h(permissions, "permissions");
        AbstractC5504s.h(grantResults, "grantResults");
        E(this, null, new k(i10, permissions, grantResults, null), 1, null);
    }

    @Override // com.facebook.react.C3279t
    public void onResume() {
        E(this, null, new l(null), 1, null);
    }

    @Override // com.facebook.react.C3279t
    public void onUserLeaveHint() {
        E(this, null, new m(null), 1, null);
    }

    @Override // com.facebook.react.C3279t
    public void onWindowFocusChanged(boolean z10) {
        E(this, null, new n(z10, null), 1, null);
    }

    @Override // com.facebook.react.C3279t
    public void requestPermissions(String[] permissions, int i10, q7.g gVar) {
        AbstractC5504s.h(permissions, "permissions");
        E(this, null, new C0777o(permissions, i10, gVar, null), 1, null);
    }

    public final C3279t z() {
        return this.f48799h;
    }
}
