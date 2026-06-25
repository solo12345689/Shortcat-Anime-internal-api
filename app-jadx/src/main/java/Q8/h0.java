package Q8;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends Fragment implements InterfaceC2061i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f14493b = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j0 f14494a = new j0();

    public static h0 a(Activity activity) {
        h0 h0Var;
        WeakHashMap weakHashMap = f14493b;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (h0Var = (h0) weakReference.get()) != null) {
            return h0Var;
        }
        try {
            h0 h0Var2 = (h0) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (h0Var2 == null || h0Var2.isRemoving()) {
                h0Var2 = new h0();
                activity.getFragmentManager().beginTransaction().add(h0Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(h0Var2));
            return h0Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
        }
    }

    @Override // Q8.InterfaceC2061i
    public final AbstractC2060h b(String str, Class cls) {
        return this.f14494a.a(str, cls);
    }

    @Override // Q8.InterfaceC2061i
    public final void d(String str, AbstractC2060h abstractC2060h) {
        this.f14494a.b(str, abstractC2060h);
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f14494a.j(str, fileDescriptor, printWriter, strArr);
    }

    @Override // Q8.InterfaceC2061i
    public final Activity f() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f14494a.f(i10, i11, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14494a.c(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f14494a.i();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f14494a.e();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f14494a.g(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f14494a.d();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f14494a.h();
    }
}
