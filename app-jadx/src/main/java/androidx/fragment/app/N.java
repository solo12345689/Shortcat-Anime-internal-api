package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.W;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class N extends androidx.lifecycle.U {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final W.c f29824h = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f29828d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f29825a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f29826b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f29827c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f29829e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f29830f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f29831g = false;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements W.c {
        a() {
        }

        @Override // androidx.lifecycle.W.c
        public androidx.lifecycle.U create(Class cls) {
            return new N(true);
        }
    }

    N(boolean z10) {
        this.f29828d = z10;
    }

    private void d(String str, boolean z10) {
        N n10 = (N) this.f29826b.get(str);
        if (n10 != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(n10.f29826b.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    n10.c((String) it.next(), true);
                }
            }
            n10.onCleared();
            this.f29826b.remove(str);
        }
        androidx.lifecycle.X x10 = (androidx.lifecycle.X) this.f29827c.get(str);
        if (x10 != null) {
            x10.a();
            this.f29827c.remove(str);
        }
    }

    static N g(androidx.lifecycle.X x10) {
        return (N) new androidx.lifecycle.W(x10, f29824h).a(N.class);
    }

    void a(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        if (this.f29831g) {
            if (K.Q0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f29825a.containsKey(abstractComponentCallbacksC2838q.mWho)) {
                return;
            }
            this.f29825a.put(abstractComponentCallbacksC2838q.mWho, abstractComponentCallbacksC2838q);
            if (K.Q0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + abstractComponentCallbacksC2838q);
            }
        }
    }

    void b(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, boolean z10) {
        if (K.Q0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC2838q);
        }
        d(abstractComponentCallbacksC2838q.mWho, z10);
    }

    void c(String str, boolean z10) {
        if (K.Q0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        d(str, z10);
    }

    AbstractComponentCallbacksC2838q e(String str) {
        return (AbstractComponentCallbacksC2838q) this.f29825a.get(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && N.class == obj.getClass()) {
            N n10 = (N) obj;
            if (this.f29825a.equals(n10.f29825a) && this.f29826b.equals(n10.f29826b) && this.f29827c.equals(n10.f29827c)) {
                return true;
            }
        }
        return false;
    }

    N f(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        N n10 = (N) this.f29826b.get(abstractComponentCallbacksC2838q.mWho);
        if (n10 != null) {
            return n10;
        }
        N n11 = new N(this.f29828d);
        this.f29826b.put(abstractComponentCallbacksC2838q.mWho, n11);
        return n11;
    }

    Collection h() {
        return new ArrayList(this.f29825a.values());
    }

    public int hashCode() {
        return (((this.f29825a.hashCode() * 31) + this.f29826b.hashCode()) * 31) + this.f29827c.hashCode();
    }

    androidx.lifecycle.X i(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        androidx.lifecycle.X x10 = (androidx.lifecycle.X) this.f29827c.get(abstractComponentCallbacksC2838q.mWho);
        if (x10 != null) {
            return x10;
        }
        androidx.lifecycle.X x11 = new androidx.lifecycle.X();
        this.f29827c.put(abstractComponentCallbacksC2838q.mWho, x11);
        return x11;
    }

    boolean j() {
        return this.f29829e;
    }

    void k(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        if (this.f29831g) {
            if (K.Q0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f29825a.remove(abstractComponentCallbacksC2838q.mWho) == null || !K.Q0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC2838q);
        }
    }

    void l(boolean z10) {
        this.f29831g = z10;
    }

    boolean m(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        if (this.f29825a.containsKey(abstractComponentCallbacksC2838q.mWho)) {
            return this.f29828d ? this.f29829e : !this.f29830f;
        }
        return true;
    }

    @Override // androidx.lifecycle.U
    protected void onCleared() {
        if (K.Q0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f29829e = true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f29825a.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f29826b.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f29827c.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
