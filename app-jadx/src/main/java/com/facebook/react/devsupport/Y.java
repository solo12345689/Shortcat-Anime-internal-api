package com.facebook.react.devsupport;

import U6.e;
import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.hardware.SensorManager;
import android.os.Build;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import c7.InterfaceC3082a;
import c7.f;
import com.facebook.fbreact.specs.NativeRedBoxSpec;
import com.facebook.react.AbstractC3250o;
import com.facebook.react.bridge.DefaultJSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.JavascriptException;
import com.facebook.react.devsupport.C3212b;
import com.facebook.react.devsupport.C3221g;
import com.facebook.react.devsupport.C3235v;
import com.facebook.react.devsupport.SharedPreferencesOnSharedPreferenceChangeListenerC3233t;
import com.facebook.react.devsupport.Y;
import com.facebook.react.devsupport.inspector.TracingState;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import com.revenuecat.purchases.common.Constants;
import d7.InterfaceC4569a;
import h7.C4914b;
import h7.C4921i;
import ie.InterfaceC5082a;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r7.InterfaceC6274a;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Y implements c7.f {

    /* JADX INFO: renamed from: L */
    public static final a f36658L = new a(null);

    /* JADX INFO: renamed from: A */
    private boolean f36659A;

    /* JADX INFO: renamed from: B */
    private boolean f36660B;

    /* JADX INFO: renamed from: C */
    private boolean f36661C;

    /* JADX INFO: renamed from: D */
    private boolean f36662D;

    /* JADX INFO: renamed from: E */
    private boolean f36663E;

    /* JADX INFO: renamed from: F */
    private final List f36664F;

    /* JADX INFO: renamed from: G */
    private d7.i f36665G;

    /* JADX INFO: renamed from: H */
    private boolean f36666H;

    /* JADX INFO: renamed from: I */
    private b7.g f36667I;

    /* JADX INFO: renamed from: J */
    private boolean f36668J;

    /* JADX INFO: renamed from: K */
    private boolean f36669K;

    /* JADX INFO: renamed from: a */
    private final Context f36670a;

    /* JADX INFO: renamed from: b */
    private final u0 f36671b;

    /* JADX INFO: renamed from: c */
    private String f36672c;

    /* JADX INFO: renamed from: d */
    private final c7.c f36673d;

    /* JADX INFO: renamed from: e */
    private final Map f36674e;

    /* JADX INFO: renamed from: f */
    private final U6.h f36675f;

    /* JADX INFO: renamed from: g */
    private c7.d f36676g;

    /* JADX INFO: renamed from: h */
    private c7.i f36677h;

    /* JADX INFO: renamed from: i */
    private ReactContext f36678i;

    /* JADX INFO: renamed from: j */
    private final InterfaceC6274a f36679j;

    /* JADX INFO: renamed from: k */
    private boolean f36680k;

    /* JADX INFO: renamed from: l */
    private String f36681l;

    /* JADX INFO: renamed from: m */
    private final C3235v f36682m;

    /* JADX INFO: renamed from: n */
    private String f36683n;

    /* JADX INFO: renamed from: o */
    private c7.k[] f36684o;

    /* JADX INFO: renamed from: p */
    private c7.g f36685p;

    /* JADX INFO: renamed from: q */
    private int f36686q;

    /* JADX INFO: renamed from: r */
    private final U6.e f36687r;

    /* JADX INFO: renamed from: s */
    private final BroadcastReceiver f36688s;

    /* JADX INFO: renamed from: t */
    private final LinkedHashMap f36689t;

    /* JADX INFO: renamed from: u */
    private final File f36690u;

    /* JADX INFO: renamed from: v */
    private final File f36691v;

    /* JADX INFO: renamed from: w */
    private final DefaultJSExceptionHandler f36692w;

    /* JADX INFO: renamed from: x */
    private U6.g f36693x;

    /* JADX INFO: renamed from: y */
    private AlertDialog f36694y;

    /* JADX INFO: renamed from: z */
    private C3227m f36695z;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String b(Context context) {
            return context.getPackageName() + ".RELOAD_APP_ACTION";
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f36696a;

        static {
            int[] iArr = new int[TracingState.values().length];
            try {
                iArr[TracingState.ENABLED_IN_BACKGROUND_MODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TracingState.ENABLED_IN_CDP_MODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TracingState.DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f36696a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c implements SharedPreferencesOnSharedPreferenceChangeListenerC3233t.b {
        c() {
        }

        @Override // com.facebook.react.devsupport.SharedPreferencesOnSharedPreferenceChangeListenerC3233t.b
        public void a() {
            Y.this.G0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements C3235v.c {
        d() {
        }

        public static final void h(Y y10) {
            y10.F();
        }

        public static final void i(Y y10) {
            y10.B();
        }

        @Override // com.facebook.react.devsupport.C3235v.c
        public void a() {
            Y.this.f36663E = true;
            d7.i iVar = Y.this.f36665G;
            if (iVar != null) {
                iVar.j();
            }
            d7.i iVar2 = Y.this.f36665G;
            if (iVar2 != null) {
                iVar2.p();
            }
        }

        @Override // com.facebook.react.devsupport.C3235v.c
        public void b() {
            final Y y10 = Y.this;
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.a0
                @Override // java.lang.Runnable
                public final void run() {
                    Y.d.h(y10);
                }
            });
        }

        @Override // com.facebook.react.devsupport.C3235v.c
        public void c() {
            if (!InspectorFlags.getFuseboxEnabled()) {
                Y.this.u0().m();
            }
            final Y y10 = Y.this;
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.Z
                @Override // java.lang.Runnable
                public final void run() {
                    Y.d.i(y10);
                }
            });
        }

        @Override // com.facebook.react.devsupport.C3235v.c
        public void d() {
            Y.this.f36663E = false;
            d7.i iVar = Y.this.f36665G;
            if (iVar != null) {
                iVar.h();
            }
            d7.i iVar2 = Y.this.f36665G;
            if (iVar2 != null) {
                iVar2.q();
            }
        }

        @Override // com.facebook.react.devsupport.C3235v.c
        public Map e() {
            return Y.this.f36674e;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends BroadcastReceiver {
        e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(intent, "intent");
            if (AbstractC5504s.c(Y.f36658L.b(context), intent.getAction())) {
                Y.this.B();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f implements c7.c {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C3212b.a f36701b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC3082a f36702c;

        f(C3212b.a aVar, InterfaceC3082a interfaceC3082a) {
            this.f36701b = aVar;
            this.f36702c = interfaceC3082a;
        }

        @Override // c7.c
        public void a() {
            Y.this.A0();
            c7.c cVar = Y.this.f36673d;
            if (cVar != null) {
                cVar.a();
            }
            ReactMarker.logMarker(ReactMarkerConstants.DOWNLOAD_END, this.f36701b.c());
            this.f36702c.a();
        }

        @Override // c7.c
        public void b(String str, Integer num, Integer num2) {
            c7.d dVarS0 = Y.this.s0();
            if (dVarS0 != null) {
                dVarS0.d(str, num, num2);
            }
            c7.c cVar = Y.this.f36673d;
            if (cVar != null) {
                cVar.b(str, num, num2);
            }
        }

        @Override // c7.c
        public void onFailure(Exception cause) {
            AbstractC5504s.h(cause, "cause");
            Y.this.A0();
            c7.c cVar = Y.this.f36673d;
            if (cVar != null) {
                cVar.onFailure(cause);
            }
            AbstractC7283a.n("ReactNative", "Unable to download JS bundle", cause);
            Y.this.I0(cause);
            this.f36702c.b(cause);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g extends ArrayAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Activity f36703a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Set f36704b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Y f36705c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Activity activity, Set set, Y y10, String[] strArr) {
            super(activity, R.layout.simple_list_item_1, strArr);
            this.f36703a = activity;
            this.f36704b = set;
            this.f36705c = y10;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public View getView(int i10, View view, ViewGroup parent) {
            AbstractC5504s.h(parent, "parent");
            View view2 = super.getView(i10, view, parent);
            AbstractC5504s.g(view2, "getView(...)");
            Y y10 = this.f36705c;
            Activity activity = this.f36703a;
            view2.setEnabled(isEnabled(i10));
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                textView.setTextColor(textView.isEnabled() ? y10.L0(activity) : y10.M0(activity));
            }
            return view2;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i10) {
            return !this.f36704b.contains(getItem(i10));
        }
    }

    public Y(Context applicationContext, u0 reactInstanceDevHelper, String str, boolean z10, c7.j jVar, c7.c cVar, int i10, Map map, U6.h hVar, c7.d dVar, c7.i iVar) {
        AbstractC5504s.h(applicationContext, "applicationContext");
        AbstractC5504s.h(reactInstanceDevHelper, "reactInstanceDevHelper");
        this.f36670a = applicationContext;
        this.f36671b = reactInstanceDevHelper;
        this.f36672c = str;
        this.f36673d = cVar;
        this.f36674e = map;
        this.f36675f = hVar;
        this.f36676g = dVar;
        this.f36677h = iVar;
        SharedPreferencesOnSharedPreferenceChangeListenerC3233t sharedPreferencesOnSharedPreferenceChangeListenerC3233t = new SharedPreferencesOnSharedPreferenceChangeListenerC3233t(applicationContext, new c());
        this.f36679j = sharedPreferencesOnSharedPreferenceChangeListenerC3233t;
        this.f36680k = true;
        this.f36682m = new C3235v(sharedPreferencesOnSharedPreferenceChangeListenerC3233t, applicationContext, sharedPreferencesOnSharedPreferenceChangeListenerC3233t.j());
        this.f36687r = new U6.e(new e.a() { // from class: com.facebook.react.devsupport.F
            @Override // U6.e.a
            public final void a() {
                Y.R0(this.f36631a);
            }
        }, i10);
        this.f36688s = new e();
        this.f36689t = new LinkedHashMap();
        this.f36692w = new DefaultJSExceptionHandler();
        this.f36664F = new ArrayList();
        this.f36668J = true;
        this.f36669K = true;
        String strZ0 = z0();
        this.f36690u = new File(applicationContext.getFilesDir(), strZ0 + "ReactNativeDevBundle.js");
        String lowerCase = strZ0.toLowerCase(Locale.ROOT);
        AbstractC5504s.g(lowerCase, "toLowerCase(...)");
        File dir = applicationContext.getDir(lowerCase + "_dev_js_split_bundles", 0);
        AbstractC5504s.g(dir, "getDir(...)");
        this.f36691v = dir;
        s(z10);
        if (this.f36676g == null) {
            this.f36676g = new r(reactInstanceDevHelper);
        }
        if (this.f36677h == null) {
            this.f36677h = new s0(new K1.h() { // from class: com.facebook.react.devsupport.G
                @Override // K1.h
                public final Object get() {
                    return Y.i0(this.f36632a);
                }
            });
        }
        if (C4921i.a() && C4914b.G() && (reactInstanceDevHelper instanceof InterfaceC4569a)) {
            this.f36665G = new d7.i((InterfaceC4569a) reactInstanceDevHelper, new InterfaceC5082a() { // from class: com.facebook.react.devsupport.H
                @Override // ie.InterfaceC5082a
                public final Object invoke() {
                    return Y.j0(this.f36633a);
                }
            });
        }
    }

    private final void B0() {
        AlertDialog alertDialog = this.f36694y;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.f36694y = null;
    }

    public static final void C0(Y y10, c7.h hVar) {
        y10.f36682m.v(hVar);
    }

    private final void D0(Exception exc) {
        String message = exc.getMessage();
        if (message == null) {
            message = "Exception in native call from JS";
        }
        StringBuilder sb2 = new StringBuilder(message);
        for (Throwable cause = exc.getCause(); cause != null; cause = cause.getCause()) {
            sb2.append("\n\n");
            sb2.append(cause.getMessage());
        }
        if (!(exc instanceof JavascriptException)) {
            l1(sb2.toString(), exc);
        } else {
            AbstractC7283a.n("ReactNative", "Exception in native call from JS", exc);
            j1(exc.getMessage(), new c7.k[0], -1, c7.g.f33538b);
        }
    }

    private final void E0() {
        c7.d dVar;
        UiThreadUtil.assertOnUiThread();
        if (this.f36662D) {
            C3227m c3227m = this.f36695z;
            if (c3227m != null) {
                c3227m.b(this.f36679j.d());
            }
            if (!this.f36661C && y0()) {
                m1();
            }
            if (!this.f36660B) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(f36658L.b(this.f36670a));
                r0(this.f36670a, this.f36688s, intentFilter, true);
                this.f36660B = true;
            }
            if (this.f36659A && (dVar = this.f36676g) != null) {
                dVar.b("Reloading...");
            }
            this.f36682m.y(getClass().getSimpleName(), new d());
            return;
        }
        C3227m c3227m2 = this.f36695z;
        if (c3227m2 != null) {
            c3227m2.b(false);
        }
        if (this.f36661C) {
            n1();
        }
        if (this.f36660B) {
            this.f36670a.unregisterReceiver(this.f36688s);
            this.f36660B = false;
        }
        p();
        B0();
        c7.d dVar2 = this.f36676g;
        if (dVar2 != null) {
            dVar2.a();
        }
        d7.i iVar = this.f36665G;
        if (iVar != null) {
            iVar.h();
        }
        this.f36682m.j();
    }

    public static final void H0(Y y10) {
        y10.E0();
    }

    public final void I0(final Exception exc) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.M
            @Override // java.lang.Runnable
            public final void run() {
                Y.J0(exc, this);
            }
        });
    }

    public static final void J0(Exception exc, Y y10) {
        if (exc instanceof U6.b) {
            y10.l1(exc.getMessage(), exc);
        } else {
            y10.l1(y10.f36670a.getString(AbstractC3250o.f37103A), exc);
        }
    }

    private final void K0(ReactContext reactContext) {
        if (this.f36678i == reactContext) {
            return;
        }
        this.f36678i = reactContext;
        C3227m c3227m = this.f36695z;
        if (c3227m != null) {
            c3227m.b(false);
        }
        if (reactContext != null) {
            this.f36695z = new C3227m(reactContext);
        }
        if (reactContext != null) {
            try {
                URL url = new URL(u());
                String path = url.getPath();
                if (path != null) {
                    path = path.substring(1);
                    AbstractC5504s.g(path, "substring(...)");
                }
                ((HMRClient) reactContext.getJSModule(HMRClient.class)).setup("android", path, url.getHost(), url.getPort() != -1 ? url.getPort() : url.getDefaultPort(), this.f36679j.e(), url.getProtocol());
            } catch (MalformedURLException e10) {
                l1(e10.getMessage(), e10);
            }
        }
        G0();
    }

    public final ColorStateList L0(Context context) {
        ColorStateList colorStateListB = com.facebook.react.views.text.a.b(context);
        if (colorStateListB != null) {
            return colorStateListB;
        }
        if (L7.b.a(context)) {
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(-1);
            AbstractC5504s.g(colorStateListValueOf, "valueOf(...)");
            return colorStateListValueOf;
        }
        ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(-16777216);
        AbstractC5504s.g(colorStateListValueOf2, "valueOf(...)");
        return colorStateListValueOf2;
    }

    public final ColorStateList M0(Context context) {
        ColorStateList colorStateListE = com.facebook.react.views.text.a.e(context);
        if (colorStateListE != null) {
            return colorStateListE;
        }
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(-7829368);
        AbstractC5504s.g(colorStateListValueOf, "valueOf(...)");
        return colorStateListValueOf;
    }

    public static final void N0(Y y10, boolean z10) {
        y10.f36679j.i(z10);
    }

    public static final void O0(Y y10, boolean z10) {
        y10.f36679j.c(z10);
        y10.B();
    }

    public static final void R0(Y y10) {
        y10.F();
    }

    private final void S0(String str) {
        try {
            URL url = new URL(str);
            int port = url.getPort() != -1 ? url.getPort() : url.getDefaultPort();
            c7.d dVar = this.f36676g;
            if (dVar != null) {
                String string = this.f36670a.getString(AbstractC3250o.f37141q, url.getHost() + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + port);
                AbstractC5504s.g(string, "getString(...)");
                dVar.b(string);
            }
            this.f36659A = true;
        } catch (MalformedURLException e10) {
            AbstractC7283a.m("ReactNative", "Bundle url format is invalid. \n\n" + e10);
        }
    }

    public static final void T0(final Y y10) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.O
            @Override // java.lang.Runnable
            public final void run() {
                Y.U0(this.f36648a);
            }
        });
    }

    public static final void U0(Y y10) {
        d7.c cVarD;
        u0 u0Var = y10.f36671b;
        if (!(u0Var instanceof InterfaceC4569a) || (cVarD = ((InterfaceC4569a) u0Var).d()) == null || cVarD.pauseAndAnalyzeBackgroundTrace()) {
            return;
        }
        y10.v(c7.b.f33530e.toString());
    }

    public static final void V0(Y y10) {
        d7.c cVarD;
        u0 u0Var = y10.f36671b;
        if (!(u0Var instanceof InterfaceC4569a) || (cVarD = ((InterfaceC4569a) u0Var).d()) == null) {
            return;
        }
        cVarD.resumeBackgroundTrace();
    }

    public static final void X0(Y y10) {
        d7.i iVar = y10.f36665G;
        if (iVar != null) {
            iVar.h();
        }
    }

    public static final void Y0(Y y10) {
        d7.i iVar = y10.f36665G;
        if (iVar != null) {
            iVar.j();
        }
    }

    public static final void Z0(final Y y10) {
        Activity activityA = y10.f36671b.a();
        if (activityA == null || activityA.isFinishing()) {
            AbstractC7283a.m("ReactNative", "Unable to launch change bundle location because react activity is not available");
        } else {
            C3221g.f36743a.e(activityA, y10.f36679j, new C3221g.a() { // from class: com.facebook.react.devsupport.N
                @Override // com.facebook.react.devsupport.C3221g.a
                public final void a(String str) {
                    Y.a1(this.f36647a, str);
                }
            });
        }
    }

    public static final void a1(Y y10, String host) {
        AbstractC5504s.h(host, "host");
        y10.f36679j.j().f(host);
        y10.B();
    }

    public static final void b1(Y y10) {
        y10.f36679j.b(!r0.a());
        y10.f36671b.g();
    }

    public static final void c1(Y y10) {
        boolean zE = y10.f36679j.e();
        y10.f36679j.c(!zE);
        ReactContext reactContext = y10.f36678i;
        if (reactContext != null) {
            if (zE) {
                HMRClient hMRClient = (HMRClient) reactContext.getJSModule(HMRClient.class);
                if (hMRClient != null) {
                    hMRClient.disable();
                }
            } else {
                HMRClient hMRClient2 = (HMRClient) reactContext.getJSModule(HMRClient.class);
                if (hMRClient2 != null) {
                    hMRClient2.enable();
                }
            }
        }
        if (zE || y10.f36679j.h()) {
            return;
        }
        Context context = y10.f36670a;
        Toast.makeText(context, context.getString(AbstractC3250o.f37138n), 1).show();
        y10.f36679j.k(true);
        y10.B();
    }

    public static final void d1(Y y10) {
        if (!y10.f36679j.d()) {
            Activity activityA = y10.f36671b.a();
            if (activityA == null) {
                AbstractC7283a.m("ReactNative", "Unable to get reference to react activity");
            } else {
                C3227m.f36785d.d(activityA);
            }
        }
        y10.f36679j.i(!r2.d());
    }

    public static final void e1(Y y10) {
        Intent intent = new Intent(y10.f36670a, (Class<?>) AbstractC3236w.class);
        intent.setFlags(268435456);
        y10.f36670a.startActivity(intent);
    }

    public static final void f1(c7.e[] eVarArr, Y y10, DialogInterface dialogInterface, int i10) {
        eVarArr[i10].a();
        y10.f36694y = null;
    }

    public static final void g1(Y y10, DialogInterface dialogInterface) {
        y10.f36694y = null;
    }

    public static final void h1(Y y10) {
        if (!y10.f36679j.h() && y10.f36679j.e()) {
            Context context = y10.f36670a;
            Toast.makeText(context, context.getString(AbstractC3250o.f37137m), 1).show();
            y10.f36679j.c(false);
        }
        y10.B();
    }

    public static final Context i0(Y y10) {
        Activity activityA = y10.f36671b.a();
        if (activityA == null || activityA.isFinishing()) {
            return null;
        }
        return activityA;
    }

    public static final void i1(Y y10) {
        c7.f.G(y10, null, 1, null);
    }

    public static final Td.L j0(Y y10) {
        y10.v(c7.b.f33530e.toString());
        return Td.L.f17438a;
    }

    private final void j1(final String str, final c7.k[] kVarArr, final int i10, final c7.g gVar) {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.I
            @Override // java.lang.Runnable
            public final void run() {
                Y.k1(this.f36634a, str, kVarArr, i10, gVar);
            }
        });
    }

    public static final void k1(Y y10, String str, c7.k[] kVarArr, int i10, c7.g gVar) {
        U6.g gVar2;
        y10.p1(str, kVarArr, i10, gVar);
        if (y10.f36693x == null) {
            U6.g gVarD = y10.d(NativeRedBoxSpec.NAME);
            if (gVarD == null) {
                gVarD = new A0(y10);
                gVarD.e(NativeRedBoxSpec.NAME);
            }
            y10.f36693x = gVarD;
        }
        U6.g gVar3 = y10.f36693x;
        if ((gVar3 == null || !gVar3.b()) && (gVar2 = y10.f36693x) != null) {
            gVar2.c();
        }
    }

    private final void m1() {
        Object systemService = this.f36670a.getSystemService("sensor");
        AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        this.f36687r.e((SensorManager) systemService);
        this.f36661C = true;
    }

    private final void n1() {
        this.f36687r.f();
        this.f36661C = false;
    }

    public static final void o1(Y y10) {
        y10.f36679j.b(!r0.a());
        y10.f36671b.g();
    }

    private final void p1(String str, c7.k[] kVarArr, int i10, c7.g gVar) {
        this.f36683n = str;
        this.f36684o = kVarArr;
        this.f36686q = i10;
        this.f36685p = gVar;
    }

    private final void r0(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z10) {
        if (Build.VERSION.SDK_INT < 34 || context.getApplicationInfo().targetSdkVersion < 34) {
            context.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter, z10 ? 2 : 4);
        }
    }

    private final String w0() {
        try {
            return this.f36671b.c().toString();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // c7.f
    public void A(ReactContext reactContext) {
        d7.c cVarD;
        AbstractC5504s.h(reactContext, "reactContext");
        if (!this.f36666H) {
            u0 u0Var = this.f36671b;
            if (u0Var instanceof InterfaceC4569a) {
                d7.i iVar = this.f36665G;
                if (iVar != null && (cVarD = ((InterfaceC4569a) u0Var).d()) != null) {
                    cVarD.addPerfMonitorListener(iVar);
                }
                if (this.f36663E) {
                    d7.i iVar2 = this.f36665G;
                    if (iVar2 != null) {
                        iVar2.j();
                    }
                    d7.i iVar3 = this.f36665G;
                    if (iVar3 != null) {
                        iVar3.p();
                    }
                }
                this.f36666H = true;
            }
        }
        K0(reactContext);
    }

    protected final void A0() {
        c7.d dVar = this.f36676g;
        if (dVar != null) {
            dVar.a();
        }
        this.f36659A = false;
    }

    @Override // c7.f
    public String C() {
        return this.f36681l;
    }

    @Override // c7.f
    public final InterfaceC6274a D() {
        return this.f36679j;
    }

    @Override // c7.f
    public boolean E() {
        if (this.f36662D && this.f36690u.exists()) {
            try {
                String packageName = this.f36670a.getPackageName();
                PackageManager packageManager = this.f36670a.getPackageManager();
                if (packageManager != null) {
                    if (this.f36690u.lastModified() > packageManager.getPackageInfo(packageName, 0).lastUpdateTime) {
                        kotlin.jvm.internal.U u10 = kotlin.jvm.internal.U.f52264a;
                        String str = String.format(Locale.US, "/data/local/tmp/exopackage/%s//secondary-dex", Arrays.copyOf(new Object[]{packageName}, 1));
                        AbstractC5504s.g(str, "format(...)");
                        File file = new File(str);
                        if (file.exists()) {
                            return this.f36690u.lastModified() > file.lastModified();
                        }
                        return true;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                AbstractC7283a.m("ReactNative", "DevSupport is unable to get current app info");
            }
        }
        return false;
    }

    @Override // c7.f
    public void F() {
        RCTNativeAppEventEmitter rCTNativeAppEventEmitter;
        AlertDialog alertDialog;
        ListView listView;
        TracingState tracingState;
        String string;
        c7.e eVar;
        if (this.f36694y == null && this.f36662D && t0() && !ActivityManager.isUserAMonkey()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            HashSet hashSet = new HashSet();
            linkedHashMap.put(this.f36670a.getString(AbstractC3250o.f37150z), new c7.e() { // from class: com.facebook.react.devsupport.P
                @Override // c7.e
                public final void a() {
                    Y.h1(this.f36649a);
                }
            });
            if (this.f36679j.f()) {
                boolean z10 = this.f36663E;
                String string2 = this.f36670a.getString(z10 ? AbstractC3250o.f37132h : AbstractC3250o.f37133i);
                AbstractC5504s.g(string2, "getString(...)");
                if (!z10) {
                    hashSet.add(string2);
                }
                linkedHashMap.put(string2, new c7.e() { // from class: com.facebook.react.devsupport.V
                    @Override // c7.e
                    public final void a() {
                        Y.i1(this.f36655a);
                    }
                });
            }
            if (C4914b.G()) {
                boolean z11 = this.f36663E;
                b7.g gVar = this.f36667I;
                if (gVar == null || (tracingState = gVar.getTracingState()) == null) {
                    tracingState = TracingState.DISABLED;
                }
                int[] iArr = b.f36696a;
                int i10 = iArr[tracingState.ordinal()];
                if (i10 == 1) {
                    string = this.f36670a.getString(AbstractC3250o.f37145u);
                } else if (i10 == 2) {
                    string = this.f36670a.getString(AbstractC3250o.f37146v);
                } else {
                    if (i10 != 3) {
                        throw new Td.r();
                    }
                    string = this.f36670a.getString(AbstractC3250o.f37148x);
                }
                AbstractC5504s.e(string);
                if (!z11 || tracingState == TracingState.ENABLED_IN_CDP_MODE) {
                    hashSet.add(string);
                }
                int i11 = iArr[tracingState.ordinal()];
                if (i11 == 1) {
                    eVar = new c7.e() { // from class: com.facebook.react.devsupport.W
                        @Override // c7.e
                        public final void a() {
                            Y.T0(this.f36656a);
                        }
                    };
                } else if (i11 == 2) {
                    eVar = new c7.e() { // from class: com.facebook.react.devsupport.y
                        @Override // c7.e
                        public final void a() {
                            Y.W0();
                        }
                    };
                } else {
                    if (i11 != 3) {
                        throw new Td.r();
                    }
                    eVar = new c7.e() { // from class: com.facebook.react.devsupport.X
                        @Override // c7.e
                        public final void a() {
                            Y.V0(this.f36657a);
                        }
                    };
                }
                linkedHashMap.put(string, eVar);
            }
            if (C4914b.G()) {
                boolean z12 = this.f36663E;
                d7.i iVar = this.f36665G;
                String string3 = (iVar == null || !iVar.m()) ? this.f36670a.getString(AbstractC3250o.f37149y) : this.f36670a.getString(AbstractC3250o.f37147w);
                AbstractC5504s.e(string3);
                if (!z12) {
                    hashSet.add(string3);
                }
                d7.i iVar2 = this.f36665G;
                linkedHashMap.put(string3, (iVar2 == null || !iVar2.m()) ? new c7.e() { // from class: com.facebook.react.devsupport.A
                    @Override // c7.e
                    public final void a() {
                        Y.Y0(this.f36599a);
                    }
                } : new c7.e() { // from class: com.facebook.react.devsupport.z
                    @Override // c7.e
                    public final void a() {
                        Y.X0(this.f36870a);
                    }
                });
            }
            linkedHashMap.put(this.f36670a.getString(AbstractC3250o.f37126b), new c7.e() { // from class: com.facebook.react.devsupport.B
                @Override // c7.e
                public final void a() {
                    Y.Z0(this.f36608a);
                }
            });
            linkedHashMap.put(this.f36670a.getString(AbstractC3250o.f37140p), new c7.e() { // from class: com.facebook.react.devsupport.C
                @Override // c7.e
                public final void a() {
                    Y.b1(this.f36610a);
                }
            });
            String string4 = this.f36679j.e() ? this.f36670a.getString(AbstractC3250o.f37139o) : this.f36670a.getString(AbstractC3250o.f37136l);
            AbstractC5504s.e(string4);
            linkedHashMap.put(string4, new c7.e() { // from class: com.facebook.react.devsupport.D
                @Override // c7.e
                public final void a() {
                    Y.c1(this.f36617a);
                }
            });
            if (!C4914b.G()) {
                String string5 = this.f36679j.d() ? this.f36670a.getString(AbstractC3250o.f37144t) : this.f36670a.getString(AbstractC3250o.f37143s);
                AbstractC5504s.e(string5);
                linkedHashMap.put(string5, new c7.e() { // from class: com.facebook.react.devsupport.Q
                    @Override // c7.e
                    public final void a() {
                        Y.d1(this.f36650a);
                    }
                });
                linkedHashMap.put(this.f36670a.getString(AbstractC3250o.f37104B), new c7.e() { // from class: com.facebook.react.devsupport.S
                    @Override // c7.e
                    public final void a() {
                        Y.e1(this.f36651a);
                    }
                });
            }
            if (!this.f36689t.isEmpty()) {
                linkedHashMap.putAll(this.f36689t);
            }
            Collection collectionValues = linkedHashMap.values();
            AbstractC5504s.g(collectionValues, "<get-values>(...)");
            final c7.e[] eVarArr = (c7.e[]) collectionValues.toArray(new c7.e[0]);
            Activity activityA = this.f36671b.a();
            if (activityA == null || activityA.isFinishing()) {
                AbstractC7283a.m("ReactNative", "Unable to launch dev options menu because react activity isn't available");
                return;
            }
            LinearLayout linearLayout = new LinearLayout(activityA);
            linearLayout.setOrientation(1);
            TextView textView = new TextView(activityA);
            textView.setText(activityA.getString(AbstractC3250o.f37134j));
            textView.setPadding(0, 50, 0, 0);
            textView.setGravity(17);
            textView.setTextSize(16.0f);
            textView.setTypeface(textView.getTypeface(), 1);
            linearLayout.addView(textView);
            String strW0 = w0();
            if (strW0 != null) {
                TextView textView2 = new TextView(activityA);
                textView2.setText(activityA.getString(AbstractC3250o.f37135k, strW0));
                textView2.setPadding(0, 20, 0, 0);
                textView2.setGravity(17);
                textView2.setTextSize(14.0f);
                linearLayout.addView(textView2);
            }
            Set setKeySet = linkedHashMap.keySet();
            AbstractC5504s.g(setKeySet, "<get-keys>(...)");
            AlertDialog alertDialogCreate = new AlertDialog.Builder(activityA).setCustomTitle(linearLayout).setAdapter(new g(activityA, hashSet, this, (String[]) setKeySet.toArray(new String[0])), new DialogInterface.OnClickListener() { // from class: com.facebook.react.devsupport.T
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i12) {
                    Y.f1(eVarArr, this, dialogInterface, i12);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.facebook.react.devsupport.U
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    Y.g1(this.f36654a, dialogInterface);
                }
            }).create();
            this.f36694y = alertDialogCreate;
            if (alertDialogCreate != null) {
                alertDialogCreate.show();
            }
            if (Build.VERSION.SDK_INT <= 30 && (alertDialog = this.f36694y) != null && (listView = alertDialog.getListView()) != null) {
                int i12 = (int) (((double) activityA.getResources().getDisplayMetrics().heightPixels) * 0.7d);
                ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new ViewGroup.LayoutParams(-1, -2);
                }
                layoutParams.height = i12;
                listView.setLayoutParams(layoutParams);
            }
            ReactContext reactContext = this.f36678i;
            if (reactContext == null || (rCTNativeAppEventEmitter = (RCTNativeAppEventEmitter) reactContext.getJSModule(RCTNativeAppEventEmitter.class)) == null) {
                return;
            }
            rCTNativeAppEventEmitter.emit("RCTDevMenuShown", null);
        }
    }

    public void F0(String bundleURL, InterfaceC3082a callback) {
        AbstractC5504s.h(bundleURL, "bundleURL");
        AbstractC5504s.h(callback, "callback");
        ReactMarker.logMarker(ReactMarkerConstants.DOWNLOAD_START);
        S0(bundleURL);
        C3212b.a aVar = new C3212b.a();
        C3235v.o(this.f36682m, new f(aVar, callback), this.f36690u, bundleURL, aVar, null, 16, null);
    }

    public void G0() {
        if (UiThreadUtil.isOnUiThread()) {
            E0();
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.x
                @Override // java.lang.Runnable
                public final void run() {
                    Y.H0(this.f36855a);
                }
            });
        }
    }

    @Override // c7.f
    public void H(ReactContext reactContext) {
        AbstractC5504s.h(reactContext, "reactContext");
        if (reactContext == this.f36678i) {
            K0(null);
        }
        System.gc();
    }

    public final void P0(String str) {
        this.f36672c = str;
    }

    public final void Q0(b7.g gVar) {
        this.f36667I = gVar;
    }

    @Override // c7.f
    public Activity a() {
        return this.f36671b.a();
    }

    @Override // c7.f
    public View b(String appKey) {
        AbstractC5504s.h(appKey, "appKey");
        return this.f36671b.b(appKey);
    }

    @Override // c7.f
    public void c(final boolean z10) {
        if (this.f36662D) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.K
                @Override // java.lang.Runnable
                public final void run() {
                    Y.O0(this.f36642a, z10);
                }
            });
        }
    }

    @Override // c7.f
    public U6.g d(String moduleName) {
        AbstractC5504s.h(moduleName, "moduleName");
        U6.h hVar = this.f36675f;
        if (hVar != null) {
            return hVar.d(moduleName);
        }
        return null;
    }

    @Override // c7.f
    public void e(View view) {
        if (view != null) {
            this.f36671b.e(view);
        }
    }

    @Override // c7.f
    public void f() {
        c7.i iVar = this.f36677h;
        if (iVar != null) {
            iVar.f();
        }
    }

    @Override // c7.f
    public void g() {
        if (this.f36662D) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.L
                @Override // java.lang.Runnable
                public final void run() {
                    Y.o1(this.f36644a);
                }
            });
        }
    }

    @Override // c7.f
    public final ReactContext getCurrentReactContext() {
        return this.f36678i;
    }

    @Override // c7.f
    public void h(String message, f.a listener) {
        AbstractC5504s.h(message, "message");
        AbstractC5504s.h(listener, "listener");
        c7.i iVar = this.f36677h;
        if (iVar != null) {
            iVar.h(message, listener);
        }
    }

    @Override // com.facebook.react.bridge.JSExceptionHandler
    public void handleException(Exception e10) {
        AbstractC5504s.h(e10, "e");
        if (this.f36662D) {
            D0(e10);
        } else {
            this.f36692w.handleException(e10);
        }
    }

    @Override // c7.f
    public void i(final boolean z10) {
        if (this.f36662D) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.devsupport.E
                @Override // java.lang.Runnable
                public final void run() {
                    Y.N0(this.f36627a, z10);
                }
            });
        }
    }

    @Override // c7.f
    public String j() {
        String absolutePath = this.f36690u.getAbsolutePath();
        AbstractC5504s.g(absolutePath, "getAbsolutePath(...)");
        return absolutePath;
    }

    @Override // c7.f
    public final String k() {
        return this.f36683n;
    }

    @Override // c7.f
    public void l() {
        this.f36682m.i();
    }

    public void l1(String str, Throwable e10) {
        AbstractC5504s.h(e10, "e");
        AbstractC7283a.n("ReactNative", "Exception in native call", e10);
        j1(str, D0.a(e10), -1, c7.g.f33539c);
    }

    @Override // c7.f
    public final boolean m() {
        return this.f36662D;
    }

    @Override // c7.f
    public void n(final c7.h callback) {
        AbstractC5504s.h(callback, "callback");
        new Runnable() { // from class: com.facebook.react.devsupport.J
            @Override // java.lang.Runnable
            public final void run() {
                Y.C0(this.f36640a, callback);
            }
        }.run();
    }

    @Override // c7.f
    public boolean o() {
        return this.f36668J;
    }

    @Override // c7.f
    public void p() {
        U6.g gVar = this.f36693x;
        if (gVar != null) {
            gVar.a();
        }
    }

    @Override // c7.f
    public void q(String str) {
        this.f36681l = str;
    }

    @Override // c7.f
    public Pair r(Pair errorInfo) {
        AbstractC5504s.h(errorInfo, "errorInfo");
        Iterator it = this.f36664F.iterator();
        if (!it.hasNext()) {
            return errorInfo;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    @Override // c7.f
    public final void s(boolean z10) {
        this.f36662D = z10;
        G0();
    }

    public final c7.d s0() {
        return this.f36676g;
    }

    @Override // c7.f
    public final c7.g t() {
        return this.f36685p;
    }

    public boolean t0() {
        return this.f36669K;
    }

    @Override // c7.f
    public String u() {
        String strU;
        String str = this.f36672c;
        return (str == null || (strU = this.f36682m.u(str)) == null) ? "" : strU;
    }

    public final C3235v u0() {
        return this.f36682m;
    }

    @Override // c7.f
    public void v(String str) {
        this.f36682m.w(this.f36678i, this.f36670a.getString(AbstractC3250o.f37142r), str);
    }

    public final String v0() {
        return this.f36672c;
    }

    @Override // c7.f
    public void w(String optionName, c7.e optionHandler) {
        AbstractC5504s.h(optionName, "optionName");
        AbstractC5504s.h(optionHandler, "optionHandler");
        this.f36689t.put(optionName, optionHandler);
    }

    @Override // c7.f
    public c7.j x() {
        return null;
    }

    public final u0 x0() {
        return this.f36671b;
    }

    @Override // c7.f
    public void y() {
        if (this.f36662D) {
            this.f36682m.x();
        }
    }

    public final boolean y0() {
        return this.f36680k;
    }

    @Override // c7.f
    public final c7.k[] z() {
        return this.f36684o;
    }

    protected abstract String z0();

    public static final void W0() {
    }
}
