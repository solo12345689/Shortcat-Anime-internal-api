package Gb;

import Td.L;
import Ub.u;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import dc.l;
import dc.n;
import dc.s;
import expo.modules.haptics.HapticType;
import ie.InterfaceC5082a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;
import pc.C5972b;
import pc.C5974d;
import pc.M;
import pc.X;
import pe.InterfaceC6027q;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LGb/b;", "Lgc/c;", "<init>", "()V", "LHb/g;", "type", "LTd/L;", "A", "(LHb/g;)V", "Lgc/e;", "n", "()Lgc/e;", "Landroid/content/Context;", "y", "()Landroid/content/Context;", "context", "Landroid/os/Vibrator;", "z", "()Landroid/os/Vibrator;", "vibrator", "expo-haptics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends gc.c {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements Function1 {
        public a() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            HapticType hapticType = (HapticType) objArr[0];
            Activity activityA = b.this.i().a();
            View viewFindViewById = activityA != null ? activityA.findViewById(R.id.content) : null;
            if (viewFindViewById != null) {
                return Boolean.valueOf(viewFindViewById.performHapticFeedback(hapticType.toHapticFeedbackType()));
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: Gb.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0096b implements Function2 {
        public C0096b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, u promise) {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            b.this.A(Hb.e.f8372a.a((String) promise));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f7443a = new c();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements Function1 {
        public d() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            b.this.A(Hb.e.f8372a.a((String) objArr[0]));
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
            b.this.A(Hb.f.a());
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements Function2 {
        public f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, u promise) {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            b.this.A(Hb.b.f8370a.a((String) promise));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f7447a = new g();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h implements Function1 {
        public h() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            b.this.A(Hb.b.f8370a.a((String) objArr[0]));
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i implements Function2 {
        public i() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, u promise) {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            HapticType hapticType = (HapticType) promise;
            Activity activityA = b.this.i().a();
            View viewFindViewById = activityA != null ? activityA.findViewById(R.id.content) : null;
            if (viewFindViewById != null) {
                viewFindViewById.performHapticFeedback(hapticType.toHapticFeedbackType());
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f7450a = new j();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(HapticType.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(Hb.g type) {
        if (Build.VERSION.SDK_INT >= 26) {
            z().vibrate(VibrationEffect.createWaveform(type.c(), type.a(), -1));
        } else {
            z().vibrate(type.b(), -1);
        }
    }

    private final Context y() throws cc.i {
        Context contextB = i().B();
        if (contextB != null) {
            return contextB;
        }
        throw new cc.i();
    }

    private final Vibrator z() {
        if (Build.VERSION.SDK_INT < 31) {
            Object systemService = y().getSystemService("vibrator");
            AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            return (Vibrator) systemService;
        }
        Object systemService2 = y().getSystemService("vibrator_manager");
        AbstractC5504s.f(systemService2, "null cannot be cast to non-null type android.os.VibratorManager");
        Vibrator defaultVibrator = w7.d.a(systemService2).getDefaultVibrator();
        AbstractC5504s.e(defaultVibrator);
        return defaultVibrator;
    }

    @Override // gc.c
    public gc.e n() {
        gc.d dVar;
        dc.g lVar;
        dc.g lVar2;
        dc.g sVar;
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar2 = new gc.d(this);
            dVar2.s("ExpoHaptics");
            boolean zC = AbstractC5504s.c(String.class, u.class);
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Class cls3 = Double.TYPE;
            Class cls4 = Boolean.TYPE;
            if (zC) {
                lVar = new dc.f("notificationAsync", new C5972b[0], new C0096b());
                dVar = dVar2;
            } else {
                X xM = dVar2.m();
                C5972b c5972b = (C5972b) C5974d.f55938a.a().get(new Pair(O.b(String.class), Boolean.FALSE));
                if (c5972b == null) {
                    dVar = dVar2;
                    c5972b = new C5972b(new M(O.b(String.class), false, c.f7443a), xM);
                } else {
                    dVar = dVar2;
                }
                C5972b[] c5972bArr = {c5972b};
                d dVar3 = new d();
                lVar = AbstractC5504s.c(L.class, cls) ? new l("notificationAsync", c5972bArr, dVar3) : AbstractC5504s.c(L.class, cls4) ? new dc.h("notificationAsync", c5972bArr, dVar3) : AbstractC5504s.c(L.class, cls3) ? new dc.i("notificationAsync", c5972bArr, dVar3) : AbstractC5504s.c(L.class, cls2) ? new dc.j("notificationAsync", c5972bArr, dVar3) : AbstractC5504s.c(L.class, String.class) ? new n("notificationAsync", c5972bArr, dVar3) : new s("notificationAsync", c5972bArr, dVar3);
            }
            dVar.k().put("notificationAsync", lVar);
            C5972b[] c5972bArr2 = new C5972b[0];
            e eVar = new e();
            dVar.k().put("selectionAsync", AbstractC5504s.c(L.class, cls) ? new l("selectionAsync", c5972bArr2, eVar) : AbstractC5504s.c(L.class, cls4) ? new dc.h("selectionAsync", c5972bArr2, eVar) : AbstractC5504s.c(L.class, cls3) ? new dc.i("selectionAsync", c5972bArr2, eVar) : AbstractC5504s.c(L.class, cls2) ? new dc.j("selectionAsync", c5972bArr2, eVar) : AbstractC5504s.c(L.class, String.class) ? new n("selectionAsync", c5972bArr2, eVar) : new s("selectionAsync", c5972bArr2, eVar));
            if (AbstractC5504s.c(String.class, u.class)) {
                lVar2 = new dc.f("impactAsync", new C5972b[0], new f());
            } else {
                X xM2 = dVar.m();
                C5972b c5972b2 = (C5972b) C5974d.f55938a.a().get(new Pair(O.b(String.class), Boolean.FALSE));
                if (c5972b2 == null) {
                    c5972b2 = new C5972b(new M(O.b(String.class), false, g.f7447a), xM2);
                }
                C5972b[] c5972bArr3 = {c5972b2};
                h hVar = new h();
                lVar2 = AbstractC5504s.c(L.class, cls) ? new l("impactAsync", c5972bArr3, hVar) : AbstractC5504s.c(L.class, cls4) ? new dc.h("impactAsync", c5972bArr3, hVar) : AbstractC5504s.c(L.class, cls3) ? new dc.i("impactAsync", c5972bArr3, hVar) : AbstractC5504s.c(L.class, cls2) ? new dc.j("impactAsync", c5972bArr3, hVar) : AbstractC5504s.c(L.class, String.class) ? new n("impactAsync", c5972bArr3, hVar) : new s("impactAsync", c5972bArr3, hVar);
            }
            dVar.k().put("impactAsync", lVar2);
            if (AbstractC5504s.c(HapticType.class, u.class)) {
                sVar = new dc.f("performHapticsAsync", new C5972b[0], new i());
            } else {
                X xM3 = dVar.m();
                C5972b c5972b3 = (C5972b) C5974d.f55938a.a().get(new Pair(O.b(HapticType.class), Boolean.FALSE));
                if (c5972b3 == null) {
                    c5972b3 = new C5972b(new M(O.b(HapticType.class), false, j.f7450a), xM3);
                }
                sVar = new s("performHapticsAsync", new C5972b[]{c5972b3}, new a());
            }
            dVar.k().put("performHapticsAsync", sVar);
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
