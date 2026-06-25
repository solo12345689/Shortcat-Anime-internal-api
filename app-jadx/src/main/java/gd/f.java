package gd;

import Gf.AbstractC1617k;
import Gf.C0;
import Gf.O;
import Td.L;
import Td.v;
import ae.AbstractC2605b;
import bc.C3042a;
import bc.EnumC3046e;
import dc.j;
import dc.n;
import dc.r;
import dc.s;
import expo.modules.splashscreen.SplashScreenOptions;
import ie.InterfaceC5082a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import pc.C5972b;
import pc.C5974d;
import pc.M;
import pc.U;
import pc.V;
import pc.X;
import pe.InterfaceC6027q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lgd/f;", "Lgc/c;", "<init>", "()V", "Lgc/e;", "n", "()Lgc/e;", "", "d", "Z", "userControlledAutoHideEnabled", "expo-splash-screen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends gc.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean userControlledAutoHideEnabled;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f47443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ SplashScreenOptions f47444b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(SplashScreenOptions splashScreenOptions, Zd.e eVar) {
            super(2, eVar);
            this.f47444b = splashScreenOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return new a(this.f47444b, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((a) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f47443a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            gd.d.f47434a.m(this.f47444b);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Function1 {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            f.this.userControlledAutoHideEnabled = true;
            gd.d.f47434a.l(true);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            gd.d.f47434a.l(true);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            gd.d.f47434a.j();
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements Function1 {
        public e() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            if (!f.this.userControlledAutoHideEnabled) {
                gd.d.f47434a.j();
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: gd.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0762f implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0762f f47447a = new C0762f();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(SplashScreenOptions.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g implements Function1 {
        public g() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            return AbstractC1617k.d(f.this.i().x(), null, null, new a((SplashScreenOptions) objArr[0], null), 3, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            gd.d.f47434a.j();
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i implements InterfaceC5082a {
        public final void a() {
            gd.d.f47434a.n();
        }

        @Override // ie.InterfaceC5082a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return L.f17438a;
        }
    }

    @Override // gc.c
    public gc.e n() {
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            dVar.s("ExpoSplashScreen");
            C5972b[] c5972bArr = new C5972b[0];
            b bVar = new b();
            Class cls = Integer.TYPE;
            boolean zC = AbstractC5504s.c(Boolean.class, cls);
            Class cls2 = Float.TYPE;
            Class cls3 = Double.TYPE;
            Class cls4 = Boolean.TYPE;
            dVar.k().put("preventAutoHideAsync", zC ? new dc.l("preventAutoHideAsync", c5972bArr, bVar) : AbstractC5504s.c(Boolean.class, cls4) ? new dc.h("preventAutoHideAsync", c5972bArr, bVar) : AbstractC5504s.c(Boolean.class, cls3) ? new dc.i("preventAutoHideAsync", c5972bArr, bVar) : AbstractC5504s.c(Boolean.class, cls2) ? new j("preventAutoHideAsync", c5972bArr, bVar) : AbstractC5504s.c(Boolean.class, String.class) ? new n("preventAutoHideAsync", c5972bArr, bVar) : new s("preventAutoHideAsync", c5972bArr, bVar));
            C5972b[] c5972bArr2 = new C5972b[0];
            c cVar = new c();
            dVar.k().put("internalPreventAutoHideAsync", AbstractC5504s.c(L.class, cls) ? new dc.l("internalPreventAutoHideAsync", c5972bArr2, cVar) : AbstractC5504s.c(L.class, cls4) ? new dc.h("internalPreventAutoHideAsync", c5972bArr2, cVar) : AbstractC5504s.c(L.class, cls3) ? new dc.i("internalPreventAutoHideAsync", c5972bArr2, cVar) : AbstractC5504s.c(L.class, cls2) ? new j("internalPreventAutoHideAsync", c5972bArr2, cVar) : AbstractC5504s.c(L.class, String.class) ? new n("internalPreventAutoHideAsync", c5972bArr2, cVar) : new s("internalPreventAutoHideAsync", c5972bArr2, cVar));
            X xM = dVar.m();
            C5972b c5972b = (C5972b) C5974d.f55938a.a().get(new Pair(kotlin.jvm.internal.O.b(SplashScreenOptions.class), Boolean.FALSE));
            if (c5972b == null) {
                c5972b = new C5972b(new M(kotlin.jvm.internal.O.b(SplashScreenOptions.class), false, C0762f.f47447a), xM);
            }
            C5972b[] c5972bArr3 = {c5972b};
            V v10 = V.f55908a;
            U u10 = (U) v10.a().get(kotlin.jvm.internal.O.b(C0.class));
            if (u10 == null) {
                u10 = new U(kotlin.jvm.internal.O.b(C0.class));
                v10.a().put(kotlin.jvm.internal.O.b(C0.class), u10);
            }
            dVar.p().put("setOptions", new r("setOptions", c5972bArr3, u10, new g()));
            C5972b[] c5972bArr4 = new C5972b[0];
            U u11 = (U) v10.a().get(kotlin.jvm.internal.O.b(Object.class));
            if (u11 == null) {
                u11 = new U(kotlin.jvm.internal.O.b(Object.class));
                v10.a().put(kotlin.jvm.internal.O.b(Object.class), u11);
            }
            dVar.p().put("hide", new r("hide", c5972bArr4, u11, new h()));
            dVar.k().put("hideAsync", new s("hideAsync", new C5972b[0], new d()));
            dVar.k().put("internalMaybeHideAsync", new s("internalMaybeHideAsync", new C5972b[0], new e()));
            Map mapW = dVar.w();
            EnumC3046e enumC3046e = EnumC3046e.f33269b;
            mapW.put(enumC3046e, new C3042a(enumC3046e, new i()));
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
