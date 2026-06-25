package com.facebook.react.uimanager;

import android.util.SparseBooleanArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.views.view.ReactViewManager;
import z5.AbstractC7283a;

/* JADX INFO: renamed from: com.facebook.react.uimanager.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class C3309z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j0 f37874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y f37875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseBooleanArray f37876c = new SparseBooleanArray();

    /* JADX INFO: renamed from: com.facebook.react.uimanager.z$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final O f37877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f37878b;

        a(O o10, int i10) {
            this.f37877a = o10;
            this.f37878b = i10;
        }
    }

    static {
        W6.b.a("NativeViewHierarchyOptimizer", W6.a.f20778b);
    }

    public C3309z(j0 j0Var, Y y10) {
        this.f37874a = j0Var;
        this.f37875b = y10;
    }

    private void a(O o10, O o11, int i10) {
        Q6.a.a(o11.getNativeKind() != EnumC3307x.f37848a);
        for (int i11 = 0; i11 < o11.getChildCount(); i11++) {
            O childAt = o11.getChildAt(i11);
            Q6.a.a(childAt.getNativeParent() == null);
            int nativeChildCount = o10.getNativeChildCount();
            if (childAt.getNativeKind() == EnumC3307x.f37850c) {
                d(o10, childAt, i10);
            } else {
                b(o10, childAt, i10);
            }
            i10 += o10.getNativeChildCount() - nativeChildCount;
        }
    }

    private void b(O o10, O o11, int i10) {
        o10.addNativeChildAt(o11, i10);
        this.f37874a.G(o10.getReactTag(), null, new m0[]{new m0(o11.getReactTag(), i10)}, null);
        if (o11.getNativeKind() != EnumC3307x.f37848a) {
            a(o10, o11, i10 + 1);
        }
    }

    private void c(O o10, O o11, int i10) {
        int nativeOffsetForChild = o10.getNativeOffsetForChild(o10.getChildAt(i10));
        if (o10.getNativeKind() != EnumC3307x.f37848a) {
            a aVarS = s(o10, nativeOffsetForChild);
            if (aVarS == null) {
                return;
            }
            O o12 = aVarS.f37877a;
            nativeOffsetForChild = aVarS.f37878b;
            o10 = o12;
        }
        if (o11.getNativeKind() != EnumC3307x.f37850c) {
            b(o10, o11, nativeOffsetForChild);
        } else {
            d(o10, o11, nativeOffsetForChild);
        }
    }

    private void d(O o10, O o11, int i10) {
        a(o10, o11, i10);
    }

    private void e(O o10) {
        int reactTag = o10.getReactTag();
        if (this.f37876c.get(reactTag)) {
            return;
        }
        this.f37876c.put(reactTag, true);
        int screenX = o10.getScreenX();
        int screenY = o10.getScreenY();
        for (O parent = o10.getParent(); parent != null && parent.getNativeKind() != EnumC3307x.f37848a; parent = parent.getParent()) {
            if (!parent.isVirtual()) {
                screenX += Math.round(parent.getLayoutX());
                screenY += Math.round(parent.getLayoutY());
            }
        }
        f(o10, screenX, screenY);
    }

    private void f(O o10, int i10, int i11) {
        if (o10.getNativeKind() != EnumC3307x.f37850c && o10.getNativeParent() != null) {
            this.f37874a.P(o10.getLayoutParent().getReactTag(), o10.getReactTag(), i10, i11, o10.getScreenWidth(), o10.getScreenHeight(), o10.getLayoutDirection());
            return;
        }
        for (int i12 = 0; i12 < o10.getChildCount(); i12++) {
            O childAt = o10.getChildAt(i12);
            int reactTag = childAt.getReactTag();
            if (!this.f37876c.get(reactTag)) {
                this.f37876c.put(reactTag, true);
                f(childAt, childAt.getScreenX() + i10, childAt.getScreenY() + i11);
            }
        }
    }

    public static void j(O o10) {
        o10.removeAllNativeChildren();
    }

    private static boolean n(Q q10) {
        if (q10 == null) {
            return true;
        }
        if (q10.c("collapsable") && !q10.a("collapsable", true)) {
            return false;
        }
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = q10.d().keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            if (!D0.a(q10.d(), readableMapKeySetIteratorKeySetIterator.nextKey())) {
                return false;
            }
        }
        return true;
    }

    private void q(O o10, boolean z10) {
        if (o10.getNativeKind() != EnumC3307x.f37848a) {
            for (int childCount = o10.getChildCount() - 1; childCount >= 0; childCount--) {
                q(o10.getChildAt(childCount), z10);
            }
        }
        O nativeParent = o10.getNativeParent();
        if (nativeParent != null) {
            int iIndexOfNativeChild = nativeParent.indexOfNativeChild(o10);
            nativeParent.removeNativeChildAt(iIndexOfNativeChild);
            this.f37874a.G(nativeParent.getReactTag(), new int[]{iIndexOfNativeChild}, null, z10 ? new int[]{o10.getReactTag()} : null);
        }
    }

    private void r(O o10, Q q10) {
        O parent = o10.getParent();
        if (parent == null) {
            o10.setIsLayoutOnly(false);
            return;
        }
        int iIndexOf = parent.indexOf(o10);
        parent.removeChildAt(iIndexOf);
        q(o10, false);
        o10.setIsLayoutOnly(false);
        this.f37874a.C(o10.getThemedContext(), o10.getReactTag(), o10.getViewClass(), q10);
        parent.addChildAt(o10, iIndexOf);
        c(parent, o10, iIndexOf);
        for (int i10 = 0; i10 < o10.getChildCount(); i10++) {
            c(o10, o10.getChildAt(i10), i10);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Transitioning LayoutOnlyView - tag: ");
        sb2.append(o10.getReactTag());
        sb2.append(" - rootTag: ");
        sb2.append(o10.getRootTag());
        sb2.append(" - hasProps: ");
        sb2.append(q10 != null);
        sb2.append(" - tagsWithLayout.size: ");
        sb2.append(this.f37876c.size());
        AbstractC7283a.s("NativeViewHierarchyOptimizer", sb2.toString());
        Q6.a.a(this.f37876c.size() == 0);
        e(o10);
        for (int i11 = 0; i11 < o10.getChildCount(); i11++) {
            e(o10.getChildAt(i11));
        }
        this.f37876c.clear();
    }

    private a s(O o10, int i10) {
        while (o10.getNativeKind() != EnumC3307x.f37848a) {
            O parent = o10.getParent();
            if (parent == null) {
                return null;
            }
            i10 = i10 + (o10.getNativeKind() == EnumC3307x.f37849b ? 1 : 0) + parent.getNativeOffsetForChild(o10);
            o10 = parent;
        }
        return new a(o10, i10);
    }

    public void g(O o10, C3284b0 c3284b0, Q q10) {
        o10.setIsLayoutOnly(o10.getViewClass().equals(ReactViewManager.REACT_CLASS) && n(q10));
        if (o10.getNativeKind() != EnumC3307x.f37850c) {
            this.f37874a.C(c3284b0, o10.getReactTag(), o10.getViewClass(), q10);
        }
    }

    public void h(O o10) {
        if (o10.isLayoutOnly()) {
            r(o10, null);
        }
    }

    public void i(O o10, int[] iArr, int[] iArr2, m0[] m0VarArr, int[] iArr3) {
        boolean z10;
        for (int i10 : iArr2) {
            int i11 = 0;
            while (true) {
                if (i11 >= iArr3.length) {
                    z10 = false;
                    break;
                } else {
                    if (iArr3[i11] == i10) {
                        z10 = true;
                        break;
                    }
                    i11++;
                }
            }
            q(this.f37875b.c(i10), z10);
        }
        for (m0 m0Var : m0VarArr) {
            c(o10, this.f37875b.c(m0Var.f37793a), m0Var.f37794b);
        }
    }

    public void k(O o10, ReadableArray readableArray) {
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            c(o10, this.f37875b.c(readableArray.getInt(i10)), i10);
        }
    }

    public void l(O o10) {
        e(o10);
    }

    public void m(O o10, String str, Q q10) {
        if (o10.isLayoutOnly() && !n(q10)) {
            r(o10, q10);
        } else {
            if (o10.isLayoutOnly()) {
                return;
            }
            this.f37874a.Q(o10.getReactTag(), str, q10);
        }
    }

    public void o() {
        this.f37876c.clear();
    }

    void p(O o10) {
        this.f37876c.clear();
    }
}
