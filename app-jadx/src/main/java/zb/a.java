package Zb;

import Gf.AbstractC1613i;
import Gf.AbstractC1615j;
import Gf.C1608f0;
import Gf.M0;
import Gf.O;
import Td.L;
import Td.v;
import Td.z;
import Ub.r;
import Ub.u;
import Ud.AbstractC2279u;
import Ud.S;
import ae.AbstractC2605b;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.facebook.react.C3323w;
import com.facebook.react.ReactActivity;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import dc.s;
import expo.modules.kotlin.jni.JavaScriptArrayBuffer;
import expo.modules.kotlin.jni.JavaScriptObject;
import expo.modules.kotlin.jni.JavaScriptValue;
import hc.C4940l;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;
import pc.C5972b;
import pc.C5974d;
import pc.M;
import pc.U;
import pc.V;
import pc.X;
import pe.InterfaceC6014d;
import pe.InterfaceC6027q;
import uc.AbstractC6764b;
import uc.C6763a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LZb/a;", "Lgc/c;", "<init>", "()V", "Lgc/e;", "n", "()Lgc/e;", "Landroid/content/Context;", "y", "()Landroid/content/Context;", "context", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends gc.c {

    /* JADX INFO: renamed from: Zb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0402a extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23242a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f23244c;

        /* JADX INFO: renamed from: Zb.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0403a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f23245a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f23246b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f23247c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0403a(a aVar, long j10, Zd.e eVar) {
                super(2, eVar);
                this.f23246b = aVar;
                this.f23247c = j10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Zd.e create(Object obj, Zd.e eVar) {
                return new C0403a(this.f23246b, this.f23247c, eVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(O o10, Zd.e eVar) {
                return ((C0403a) create(o10, eVar)).invokeSuspend(L.f17438a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC2605b.f();
                if (this.f23245a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                this.f23246b.i().G().h(this.f23247c);
                return L.f17438a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0402a(long j10, Zd.e eVar) {
            super(2, eVar);
            this.f23244c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return a.this.new C0402a(this.f23244c, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, Zd.e eVar) {
            return ((C0402a) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.f23242a;
            if (i10 == 0) {
                v.b(obj);
                M0 m0C = C1608f0.c();
                C0403a c0403a = new C0403a(a.this, this.f23244c, null);
                this.f23242a = 1;
                if (AbstractC1613i.g(m0C, c0403a, this) == objF) {
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

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements Function2 {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, u promise) throws cc.h {
            C3323w c3323wX;
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            Activity activityF = a.this.i().F();
            ReactActivity reactActivity = activityF instanceof ReactActivity ? (ReactActivity) activityF : null;
            if (reactActivity == null || (c3323wX = reactActivity.X()) == null) {
                return;
            }
            c3323wX.s();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws cc.h {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f23249a = new c();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements Function1 {
        public d() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws cc.h {
            C3323w c3323wX;
            AbstractC5504s.h(objArr, "<destruct>");
            Activity activityF = a.this.i().F();
            ReactActivity reactActivity = activityF instanceof ReactActivity ? (ReactActivity) activityF : null;
            if (reactActivity != null && (c3323wX = reactActivity.X()) != null) {
                c3323wX.s();
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f23251a = new e();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f23252a = new f();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) throws C6763a {
            AbstractC5504s.h(objArr, "<destruct>");
            Object obj = objArr[0];
            String str = (String) objArr[1];
            String str2 = (String) obj;
            try {
                UUID uuidFromString = UUID.fromString(str);
                AbstractC5504s.e(uuidFromString);
                return AbstractC6764b.b(uuidFromString, str2).toString();
            } catch (IllegalArgumentException unused) {
                throw new C6763a(str);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f23253a = new h();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f23254a = new i();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return kotlin.jvm.internal.O.f(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j implements Function1 {
        public j() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            String[] strArrA;
            AbstractC5504s.h(objArr, "<destruct>");
            Object obj = objArr[0];
            String str = (String) objArr[1];
            r rVarR = a.this.i().C().r((String) obj);
            LinkedHashMap linkedHashMap = null;
            if (rVarR == null) {
                return null;
            }
            Map mapH = rVarR.e().h();
            if (str == null) {
                str = "DEFAULT_MODULE_VIEW";
            }
            expo.modules.kotlin.views.r rVar = (expo.modules.kotlin.views.r) mapH.get(str);
            if (rVar == null) {
                return null;
            }
            Set setKeySet = rVar.g().keySet();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC5874j.e(S.e(AbstractC2279u.x(setKeySet, 10)), 16));
            for (Object obj2 : setKeySet) {
                linkedHashMap2.put(obj2, Boolean.TRUE);
            }
            expo.modules.kotlin.views.b bVarC = rVar.c();
            if (bVarC != null && (strArrA = bVarC.a()) != null) {
                linkedHashMap = new LinkedHashMap(AbstractC5874j.e(S.e(strArrA.length), 16));
                for (String str2 : strArrA) {
                    Pair pairA = z.a(bc.i.a(str2), S.f(z.a("registrationName", str2)));
                    linkedHashMap.put(pairA.c(), pairA.d());
                }
            }
            return S.l(z.a("validAttributes", linkedHashMap2), z.a("directEventTypes", linkedHashMap));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class k implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return UUID.randomUUID().toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class l implements Function1 {
        public l() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            JavaScriptValue javaScriptValueJ = a.this.i().D().d().global().j("_WORKLET_RUNTIME");
            if (javaScriptValueJ == null) {
                throw new IllegalStateException("UI Runtime is not available. Make sure you have Reanimated installed and imported in your project.");
            }
            javaScriptValueJ.isObject();
            JavaScriptObject object = javaScriptValueJ.getObject();
            object.isArrayBuffer();
            JavaScriptArrayBuffer arrayBuffer = object.getArrayBuffer();
            arrayBuffer.size();
            AbstractC1615j.b(null, a.this.new C0402a(arrayBuffer.read8Byte(0), null), 1, null);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class m implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            List listN0 = Df.r.N0((CharSequence) AbstractC2279u.m0(Df.r.N0("55.0.25", new String[]{"-"}, false, 0, 6, null)), new String[]{"."}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(listN0, 10));
            Iterator it2 = listN0.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt((String) it2.next())));
            }
            return S.l(z.a(DiagnosticsEntry.VERSION_KEY, "55.0.25"), z.a("major", Integer.valueOf(((Number) arrayList.get(0)).intValue())), z.a("minor", Integer.valueOf(((Number) arrayList.get(1)).intValue())), z.a("patch", Integer.valueOf(((Number) arrayList.get(2)).intValue())));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class n implements Function1 {
        public n() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Uri.fromFile(a.this.y().getCacheDir()) + "/";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class o implements Function1 {
        public o() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Uri.fromFile(a.this.y().getFilesDir()) + "/";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context y() throws cc.e {
        Context contextB = i().B();
        if (contextB != null) {
            return contextB;
        }
        throw new cc.e();
    }

    @Override // gc.c
    public gc.e n() {
        Class cls;
        dc.g lVar;
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            C4940l c4940l = new C4940l("expoModulesCoreVersion");
            C5972b[] c5972bArr = new C5972b[0];
            V v10 = V.f55908a;
            U u10 = (U) v10.a().get(kotlin.jvm.internal.O.b(Map.class));
            if (u10 == null) {
                u10 = new U(kotlin.jvm.internal.O.b(Map.class));
                v10.a().put(kotlin.jvm.internal.O.b(Map.class), u10);
            }
            c4940l.b(new dc.r(com.amazon.a.a.o.b.au, c5972bArr, u10, new m()));
            dVar.o().put("expoModulesCoreVersion", c4940l);
            C4940l c4940l2 = new C4940l("cacheDir");
            C5972b[] c5972bArr2 = new C5972b[0];
            U u11 = (U) v10.a().get(kotlin.jvm.internal.O.b(String.class));
            if (u11 == null) {
                u11 = new U(kotlin.jvm.internal.O.b(String.class));
                v10.a().put(kotlin.jvm.internal.O.b(String.class), u11);
            }
            c4940l2.b(new dc.r(com.amazon.a.a.o.b.au, c5972bArr2, u11, new n()));
            dVar.o().put("cacheDir", c4940l2);
            C4940l c4940l3 = new C4940l("documentsDir");
            C5972b[] c5972bArr3 = new C5972b[0];
            U u12 = (U) v10.a().get(kotlin.jvm.internal.O.b(String.class));
            if (u12 == null) {
                u12 = new U(kotlin.jvm.internal.O.b(String.class));
                v10.a().put(kotlin.jvm.internal.O.b(String.class), u12);
            }
            c4940l3.b(new dc.r(com.amazon.a.a.o.b.au, c5972bArr3, u12, new o()));
            dVar.o().put("documentsDir", c4940l3);
            C5972b[] c5972bArr4 = new C5972b[0];
            U u13 = (U) v10.a().get(kotlin.jvm.internal.O.b(Object.class));
            if (u13 == null) {
                u13 = new U(kotlin.jvm.internal.O.b(Object.class));
                v10.a().put(kotlin.jvm.internal.O.b(Object.class), u13);
            }
            dVar.p().put("uuidv4", new dc.r("uuidv4", c5972bArr4, u13, new k()));
            X xM = dVar.m();
            C5974d c5974d = C5974d.f55938a;
            InterfaceC6014d interfaceC6014dB = kotlin.jvm.internal.O.b(String.class);
            Boolean bool = Boolean.FALSE;
            C5972b c5972b = (C5972b) c5974d.a().get(new Pair(interfaceC6014dB, bool));
            if (c5972b == null) {
                c5972b = new C5972b(new M(kotlin.jvm.internal.O.b(String.class), false, e.f23251a), xM);
            }
            C5972b c5972b2 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(String.class), bool));
            if (c5972b2 == null) {
                cls = Object.class;
                c5972b2 = new C5972b(new M(kotlin.jvm.internal.O.b(String.class), false, f.f23252a), xM);
            } else {
                cls = Object.class;
            }
            C5972b[] c5972bArr5 = {c5972b, c5972b2};
            U u14 = (U) v10.a().get(kotlin.jvm.internal.O.b(String.class));
            if (u14 == null) {
                u14 = new U(kotlin.jvm.internal.O.b(String.class));
                v10.a().put(kotlin.jvm.internal.O.b(String.class), u14);
            }
            dVar.p().put("uuidv5", new dc.r("uuidv5", c5972bArr5, u14, new g()));
            X xM2 = dVar.m();
            C5972b c5972b3 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(String.class), bool));
            if (c5972b3 == null) {
                c5972b3 = new C5972b(new M(kotlin.jvm.internal.O.b(String.class), false, h.f23253a), xM2);
            }
            C5972b c5972b4 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(String.class), Boolean.TRUE));
            if (c5972b4 == null) {
                c5972b4 = new C5972b(new M(kotlin.jvm.internal.O.b(String.class), true, i.f23254a), xM2);
            }
            C5972b[] c5972bArr6 = {c5972b3, c5972b4};
            U u15 = (U) v10.a().get(kotlin.jvm.internal.O.b(Map.class));
            if (u15 == null) {
                u15 = new U(kotlin.jvm.internal.O.b(Map.class));
                v10.a().put(kotlin.jvm.internal.O.b(Map.class), u15);
            }
            dVar.p().put("getViewConfig", new dc.r("getViewConfig", c5972bArr6, u15, new j()));
            if (AbstractC5504s.c(String.class, u.class)) {
                lVar = new dc.f("reloadAppAsync", new C5972b[0], new b());
            } else {
                X xM3 = dVar.m();
                C5972b c5972b5 = (C5972b) c5974d.a().get(new Pair(kotlin.jvm.internal.O.b(String.class), bool));
                if (c5972b5 == null) {
                    c5972b5 = new C5972b(new M(kotlin.jvm.internal.O.b(String.class), false, c.f23249a), xM3);
                }
                C5972b[] c5972bArr7 = {c5972b5};
                d dVar2 = new d();
                lVar = AbstractC5504s.c(L.class, Integer.TYPE) ? new dc.l("reloadAppAsync", c5972bArr7, dVar2) : AbstractC5504s.c(L.class, Boolean.TYPE) ? new dc.h("reloadAppAsync", c5972bArr7, dVar2) : AbstractC5504s.c(L.class, Double.TYPE) ? new dc.i("reloadAppAsync", c5972bArr7, dVar2) : AbstractC5504s.c(L.class, Float.TYPE) ? new dc.j("reloadAppAsync", c5972bArr7, dVar2) : AbstractC5504s.c(L.class, String.class) ? new dc.n("reloadAppAsync", c5972bArr7, dVar2) : new s("reloadAppAsync", c5972bArr7, dVar2);
            }
            dVar.k().put("reloadAppAsync", lVar);
            C5972b[] c5972bArr8 = new C5972b[0];
            U u16 = (U) v10.a().get(kotlin.jvm.internal.O.b(cls));
            if (u16 == null) {
                u16 = new U(kotlin.jvm.internal.O.b(cls));
                v10.a().put(kotlin.jvm.internal.O.b(cls), u16);
            }
            dVar.p().put("installOnUIRuntime", new dc.r("installOnUIRuntime", c5972bArr8, u16, new l()));
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
