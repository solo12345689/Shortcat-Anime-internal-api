package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC2747a0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class X {

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f29906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f29907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f29908c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f29909d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f29910e;

        a(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f29906a = i10;
            this.f29907b = arrayList;
            this.f29908c = arrayList2;
            this.f29909d = arrayList3;
            this.f29910e = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = 0; i10 < this.f29906a; i10++) {
                AbstractC2747a0.A0((View) this.f29907b.get(i10), (String) this.f29908c.get(i10));
                AbstractC2747a0.A0((View) this.f29909d.get(i10), (String) this.f29910e.get(i10));
            }
        }
    }

    protected static void f(List list, View view) {
        int size = list.size();
        if (i(list, view, size)) {
            return;
        }
        if (AbstractC2747a0.H(view) != null) {
            list.add(view);
        }
        for (int i10 = size; i10 < list.size(); i10++) {
            View view2 = (View) list.get(i10);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (!i(list, childAt, size) && AbstractC2747a0.H(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean i(List list, View view, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (list.get(i11) == view) {
                return true;
            }
        }
        return false;
    }

    protected static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void A(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object B(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList arrayList);

    public abstract void e(ViewGroup viewGroup, Object obj);

    public abstract boolean g(Object obj);

    public abstract Object h(Object obj);

    public Object j(ViewGroup viewGroup, Object obj) {
        return null;
    }

    protected void k(View view, Rect rect) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract boolean m();

    public abstract boolean n(Object obj);

    public abstract Object o(Object obj, Object obj2, Object obj3);

    public abstract Object p(Object obj, Object obj2, Object obj3);

    ArrayList q(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = (View) arrayList.get(i10);
            arrayList2.add(AbstractC2747a0.H(view));
            AbstractC2747a0.A0(view, null);
        }
        return arrayList2;
    }

    public abstract void r(Object obj, View view, ArrayList arrayList);

    public abstract void s(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    public abstract void w(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, Object obj, G1.d dVar, Runnable runnable);

    public void x(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, Object obj, G1.d dVar, Runnable runnable, Runnable runnable2) {
        runnable2.run();
    }

    void y(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) arrayList.get(i10);
            String strH = AbstractC2747a0.H(view2);
            arrayList4.add(strH);
            if (strH != null) {
                AbstractC2747a0.A0(view2, null);
                String str = (String) map.get(strH);
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i11))) {
                        AbstractC2747a0.A0((View) arrayList2.get(i11), strH);
                        break;
                    }
                    i11++;
                }
            }
        }
        androidx.core.view.L.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void z(Object obj, View view, ArrayList arrayList);

    public void c(Object obj) {
    }

    public void d(Object obj, Runnable runnable) {
    }

    public void t(Object obj, float f10) {
    }
}
