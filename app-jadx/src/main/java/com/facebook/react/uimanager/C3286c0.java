package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import be.AbstractC3048a;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC5504s;
import z5.AbstractC7283a;

/* JADX INFO: renamed from: com.facebook.react.uimanager.c0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3286c0 {

    /* JADX INFO: renamed from: a */
    public static final C3286c0 f37555a = new C3286c0();

    /* JADX INFO: renamed from: b */
    private static final float[] f37556b = new float[2];

    /* JADX INFO: renamed from: c */
    private static final PointF f37557c = new PointF();

    /* JADX INFO: renamed from: d */
    private static final float[] f37558d = new float[2];

    /* JADX INFO: renamed from: e */
    private static final Matrix f37559e = new Matrix();

    /* JADX INFO: renamed from: com.facebook.react.uimanager.c0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a extends Enum {

        /* JADX INFO: renamed from: a */
        public static final a f37560a = new a("SELF", 0);

        /* JADX INFO: renamed from: b */
        public static final a f37561b = new a("CHILD", 1);

        /* JADX INFO: renamed from: c */
        private static final /* synthetic */ a[] f37562c;

        /* JADX INFO: renamed from: d */
        private static final /* synthetic */ EnumEntries f37563d;

        static {
            a[] aVarArrA = a();
            f37562c = aVarArrA;
            f37563d = AbstractC3048a.a(aVarArrA);
        }

        private a(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f37560a, f37561b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f37562c.clone();
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.c0$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final int f37564a;

        /* JADX INFO: renamed from: b */
        private final View f37565b;

        public b(int i10, View view) {
            this.f37564a = i10;
            this.f37565b = view;
        }

        public final View a() {
            return this.f37565b;
        }

        public final int b() {
            return this.f37564a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && ((b) obj).b() == this.f37564a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f37564a);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.c0$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37566a;

        static {
            int[] iArr = new int[C.values().length];
            try {
                iArr[C.f37391e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C.f37390d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C.f37388b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C.f37389c.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f37566a = iArr;
        }
    }

    private C3286c0() {
    }

    private final View a(View view) {
        while (view != null && view.getId() <= 0) {
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return view;
    }

    public static final List b(float f10, float f11, ViewGroup viewGroup, float[] viewCoords) {
        int iH;
        AbstractC5504s.h(viewGroup, "viewGroup");
        AbstractC5504s.h(viewCoords, "viewCoords");
        UiThreadUtil.assertOnUiThread();
        viewCoords[0] = f10;
        viewCoords[1] = f11;
        ArrayList arrayList = new ArrayList();
        View viewF = f37555a.f(viewCoords, viewGroup, arrayList);
        if (viewF != null) {
            int i10 = 0;
            while (viewF != null && viewF.getId() <= 0) {
                Object parent = viewF.getParent();
                viewF = parent instanceof View ? (View) parent : null;
                i10++;
            }
            if (i10 > 0 && i10 <= arrayList.size()) {
                arrayList.subList(i10, arrayList.size());
            }
            if (viewF != null && (iH = f37555a.h(viewF, viewCoords[0], viewCoords[1])) != viewF.getId()) {
                arrayList.add(0, new b(iH, null));
            }
        }
        return arrayList;
    }

    public static final int c(float f10, float f11, ViewGroup viewGroup, float[] viewCoords, int[] iArr) {
        View viewA;
        AbstractC5504s.h(viewGroup, "viewGroup");
        AbstractC5504s.h(viewCoords, "viewCoords");
        UiThreadUtil.assertOnUiThread();
        int id2 = viewGroup.getId();
        viewCoords[0] = f10;
        viewCoords[1] = f11;
        C3286c0 c3286c0 = f37555a;
        View viewF = c3286c0.f(viewCoords, viewGroup, null);
        if (viewF == null || (viewA = c3286c0.a(viewF)) == null) {
            return id2;
        }
        if (iArr != null) {
            iArr[0] = viewA.getId();
        }
        return c3286c0.h(viewA, viewCoords[0], viewCoords[1]);
    }

    public static final int d(float f10, float f11, ViewGroup viewGroup) {
        AbstractC5504s.h(viewGroup, "viewGroup");
        return c(f10, f11, viewGroup, f37556b, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View e(float[] fArr, View view, EnumSet enumSet, List list) {
        if (enumSet.contains(a.f37561b) && (view instanceof ViewGroup)) {
            if (!i(fArr[0], fArr[1], view)) {
                if (view instanceof K) {
                    if (C7.a.a(view.getId()) == 2 && !j(fArr[0], fArr[1], view)) {
                        return null;
                    }
                    String overflow = ((J) view).getOverflow();
                    if (AbstractC5504s.c("hidden", overflow) || AbstractC5504s.c("scroll", overflow)) {
                        return null;
                    }
                }
                if (((ViewGroup) view).getClipChildren()) {
                    return null;
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            U u10 = view instanceof U ? (U) view : null;
            for (int i10 = childCount - 1; -1 < i10; i10--) {
                View childAt = viewGroup.getChildAt(u10 != null ? u10.getZIndexMappedChildIndex(i10) : i10);
                PointF pointF = f37557c;
                float f10 = fArr[0];
                float f11 = fArr[1];
                AbstractC5504s.e(childAt);
                g(f10, f11, viewGroup, childAt, pointF);
                float f12 = fArr[0];
                float f13 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                View viewF = f(fArr, childAt, list);
                if (viewF != null) {
                    return viewF;
                }
                fArr[0] = f12;
                fArr[1] = f13;
            }
        }
        if (enumSet.contains(a.f37560a) && i(fArr[0], fArr[1], view)) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View f(float[] fArr, View view, List list) {
        C pointerEvents = view instanceof L ? ((L) view).getPointerEvents() : C.f37391e;
        if (!view.isEnabled()) {
            int i10 = c.f37566a[pointerEvents.ordinal()];
            if (i10 == 1) {
                pointerEvents = C.f37389c;
            } else if (i10 == 2) {
                pointerEvents = C.f37388b;
            }
        }
        int i11 = c.f37566a[pointerEvents.ordinal()];
        if (i11 == 2) {
            EnumSet enumSetOf = EnumSet.of(a.f37560a);
            AbstractC5504s.g(enumSetOf, "of(...)");
            View viewE = e(fArr, view, enumSetOf, list);
            if (viewE != null && list != null) {
                list.add(new b(view.getId(), view));
            }
            return viewE;
        }
        if (i11 != 3) {
            if (i11 != 4) {
                if (pointerEvents != C.f37391e) {
                    AbstractC7283a.I("ReactNative", "Unknown pointer event type: " + pointerEvents);
                }
                if (!(view instanceof I) || !i(fArr[0], fArr[1], view) || !((I) view).interceptsTouchEvent(fArr[0], fArr[1])) {
                    EnumSet enumSetOf2 = EnumSet.of(a.f37560a, a.f37561b);
                    AbstractC5504s.g(enumSetOf2, "of(...)");
                    View viewE2 = e(fArr, view, enumSetOf2, list);
                    if (viewE2 != null && list != null) {
                        list.add(new b(view.getId(), view));
                    }
                    return viewE2;
                }
                if (list != null) {
                    list.add(new b(view.getId(), view));
                    return view;
                }
            } else {
                EnumSet enumSetOf3 = EnumSet.of(a.f37561b);
                AbstractC5504s.g(enumSetOf3, "of(...)");
                View viewE3 = e(fArr, view, enumSetOf3, list);
                if (viewE3 != null) {
                    if (list != null) {
                        list.add(new b(view.getId(), view));
                    }
                    return viewE3;
                }
                if ((view instanceof H) && i(fArr[0], fArr[1], view) && ((H) view).reactTagForTouch(fArr[0], fArr[1]) != view.getId()) {
                    if (list != null) {
                        list.add(new b(view.getId(), view));
                    }
                }
            }
            return view;
        }
        return null;
    }

    private final void g(float f10, float f11, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f10 + viewGroup.getScrollX()) - view.getLeft();
        float scrollY = (f11 + viewGroup.getScrollY()) - view.getTop();
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = f37558d;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = f37559e;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            float f12 = fArr[0];
            scrollY = fArr[1];
            scrollX = f12;
        }
        pointF.set(scrollX, scrollY);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int h(View view, float f10, float f11) {
        return view instanceof H ? ((H) view).reactTagForTouch(f10, f11) : view.getId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean i(float f10, float f11, View view) {
        A7.c cVar = view instanceof A7.c ? (A7.c) view : null;
        Rect hitSlopRect = cVar != null ? cVar.getHitSlopRect() : null;
        return hitSlopRect != null ? f10 >= ((float) (-hitSlopRect.left)) && f10 < ((float) (view.getWidth() + hitSlopRect.right)) && f11 >= ((float) (-hitSlopRect.top)) && f11 < ((float) (view.getHeight() + hitSlopRect.bottom)) : f10 >= 0.0f && f10 < ((float) view.getWidth()) && f11 >= 0.0f && f11 < ((float) view.getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean j(float f10, float f11, View view) {
        if (!(view instanceof K)) {
            return false;
        }
        Rect overflowInset = ((K) view).getOverflowInset();
        return f10 >= ((float) overflowInset.left) && f10 < ((float) (view.getWidth() - overflowInset.right)) && f11 >= ((float) overflowInset.top) && f11 < ((float) (view.getHeight() - overflowInset.bottom));
    }
}
