package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.AbstractC2747a0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public class c extends m {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static TimeInterpolator f32016s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ArrayList f32017h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f32018i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArrayList f32019j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ArrayList f32020k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    ArrayList f32021l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ArrayList f32022m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ArrayList f32023n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ArrayList f32024o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    ArrayList f32025p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ArrayList f32026q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    ArrayList f32027r = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f32028a;

        a(ArrayList arrayList) {
            this.f32028a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (j jVar : this.f32028a) {
                c.this.S(jVar.f32062a, jVar.f32063b, jVar.f32064c, jVar.f32065d, jVar.f32066e);
            }
            this.f32028a.clear();
            c.this.f32022m.remove(this.f32028a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f32030a;

        b(ArrayList arrayList) {
            this.f32030a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f32030a.iterator();
            while (it.hasNext()) {
                c.this.R((i) it.next());
            }
            this.f32030a.clear();
            c.this.f32023n.remove(this.f32030a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class RunnableC0529c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ArrayList f32032a;

        RunnableC0529c(ArrayList arrayList) {
            this.f32032a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f32032a.iterator();
            while (it.hasNext()) {
                c.this.Q((RecyclerView.E) it.next());
            }
            this.f32032a.clear();
            c.this.f32021l.remove(this.f32032a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.E f32034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f32035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f32036c;

        d(RecyclerView.E e10, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f32034a = e10;
            this.f32035b = viewPropertyAnimator;
            this.f32036c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f32035b.setListener(null);
            this.f32036c.setAlpha(1.0f);
            c.this.G(this.f32034a);
            c.this.f32026q.remove(this.f32034a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.H(this.f32034a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.E f32038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f32039b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f32040c;

        e(RecyclerView.E e10, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f32038a = e10;
            this.f32039b = view;
            this.f32040c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f32039b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f32040c.setListener(null);
            c.this.A(this.f32038a);
            c.this.f32024o.remove(this.f32038a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.B(this.f32038a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.E f32042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f32043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f32044c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f32045d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f32046e;

        f(RecyclerView.E e10, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f32042a = e10;
            this.f32043b = i10;
            this.f32044c = view;
            this.f32045d = i11;
            this.f32046e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f32043b != 0) {
                this.f32044c.setTranslationX(0.0f);
            }
            if (this.f32045d != 0) {
                this.f32044c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f32046e.setListener(null);
            c.this.E(this.f32042a);
            c.this.f32025p.remove(this.f32042a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.F(this.f32042a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f32048a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f32049b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f32050c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f32048a = iVar;
            this.f32049b = viewPropertyAnimator;
            this.f32050c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f32049b.setListener(null);
            this.f32050c.setAlpha(1.0f);
            this.f32050c.setTranslationX(0.0f);
            this.f32050c.setTranslationY(0.0f);
            c.this.C(this.f32048a.f32056a, true);
            c.this.f32027r.remove(this.f32048a.f32056a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f32048a.f32056a, true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f32052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f32053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f32054c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f32052a = iVar;
            this.f32053b = viewPropertyAnimator;
            this.f32054c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f32053b.setListener(null);
            this.f32054c.setAlpha(1.0f);
            this.f32054c.setTranslationX(0.0f);
            this.f32054c.setTranslationY(0.0f);
            c.this.C(this.f32052a.f32057b, false);
            c.this.f32027r.remove(this.f32052a.f32057b);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f32052a.f32057b, false);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.E f32062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f32063b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f32064c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f32065d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f32066e;

        j(RecyclerView.E e10, int i10, int i11, int i12, int i13) {
            this.f32062a = e10;
            this.f32063b = i10;
            this.f32064c = i11;
            this.f32065d = i12;
            this.f32066e = i13;
        }
    }

    private void T(RecyclerView.E e10) {
        View view = e10.f31840a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f32026q.add(e10);
        viewPropertyAnimatorAnimate.setDuration(o()).alpha(0.0f).setListener(new d(e10, viewPropertyAnimatorAnimate, view)).start();
    }

    private void W(List list, RecyclerView.E e10) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = (i) list.get(size);
            if (Y(iVar, e10) && iVar.f32056a == null && iVar.f32057b == null) {
                list.remove(iVar);
            }
        }
    }

    private void X(i iVar) {
        RecyclerView.E e10 = iVar.f32056a;
        if (e10 != null) {
            Y(iVar, e10);
        }
        RecyclerView.E e11 = iVar.f32057b;
        if (e11 != null) {
            Y(iVar, e11);
        }
    }

    private boolean Y(i iVar, RecyclerView.E e10) {
        boolean z10 = false;
        if (iVar.f32057b == e10) {
            iVar.f32057b = null;
        } else {
            if (iVar.f32056a != e10) {
                return false;
            }
            iVar.f32056a = null;
            z10 = true;
        }
        e10.f31840a.setAlpha(1.0f);
        e10.f31840a.setTranslationX(0.0f);
        e10.f31840a.setTranslationY(0.0f);
        C(e10, z10);
        return true;
    }

    private void Z(RecyclerView.E e10) {
        if (f32016s == null) {
            f32016s = new ValueAnimator().getInterpolator();
        }
        e10.f31840a.animate().setInterpolator(f32016s);
        j(e10);
    }

    void Q(RecyclerView.E e10) {
        View view = e10.f31840a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f32024o.add(e10);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(l()).setListener(new e(e10, view, viewPropertyAnimatorAnimate)).start();
    }

    void R(i iVar) {
        RecyclerView.E e10 = iVar.f32056a;
        View view = e10 == null ? null : e10.f31840a;
        RecyclerView.E e11 = iVar.f32057b;
        View view2 = e11 != null ? e11.f31840a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f32027r.add(iVar.f32056a);
            duration.translationX(iVar.f32060e - iVar.f32058c);
            duration.translationY(iVar.f32061f - iVar.f32059d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f32027r.add(iVar.f32057b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    void S(RecyclerView.E e10, int i10, int i11, int i12, int i13) {
        View view = e10.f31840a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f32025p.add(e10);
        viewPropertyAnimatorAnimate.setDuration(n()).setListener(new f(e10, i14, view, i15, viewPropertyAnimatorAnimate)).start();
    }

    void U(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.E) list.get(size)).f31840a.animate().cancel();
        }
    }

    void V() {
        if (p()) {
            return;
        }
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean g(RecyclerView.E e10, List list) {
        return !list.isEmpty() || super.g(e10, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void j(RecyclerView.E e10) {
        View view = e10.f31840a;
        view.animate().cancel();
        int size = this.f32019j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) this.f32019j.get(size)).f32062a == e10) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(e10);
                this.f32019j.remove(size);
            }
        }
        W(this.f32020k, e10);
        if (this.f32017h.remove(e10)) {
            view.setAlpha(1.0f);
            G(e10);
        }
        if (this.f32018i.remove(e10)) {
            view.setAlpha(1.0f);
            A(e10);
        }
        for (int size2 = this.f32023n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f32023n.get(size2);
            W(arrayList, e10);
            if (arrayList.isEmpty()) {
                this.f32023n.remove(size2);
            }
        }
        for (int size3 = this.f32022m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f32022m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((j) arrayList2.get(size4)).f32062a == e10) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(e10);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f32022m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f32021l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f32021l.get(size5);
            if (arrayList3.remove(e10)) {
                view.setAlpha(1.0f);
                A(e10);
                if (arrayList3.isEmpty()) {
                    this.f32021l.remove(size5);
                }
            }
        }
        this.f32026q.remove(e10);
        this.f32024o.remove(e10);
        this.f32027r.remove(e10);
        this.f32025p.remove(e10);
        V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void k() {
        int size = this.f32019j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.f32019j.get(size);
            View view = jVar.f32062a.f31840a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f32062a);
            this.f32019j.remove(size);
        }
        for (int size2 = this.f32017h.size() - 1; size2 >= 0; size2--) {
            G((RecyclerView.E) this.f32017h.get(size2));
            this.f32017h.remove(size2);
        }
        int size3 = this.f32018i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.E e10 = (RecyclerView.E) this.f32018i.get(size3);
            e10.f31840a.setAlpha(1.0f);
            A(e10);
            this.f32018i.remove(size3);
        }
        for (int size4 = this.f32020k.size() - 1; size4 >= 0; size4--) {
            X((i) this.f32020k.get(size4));
        }
        this.f32020k.clear();
        if (p()) {
            for (int size5 = this.f32022m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f32022m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f32062a.f31840a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f32062a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f32022m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f32021l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f32021l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.E e11 = (RecyclerView.E) arrayList2.get(size8);
                    e11.f31840a.setAlpha(1.0f);
                    A(e11);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f32021l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f32023n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f32023n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f32023n.remove(arrayList3);
                    }
                }
            }
            U(this.f32026q);
            U(this.f32025p);
            U(this.f32024o);
            U(this.f32027r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean p() {
        return (this.f32018i.isEmpty() && this.f32020k.isEmpty() && this.f32019j.isEmpty() && this.f32017h.isEmpty() && this.f32025p.isEmpty() && this.f32026q.isEmpty() && this.f32024o.isEmpty() && this.f32027r.isEmpty() && this.f32022m.isEmpty() && this.f32021l.isEmpty() && this.f32023n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void u() {
        boolean zIsEmpty = this.f32017h.isEmpty();
        boolean zIsEmpty2 = this.f32019j.isEmpty();
        boolean zIsEmpty3 = this.f32020k.isEmpty();
        boolean zIsEmpty4 = this.f32018i.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator it = this.f32017h.iterator();
        while (it.hasNext()) {
            T((RecyclerView.E) it.next());
        }
        this.f32017h.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f32019j);
            this.f32022m.add(arrayList);
            this.f32019j.clear();
            a aVar = new a(arrayList);
            if (zIsEmpty) {
                aVar.run();
            } else {
                AbstractC2747a0.d0(((j) arrayList.get(0)).f32062a.f31840a, aVar, o());
            }
        }
        if (!zIsEmpty3) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f32020k);
            this.f32023n.add(arrayList2);
            this.f32020k.clear();
            b bVar = new b(arrayList2);
            if (zIsEmpty) {
                bVar.run();
            } else {
                AbstractC2747a0.d0(((i) arrayList2.get(0)).f32056a.f31840a, bVar, o());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(this.f32018i);
        this.f32021l.add(arrayList3);
        this.f32018i.clear();
        RunnableC0529c runnableC0529c = new RunnableC0529c(arrayList3);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            runnableC0529c.run();
        } else {
            AbstractC2747a0.d0(((RecyclerView.E) arrayList3.get(0)).f31840a, runnableC0529c, (!zIsEmpty ? o() : 0L) + Math.max(!zIsEmpty2 ? n() : 0L, zIsEmpty3 ? 0L : m()));
        }
    }

    @Override // androidx.recyclerview.widget.m
    public boolean w(RecyclerView.E e10) {
        Z(e10);
        e10.f31840a.setAlpha(0.0f);
        this.f32018i.add(e10);
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean x(RecyclerView.E e10, RecyclerView.E e11, int i10, int i11, int i12, int i13) {
        if (e10 == e11) {
            return y(e10, i10, i11, i12, i13);
        }
        float translationX = e10.f31840a.getTranslationX();
        float translationY = e10.f31840a.getTranslationY();
        float alpha = e10.f31840a.getAlpha();
        Z(e10);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        e10.f31840a.setTranslationX(translationX);
        e10.f31840a.setTranslationY(translationY);
        e10.f31840a.setAlpha(alpha);
        if (e11 != null) {
            Z(e11);
            e11.f31840a.setTranslationX(-i14);
            e11.f31840a.setTranslationY(-i15);
            e11.f31840a.setAlpha(0.0f);
        }
        this.f32020k.add(new i(e10, e11, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean y(RecyclerView.E e10, int i10, int i11, int i12, int i13) {
        View view = e10.f31840a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) e10.f31840a.getTranslationY());
        Z(e10);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            E(e10);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f32019j.add(new j(e10, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean z(RecyclerView.E e10) {
        Z(e10);
        this.f32017h.add(e10);
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.E f32056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.E f32057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f32058c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f32059d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f32060e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f32061f;

        private i(RecyclerView.E e10, RecyclerView.E e11) {
            this.f32056a = e10;
            this.f32057b = e11;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f32056a + ", newHolder=" + this.f32057b + ", fromX=" + this.f32058c + ", fromY=" + this.f32059d + ", toX=" + this.f32060e + ", toY=" + this.f32061f + '}';
        }

        i(RecyclerView.E e10, RecyclerView.E e11, int i10, int i11, int i12, int i13) {
            this(e10, e11);
            this.f32058c = i10;
            this.f32059d = i11;
            this.f32060e = i12;
            this.f32061f = i13;
        }
    }
}
