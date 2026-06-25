package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Object f37571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final EventDispatcher f37572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final ReactApplicationContext f37573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Y f37574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final y0 f37575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j0 f37576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3309z f37577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f37578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f37579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f37580j;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ O f37581a;

        a(O o10) {
            this.f37581a = o10;
        }

        @Override // java.lang.Runnable
        public void run() {
            e0.this.f37574d.b(this.f37581a);
        }
    }

    static {
        W6.b.a("UIImplementation", W6.a.f20778b);
    }

    e0(ReactApplicationContext reactApplicationContext, y0 y0Var, EventDispatcher eventDispatcher, int i10) {
        this(reactApplicationContext, y0Var, new j0(reactApplicationContext, new C3308y(y0Var), i10), eventDispatcher);
    }

    private void A(O o10) {
        if (o10.hasUpdates()) {
            for (int i10 = 0; i10 < o10.getChildCount(); i10++) {
                A(o10.getChildAt(i10));
            }
            o10.onBeforeLayout(this.f37577g);
        }
    }

    private void L(O o10) {
        C3309z.j(o10);
        this.f37574d.g(o10.getReactTag());
        for (int childCount = o10.getChildCount() - 1; childCount >= 0; childCount--) {
            L(o10.getChildAt(childCount));
        }
        o10.removeAndDisposeAllChildren();
    }

    private void c(O o10) {
        NativeModule nativeModule = (ViewManager) Q6.a.c(this.f37575e.g(o10.getViewClass()));
        if (!(nativeModule instanceof InterfaceC3298n)) {
            throw new C3299o("Trying to use view " + o10.getViewClass() + " as a parent, but its Manager doesn't extends ViewGroupManager");
        }
        InterfaceC3298n interfaceC3298n = (InterfaceC3298n) nativeModule;
        if (interfaceC3298n == null || !interfaceC3298n.needsCustomLayoutForChildren()) {
            return;
        }
        throw new C3299o("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (" + o10.getViewClass() + "). Use measure instead.");
    }

    private boolean e(int i10, String str) {
        if (this.f37574d.c(i10) != null) {
            return true;
        }
        String str2 = "Unable to execute operation " + str + " on view with tag: " + i10 + ", since the view does not exist";
        if (Y6.a.f22860b) {
            throw new C3299o(str2);
        }
        AbstractC7283a.I("ReactNative", str2);
        return false;
    }

    private void n() {
        if (this.f37576f.U()) {
            m(-1);
        }
    }

    private void y(int i10, int i11, int[] iArr) {
        O oC = this.f37574d.c(i10);
        O oC2 = this.f37574d.c(i11);
        if (oC == null || oC2 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Tag ");
            if (oC != null) {
                i10 = i11;
            }
            sb2.append(i10);
            sb2.append(" does not exist");
            throw new C3299o(sb2.toString());
        }
        if (oC != oC2) {
            for (O parent = oC.getParent(); parent != oC2; parent = parent.getParent()) {
                if (parent == null) {
                    throw new C3299o("Tag " + i11 + " is not an ancestor of tag " + i10);
                }
            }
        }
        z(oC, oC2, iArr);
    }

    private void z(O o10, O o11, int[] iArr) {
        int iRound;
        int iRound2;
        if (o10 == o11 || o10.isVirtual()) {
            iRound = 0;
            iRound2 = 0;
        } else {
            iRound = Math.round(o10.getLayoutX());
            iRound2 = Math.round(o10.getLayoutY());
            for (O parent = o10.getParent(); parent != o11; parent = parent.getParent()) {
                Q6.a.c(parent);
                c(parent);
                iRound += Math.round(parent.getLayoutX());
                iRound2 += Math.round(parent.getLayoutY());
            }
            c(o11);
        }
        iArr[0] = iRound;
        iArr[1] = iRound2;
        iArr[2] = o10.getScreenWidth();
        iArr[3] = o10.getScreenHeight();
    }

    public void B() {
        this.f37580j = false;
        this.f37575e.j();
    }

    public void D() {
        this.f37576f.V();
    }

    public void E() {
        this.f37576f.Y();
    }

    public void F(InterfaceC3288d0 interfaceC3288d0) {
        this.f37576f.W(interfaceC3288d0);
    }

    public void G() {
        this.f37576f.X();
    }

    public void H(View view, int i10, C3284b0 c3284b0) {
        synchronized (this.f37571a) {
            O oH = h();
            oH.setReactTag(i10);
            oH.setThemedContext(c3284b0);
            c3284b0.runOnNativeModulesQueueThread(new a(oH));
            this.f37576f.y(i10, view);
        }
    }

    public void I(int i10) {
        synchronized (this.f37571a) {
            this.f37574d.h(i10);
        }
    }

    public void J(int i10) {
        I(i10);
        this.f37576f.J(i10);
    }

    protected final void K(O o10) {
        L(o10);
        o10.dispose();
    }

    public int M(int i10) {
        if (this.f37574d.f(i10)) {
            return i10;
        }
        O oN = N(i10);
        if (oN != null) {
            return oN.getRootTag();
        }
        AbstractC7283a.I("ReactNative", "Warning : attempted to resolve a non-existent react shadow node. reactTag=" + i10);
        return 0;
    }

    public final O N(int i10) {
        return this.f37574d.c(i10);
    }

    protected final ViewManager O(String str) {
        return this.f37575e.i(str);
    }

    public void P(int i10, int i11) {
        this.f37576f.K(i10, i11);
    }

    public void Q(int i10, ReadableArray readableArray) {
        if (this.f37580j) {
            synchronized (this.f37571a) {
                try {
                    O oC = this.f37574d.c(i10);
                    for (int i11 = 0; i11 < readableArray.size(); i11++) {
                        O oC2 = this.f37574d.c(readableArray.getInt(i11));
                        if (oC2 == null) {
                            throw new C3299o("Trying to add unknown view tag: " + readableArray.getInt(i11));
                        }
                        oC.addChildAt(oC2, i11);
                    }
                    this.f37577g.k(oC, readableArray);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void R(int i10, boolean z10) {
        O oC = this.f37574d.c(i10);
        if (oC == null) {
            return;
        }
        while (oC.getNativeKind() == EnumC3307x.f37850c) {
            oC = oC.getParent();
        }
        this.f37576f.L(oC.getReactTag(), i10, z10);
    }

    public void S(boolean z10) {
        this.f37576f.M(z10);
    }

    public void T(D7.a aVar) {
        this.f37576f.Z(aVar);
    }

    public void U(int i10, Object obj) {
        O oC = this.f37574d.c(i10);
        if (oC != null) {
            oC.setLocalData(obj);
            n();
        } else {
            AbstractC7283a.I("ReactNative", "Attempt to set local data for view with unknown tag: " + i10);
        }
    }

    public void V(int i10, Q q10) {
        UiThreadUtil.assertOnUiThread();
        this.f37576f.S().B(i10, q10);
    }

    public void W(int i10, int i11, int i12, int i13, int i14) {
        O oC = this.f37574d.c(i10);
        if (oC == null) {
            AbstractC7283a.I("ReactNative", "Tried to update size of non-existent tag: " + i10);
            return;
        }
        oC.setPadding(4, i12);
        oC.setPadding(1, i11);
        oC.setPadding(5, i14);
        oC.setPadding(3, i13);
        n();
    }

    public void X(int i10, int i11, int i12) {
        O oC = this.f37574d.c(i10);
        if (oC != null) {
            oC.setStyleWidth(i11);
            oC.setStyleHeight(i12);
            n();
        } else {
            AbstractC7283a.I("ReactNative", "Tried to update size of non-existent tag: " + i10);
        }
    }

    public void Y(int i10, int i11, int i12) {
        O oC = this.f37574d.c(i10);
        if (oC != null) {
            Z(oC, i11, i12);
            return;
        }
        AbstractC7283a.I("ReactNative", "Tried to update non-existent root tag: " + i10);
    }

    public void Z(O o10, int i10, int i11) {
        o10.setMeasureSpecs(i10, i11);
    }

    public void a(InterfaceC3288d0 interfaceC3288d0) {
        this.f37576f.N(interfaceC3288d0);
    }

    public void a0(int i10, String str, ReadableMap readableMap) {
        if (this.f37580j) {
            if (this.f37575e.g(str) == null) {
                throw new C3299o("Got unknown view type: " + str);
            }
            O oC = this.f37574d.c(i10);
            if (oC == null) {
                throw new C3299o("Trying to update non-existent view with tag " + i10);
            }
            if (readableMap != null) {
                Q q10 = new Q(readableMap);
                oC.updateProperties(q10);
                t(oC, str, q10);
            }
        }
    }

    protected void b(O o10, float f10, float f11, List list) {
        if (o10.hasUpdates()) {
            if (o10.dispatchUpdatesWillChangeLayout(f10, f11) && o10.shouldNotifyOnLayout() && !this.f37574d.f(o10.getReactTag())) {
                list.add(o10);
            }
            Iterable iterableCalculateLayoutOnChildren = o10.calculateLayoutOnChildren();
            if (iterableCalculateLayoutOnChildren != null) {
                Iterator it = iterableCalculateLayoutOnChildren.iterator();
                while (it.hasNext()) {
                    b((O) it.next(), o10.getLayoutX() + f10, o10.getLayoutY() + f11, list);
                }
            }
            o10.dispatchUpdates(f10, f11, this.f37576f, this.f37577g);
            o10.markUpdateSeen();
            this.f37577g.p(o10);
        }
    }

    protected void b0() {
        U7.a.c(0L, "UIImplementation.updateViewHierarchy");
        for (int i10 = 0; i10 < this.f37574d.d(); i10++) {
            try {
                O oC = this.f37574d.c(this.f37574d.e(i10));
                if (oC.getWidthMeasureSpec() != null && oC.getHeightMeasureSpec() != null) {
                    U7.b.a(0L, "UIImplementation.notifyOnBeforeLayoutRecursive").a("rootTag", oC.getReactTag()).c();
                    try {
                        A(oC);
                        U7.a.i(0L);
                        d(oC);
                        U7.b.a(0L, "UIImplementation.applyUpdatesRecursive").a("rootTag", oC.getReactTag()).c();
                        try {
                            ArrayList<O> arrayList = new ArrayList();
                            b(oC, 0.0f, 0.0f, arrayList);
                            for (O o10 : arrayList) {
                                this.f37572b.d(A.d(-1, o10.getReactTag(), o10.getScreenX(), o10.getScreenY(), o10.getScreenWidth(), o10.getScreenHeight()));
                            }
                            U7.a.i(0L);
                        } finally {
                        }
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c0(int i10, int i11, Callback callback) {
        O oC = this.f37574d.c(i10);
        O oC2 = this.f37574d.c(i11);
        if (oC == null || oC2 == null) {
            callback.invoke(Boolean.FALSE);
        } else {
            callback.invoke(Boolean.valueOf(oC.isDescendantOf(oC2)));
        }
    }

    protected void d(O o10) {
        U7.b.a(0L, "cssRoot.calculateLayout").a("rootTag", o10.getReactTag()).c();
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            o10.calculateLayout(View.MeasureSpec.getMode(o10.getWidthMeasureSpec().intValue()) == 0 ? com.facebook.yoga.g.f38662b : View.MeasureSpec.getSize(r0), View.MeasureSpec.getMode(o10.getHeightMeasureSpec().intValue()) == 0 ? com.facebook.yoga.g.f38662b : View.MeasureSpec.getSize(r5));
            U7.a.i(0L);
            this.f37579i = SystemClock.uptimeMillis() - jUptimeMillis;
        } catch (Throwable th2) {
            U7.a.i(0L);
            this.f37579i = SystemClock.uptimeMillis() - jUptimeMillis;
            throw th2;
        }
    }

    public void f() {
        this.f37576f.A();
    }

    public void g(ReadableMap readableMap, Callback callback) {
        this.f37576f.B(readableMap, callback);
    }

    protected O h() {
        P p10 = new P();
        if (com.facebook.react.modules.i18nmanager.a.f().i(this.f37573c)) {
            p10.setLayoutDirection(com.facebook.yoga.h.RTL);
        }
        p10.setViewClassName("Root");
        return p10;
    }

    protected O i(String str) {
        return this.f37575e.g(str).createShadowNodeInstance(this.f37573c);
    }

    public void j(int i10, String str, int i11, ReadableMap readableMap) {
        Q q10;
        if (this.f37580j) {
            synchronized (this.f37571a) {
                try {
                    O oI = i(str);
                    O oC = this.f37574d.c(i11);
                    Q6.a.d(oC, "Root node with tag " + i11 + " doesn't exist");
                    oI.setReactTag(i10);
                    oI.setViewClassName(str);
                    oI.setRootTag(oC.getReactTag());
                    oI.setThemedContext(oC.getThemedContext());
                    this.f37574d.a(oI);
                    if (readableMap != null) {
                        q10 = new Q(readableMap);
                        oI.updateProperties(q10);
                    } else {
                        q10 = null;
                    }
                    s(oI, i11, q10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void k(int i10, int i11, ReadableArray readableArray) {
        if (e(i10, "dispatchViewManagerCommand: " + i11)) {
            this.f37576f.D(i10, i11, readableArray);
        }
    }

    public void l(int i10, String str, ReadableArray readableArray) {
        if (e(i10, "dispatchViewManagerCommand: " + str)) {
            this.f37576f.E(i10, str, readableArray);
        }
    }

    public void m(int i10) {
        U7.b.a(0L, "UIImplementation.dispatchViewUpdates").a("batchId", i10).c();
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            b0();
            this.f37577g.o();
            this.f37576f.z(i10, jUptimeMillis, this.f37579i);
        } finally {
            U7.a.i(0L);
        }
    }

    public void o(int i10, float f10, float f11, Callback callback) {
        this.f37576f.F(i10, f10, f11, callback);
    }

    public Map p() {
        return this.f37576f.T();
    }

    public int q() {
        return this.f37576f.S().o();
    }

    j0 r() {
        return this.f37576f;
    }

    protected void s(O o10, int i10, Q q10) {
        if (o10.isVirtual()) {
            return;
        }
        this.f37577g.g(o10, o10.getThemedContext(), q10);
    }

    protected void t(O o10, String str, Q q10) {
        if (o10.isVirtual()) {
            return;
        }
        this.f37577g.m(o10, str, q10);
    }

    public void u(int i10, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        int[] iArr;
        ReadableArray readableArray6 = readableArray;
        if (this.f37580j) {
            synchronized (this.f37571a) {
                try {
                    O oC = this.f37574d.c(i10);
                    int size = readableArray6 == null ? 0 : readableArray6.size();
                    int size2 = readableArray3 == null ? 0 : readableArray3.size();
                    int size3 = readableArray5 == null ? 0 : readableArray5.size();
                    if (size != 0 && (readableArray2 == null || size != readableArray2.size())) {
                        throw new C3299o("Size of moveFrom != size of moveTo!");
                    }
                    if (size2 != 0 && (readableArray4 == null || size2 != readableArray4.size())) {
                        throw new C3299o("Size of addChildTags != size of addAtIndices!");
                    }
                    int i11 = size + size2;
                    m0[] m0VarArr = new m0[i11];
                    int i12 = size + size3;
                    int[] iArr2 = new int[i12];
                    int[] iArr3 = new int[i12];
                    int[] iArr4 = new int[size3];
                    if (size > 0) {
                        Q6.a.c(readableArray6);
                        Q6.a.c(readableArray2);
                        iArr = iArr4;
                        int i13 = 0;
                        while (i13 < size) {
                            int i14 = size;
                            int i15 = readableArray6.getInt(i13);
                            int reactTag = oC.getChildAt(i15).getReactTag();
                            m0VarArr[i13] = new m0(reactTag, readableArray2.getInt(i13));
                            iArr2[i13] = i15;
                            iArr3[i13] = reactTag;
                            i13++;
                            readableArray6 = readableArray;
                            size = i14;
                            i12 = i12;
                        }
                    } else {
                        iArr = iArr4;
                    }
                    int i16 = size;
                    int i17 = i12;
                    if (size2 > 0) {
                        Q6.a.c(readableArray3);
                        Q6.a.c(readableArray4);
                        for (int i18 = 0; i18 < size2; i18++) {
                            m0VarArr[i16 + i18] = new m0(readableArray3.getInt(i18), readableArray4.getInt(i18));
                        }
                    }
                    if (size3 > 0) {
                        Q6.a.c(readableArray5);
                        for (int i19 = 0; i19 < size3; i19++) {
                            int i20 = readableArray5.getInt(i19);
                            int reactTag2 = oC.getChildAt(i20).getReactTag();
                            int i21 = i16 + i19;
                            iArr2[i21] = i20;
                            iArr3[i21] = reactTag2;
                            iArr[i19] = reactTag2;
                        }
                    }
                    Arrays.sort(m0VarArr, m0.f37792d);
                    Arrays.sort(iArr2);
                    int i22 = -1;
                    for (int i23 = i17 - 1; i23 >= 0; i23--) {
                        int i24 = iArr2[i23];
                        if (i24 == i22) {
                            throw new C3299o("Repeated indices in Removal list for view tag: " + i10);
                        }
                        oC.removeChildAt(i24);
                        i22 = iArr2[i23];
                    }
                    for (int i25 = 0; i25 < i11; i25++) {
                        m0 m0Var = m0VarArr[i25];
                        O oC2 = this.f37574d.c(m0Var.f37793a);
                        if (oC2 == null) {
                            throw new C3299o("Trying to add unknown view tag: " + m0Var.f37793a);
                        }
                        oC.addChildAt(oC2, m0Var.f37794b);
                    }
                    int[] iArr5 = iArr;
                    this.f37577g.i(oC, iArr2, iArr3, m0VarArr, iArr5);
                    for (int i26 = 0; i26 < size3; i26++) {
                        K(this.f37574d.c(iArr5[i26]));
                    }
                } finally {
                }
            }
        }
    }

    public void v(int i10, Callback callback) {
        if (this.f37580j) {
            this.f37576f.H(i10, callback);
        }
    }

    public void w(int i10, Callback callback) {
        if (this.f37580j) {
            this.f37576f.I(i10, callback);
        }
    }

    public void x(int i10, int i11, Callback callback, Callback callback2) {
        if (this.f37580j) {
            try {
                y(i10, i11, this.f37578h);
                callback2.invoke(Float.valueOf(B.g(this.f37578h[0])), Float.valueOf(B.g(this.f37578h[1])), Float.valueOf(B.g(this.f37578h[2])), Float.valueOf(B.g(this.f37578h[3])));
            } catch (C3299o e10) {
                callback.invoke(e10.getMessage());
            }
        }
    }

    protected e0(ReactApplicationContext reactApplicationContext, y0 y0Var, j0 j0Var, EventDispatcher eventDispatcher) {
        this.f37571a = new Object();
        Y y10 = new Y();
        this.f37574d = y10;
        this.f37578h = new int[4];
        this.f37579i = 0L;
        this.f37580j = true;
        this.f37573c = reactApplicationContext;
        this.f37575e = y0Var;
        this.f37576f = j0Var;
        this.f37577g = new C3309z(j0Var, y10);
        this.f37572b = eventDispatcher;
    }

    public void C() {
    }
}
