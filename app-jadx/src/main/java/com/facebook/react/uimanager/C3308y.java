package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import z5.AbstractC7283a;

/* JADX INFO: renamed from: com.facebook.react.uimanager.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3308y {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f37854l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f37855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray f37856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f37857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseBooleanArray f37858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y0 f37859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final A7.a f37860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final RootViewManager f37861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final G7.a f37862h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RectF f37863i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f37864j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private HashMap f37865k;

    /* JADX INFO: renamed from: com.facebook.react.uimanager.y$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements G7.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroupManager f37866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f37867b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f37868c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Set f37869d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f37870e;

        a(ViewGroupManager viewGroupManager, ViewGroup viewGroup, View view, Set set, int i10) {
            this.f37866a = viewGroupManager;
            this.f37867b = viewGroup;
            this.f37868c = view;
            this.f37869d = set;
            this.f37870e = i10;
        }
    }

    static {
        W6.b.a("NativeViewHierarchyManager", W6.a.f20778b);
        f37854l = C3308y.class.getSimpleName();
    }

    public C3308y(y0 y0Var) {
        this(y0Var, new RootViewManager());
    }

    private void A(View view, int i10, int i11, int i12, int i13) {
        if (this.f37864j && this.f37862h.e(view)) {
            this.f37862h.a(view, i10, i11, i12, i13);
        } else {
            view.layout(i10, i11, i10 + i12, i11 + i13);
        }
    }

    private boolean c(int[] iArr, int i10) {
        if (iArr == null) {
            return false;
        }
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    private void f(View view, int[] iArr) {
        this.f37863i.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        q(view, this.f37863i);
        iArr[0] = Math.round(this.f37863i.left);
        iArr[1] = Math.round(this.f37863i.top);
        RectF rectF = this.f37863i;
        iArr[2] = Math.round(rectF.right - rectF.left);
        RectF rectF2 = this.f37863i;
        iArr[3] = Math.round(rectF2.bottom - rectF2.top);
    }

    private static String h(ViewGroup viewGroup, ViewGroupManager viewGroupManager, int[] iArr, m0[] m0VarArr, int[] iArr2) {
        StringBuilder sb2 = new StringBuilder();
        if (viewGroup != null) {
            sb2.append("View tag:" + viewGroup.getId() + " View Type:" + viewGroup.getClass().toString() + "\n");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("  children(");
            sb3.append(viewGroupManager.getChildCount(viewGroup));
            sb3.append("): [\n");
            sb2.append(sb3.toString());
            for (int i10 = 0; viewGroupManager.getChildAt(viewGroup, i10) != null; i10 += 16) {
                int i11 = 0;
                while (true) {
                    int i12 = i10 + i11;
                    if (viewGroupManager.getChildAt(viewGroup, i12) == null || i11 >= 16) {
                        break;
                    }
                    sb2.append(viewGroupManager.getChildAt(viewGroup, i12).getId() + com.amazon.a.a.o.b.f.f34694a);
                    i11++;
                }
                sb2.append("\n");
            }
            sb2.append(" ],\n");
        }
        if (iArr != null) {
            sb2.append("  indicesToRemove(" + iArr.length + "): [\n");
            for (int i13 = 0; i13 < iArr.length; i13 += 16) {
                int i14 = 0;
                while (true) {
                    int i15 = i13 + i14;
                    if (i15 >= iArr.length || i14 >= 16) {
                        break;
                    }
                    sb2.append(iArr[i15] + com.amazon.a.a.o.b.f.f34694a);
                    i14++;
                }
                sb2.append("\n");
            }
            sb2.append(" ],\n");
        }
        if (m0VarArr != null) {
            sb2.append("  viewsToAdd(" + m0VarArr.length + "): [\n");
            for (int i16 = 0; i16 < m0VarArr.length; i16 += 16) {
                int i17 = 0;
                while (true) {
                    int i18 = i16 + i17;
                    if (i18 >= m0VarArr.length || i17 >= 16) {
                        break;
                    }
                    sb2.append("[" + m0VarArr[i18].f37794b + com.amazon.a.a.o.b.f.f34694a + m0VarArr[i18].f37793a + "],");
                    i17++;
                }
                sb2.append("\n");
            }
            sb2.append(" ],\n");
        }
        if (iArr2 != null) {
            sb2.append("  tagsToDelete(" + iArr2.length + "): [\n");
            for (int i19 = 0; i19 < iArr2.length; i19 += 16) {
                int i20 = 0;
                while (true) {
                    int i21 = i19 + i20;
                    if (i21 >= iArr2.length || i20 >= 16) {
                        break;
                    }
                    sb2.append(iArr2[i21] + com.amazon.a.a.o.b.f.f34694a);
                    i20++;
                }
                sb2.append("\n");
            }
            sb2.append(" ]\n");
        }
        return sb2.toString();
    }

    private Set n(int i10) {
        if (this.f37865k == null) {
            this.f37865k = new HashMap();
        }
        if (!this.f37865k.containsKey(Integer.valueOf(i10))) {
            this.f37865k.put(Integer.valueOf(i10), new HashSet());
        }
        return (Set) this.f37865k.get(Integer.valueOf(i10));
    }

    private void q(View view, RectF rectF) {
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.mapRect(rectF);
        }
        rectF.offset(view.getLeft(), view.getTop());
        Object parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            Matrix matrix2 = view2.getMatrix();
            if (!matrix2.isIdentity()) {
                matrix2.mapRect(rectF);
            }
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
    }

    public synchronized void B(int i10, Q q10) {
        try {
            if (this.f37855a) {
                AbstractC7283a.d(f37854l, "updateProperties[%d]: %s", Integer.valueOf(i10), q10.toString());
            }
            UiThreadUtil.assertOnUiThread();
            try {
                ViewManager viewManagerV = v(i10);
                View viewU = u(i10);
                if (q10 != null) {
                    viewManagerV.updateProperties(viewU, q10);
                }
            } catch (C3299o e10) {
                AbstractC7283a.n(f37854l, "Unable to update properties for view tag " + i10, e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void C(int i10, Object obj) {
        try {
            if (this.f37855a) {
                AbstractC7283a.d(f37854l, "updateViewExtraData[%d]: %s", Integer.valueOf(i10), obj.toString());
            }
            UiThreadUtil.assertOnUiThread();
            v(i10).updateExtraData(u(i10), obj);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void a(int i10, View view) {
        b(i10, view);
    }

    protected final synchronized void b(int i10, View view) {
        try {
            if (this.f37855a) {
                AbstractC7283a.d(f37854l, "addRootViewGroup[%d]: %s", Integer.valueOf(i10), view != null ? view.toString() : "<null>");
            }
            if (view.getId() != -1) {
                AbstractC7283a.m(f37854l, "Trying to add a root view with an explicit id (" + view.getId() + ") already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
            }
            this.f37856b.put(i10, view);
            this.f37857c.put(i10, this.f37861g);
            this.f37858d.put(i10, true);
            view.setId(i10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void d() {
        this.f37860f.b();
    }

    synchronized void e() {
        this.f37862h.d();
    }

    synchronized void g(ReadableMap readableMap, Callback callback) {
        this.f37862h.c(readableMap, callback);
    }

    public synchronized void i(C3284b0 c3284b0, int i10, String str, Q q10) {
        try {
            if (this.f37855a) {
                AbstractC7283a.e(f37854l, "createView[%d]: %s %s", Integer.valueOf(i10), str, q10 != null ? q10.toString() : "<null>");
            }
            UiThreadUtil.assertOnUiThread();
            U7.b.a(0L, "NativeViewHierarchyManager_createView").a("tag", i10).b("className", str).c();
            try {
                ViewManager viewManagerG = this.f37859e.g(str);
                this.f37856b.put(i10, viewManagerG.createView(i10, c3284b0, q10, null, this.f37860f));
                this.f37857c.put(i10, viewManagerG);
                U7.a.i(0L);
            } catch (Throwable th2) {
                U7.a.i(0L);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized void j(int i10, int i11, ReadableArray readableArray) {
        try {
            if (this.f37855a) {
                AbstractC7283a.e(f37854l, "dispatchCommand[%d]: %d %s", Integer.valueOf(i10), Integer.valueOf(i11), readableArray != null ? readableArray.toString() : "<null>");
            }
            UiThreadUtil.assertOnUiThread();
            View view = (View) this.f37856b.get(i10);
            if (view == null) {
                throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i10 + "] and command " + i11);
            }
            v(i10).receiveCommand(view, i11, readableArray);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void k(int i10, String str, ReadableArray readableArray) {
        try {
            if (this.f37855a) {
                AbstractC7283a.e(f37854l, "dispatchCommand[%d]: %s %s", Integer.valueOf(i10), str, readableArray != null ? readableArray.toString() : "<null>");
            }
            UiThreadUtil.assertOnUiThread();
            View view = (View) this.f37856b.get(i10);
            if (view == null) {
                throw new RetryableMountingLayerException("Trying to send command to a non-existing view with tag [" + i10 + "] and command " + str);
            }
            v(i10).receiveCommand(view, str, readableArray);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    protected synchronized void l(View view) {
        try {
            if (this.f37855a) {
                AbstractC7283a.c(f37854l, "dropView[%d]", Integer.valueOf(view != null ? view.getId() : -1));
            }
            UiThreadUtil.assertOnUiThread();
            if (view == null) {
                return;
            }
            if (this.f37857c.get(view.getId()) == null) {
                return;
            }
            if (!this.f37858d.get(view.getId())) {
                v(view.getId()).onDropViewInstance(view);
            }
            ViewManager viewManager = (ViewManager) this.f37857c.get(view.getId());
            if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
                ViewGroup viewGroup = (ViewGroup) view;
                ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
                for (int childCount = viewGroupManager.getChildCount(viewGroup) - 1; childCount >= 0; childCount--) {
                    View childAt = viewGroupManager.getChildAt(viewGroup, childCount);
                    if (childAt == null) {
                        AbstractC7283a.m(f37854l, "Unable to drop null child view");
                    } else if (this.f37856b.get(childAt.getId()) != null) {
                        l(childAt);
                    }
                }
                viewGroupManager.removeAllViews(viewGroup);
            }
            this.f37856b.remove(view.getId());
            this.f37857c.remove(view.getId());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized int m(int i10, float f10, float f11) {
        View view;
        try {
            if (this.f37855a) {
                AbstractC7283a.e(f37854l, "findTargetTagForTouch[%d]: %f %f", Integer.valueOf(i10), Float.valueOf(f10), Float.valueOf(f11));
            }
            UiThreadUtil.assertOnUiThread();
            view = (View) this.f37856b.get(i10);
            if (view == null) {
                throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return C3286c0.d(f10, f11, (ViewGroup) view);
    }

    public synchronized int o() {
        return this.f37858d.size();
    }

    public synchronized void p(int i10, int[] iArr, m0[] m0VarArr, int[] iArr2) throws Throwable {
        Throwable th2;
        int i11;
        try {
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            if (this.f37855a) {
                try {
                    AbstractC7283a.f(f37854l, "createView[%d]: %s %s %s", Integer.valueOf(i10), iArr != null ? iArr.toString() : "<null>", m0VarArr != null ? m0VarArr.toString() : "<null>", iArr2 != null ? iArr2.toString() : "<null>");
                } catch (Throwable th4) {
                    th2 = th4;
                }
            }
            UiThreadUtil.assertOnUiThread();
            Set setN = n(i10);
            ViewGroup viewGroup = (ViewGroup) this.f37856b.get(i10);
            ViewGroupManager viewGroupManager = (ViewGroupManager) v(i10);
            if (viewGroup == null) {
                throw new C3299o("Trying to manageChildren view with tag " + i10 + " which doesn't exist\n detail: " + h(viewGroup, viewGroupManager, iArr, m0VarArr, iArr2));
            }
            int childCount = viewGroupManager.getChildCount(viewGroup);
            if (iArr != null) {
                int length = iArr.length - 1;
                while (length >= 0) {
                    int i12 = iArr[length];
                    if (i12 < 0) {
                        throw new C3299o("Trying to remove a negative view index:" + i12 + " view tag: " + i10 + "\n detail: " + h(viewGroup, viewGroupManager, iArr, m0VarArr, iArr2));
                    }
                    if (viewGroupManager.getChildAt(viewGroup, i12) == null) {
                        if (this.f37858d.get(i10) && viewGroupManager.getChildCount(viewGroup) == 0) {
                            return;
                        }
                        throw new C3299o("Trying to remove a view index above child count " + i12 + " view tag: " + i10 + "\n detail: " + h(viewGroup, viewGroupManager, iArr, m0VarArr, iArr2));
                    }
                    if (i12 >= childCount) {
                        throw new C3299o("Trying to remove an out of order view index:" + i12 + " view tag: " + i10 + "\n detail: " + h(viewGroup, viewGroupManager, iArr, m0VarArr, iArr2));
                    }
                    View childAt = viewGroupManager.getChildAt(viewGroup, i12);
                    if (!this.f37864j || !this.f37862h.e(childAt) || !c(iArr2, childAt.getId())) {
                        viewGroupManager.removeViewAt(viewGroup, i12);
                    }
                    length--;
                    childCount = i12;
                }
            }
            if (iArr2 != null) {
                int i13 = 0;
                while (i13 < iArr2.length) {
                    int i14 = iArr2[i13];
                    View view = (View) this.f37856b.get(i14);
                    if (view == null) {
                        throw new C3299o("Trying to destroy unknown view tag: " + i14 + "\n detail: " + h(viewGroup, viewGroupManager, iArr, m0VarArr, iArr2));
                    }
                    if (this.f37864j && this.f37862h.e(view)) {
                        setN.add(Integer.valueOf(i14));
                        i11 = i10;
                        this.f37862h.b(view, new a(viewGroupManager, viewGroup, view, setN, i11));
                    } else {
                        i11 = i10;
                        l(view);
                    }
                    i13++;
                    i10 = i11;
                }
            }
            int i15 = i10;
            if (m0VarArr != null) {
                for (m0 m0Var : m0VarArr) {
                    View view2 = (View) this.f37856b.get(m0Var.f37793a);
                    if (view2 == null) {
                        throw new C3299o("Trying to add unknown view tag: " + m0Var.f37793a + "\n detail: " + h(viewGroup, viewGroupManager, iArr, m0VarArr, iArr2));
                    }
                    int i16 = m0Var.f37794b;
                    if (!setN.isEmpty()) {
                        i16 = 0;
                        int i17 = 0;
                        while (i16 < viewGroup.getChildCount() && i17 != m0Var.f37794b) {
                            if (!setN.contains(Integer.valueOf(viewGroup.getChildAt(i16).getId()))) {
                                i17++;
                            }
                            i16++;
                        }
                    }
                    viewGroupManager.addView(viewGroup, view2, i16);
                }
            }
            if (setN.isEmpty()) {
                this.f37865k.remove(Integer.valueOf(i15));
            }
            return;
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
        }
        throw th2;
    }

    public synchronized void r(int i10, int[] iArr) {
        try {
            if (this.f37855a) {
                AbstractC7283a.c(f37854l, "measure[%d]", Integer.valueOf(i10));
            }
            UiThreadUtil.assertOnUiThread();
            View view = (View) this.f37856b.get(i10);
            if (view == null) {
                throw new C3299o("No native view for " + i10 + " currently exists");
            }
            View view2 = (View) X.a(view);
            if (view2 == null) {
                throw new C3299o("Native view " + i10 + " is no longer on screen");
            }
            f(view2, iArr);
            int i11 = iArr[0];
            int i12 = iArr[1];
            f(view, iArr);
            iArr[0] = iArr[0] - i11;
            iArr[1] = iArr[1] - i12;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void s(int i10, int[] iArr) {
        try {
            if (this.f37855a) {
                AbstractC7283a.c(f37854l, "measureInWindow[%d]", Integer.valueOf(i10));
            }
            UiThreadUtil.assertOnUiThread();
            View view = (View) this.f37856b.get(i10);
            if (view == null) {
                throw new C3299o("No native view for " + i10 + " currently exists");
            }
            view.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            iArr[0] = iArr[0] - rect.left;
            iArr[1] = iArr[1] - rect.top;
            iArr[2] = view.getWidth();
            iArr[3] = view.getHeight();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void t(int i10) {
        try {
            if (this.f37855a) {
                AbstractC7283a.c(f37854l, "removeRootView[%d]", Integer.valueOf(i10));
            }
            UiThreadUtil.assertOnUiThread();
            if (!this.f37858d.get(i10)) {
                SoftAssertions.assertUnreachable("View with tag " + i10 + " is not registered as a root view");
            }
            View view = (View) this.f37856b.get(i10);
            l(view);
            this.f37858d.delete(i10);
            if (view != null) {
                view.setId(-1);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized View u(int i10) {
        View view;
        view = (View) this.f37856b.get(i10);
        if (view == null) {
            throw new C3299o("Trying to resolve view with tag " + i10 + " which doesn't exist");
        }
        return view;
    }

    public final synchronized ViewManager v(int i10) {
        ViewManager viewManager;
        viewManager = (ViewManager) this.f37857c.get(i10);
        if (viewManager == null) {
            throw new C3299o("ViewManager for tag " + i10 + " could not be found.\n");
        }
        return viewManager;
    }

    public synchronized void w(int i10, int i11) {
        View view = (View) this.f37856b.get(i10);
        if (view == null) {
            throw new RetryableMountingLayerException("Could not find view with tag " + i10);
        }
        view.sendAccessibilityEvent(i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized void x(int i10, int i11, boolean z10) {
        if (!z10) {
            this.f37860f.d(i11, null);
            return;
        }
        View view = (View) this.f37856b.get(i10);
        if (i11 != i10 && (view instanceof ViewParent)) {
            this.f37860f.d(i11, (ViewParent) view);
            return;
        }
        if (this.f37858d.get(i10)) {
            SoftAssertions.assertUnreachable("Cannot block native responder on " + i10 + " that is a root view");
        }
        this.f37860f.d(i11, view.getParent());
    }

    public void y(boolean z10) {
        this.f37864j = z10;
    }

    public synchronized void z(int i10, int i11, int i12, int i13, int i14, int i15, com.facebook.yoga.h hVar) throws Throwable {
        Throwable th2;
        Throwable th3;
        try {
        } catch (Throwable th4) {
            th = th4;
        }
        try {
            if (this.f37855a) {
                try {
                    AbstractC7283a.h(f37854l, "updateLayout[%d]->[%d]: %d %d %d %d", Integer.valueOf(i11), Integer.valueOf(i10), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15));
                } catch (Throwable th5) {
                    th2 = th5;
                    throw th2;
                }
            }
            UiThreadUtil.assertOnUiThread();
            U7.b.a(0L, "NativeViewHierarchyManager_updateLayout").a("parentTag", i10).a("tag", i11).c();
            try {
                View viewU = u(i11);
                viewU.measure(View.MeasureSpec.makeMeasureSpec(i14, 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
                ViewParent parent = viewU.getParent();
                if (parent instanceof W) {
                    try {
                        parent.requestLayout();
                    } catch (Throwable th6) {
                        th3 = th6;
                        U7.a.i(0L);
                        throw th3;
                    }
                }
                if (this.f37858d.get(i10)) {
                    try {
                        A(viewU, i12, i13, i14, i15);
                    } catch (Throwable th7) {
                        th = th7;
                        th3 = th;
                        U7.a.i(0L);
                        throw th3;
                    }
                } else {
                    NativeModule nativeModule = (ViewManager) this.f37857c.get(i10);
                    if (!(nativeModule instanceof InterfaceC3298n)) {
                        throw new C3299o("Trying to use view with tag " + i10 + " as a parent, but its Manager doesn't implement IViewManagerWithChildren");
                    }
                    InterfaceC3298n interfaceC3298n = (InterfaceC3298n) nativeModule;
                    if (interfaceC3298n != null && !interfaceC3298n.needsCustomLayoutForChildren()) {
                        A(viewU, i12, i13, i14, i15);
                    }
                }
                U7.a.i(0L);
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Throwable th9) {
            th = th9;
            th2 = th;
            throw th2;
        }
    }

    public C3308y(y0 y0Var, RootViewManager rootViewManager) {
        Y6.a aVar = Y6.a.f22859a;
        this.f37855a = false;
        this.f37860f = new A7.a();
        this.f37862h = new G7.a();
        this.f37863i = new RectF();
        this.f37859e = y0Var;
        this.f37856b = new SparseArray();
        this.f37857c = new SparseArray();
        this.f37858d = new SparseBooleanArray();
        this.f37861g = rootViewManager;
    }
}
