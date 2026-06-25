package androidx.compose.ui.window;

import Td.L;
import Y.AbstractC2460y;
import android.R;
import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import androidx.activity.G;
import androidx.activity.J;
import androidx.compose.ui.platform.C1;
import androidx.core.view.AbstractC2775o0;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import i1.C5015h;
import i1.EnumC5027t;
import i1.InterfaceC5011d;
import ie.InterfaceC5082a;
import java.util.UUID;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class l extends androidx.activity.r implements C1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC5082a f27848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private k f27849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final View f27850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j f27851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float f27852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f27853i;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends ViewOutlineProvider {
        a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends AbstractC5506u implements Function1 {
        b() {
            super(1);
        }

        public final void a(G g10) {
            if (l.this.f27849e.b()) {
                l.this.f27848d.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((G) obj);
            return L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27855a;

        static {
            int[] iArr = new int[EnumC5027t.values().length];
            try {
                iArr[EnumC5027t.f48573a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5027t.f48574b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f27855a = iArr;
        }
    }

    public l(InterfaceC5082a interfaceC5082a, k kVar, View view, EnumC5027t enumC5027t, InterfaceC5011d interfaceC5011d, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), kVar.a() ? l0.n.f52399a : l0.n.f52400b), 0, 2, null);
        this.f27848d = interfaceC5082a;
        this.f27849e = kVar;
        this.f27850f = view;
        float fN = C5015h.n(8);
        this.f27852h = fN;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(R.color.transparent);
        AbstractC2775o0.b(window, this.f27849e.a());
        window.setGravity(17);
        if (!this.f27849e.a()) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                d.f27823a.a(attributes);
            }
            if (i10 >= 30) {
                e eVar = e.f27824a;
                eVar.a(attributes, 0);
                eVar.b(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        j jVar = new j(getContext(), window);
        setTitle(this.f27849e.f());
        jVar.setTag(l0.l.f52355H, "Dialog:" + uuid);
        jVar.setClipChildren(false);
        jVar.setElevation(interfaceC5011d.l1(fN));
        jVar.setOutlineProvider(new a());
        this.f27851g = jVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            h(viewGroup);
        }
        setContentView(jVar);
        Z.b(jVar, Z.a(view));
        a0.b(jVar, a0.a(view));
        P3.m.b(jVar, P3.m.a(view));
        o(this.f27848d, this.f27849e, enumC5027t);
        J.b(getOnBackPressedDispatcher(), this, false, new b(), 2, null);
    }

    private static final void h(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof j) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                h(viewGroup2);
            }
        }
    }

    private final void m(EnumC5027t enumC5027t) {
        j jVar = this.f27851g;
        int i10 = c.f27855a[enumC5027t.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new Td.r();
        }
        jVar.setLayoutDirection(i11);
    }

    private final void n(u uVar) {
        boolean zA = v.a(uVar, androidx.compose.ui.window.b.i(this.f27850f));
        Window window = getWindow();
        AbstractC5504s.e(window);
        window.setFlags(zA ? 8192 : -8193, 8192);
    }

    public final void k() {
        this.f27851g.disposeComposition();
    }

    public final void l(AbstractC2460y abstractC2460y, Function2 function2) {
        this.f27851g.j(abstractC2460y, function2);
    }

    public final void o(InterfaceC5082a interfaceC5082a, k kVar, EnumC5027t enumC5027t) {
        this.f27848d = interfaceC5082a;
        this.f27849e = kVar;
        n(kVar.d());
        m(enumC5027t);
        boolean zA = kVar.a();
        this.f27851g.k(kVar.e(), zA);
        setCanceledOnTouchOutside(kVar.c());
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(zA ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (!this.f27849e.b() || !keyEvent.isTracking() || keyEvent.isCanceled() || i10 != 111) {
            return super.onKeyUp(i10, keyEvent);
        }
        this.f27848d.invoke();
        return true;
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.f27849e.c() || this.f27851g.i(motionEvent)) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 || actionMasked == 1 || actionMasked == 3) {
                this.f27853i = false;
                return zOnTouchEvent;
            }
        } else {
            int actionMasked2 = motionEvent.getActionMasked();
            if (actionMasked2 == 0) {
                this.f27853i = true;
                return true;
            }
            if (actionMasked2 != 1) {
                if (actionMasked2 == 3) {
                    this.f27853i = false;
                    return zOnTouchEvent;
                }
            } else if (this.f27853i) {
                this.f27848d.invoke();
                this.f27853i = false;
                return true;
            }
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
    }
}
