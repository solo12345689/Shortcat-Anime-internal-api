package Q8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC2842v;
import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends AbstractComponentCallbacksC2838q implements InterfaceC2061i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f14501b = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j0 f14502a = new j0();

    public static k0 w(AbstractActivityC2842v abstractActivityC2842v) {
        k0 k0Var;
        androidx.fragment.app.K kC = abstractActivityC2842v.C();
        WeakHashMap weakHashMap = f14501b;
        WeakReference weakReference = (WeakReference) weakHashMap.get(abstractActivityC2842v);
        if (weakReference != null && (k0Var = (k0) weakReference.get()) != null) {
            return k0Var;
        }
        try {
            k0 k0Var2 = (k0) kC.q0("SLifecycleFragmentImpl");
            if (k0Var2 == null || k0Var2.isRemoving()) {
                k0Var2 = new k0();
                kC.s().e(k0Var2, "SLifecycleFragmentImpl").i();
            }
            weakHashMap.put(abstractActivityC2842v, new WeakReference(k0Var2));
            return k0Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    @Override // Q8.InterfaceC2061i
    public final AbstractC2060h b(String str, Class cls) {
        return this.f14502a.a(str, cls);
    }

    @Override // Q8.InterfaceC2061i
    public final void d(String str, AbstractC2060h abstractC2060h) {
        this.f14502a.b(str, abstractC2060h);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f14502a.j(str, fileDescriptor, printWriter, strArr);
    }

    @Override // Q8.InterfaceC2061i
    public final Activity f() {
        return getActivity();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f14502a.f(i10, i11, intent);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14502a.c(bundle);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public final void onDestroy() {
        super.onDestroy();
        this.f14502a.i();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public final void onResume() {
        super.onResume();
        this.f14502a.e();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f14502a.g(bundle);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public final void onStart() {
        super.onStart();
        this.f14502a.d();
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC2838q
    public final void onStop() {
        super.onStop();
        this.f14502a.h();
    }
}
