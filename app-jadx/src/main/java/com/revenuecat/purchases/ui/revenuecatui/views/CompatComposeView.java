package com.revenuecat.purchases.ui.revenuecatui.views;

import P3.f;
import P3.h;
import P3.i;
import P3.m;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.AbstractC2680a;
import androidx.lifecycle.AbstractC2857k;
import androidx.lifecycle.C2865t;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC2863q;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import androidx.lifecycle.a0;
import androidx.lifecycle.r;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ContextExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000}\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006*\u00014\b'\u0018\u0000 J2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002JKB'\b\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u000fJ\u000f\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u000fJ\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0019*\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001c\u0010\u000fJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010 \u001a\u00020\rH\u0014¢\u0006\u0004\b \u0010\u000fJ\u0017\u0010\"\u001a\u00020\r2\u0006\u0010!\u001a\u00020\tH\u0014¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\rH\u0014¢\u0006\u0004\b(\u0010\u000fJ\u0017\u0010+\u001a\u00020$2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\rH\u0004¢\u0006\u0004\b-\u0010\u000fR\u0016\u0010.\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00100\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010/R\u0016\u00101\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0018\u00102\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010;\u001a\u00020:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010@\u001a\u00020?8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006L"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/views/CompatComposeView;", "Landroidx/compose/ui/platform/a;", "Landroidx/lifecycle/r;", "LP3/i;", "Landroidx/lifecycle/Y;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "LTd/L;", "onDestroy", "()V", "Landroid/os/Parcelable;", "state", "Landroid/os/Bundle;", "performSave", "(Landroid/os/Parcelable;)Landroid/os/Bundle;", "performRestore", "(Landroid/os/Parcelable;)V", "initViewTreeOwners", "deinitViewTreeOwners", "Landroid/view/View;", "findWindowRoot", "(Landroid/view/View;)Landroid/view/View;", "onBackPressed", "onSaveInstanceState", "()Landroid/os/Parcelable;", "onRestoreInstanceState", "onAttachedToWindow", "visibility", "onWindowVisibilityChanged", "(I)V", "", "hasWindowFocus", "onWindowFocusChanged", "(Z)V", "onDetachedFromWindow", "Landroid/view/KeyEvent;", "event", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "destroy", "isManagingLifecycle", "Z", "isManagingSavedState", "isManagingViewModelStore", "lifecycleOwner", "Landroidx/lifecycle/r;", "com/revenuecat/purchases/ui/revenuecatui/views/CompatComposeView$lifecycleObserver$1", "lifecycleObserver", "Lcom/revenuecat/purchases/ui/revenuecatui/views/CompatComposeView$lifecycleObserver$1;", "LP3/h;", "savedStateRegistryController", "LP3/h;", "LP3/f;", "savedStateRegistry", "LP3/f;", "getSavedStateRegistry", "()LP3/f;", "Landroidx/lifecycle/X;", "viewModelStore", "Landroidx/lifecycle/X;", "getViewModelStore", "()Landroidx/lifecycle/X;", "isManagingViewTree", "()Z", "Landroidx/lifecycle/k;", "getLifecycle", "()Landroidx/lifecycle/k;", "lifecycle", "Companion", "ViewLifecycleOwner", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class CompatComposeView extends AbstractC2680a implements r, i, Y {
    private static final String KEY_SAVED_INSTANCE_STATE = "com.revenuecat.CompatComposeView.saved_instance_state";
    private boolean isManagingLifecycle;
    private boolean isManagingSavedState;
    private boolean isManagingViewModelStore;
    private final CompatComposeView$lifecycleObserver$1 lifecycleObserver;
    private r lifecycleOwner;
    private final f savedStateRegistry;
    private final h savedStateRegistryController;
    private final X viewModelStore;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/views/CompatComposeView$Companion;", "", "()V", "KEY_SAVED_INSTANCE_STATE", "", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\bR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/views/CompatComposeView$ViewLifecycleOwner;", "Landroidx/lifecycle/r;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "LTd/L;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "visibility", "onWindowVisibilityChanged", "(I)V", "", "hasWindowFocus", "onWindowFocusChanged", "(Z)V", "destroy", "Landroid/app/Activity;", "Landroidx/lifecycle/t;", "lifecycleRegistry", "Landroidx/lifecycle/t;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "activityLifecycleCallbacks", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroidx/lifecycle/k;", "getLifecycle", "()Landroidx/lifecycle/k;", "lifecycle", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class ViewLifecycleOwner implements r {
        private final Activity activity;
        private Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
        private final C2865t lifecycleRegistry = new C2865t(this);

        public ViewLifecycleOwner(final Activity activity) {
            this.activity = activity;
            if (activity != null) {
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = new Application.ActivityLifecycleCallbacks() { // from class: com.revenuecat.purchases.ui.revenuecatui.views.CompatComposeView$ViewLifecycleOwner$1$1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityCreated(Activity activity2, Bundle savedInstanceState) {
                        AbstractC5504s.h(activity2, "activity");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityDestroyed(Activity destroyedActivity) {
                        AbstractC5504s.h(destroyedActivity, "destroyedActivity");
                        if (destroyedActivity == activity) {
                            this.destroy();
                        }
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPaused(Activity activity2) {
                        AbstractC5504s.h(activity2, "activity");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityResumed(Activity activity2) {
                        AbstractC5504s.h(activity2, "activity");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivitySaveInstanceState(Activity activity2, Bundle outState) {
                        AbstractC5504s.h(activity2, "activity");
                        AbstractC5504s.h(outState, "outState");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStarted(Activity activity2) {
                        AbstractC5504s.h(activity2, "activity");
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityStopped(Activity activity2) {
                        AbstractC5504s.h(activity2, "activity");
                    }
                };
                Application application = activity.getApplication();
                if (application != null) {
                    application.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
                }
                this.activityLifecycleCallbacks = activityLifecycleCallbacks;
            }
        }

        public final void destroy() {
            Application application;
            if (this.lifecycleRegistry.getCurrentState() == AbstractC2857k.b.f30235a) {
                return;
            }
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.activityLifecycleCallbacks;
            if (activityLifecycleCallbacks != null) {
                Activity activity = this.activity;
                if (activity != null && (application = activity.getApplication()) != null) {
                    application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                }
                this.activityLifecycleCallbacks = null;
            }
            if (this.lifecycleRegistry.getCurrentState().b(AbstractC2857k.b.f30238d)) {
                this.lifecycleRegistry.g(AbstractC2857k.a.ON_STOP);
            }
            this.lifecycleRegistry.g(AbstractC2857k.a.ON_DESTROY);
        }

        @Override // androidx.lifecycle.r
        public AbstractC2857k getLifecycle() {
            return this.lifecycleRegistry;
        }

        public final void onAttachedToWindow() {
            this.lifecycleRegistry.g(AbstractC2857k.a.ON_CREATE);
            this.lifecycleRegistry.g(AbstractC2857k.a.ON_START);
        }

        public final void onDetachedFromWindow() {
            destroy();
        }

        public final void onWindowFocusChanged(boolean hasWindowFocus) {
            if (hasWindowFocus) {
                this.lifecycleRegistry.g(AbstractC2857k.a.ON_RESUME);
            } else {
                this.lifecycleRegistry.g(AbstractC2857k.a.ON_PAUSE);
            }
        }

        public final void onWindowVisibilityChanged(int visibility) {
            if (visibility == 0) {
                this.lifecycleRegistry.g(AbstractC2857k.a.ON_START);
            } else {
                this.lifecycleRegistry.g(AbstractC2857k.a.ON_STOP);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompatComposeView(Context context) {
        this(context, null, 0, 6, null);
        AbstractC5504s.h(context, "context");
    }

    private final void deinitViewTreeOwners() {
        View viewFindWindowRoot;
        if (isManagingViewTree() && (viewFindWindowRoot = findWindowRoot(this)) != null) {
            if (Z.a(viewFindWindowRoot) == this) {
                Z.b(viewFindWindowRoot, null);
            }
            if (m.a(viewFindWindowRoot) == this) {
                m.b(viewFindWindowRoot, null);
            }
            if (a0.a(viewFindWindowRoot) == this) {
                a0.b(viewFindWindowRoot, null);
            }
        }
    }

    private final View findWindowRoot(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = null;
        while (parent != null && (parent instanceof ViewGroup)) {
            viewGroup = (ViewGroup) parent;
            parent = viewGroup.getParent();
        }
        return viewGroup;
    }

    private final void initViewTreeOwners() {
        r viewLifecycleOwner;
        View viewFindWindowRoot = findWindowRoot(this);
        if (viewFindWindowRoot == null) {
            return;
        }
        r rVarA = Z.a(viewFindWindowRoot);
        if (this.lifecycleOwner == null) {
            if (rVarA == null) {
                Context context = getContext();
                AbstractC5504s.g(context, "context");
                viewLifecycleOwner = new ViewLifecycleOwner(ContextExtensionsKt.getActivity(context));
            } else {
                viewLifecycleOwner = rVarA;
            }
            this.lifecycleOwner = viewLifecycleOwner;
            getLifecycle().addObserver(this.lifecycleObserver);
        }
        if (rVarA == null) {
            Z.b(viewFindWindowRoot, this);
            this.isManagingLifecycle = true;
        }
        if (m.a(viewFindWindowRoot) == null) {
            m.b(viewFindWindowRoot, this);
            this.isManagingSavedState = true;
        }
        if (a0.a(viewFindWindowRoot) == null) {
            a0.b(viewFindWindowRoot, this);
            this.isManagingViewModelStore = true;
        }
    }

    private final boolean isManagingViewTree() {
        return this.isManagingLifecycle || this.isManagingSavedState || this.isManagingViewModelStore;
    }

    public final void onDestroy() {
        AbstractC2857k lifecycle;
        if (this.isManagingViewModelStore) {
            getViewModelStore().a();
        }
        r rVar = this.lifecycleOwner;
        if (rVar != null && (lifecycle = rVar.getLifecycle()) != null) {
            lifecycle.removeObserver(this.lifecycleObserver);
        }
        this.lifecycleOwner = null;
    }

    private final void performRestore(Parcelable state) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(KEY_SAVED_INSTANCE_STATE, state);
        this.savedStateRegistryController.d(bundle);
    }

    private final Bundle performSave(Parcelable state) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(KEY_SAVED_INSTANCE_STATE, state);
        this.savedStateRegistryController.e(bundle);
        return bundle;
    }

    protected final void destroy() {
        Logger.INSTANCE.d("CompatComposeView: Destroying lifecycle owner since destroy() was called.");
        r rVar = this.lifecycleOwner;
        ViewLifecycleOwner viewLifecycleOwner = rVar instanceof ViewLifecycleOwner ? (ViewLifecycleOwner) rVar : null;
        if (viewLifecycleOwner != null) {
            viewLifecycleOwner.destroy();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        AbstractC5504s.h(event, "event");
        if (!isManagingViewTree()) {
            return super.dispatchKeyEvent(event);
        }
        if (event.getKeyCode() != 4 || event.getAction() != 1) {
            return super.dispatchKeyEvent(event);
        }
        onBackPressed();
        return true;
    }

    @Override // androidx.lifecycle.r
    public AbstractC2857k getLifecycle() {
        AbstractC2857k lifecycle;
        r rVar = this.lifecycleOwner;
        return (rVar == null || (lifecycle = rVar.getLifecycle()) == null) ? new AbstractC2857k() { // from class: com.revenuecat.purchases.ui.revenuecatui.views.CompatComposeView$lifecycle$1
            @Override // androidx.lifecycle.AbstractC2857k
            public void addObserver(InterfaceC2863q observer) {
                AbstractC5504s.h(observer, "observer");
                Logger.INSTANCE.e("CompatComposeView: Attempted to add a LifecycleObserver when no LifecycleOwner is set.");
            }

            @Override // androidx.lifecycle.AbstractC2857k
            public AbstractC2857k.b getCurrentState() {
                return AbstractC2857k.b.f30236b;
            }

            @Override // androidx.lifecycle.AbstractC2857k
            public void removeObserver(InterfaceC2863q observer) {
                AbstractC5504s.h(observer, "observer");
                Logger.INSTANCE.e("CompatComposeView: Attempted to remove LifecycleObserver when no LifecycleOwner is set.");
            }
        } : lifecycle;
    }

    @Override // P3.i
    public f getSavedStateRegistry() {
        return this.savedStateRegistry;
    }

    @Override // androidx.lifecycle.Y
    public X getViewModelStore() {
        return this.viewModelStore;
    }

    @Override // androidx.compose.ui.platform.AbstractC2680a, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        r rVar = this.lifecycleOwner;
        if (rVar != null && (rVar instanceof ViewLifecycleOwner)) {
            Logger.INSTANCE.w("Attaching a previously-detached view to a window. Resetting state");
            ((ViewLifecycleOwner) rVar).destroy();
            onDestroy();
        }
        initViewTreeOwners();
        if (this.isManagingSavedState) {
            this.savedStateRegistryController.c();
            performRestore(null);
        }
        r rVar2 = this.lifecycleOwner;
        ViewLifecycleOwner viewLifecycleOwner = rVar2 instanceof ViewLifecycleOwner ? (ViewLifecycleOwner) rVar2 : null;
        if (viewLifecycleOwner != null) {
            viewLifecycleOwner.onAttachedToWindow();
        }
        super.onAttachedToWindow();
    }

    public void onBackPressed() {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        r rVar = this.lifecycleOwner;
        ViewLifecycleOwner viewLifecycleOwner = rVar instanceof ViewLifecycleOwner ? (ViewLifecycleOwner) rVar : null;
        if (viewLifecycleOwner != null) {
            viewLifecycleOwner.onDetachedFromWindow();
        }
        deinitViewTreeOwners();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        super.onRestoreInstanceState(state);
        if (this.isManagingSavedState) {
            performRestore(state);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (this.isManagingSavedState) {
            performSave(parcelableOnSaveInstanceState);
        }
        return parcelableOnSaveInstanceState;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);
        if (hasWindowFocus && isManagingViewTree()) {
            setFocusableInTouchMode(true);
            setFocusable(true);
            requestFocus();
        }
        r rVar = this.lifecycleOwner;
        ViewLifecycleOwner viewLifecycleOwner = rVar instanceof ViewLifecycleOwner ? (ViewLifecycleOwner) rVar : null;
        if (viewLifecycleOwner != null) {
            viewLifecycleOwner.onWindowFocusChanged(hasWindowFocus);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
        r rVar = this.lifecycleOwner;
        ViewLifecycleOwner viewLifecycleOwner = rVar instanceof ViewLifecycleOwner ? (ViewLifecycleOwner) rVar : null;
        if (viewLifecycleOwner != null) {
            viewLifecycleOwner.onWindowVisibilityChanged(visibility);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompatComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC5504s.h(context, "context");
    }

    public /* synthetic */ CompatComposeView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.revenuecat.purchases.ui.revenuecatui.views.CompatComposeView$lifecycleObserver$1] */
    public CompatComposeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC5504s.h(context, "context");
        this.lifecycleObserver = new DefaultLifecycleObserver() { // from class: com.revenuecat.purchases.ui.revenuecatui.views.CompatComposeView$lifecycleObserver$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(r owner) {
                AbstractC5504s.h(owner, "owner");
                this.this$0.onDestroy();
            }
        };
        h hVarB = h.f13461c.b(this);
        this.savedStateRegistryController = hVarB;
        this.savedStateRegistry = hVarB.b();
        this.viewModelStore = new X();
    }
}
