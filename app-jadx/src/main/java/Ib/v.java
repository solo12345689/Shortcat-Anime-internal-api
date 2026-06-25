package Ib;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import expo.modules.image.ExpoImageViewWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class v {

    /* JADX INFO: renamed from: e */
    public static final a f9010e = new a(null);

    /* JADX INFO: renamed from: f */
    private static Integer f9011f;

    /* JADX INFO: renamed from: a */
    private final WeakReference f9012a;

    /* JADX INFO: renamed from: b */
    private final List f9013b;

    /* JADX INFO: renamed from: c */
    private boolean f9014c;

    /* JADX INFO: renamed from: d */
    private b f9015d;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int b(Context context) {
            if (c() == null) {
                Object systemService = context.getSystemService("window");
                AbstractC5504s.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                Display defaultDisplay = ((WindowManager) o5.k.e((WindowManager) systemService)).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                d(Integer.valueOf(Math.max(point.x, point.y)));
            }
            Integer numC = c();
            AbstractC5504s.e(numC);
            return numC.intValue();
        }

        public final Integer c() {
            return v.f9011f;
        }

        public final void d(Integer num) {
            v.f9011f = num;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a */
        private final WeakReference f9016a;

        public b(v sizeDeterminer) {
            AbstractC5504s.h(sizeDeterminer, "sizeDeterminer");
            this.f9016a = new WeakReference(sizeDeterminer);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            v vVar = (v) this.f9016a.get();
            if (vVar == null) {
                return true;
            }
            vVar.c();
            return true;
        }
    }

    public v(WeakReference imageViewHolder) {
        AbstractC5504s.h(imageViewHolder, "imageViewHolder");
        this.f9012a = imageViewHolder;
        this.f9013b = new ArrayList();
    }

    private final int f(int i10, int i11, int i12) {
        ExpoImageViewWrapper expoImageViewWrapper = (ExpoImageViewWrapper) this.f9012a.get();
        if (expoImageViewWrapper == null) {
            return Integer.MIN_VALUE;
        }
        int i13 = i11 - i12;
        if (i13 > 0) {
            return i13;
        }
        if (this.f9014c && expoImageViewWrapper.isLayoutRequested()) {
            return 0;
        }
        int i14 = i10 - i12;
        if (i14 > 0) {
            return i14;
        }
        if (expoImageViewWrapper.isLayoutRequested() || i11 != -2) {
            return 0;
        }
        a aVar = f9010e;
        Context context = expoImageViewWrapper.getContext();
        AbstractC5504s.g(context, "getContext(...)");
        return aVar.b(context);
    }

    private final int g() {
        ExpoImageViewWrapper expoImageViewWrapper = (ExpoImageViewWrapper) this.f9012a.get();
        if (expoImageViewWrapper == null) {
            return Integer.MIN_VALUE;
        }
        int paddingTop = expoImageViewWrapper.getPaddingTop() + expoImageViewWrapper.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = expoImageViewWrapper.getLayoutParams();
        return f(expoImageViewWrapper.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
    }

    private final int h() {
        ExpoImageViewWrapper expoImageViewWrapper = (ExpoImageViewWrapper) this.f9012a.get();
        if (expoImageViewWrapper == null) {
            return Integer.MIN_VALUE;
        }
        int paddingLeft = expoImageViewWrapper.getPaddingLeft() + expoImageViewWrapper.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = expoImageViewWrapper.getLayoutParams();
        return f(expoImageViewWrapper.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
    }

    private final boolean i(int i10) {
        return i10 > 0 || i10 == Integer.MIN_VALUE;
    }

    private final boolean j(int i10, int i11) {
        return i(i10) && i(i11);
    }

    private final void k(int i10, int i11) {
        Iterator it = new ArrayList(this.f9013b).iterator();
        AbstractC5504s.g(it, "iterator(...)");
        while (it.hasNext()) {
            ((l5.c) it.next()).c(i10, i11);
        }
    }

    public final void c() {
        if (this.f9013b.isEmpty()) {
            return;
        }
        int iH = h();
        int iG = g();
        if (j(iH, iG)) {
            k(iH, iG);
            d();
        }
    }

    public final void d() {
        ExpoImageViewWrapper expoImageViewWrapper = (ExpoImageViewWrapper) this.f9012a.get();
        ViewTreeObserver viewTreeObserver = expoImageViewWrapper != null ? expoImageViewWrapper.getViewTreeObserver() : null;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f9015d);
        }
        this.f9015d = null;
        this.f9013b.clear();
    }

    public final void e(l5.c cb2) {
        AbstractC5504s.h(cb2, "cb");
        ExpoImageViewWrapper expoImageViewWrapper = (ExpoImageViewWrapper) this.f9012a.get();
        if (expoImageViewWrapper == null) {
            return;
        }
        int iH = h();
        int iG = g();
        if (j(iH, iG)) {
            cb2.c(iH, iG);
            return;
        }
        if (!this.f9013b.contains(cb2)) {
            this.f9013b.add(cb2);
        }
        if (this.f9015d == null) {
            ViewTreeObserver viewTreeObserver = expoImageViewWrapper.getViewTreeObserver();
            b bVar = new b(this);
            this.f9015d = bVar;
            viewTreeObserver.addOnPreDrawListener(bVar);
        }
    }

    public final void l(l5.c cb2) {
        AbstractC5504s.h(cb2, "cb");
        this.f9013b.remove(cb2);
    }
}
