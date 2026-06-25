package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC2857k;
import androidx.lifecycle.C2865t;
import androidx.lifecycle.Z;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class r extends Dialog implements androidx.lifecycle.r, K, P3.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C2865t f24240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final P3.h f24241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H f24242c;

    public /* synthetic */ r(Context context, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? 0 : i10);
    }

    private final C2865t b() {
        C2865t c2865t = this.f24240a;
        if (c2865t != null) {
            return c2865t;
        }
        C2865t c2865t2 = new C2865t(this);
        this.f24240a = c2865t2;
        return c2865t2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(r this$0) {
        AbstractC5504s.h(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC5504s.h(view, "view");
        c();
        super.addContentView(view, layoutParams);
    }

    public void c() {
        Window window = getWindow();
        AbstractC5504s.e(window);
        View decorView = window.getDecorView();
        AbstractC5504s.g(decorView, "window!!.decorView");
        Z.b(decorView, this);
        Window window2 = getWindow();
        AbstractC5504s.e(window2);
        View decorView2 = window2.getDecorView();
        AbstractC5504s.g(decorView2, "window!!.decorView");
        O.b(decorView2, this);
        Window window3 = getWindow();
        AbstractC5504s.e(window3);
        View decorView3 = window3.getDecorView();
        AbstractC5504s.g(decorView3, "window!!.decorView");
        P3.m.b(decorView3, this);
    }

    @Override // androidx.lifecycle.r
    public AbstractC2857k getLifecycle() {
        return b();
    }

    @Override // androidx.activity.K
    public final H getOnBackPressedDispatcher() {
        return this.f24242c;
    }

    @Override // P3.i
    public P3.f getSavedStateRegistry() {
        return this.f24241b.b();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.f24242c.l();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            H h10 = this.f24242c;
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC5504s.g(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            h10.o(onBackInvokedDispatcher);
        }
        this.f24241b.d(bundle);
        b().g(AbstractC2857k.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        AbstractC5504s.g(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.f24241b.e(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        b().g(AbstractC2857k.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        b().g(AbstractC2857k.a.ON_DESTROY);
        this.f24240a = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i10) {
        c();
        super.setContentView(i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, int i10) {
        super(context, i10);
        AbstractC5504s.h(context, "context");
        this.f24241b = P3.h.f13461c.b(this);
        this.f24242c = new H(new Runnable() { // from class: androidx.activity.q
            @Override // java.lang.Runnable
            public final void run() {
                r.d(this.f24239a);
            }
        });
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        AbstractC5504s.h(view, "view");
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC5504s.h(view, "view");
        c();
        super.setContentView(view, layoutParams);
    }
}
