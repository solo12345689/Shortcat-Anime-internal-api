package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f29855a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f29856b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f29857c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private N f29858d;

    T() {
    }

    void A(N n10) {
        this.f29858d = n10;
    }

    Bundle B(String str, Bundle bundle) {
        return bundle != null ? (Bundle) this.f29857c.put(str, bundle) : (Bundle) this.f29857c.remove(str);
    }

    void a(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        if (this.f29855a.contains(abstractComponentCallbacksC2838q)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC2838q);
        }
        synchronized (this.f29855a) {
            this.f29855a.add(abstractComponentCallbacksC2838q);
        }
        abstractComponentCallbacksC2838q.mAdded = true;
    }

    void b() {
        this.f29856b.values().removeAll(Collections.singleton(null));
    }

    boolean c(String str) {
        return this.f29856b.get(str) != null;
    }

    void d(int i10) {
        for (S s10 : this.f29856b.values()) {
            if (s10 != null) {
                s10.s(i10);
            }
        }
    }

    void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f29856b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (S s10 : this.f29856b.values()) {
                printWriter.print(str);
                if (s10 != null) {
                    AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qK = s10.k();
                    printWriter.println(abstractComponentCallbacksC2838qK);
                    abstractComponentCallbacksC2838qK.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f29855a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = (AbstractComponentCallbacksC2838q) this.f29855a.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC2838q.toString());
            }
        }
    }

    AbstractComponentCallbacksC2838q f(String str) {
        S s10 = (S) this.f29856b.get(str);
        if (s10 != null) {
            return s10.k();
        }
        return null;
    }

    AbstractComponentCallbacksC2838q g(int i10) {
        for (int size = this.f29855a.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = (AbstractComponentCallbacksC2838q) this.f29855a.get(size);
            if (abstractComponentCallbacksC2838q != null && abstractComponentCallbacksC2838q.mFragmentId == i10) {
                return abstractComponentCallbacksC2838q;
            }
        }
        for (S s10 : this.f29856b.values()) {
            if (s10 != null) {
                AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qK = s10.k();
                if (abstractComponentCallbacksC2838qK.mFragmentId == i10) {
                    return abstractComponentCallbacksC2838qK;
                }
            }
        }
        return null;
    }

    AbstractComponentCallbacksC2838q h(String str) {
        if (str != null) {
            for (int size = this.f29855a.size() - 1; size >= 0; size--) {
                AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = (AbstractComponentCallbacksC2838q) this.f29855a.get(size);
                if (abstractComponentCallbacksC2838q != null && str.equals(abstractComponentCallbacksC2838q.mTag)) {
                    return abstractComponentCallbacksC2838q;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (S s10 : this.f29856b.values()) {
            if (s10 != null) {
                AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qK = s10.k();
                if (str.equals(abstractComponentCallbacksC2838qK.mTag)) {
                    return abstractComponentCallbacksC2838qK;
                }
            }
        }
        return null;
    }

    AbstractComponentCallbacksC2838q i(String str) {
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qFindFragmentByWho;
        for (S s10 : this.f29856b.values()) {
            if (s10 != null && (abstractComponentCallbacksC2838qFindFragmentByWho = s10.k().findFragmentByWho(str)) != null) {
                return abstractComponentCallbacksC2838qFindFragmentByWho;
            }
        }
        return null;
    }

    int j(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        View view;
        View view2;
        ViewGroup viewGroup = abstractComponentCallbacksC2838q.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f29855a.indexOf(abstractComponentCallbacksC2838q);
        for (int i10 = iIndexOf - 1; i10 >= 0; i10--) {
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q2 = (AbstractComponentCallbacksC2838q) this.f29855a.get(i10);
            if (abstractComponentCallbacksC2838q2.mContainer == viewGroup && (view2 = abstractComponentCallbacksC2838q2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f29855a.size()) {
                return -1;
            }
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q3 = (AbstractComponentCallbacksC2838q) this.f29855a.get(iIndexOf);
            if (abstractComponentCallbacksC2838q3.mContainer == viewGroup && (view = abstractComponentCallbacksC2838q3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    List k() {
        ArrayList arrayList = new ArrayList();
        for (S s10 : this.f29856b.values()) {
            if (s10 != null) {
                arrayList.add(s10);
            }
        }
        return arrayList;
    }

    List l() {
        ArrayList arrayList = new ArrayList();
        for (S s10 : this.f29856b.values()) {
            if (s10 != null) {
                arrayList.add(s10.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    HashMap m() {
        return this.f29857c;
    }

    S n(String str) {
        return (S) this.f29856b.get(str);
    }

    List o() {
        ArrayList arrayList;
        if (this.f29855a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f29855a) {
            arrayList = new ArrayList(this.f29855a);
        }
        return arrayList;
    }

    N p() {
        return this.f29858d;
    }

    Bundle q(String str) {
        return (Bundle) this.f29857c.get(str);
    }

    void r(S s10) {
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qK = s10.k();
        if (c(abstractComponentCallbacksC2838qK.mWho)) {
            return;
        }
        this.f29856b.put(abstractComponentCallbacksC2838qK.mWho, s10);
        if (abstractComponentCallbacksC2838qK.mRetainInstanceChangedWhileDetached) {
            if (abstractComponentCallbacksC2838qK.mRetainInstance) {
                this.f29858d.a(abstractComponentCallbacksC2838qK);
            } else {
                this.f29858d.k(abstractComponentCallbacksC2838qK);
            }
            abstractComponentCallbacksC2838qK.mRetainInstanceChangedWhileDetached = false;
        }
        if (K.Q0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC2838qK);
        }
    }

    void s(S s10) {
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qK = s10.k();
        if (abstractComponentCallbacksC2838qK.mRetainInstance) {
            this.f29858d.k(abstractComponentCallbacksC2838qK);
        }
        if (this.f29856b.get(abstractComponentCallbacksC2838qK.mWho) == s10 && ((S) this.f29856b.put(abstractComponentCallbacksC2838qK.mWho, null)) != null && K.Q0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC2838qK);
        }
    }

    void t() {
        Iterator it = this.f29855a.iterator();
        while (it.hasNext()) {
            S s10 = (S) this.f29856b.get(((AbstractComponentCallbacksC2838q) it.next()).mWho);
            if (s10 != null) {
                s10.m();
            }
        }
        for (S s11 : this.f29856b.values()) {
            if (s11 != null) {
                s11.m();
                AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qK = s11.k();
                if (abstractComponentCallbacksC2838qK.mRemoving && !abstractComponentCallbacksC2838qK.isInBackStack()) {
                    if (abstractComponentCallbacksC2838qK.mBeingSaved && !this.f29857c.containsKey(abstractComponentCallbacksC2838qK.mWho)) {
                        B(abstractComponentCallbacksC2838qK.mWho, s11.q());
                    }
                    s(s11);
                }
            }
        }
    }

    void u(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        synchronized (this.f29855a) {
            this.f29855a.remove(abstractComponentCallbacksC2838q);
        }
        abstractComponentCallbacksC2838q.mAdded = false;
    }

    void v() {
        this.f29856b.clear();
    }

    void w(List list) {
        this.f29855a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qF = f(str);
                if (abstractComponentCallbacksC2838qF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (K.Q0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + abstractComponentCallbacksC2838qF);
                }
                a(abstractComponentCallbacksC2838qF);
            }
        }
    }

    void x(HashMap map) {
        this.f29857c.clear();
        this.f29857c.putAll(map);
    }

    ArrayList y() {
        ArrayList arrayList = new ArrayList(this.f29856b.size());
        for (S s10 : this.f29856b.values()) {
            if (s10 != null) {
                AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qK = s10.k();
                B(abstractComponentCallbacksC2838qK.mWho, s10.q());
                arrayList.add(abstractComponentCallbacksC2838qK.mWho);
                if (K.Q0(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC2838qK + ": " + abstractComponentCallbacksC2838qK.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    ArrayList z() {
        synchronized (this.f29855a) {
            try {
                if (this.f29855a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f29855a.size());
                for (AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q : this.f29855a) {
                    arrayList.add(abstractComponentCallbacksC2838q.mWho);
                    if (K.Q0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC2838q.mWho + "): " + abstractComponentCallbacksC2838q);
                    }
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
