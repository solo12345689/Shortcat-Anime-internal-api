package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.AbstractC2857k;
import f2.C4755c;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class U {

    /* JADX INFO: renamed from: a */
    private final AbstractC2846z f29859a;

    /* JADX INFO: renamed from: b */
    private final ClassLoader f29860b;

    /* JADX INFO: renamed from: d */
    int f29862d;

    /* JADX INFO: renamed from: e */
    int f29863e;

    /* JADX INFO: renamed from: f */
    int f29864f;

    /* JADX INFO: renamed from: g */
    int f29865g;

    /* JADX INFO: renamed from: h */
    int f29866h;

    /* JADX INFO: renamed from: i */
    boolean f29867i;

    /* JADX INFO: renamed from: k */
    String f29869k;

    /* JADX INFO: renamed from: l */
    int f29870l;

    /* JADX INFO: renamed from: m */
    CharSequence f29871m;

    /* JADX INFO: renamed from: n */
    int f29872n;

    /* JADX INFO: renamed from: o */
    CharSequence f29873o;

    /* JADX INFO: renamed from: p */
    ArrayList f29874p;

    /* JADX INFO: renamed from: q */
    ArrayList f29875q;

    /* JADX INFO: renamed from: s */
    ArrayList f29877s;

    /* JADX INFO: renamed from: c */
    ArrayList f29861c = new ArrayList();

    /* JADX INFO: renamed from: j */
    boolean f29868j = true;

    /* JADX INFO: renamed from: r */
    boolean f29876r = false;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a {

        /* JADX INFO: renamed from: a */
        int f29878a;

        /* JADX INFO: renamed from: b */
        AbstractComponentCallbacksC2838q f29879b;

        /* JADX INFO: renamed from: c */
        boolean f29880c;

        /* JADX INFO: renamed from: d */
        int f29881d;

        /* JADX INFO: renamed from: e */
        int f29882e;

        /* JADX INFO: renamed from: f */
        int f29883f;

        /* JADX INFO: renamed from: g */
        int f29884g;

        /* JADX INFO: renamed from: h */
        AbstractC2857k.b f29885h;

        /* JADX INFO: renamed from: i */
        AbstractC2857k.b f29886i;

        a() {
        }

        a(int i10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
            this.f29878a = i10;
            this.f29879b = abstractComponentCallbacksC2838q;
            this.f29880c = false;
            AbstractC2857k.b bVar = AbstractC2857k.b.f30239e;
            this.f29885h = bVar;
            this.f29886i = bVar;
        }

        a(int i10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, boolean z10) {
            this.f29878a = i10;
            this.f29879b = abstractComponentCallbacksC2838q;
            this.f29880c = z10;
            AbstractC2857k.b bVar = AbstractC2857k.b.f30239e;
            this.f29885h = bVar;
            this.f29886i = bVar;
        }
    }

    U(AbstractC2846z abstractC2846z, ClassLoader classLoader) {
        this.f29859a = abstractC2846z;
        this.f29860b = classLoader;
    }

    public U b(int i10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        m(i10, abstractComponentCallbacksC2838q, null, 1);
        return this;
    }

    public U c(int i10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, String str) {
        m(i10, abstractComponentCallbacksC2838q, str, 1);
        return this;
    }

    public final U d(ViewGroup viewGroup, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, String str) {
        abstractComponentCallbacksC2838q.mContainer = viewGroup;
        abstractComponentCallbacksC2838q.mInDynamicContainer = true;
        return c(viewGroup.getId(), abstractComponentCallbacksC2838q, str);
    }

    public U e(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, String str) {
        m(0, abstractComponentCallbacksC2838q, str, 1);
        return this;
    }

    void f(a aVar) {
        this.f29861c.add(aVar);
        aVar.f29881d = this.f29862d;
        aVar.f29882e = this.f29863e;
        aVar.f29883f = this.f29864f;
        aVar.f29884g = this.f29865g;
    }

    public U g(String str) {
        if (!this.f29868j) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f29867i = true;
        this.f29869k = str;
        return this;
    }

    public abstract int h();

    public abstract int i();

    public abstract void j();

    public abstract void k();

    public U l() {
        if (this.f29867i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f29868j = false;
        return this;
    }

    void m(int i10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, String str, int i11) {
        String str2 = abstractComponentCallbacksC2838q.mPreviousWho;
        if (str2 != null) {
            C4755c.f(abstractComponentCallbacksC2838q, str2);
        }
        Class<?> cls = abstractComponentCallbacksC2838q.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC2838q.mTag;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC2838q + ": was " + abstractComponentCallbacksC2838q.mTag + " now " + str);
            }
            abstractComponentCallbacksC2838q.mTag = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC2838q + " with tag " + str + " to container view with no id");
            }
            int i12 = abstractComponentCallbacksC2838q.mFragmentId;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC2838q + ": was " + abstractComponentCallbacksC2838q.mFragmentId + " now " + i10);
            }
            abstractComponentCallbacksC2838q.mFragmentId = i10;
            abstractComponentCallbacksC2838q.mContainerId = i10;
        }
        f(new a(i11, abstractComponentCallbacksC2838q));
    }

    public U n(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        f(new a(3, abstractComponentCallbacksC2838q));
        return this;
    }

    public U o(int i10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        return p(i10, abstractComponentCallbacksC2838q, null);
    }

    public U p(int i10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, String str) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        m(i10, abstractComponentCallbacksC2838q, str, 2);
        return this;
    }

    public U q(Runnable runnable) {
        return r(false, runnable);
    }

    U r(boolean z10, Runnable runnable) {
        if (!z10) {
            l();
        }
        if (this.f29877s == null) {
            this.f29877s = new ArrayList();
        }
        this.f29877s.add(runnable);
        return this;
    }

    public U s(int i10, int i11) {
        return t(i10, i11, 0, 0);
    }

    public U t(int i10, int i11, int i12, int i13) {
        this.f29862d = i10;
        this.f29863e = i11;
        this.f29864f = i12;
        this.f29865g = i13;
        return this;
    }

    public U u(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        f(new a(8, abstractComponentCallbacksC2838q));
        return this;
    }

    public U v(boolean z10) {
        this.f29876r = z10;
        return this;
    }
}
