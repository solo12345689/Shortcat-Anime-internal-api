package androidx.transition;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import t.C6551a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AbstractC2946k f32476a = new C2936a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ThreadLocal f32477b = new ThreadLocal();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static ArrayList f32478c = new ArrayList();

    public static void a(ViewGroup viewGroup, AbstractC2946k abstractC2946k) {
        if (f32478c.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        f32478c.add(viewGroup);
        if (abstractC2946k == null) {
            abstractC2946k = f32476a;
        }
        AbstractC2946k abstractC2946kClone = abstractC2946k.clone();
        e(viewGroup, abstractC2946kClone);
        AbstractC2945j.b(viewGroup, null);
        d(viewGroup, abstractC2946kClone);
    }

    public static v b(ViewGroup viewGroup, AbstractC2946k abstractC2946k) {
        if (f32478c.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!abstractC2946k.R()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        f32478c.add(viewGroup);
        AbstractC2946k abstractC2946kClone = abstractC2946k.clone();
        w wVar = new w();
        wVar.v0(abstractC2946kClone);
        e(viewGroup, wVar);
        AbstractC2945j.b(viewGroup, null);
        d(viewGroup, wVar);
        viewGroup.invalidate();
        return wVar.t();
    }

    static C6551a c() {
        C6551a c6551a;
        WeakReference weakReference = (WeakReference) f32477b.get();
        if (weakReference != null && (c6551a = (C6551a) weakReference.get()) != null) {
            return c6551a;
        }
        C6551a c6551a2 = new C6551a();
        f32477b.set(new WeakReference(c6551a2));
        return c6551a2;
    }

    private static void d(ViewGroup viewGroup, AbstractC2946k abstractC2946k) {
        if (abstractC2946k == null || viewGroup == null) {
            return;
        }
        a aVar = new a(abstractC2946k, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void e(ViewGroup viewGroup, AbstractC2946k abstractC2946k) {
        ArrayList arrayList = (ArrayList) c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC2946k) it.next()).c0(viewGroup);
            }
        }
        if (abstractC2946k != null) {
            abstractC2946k.n(viewGroup, true);
        }
        AbstractC2945j.a(viewGroup);
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        AbstractC2946k f32479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ViewGroup f32480b;

        /* JADX INFO: renamed from: androidx.transition.t$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class C0540a extends s {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ C6551a f32481a;

            C0540a(C6551a c6551a) {
                this.f32481a = c6551a;
            }

            @Override // androidx.transition.s, androidx.transition.AbstractC2946k.i
            public void i(AbstractC2946k abstractC2946k) {
                ((ArrayList) this.f32481a.get(a.this.f32480b)).remove(abstractC2946k);
                abstractC2946k.f0(this);
            }
        }

        a(AbstractC2946k abstractC2946k, ViewGroup viewGroup) {
            this.f32479a = abstractC2946k;
            this.f32480b = viewGroup;
        }

        private void a() {
            this.f32480b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f32480b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!t.f32478c.remove(this.f32480b)) {
                return true;
            }
            C6551a c6551aC = t.c();
            ArrayList arrayList = (ArrayList) c6551aC.get(this.f32480b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                c6551aC.put(this.f32480b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f32479a);
            this.f32479a.d(new C0540a(c6551aC));
            this.f32479a.n(this.f32480b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((AbstractC2946k) it.next()).h0(this.f32480b);
                }
            }
            this.f32479a.d0(this.f32480b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            t.f32478c.remove(this.f32480b);
            ArrayList arrayList = (ArrayList) t.c().get(this.f32480b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC2946k) it.next()).h0(this.f32480b);
                }
            }
            this.f32479a.p(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
