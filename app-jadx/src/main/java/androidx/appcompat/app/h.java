package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.b;
import androidx.appcompat.view.f;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C2657k;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.I;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.r0;
import androidx.appcompat.widget.s0;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.AbstractC2771m0;
import androidx.core.view.AbstractC2783t;
import androidx.core.view.AbstractC2785u;
import androidx.core.view.C2767k0;
import androidx.core.view.L0;
import androidx.lifecycle.AbstractC2857k;
import com.facebook.imageutils.JfifUtil;
import i.AbstractC4956a;
import j.AbstractC5323a;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import t.i0;
import y1.AbstractC7194b;
import z1.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class h extends androidx.appcompat.app.f implements e.a, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    private static final i0 f24411I0 = new i0();

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    private static final boolean f24412J0 = false;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    private static final int[] f24413K0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    private static final boolean f24414L0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private boolean f24415A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    private final Runnable f24416A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    ViewGroup f24417B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    private boolean f24418B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private TextView f24419C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    private Rect f24420C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private View f24421D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    private Rect f24422D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f24423E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    private androidx.appcompat.app.s f24424E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private boolean f24425F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    private u f24426F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    boolean f24427G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    private OnBackInvokedDispatcher f24428G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    boolean f24429H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    private OnBackInvokedCallback f24430H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    boolean f24431I;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    boolean f24432X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    boolean f24433Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private boolean f24434Z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final Object f24435j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final Context f24436k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    Window f24437l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private r[] f24438l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private m f24439m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private r f24440m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final androidx.appcompat.app.d f24441n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f24442n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    AbstractC2646a f24443o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private boolean f24444o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    MenuInflater f24445p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f24446p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CharSequence f24447q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    boolean f24448q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private I f24449r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private Configuration f24450r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private g f24451s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private int f24452s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private s f24453t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f24454t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    androidx.appcompat.view.b f24455u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f24456u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    ActionBarContextView f24457v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private boolean f24458v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    PopupWindow f24459w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private o f24460w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    Runnable f24461x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private o f24462x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    C2767k0 f24463y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    boolean f24464y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f24465z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    int f24466z0;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            if ((hVar.f24466z0 & 1) != 0) {
                hVar.i0(0);
            }
            h hVar2 = h.this;
            if ((hVar2.f24466z0 & 4096) != 0) {
                hVar2.i0(108);
            }
            h hVar3 = h.this;
            hVar3.f24464y0 = false;
            hVar3.f24466z0 = 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements androidx.core.view.I {
        b() {
        }

        @Override // androidx.core.view.I
        public L0 d(View view, L0 l02) {
            int iM = l02.m();
            int iF1 = h.this.f1(l02, null);
            if (iM != iF1) {
                l02 = l02.s(l02.k(), iF1, l02.l(), l02.j());
            }
            return AbstractC2747a0.W(view, l02);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d implements Runnable {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a extends AbstractC2771m0 {
            a() {
            }

            @Override // androidx.core.view.InterfaceC2769l0
            public void b(View view) {
                h.this.f24457v.setAlpha(1.0f);
                h.this.f24463y.g(null);
                h.this.f24463y = null;
            }

            @Override // androidx.core.view.AbstractC2771m0, androidx.core.view.InterfaceC2769l0
            public void c(View view) {
                h.this.f24457v.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.f24459w.showAtLocation(hVar.f24457v, 55, 0, 0);
            h.this.j0();
            if (!h.this.U0()) {
                h.this.f24457v.setAlpha(1.0f);
                h.this.f24457v.setVisibility(0);
            } else {
                h.this.f24457v.setAlpha(0.0f);
                h hVar2 = h.this;
                hVar2.f24463y = AbstractC2747a0.e(hVar2.f24457v).b(1.0f);
                h.this.f24463y.g(new a());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class e extends AbstractC2771m0 {
        e() {
        }

        @Override // androidx.core.view.InterfaceC2769l0
        public void b(View view) {
            h.this.f24457v.setAlpha(1.0f);
            h.this.f24463y.g(null);
            h.this.f24463y = null;
        }

        @Override // androidx.core.view.AbstractC2771m0, androidx.core.view.InterfaceC2769l0
        public void c(View view) {
            h.this.f24457v.setVisibility(0);
            if (h.this.f24457v.getParent() instanceof View) {
                AbstractC2747a0.h0((View) h.this.f24457v.getParent());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    interface f {
        boolean a(int i10);

        View onCreatePanelView(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class g implements j.a {
        g() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
            h.this.Z(eVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackV0 = h.this.v0();
            if (callbackV0 == null) {
                return true;
            }
            callbackV0.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.h$h, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0425h implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b.a f24474a;

        /* JADX INFO: renamed from: androidx.appcompat.app.h$h$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a extends AbstractC2771m0 {
            a() {
            }

            @Override // androidx.core.view.InterfaceC2769l0
            public void b(View view) {
                h.this.f24457v.setVisibility(8);
                h hVar = h.this;
                PopupWindow popupWindow = hVar.f24459w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (hVar.f24457v.getParent() instanceof View) {
                    AbstractC2747a0.h0((View) h.this.f24457v.getParent());
                }
                h.this.f24457v.k();
                h.this.f24463y.g(null);
                h hVar2 = h.this;
                hVar2.f24463y = null;
                AbstractC2747a0.h0(hVar2.f24417B);
            }
        }

        public C0425h(b.a aVar) {
            this.f24474a = aVar;
        }

        @Override // androidx.appcompat.view.b.a
        public void a(androidx.appcompat.view.b bVar) {
            this.f24474a.a(bVar);
            h hVar = h.this;
            if (hVar.f24459w != null) {
                hVar.f24437l.getDecorView().removeCallbacks(h.this.f24461x);
            }
            h hVar2 = h.this;
            if (hVar2.f24457v != null) {
                hVar2.j0();
                h hVar3 = h.this;
                hVar3.f24463y = AbstractC2747a0.e(hVar3.f24457v).b(0.0f);
                h.this.f24463y.g(new a());
            }
            h hVar4 = h.this;
            androidx.appcompat.app.d dVar = hVar4.f24441n;
            if (dVar != null) {
                dVar.f(hVar4.f24455u);
            }
            h hVar5 = h.this;
            hVar5.f24455u = null;
            AbstractC2747a0.h0(hVar5.f24417B);
            h.this.d1();
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f24474a.b(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f24474a.c(bVar, menuItem);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(androidx.appcompat.view.b bVar, Menu menu) {
            AbstractC2747a0.h0(h.this.f24417B);
            return this.f24474a.d(bVar, menu);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class i {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class j {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        static G1.i b(Configuration configuration) {
            return G1.i.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(G1.i iVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(iVar.h()));
        }

        static void d(Configuration configuration, G1.i iVar) {
            configuration.setLocales(LocaleList.forLanguageTags(iVar.h()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class k {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                configuration3.colorMode |= configuration2.colorMode & 3;
            }
            if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                configuration3.colorMode |= configuration2.colorMode & 12;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class l {
        static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(Object obj, final h hVar) {
            Objects.requireNonNull(hVar);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.p
                public final void onBackInvoked() {
                    hVar.D0();
                }
            };
            androidx.appcompat.app.l.a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        static void c(Object obj, Object obj2) {
            androidx.appcompat.app.l.a(obj).unregisterOnBackInvokedCallback(androidx.appcompat.app.k.a(obj2));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class m extends androidx.appcompat.view.i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private f f24477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f24478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f24479d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f24480e;

        m(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f24479d = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f24479d = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f24478c = true;
                callback.onContentChanged();
            } finally {
                this.f24478c = false;
            }
        }

        public void d(Window.Callback callback, int i10, Menu menu) {
            try {
                this.f24480e = true;
                callback.onPanelClosed(i10, menu);
            } finally {
                this.f24480e = false;
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f24479d ? a().dispatchKeyEvent(keyEvent) : h.this.h0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || h.this.G0(keyEvent.getKeyCode(), keyEvent);
        }

        void e(f fVar) {
            this.f24477b = fVar;
        }

        final ActionMode f(ActionMode.Callback callback) {
            f.a aVar = new f.a(h.this.f24436k, callback);
            androidx.appcompat.view.b bVarX0 = h.this.X0(aVar);
            if (bVarX0 != null) {
                return aVar.e(bVarX0);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f24478c) {
                a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i10, Menu menu) {
            if (i10 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i10, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public View onCreatePanelView(int i10) {
            View viewOnCreatePanelView;
            f fVar = this.f24477b;
            return (fVar == null || (viewOnCreatePanelView = fVar.onCreatePanelView(i10)) == null) ? super.onCreatePanelView(i10) : viewOnCreatePanelView;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onMenuOpened(int i10, Menu menu) {
            super.onMenuOpened(i10, menu);
            h.this.J0(i10);
            return true;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onPanelClosed(int i10, Menu menu) {
            if (this.f24480e) {
                a().onPanelClosed(i10, menu);
            } else {
                super.onPanelClosed(i10, menu);
                h.this.K0(i10);
            }
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public boolean onPreparePanel(int i10, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i10 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.f0(true);
            }
            f fVar = this.f24477b;
            boolean zOnPreparePanel = fVar != null && fVar.a(i10);
            if (!zOnPreparePanel) {
                zOnPreparePanel = super.onPreparePanel(i10, view, menu);
            }
            if (eVar != null) {
                eVar.f0(false);
            }
            return zOnPreparePanel;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
            androidx.appcompat.view.menu.e eVar;
            r rVarT0 = h.this.t0(0, true);
            if (rVarT0 == null || (eVar = rVarT0.f24499j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i10);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i10);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
            return (h.this.B0() && i10 == 0) ? f(callback) : super.onWindowStartingActionMode(callback, i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class n extends o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final PowerManager f24482c;

        n(Context context) {
            super();
            this.f24482c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.h.o
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.h.o
        public int c() {
            return i.a(this.f24482c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.h.o
        public void d() {
            h.this.f();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    abstract class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f24484a;

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                o.this.d();
            }
        }

        o() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f24484a;
            if (broadcastReceiver != null) {
                try {
                    h.this.f24436k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f24484a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f24484a == null) {
                this.f24484a = new a();
            }
            h.this.f24436k.registerReceiver(this.f24484a, intentFilterB);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class p extends o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final z f24487c;

        p(z zVar) {
            super();
            this.f24487c = zVar;
        }

        @Override // androidx.appcompat.app.h.o
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.h.o
        public int c() {
            return this.f24487c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.h.o
        public void d() {
            h.this.f();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private class q extends ContentFrameLayout {
        public q(Context context) {
            super(context);
        }

        private boolean b(int i10, int i11) {
            return i10 < -5 || i11 < -5 || i10 > getWidth() + 5 || i11 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return h.this.h0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            h.this.b0(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i10) {
            setBackgroundDrawable(AbstractC5323a.b(getContext(), i10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    protected static final class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f24491b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f24492c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f24493d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f24494e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f24495f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ViewGroup f24496g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        View f24497h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        View f24498i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.e f24499j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.c f24500k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Context f24501l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f24502m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f24503n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f24504o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f24505p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        boolean f24506q = false;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f24507r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Bundle f24508s;

        r(int i10) {
            this.f24490a = i10;
        }

        androidx.appcompat.view.menu.k a(j.a aVar) {
            if (this.f24499j == null) {
                return null;
            }
            if (this.f24500k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f24501l, i.g.f48099j);
                this.f24500k = cVar;
                cVar.e(aVar);
                this.f24499j.b(this.f24500k);
            }
            return this.f24500k.c(this.f24496g);
        }

        public boolean b() {
            if (this.f24497h == null) {
                return false;
            }
            return this.f24498i != null || this.f24500k.b().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f24499j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.R(this.f24500k);
            }
            this.f24499j = eVar;
            if (eVar == null || (cVar = this.f24500k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(AbstractC4956a.f47954a, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                themeNewTheme.applyStyle(i10, true);
            }
            themeNewTheme.resolveAttribute(AbstractC4956a.f47943E, typedValue, true);
            int i11 = typedValue.resourceId;
            if (i11 != 0) {
                themeNewTheme.applyStyle(i11, true);
            } else {
                themeNewTheme.applyStyle(i.i.f48126c, true);
            }
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.f24501l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(i.j.f48379y0);
            this.f24491b = typedArrayObtainStyledAttributes.getResourceId(i.j.f48136B0, 0);
            this.f24495f = typedArrayObtainStyledAttributes.getResourceId(i.j.f48131A0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private final class s implements j.a {
        s() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
            androidx.appcompat.view.menu.e eVarF = eVar.F();
            boolean z11 = eVarF != eVar;
            h hVar = h.this;
            if (z11) {
                eVar = eVarF;
            }
            r rVarM0 = hVar.m0(eVar);
            if (rVarM0 != null) {
                if (!z11) {
                    h.this.c0(rVarM0, z10);
                } else {
                    h.this.Y(rVarM0.f24490a, rVarM0, eVarF);
                    h.this.c0(rVarM0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean b(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackV0;
            if (eVar != eVar.F()) {
                return true;
            }
            h hVar = h.this;
            if (!hVar.f24427G || (callbackV0 = hVar.v0()) == null || h.this.f24448q0) {
                return true;
            }
            callbackV0.onMenuOpened(108, eVar);
            return true;
        }
    }

    h(Activity activity, androidx.appcompat.app.d dVar) {
        this(activity, null, dVar, activity);
    }

    private void A0(int i10) {
        this.f24466z0 = (1 << i10) | this.f24466z0;
        if (this.f24464y0) {
            return;
        }
        AbstractC2747a0.c0(this.f24437l.getDecorView(), this.f24416A0);
        this.f24464y0 = true;
    }

    private boolean F0(int i10, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        r rVarT0 = t0(i10, true);
        if (rVarT0.f24504o) {
            return false;
        }
        return P0(rVarT0, keyEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean I0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            androidx.appcompat.view.b r0 = r4.f24455u
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            androidx.appcompat.app.h$r r2 = r4.t0(r5, r0)
            if (r5 != 0) goto L43
            androidx.appcompat.widget.I r5 = r4.f24449r
            if (r5 == 0) goto L43
            boolean r5 = r5.a()
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.f24436k
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L43
            androidx.appcompat.widget.I r5 = r4.f24449r
            boolean r5 = r5.e()
            if (r5 != 0) goto L3c
            boolean r5 = r4.f24448q0
            if (r5 != 0) goto L62
            boolean r5 = r4.P0(r2, r6)
            if (r5 == 0) goto L62
            androidx.appcompat.widget.I r5 = r4.f24449r
            boolean r0 = r5.c()
            goto L68
        L3c:
            androidx.appcompat.widget.I r5 = r4.f24449r
            boolean r0 = r5.b()
            goto L68
        L43:
            boolean r5 = r2.f24504o
            if (r5 != 0) goto L64
            boolean r3 = r2.f24503n
            if (r3 == 0) goto L4c
            goto L64
        L4c:
            boolean r5 = r2.f24502m
            if (r5 == 0) goto L62
            boolean r5 = r2.f24507r
            if (r5 == 0) goto L5b
            r2.f24502m = r1
            boolean r5 = r4.P0(r2, r6)
            goto L5c
        L5b:
            r5 = r0
        L5c:
            if (r5 == 0) goto L62
            r4.M0(r2, r6)
            goto L68
        L62:
            r0 = r1
            goto L68
        L64:
            r4.c0(r2, r0)
            r0 = r5
        L68:
            if (r0 == 0) goto L85
            android.content.Context r5 = r4.f24436k
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L7e
            r5.playSoundEffect(r1)
            return r0
        L7e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.I0(int, android.view.KeyEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void M0(androidx.appcompat.app.h.r r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.M0(androidx.appcompat.app.h$r, android.view.KeyEvent):void");
    }

    private boolean O0(r rVar, int i10, KeyEvent keyEvent, int i11) {
        androidx.appcompat.view.menu.e eVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((rVar.f24502m || P0(rVar, keyEvent)) && (eVar = rVar.f24499j) != null) {
            zPerformShortcut = eVar.performShortcut(i10, keyEvent, i11);
        }
        if (zPerformShortcut && (i11 & 1) == 0 && this.f24449r == null) {
            c0(rVar, true);
        }
        return zPerformShortcut;
    }

    private boolean P0(r rVar, KeyEvent keyEvent) {
        I i10;
        I i11;
        I i12;
        if (this.f24448q0) {
            return false;
        }
        if (rVar.f24502m) {
            return true;
        }
        r rVar2 = this.f24440m0;
        if (rVar2 != null && rVar2 != rVar) {
            c0(rVar2, false);
        }
        Window.Callback callbackV0 = v0();
        if (callbackV0 != null) {
            rVar.f24498i = callbackV0.onCreatePanelView(rVar.f24490a);
        }
        int i13 = rVar.f24490a;
        boolean z10 = i13 == 0 || i13 == 108;
        if (z10 && (i12 = this.f24449r) != null) {
            i12.f();
        }
        if (rVar.f24498i == null && (!z10 || !(N0() instanceof x))) {
            androidx.appcompat.view.menu.e eVar = rVar.f24499j;
            if (eVar == null || rVar.f24507r) {
                if (eVar == null && (!z0(rVar) || rVar.f24499j == null)) {
                    return false;
                }
                if (z10 && this.f24449r != null) {
                    if (this.f24451s == null) {
                        this.f24451s = new g();
                    }
                    this.f24449r.d(rVar.f24499j, this.f24451s);
                }
                rVar.f24499j.i0();
                if (!callbackV0.onCreatePanelMenu(rVar.f24490a, rVar.f24499j)) {
                    rVar.c(null);
                    if (z10 && (i10 = this.f24449r) != null) {
                        i10.d(null, this.f24451s);
                    }
                    return false;
                }
                rVar.f24507r = false;
            }
            rVar.f24499j.i0();
            Bundle bundle = rVar.f24508s;
            if (bundle != null) {
                rVar.f24499j.S(bundle);
                rVar.f24508s = null;
            }
            if (!callbackV0.onPreparePanel(0, rVar.f24498i, rVar.f24499j)) {
                if (z10 && (i11 = this.f24449r) != null) {
                    i11.d(null, this.f24451s);
                }
                rVar.f24499j.h0();
                return false;
            }
            boolean z11 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            rVar.f24505p = z11;
            rVar.f24499j.setQwertyMode(z11);
            rVar.f24499j.h0();
        }
        rVar.f24502m = true;
        rVar.f24503n = false;
        this.f24440m0 = rVar;
        return true;
    }

    private void Q0(boolean z10) {
        I i10 = this.f24449r;
        if (i10 == null || !i10.a() || (ViewConfiguration.get(this.f24436k).hasPermanentMenuKey() && !this.f24449r.g())) {
            r rVarT0 = t0(0, true);
            rVarT0.f24506q = true;
            c0(rVarT0, false);
            M0(rVarT0, null);
            return;
        }
        Window.Callback callbackV0 = v0();
        if (this.f24449r.e() && z10) {
            this.f24449r.b();
            if (this.f24448q0) {
                return;
            }
            callbackV0.onPanelClosed(108, t0(0, true).f24499j);
            return;
        }
        if (callbackV0 == null || this.f24448q0) {
            return;
        }
        if (this.f24464y0 && (this.f24466z0 & 1) != 0) {
            this.f24437l.getDecorView().removeCallbacks(this.f24416A0);
            this.f24416A0.run();
        }
        r rVarT02 = t0(0, true);
        androidx.appcompat.view.menu.e eVar = rVarT02.f24499j;
        if (eVar == null || rVarT02.f24507r || !callbackV0.onPreparePanel(0, rVarT02.f24498i, eVar)) {
            return;
        }
        callbackV0.onMenuOpened(108, rVarT02.f24499j);
        this.f24449r.c();
    }

    private int R0(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i10 != 9) {
            return i10;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean S(boolean z10) {
        return T(z10, true);
    }

    private boolean T(boolean z10, boolean z11) {
        if (this.f24448q0) {
            return false;
        }
        int iX = X();
        int iC0 = C0(this.f24436k, iX);
        G1.i iVarW = Build.VERSION.SDK_INT < 33 ? W(this.f24436k) : null;
        if (!z11 && iVarW != null) {
            iVarW = s0(this.f24436k.getResources().getConfiguration());
        }
        boolean zC1 = c1(iC0, iVarW, z10);
        if (iX == 0) {
            r0(this.f24436k).e();
        } else {
            o oVar = this.f24460w0;
            if (oVar != null) {
                oVar.a();
            }
        }
        if (iX == 3) {
            q0(this.f24436k).e();
            return zC1;
        }
        o oVar2 = this.f24462x0;
        if (oVar2 != null) {
            oVar2.a();
        }
        return zC1;
    }

    private void U() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f24417B.findViewById(R.id.content);
        View decorView = this.f24437l.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f24436k.obtainStyledAttributes(i.j.f48379y0);
        typedArrayObtainStyledAttributes.getValue(i.j.f48181K0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(i.j.f48186L0, contentFrameLayout.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes.hasValue(i.j.f48171I0)) {
            typedArrayObtainStyledAttributes.getValue(i.j.f48171I0, contentFrameLayout.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(i.j.f48176J0)) {
            typedArrayObtainStyledAttributes.getValue(i.j.f48176J0, contentFrameLayout.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(i.j.f48161G0)) {
            typedArrayObtainStyledAttributes.getValue(i.j.f48161G0, contentFrameLayout.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(i.j.f48166H0)) {
            typedArrayObtainStyledAttributes.getValue(i.j.f48166H0, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void V(Window window) {
        if (this.f24437l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof m) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        m mVar = new m(callback);
        this.f24439m = mVar;
        window.setCallback(mVar);
        h0 h0VarU = h0.u(this.f24436k, null, f24413K0);
        Drawable drawableH = h0VarU.h(0);
        if (drawableH != null) {
            window.setBackgroundDrawable(drawableH);
        }
        h0VarU.x();
        this.f24437l = window;
        if (Build.VERSION.SDK_INT < 33 || this.f24428G0 != null) {
            return;
        }
        M(null);
    }

    private boolean V0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f24437l.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int X() {
        int i10 = this.f24452s0;
        return i10 != -100 ? i10 : androidx.appcompat.app.f.o();
    }

    private void Z0() {
        if (this.f24415A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void a0() {
        o oVar = this.f24460w0;
        if (oVar != null) {
            oVar.a();
        }
        o oVar2 = this.f24462x0;
        if (oVar2 != null) {
            oVar2.a();
        }
    }

    private androidx.appcompat.app.c a1() {
        for (Context baseContext = this.f24436k; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof androidx.appcompat.app.c) {
                return (androidx.appcompat.app.c) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b1(Configuration configuration) {
        Activity activity = (Activity) this.f24435j;
        if (activity instanceof androidx.lifecycle.r) {
            if (((androidx.lifecycle.r) activity).getLifecycle().getCurrentState().b(AbstractC2857k.b.f30237c)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.f24446p0 || this.f24448q0) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean c1(int r11, G1.i r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.c1(int, G1.i, boolean):boolean");
    }

    private Configuration d0(Context context, int i10, G1.i iVar, Configuration configuration, boolean z10) {
        int i11 = i10 != 1 ? i10 != 2 ? z10 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (iVar != null) {
            S0(configuration2, iVar);
        }
        return configuration2;
    }

    private ViewGroup e0() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f24436k.obtainStyledAttributes(i.j.f48379y0);
        if (!typedArrayObtainStyledAttributes.hasValue(i.j.f48146D0)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(i.j.f48191M0, false)) {
            H(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i.j.f48146D0, false)) {
            H(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(i.j.f48151E0, false)) {
            H(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(i.j.f48156F0, false)) {
            H(10);
        }
        this.f24432X = typedArrayObtainStyledAttributes.getBoolean(i.j.f48384z0, false);
        typedArrayObtainStyledAttributes.recycle();
        l0();
        this.f24437l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f24436k);
        if (this.f24433Y) {
            viewGroup = this.f24431I ? (ViewGroup) layoutInflaterFrom.inflate(i.g.f48104o, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(i.g.f48103n, (ViewGroup) null);
        } else if (this.f24432X) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(i.g.f48095f, (ViewGroup) null);
            this.f24429H = false;
            this.f24427G = false;
        } else if (this.f24427G) {
            TypedValue typedValue = new TypedValue();
            this.f24436k.getTheme().resolveAttribute(AbstractC4956a.f47957d, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.d(this.f24436k, typedValue.resourceId) : this.f24436k).inflate(i.g.f48105p, (ViewGroup) null);
            I i10 = (I) viewGroup.findViewById(i.f.f48080q);
            this.f24449r = i10;
            i10.setWindowCallback(v0());
            if (this.f24429H) {
                this.f24449r.h(109);
            }
            if (this.f24423E) {
                this.f24449r.h(2);
            }
            if (this.f24425F) {
                this.f24449r.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f24427G + ", windowActionBarOverlay: " + this.f24429H + ", android:windowIsFloating: " + this.f24432X + ", windowActionModeOverlay: " + this.f24431I + ", windowNoTitle: " + this.f24433Y + " }");
        }
        AbstractC2747a0.w0(viewGroup, new b());
        if (this.f24449r == null) {
            this.f24419C = (TextView) viewGroup.findViewById(i.f.f48060N);
        }
        s0.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(i.f.f48065b);
        ViewGroup viewGroup2 = (ViewGroup) this.f24437l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f24437l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void e1(int i10, G1.i iVar, boolean z10, Configuration configuration) {
        Resources resources = this.f24436k.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i10 | (resources.getConfiguration().uiMode & (-49));
        if (iVar != null) {
            S0(configuration2, iVar);
        }
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            w.a(resources);
        }
        int i11 = this.f24454t0;
        if (i11 != 0) {
            this.f24436k.setTheme(i11);
            this.f24436k.getTheme().applyStyle(this.f24454t0, true);
        }
        if (z10 && (this.f24435j instanceof Activity)) {
            b1(configuration2);
        }
    }

    private void g1(View view) {
        view.setBackgroundColor((AbstractC2747a0.K(view) & 8192) != 0 ? AbstractC7194b.c(this.f24436k, i.c.f47982b) : AbstractC7194b.c(this.f24436k, i.c.f47981a));
    }

    private void k0() {
        if (this.f24415A) {
            return;
        }
        this.f24417B = e0();
        CharSequence charSequenceU0 = u0();
        if (!TextUtils.isEmpty(charSequenceU0)) {
            I i10 = this.f24449r;
            if (i10 != null) {
                i10.setWindowTitle(charSequenceU0);
            } else if (N0() != null) {
                N0().v(charSequenceU0);
            } else {
                TextView textView = this.f24419C;
                if (textView != null) {
                    textView.setText(charSequenceU0);
                }
            }
        }
        U();
        L0(this.f24417B);
        this.f24415A = true;
        r rVarT0 = t0(0, false);
        if (this.f24448q0) {
            return;
        }
        if (rVarT0 == null || rVarT0.f24499j == null) {
            A0(108);
        }
    }

    private void l0() {
        if (this.f24437l == null) {
            Object obj = this.f24435j;
            if (obj instanceof Activity) {
                V(((Activity) obj).getWindow());
            }
        }
        if (this.f24437l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration n0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f10 = configuration.fontScale;
            float f11 = configuration2.fontScale;
            if (f10 != f11) {
                configuration3.fontScale = f11;
            }
            int i10 = configuration.mcc;
            int i11 = configuration2.mcc;
            if (i10 != i11) {
                configuration3.mcc = i11;
            }
            int i12 = configuration.mnc;
            int i13 = configuration2.mnc;
            if (i12 != i13) {
                configuration3.mnc = i13;
            }
            int i14 = Build.VERSION.SDK_INT;
            j.a(configuration, configuration2, configuration3);
            int i15 = configuration.touchscreen;
            int i16 = configuration2.touchscreen;
            if (i15 != i16) {
                configuration3.touchscreen = i16;
            }
            int i17 = configuration.keyboard;
            int i18 = configuration2.keyboard;
            if (i17 != i18) {
                configuration3.keyboard = i18;
            }
            int i19 = configuration.keyboardHidden;
            int i20 = configuration2.keyboardHidden;
            if (i19 != i20) {
                configuration3.keyboardHidden = i20;
            }
            int i21 = configuration.navigation;
            int i22 = configuration2.navigation;
            if (i21 != i22) {
                configuration3.navigation = i22;
            }
            int i23 = configuration.navigationHidden;
            int i24 = configuration2.navigationHidden;
            if (i23 != i24) {
                configuration3.navigationHidden = i24;
            }
            int i25 = configuration.orientation;
            int i26 = configuration2.orientation;
            if (i25 != i26) {
                configuration3.orientation = i26;
            }
            int i27 = configuration.screenLayout & 15;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 15)) {
                configuration3.screenLayout |= i28 & 15;
            }
            int i29 = configuration.screenLayout & JfifUtil.MARKER_SOFn;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & JfifUtil.MARKER_SOFn)) {
                configuration3.screenLayout |= i30 & JfifUtil.MARKER_SOFn;
            }
            int i31 = configuration.screenLayout & 48;
            int i32 = configuration2.screenLayout;
            if (i31 != (i32 & 48)) {
                configuration3.screenLayout |= i32 & 48;
            }
            int i33 = configuration.screenLayout & 768;
            int i34 = configuration2.screenLayout;
            if (i33 != (i34 & 768)) {
                configuration3.screenLayout |= i34 & 768;
            }
            if (i14 >= 26) {
                k.a(configuration, configuration2, configuration3);
            }
            int i35 = configuration.uiMode & 15;
            int i36 = configuration2.uiMode;
            if (i35 != (i36 & 15)) {
                configuration3.uiMode |= i36 & 15;
            }
            int i37 = configuration.uiMode & 48;
            int i38 = configuration2.uiMode;
            if (i37 != (i38 & 48)) {
                configuration3.uiMode |= i38 & 48;
            }
            int i39 = configuration.screenWidthDp;
            int i40 = configuration2.screenWidthDp;
            if (i39 != i40) {
                configuration3.screenWidthDp = i40;
            }
            int i41 = configuration.screenHeightDp;
            int i42 = configuration2.screenHeightDp;
            if (i41 != i42) {
                configuration3.screenHeightDp = i42;
            }
            int i43 = configuration.smallestScreenWidthDp;
            int i44 = configuration2.smallestScreenWidthDp;
            if (i43 != i44) {
                configuration3.smallestScreenWidthDp = i44;
            }
            int i45 = configuration.densityDpi;
            int i46 = configuration2.densityDpi;
            if (i45 != i46) {
                configuration3.densityDpi = i46;
            }
        }
        return configuration3;
    }

    private int p0(Context context) {
        if (!this.f24458v0 && (this.f24435j instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f24435j.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f24456u0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e10);
                this.f24456u0 = 0;
            }
        }
        this.f24458v0 = true;
        return this.f24456u0;
    }

    private o q0(Context context) {
        if (this.f24462x0 == null) {
            this.f24462x0 = new n(context);
        }
        return this.f24462x0;
    }

    private o r0(Context context) {
        if (this.f24460w0 == null) {
            this.f24460w0 = new p(z.a(context));
        }
        return this.f24460w0;
    }

    private void w0() {
        k0();
        if (this.f24427G && this.f24443o == null) {
            Object obj = this.f24435j;
            if (obj instanceof Activity) {
                this.f24443o = new A((Activity) this.f24435j, this.f24429H);
            } else if (obj instanceof Dialog) {
                this.f24443o = new A((Dialog) this.f24435j);
            }
            AbstractC2646a abstractC2646a = this.f24443o;
            if (abstractC2646a != null) {
                abstractC2646a.q(this.f24418B0);
            }
        }
    }

    private boolean x0(r rVar) {
        View view = rVar.f24498i;
        if (view != null) {
            rVar.f24497h = view;
            return true;
        }
        if (rVar.f24499j == null) {
            return false;
        }
        if (this.f24453t == null) {
            this.f24453t = new s();
        }
        View view2 = (View) rVar.a(this.f24453t);
        rVar.f24497h = view2;
        return view2 != null;
    }

    private boolean y0(r rVar) {
        rVar.d(o0());
        rVar.f24496g = new q(rVar.f24501l);
        rVar.f24492c = 81;
        return true;
    }

    private boolean z0(r rVar) {
        Resources.Theme themeNewTheme;
        Context context = this.f24436k;
        int i10 = rVar.f24490a;
        if ((i10 == 0 || i10 == 108) && this.f24449r != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(AbstractC4956a.f47957d, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(AbstractC4956a.f47958e, typedValue, true);
            } else {
                theme.resolveAttribute(AbstractC4956a.f47958e, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.W(this);
        rVar.c(eVar);
        return true;
    }

    @Override // androidx.appcompat.app.f
    public void A(Bundle bundle) {
        k0();
    }

    @Override // androidx.appcompat.app.f
    public void B() {
        AbstractC2646a abstractC2646aT = t();
        if (abstractC2646aT != null) {
            abstractC2646aT.t(true);
        }
    }

    public boolean B0() {
        return this.f24465z;
    }

    int C0(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return r0(context).c();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    return q0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i10;
    }

    @Override // androidx.appcompat.app.f
    public void D() {
        T(true, false);
    }

    boolean D0() {
        boolean z10 = this.f24442n0;
        this.f24442n0 = false;
        r rVarT0 = t0(0, false);
        if (rVarT0 != null && rVarT0.f24504o) {
            if (!z10) {
                c0(rVarT0, true);
            }
            return true;
        }
        androidx.appcompat.view.b bVar = this.f24455u;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        AbstractC2646a abstractC2646aT = t();
        return abstractC2646aT != null && abstractC2646aT.g();
    }

    @Override // androidx.appcompat.app.f
    public void E() {
        AbstractC2646a abstractC2646aT = t();
        if (abstractC2646aT != null) {
            abstractC2646aT.t(false);
        }
    }

    boolean E0(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            this.f24442n0 = (keyEvent.getFlags() & 128) != 0;
        } else if (i10 == 82) {
            F0(0, keyEvent);
            return true;
        }
        return false;
    }

    boolean G0(int i10, KeyEvent keyEvent) {
        AbstractC2646a abstractC2646aT = t();
        if (abstractC2646aT != null && abstractC2646aT.n(i10, keyEvent)) {
            return true;
        }
        r rVar = this.f24440m0;
        if (rVar != null && O0(rVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            r rVar2 = this.f24440m0;
            if (rVar2 != null) {
                rVar2.f24503n = true;
            }
            return true;
        }
        if (this.f24440m0 == null) {
            r rVarT0 = t0(0, true);
            P0(rVarT0, keyEvent);
            boolean zO0 = O0(rVarT0, keyEvent.getKeyCode(), keyEvent, 1);
            rVarT0.f24502m = false;
            if (zO0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.f
    public boolean H(int i10) {
        int iR0 = R0(i10);
        if (this.f24433Y && iR0 == 108) {
            return false;
        }
        if (this.f24427G && iR0 == 1) {
            this.f24427G = false;
        }
        if (iR0 == 1) {
            Z0();
            this.f24433Y = true;
            return true;
        }
        if (iR0 == 2) {
            Z0();
            this.f24423E = true;
            return true;
        }
        if (iR0 == 5) {
            Z0();
            this.f24425F = true;
            return true;
        }
        if (iR0 == 10) {
            Z0();
            this.f24431I = true;
            return true;
        }
        if (iR0 == 108) {
            Z0();
            this.f24427G = true;
            return true;
        }
        if (iR0 != 109) {
            return this.f24437l.requestFeature(iR0);
        }
        Z0();
        this.f24429H = true;
        return true;
    }

    boolean H0(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            if (i10 == 82) {
                I0(0, keyEvent);
                return true;
            }
        } else if (D0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.f
    public void I(int i10) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.f24417B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f24436k).inflate(i10, viewGroup);
        this.f24439m.c(this.f24437l.getCallback());
    }

    @Override // androidx.appcompat.app.f
    public void J(View view) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.f24417B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f24439m.c(this.f24437l.getCallback());
    }

    void J0(int i10) {
        AbstractC2646a abstractC2646aT;
        if (i10 != 108 || (abstractC2646aT = t()) == null) {
            return;
        }
        abstractC2646aT.h(true);
    }

    @Override // androidx.appcompat.app.f
    public void K(View view, ViewGroup.LayoutParams layoutParams) {
        k0();
        ViewGroup viewGroup = (ViewGroup) this.f24417B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f24439m.c(this.f24437l.getCallback());
    }

    void K0(int i10) {
        if (i10 == 108) {
            AbstractC2646a abstractC2646aT = t();
            if (abstractC2646aT != null) {
                abstractC2646aT.h(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            r rVarT0 = t0(i10, true);
            if (rVarT0.f24504o) {
                c0(rVarT0, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // androidx.appcompat.app.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void M(android.window.OnBackInvokedDispatcher r3) {
        /*
            r2 = this;
            super.M(r3)
            android.window.OnBackInvokedDispatcher r0 = r2.f24428G0
            if (r0 == 0) goto L11
            android.window.OnBackInvokedCallback r1 = r2.f24430H0
            if (r1 == 0) goto L11
            androidx.appcompat.app.h.l.c(r0, r1)
            r0 = 0
            r2.f24430H0 = r0
        L11:
            if (r3 != 0) goto L2c
            java.lang.Object r0 = r2.f24435j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L2c
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L2c
            java.lang.Object r3 = r2.f24435j
            android.app.Activity r3 = (android.app.Activity) r3
            android.window.OnBackInvokedDispatcher r3 = androidx.appcompat.app.h.l.a(r3)
            r2.f24428G0 = r3
            goto L2e
        L2c:
            r2.f24428G0 = r3
        L2e:
            r2.d1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.M(android.window.OnBackInvokedDispatcher):void");
    }

    @Override // androidx.appcompat.app.f
    public void N(Toolbar toolbar) {
        if (this.f24435j instanceof Activity) {
            AbstractC2646a abstractC2646aT = t();
            if (abstractC2646aT instanceof A) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f24445p = null;
            if (abstractC2646aT != null) {
                abstractC2646aT.m();
            }
            this.f24443o = null;
            if (toolbar != null) {
                x xVar = new x(toolbar, u0(), this.f24439m);
                this.f24443o = xVar;
                this.f24439m.e(xVar.f24537c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f24439m.e(null);
            }
            v();
        }
    }

    final AbstractC2646a N0() {
        return this.f24443o;
    }

    @Override // androidx.appcompat.app.f
    public void O(int i10) {
        this.f24454t0 = i10;
    }

    @Override // androidx.appcompat.app.f
    public final void P(CharSequence charSequence) {
        this.f24447q = charSequence;
        I i10 = this.f24449r;
        if (i10 != null) {
            i10.setWindowTitle(charSequence);
            return;
        }
        if (N0() != null) {
            N0().v(charSequence);
            return;
        }
        TextView textView = this.f24419C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    void S0(Configuration configuration, G1.i iVar) {
        j.d(configuration, iVar);
    }

    void T0(G1.i iVar) {
        j.c(iVar);
    }

    final boolean U0() {
        ViewGroup viewGroup;
        return this.f24415A && (viewGroup = this.f24417B) != null && viewGroup.isLaidOut();
    }

    G1.i W(Context context) {
        G1.i iVarS;
        if (Build.VERSION.SDK_INT >= 33 || (iVarS = androidx.appcompat.app.f.s()) == null) {
            return null;
        }
        G1.i iVarS0 = s0(context.getApplicationContext().getResources().getConfiguration());
        G1.i iVarB = v.b(iVarS, iVarS0);
        return iVarB.f() ? iVarS0 : iVarB;
    }

    boolean W0() {
        if (this.f24428G0 == null) {
            return false;
        }
        r rVarT0 = t0(0, false);
        return (rVarT0 != null && rVarT0.f24504o) || this.f24455u != null;
    }

    public androidx.appcompat.view.b X0(b.a aVar) {
        androidx.appcompat.app.d dVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.b bVar = this.f24455u;
        if (bVar != null) {
            bVar.c();
        }
        C0425h c0425h = new C0425h(aVar);
        AbstractC2646a abstractC2646aT = t();
        if (abstractC2646aT != null) {
            androidx.appcompat.view.b bVarW = abstractC2646aT.w(c0425h);
            this.f24455u = bVarW;
            if (bVarW != null && (dVar = this.f24441n) != null) {
                dVar.e(bVarW);
            }
        }
        if (this.f24455u == null) {
            this.f24455u = Y0(c0425h);
        }
        d1();
        return this.f24455u;
    }

    void Y(int i10, r rVar, Menu menu) {
        if (menu == null) {
            if (rVar == null && i10 >= 0) {
                r[] rVarArr = this.f24438l0;
                if (i10 < rVarArr.length) {
                    rVar = rVarArr[i10];
                }
            }
            if (rVar != null) {
                menu = rVar.f24499j;
            }
        }
        if ((rVar == null || rVar.f24504o) && !this.f24448q0) {
            this.f24439m.d(this.f24437l.getCallback(), i10, menu);
        }
    }

    androidx.appcompat.view.b Y0(b.a aVar) {
        androidx.appcompat.view.b bVarG;
        Context dVar;
        androidx.appcompat.app.d dVar2;
        j0();
        androidx.appcompat.view.b bVar = this.f24455u;
        if (bVar != null) {
            bVar.c();
        }
        if (!(aVar instanceof C0425h)) {
            aVar = new C0425h(aVar);
        }
        androidx.appcompat.app.d dVar3 = this.f24441n;
        if (dVar3 == null || this.f24448q0) {
            bVarG = null;
        } else {
            try {
                bVarG = dVar3.g(aVar);
            } catch (AbstractMethodError unused) {
                bVarG = null;
            }
        }
        if (bVarG != null) {
            this.f24455u = bVarG;
        } else {
            if (this.f24457v == null) {
                if (this.f24432X) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f24436k.getTheme();
                    theme.resolveAttribute(AbstractC4956a.f47957d, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f24436k.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new androidx.appcompat.view.d(this.f24436k, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.f24436k;
                    }
                    this.f24457v = new ActionBarContextView(dVar);
                    PopupWindow popupWindow = new PopupWindow(dVar, (AttributeSet) null, AbstractC4956a.f47959f);
                    this.f24459w = popupWindow;
                    androidx.core.widget.h.b(popupWindow, 2);
                    this.f24459w.setContentView(this.f24457v);
                    this.f24459w.setWidth(-1);
                    dVar.getTheme().resolveAttribute(AbstractC4956a.f47955b, typedValue, true);
                    this.f24457v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.f24459w.setHeight(-2);
                    this.f24461x = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f24417B.findViewById(i.f.f48072i);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(o0()));
                        this.f24457v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.f24457v != null) {
                j0();
                this.f24457v.k();
                androidx.appcompat.view.e eVar = new androidx.appcompat.view.e(this.f24457v.getContext(), this.f24457v, aVar, this.f24459w == null);
                if (aVar.b(eVar, eVar.e())) {
                    eVar.k();
                    this.f24457v.h(eVar);
                    this.f24455u = eVar;
                    if (U0()) {
                        this.f24457v.setAlpha(0.0f);
                        C2767k0 c2767k0B = AbstractC2747a0.e(this.f24457v).b(1.0f);
                        this.f24463y = c2767k0B;
                        c2767k0B.g(new e());
                    } else {
                        this.f24457v.setAlpha(1.0f);
                        this.f24457v.setVisibility(0);
                        if (this.f24457v.getParent() instanceof View) {
                            AbstractC2747a0.h0((View) this.f24457v.getParent());
                        }
                    }
                    if (this.f24459w != null) {
                        this.f24437l.getDecorView().post(this.f24461x);
                    }
                } else {
                    this.f24455u = null;
                }
            }
        }
        androidx.appcompat.view.b bVar2 = this.f24455u;
        if (bVar2 != null && (dVar2 = this.f24441n) != null) {
            dVar2.e(bVar2);
        }
        d1();
        return this.f24455u;
    }

    void Z(androidx.appcompat.view.menu.e eVar) {
        if (this.f24434Z) {
            return;
        }
        this.f24434Z = true;
        this.f24449r.l();
        Window.Callback callbackV0 = v0();
        if (callbackV0 != null && !this.f24448q0) {
            callbackV0.onPanelClosed(108, eVar);
        }
        this.f24434Z = false;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        r rVarM0;
        Window.Callback callbackV0 = v0();
        if (callbackV0 == null || this.f24448q0 || (rVarM0 = m0(eVar.F())) == null) {
            return false;
        }
        return callbackV0.onMenuItemSelected(rVarM0.f24490a, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        Q0(true);
    }

    void b0(int i10) {
        c0(t0(i10, true), true);
    }

    void c0(r rVar, boolean z10) {
        ViewGroup viewGroup;
        I i10;
        if (z10 && rVar.f24490a == 0 && (i10 = this.f24449r) != null && i10.e()) {
            Z(rVar.f24499j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f24436k.getSystemService("window");
        if (windowManager != null && rVar.f24504o && (viewGroup = rVar.f24496g) != null) {
            windowManager.removeView(viewGroup);
            if (z10) {
                Y(rVar.f24490a, rVar, null);
            }
        }
        rVar.f24502m = false;
        rVar.f24503n = false;
        rVar.f24504o = false;
        rVar.f24497h = null;
        rVar.f24506q = true;
        if (this.f24440m0 == rVar) {
            this.f24440m0 = null;
        }
        if (rVar.f24490a == 0) {
            d1();
        }
    }

    void d1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zW0 = W0();
            if (zW0 && this.f24430H0 == null) {
                this.f24430H0 = l.b(this.f24428G0, this);
            } else {
                if (zW0 || (onBackInvokedCallback = this.f24430H0) == null) {
                    return;
                }
                l.c(this.f24428G0, onBackInvokedCallback);
                this.f24430H0 = null;
            }
        }
    }

    @Override // androidx.appcompat.app.f
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        k0();
        ((ViewGroup) this.f24417B.findViewById(R.id.content)).addView(view, layoutParams);
        this.f24439m.c(this.f24437l.getCallback());
    }

    @Override // androidx.appcompat.app.f
    public boolean f() {
        return S(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View f0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z10;
        if (this.f24424E0 == null) {
            TypedArray typedArrayObtainStyledAttributes = this.f24436k.obtainStyledAttributes(i.j.f48379y0);
            String string = typedArrayObtainStyledAttributes.getString(i.j.f48141C0);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f24424E0 = new androidx.appcompat.app.s();
            } else {
                try {
                    this.f24424E0 = (androidx.appcompat.app.s) this.f24436k.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    this.f24424E0 = new androidx.appcompat.app.s();
                }
            }
        }
        boolean z11 = f24412J0;
        boolean zV0 = false;
        if (z11) {
            if (this.f24426F0 == null) {
                this.f24426F0 = new u();
            }
            if (this.f24426F0.a(attributeSet)) {
                z10 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zV0 = V0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zV0 = true;
                }
                z10 = zV0;
            }
        } else {
            z10 = zV0;
        }
        return this.f24424E0.r(view, str, context, attributeSet, z10, z11, true, r0.c());
    }

    final int f1(L0 l02, Rect rect) {
        boolean z10;
        boolean z11;
        int iM = l02 != null ? l02.m() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f24457v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f24457v.getLayoutParams();
            if (this.f24457v.isShown()) {
                if (this.f24420C0 == null) {
                    this.f24420C0 = new Rect();
                    this.f24422D0 = new Rect();
                }
                Rect rect2 = this.f24420C0;
                Rect rect3 = this.f24422D0;
                if (l02 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(l02.k(), l02.m(), l02.l(), l02.j());
                }
                s0.a(this.f24417B, rect2, rect3);
                int i10 = rect2.top;
                int i11 = rect2.left;
                int i12 = rect2.right;
                L0 l0F = AbstractC2747a0.F(this.f24417B);
                int iK = l0F == null ? 0 : l0F.k();
                int iL = l0F == null ? 0 : l0F.l();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || this.f24421D != null) {
                    View view = this.f24421D;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != iK || marginLayoutParams2.rightMargin != iL) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = iK;
                            marginLayoutParams2.rightMargin = iL;
                            this.f24421D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f24436k);
                    this.f24421D = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iK;
                    layoutParams.rightMargin = iL;
                    this.f24417B.addView(this.f24421D, -1, layoutParams);
                }
                View view3 = this.f24421D;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    g1(this.f24421D);
                }
                if (!this.f24431I && z) {
                    iM = 0;
                }
                z10 = z;
                z = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z = false;
            }
            if (z) {
                this.f24457v.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f24421D;
        if (view4 != null) {
            view4.setVisibility(z10 ? 0 : 8);
        }
        return iM;
    }

    void g0() {
        androidx.appcompat.view.menu.e eVar;
        I i10 = this.f24449r;
        if (i10 != null) {
            i10.l();
        }
        if (this.f24459w != null) {
            this.f24437l.getDecorView().removeCallbacks(this.f24461x);
            if (this.f24459w.isShowing()) {
                try {
                    this.f24459w.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f24459w = null;
        }
        j0();
        r rVarT0 = t0(0, false);
        if (rVarT0 == null || (eVar = rVarT0.f24499j) == null) {
            return;
        }
        eVar.close();
    }

    boolean h0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f24435j;
        if (((obj instanceof AbstractC2783t.a) || (obj instanceof androidx.appcompat.app.r)) && (decorView = this.f24437l.getDecorView()) != null && AbstractC2783t.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f24439m.b(this.f24437l.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? E0(keyCode, keyEvent) : H0(keyCode, keyEvent);
    }

    @Override // androidx.appcompat.app.f
    public Context i(Context context) {
        Context context2;
        this.f24444o0 = true;
        int iC0 = C0(context, X());
        if (androidx.appcompat.app.f.w(context)) {
            androidx.appcompat.app.f.R(context);
        }
        G1.i iVarW = W(context);
        if (context instanceof ContextThemeWrapper) {
            context2 = context;
            try {
                ((ContextThemeWrapper) context2).applyOverrideConfiguration(d0(context2, iC0, iVarW, null, false));
                return context2;
            } catch (IllegalStateException unused) {
            }
        } else {
            context2 = context;
        }
        if (context2 instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context2).a(d0(context2, iC0, iVarW, null, false));
                return context2;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f24414L0) {
            return super.i(context2);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context2.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context2.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationD0 = d0(context2, iC0, iVarW, !configuration2.equals(configuration3) ? n0(configuration2, configuration3) : null, true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context2, i.i.f48127d);
        dVar.a(configurationD0);
        try {
            if (context2.getTheme() != null) {
                k.f.a(dVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.i(dVar);
    }

    void i0(int i10) {
        r rVarT0;
        r rVarT02 = t0(i10, true);
        if (rVarT02.f24499j != null) {
            Bundle bundle = new Bundle();
            rVarT02.f24499j.U(bundle);
            if (bundle.size() > 0) {
                rVarT02.f24508s = bundle;
            }
            rVarT02.f24499j.i0();
            rVarT02.f24499j.clear();
        }
        rVarT02.f24507r = true;
        rVarT02.f24506q = true;
        if ((i10 != 108 && i10 != 0) || this.f24449r == null || (rVarT0 = t0(0, false)) == null) {
            return;
        }
        rVarT0.f24502m = false;
        P0(rVarT0, null);
    }

    void j0() {
        C2767k0 c2767k0 = this.f24463y;
        if (c2767k0 != null) {
            c2767k0.c();
        }
    }

    @Override // androidx.appcompat.app.f
    public View l(int i10) {
        k0();
        return this.f24437l.findViewById(i10);
    }

    r m0(Menu menu) {
        r[] rVarArr = this.f24438l0;
        int length = rVarArr != null ? rVarArr.length : 0;
        for (int i10 = 0; i10 < length; i10++) {
            r rVar = rVarArr[i10];
            if (rVar != null && rVar.f24499j == menu) {
                return rVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.f
    public Context n() {
        return this.f24436k;
    }

    final Context o0() {
        AbstractC2646a abstractC2646aT = t();
        Context contextJ = abstractC2646aT != null ? abstractC2646aT.j() : null;
        return contextJ == null ? this.f24436k : contextJ;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return f0(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.f
    public int p() {
        return this.f24452s0;
    }

    @Override // androidx.appcompat.app.f
    public MenuInflater r() {
        if (this.f24445p == null) {
            w0();
            AbstractC2646a abstractC2646a = this.f24443o;
            this.f24445p = new androidx.appcompat.view.g(abstractC2646a != null ? abstractC2646a.j() : this.f24436k);
        }
        return this.f24445p;
    }

    G1.i s0(Configuration configuration) {
        return j.b(configuration);
    }

    @Override // androidx.appcompat.app.f
    public AbstractC2646a t() {
        w0();
        return this.f24443o;
    }

    protected r t0(int i10, boolean z10) {
        r[] rVarArr = this.f24438l0;
        if (rVarArr == null || rVarArr.length <= i10) {
            r[] rVarArr2 = new r[i10 + 1];
            if (rVarArr != null) {
                System.arraycopy(rVarArr, 0, rVarArr2, 0, rVarArr.length);
            }
            this.f24438l0 = rVarArr2;
            rVarArr = rVarArr2;
        }
        r rVar = rVarArr[i10];
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(i10);
        rVarArr[i10] = rVar2;
        return rVar2;
    }

    @Override // androidx.appcompat.app.f
    public void u() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f24436k);
        if (layoutInflaterFrom.getFactory() == null) {
            AbstractC2785u.a(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof h) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    final CharSequence u0() {
        Object obj = this.f24435j;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f24447q;
    }

    @Override // androidx.appcompat.app.f
    public void v() {
        if (N0() == null || t().k()) {
            return;
        }
        A0(0);
    }

    final Window.Callback v0() {
        return this.f24437l.getCallback();
    }

    @Override // androidx.appcompat.app.f
    public void x(Configuration configuration) {
        AbstractC2646a abstractC2646aT;
        if (this.f24427G && this.f24415A && (abstractC2646aT = t()) != null) {
            abstractC2646aT.l(configuration);
        }
        C2657k.b().g(this.f24436k);
        this.f24450r0 = new Configuration(this.f24436k.getResources().getConfiguration());
        T(false, false);
    }

    @Override // androidx.appcompat.app.f
    public void y(Bundle bundle) {
        String strC;
        this.f24444o0 = true;
        S(false);
        l0();
        Object obj = this.f24435j;
        if (obj instanceof Activity) {
            try {
                strC = androidx.core.app.k.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                AbstractC2646a abstractC2646aN0 = N0();
                if (abstractC2646aN0 == null) {
                    this.f24418B0 = true;
                } else {
                    abstractC2646aN0.q(true);
                }
            }
            androidx.appcompat.app.f.d(this);
        }
        this.f24450r0 = new Configuration(this.f24436k.getResources().getConfiguration());
        this.f24446p0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    @Override // androidx.appcompat.app.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void z() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f24435j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.f.F(r3)
        L9:
            boolean r0 = r3.f24464y0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f24437l
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f24416A0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.f24448q0 = r0
            int r0 = r3.f24452s0
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f24435j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            t.i0 r0 = androidx.appcompat.app.h.f24411I0
            java.lang.Object r1 = r3.f24435j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f24452s0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            t.i0 r0 = androidx.appcompat.app.h.f24411I0
            java.lang.Object r1 = r3.f24435j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.a r0 = r3.f24443o
            if (r0 == 0) goto L5b
            r0.m()
        L5b:
            r3.a0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.h.z():void");
    }

    h(Dialog dialog, androidx.appcompat.app.d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private h(Context context, Window window, androidx.appcompat.app.d dVar, Object obj) {
        androidx.appcompat.app.c cVarA1;
        this.f24463y = null;
        this.f24465z = true;
        this.f24452s0 = -100;
        this.f24416A0 = new a();
        this.f24436k = context;
        this.f24441n = dVar;
        this.f24435j = obj;
        if (this.f24452s0 == -100 && (obj instanceof Dialog) && (cVarA1 = a1()) != null) {
            this.f24452s0 = cVarA1.J().p();
        }
        if (this.f24452s0 == -100) {
            i0 i0Var = f24411I0;
            Integer num = (Integer) i0Var.get(obj.getClass().getName());
            if (num != null) {
                this.f24452s0 = num.intValue();
                i0Var.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            V(window);
        }
        C2657k.h();
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c implements ContentFrameLayout.a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            h.this.g0();
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }
    }

    @Override // androidx.appcompat.app.f
    public void C(Bundle bundle) {
    }

    void L0(ViewGroup viewGroup) {
    }
}
