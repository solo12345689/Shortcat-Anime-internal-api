package com.facebook.react.uimanager;

import Ud.AbstractC2279u;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ViewGroupManager;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup f37807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f37809c;

    public p0(ViewGroup viewGroup) {
        AbstractC5504s.h(viewGroup, "viewGroup");
        this.f37807a = viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(View view, View view2) {
        ViewGroupManager.Companion companion = ViewGroupManager.INSTANCE;
        Integer numA = companion.a(view);
        int iIntValue = numA != null ? numA.intValue() : 0;
        Integer numA2 = companion.a(view2);
        return iIntValue - (numA2 != null ? numA2.intValue() : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    public final int c(int i10, int i11) {
        int[] iArr = this.f37809c;
        if (iArr != null && (i11 >= iArr.length || iArr[i11] >= i10)) {
            AbstractC7283a.K("ReactNative", "getChildDrawingOrder index out of bounds! Please check any custom view manipulations you may have done. childCount = %d, index = %d", Integer.valueOf(i10), Integer.valueOf(i11));
            i();
        }
        if (iArr == null) {
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < i10; i12++) {
                arrayList.add(this.f37807a.getChildAt(i12));
            }
            final Function2 function2 = new Function2() { // from class: com.facebook.react.uimanager.n0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Integer.valueOf(p0.d((View) obj, (View) obj2));
                }
            };
            AbstractC2279u.B(arrayList, new Comparator() { // from class: com.facebook.react.uimanager.o0
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return p0.e(function2, obj, obj2);
                }
            });
            int[] iArr2 = new int[i10];
            for (int i13 = 0; i13 < i10; i13++) {
                Object obj = arrayList.get(i13);
                AbstractC5504s.g(obj, "get(...)");
                iArr2[i13] = this.f37807a.indexOfChild((View) obj);
            }
            this.f37809c = iArr2;
            iArr = iArr2;
        }
        return iArr[i11];
    }

    public final void f(View view) {
        AbstractC5504s.h(view, "view");
        if (ViewGroupManager.INSTANCE.a(view) != null) {
            this.f37808b++;
        }
        this.f37809c = null;
    }

    public final void g(View view) {
        if (ViewGroupManager.INSTANCE.a(view) != null) {
            this.f37808b--;
        }
        this.f37809c = null;
    }

    public final boolean h() {
        return this.f37808b > 0;
    }

    public final void i() {
        this.f37808b = 0;
        int childCount = this.f37807a.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (ViewGroupManager.INSTANCE.a(this.f37807a.getChildAt(i10)) != null) {
                this.f37808b++;
            }
        }
        this.f37809c = null;
    }
}
