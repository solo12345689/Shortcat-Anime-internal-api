package f2;

import Ud.AbstractC2279u;
import Ud.S;
import Ud.a0;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import androidx.fragment.app.K;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: f2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4755c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4755c f46809a = new C4755c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C0750c f46810b = C0750c.f46822d;

    /* JADX INFO: renamed from: f2.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public enum a {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* JADX INFO: renamed from: f2.c$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public interface b {
    }

    /* JADX INFO: renamed from: f2.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0750c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f46821c = new a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0750c f46822d = new C0750c(a0.d(), null, S.i());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f46823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f46824b;

        /* JADX INFO: renamed from: f2.c$c$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public C0750c(Set flags, b bVar, Map allowedViolations) {
            AbstractC5504s.h(flags, "flags");
            AbstractC5504s.h(allowedViolations, "allowedViolations");
            this.f46823a = flags;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : allowedViolations.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f46824b = linkedHashMap;
        }

        public final Set a() {
            return this.f46823a;
        }

        public final b b() {
            return null;
        }

        public final Map c() {
            return this.f46824b;
        }
    }

    private C4755c() {
    }

    private final C0750c b(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        while (abstractComponentCallbacksC2838q != null) {
            if (abstractComponentCallbacksC2838q.isAdded()) {
                K parentFragmentManager = abstractComponentCallbacksC2838q.getParentFragmentManager();
                AbstractC5504s.g(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.J0() != null) {
                    C0750c c0750cJ0 = parentFragmentManager.J0();
                    AbstractC5504s.e(c0750cJ0);
                    return c0750cJ0;
                }
            }
            abstractComponentCallbacksC2838q = abstractComponentCallbacksC2838q.getParentFragment();
        }
        return f46810b;
    }

    private final void c(C0750c c0750c, final AbstractC4765m abstractC4765m) {
        AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838qA = abstractC4765m.a();
        final String name = abstractComponentCallbacksC2838qA.getClass().getName();
        if (c0750c.a().contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, abstractC4765m);
        }
        c0750c.b();
        if (c0750c.a().contains(a.PENALTY_DEATH)) {
            p(abstractComponentCallbacksC2838qA, new Runnable() { // from class: f2.b
                @Override // java.lang.Runnable
                public final void run() {
                    C4755c.d(name, abstractC4765m);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str, AbstractC4765m violation) {
        AbstractC5504s.h(violation, "$violation");
        Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation);
        throw violation;
    }

    private final void e(AbstractC4765m abstractC4765m) {
        if (K.Q0(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + abstractC4765m.a().getClass().getName(), abstractC4765m);
        }
    }

    public static final void f(AbstractComponentCallbacksC2838q fragment, String previousFragmentId) {
        AbstractC5504s.h(fragment, "fragment");
        AbstractC5504s.h(previousFragmentId, "previousFragmentId");
        C4753a c4753a = new C4753a(fragment, previousFragmentId);
        C4755c c4755c = f46809a;
        c4755c.e(c4753a);
        C0750c c0750cB = c4755c.b(fragment);
        if (c0750cB.a().contains(a.DETECT_FRAGMENT_REUSE) && c4755c.q(c0750cB, fragment.getClass(), c4753a.getClass())) {
            c4755c.c(c0750cB, c4753a);
        }
    }

    public static final void g(AbstractComponentCallbacksC2838q fragment, ViewGroup viewGroup) {
        AbstractC5504s.h(fragment, "fragment");
        C4756d c4756d = new C4756d(fragment, viewGroup);
        C4755c c4755c = f46809a;
        c4755c.e(c4756d);
        C0750c c0750cB = c4755c.b(fragment);
        if (c0750cB.a().contains(a.DETECT_FRAGMENT_TAG_USAGE) && c4755c.q(c0750cB, fragment.getClass(), c4756d.getClass())) {
            c4755c.c(c0750cB, c4756d);
        }
    }

    public static final void h(AbstractComponentCallbacksC2838q fragment) {
        AbstractC5504s.h(fragment, "fragment");
        C4757e c4757e = new C4757e(fragment);
        C4755c c4755c = f46809a;
        c4755c.e(c4757e);
        C0750c c0750cB = c4755c.b(fragment);
        if (c0750cB.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && c4755c.q(c0750cB, fragment.getClass(), c4757e.getClass())) {
            c4755c.c(c0750cB, c4757e);
        }
    }

    public static final void i(AbstractComponentCallbacksC2838q fragment) {
        AbstractC5504s.h(fragment, "fragment");
        C4758f c4758f = new C4758f(fragment);
        C4755c c4755c = f46809a;
        c4755c.e(c4758f);
        C0750c c0750cB = c4755c.b(fragment);
        if (c0750cB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && c4755c.q(c0750cB, fragment.getClass(), c4758f.getClass())) {
            c4755c.c(c0750cB, c4758f);
        }
    }

    public static final void j(AbstractComponentCallbacksC2838q fragment) {
        AbstractC5504s.h(fragment, "fragment");
        C4759g c4759g = new C4759g(fragment);
        C4755c c4755c = f46809a;
        c4755c.e(c4759g);
        C0750c c0750cB = c4755c.b(fragment);
        if (c0750cB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && c4755c.q(c0750cB, fragment.getClass(), c4759g.getClass())) {
            c4755c.c(c0750cB, c4759g);
        }
    }

    public static final void k(AbstractComponentCallbacksC2838q fragment) {
        AbstractC5504s.h(fragment, "fragment");
        C4761i c4761i = new C4761i(fragment);
        C4755c c4755c = f46809a;
        c4755c.e(c4761i);
        C0750c c0750cB = c4755c.b(fragment);
        if (c0750cB.a().contains(a.DETECT_RETAIN_INSTANCE_USAGE) && c4755c.q(c0750cB, fragment.getClass(), c4761i.getClass())) {
            c4755c.c(c0750cB, c4761i);
        }
    }

    public static final void l(AbstractComponentCallbacksC2838q violatingFragment, AbstractComponentCallbacksC2838q targetFragment, int i10) {
        AbstractC5504s.h(violatingFragment, "violatingFragment");
        AbstractC5504s.h(targetFragment, "targetFragment");
        C4762j c4762j = new C4762j(violatingFragment, targetFragment, i10);
        C4755c c4755c = f46809a;
        c4755c.e(c4762j);
        C0750c c0750cB = c4755c.b(violatingFragment);
        if (c0750cB.a().contains(a.DETECT_TARGET_FRAGMENT_USAGE) && c4755c.q(c0750cB, violatingFragment.getClass(), c4762j.getClass())) {
            c4755c.c(c0750cB, c4762j);
        }
    }

    public static final void m(AbstractComponentCallbacksC2838q fragment, boolean z10) {
        AbstractC5504s.h(fragment, "fragment");
        C4763k c4763k = new C4763k(fragment, z10);
        C4755c c4755c = f46809a;
        c4755c.e(c4763k);
        C0750c c0750cB = c4755c.b(fragment);
        if (c0750cB.a().contains(a.DETECT_SET_USER_VISIBLE_HINT) && c4755c.q(c0750cB, fragment.getClass(), c4763k.getClass())) {
            c4755c.c(c0750cB, c4763k);
        }
    }

    public static final void n(AbstractComponentCallbacksC2838q fragment, ViewGroup container) {
        AbstractC5504s.h(fragment, "fragment");
        AbstractC5504s.h(container, "container");
        C4766n c4766n = new C4766n(fragment, container);
        C4755c c4755c = f46809a;
        c4755c.e(c4766n);
        C0750c c0750cB = c4755c.b(fragment);
        if (c0750cB.a().contains(a.DETECT_WRONG_FRAGMENT_CONTAINER) && c4755c.q(c0750cB, fragment.getClass(), c4766n.getClass())) {
            c4755c.c(c0750cB, c4766n);
        }
    }

    public static final void o(AbstractComponentCallbacksC2838q fragment, AbstractComponentCallbacksC2838q expectedParentFragment, int i10) {
        AbstractC5504s.h(fragment, "fragment");
        AbstractC5504s.h(expectedParentFragment, "expectedParentFragment");
        C4767o c4767o = new C4767o(fragment, expectedParentFragment, i10);
        C4755c c4755c = f46809a;
        c4755c.e(c4767o);
        C0750c c0750cB = c4755c.b(fragment);
        if (c0750cB.a().contains(a.DETECT_WRONG_NESTED_HIERARCHY) && c4755c.q(c0750cB, fragment.getClass(), c4767o.getClass())) {
            c4755c.c(c0750cB, c4767o);
        }
    }

    private final void p(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, Runnable runnable) {
        if (!abstractComponentCallbacksC2838q.isAdded()) {
            runnable.run();
            return;
        }
        Handler handlerH = abstractComponentCallbacksC2838q.getParentFragmentManager().D0().h();
        if (AbstractC5504s.c(handlerH.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handlerH.post(runnable);
        }
    }

    private final boolean q(C0750c c0750c, Class cls, Class cls2) {
        Set set = (Set) c0750c.c().get(cls.getName());
        if (set == null) {
            return true;
        }
        if (AbstractC5504s.c(cls2.getSuperclass(), AbstractC4765m.class) || !AbstractC2279u.e0(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
