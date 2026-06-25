package androidx.transition;

import G1.d;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractComponentCallbacksC2838q;
import androidx.fragment.app.X;
import androidx.transition.AbstractC2946k;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: androidx.transition.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C2940e extends X {

    /* JADX INFO: renamed from: androidx.transition.e$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends AbstractC2946k.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f32389a;

        a(Rect rect) {
            this.f32389a = rect;
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f32394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f32395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f32396c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f32397d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f32398e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f32399f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f32394a = obj;
            this.f32395b = arrayList;
            this.f32396c = obj2;
            this.f32397d = arrayList2;
            this.f32398e = obj3;
            this.f32399f = arrayList3;
        }

        @Override // androidx.transition.s, androidx.transition.AbstractC2946k.i
        public void e(AbstractC2946k abstractC2946k) {
            Object obj = this.f32394a;
            if (obj != null) {
                C2940e.this.E(obj, this.f32395b, null);
            }
            Object obj2 = this.f32396c;
            if (obj2 != null) {
                C2940e.this.E(obj2, this.f32397d, null);
            }
            Object obj3 = this.f32398e;
            if (obj3 != null) {
                C2940e.this.E(obj3, this.f32399f, null);
            }
        }

        @Override // androidx.transition.s, androidx.transition.AbstractC2946k.i
        public void i(AbstractC2946k abstractC2946k) {
            abstractC2946k.f0(this);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$e, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class C0539e extends AbstractC2946k.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f32403a;

        C0539e(Rect rect) {
            this.f32403a = rect;
        }
    }

    public static /* synthetic */ void C(Runnable runnable, AbstractC2946k abstractC2946k, Runnable runnable2) {
        if (runnable != null) {
            runnable.run();
        } else {
            abstractC2946k.cancel();
            runnable2.run();
        }
    }

    private static boolean D(AbstractC2946k abstractC2946k) {
        return (X.l(abstractC2946k.J()) && X.l(abstractC2946k.K()) && X.l(abstractC2946k.L())) ? false : true;
    }

    @Override // androidx.fragment.app.X
    public void A(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        w wVar = (w) obj;
        if (wVar != null) {
            wVar.M().clear();
            wVar.M().addAll(arrayList2);
            E(wVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.X
    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        w wVar = new w();
        wVar.v0((AbstractC2946k) obj);
        return wVar;
    }

    public void E(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC2946k abstractC2946k = (AbstractC2946k) obj;
        int i10 = 0;
        if (abstractC2946k instanceof w) {
            w wVar = (w) abstractC2946k;
            int iY0 = wVar.y0();
            while (i10 < iY0) {
                E(wVar.x0(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (D(abstractC2946k)) {
            return;
        }
        List listM = abstractC2946k.M();
        if (listM.size() == arrayList.size() && listM.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i10 < size) {
                abstractC2946k.e((View) arrayList2.get(i10));
                i10++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC2946k.g0((View) arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.X
    public void a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC2946k) obj).e(view);
        }
    }

    @Override // androidx.fragment.app.X
    public void b(Object obj, ArrayList arrayList) {
        AbstractC2946k abstractC2946k = (AbstractC2946k) obj;
        if (abstractC2946k == null) {
            return;
        }
        int i10 = 0;
        if (abstractC2946k instanceof w) {
            w wVar = (w) abstractC2946k;
            int iY0 = wVar.y0();
            while (i10 < iY0) {
                b(wVar.x0(i10), arrayList);
                i10++;
            }
            return;
        }
        if (D(abstractC2946k) || !X.l(abstractC2946k.M())) {
            return;
        }
        int size = arrayList.size();
        while (i10 < size) {
            abstractC2946k.e((View) arrayList.get(i10));
            i10++;
        }
    }

    @Override // androidx.fragment.app.X
    public void c(Object obj) {
        ((v) obj).d();
    }

    @Override // androidx.fragment.app.X
    public void d(Object obj, Runnable runnable) {
        ((v) obj).j(runnable);
    }

    @Override // androidx.fragment.app.X
    public void e(ViewGroup viewGroup, Object obj) {
        t.a(viewGroup, (AbstractC2946k) obj);
    }

    @Override // androidx.fragment.app.X
    public boolean g(Object obj) {
        return obj instanceof AbstractC2946k;
    }

    @Override // androidx.fragment.app.X
    public Object h(Object obj) {
        if (obj != null) {
            return ((AbstractC2946k) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.X
    public Object j(ViewGroup viewGroup, Object obj) {
        return t.b(viewGroup, (AbstractC2946k) obj);
    }

    @Override // androidx.fragment.app.X
    public boolean m() {
        return true;
    }

    @Override // androidx.fragment.app.X
    public boolean n(Object obj) {
        boolean zR = ((AbstractC2946k) obj).R();
        if (!zR) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return zR;
    }

    @Override // androidx.fragment.app.X
    public Object o(Object obj, Object obj2, Object obj3) {
        AbstractC2946k abstractC2946kF0 = (AbstractC2946k) obj;
        AbstractC2946k abstractC2946k = (AbstractC2946k) obj2;
        AbstractC2946k abstractC2946k2 = (AbstractC2946k) obj3;
        if (abstractC2946kF0 != null && abstractC2946k != null) {
            abstractC2946kF0 = new w().v0(abstractC2946kF0).v0(abstractC2946k).F0(1);
        } else if (abstractC2946kF0 == null) {
            abstractC2946kF0 = abstractC2946k != null ? abstractC2946k : null;
        }
        if (abstractC2946k2 == null) {
            return abstractC2946kF0;
        }
        w wVar = new w();
        if (abstractC2946kF0 != null) {
            wVar.v0(abstractC2946kF0);
        }
        wVar.v0(abstractC2946k2);
        return wVar;
    }

    @Override // androidx.fragment.app.X
    public Object p(Object obj, Object obj2, Object obj3) {
        w wVar = new w();
        if (obj != null) {
            wVar.v0((AbstractC2946k) obj);
        }
        if (obj2 != null) {
            wVar.v0((AbstractC2946k) obj2);
        }
        if (obj3 != null) {
            wVar.v0((AbstractC2946k) obj3);
        }
        return wVar;
    }

    @Override // androidx.fragment.app.X
    public void r(Object obj, View view, ArrayList arrayList) {
        ((AbstractC2946k) obj).d(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.X
    public void s(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((AbstractC2946k) obj).d(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.X
    public void t(Object obj, float f10) {
        v vVar = (v) obj;
        if (vVar.isReady()) {
            long jC = (long) (f10 * vVar.c());
            if (jC == 0) {
                jC = 1;
            }
            if (jC == vVar.c()) {
                jC = vVar.c() - 1;
            }
            vVar.g(jC);
        }
    }

    @Override // androidx.fragment.app.X
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC2946k) obj).m0(new C0539e(rect));
        }
    }

    @Override // androidx.fragment.app.X
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((AbstractC2946k) obj).m0(new a(rect));
        }
    }

    @Override // androidx.fragment.app.X
    public void w(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, Object obj, G1.d dVar, Runnable runnable) {
        x(abstractComponentCallbacksC2838q, obj, dVar, null, runnable);
    }

    @Override // androidx.fragment.app.X
    public void x(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, Object obj, G1.d dVar, final Runnable runnable, final Runnable runnable2) {
        final AbstractC2946k abstractC2946k = (AbstractC2946k) obj;
        dVar.c(new d.a() { // from class: androidx.transition.d
            @Override // G1.d.a
            public final void onCancel() {
                C2940e.C(runnable, abstractC2946k, runnable2);
            }
        });
        abstractC2946k.d(new d(runnable2));
    }

    @Override // androidx.fragment.app.X
    public void z(Object obj, View view, ArrayList arrayList) {
        w wVar = (w) obj;
        List listM = wVar.M();
        listM.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            X.f(listM, (View) arrayList.get(i10));
        }
        listM.add(view);
        arrayList.add(view);
        b(wVar, arrayList);
    }

    /* JADX INFO: renamed from: androidx.transition.e$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements AbstractC2946k.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f32391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f32392b;

        b(View view, ArrayList arrayList) {
            this.f32391a = view;
            this.f32392b = arrayList;
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void e(AbstractC2946k abstractC2946k) {
            abstractC2946k.f0(this);
            abstractC2946k.d(this);
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void i(AbstractC2946k abstractC2946k) {
            abstractC2946k.f0(this);
            this.f32391a.setVisibility(8);
            int size = this.f32392b.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((View) this.f32392b.get(i10)).setVisibility(0);
            }
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void b(AbstractC2946k abstractC2946k) {
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void f(AbstractC2946k abstractC2946k) {
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void k(AbstractC2946k abstractC2946k) {
        }
    }

    /* JADX INFO: renamed from: androidx.transition.e$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d implements AbstractC2946k.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f32401a;

        d(Runnable runnable) {
            this.f32401a = runnable;
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void i(AbstractC2946k abstractC2946k) {
            this.f32401a.run();
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void b(AbstractC2946k abstractC2946k) {
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void e(AbstractC2946k abstractC2946k) {
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void f(AbstractC2946k abstractC2946k) {
        }

        @Override // androidx.transition.AbstractC2946k.i
        public void k(AbstractC2946k abstractC2946k) {
        }
    }
}
