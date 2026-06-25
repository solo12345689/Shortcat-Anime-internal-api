package io.sentry.react;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.util.Base64;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.AbstractActivityC2842v;
import androidx.fragment.app.K;
import app.notifee.core.event.LogEvent;
import com.adjust.sdk.Constants;
import com.facebook.hermes.instrumentation.HermesSamplingProfiler;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.JavascriptException;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.react.RNPurchasesModule;
import io.sentry.AbstractC5204g2;
import io.sentry.B3;
import io.sentry.C5191e;
import io.sentry.C5322z3;
import io.sentry.EnumC5215i3;
import io.sentry.EnumC5278t1;
import io.sentry.G1;
import io.sentry.H;
import io.sentry.ILogger;
import io.sentry.InterfaceC5187d0;
import io.sentry.InterfaceC5247p0;
import io.sentry.InterfaceC5249p2;
import io.sentry.Q1;
import io.sentry.S1;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.V2;
import io.sentry.Y;
import io.sentry.Z2;
import io.sentry.android.core.AnrIntegration;
import io.sentry.android.core.C5131g0;
import io.sentry.android.core.C5158q0;
import io.sentry.android.core.C5174z;
import io.sentry.android.core.J0;
import io.sentry.android.core.M;
import io.sentry.android.core.NdkIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.ViewHierarchyEventProcessor;
import io.sentry.android.core.Y0;
import io.sentry.android.core.Z0;
import io.sentry.android.core.internal.util.G;
import io.sentry.android.core.internal.util.z;
import io.sentry.protocol.C5259i;
import io.sentry.protocol.I;
import io.sentry.protocol.J;
import io.sentry.protocol.x;
import io.sentry.protocol.y;
import io.sentry.util.AbstractC5291d;
import io.sentry.util.AbstractC5296i;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class n {

    /* JADX INFO: renamed from: o */
    private static final ILogger f51228o;

    /* JADX INFO: renamed from: p */
    private static final C5131g0 f51229p;

    /* JADX INFO: renamed from: q */
    private static final Charset f51230q;

    /* JADX INFO: renamed from: r */
    static long f51231r;

    /* JADX INFO: renamed from: a */
    private final ReactApplicationContext f51232a;

    /* JADX INFO: renamed from: b */
    private final PackageInfo f51233b;

    /* JADX INFO: renamed from: d */
    private boolean f51235d;

    /* JADX INFO: renamed from: c */
    private FrameMetricsAggregator f51234c = null;

    /* JADX INFO: renamed from: e */
    private int f51236e = 101;

    /* JADX INFO: renamed from: f */
    private M f51237f = null;

    /* JADX INFO: renamed from: g */
    private boolean f51238g = false;

    /* JADX INFO: renamed from: h */
    private String f51239h = null;

    /* JADX INFO: renamed from: i */
    private String f51240i = null;

    /* JADX INFO: renamed from: j */
    private InterfaceC5187d0 f51241j = null;

    /* JADX INFO: renamed from: l */
    private long f51243l = 5242880;

    /* JADX INFO: renamed from: k */
    private final Runnable f51242k = x();

    /* JADX INFO: renamed from: m */
    private final InterfaceC5249p2 f51244m = new Z0();

    /* JADX INFO: renamed from: n */
    private final io.sentry.util.s f51245n = new io.sentry.util.s();

    static {
        C5174z c5174z = new C5174z(NativeRNSentrySpec.NAME);
        f51228o = c5174z;
        f51229p = new C5131g0(c5174z);
        f51230q = Charset.forName(Constants.ENCODING);
        f51231r = -1L;
    }

    public n(ReactApplicationContext reactApplicationContext) {
        this.f51233b = S(reactApplicationContext);
        this.f51232a = reactApplicationContext;
    }

    private Activity O() {
        return this.f51232a.getCurrentActivity();
    }

    private static PackageInfo S(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused) {
            f51228o.c(EnumC5215i3.WARNING, "Error getting package info.", new Object[0]);
            return null;
        }
    }

    private String T() {
        if (this.f51240i == null) {
            this.f51240i = new File(V().getCacheDir(), "sentry/react").getAbsolutePath();
        }
        File file = new File(this.f51240i, "profiling_trace");
        file.mkdirs();
        return file.getAbsolutePath();
    }

    private String U() {
        if (this.f51238g) {
            return this.f51239h;
        }
        this.f51238g = true;
        List listA = new io.sentry.android.core.internal.debugmeta.a(V(), f51228o).a();
        if (listA == null) {
            return null;
        }
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            String strM = AbstractC5291d.m((Properties) it.next());
            this.f51239h = strM;
            if (strM != null) {
                f51228o.c(EnumC5215i3.INFO, "Proguard uuid found: " + this.f51239h, new Object[0]);
                return this.f51239h;
            }
        }
        f51228o.c(EnumC5215i3.WARNING, "No proguard uuid found in debug meta properties file!", new Object[0]);
        return null;
    }

    private ReactApplicationContext V() {
        return this.f51232a;
    }

    private B3 W(ReadableMap readableMap) {
        ReadableMap map;
        B3 b32 = new B3(false, new io.sentry.protocol.r("sentry.javascript.react-native", "7.11.0"));
        if (readableMap.hasKey("replaysSessionSampleRate") || readableMap.hasKey("replaysOnErrorSampleRate")) {
            b32.N(readableMap.hasKey("replaysSessionSampleRate") ? Double.valueOf(readableMap.getDouble("replaysSessionSampleRate")) : null);
            b32.J(readableMap.hasKey("replaysOnErrorSampleRate") ? Double.valueOf(readableMap.getDouble("replaysOnErrorSampleRate")) : null);
            if (readableMap.hasKey("replaysSessionQuality")) {
                b32.K(j0(readableMap.getString("replaysSessionQuality")));
            }
            if (readableMap.hasKey("mobileReplayOptions") && (map = readableMap.getMap("mobileReplayOptions")) != null) {
                b32.C(!map.hasKey("maskAllText") || map.getBoolean("maskAllText"));
                b32.B(!map.hasKey("maskAllImages") || map.getBoolean("maskAllImages"));
                if (!map.hasKey("maskAllVectors") || map.getBoolean("maskAllVectors")) {
                    b32.a("com.horcrux.svg.SvgView");
                }
                if (map.hasKey("screenshotStrategy")) {
                    b32.L(k0(map.getString("screenshotStrategy")));
                }
                b32.D(io.sentry.react.replay.b.class.getName());
                b32.O(io.sentry.react.replay.c.class.getName());
                return b32;
            }
        }
        return b32;
    }

    public static String Y(String str) {
        if (str == null) {
            return null;
        }
        try {
            URI uri = new URI(str);
            return uri.getScheme() + "://" + uri.getHost();
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    private void Z() {
        K kC;
        s sVar = new s(f51229p, this.f51242k, f51228o);
        AbstractActivityC2842v abstractActivityC2842v = (AbstractActivityC2842v) O();
        if (abstractActivityC2842v == null || (kC = abstractActivityC2842v.C()) == null) {
            return;
        }
        kC.n1(sVar, true);
    }

    private void a0() {
        K kC;
        io.sentry.react.replay.a aVar = new io.sentry.react.replay.a(f51228o);
        Activity activityO = O();
        if ((activityO instanceof AbstractActivityC2842v) && (kC = ((AbstractActivityC2842v) activityO).C()) != null) {
            kC.n1(aVar, true);
        }
    }

    public static /* synthetic */ C5191e d(String str, String str2, C5191e c5191e, H h10) {
        Object objS = c5191e.s("url");
        String str3 = objS instanceof String ? (String) objS : "";
        if ("http".equals(c5191e.y())) {
            if (str != null && str3.startsWith(str)) {
                return null;
            }
            if (str2 != null && str3.startsWith(str2)) {
                return null;
            }
        }
        return c5191e;
    }

    private void d0() {
        if (this.f51241j == null) {
            this.f51241j = new Z2();
        }
        String strT = T();
        int micros = ((int) TimeUnit.SECONDS.toMicros(1L)) / this.f51236e;
        ReactApplicationContext reactApplicationContext = this.f51232a;
        ILogger iLogger = f51228o;
        this.f51237f = new M(strT, micros, new G(reactApplicationContext, iLogger, f51229p), this.f51241j, iLogger);
    }

    public static /* synthetic */ void e(ReadableMap readableMap, ReadableMap readableMap2, Y y10) {
        ReadableMap map;
        if (readableMap == null && readableMap2 == null) {
            y10.i(null);
            return;
        }
        I i10 = new I();
        if (readableMap != null) {
            if (readableMap.hasKey("email")) {
                i10.m(readableMap.getString("email"));
            }
            if (readableMap.hasKey(DiagnosticsEntry.ID_KEY)) {
                i10.o(readableMap.getString(DiagnosticsEntry.ID_KEY));
            }
            if (readableMap.hasKey("username")) {
                i10.r(readableMap.getString("username"));
            }
            if (readableMap.hasKey("ip_address")) {
                i10.p(readableMap.getString("ip_address"));
            }
            if (readableMap.hasKey("geo") && (map = readableMap.getMap("geo")) != null) {
                C5259i c5259i = new C5259i();
                if (map.hasKey("city")) {
                    c5259i.d(map.getString("city"));
                }
                if (map.hasKey("country_code")) {
                    c5259i.e(map.getString("country_code"));
                }
                if (map.hasKey("region")) {
                    c5259i.f(map.getString("region"));
                }
                i10.n(c5259i);
            }
        }
        if (readableMap2 != null) {
            HashMap map2 = new HashMap();
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap2.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                String string = readableMap2.getString(strNextKey);
                if (string != null) {
                    map2.put(strNextKey, string);
                }
            }
            i10.l(map2);
        }
        y10.i(i10);
    }

    private boolean e0() {
        return this.f51235d && this.f51234c != null;
    }

    public static /* synthetic */ void f(ReadableMap readableMap, String str, Y y10) {
        if (readableMap == null) {
            y10.E(str);
        } else {
            y10.w(str, readableMap.toHashMap());
        }
    }

    private boolean f0(B3 b32) {
        return (b32.q() == null && b32.l() == null) ? false : true;
    }

    public /* synthetic */ void g0() {
        w.f(Double.valueOf(this.f51244m.now().m() / 1.0E9d));
    }

    public static /* synthetic */ void h(byte[][] bArr, Activity activity, CountDownLatch countDownLatch) {
        bArr[0] = z.f(activity, f51228o, f51229p);
        countDownLatch.countDown();
    }

    public /* synthetic */ V2 h0(SentryAndroidOptions sentryAndroidOptions, V2 v22, H h10) {
        t0(v22);
        n(v22, sentryAndroidOptions.getSdkVersion());
        return v22;
    }

    public /* synthetic */ void i0(ReadableMap readableMap, SentryAndroidOptions sentryAndroidOptions) {
        X(sentryAndroidOptions, readableMap, f51228o);
    }

    public static /* synthetic */ void j(ReadableMap readableMap, Y y10) {
        y10.a(a.a(readableMap));
        String strB = a.b(readableMap);
        if (strB != null) {
            y10.I(strB);
        }
    }

    private B3.a j0(String str) {
        if (str == null) {
            return B3.a.MEDIUM;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        switch (lowerCase) {
        }
        return B3.a.MEDIUM;
    }

    private S1 k0(String str) {
        if (str == null) {
            return S1.PIXEL_COPY;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return !lowerCase.equals("canvas") ? S1.PIXEL_COPY : S1.CANVAS;
    }

    private String m0(File file) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        try {
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    String string = sb2.toString();
                    bufferedReader.close();
                    return string;
                }
                sb2.append(line);
                sb2.append('\n');
            }
        } catch (Throwable th2) {
            try {
                bufferedReader.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private void n(V2 v22, io.sentry.protocol.r rVar) {
        io.sentry.protocol.r rVarL = v22.L();
        if (rVarL == null || !"sentry.javascript.react-native".equals(rVarL.f()) || rVar == null) {
            return;
        }
        Set<y> setG = rVar.g();
        if (setG != null) {
            for (y yVar : setG) {
                rVarL.d(yVar.a(), yVar.b());
            }
        }
        Set setE = rVar.e();
        if (setE != null) {
            Iterator it = setE.iterator();
            while (it.hasNext()) {
                rVarL.c((String) it.next());
            }
        }
        v22.b0(rVarL);
    }

    private boolean r() {
        return true;
    }

    private void s0(V2 v22, String str) {
        v22.d0("event.origin", "android");
        v22.d0("event.environment", str);
    }

    private void t0(V2 v22) {
        io.sentry.protocol.r rVarL = v22.L();
        if (rVarL != null) {
            String strF = rVarL.f();
            strF.getClass();
            if (strF.equals("sentry.java.android.react-native")) {
                s0(v22, "java");
            } else if (strF.equals("sentry.native.android.react-native")) {
                s0(v22, "native");
            }
        }
    }

    private void u(SentryAndroidOptions sentryAndroidOptions, ReadableMap readableMap) {
        ReadableMap map;
        ReadableMap map2;
        if (readableMap.hasKey("_experiments") && (map = readableMap.getMap("_experiments")) != null && map.hasKey("androidProfilingOptions") && (map2 = map.getMap("androidProfilingOptions")) != null) {
            if (map2.hasKey("profileSessionSampleRate")) {
                double d10 = map2.getDouble("profileSessionSampleRate");
                sentryAndroidOptions.setProfileSessionSampleRate(Double.valueOf(d10));
                f51228o.c(EnumC5215i3.INFO, String.format("Android UI Profiling profileSessionSampleRate set to: %.2f", Double.valueOf(d10)), new Object[0]);
            }
            if (map2.hasKey("lifecycle")) {
                String string = map2.getString("lifecycle");
                if ("manual".equalsIgnoreCase(string)) {
                    sentryAndroidOptions.setProfileLifecycle(EnumC5278t1.MANUAL);
                    f51228o.c(EnumC5215i3.INFO, "Android UI Profile Lifecycle set to MANUAL", new Object[0]);
                } else if ("trace".equalsIgnoreCase(string)) {
                    sentryAndroidOptions.setProfileLifecycle(EnumC5278t1.TRACE);
                    f51228o.c(EnumC5215i3.INFO, "Android UI Profile Lifecycle set to TRACE", new Object[0]);
                }
            }
            if (map2.hasKey("startOnAppStart")) {
                boolean z10 = map2.getBoolean("startOnAppStart");
                sentryAndroidOptions.setStartProfilerOnAppStart(z10);
                f51228o.c(EnumC5215i3.INFO, String.format("Android UI Profiling startOnAppStart set to %b", Boolean.valueOf(z10)), new Object[0]);
            }
        }
    }

    private Runnable x() {
        return new Runnable() { // from class: io.sentry.react.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f51222a.g0();
            }
        };
    }

    private static byte[] z0(final Activity activity) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final byte[][] bArr = {new byte[0]};
        Runnable runnable = new Runnable() { // from class: io.sentry.react.i
            @Override // java.lang.Runnable
            public final void run() {
                n.h(bArr, activity, countDownLatch);
            }
        };
        if (UiThreadUtil.isOnUiThread()) {
            runnable.run();
        } else {
            UiThreadUtil.runOnUiThread(runnable);
        }
        try {
            countDownLatch.await(2L, TimeUnit.SECONDS);
            return bArr[0];
        } catch (InterruptedException unused) {
            f51228o.c(EnumC5215i3.ERROR, "Screenshot process was interrupted.", new Object[0]);
            return new byte[0];
        }
    }

    public void A(ReadableArray readableArray, Promise promise) {
        byte[] bArr = new byte[readableArray.size()];
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            bArr[i10] = (byte) readableArray.getInt(i10);
        }
        promise.resolve(Base64.encodeToString(bArr, 0));
    }

    protected void A0(SentryAndroidOptions sentryAndroidOptions, ReadableMap readableMap) {
        ReadableArray array = readableMap.hasKey("ignoreErrorsRegex") ? readableMap.getArray("ignoreErrorsRegex") : null;
        ReadableArray array2 = readableMap.hasKey("ignoreErrorsStr") ? readableMap.getArray("ignoreErrorsStr") : null;
        if (array == null && array2 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList((array != null ? array.size() : 0) + (array2 != null ? array2.size() : 0));
        if (array != null) {
            for (int i10 = 0; i10 < array.size(); i10++) {
                arrayList.add(array.getString(i10));
            }
        }
        if (array2 != null) {
            for (int i11 = 0; i11 < array2.size(); i11++) {
                arrayList.add(C5322z3.DEFAULT_PROPAGATION_TARGETS + Pattern.quote(array2.getString(i11)) + C5322z3.DEFAULT_PROPAGATION_TARGETS);
            }
        }
        sentryAndroidOptions.setIgnoredErrors(arrayList);
    }

    public void B(Promise promise) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(V().getResources().getAssets().open("modules.json"));
            try {
                byte[] bArr = new byte[bufferedInputStream.available()];
                bufferedInputStream.read(bArr);
                bufferedInputStream.close();
                promise.resolve(new String(bArr, f51230q));
                bufferedInputStream.close();
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (FileNotFoundException unused) {
            promise.resolve(null);
        } catch (Throwable unused2) {
            f51228o.c(EnumC5215i3.WARNING, "Fetching JS Modules failed.", new Object[0]);
            promise.resolve(null);
        }
    }

    public void C(Promise promise) {
        D(promise, io.sentry.android.core.performance.h.q(), J0.i(), f51228o);
    }

    protected void D(Promise promise, io.sentry.android.core.performance.h hVar, Map map, ILogger iLogger) {
        if (!hVar.s()) {
            iLogger.c(EnumC5215i3.WARNING, "Invalid app start data: app not launched in foreground.", new Object[0]);
            promise.resolve(null);
            return;
        }
        WritableMap writableMap = (WritableMap) b.c(map);
        long jP = hVar.l().p();
        long j10 = f51231r;
        boolean z10 = j10 > 0 && j10 == jP;
        writableMap.putBoolean("has_fetched", z10);
        if (f51231r < 0) {
            iLogger.c(EnumC5215i3.DEBUG, "App Start data reported to the RN layer for the first time.", new Object[0]);
        } else if (z10) {
            iLogger.c(EnumC5215i3.DEBUG, "App Start data already fetched from native before.", new Object[0]);
        } else {
            iLogger.c(EnumC5215i3.DEBUG, "App Start data updated, reporting to the RN layer again.", new Object[0]);
        }
        f51231r = jP;
        hVar.t();
        promise.resolve(writableMap);
    }

    public void E(Promise promise) {
        F(promise, Q1.b().h(), V().getApplicationContext(), J0.j());
    }

    protected void F(Promise promise, C5322z3 c5322z3, Context context, Y y10) {
        if (!(c5322z3 instanceof SentryAndroidOptions)) {
            promise.resolve(null);
            return;
        }
        if (context == null) {
            promise.resolve(null);
            return;
        }
        if (y10 != null) {
            Iterator it = y10.r().iterator();
            while (it.hasNext()) {
                if (RNPurchasesModule.PLATFORM_NAME.equals(((C5191e) it.next()).w())) {
                    it.remove();
                }
            }
        }
        promise.resolve(b.c(J0.k(context, (SentryAndroidOptions) c5322z3, y10)));
    }

    public void G(Promise promise) {
        int i10;
        int i11;
        int i12;
        SparseIntArray sparseIntArray;
        if (!e0()) {
            promise.resolve(null);
            return;
        }
        try {
            SparseIntArray[] sparseIntArrayArrB = this.f51234c.b();
            if (sparseIntArrayArrB == null || (sparseIntArray = sparseIntArrayArrB[0]) == null) {
                i10 = 0;
                i11 = 0;
                i12 = 0;
            } else {
                i10 = 0;
                i11 = 0;
                i12 = 0;
                for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
                    int iKeyAt = sparseIntArray.keyAt(i13);
                    int iValueAt = sparseIntArray.valueAt(i13);
                    i10 += iValueAt;
                    if (iKeyAt > 700) {
                        i12 += iValueAt;
                    } else if (iKeyAt > 16) {
                        i11 += iValueAt;
                    }
                }
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("totalFrames", i10);
            writableMapCreateMap.putInt("slowFrames", i11);
            writableMapCreateMap.putInt("frozenFrames", i12);
            promise.resolve(writableMapCreateMap);
        } catch (Throwable unused) {
            f51228o.c(EnumC5215i3.WARNING, "Error fetching native frames.", new Object[0]);
            promise.resolve(null);
        }
    }

    public void H(Promise promise) {
        I(promise, Q1.b().h(), V().getApplicationContext(), J0.j());
    }

    protected void I(Promise promise, C5322z3 c5322z3, Context context, Y y10) {
        if (!(c5322z3 instanceof SentryAndroidOptions) || context == null) {
            promise.resolve(null);
            return;
        }
        Object obj = J0.k(context, (SentryAndroidOptions) c5322z3, y10).get("contexts");
        if (!(obj instanceof Map)) {
            promise.resolve(null);
            return;
        }
        Map map = (Map) obj;
        HashMap map2 = new HashMap();
        if (map.containsKey("os")) {
            map2.put("os", map.get("os"));
        }
        if (map.containsKey("device")) {
            map2.put("device", map.get("device"));
        }
        map2.put("release", c5322z3.getRelease());
        HashMap map3 = new HashMap();
        map3.put("contexts", map2);
        promise.resolve(b.c(map3));
    }

    public String J() {
        return this.f51233b.packageName;
    }

    public void K(Promise promise) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(DiagnosticsEntry.ID_KEY, this.f51233b.packageName);
        writableMapCreateMap.putString(DiagnosticsEntry.VERSION_KEY, this.f51233b.versionName);
        writableMapCreateMap.putString("build", String.valueOf(this.f51233b.versionCode));
        promise.resolve(writableMapCreateMap);
    }

    public void L(Promise promise) {
        io.sentry.protocol.r sdkVersion = Q1.b().h().getSdkVersion();
        if (sdkVersion == null) {
            promise.resolve(null);
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("name", sdkVersion.f());
        writableNativeMap.putString(DiagnosticsEntry.VERSION_KEY, sdkVersion.h());
        promise.resolve(writableNativeMap);
    }

    public void M(Promise promise) {
        Activity activityO = O();
        ILogger iLogger = f51228o;
        J jE = ViewHierarchyEventProcessor.e(activityO, iLogger);
        if (jE == null) {
            iLogger.c(EnumC5215i3.ERROR, "Could not get ViewHierarchy.", new Object[0]);
            promise.resolve(null);
            return;
        }
        byte[] bArrC = io.sentry.util.o.c(Q1.b().h().getSerializer(), iLogger, jE);
        if (bArrC == null) {
            iLogger.c(EnumC5215i3.ERROR, "Could not serialize ViewHierarchy.", new Object[0]);
            promise.resolve(null);
        } else {
            if (bArrC.length < 1) {
                iLogger.c(EnumC5215i3.ERROR, "Got empty bytes array after serializing ViewHierarchy.", new Object[0]);
                promise.resolve(null);
                return;
            }
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            for (byte b10 : bArrC) {
                writableNativeArray.pushInt(b10);
            }
            promise.resolve(writableNativeArray);
        }
    }

    protected Context N() {
        Context applicationContext = V().getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        f51228o.c(EnumC5215i3.ERROR, "ApplicationContext is null, using ReactApplicationContext fallback.", new Object[0]);
        return V();
    }

    public String P() {
        x xVarG;
        Y yJ = J0.j();
        if (yJ == null || (xVarG = yJ.G()) == x.f51153b) {
            return null;
        }
        return xVarG.toString();
    }

    public void Q(String str, Promise promise) {
        try {
            InputStream inputStreamOpenInputStream = V().getContentResolver().openInputStream(Uri.parse(str));
            try {
                if (inputStreamOpenInputStream == null) {
                    String str2 = "File not found for uri: " + str;
                    f51228o.c(EnumC5215i3.ERROR, str2, new Object[0]);
                    promise.reject(new Exception(str2));
                    if (inputStreamOpenInputStream == null) {
                        return;
                    }
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET];
                    while (true) {
                        int i10 = inputStreamOpenInputStream.read(bArr);
                        if (i10 == -1) {
                            break;
                        } else {
                            byteArrayOutputStream.write(bArr, 0, i10);
                        }
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    WritableArray writableArrayCreateArray = Arguments.createArray();
                    for (byte b10 : byteArray) {
                        writableArrayCreateArray.pushInt(b10 & 255);
                    }
                    promise.resolve(writableArrayCreateArray);
                }
                inputStreamOpenInputStream.close();
            } finally {
            }
        } catch (IOException e10) {
            String str3 = "Error reading uri: " + str + ": " + e10.getMessage();
            f51228o.c(EnumC5215i3.ERROR, str3, new Object[0]);
            promise.reject(new Exception(str3));
        }
    }

    public void R(Promise promise) {
        w.c(promise, this.f51244m);
    }

    protected void X(final SentryAndroidOptions sentryAndroidOptions, ReadableMap readableMap, ILogger iLogger) {
        io.sentry.protocol.r sdkVersion = sentryAndroidOptions.getSdkVersion();
        if (sdkVersion == null) {
            sdkVersion = new io.sentry.protocol.r("sentry.java.android.react-native", "8.31.0");
        } else {
            sdkVersion.i("sentry.java.android.react-native");
        }
        sdkVersion.d("npm:@sentry/react-native", "7.11.0");
        sentryAndroidOptions.setSentryClientName(sdkVersion.f() + "/" + sdkVersion.h());
        sentryAndroidOptions.setNativeSdkName("sentry.native.android.react-native");
        sentryAndroidOptions.setSdkVersion(sdkVersion);
        if (readableMap.hasKey("debug") && readableMap.getBoolean("debug")) {
            sentryAndroidOptions.setDebug(true);
        }
        if (readableMap.hasKey("enabled")) {
            sentryAndroidOptions.setEnabled(readableMap.getBoolean("enabled"));
        }
        if (!readableMap.hasKey("dsn") || readableMap.getString("dsn") == null) {
            sentryAndroidOptions.setDsn("");
        } else {
            String string = readableMap.getString("dsn");
            iLogger.c(EnumC5215i3.INFO, String.format("Starting with DSN: '%s'", string), new Object[0]);
            sentryAndroidOptions.setDsn(string);
        }
        if (readableMap.hasKey("sampleRate")) {
            sentryAndroidOptions.setSampleRate(Double.valueOf(readableMap.getDouble("sampleRate")));
        }
        if (readableMap.hasKey("sendClientReports")) {
            sentryAndroidOptions.setSendClientReports(readableMap.getBoolean("sendClientReports"));
        }
        if (readableMap.hasKey("maxBreadcrumbs")) {
            sentryAndroidOptions.setMaxBreadcrumbs(readableMap.getInt("maxBreadcrumbs"));
        }
        if (readableMap.hasKey("maxCacheItems")) {
            sentryAndroidOptions.setMaxCacheItems(readableMap.getInt("maxCacheItems"));
        }
        if (readableMap.hasKey("environment") && readableMap.getString("environment") != null) {
            sentryAndroidOptions.setEnvironment(readableMap.getString("environment"));
        }
        if (readableMap.hasKey("release") && readableMap.getString("release") != null) {
            sentryAndroidOptions.setRelease(readableMap.getString("release"));
        }
        if (readableMap.hasKey("dist") && readableMap.getString("dist") != null) {
            sentryAndroidOptions.setDist(readableMap.getString("dist"));
        }
        if (readableMap.hasKey("enableAutoSessionTracking")) {
            sentryAndroidOptions.setEnableAutoSessionTracking(readableMap.getBoolean("enableAutoSessionTracking"));
        }
        if (readableMap.hasKey("sessionTrackingIntervalMillis")) {
            sentryAndroidOptions.setSessionTrackingIntervalMillis(readableMap.getInt("sessionTrackingIntervalMillis"));
        }
        if (readableMap.hasKey("shutdownTimeout")) {
            sentryAndroidOptions.setShutdownTimeoutMillis(readableMap.getInt("shutdownTimeout"));
        }
        if (readableMap.hasKey("enableNdkScopeSync")) {
            sentryAndroidOptions.setEnableScopeSync(readableMap.getBoolean("enableNdkScopeSync"));
        }
        if (readableMap.hasKey("attachStacktrace")) {
            sentryAndroidOptions.setAttachStacktrace(readableMap.getBoolean("attachStacktrace"));
        }
        if (readableMap.hasKey("attachThreads")) {
            sentryAndroidOptions.setAttachThreads(readableMap.getBoolean("attachThreads"));
        }
        if (readableMap.hasKey("attachScreenshot")) {
            sentryAndroidOptions.setAttachScreenshot(readableMap.getBoolean("attachScreenshot"));
        }
        if (readableMap.hasKey("attachViewHierarchy")) {
            sentryAndroidOptions.setAttachViewHierarchy(readableMap.getBoolean("attachViewHierarchy"));
        }
        if (readableMap.hasKey("sendDefaultPii")) {
            sentryAndroidOptions.setSendDefaultPii(readableMap.getBoolean("sendDefaultPii"));
        }
        if (readableMap.hasKey("maxQueueSize")) {
            sentryAndroidOptions.setMaxQueueSize(readableMap.getInt("maxQueueSize"));
        }
        if (readableMap.hasKey("enableNdk")) {
            sentryAndroidOptions.setEnableNdk(readableMap.getBoolean("enableNdk"));
        }
        if (readableMap.hasKey("enableLogs")) {
            sentryAndroidOptions.getLogs().c(readableMap.getBoolean("enableLogs"));
        }
        if (readableMap.hasKey("spotlight")) {
            if (readableMap.getType("spotlight") == ReadableType.Boolean) {
                sentryAndroidOptions.setEnableSpotlight(readableMap.getBoolean("spotlight"));
                sentryAndroidOptions.setSpotlightConnectionUrl(readableMap.getString("defaultSidecarUrl"));
            } else if (readableMap.getType("spotlight") == ReadableType.String) {
                sentryAndroidOptions.setEnableSpotlight(true);
                sentryAndroidOptions.setSpotlightConnectionUrl(readableMap.getString("spotlight"));
            }
        }
        B3 b3W = W(readableMap);
        sentryAndroidOptions.setSessionReplay(b3W);
        boolean zC = this.f51245n.c("io.sentry.android.replay.ReplayIntegration", iLogger);
        if (f0(b3W) && zC) {
            sentryAndroidOptions.getReplayController().k(new t());
            a0();
        }
        u(sentryAndroidOptions, readableMap);
        final String strY = Y(readableMap.getString("dsn"));
        final String string2 = readableMap.getString("devServerUrl");
        sentryAndroidOptions.setBeforeBreadcrumb(new C5322z3.a() { // from class: io.sentry.react.m
            @Override // io.sentry.C5322z3.a
            public final C5191e a(C5191e c5191e, H h10) {
                return n.d(strY, string2, c5191e, h10);
            }
        });
        sentryAndroidOptions.addIgnoredExceptionForType(JavascriptException.class);
        A0(sentryAndroidOptions, readableMap);
        sentryAndroidOptions.setBeforeSend(new C5322z3.c() { // from class: io.sentry.react.d
            @Override // io.sentry.C5322z3.c
            public final V2 a(V2 v22, H h10) {
                return this.f51211a.h0(sentryAndroidOptions, v22, h10);
            }
        });
        if (readableMap.hasKey("enableNativeCrashHandling") && !readableMap.getBoolean("enableNativeCrashHandling")) {
            List<InterfaceC5247p0> integrations = sentryAndroidOptions.getIntegrations();
            for (InterfaceC5247p0 interfaceC5247p0 : integrations) {
                if ((interfaceC5247p0 instanceof UncaughtExceptionHandlerIntegration) || (interfaceC5247p0 instanceof AnrIntegration) || (interfaceC5247p0 instanceof NdkIntegration)) {
                    integrations.remove(interfaceC5247p0);
                }
            }
        }
        iLogger.c(EnumC5215i3.INFO, String.format("Native Integrations '%s'", sentryAndroidOptions.getIntegrations()), new Object[0]);
        C5158q0 c5158q0C = C5158q0.c();
        Activity activityO = O();
        if (activityO != null) {
            c5158q0C.d(activityO);
        }
    }

    public void b0(Promise promise) {
        Z();
    }

    public void c0(final ReadableMap readableMap, Promise promise) {
        Y0.g(N(), new AbstractC5204g2.a() { // from class: io.sentry.react.f
            @Override // io.sentry.AbstractC5204g2.a
            public final void a(C5322z3 c5322z3) {
                this.f51215a.i0(readableMap, (SentryAndroidOptions) c5322z3);
            }
        });
        promise.resolve(Boolean.TRUE);
    }

    public void l(final ReadableMap readableMap) {
        AbstractC5204g2.l(new G1() { // from class: io.sentry.react.l
            @Override // io.sentry.G1
            public final void a(Y y10) {
                n.j(readableMap, y10);
            }
        });
    }

    public void l0(String str, Promise promise) {
        if (str != null) {
            promise.resolve(w.d(str));
        } else {
            promise.resolve(null);
        }
    }

    public void m(String str) {
        f51228o.c(EnumC5215i3.ERROR, "addListener of NativeEventEmitter can't be used on Android!", new Object[0]);
    }

    public void n0(double d10) {
        f51228o.c(EnumC5215i3.ERROR, "removeListeners of NativeEventEmitter can't be used on Android!", new Object[0]);
    }

    public void o(String str, ReadableMap readableMap, Promise promise) {
        try {
            J0.f(io.sentry.vendor.a.a(str, 0), (readableMap.hasKey("hardCrashed") && readableMap.getBoolean("hardCrashed")) ? false : true);
        } catch (Throwable unused) {
            f51228o.c(EnumC5215i3.ERROR, "Error while capturing envelope", new Object[0]);
            promise.resolve(Boolean.FALSE);
        }
        promise.resolve(Boolean.TRUE);
    }

    public boolean o0(String str) {
        w.g(str);
        return true;
    }

    public void p(boolean z10, Promise promise) {
        AbstractC5204g2.r().h().getReplayController().l(Boolean.valueOf(z10));
        promise.resolve(P());
    }

    public void q(Promise promise) {
        Activity activityO = O();
        if (activityO == null) {
            f51228o.c(EnumC5215i3.WARNING, "CurrentActivity is null, can't capture screenshot.", new Object[0]);
            promise.resolve(null);
            return;
        }
        byte[] bArrZ0 = z0(activityO);
        if (bArrZ0 == null || bArrZ0.length == 0) {
            f51228o.c(EnumC5215i3.WARNING, "Screenshot is null, screen was not captured.", new Object[0]);
            promise.resolve(null);
            return;
        }
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (byte b10 : bArrZ0) {
            writableNativeArray.pushInt(b10);
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("contentType", "image/png");
        writableNativeMap.putArray("data", writableNativeArray);
        writableNativeMap.putString("filename", "screenshot.png");
        WritableNativeArray writableNativeArray2 = new WritableNativeArray();
        writableNativeArray2.pushMap(writableNativeMap);
        promise.resolve(writableNativeArray2);
    }

    public void r0(final String str, final ReadableMap readableMap) {
        if (str == null) {
            f51228o.c(EnumC5215i3.ERROR, "RNSentry.setContext called with null key, can't change context.", new Object[0]);
        } else {
            AbstractC5204g2.l(new G1() { // from class: io.sentry.react.k
                @Override // io.sentry.G1
                public final void a(Y y10) {
                    n.f(readableMap, str, y10);
                }
            });
        }
    }

    public void s() {
        AbstractC5204g2.l(new G1() { // from class: io.sentry.react.h
            @Override // io.sentry.G1
            public final void a(Y y10) {
                y10.t();
            }
        });
    }

    public void t(Promise promise) {
        AbstractC5204g2.k();
        y();
        promise.resolve(Boolean.TRUE);
    }

    public void u0(final String str, final String str2) {
        if (str == null || str2 == null) {
            f51228o.c(EnumC5215i3.ERROR, "RNSentry.setExtra called with null key or value, can't change extra.", new Object[0]);
        } else {
            AbstractC5204g2.l(new G1() { // from class: io.sentry.react.e
                @Override // io.sentry.G1
                public final void a(Y y10) {
                    y10.d(str, str2);
                }
            });
        }
    }

    public void v() {
        throw new RuntimeException("TEST - Sentry Client Crash (only works in release mode)");
    }

    public void v0(final String str, final String str2) {
        AbstractC5204g2.l(new G1() { // from class: io.sentry.react.g
            @Override // io.sentry.G1
            public final void a(Y y10) {
                y10.b(str, str2);
            }
        });
    }

    public void w(Promise promise) {
        promise.resolve(AbstractC5204g2.E());
    }

    public void w0(final ReadableMap readableMap, final ReadableMap readableMap2) {
        AbstractC5204g2.l(new G1() { // from class: io.sentry.react.c
            @Override // io.sentry.G1
            public final void a(Y y10) {
                n.e(readableMap, readableMap2, y10);
            }
        });
    }

    public WritableMap x0(boolean z10) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (this.f51237f == null && z10) {
            d0();
        }
        try {
            HermesSamplingProfiler.enable();
            M m10 = this.f51237f;
            if (m10 != null) {
                m10.j();
            }
            writableNativeMap.putBoolean("started", true);
            return writableNativeMap;
        } catch (Throwable th2) {
            writableNativeMap.putBoolean("started", false);
            writableNativeMap.putString(LogEvent.LEVEL_ERROR, th2.toString());
            return writableNativeMap;
        }
    }

    public void y() {
        if (e0()) {
            this.f51234c.e();
            this.f51234c = null;
        }
    }

    public WritableMap y0() {
        boolean zIsDebug = Q1.b().h().isDebug();
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        File fileCreateTempFile = null;
        try {
            M m10 = this.f51237f;
            M.b bVarG = m10 != null ? m10.g(false, null) : null;
            HermesSamplingProfiler.disable();
            fileCreateTempFile = File.createTempFile("sampling-profiler-trace", ".cpuprofile", this.f51232a.getCacheDir());
            if (zIsDebug) {
                f51228o.c(EnumC5215i3.INFO, "Profile saved to: " + fileCreateTempFile.getAbsolutePath(), new Object[0]);
            }
            HermesSamplingProfiler.dumpSampledTraceToFile(fileCreateTempFile.getPath());
            writableNativeMap.putString("profile", m0(fileCreateTempFile));
            if (bVarG != null) {
                WritableNativeMap writableNativeMap2 = new WritableNativeMap();
                writableNativeMap2.putString("sampled_profile", io.sentry.vendor.a.f(AbstractC5296i.b(bVarG.f49525c.getPath(), this.f51243l), 3));
                writableNativeMap2.putInt("android_api_level", f51229p.d());
                writableNativeMap2.putString("build_id", U());
                writableNativeMap.putMap("androidProfile", writableNativeMap2);
            }
            try {
                if (!fileCreateTempFile.delete()) {
                    f51228o.c(EnumC5215i3.WARNING, "Profile not deleted from:" + fileCreateTempFile.getAbsolutePath(), new Object[0]);
                    return writableNativeMap;
                }
            } catch (Throwable unused) {
                f51228o.c(EnumC5215i3.WARNING, "Profile not deleted from:" + fileCreateTempFile.getAbsolutePath(), new Object[0]);
            }
        } catch (Throwable th2) {
            try {
                writableNativeMap.putString(LogEvent.LEVEL_ERROR, th2.toString());
                if (fileCreateTempFile != null) {
                    try {
                        if (!fileCreateTempFile.delete()) {
                            f51228o.c(EnumC5215i3.WARNING, "Profile not deleted from:" + fileCreateTempFile.getAbsolutePath(), new Object[0]);
                        }
                    } catch (Throwable unused2) {
                        f51228o.c(EnumC5215i3.WARNING, "Profile not deleted from:" + fileCreateTempFile.getAbsolutePath(), new Object[0]);
                    }
                }
            } catch (Throwable th3) {
                if (fileCreateTempFile != null) {
                    try {
                        if (!fileCreateTempFile.delete()) {
                            f51228o.c(EnumC5215i3.WARNING, "Profile not deleted from:" + fileCreateTempFile.getAbsolutePath(), new Object[0]);
                        }
                    } catch (Throwable unused3) {
                        f51228o.c(EnumC5215i3.WARNING, "Profile not deleted from:" + fileCreateTempFile.getAbsolutePath(), new Object[0]);
                    }
                }
                throw th3;
            }
        }
        return writableNativeMap;
    }

    public void z() {
        boolean zR = r();
        this.f51235d = zR;
        if (!zR) {
            f51228o.c(EnumC5215i3.WARNING, "androidx.core' isn't available as a dependency.", new Object[0]);
            return;
        }
        this.f51234c = new FrameMetricsAggregator();
        Activity activityO = O();
        FrameMetricsAggregator frameMetricsAggregator = this.f51234c;
        if (frameMetricsAggregator == null || activityO == null) {
            f51228o.c(EnumC5215i3.INFO, "currentActivity isn't available.", new Object[0]);
            return;
        }
        try {
            frameMetricsAggregator.a(activityO);
            f51228o.c(EnumC5215i3.INFO, "FrameMetricsAggregator installed.", new Object[0]);
        } catch (Throwable unused) {
            f51228o.c(EnumC5215i3.ERROR, "Error adding Activity to frameMetricsAggregator.", new Object[0]);
        }
    }

    public void q0(ReadableMap readableMap) {
    }

    public void p0(String str, String str2) {
    }
}
