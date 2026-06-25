package androidx.fragment.app;

import P3.f;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.AbstractActivityC2640j;
import androidx.core.app.b;
import androidx.core.view.InterfaceC2787v;
import androidx.lifecycle.AbstractC2857k;
import androidx.lifecycle.C2865t;
import f.InterfaceC4746b;
import g.AbstractC4816f;
import g.InterfaceC4817g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import y1.InterfaceC7196d;

/* JADX INFO: renamed from: androidx.fragment.app.v */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC2842v extends AbstractActivityC2640j implements b.d {

    /* JADX INFO: renamed from: c */
    boolean f30115c;

    /* JADX INFO: renamed from: d */
    boolean f30116d;

    /* JADX INFO: renamed from: a */
    final C2845y f30113a = C2845y.b(new a());

    /* JADX INFO: renamed from: b */
    final C2865t f30114b = new C2865t(this);

    /* JADX INFO: renamed from: e */
    boolean f30117e = true;

    /* JADX INFO: renamed from: androidx.fragment.app.v$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends A implements InterfaceC7196d, y1.e, androidx.core.app.r, androidx.core.app.s, androidx.lifecycle.Y, androidx.activity.K, InterfaceC4817g, P3.i, O, InterfaceC2787v {
        public a() {
            super(AbstractActivityC2842v.this);
        }

        @Override // androidx.fragment.app.O
        public void a(K k10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
            AbstractActivityC2842v.this.H(abstractComponentCallbacksC2838q);
        }

        @Override // androidx.core.view.InterfaceC2787v
        public void addMenuProvider(androidx.core.view.B b10) {
            AbstractActivityC2842v.this.addMenuProvider(b10);
        }

        @Override // y1.InterfaceC7196d
        public void addOnConfigurationChangedListener(K1.a aVar) {
            AbstractActivityC2842v.this.addOnConfigurationChangedListener(aVar);
        }

        @Override // androidx.core.app.r
        public void addOnMultiWindowModeChangedListener(K1.a aVar) {
            AbstractActivityC2842v.this.addOnMultiWindowModeChangedListener(aVar);
        }

        @Override // androidx.core.app.s
        public void addOnPictureInPictureModeChangedListener(K1.a aVar) {
            AbstractActivityC2842v.this.addOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // y1.e
        public void addOnTrimMemoryListener(K1.a aVar) {
            AbstractActivityC2842v.this.addOnTrimMemoryListener(aVar);
        }

        @Override // androidx.fragment.app.AbstractC2844x
        public View c(int i10) {
            return AbstractActivityC2842v.this.findViewById(i10);
        }

        @Override // androidx.fragment.app.AbstractC2844x
        public boolean d() {
            Window window = AbstractActivityC2842v.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // g.InterfaceC4817g
        public AbstractC4816f getActivityResultRegistry() {
            return AbstractActivityC2842v.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.r
        public AbstractC2857k getLifecycle() {
            return AbstractActivityC2842v.this.f30114b;
        }

        @Override // androidx.activity.K
        public androidx.activity.H getOnBackPressedDispatcher() {
            return AbstractActivityC2842v.this.getOnBackPressedDispatcher();
        }

        @Override // P3.i
        public P3.f getSavedStateRegistry() {
            return AbstractActivityC2842v.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.Y
        public androidx.lifecycle.X getViewModelStore() {
            return AbstractActivityC2842v.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.A
        public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            AbstractActivityC2842v.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.A
        public LayoutInflater k() {
            return AbstractActivityC2842v.this.getLayoutInflater().cloneInContext(AbstractActivityC2842v.this);
        }

        @Override // androidx.fragment.app.A
        public boolean m(String str) {
            return androidx.core.app.b.u(AbstractActivityC2842v.this, str);
        }

        @Override // androidx.fragment.app.A
        public void p() {
            q();
        }

        public void q() {
            AbstractActivityC2842v.this.invalidateMenu();
        }

        @Override // androidx.fragment.app.A
        /* JADX INFO: renamed from: r */
        public AbstractActivityC2842v j() {
            return AbstractActivityC2842v.this;
        }

        @Override // androidx.core.view.InterfaceC2787v
        public void removeMenuProvider(androidx.core.view.B b10) {
            AbstractActivityC2842v.this.removeMenuProvider(b10);
        }

        @Override // y1.InterfaceC7196d
        public void removeOnConfigurationChangedListener(K1.a aVar) {
            AbstractActivityC2842v.this.removeOnConfigurationChangedListener(aVar);
        }

        @Override // androidx.core.app.r
        public void removeOnMultiWindowModeChangedListener(K1.a aVar) {
            AbstractActivityC2842v.this.removeOnMultiWindowModeChangedListener(aVar);
        }

        @Override // androidx.core.app.s
        public void removeOnPictureInPictureModeChangedListener(K1.a aVar) {
            AbstractActivityC2842v.this.removeOnPictureInPictureModeChangedListener(aVar);
        }

        @Override // y1.e
        public void removeOnTrimMemoryListener(K1.a aVar) {
            AbstractActivityC2842v.this.removeOnTrimMemoryListener(aVar);
        }
    }

    public AbstractActivityC2842v() {
        E();
    }

    private void E() {
        getSavedStateRegistry().c("android:support:lifecycle", new f.b() { // from class: androidx.fragment.app.r
            @Override // P3.f.b
            public final Bundle a() {
                return AbstractActivityC2842v.z(this.f30109a);
            }
        });
        addOnConfigurationChangedListener(new K1.a() { // from class: androidx.fragment.app.s
            @Override // K1.a
            public final void accept(Object obj) {
                this.f30110a.f30113a.m();
            }
        });
        addOnNewIntentListener(new K1.a() { // from class: androidx.fragment.app.t
            @Override // K1.a
            public final void accept(Object obj) {
                this.f30111a.f30113a.m();
            }
        });
        addOnContextAvailableListener(new InterfaceC4746b() { // from class: androidx.fragment.app.u
            @Override // f.InterfaceC4746b
            public final void a(Context context) {
                this.f30112a.f30113a.a(null);
            }
        });
    }

    private static boolean G(K k10, AbstractC2857k.b bVar) {
        boolean zG = false;
        for (AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q : k10.C0()) {
            if (abstractComponentCallbacksC2838q != null) {
                if (abstractComponentCallbacksC2838q.getHost() != null) {
                    zG |= G(abstractComponentCallbacksC2838q.getChildFragmentManager(), bVar);
                }
                Y y10 = abstractComponentCallbacksC2838q.mViewLifecycleOwner;
                if (y10 != null && y10.getLifecycle().getCurrentState().b(AbstractC2857k.b.f30238d)) {
                    abstractComponentCallbacksC2838q.mViewLifecycleOwner.f(bVar);
                    zG = true;
                }
                if (abstractComponentCallbacksC2838q.mLifecycleRegistry.getCurrentState().b(AbstractC2857k.b.f30238d)) {
                    abstractComponentCallbacksC2838q.mLifecycleRegistry.l(bVar);
                    zG = true;
                }
            }
        }
        return zG;
    }

    public static /* synthetic */ Bundle z(AbstractActivityC2842v abstractActivityC2842v) {
        abstractActivityC2842v.F();
        abstractActivityC2842v.f30114b.g(AbstractC2857k.a.ON_STOP);
        return new Bundle();
    }

    final View B(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f30113a.n(view, str, context, attributeSet);
    }

    public K C() {
        return this.f30113a.l();
    }

    public androidx.loader.app.a D() {
        return androidx.loader.app.a.b(this);
    }

    void F() {
        while (G(C(), AbstractC2857k.b.f30237c)) {
        }
    }

    protected void I() {
        this.f30114b.g(AbstractC2857k.a.ON_RESUME);
        this.f30113a.h();
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f30115c);
            printWriter.print(" mResumed=");
            printWriter.print(this.f30116d);
            printWriter.print(" mStopped=");
            printWriter.print(this.f30117e);
            if (getApplication() != null) {
                androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.f30113a.l().d0(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.activity.AbstractActivityC2640j, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        this.f30113a.m();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.AbstractActivityC2640j, androidx.core.app.i, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30114b.g(AbstractC2857k.a.ON_CREATE);
        this.f30113a.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewB = B(view, str, context, attributeSet);
        return viewB == null ? super.onCreateView(view, str, context, attributeSet) : viewB;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f30113a.f();
        this.f30114b.g(AbstractC2857k.a.ON_DESTROY);
    }

    @Override // androidx.activity.AbstractActivityC2640j, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.f30113a.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f30116d = false;
        this.f30113a.g();
        this.f30114b.g(AbstractC2857k.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        I();
    }

    @Override // androidx.activity.AbstractActivityC2640j, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f30113a.m();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.f30113a.m();
        super.onResume();
        this.f30116d = true;
        this.f30113a.k();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.f30113a.m();
        super.onStart();
        this.f30117e = false;
        if (!this.f30115c) {
            this.f30115c = true;
            this.f30113a.c();
        }
        this.f30113a.k();
        this.f30114b.g(AbstractC2857k.a.ON_START);
        this.f30113a.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f30113a.m();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f30117e = true;
        F();
        this.f30113a.j();
        this.f30114b.g(AbstractC2857k.a.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewB = B(null, str, context, attributeSet);
        return viewB == null ? super.onCreateView(str, context, attributeSet) : viewB;
    }

    public void H(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
    }

    @Override // androidx.core.app.b.d
    public final void d(int i10) {
    }
}
