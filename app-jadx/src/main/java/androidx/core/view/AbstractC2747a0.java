package androidx.core.view;

import L1.B;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C2746a;
import androidx.core.view.C2777p0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import x1.AbstractC7046c;

/* JADX INFO: renamed from: androidx.core.view.a0 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2747a0 {

    /* JADX INFO: renamed from: a */
    private static WeakHashMap f29005a = null;

    /* JADX INFO: renamed from: b */
    private static Field f29006b = null;

    /* JADX INFO: renamed from: c */
    private static boolean f29007c = false;

    /* JADX INFO: renamed from: d */
    private static final int[] f29008d = {AbstractC7046c.f63628b, AbstractC7046c.f63629c, AbstractC7046c.f63640n, AbstractC7046c.f63651y, AbstractC7046c.f63608B, AbstractC7046c.f63609C, AbstractC7046c.f63610D, AbstractC7046c.f63611E, AbstractC7046c.f63612F, AbstractC7046c.f63613G, AbstractC7046c.f63630d, AbstractC7046c.f63631e, AbstractC7046c.f63632f, AbstractC7046c.f63633g, AbstractC7046c.f63634h, AbstractC7046c.f63635i, AbstractC7046c.f63636j, AbstractC7046c.f63637k, AbstractC7046c.f63638l, AbstractC7046c.f63639m, AbstractC7046c.f63641o, AbstractC7046c.f63642p, AbstractC7046c.f63643q, AbstractC7046c.f63644r, AbstractC7046c.f63645s, AbstractC7046c.f63646t, AbstractC7046c.f63647u, AbstractC7046c.f63648v, AbstractC7046c.f63649w, AbstractC7046c.f63650x, AbstractC7046c.f63652z, AbstractC7046c.f63607A};

    /* JADX INFO: renamed from: e */
    private static final K f29009e = new K() { // from class: androidx.core.view.Z
        @Override // androidx.core.view.K
        public final C2752d a(C2752d c2752d) {
            return AbstractC2747a0.a(c2752d);
        }
    };

    /* JADX INFO: renamed from: f */
    private static final e f29010f = new e();

    /* JADX INFO: renamed from: androidx.core.view.a0$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends f {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        @Override // androidx.core.view.AbstractC2747a0.f
        /* JADX INFO: renamed from: h */
        public Boolean c(View view) {
            return Boolean.valueOf(k.c(view));
        }

        @Override // androidx.core.view.AbstractC2747a0.f
        /* JADX INFO: renamed from: i */
        public void d(View view, Boolean bool) {
            k.f(view, bool.booleanValue());
        }

        @Override // androidx.core.view.AbstractC2747a0.f
        /* JADX INFO: renamed from: j */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.a0$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends f {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        @Override // androidx.core.view.AbstractC2747a0.f
        /* JADX INFO: renamed from: h */
        public CharSequence c(View view) {
            return k.a(view);
        }

        @Override // androidx.core.view.AbstractC2747a0.f
        /* JADX INFO: renamed from: i */
        public void d(View view, CharSequence charSequence) {
            k.e(view, charSequence);
        }

        @Override // androidx.core.view.AbstractC2747a0.f
        /* JADX INFO: renamed from: j */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.a0$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c extends f {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        @Override // androidx.core.view.AbstractC2747a0.f
        /* JADX INFO: renamed from: h */
        public CharSequence c(View view) {
            return m.b(view);
        }

        @Override // androidx.core.view.AbstractC2747a0.f
        /* JADX INFO: renamed from: i */
        public void d(View view, CharSequence charSequence) {
            m.d(view, charSequence);
        }

        @Override // androidx.core.view.AbstractC2747a0.f
        /* JADX INFO: renamed from: j */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.a0$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class d extends f {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        @Override // androidx.core.view.AbstractC2747a0.f
        /* JADX INFO: renamed from: h */
        public Boolean c(View view) {
            return Boolean.valueOf(k.b(view));
        }

        @Override // androidx.core.view.AbstractC2747a0.f
        /* JADX INFO: renamed from: i */
        public void d(View view, Boolean bool) {
            k.d(view, bool.booleanValue());
        }

        @Override // androidx.core.view.AbstractC2747a0.f
        /* JADX INFO: renamed from: j */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.a0$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static abstract class f {

        /* JADX INFO: renamed from: a */
        private final int f29012a;

        /* JADX INFO: renamed from: b */
        private final Class f29013b;

        /* JADX INFO: renamed from: c */
        private final int f29014c;

        /* JADX INFO: renamed from: d */
        private final int f29015d;

        f(int i10, Class cls, int i11) {
            this(i10, cls, 0, i11);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f29014c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract Object c(View view);

        abstract void d(View view, Object obj);

        Object e(View view) {
            if (b()) {
                return c(view);
            }
            Object tag = view.getTag(this.f29012a);
            if (this.f29013b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        void f(View view, Object obj) {
            if (b()) {
                d(view, obj);
            } else if (g(e(view), obj)) {
                AbstractC2747a0.j(view);
                view.setTag(this.f29012a, obj);
                AbstractC2747a0.T(view, this.f29015d);
            }
        }

        abstract boolean g(Object obj, Object obj2);

        f(int i10, Class cls, int i11, int i12) {
            this.f29012a = i10;
            this.f29013b = cls;
            this.f29015d = i11;
            this.f29014c = i12;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.a0$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class g {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return AbstractC2757f0.f29046b ? AbstractC2757f0.b(view, windowInsets) : view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.a0$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class h {

        /* JADX INFO: renamed from: androidx.core.view.a0$h$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a */
            L0 f29016a = null;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ View f29017b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ I f29018c;

            a(View view, I i10) {
                this.f29017b = view;
                this.f29018c = i10;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                L0 l0A = L0.A(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    h.a(windowInsets, this.f29017b);
                    if (l0A.equals(this.f29016a)) {
                        return this.f29018c.d(view, l0A).y();
                    }
                }
                this.f29016a = l0A;
                L0 l0D = this.f29018c.d(view, l0A);
                if (i10 >= 30) {
                    return l0D.y();
                }
                AbstractC2747a0.h0(view);
                return l0D.y();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(AbstractC7046c.f63626T);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static L0 b(View view, L0 l02, Rect rect) {
            WindowInsets windowInsetsY = l02.y();
            if (windowInsetsY != null) {
                return L0.A(view.computeSystemWindowInsets(windowInsetsY, rect), view);
            }
            rect.setEmpty();
            return l02;
        }

        static ColorStateList c(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode d(View view) {
            return view.getBackgroundTintMode();
        }

        static float e(View view) {
            return view.getElevation();
        }

        static String f(View view) {
            return view.getTransitionName();
        }

        static float g(View view) {
            return view.getTranslationZ();
        }

        static float h(View view) {
            return view.getZ();
        }

        static boolean i(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void j(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void k(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void l(View view, float f10) {
            view.setElevation(f10);
        }

        static void m(View view, boolean z10) {
            view.setNestedScrollingEnabled(z10);
        }

        static void n(View view, I i10) {
            a aVar = i10 != null ? new a(view, i10) : null;
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(AbstractC7046c.f63619M, aVar);
            }
            if (view.getTag(AbstractC7046c.f63618L) != null) {
                return;
            }
            if (aVar != null) {
                view.setOnApplyWindowInsetsListener(aVar);
            } else {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(AbstractC7046c.f63626T));
            }
        }

        static void o(View view, String str) {
            view.setTransitionName(str);
        }

        static void p(View view, float f10) {
            view.setTranslationZ(f10);
        }

        static void q(View view, float f10) {
            view.setZ(f10);
        }

        static void r(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.a0$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class i {
        public static L0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            L0 l0Z = L0.z(rootWindowInsets);
            l0Z.v(l0Z);
            l0Z.d(view.getRootView());
            return l0Z;
        }

        static void b(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.a0$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class j {
        static int a(View view) {
            return view.getImportantForAutofill();
        }

        static void b(View view, int i10) {
            view.setImportantForAutofill(i10);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.a0$k */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class k {
        static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }

        static void d(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        static void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void f(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.a0$l */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class l {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.a0$m */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class m {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static l1 c(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return l1.h(windowInsetsController);
            }
            return null;
        }

        static void d(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.a0$n */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class n {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static C2752d b(View view, C2752d c2752d) {
            ContentInfo contentInfoF = c2752d.f();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoF ? c2752d : C2752d.g(contentInfoPerformReceiveContent);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.a0$o */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class o {

        /* JADX INFO: renamed from: d */
        private static final ArrayList f29019d = new ArrayList();

        /* JADX INFO: renamed from: a */
        private WeakHashMap f29020a = null;

        /* JADX INFO: renamed from: b */
        private SparseArray f29021b = null;

        /* JADX INFO: renamed from: c */
        private WeakReference f29022c = null;

        o() {
        }

        static o a(View view) {
            o oVar = (o) view.getTag(AbstractC7046c.f63624R);
            if (oVar != null) {
                return oVar;
            }
            o oVar2 = new o();
            view.setTag(AbstractC7046c.f63624R, oVar2);
            return oVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f29020a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray d() {
            if (this.f29021b == null) {
                this.f29021b = new SparseArray();
            }
            return this.f29021b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(AbstractC7046c.f63625S);
            if (arrayList == null || arrayList.size() - 1 < 0) {
                return false;
            }
            android.support.v4.media.session.b.a(arrayList.get(size));
            throw null;
        }

        private void g() {
            WeakHashMap weakHashMap = this.f29020a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f29019d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f29020a == null) {
                        this.f29020a = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f29019d;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f29020a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f29020a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(viewC));
                }
            }
            return viewC != null;
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int iIndexOfKey;
            WeakReference weakReference2 = this.f29022c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f29022c = new WeakReference(keyEvent);
            SparseArray sparseArrayD = d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    public static int A(View view) {
        return view.getMinimumWidth();
    }

    public static void A0(View view, String str) {
        h.o(view, str);
    }

    public static String[] B(View view) {
        return Build.VERSION.SDK_INT >= 31 ? n.a(view) : (String[]) view.getTag(AbstractC7046c.f63621O);
    }

    public static void B0(View view, float f10) {
        h.p(view, f10);
    }

    public static int C(View view) {
        return view.getPaddingEnd();
    }

    public static void C0(View view, C2777p0.b bVar) {
        C2777p0.e(view, bVar);
    }

    public static int D(View view) {
        return view.getPaddingStart();
    }

    public static void D0(View view, float f10) {
        h.q(view, f10);
    }

    public static ViewParent E(View view) {
        return view.getParentForAccessibility();
    }

    private static f E0() {
        return new c(AbstractC7046c.f63623Q, CharSequence.class, 64, 30);
    }

    public static L0 F(View view) {
        return i.a(view);
    }

    public static void F0(View view) {
        h.r(view);
    }

    public static CharSequence G(View view) {
        return (CharSequence) E0().e(view);
    }

    public static String H(View view) {
        return h.f(view);
    }

    public static float I(View view) {
        return h.g(view);
    }

    public static l1 J(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return m.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return AbstractC2775o0.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static int K(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static float L(View view) {
        return h.h(view);
    }

    public static boolean M(View view) {
        return l(view) != null;
    }

    public static boolean N(View view) {
        return view.hasTransientState();
    }

    public static boolean O(View view) {
        Boolean bool = (Boolean) b().e(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean P(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean Q(View view) {
        return view.isLaidOut();
    }

    public static boolean R(View view) {
        return h.i(view);
    }

    public static boolean S(View view) {
        Boolean bool = (Boolean) j0().e(view);
        return bool != null && bool.booleanValue();
    }

    static void T(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = n(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z10) {
                    accessibilityEventObtain.getText().add(n(view));
                    t0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i10);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(n(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static void U(View view, int i10) {
        view.offsetLeftAndRight(i10);
    }

    public static void V(View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    public static L0 W(View view, L0 l02) {
        WindowInsets windowInsetsY = l02.y();
        if (windowInsetsY != null) {
            WindowInsets windowInsetsB = g.b(view, windowInsetsY);
            if (!windowInsetsB.equals(windowInsetsY)) {
                return L0.A(windowInsetsB, view);
            }
        }
        return l02;
    }

    public static void X(View view, L1.B b10) {
        view.onInitializeAccessibilityNodeInfo(b10.r1());
    }

    private static f Y() {
        return new b(AbstractC7046c.f63617K, CharSequence.class, 8, 28);
    }

    public static boolean Z(View view, int i10, Bundle bundle) {
        return view.performAccessibilityAction(i10, bundle);
    }

    public static C2752d a0(View view, C2752d c2752d) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c2752d + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return n.b(view, c2752d);
        }
        J j10 = (J) view.getTag(AbstractC7046c.f63620N);
        if (j10 == null) {
            return u(view).a(c2752d);
        }
        C2752d c2752dA = j10.a(view, c2752d);
        if (c2752dA == null) {
            return null;
        }
        return u(view).a(c2752dA);
    }

    private static f b() {
        return new d(AbstractC7046c.f63616J, Boolean.class, 28);
    }

    public static void b0(View view) {
        view.postInvalidateOnAnimation();
    }

    public static int c(View view, CharSequence charSequence, L1.E e10) {
        int iP = p(view, charSequence);
        if (iP != -1) {
            d(view, new B.a(iP, charSequence, e10));
        }
        return iP;
    }

    public static void c0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    private static void d(View view, B.a aVar) {
        j(view);
        f0(aVar.b(), view);
        o(view).add(aVar);
        T(view, 0);
    }

    public static void d0(View view, Runnable runnable, long j10) {
        view.postOnAnimationDelayed(runnable, j10);
    }

    public static C2767k0 e(View view) {
        if (f29005a == null) {
            f29005a = new WeakHashMap();
        }
        C2767k0 c2767k0 = (C2767k0) f29005a.get(view);
        if (c2767k0 != null) {
            return c2767k0;
        }
        C2767k0 c2767k02 = new C2767k0(view);
        f29005a.put(view, c2767k02);
        return c2767k02;
    }

    public static void e0(View view, int i10) {
        f0(i10, view);
        T(view, 0);
    }

    public static L0 f(View view, L0 l02, Rect rect) {
        return h.b(view, l02, rect);
    }

    private static void f0(int i10, View view) {
        List listO = o(view);
        for (int i11 = 0; i11 < listO.size(); i11++) {
            if (((B.a) listO.get(i11)).b() == i10) {
                listO.remove(i11);
                return;
            }
        }
    }

    public static L0 g(View view, L0 l02) {
        int i10 = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsY = l02.y();
        if (windowInsetsY != null) {
            WindowInsets windowInsetsA = i10 >= 30 ? m.a(view, windowInsetsY) : g.a(view, windowInsetsY);
            if (!windowInsetsA.equals(windowInsetsY)) {
                return L0.A(windowInsetsA, view);
            }
        }
        return l02;
    }

    public static void g0(View view, B.a aVar, CharSequence charSequence, L1.E e10) {
        if (e10 == null && charSequence == null) {
            e0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, e10));
        }
    }

    static boolean h(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return o.a(view).b(view, keyEvent);
    }

    public static void h0(View view) {
        g.c(view);
    }

    static boolean i(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return o.a(view).f(keyEvent);
    }

    public static void i0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            l.b(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    static void j(View view) {
        C2746a c2746aK = k(view);
        if (c2746aK == null) {
            c2746aK = new C2746a();
        }
        k0(view, c2746aK);
    }

    private static f j0() {
        return new a(AbstractC7046c.f63622P, Boolean.class, 28);
    }

    public static C2746a k(View view) {
        View.AccessibilityDelegate accessibilityDelegateL = l(view);
        if (accessibilityDelegateL == null) {
            return null;
        }
        return accessibilityDelegateL instanceof C2746a.C0495a ? ((C2746a.C0495a) accessibilityDelegateL).f29004a : new C2746a(accessibilityDelegateL);
    }

    public static void k0(View view, C2746a c2746a) {
        if (c2746a == null && (l(view) instanceof C2746a.C0495a)) {
            c2746a = new C2746a();
        }
        t0(view);
        view.setAccessibilityDelegate(c2746a == null ? null : c2746a.d());
    }

    private static View.AccessibilityDelegate l(View view) {
        return Build.VERSION.SDK_INT >= 29 ? l.a(view) : m(view);
    }

    public static void l0(View view, boolean z10) {
        b().f(view, Boolean.valueOf(z10));
    }

    private static View.AccessibilityDelegate m(View view) {
        if (f29007c) {
            return null;
        }
        if (f29006b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f29006b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f29007c = true;
                return null;
            }
        }
        try {
            Object obj = f29006b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f29007c = true;
            return null;
        }
    }

    public static void m0(View view, int i10) {
        view.setAccessibilityLiveRegion(i10);
    }

    public static CharSequence n(View view) {
        return (CharSequence) Y().e(view);
    }

    public static void n0(View view, CharSequence charSequence) {
        Y().f(view, charSequence);
        if (charSequence != null) {
            f29010f.a(view);
        } else {
            f29010f.d(view);
        }
    }

    private static List o(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(AbstractC7046c.f63614H);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(AbstractC7046c.f63614H, arrayList2);
        return arrayList2;
    }

    public static void o0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    private static int p(View view, CharSequence charSequence) {
        List listO = o(view);
        for (int i10 = 0; i10 < listO.size(); i10++) {
            if (TextUtils.equals(charSequence, ((B.a) listO.get(i10)).c())) {
                return ((B.a) listO.get(i10)).b();
            }
        }
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr = f29008d;
            if (i12 >= iArr.length || i11 != -1) {
                break;
            }
            int i13 = iArr[i12];
            boolean z10 = true;
            for (int i14 = 0; i14 < listO.size(); i14++) {
                z10 &= ((B.a) listO.get(i14)).b() != i13;
            }
            if (z10) {
                i11 = i13;
            }
            i12++;
        }
        return i11;
    }

    public static void p0(View view, ColorStateList colorStateList) {
        h.j(view, colorStateList);
    }

    public static ColorStateList q(View view) {
        return h.c(view);
    }

    public static void q0(View view, PorterDuff.Mode mode) {
        h.k(view, mode);
    }

    public static PorterDuff.Mode r(View view) {
        return h.d(view);
    }

    public static void r0(View view, float f10) {
        h.l(view, f10);
    }

    public static Display s(View view) {
        return view.getDisplay();
    }

    public static void s0(View view, int i10) {
        view.setImportantForAccessibility(i10);
    }

    public static float t(View view) {
        return h.e(view);
    }

    private static void t0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static K u(View view) {
        return view instanceof K ? (K) view : f29009e;
    }

    public static void u0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            j.b(view, i10);
        }
    }

    public static boolean v(View view) {
        return view.getFitsSystemWindows();
    }

    public static void v0(View view, boolean z10) {
        h.m(view, z10);
    }

    public static int w(View view) {
        return view.getImportantForAccessibility();
    }

    public static void w0(View view, I i10) {
        h.n(view, i10);
    }

    public static int x(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return j.a(view);
        }
        return 0;
    }

    public static void x0(View view, boolean z10) {
        j0().f(view, Boolean.valueOf(z10));
    }

    public static int y(View view) {
        return view.getLayoutDirection();
    }

    public static void y0(View view, int i10, int i11) {
        i.b(view, i10, i11);
    }

    public static int z(View view) {
        return view.getMinimumHeight();
    }

    public static void z0(View view, CharSequence charSequence) {
        E0().f(view, charSequence);
    }

    /* JADX INFO: renamed from: androidx.core.view.a0$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        private final WeakHashMap f29011a = new WeakHashMap();

        e() {
        }

        private void b(Map.Entry entry) {
            View view = (View) entry.getKey();
            boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z10 = view.isShown() && view.getWindowVisibility() == 0;
            if (zBooleanValue != z10) {
                AbstractC2747a0.T(view, z10 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z10));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        void a(View view) {
            this.f29011a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        void d(View view) {
            this.f29011a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator it = this.f29011a.entrySet().iterator();
                while (it.hasNext()) {
                    b((Map.Entry) it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static /* synthetic */ C2752d a(C2752d c2752d) {
        return c2752d;
    }
}
