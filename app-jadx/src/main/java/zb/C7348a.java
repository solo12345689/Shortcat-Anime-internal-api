package zb;

import Td.L;
import Ud.AbstractC2273n;
import Ud.AbstractC2279u;
import android.app.ActivityManager;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.FeatureInfo;
import android.graphics.Rect;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import be.AbstractC3048a;
import hc.C4931c;
import ie.InterfaceC5082a;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.O;
import pc.C5972b;
import pc.C5974d;
import pc.M;
import pc.X;
import pe.InterfaceC6027q;
import vb.C6856a;

/* JADX INFO: renamed from: zb.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lzb/a;", "Lgc/c;", "<init>", "()V", "Lgc/e;", "n", "()Lgc/e;", "Landroid/content/Context;", "A", "()Landroid/content/Context;", "context", "", "B", "()I", "deviceYearClass", "", "C", "()Ljava/lang/String;", "systemName", "d", "b", "a", "expo-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C7348a extends gc.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: zb.a$A */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class A implements InterfaceC5082a {
        public A() {
        }

        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            Object systemService = C7348a.this.A().getSystemService("activity");
            AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
            return Long.valueOf(memoryInfo.totalMem);
        }
    }

    /* JADX INFO: renamed from: zb.a$B */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class B implements InterfaceC5082a {
        public B() {
        }

        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return Integer.valueOf(C7348a.INSTANCE.c(C7348a.this.A()).b());
        }
    }

    /* JADX INFO: renamed from: zb.a$a, reason: collision with other inner class name and from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final EnumC7349b c(Context context) {
            if (context.getApplicationContext().getPackageManager().hasSystemFeature("amazon.hardware.fire_tv")) {
                return EnumC7349b.f66036f;
            }
            UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
            if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
                return EnumC7349b.f66036f;
            }
            EnumC7349b enumC7349bE = e(context);
            return enumC7349bE != EnumC7349b.f66032b ? enumC7349bE : d(context);
        }

        private final EnumC7349b d(Context context) {
            double dWidth;
            double dHeight;
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null) {
                return EnumC7349b.f66032b;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
                AbstractC5504s.g(bounds, "getBounds(...)");
                double d10 = context.getResources().getConfiguration().densityDpi;
                dWidth = ((double) bounds.width()) / d10;
                dHeight = ((double) bounds.height()) / d10;
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                dWidth = ((double) displayMetrics.widthPixels) / ((double) displayMetrics.xdpi);
                dHeight = ((double) displayMetrics.heightPixels) / ((double) displayMetrics.ydpi);
            }
            double dSqrt = Math.sqrt(Math.pow(dWidth, 2.0d) + Math.pow(dHeight, 2.0d));
            return (3.0d > dSqrt || dSqrt > 6.9d) ? (dSqrt <= 6.9d || dSqrt > 18.0d) ? EnumC7349b.f66032b : EnumC7349b.f66034d : EnumC7349b.f66033c;
        }

        private final EnumC7349b e(Context context) {
            int i10 = context.getResources().getConfiguration().smallestScreenWidthDp;
            return i10 == 0 ? EnumC7349b.f66032b : i10 >= 600 ? EnumC7349b.f66034d : EnumC7349b.f66033c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean f() {
            return C6856a.f62037a.a();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: zb.a$b, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class EnumC7349b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final EnumC7349b f66032b = new EnumC7349b("UNKNOWN", 0, 0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final EnumC7349b f66033c = new EnumC7349b("PHONE", 1, 1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final EnumC7349b f66034d = new EnumC7349b("TABLET", 2, 2);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final EnumC7349b f66035e = new EnumC7349b("DESKTOP", 3, 3);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final EnumC7349b f66036f = new EnumC7349b("TV", 4, 4);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ EnumC7349b[] f66037g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f66038h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f66039a;

        static {
            EnumC7349b[] enumC7349bArrA = a();
            f66037g = enumC7349bArrA;
            f66038h = AbstractC3048a.a(enumC7349bArrA);
        }

        private EnumC7349b(String str, int i10, int i11) {
            this.f66039a = i11;
        }

        private static final /* synthetic */ EnumC7349b[] a() {
            return new EnumC7349b[]{f66032b, f66033c, f66034d, f66035e, f66036f};
        }

        public static EnumC7349b valueOf(String str) {
            return (EnumC7349b) Enum.valueOf(EnumC7349b.class, str);
        }

        public static EnumC7349b[] values() {
            return (EnumC7349b[]) f66037g.clone();
        }

        public final int b() {
            return this.f66039a;
        }
    }

    /* JADX INFO: renamed from: zb.a$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements Function1 {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Integer.valueOf(C7348a.INSTANCE.c(C7348a.this.A()).b());
        }
    }

    /* JADX INFO: renamed from: zb.a$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            return Double.valueOf(SystemClock.uptimeMillis());
        }
    }

    /* JADX INFO: renamed from: zb.a$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            long jMaxMemory = Runtime.getRuntime().maxMemory();
            return Double.valueOf(jMaxMemory != Long.MAX_VALUE ? jMaxMemory : -1.0d);
        }
    }

    /* JADX INFO: renamed from: zb.a$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements Function1 {
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            boolean zF = C7348a.INSTANCE.f();
            String str = Build.TAGS;
            boolean z10 = false;
            if ((!zF && str != null && Df.r.W(str, "test-keys", false, 2, null)) || new File("/system/app/Superuser.apk").exists() || (!zF && new File("/system/xbin/su").exists())) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: renamed from: zb.a$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g implements Function1 {
        public g() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            boolean zCanRequestPackageInstalls;
            AbstractC5504s.h(it, "it");
            if (Build.VERSION.SDK_INT < 26) {
                zCanRequestPackageInstalls = false;
                if (Settings.Global.getInt(C7348a.this.A().getApplicationContext().getContentResolver(), "install_non_market_apps", 0) == 1) {
                    zCanRequestPackageInstalls = true;
                }
            } else {
                zCanRequestPackageInstalls = C7348a.this.A().getApplicationContext().getPackageManager().canRequestPackageInstalls();
            }
            return Boolean.valueOf(zCanRequestPackageInstalls);
        }
    }

    /* JADX INFO: renamed from: zb.a$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h implements Function1 {
        public h() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] it) {
            AbstractC5504s.h(it, "it");
            FeatureInfo[] systemAvailableFeatures = C7348a.this.A().getApplicationContext().getPackageManager().getSystemAvailableFeatures();
            AbstractC5504s.g(systemAvailableFeatures, "getSystemAvailableFeatures(...)");
            List listU = AbstractC2273n.U(systemAvailableFeatures);
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(listU, 10));
            Iterator it2 = listU.iterator();
            while (it2.hasNext()) {
                arrayList.add(((FeatureInfo) it2.next()).name);
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: zb.a$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i implements Function2 {
        public i() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, Ub.u promise) {
            AbstractC5504s.h(objArr, "<unused var>");
            AbstractC5504s.h(promise, "promise");
            C7348a.this.A().getApplicationContext().getPackageManager().hasSystemFeature((String) promise);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (Ub.u) obj2);
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: zb.a$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f66044a = new j();

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6027q invoke() {
            return O.o(String.class);
        }
    }

    /* JADX INFO: renamed from: zb.a$k */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class k implements Function1 {
        public k() {
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            AbstractC5504s.h(objArr, "<destruct>");
            return Boolean.valueOf(C7348a.this.A().getApplicationContext().getPackageManager().hasSystemFeature((String) objArr[0]));
        }
    }

    /* JADX INFO: renamed from: zb.a$l */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class l implements InterfaceC5082a {
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            String[] strArr = Build.SUPPORTED_ABIS;
            if (strArr != null) {
                if (!(strArr.length == 0)) {
                    return strArr;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: zb.a$m */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class m implements InterfaceC5082a {
        public m() {
        }

        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return C7348a.this.C();
        }
    }

    /* JADX INFO: renamed from: zb.a$n */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class n implements InterfaceC5082a {
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return Build.VERSION.RELEASE;
        }
    }

    /* JADX INFO: renamed from: zb.a$o */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class o implements InterfaceC5082a {
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return Build.DISPLAY;
        }
    }

    /* JADX INFO: renamed from: zb.a$p */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class p implements InterfaceC5082a {
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return Build.ID;
        }
    }

    /* JADX INFO: renamed from: zb.a$q */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class q implements InterfaceC5082a {
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return Build.FINGERPRINT;
        }
    }

    /* JADX INFO: renamed from: zb.a$r */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class r implements InterfaceC5082a {
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
    }

    /* JADX INFO: renamed from: zb.a$s */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class s implements InterfaceC5082a {
        public s() {
        }

        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return Build.VERSION.SDK_INT <= 31 ? Settings.Secure.getString(C7348a.this.A().getContentResolver(), "bluetooth_name") : Settings.Global.getString(C7348a.this.A().getContentResolver(), "device_name");
        }
    }

    /* JADX INFO: renamed from: zb.a$t */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class t implements InterfaceC5082a {
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return Boolean.valueOf(!C7348a.INSTANCE.f());
        }
    }

    /* JADX INFO: renamed from: zb.a$u */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class u implements InterfaceC5082a {
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return Build.BRAND;
        }
    }

    /* JADX INFO: renamed from: zb.a$v */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class v implements InterfaceC5082a {
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return Build.MANUFACTURER;
        }
    }

    /* JADX INFO: renamed from: zb.a$w */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class w implements InterfaceC5082a {
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return Build.MODEL;
        }
    }

    /* JADX INFO: renamed from: zb.a$x */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class x implements InterfaceC5082a {
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return Build.DEVICE;
        }
    }

    /* JADX INFO: renamed from: zb.a$y */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class y implements InterfaceC5082a {
        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return Build.PRODUCT;
        }
    }

    /* JADX INFO: renamed from: zb.a$z */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class z implements InterfaceC5082a {
        public z() {
        }

        @Override // ie.InterfaceC5082a
        public final Object invoke() {
            return Integer.valueOf(C7348a.this.B());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context A() throws cc.i {
        Context contextB = i().B();
        if (contextB != null) {
            return contextB;
        }
        throw new cc.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int B() {
        return M5.b.d(A());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String C() {
        String str = Build.VERSION.BASE_OS;
        AbstractC5504s.e(str);
        if (str.length() <= 0) {
            str = null;
        }
        return str == null ? "Android" : str;
    }

    @Override // gc.c
    public gc.e n() {
        dc.g lVar;
        X3.a.c("[ExpoModulesCore] " + (getClass() + ".ModuleDefinition"));
        try {
            gc.d dVar = new gc.d(this);
            dVar.s("ExpoDevice");
            C4931c c4931c = new C4931c("isDevice");
            c4931c.b(new t());
            dVar.l().put("isDevice", c4931c);
            C4931c c4931c2 = new C4931c("brand");
            c4931c2.b(new u());
            dVar.l().put("brand", c4931c2);
            C4931c c4931c3 = new C4931c("manufacturer");
            c4931c3.b(new v());
            dVar.l().put("manufacturer", c4931c3);
            C4931c c4931c4 = new C4931c("modelName");
            c4931c4.b(new w());
            dVar.l().put("modelName", c4931c4);
            C4931c c4931c5 = new C4931c("designName");
            c4931c5.b(new x());
            dVar.l().put("designName", c4931c5);
            C4931c c4931c6 = new C4931c("productName");
            c4931c6.b(new y());
            dVar.l().put("productName", c4931c6);
            C4931c c4931c7 = new C4931c("deviceYearClass");
            c4931c7.b(new z());
            dVar.l().put("deviceYearClass", c4931c7);
            C4931c c4931c8 = new C4931c("totalMemory");
            c4931c8.b(new A());
            dVar.l().put("totalMemory", c4931c8);
            C4931c c4931c9 = new C4931c("deviceType");
            c4931c9.b(new B());
            dVar.l().put("deviceType", c4931c9);
            C4931c c4931c10 = new C4931c("supportedCpuArchitectures");
            c4931c10.b(new l());
            dVar.l().put("supportedCpuArchitectures", c4931c10);
            C4931c c4931c11 = new C4931c("osName");
            c4931c11.b(new m());
            dVar.l().put("osName", c4931c11);
            C4931c c4931c12 = new C4931c("osVersion");
            c4931c12.b(new n());
            dVar.l().put("osVersion", c4931c12);
            C4931c c4931c13 = new C4931c("osBuildId");
            c4931c13.b(new o());
            dVar.l().put("osBuildId", c4931c13);
            C4931c c4931c14 = new C4931c("osInternalBuildId");
            c4931c14.b(new p());
            dVar.l().put("osInternalBuildId", c4931c14);
            C4931c c4931c15 = new C4931c("osBuildFingerprint");
            c4931c15.b(new q());
            dVar.l().put("osBuildFingerprint", c4931c15);
            C4931c c4931c16 = new C4931c("platformApiLevel");
            c4931c16.b(new r());
            dVar.l().put("platformApiLevel", c4931c16);
            C4931c c4931c17 = new C4931c("deviceName");
            c4931c17.b(new s());
            dVar.l().put("deviceName", c4931c17);
            C5972b[] c5972bArr = new C5972b[0];
            c cVar = new c();
            Class cls = Integer.TYPE;
            boolean zC = AbstractC5504s.c(Integer.class, cls);
            Class cls2 = Float.TYPE;
            Class cls3 = Double.TYPE;
            Class cls4 = Boolean.TYPE;
            dVar.k().put("getDeviceTypeAsync", zC ? new dc.l("getDeviceTypeAsync", c5972bArr, cVar) : AbstractC5504s.c(Integer.class, cls4) ? new dc.h("getDeviceTypeAsync", c5972bArr, cVar) : AbstractC5504s.c(Integer.class, cls3) ? new dc.i("getDeviceTypeAsync", c5972bArr, cVar) : AbstractC5504s.c(Integer.class, cls2) ? new dc.j("getDeviceTypeAsync", c5972bArr, cVar) : AbstractC5504s.c(Integer.class, String.class) ? new dc.n("getDeviceTypeAsync", c5972bArr, cVar) : new dc.s("getDeviceTypeAsync", c5972bArr, cVar));
            C5972b[] c5972bArr2 = new C5972b[0];
            d dVar2 = new d();
            dVar.k().put("getUptimeAsync", AbstractC5504s.c(Double.class, cls) ? new dc.l("getUptimeAsync", c5972bArr2, dVar2) : AbstractC5504s.c(Double.class, cls4) ? new dc.h("getUptimeAsync", c5972bArr2, dVar2) : AbstractC5504s.c(Double.class, cls3) ? new dc.i("getUptimeAsync", c5972bArr2, dVar2) : AbstractC5504s.c(Double.class, cls2) ? new dc.j("getUptimeAsync", c5972bArr2, dVar2) : AbstractC5504s.c(Double.class, String.class) ? new dc.n("getUptimeAsync", c5972bArr2, dVar2) : new dc.s("getUptimeAsync", c5972bArr2, dVar2));
            C5972b[] c5972bArr3 = new C5972b[0];
            e eVar = new e();
            dVar.k().put("getMaxMemoryAsync", AbstractC5504s.c(Double.class, cls) ? new dc.l("getMaxMemoryAsync", c5972bArr3, eVar) : AbstractC5504s.c(Double.class, cls4) ? new dc.h("getMaxMemoryAsync", c5972bArr3, eVar) : AbstractC5504s.c(Double.class, cls3) ? new dc.i("getMaxMemoryAsync", c5972bArr3, eVar) : AbstractC5504s.c(Double.class, cls2) ? new dc.j("getMaxMemoryAsync", c5972bArr3, eVar) : AbstractC5504s.c(Double.class, String.class) ? new dc.n("getMaxMemoryAsync", c5972bArr3, eVar) : new dc.s("getMaxMemoryAsync", c5972bArr3, eVar));
            C5972b[] c5972bArr4 = new C5972b[0];
            f fVar = new f();
            dVar.k().put("isRootedExperimentalAsync", AbstractC5504s.c(Boolean.class, cls) ? new dc.l("isRootedExperimentalAsync", c5972bArr4, fVar) : AbstractC5504s.c(Boolean.class, cls4) ? new dc.h("isRootedExperimentalAsync", c5972bArr4, fVar) : AbstractC5504s.c(Boolean.class, cls3) ? new dc.i("isRootedExperimentalAsync", c5972bArr4, fVar) : AbstractC5504s.c(Boolean.class, cls2) ? new dc.j("isRootedExperimentalAsync", c5972bArr4, fVar) : AbstractC5504s.c(Boolean.class, String.class) ? new dc.n("isRootedExperimentalAsync", c5972bArr4, fVar) : new dc.s("isRootedExperimentalAsync", c5972bArr4, fVar));
            C5972b[] c5972bArr5 = new C5972b[0];
            g gVar = new g();
            dVar.k().put("isSideLoadingEnabledAsync", AbstractC5504s.c(Boolean.class, cls) ? new dc.l("isSideLoadingEnabledAsync", c5972bArr5, gVar) : AbstractC5504s.c(Boolean.class, cls4) ? new dc.h("isSideLoadingEnabledAsync", c5972bArr5, gVar) : AbstractC5504s.c(Boolean.class, cls3) ? new dc.i("isSideLoadingEnabledAsync", c5972bArr5, gVar) : AbstractC5504s.c(Boolean.class, cls2) ? new dc.j("isSideLoadingEnabledAsync", c5972bArr5, gVar) : AbstractC5504s.c(Boolean.class, String.class) ? new dc.n("isSideLoadingEnabledAsync", c5972bArr5, gVar) : new dc.s("isSideLoadingEnabledAsync", c5972bArr5, gVar));
            C5972b[] c5972bArr6 = new C5972b[0];
            h hVar = new h();
            dVar.k().put("getPlatformFeaturesAsync", AbstractC5504s.c(List.class, cls) ? new dc.l("getPlatformFeaturesAsync", c5972bArr6, hVar) : AbstractC5504s.c(List.class, cls4) ? new dc.h("getPlatformFeaturesAsync", c5972bArr6, hVar) : AbstractC5504s.c(List.class, cls3) ? new dc.i("getPlatformFeaturesAsync", c5972bArr6, hVar) : AbstractC5504s.c(List.class, cls2) ? new dc.j("getPlatformFeaturesAsync", c5972bArr6, hVar) : AbstractC5504s.c(List.class, String.class) ? new dc.n("getPlatformFeaturesAsync", c5972bArr6, hVar) : new dc.s("getPlatformFeaturesAsync", c5972bArr6, hVar));
            if (AbstractC5504s.c(String.class, Ub.u.class)) {
                lVar = new dc.f("hasPlatformFeatureAsync", new C5972b[0], new i());
            } else {
                X xM = dVar.m();
                C5972b c5972b = (C5972b) C5974d.f55938a.a().get(new Pair(O.b(String.class), Boolean.FALSE));
                if (c5972b == null) {
                    c5972b = new C5972b(new M(O.b(String.class), false, j.f66044a), xM);
                }
                C5972b[] c5972bArr7 = {c5972b};
                k kVar = new k();
                lVar = AbstractC5504s.c(Boolean.class, cls) ? new dc.l("hasPlatformFeatureAsync", c5972bArr7, kVar) : AbstractC5504s.c(Boolean.class, cls4) ? new dc.h("hasPlatformFeatureAsync", c5972bArr7, kVar) : AbstractC5504s.c(Boolean.class, cls3) ? new dc.i("hasPlatformFeatureAsync", c5972bArr7, kVar) : AbstractC5504s.c(Boolean.class, cls2) ? new dc.j("hasPlatformFeatureAsync", c5972bArr7, kVar) : AbstractC5504s.c(Boolean.class, String.class) ? new dc.n("hasPlatformFeatureAsync", c5972bArr7, kVar) : new dc.s("hasPlatformFeatureAsync", c5972bArr7, kVar);
            }
            dVar.k().put("hasPlatformFeatureAsync", lVar);
            gc.e eVarU = dVar.u();
            X3.a.f();
            return eVarU;
        } catch (Throwable th2) {
            X3.a.f();
            throw th2;
        }
    }
}
