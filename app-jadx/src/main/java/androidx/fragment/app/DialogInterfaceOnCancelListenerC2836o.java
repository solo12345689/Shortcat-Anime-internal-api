package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: renamed from: androidx.fragment.app.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC2836o extends AbstractComponentCallbacksC2838q implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f30047a;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f30056j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Dialog f30058l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f30059m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f30060n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f30061o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Runnable f30048b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DialogInterface.OnCancelListener f30049c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private DialogInterface.OnDismissListener f30050d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f30051e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f30052f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f30053g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f30054h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f30055i = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private androidx.lifecycle.B f30057k = new d();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f30062p = false;

    /* JADX INFO: renamed from: androidx.fragment.app.o$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DialogInterfaceOnCancelListenerC2836o.this.f30050d.onDismiss(DialogInterfaceOnCancelListenerC2836o.this.f30058l);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.o$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC2836o.this.f30058l != null) {
                DialogInterfaceOnCancelListenerC2836o dialogInterfaceOnCancelListenerC2836o = DialogInterfaceOnCancelListenerC2836o.this;
                dialogInterfaceOnCancelListenerC2836o.onCancel(dialogInterfaceOnCancelListenerC2836o.f30058l);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.o$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (DialogInterfaceOnCancelListenerC2836o.this.f30058l != null) {
                DialogInterfaceOnCancelListenerC2836o dialogInterfaceOnCancelListenerC2836o = DialogInterfaceOnCancelListenerC2836o.this;
                dialogInterfaceOnCancelListenerC2836o.onDismiss(dialogInterfaceOnCancelListenerC2836o.f30058l);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.o$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d implements androidx.lifecycle.B {
        d() {
        }

        @Override // androidx.lifecycle.B
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.lifecycle.r rVar) {
            if (rVar == null || !DialogInterfaceOnCancelListenerC2836o.this.f30054h) {
                return;
            }
            View viewRequireView = DialogInterfaceOnCancelListenerC2836o.this.requireView();
            if (viewRequireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (DialogInterfaceOnCancelListenerC2836o.this.f30058l != null) {
                if (K.Q0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + DialogInterfaceOnCancelListenerC2836o.this.f30058l);
                }
                DialogInterfaceOnCancelListenerC2836o.this.f30058l.setContentView(viewRequireView);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.o$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class e extends AbstractC2844x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC2844x f30067a;

        e(AbstractC2844x abstractC2844x) {
            this.f30067a = abstractC2844x;
        }

        @Override // androidx.fragment.app.AbstractC2844x
        public View c(int i10) {
            return this.f30067a.d() ? this.f30067a.c(i10) : DialogInterfaceOnCancelListenerC2836o.this.F(i10);
        }

        @Override // androidx.fragment.app.AbstractC2844x
        public boolean d() {
            return this.f30067a.d() || DialogInterfaceOnCancelListenerC2836o.this.G();
        }
    }

    private void B(boolean z10, boolean z11, boolean z12) {
        if (this.f30060n) {
            return;
        }
        this.f30060n = true;
        this.f30061o = false;
        Dialog dialog = this.f30058l;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f30058l.dismiss();
            if (!z11) {
                if (Looper.myLooper() == this.f30047a.getLooper()) {
                    onDismiss(this.f30058l);
                } else {
                    this.f30047a.post(this.f30048b);
                }
            }
        }
        this.f30059m = true;
        if (this.f30055i >= 0) {
            if (z12) {
                getParentFragmentManager().i1(this.f30055i, 1);
            } else {
                getParentFragmentManager().f1(this.f30055i, 1, z10);
            }
            this.f30055i = -1;
            return;
        }
        U uS = getParentFragmentManager().s();
        uS.v(true);
        uS.n(this);
        if (z12) {
            uS.j();
        } else if (z10) {
            uS.i();
        } else {
            uS.h();
        }
    }

    private void H(Bundle bundle) {
        if (this.f30054h && !this.f30062p) {
            try {
                this.f30056j = true;
                Dialog dialogE = E(bundle);
                this.f30058l = dialogE;
                if (this.f30054h) {
                    L(dialogE, this.f30051e);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.f30058l.setOwnerActivity((Activity) context);
                    }
                    this.f30058l.setCancelable(this.f30053g);
                    this.f30058l.setOnCancelListener(this.f30049c);
                    this.f30058l.setOnDismissListener(this.f30050d);
                    this.f30062p = true;
                } else {
                    this.f30058l = null;
                }
                this.f30056j = false;
            } catch (Throwable th2) {
                this.f30056j = false;
                throw th2;
            }
        }
    }

    public void A() {
        B(true, false, false);
    }

    public Dialog C() {
        return this.f30058l;
    }

    public int D() {
        return this.f30052f;
    }

    public Dialog E(Bundle bundle) {
        if (K.Q0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.r(requireContext(), D());
    }

    View F(int i10) {
        Dialog dialog = this.f30058l;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    boolean G() {
        return this.f30062p;
    }

    public final Dialog I() {
        Dialog dialogC = C();
        if (dialogC != null) {
            return dialogC;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void J(boolean z10) {
        this.f30053g = z10;
        Dialog dialog = this.f30058l;
        if (dialog != null) {
            dialog.setCancelable(z10);
        }
    }

    public void K(boolean z10) {
        this.f30054h = z10;
    }

    public void L(Dialog dialog, int i10) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void M(K k10, String str) {
        this.f30060n = false;
        this.f30061o = true;
        U uS = k10.s();
        uS.v(true);
        uS.e(this, str);
        uS.h();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    AbstractC2844x createFragmentContainer() {
        return new e(super.createFragmentContainer());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onAttach(Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().i(this.f30057k);
        if (this.f30061o) {
            return;
        }
        this.f30060n = false;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f30047a = new Handler();
        this.f30054h = this.mContainerId == 0;
        if (bundle != null) {
            this.f30051e = bundle.getInt("android:style", 0);
            this.f30052f = bundle.getInt("android:theme", 0);
            this.f30053g = bundle.getBoolean("android:cancelable", true);
            this.f30054h = bundle.getBoolean("android:showsDialog", this.f30054h);
            this.f30055i = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f30058l;
        if (dialog != null) {
            this.f30059m = true;
            dialog.setOnDismissListener(null);
            this.f30058l.dismiss();
            if (!this.f30060n) {
                onDismiss(this.f30058l);
            }
            this.f30058l = null;
            this.f30062p = false;
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onDetach() {
        super.onDetach();
        if (!this.f30061o && !this.f30060n) {
            this.f30060n = true;
        }
        getViewLifecycleOwnerLiveData().m(this.f30057k);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f30059m) {
            return;
        }
        if (K.Q0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        B(true, true, false);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.f30054h && !this.f30056j) {
            H(bundle);
            if (K.Q0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f30058l;
            if (dialog != null) {
                return layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext());
            }
        } else if (K.Q0(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (!this.f30054h) {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
                return layoutInflaterOnGetLayoutInflater;
            }
            Log.d("FragmentManager", "mCreatingDialog = true: " + str);
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f30058l;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i10 = this.f30051e;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f30052f;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f30053g;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f30054h;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f30055i;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onStart() {
        super.onStart();
        Dialog dialog = this.f30058l;
        if (dialog != null) {
            this.f30059m = false;
            dialog.show();
            View decorView = this.f30058l.getWindow().getDecorView();
            androidx.lifecycle.Z.b(decorView, this);
            androidx.lifecycle.a0.b(decorView, this);
            P3.m.b(decorView, this);
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onStop() {
        super.onStop();
        Dialog dialog = this.f30058l;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public void onViewStateRestored(Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f30058l == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f30058l.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.f30058l == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f30058l.onRestoreInstanceState(bundle2);
    }

    public void z() {
        B(false, false, false);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
