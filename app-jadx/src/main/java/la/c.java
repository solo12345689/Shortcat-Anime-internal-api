package La;

import Ba.h;
import Ba.i;
import Ea.k;
import Ea.l;
import android.app.Activity;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC2747a0;
import androidx.core.view.AbstractC2775o0;
import androidx.core.view.I;
import androidx.core.view.L0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.C3284b0;
import ie.InterfaceC5082a;
import kotlin.jvm.internal.AbstractC5502p;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends com.facebook.react.views.view.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3284b0 f11357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f11358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f11360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f11361e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f11362f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.facebook.react.views.view.g f11363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f11364h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private k f11365i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final l f11366j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Ha.b f11367k;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    /* synthetic */ class a extends AbstractC5502p implements InterfaceC5082a {
        a(Object obj) {
            super(0, obj, c.class, "getKeyboardCallback", "getKeyboardCallback()Lcom/reactnativekeyboardcontroller/listeners/KeyboardAnimationCallback;", 0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public final k invoke() {
            return ((c) this.receiver).getKeyboardCallback();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C3284b0 reactContext) {
        super(reactContext);
        AbstractC5504s.h(reactContext, "reactContext");
        this.f11357a = reactContext;
        l lVar = new l(L0.p.i(), L0.p.d(), 1, this.f11359c);
        this.f11366j = lVar;
        this.f11367k = new Ha.b(this, reactContext, lVar, new a(this));
        e.f11369a.b(this);
    }

    private final void E() {
        M();
        this.f11367k.c();
    }

    private final void F() {
        J();
        this.f11367k.b();
    }

    private final void G() {
        N();
        F();
    }

    private final void H() {
        N();
        E();
    }

    private final void I() {
        N();
        i.d(this);
    }

    private final void J() {
        k kVar = this.f11365i;
        if (kVar != null) {
            kVar.e();
        }
        final com.facebook.react.views.view.g gVar = this.f11363g;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: La.b
            @Override // java.lang.Runnable
            public final void run() {
                c.K(gVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(com.facebook.react.views.view.g gVar) {
        h.a(gVar);
    }

    private final void M() {
        if (this.f11357a.getCurrentActivity() == null) {
            Fa.a.d(Fa.a.f6597a, d.f11368a, "Can not setup keyboard animation listener, since `currentActivity` is null", null, 4, null);
            return;
        }
        this.f11363g = new com.facebook.react.views.view.g(getContext());
        ViewGroup viewGroupA = Ba.f.a(this.f11357a);
        if (viewGroupA != null) {
            viewGroupA.addView(this.f11363g);
        }
        k kVar = new k(this, this, this.f11357a, this.f11366j);
        this.f11365i = kVar;
        com.facebook.react.views.view.g gVar = this.f11363g;
        if (gVar != null) {
            AbstractC2747a0.C0(gVar, kVar);
            AbstractC2747a0.w0(gVar, this.f11365i);
            i.d(gVar);
        }
    }

    private final void N() {
        View viewB = Ba.f.b(this.f11357a);
        if (viewB != null) {
            AbstractC2747a0.w0(viewB, new I() { // from class: La.a
                @Override // androidx.core.view.I
                public final L0 d(View view, L0 l02) {
                    return c.O(this.f11355a, view, l02);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final L0 O(c cVar, View v10, L0 insets) {
        AbstractC5504s.h(v10, "v");
        AbstractC5504s.h(insets, "insets");
        ViewGroup viewGroupA = Ba.f.a(cVar.f11357a);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        boolean z10 = cVar.f11362f;
        boolean z11 = true;
        boolean z12 = !z10 || cVar.f11358b;
        if (z10 && !cVar.f11359c) {
            z11 = false;
        }
        A1.b bVarF = insets.f(L0.p.g());
        AbstractC5504s.g(bVarF, "getInsets(...)");
        A1.b bVarF2 = insets.f(L0.p.i());
        AbstractC5504s.g(bVarF2, "getInsets(...)");
        layoutParams.setMargins(bVarF.f104a, z12 ? 0 : bVarF2.f105b, bVarF.f106c, z11 ? 0 : bVarF.f107d);
        if (viewGroupA != null) {
            viewGroupA.setLayoutParams(layoutParams);
        }
        return i.c(v10, insets, cVar.f11358b, cVar.f11362f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k getKeyboardCallback() {
        return this.f11365i;
    }

    public final void L() {
        Window window;
        boolean z10 = this.f11362f || this.f11360d;
        if (this.f11361e != z10) {
            this.f11361e = z10;
            Activity currentActivity = this.f11357a.getCurrentActivity();
            if (currentActivity != null) {
                AbstractC2775o0.b(currentActivity.getWindow(), true ^ this.f11361e);
            }
            Activity currentActivity2 = this.f11357a.getCurrentActivity();
            if (currentActivity2 == null || (window = currentActivity2.getWindow()) == null) {
                return;
            }
            window.clearFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        }
    }

    public final boolean getActive() {
        return this.f11362f;
    }

    public final k getCallback$react_native_keyboard_controller_release() {
        return this.f11365i;
    }

    public final C3284b0 getReactContext() {
        return this.f11357a;
    }

    @Override // com.facebook.react.views.view.g, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f11364h) {
            E();
        } else {
            this.f11364h = true;
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        I();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        F();
    }

    public final void setActive(boolean z10) {
        this.f11362f = z10;
        if (z10) {
            H();
        } else {
            G();
        }
    }

    public final void setCallback$react_native_keyboard_controller_release(k kVar) {
        this.f11365i = kVar;
    }

    public final void setNavigationBarTranslucent(boolean z10) {
        this.f11359c = z10;
        this.f11366j.e(z10);
    }

    public final void setPreserveEdgeToEdge(boolean z10) {
        this.f11360d = z10;
    }

    public final void setStatusBarTranslucent(boolean z10) {
        this.f11358b = z10;
    }
}
