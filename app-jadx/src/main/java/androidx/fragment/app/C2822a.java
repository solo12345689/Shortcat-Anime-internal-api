package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.K;
import androidx.fragment.app.U;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.a */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
final class C2822a extends U implements K.p {

    /* JADX INFO: renamed from: t */
    final K f29920t;

    /* JADX INFO: renamed from: u */
    boolean f29921u;

    /* JADX INFO: renamed from: v */
    int f29922v;

    /* JADX INFO: renamed from: w */
    boolean f29923w;

    C2822a(K k10) {
        super(k10.B0(), k10.D0() != null ? k10.D0().f().getClassLoader() : null);
        this.f29922v = -1;
        this.f29923w = false;
        this.f29920t = k10;
    }

    public void A(String str, PrintWriter printWriter, boolean z10) {
        String str2;
        if (z10) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f29869k);
            printWriter.print(" mIndex=");
            printWriter.print(this.f29922v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f29921u);
            if (this.f29866h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f29866h));
            }
            if (this.f29862d != 0 || this.f29863e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f29862d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f29863e));
            }
            if (this.f29864f != 0 || this.f29865g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f29864f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f29865g));
            }
            if (this.f29870l != 0 || this.f29871m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f29870l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f29871m);
            }
            if (this.f29872n != 0 || this.f29873o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f29872n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f29873o);
            }
        }
        if (this.f29861c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f29861c.size();
        for (int i10 = 0; i10 < size; i10++) {
            U.a aVar = (U.a) this.f29861c.get(i10);
            switch (aVar.f29878a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f29878a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f29879b);
            if (z10) {
                if (aVar.f29881d != 0 || aVar.f29882e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f29881d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f29882e));
                }
                if (aVar.f29883f != 0 || aVar.f29884g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f29883f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f29884g));
                }
            }
        }
    }

    void B() {
        int size = this.f29861c.size();
        for (int i10 = 0; i10 < size; i10++) {
            U.a aVar = (U.a) this.f29861c.get(i10);
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = aVar.f29879b;
            if (abstractComponentCallbacksC2838q != null) {
                abstractComponentCallbacksC2838q.mBeingSaved = this.f29923w;
                abstractComponentCallbacksC2838q.setPopDirection(false);
                abstractComponentCallbacksC2838q.setNextTransition(this.f29866h);
                abstractComponentCallbacksC2838q.setSharedElementNames(this.f29874p, this.f29875q);
            }
            switch (aVar.f29878a) {
                case 1:
                    abstractComponentCallbacksC2838q.setAnimations(aVar.f29881d, aVar.f29882e, aVar.f29883f, aVar.f29884g);
                    this.f29920t.x1(abstractComponentCallbacksC2838q, false);
                    this.f29920t.l(abstractComponentCallbacksC2838q);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f29878a);
                case 3:
                    abstractComponentCallbacksC2838q.setAnimations(aVar.f29881d, aVar.f29882e, aVar.f29883f, aVar.f29884g);
                    this.f29920t.o1(abstractComponentCallbacksC2838q);
                    break;
                case 4:
                    abstractComponentCallbacksC2838q.setAnimations(aVar.f29881d, aVar.f29882e, aVar.f29883f, aVar.f29884g);
                    this.f29920t.N0(abstractComponentCallbacksC2838q);
                    break;
                case 5:
                    abstractComponentCallbacksC2838q.setAnimations(aVar.f29881d, aVar.f29882e, aVar.f29883f, aVar.f29884g);
                    this.f29920t.x1(abstractComponentCallbacksC2838q, false);
                    this.f29920t.D1(abstractComponentCallbacksC2838q);
                    break;
                case 6:
                    abstractComponentCallbacksC2838q.setAnimations(aVar.f29881d, aVar.f29882e, aVar.f29883f, aVar.f29884g);
                    this.f29920t.D(abstractComponentCallbacksC2838q);
                    break;
                case 7:
                    abstractComponentCallbacksC2838q.setAnimations(aVar.f29881d, aVar.f29882e, aVar.f29883f, aVar.f29884g);
                    this.f29920t.x1(abstractComponentCallbacksC2838q, false);
                    this.f29920t.r(abstractComponentCallbacksC2838q);
                    break;
                case 8:
                    this.f29920t.B1(abstractComponentCallbacksC2838q);
                    break;
                case 9:
                    this.f29920t.B1(null);
                    break;
                case 10:
                    aVar.f29885h = abstractComponentCallbacksC2838q.mMaxState;
                    this.f29920t.A1(abstractComponentCallbacksC2838q, aVar.f29886i);
                    break;
            }
        }
    }

    void C() {
        for (int size = this.f29861c.size() - 1; size >= 0; size--) {
            U.a aVar = (U.a) this.f29861c.get(size);
            AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = aVar.f29879b;
            if (abstractComponentCallbacksC2838q != null) {
                abstractComponentCallbacksC2838q.mBeingSaved = this.f29923w;
                abstractComponentCallbacksC2838q.setPopDirection(true);
                abstractComponentCallbacksC2838q.setNextTransition(K.u1(this.f29866h));
                abstractComponentCallbacksC2838q.setSharedElementNames(this.f29875q, this.f29874p);
            }
            switch (aVar.f29878a) {
                case 1:
                    abstractComponentCallbacksC2838q.setAnimations(aVar.f29881d, aVar.f29882e, aVar.f29883f, aVar.f29884g);
                    this.f29920t.x1(abstractComponentCallbacksC2838q, true);
                    this.f29920t.o1(abstractComponentCallbacksC2838q);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f29878a);
                case 3:
                    abstractComponentCallbacksC2838q.setAnimations(aVar.f29881d, aVar.f29882e, aVar.f29883f, aVar.f29884g);
                    this.f29920t.l(abstractComponentCallbacksC2838q);
                    break;
                case 4:
                    abstractComponentCallbacksC2838q.setAnimations(aVar.f29881d, aVar.f29882e, aVar.f29883f, aVar.f29884g);
                    this.f29920t.D1(abstractComponentCallbacksC2838q);
                    break;
                case 5:
                    abstractComponentCallbacksC2838q.setAnimations(aVar.f29881d, aVar.f29882e, aVar.f29883f, aVar.f29884g);
                    this.f29920t.x1(abstractComponentCallbacksC2838q, true);
                    this.f29920t.N0(abstractComponentCallbacksC2838q);
                    break;
                case 6:
                    abstractComponentCallbacksC2838q.setAnimations(aVar.f29881d, aVar.f29882e, aVar.f29883f, aVar.f29884g);
                    this.f29920t.r(abstractComponentCallbacksC2838q);
                    break;
                case 7:
                    abstractComponentCallbacksC2838q.setAnimations(aVar.f29881d, aVar.f29882e, aVar.f29883f, aVar.f29884g);
                    this.f29920t.x1(abstractComponentCallbacksC2838q, true);
                    this.f29920t.D(abstractComponentCallbacksC2838q);
                    break;
                case 8:
                    this.f29920t.B1(null);
                    break;
                case 9:
                    this.f29920t.B1(abstractComponentCallbacksC2838q);
                    break;
                case 10:
                    aVar.f29886i = abstractComponentCallbacksC2838q.mMaxState;
                    this.f29920t.A1(abstractComponentCallbacksC2838q, aVar.f29885h);
                    break;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.AbstractComponentCallbacksC2838q D(java.util.ArrayList r17, androidx.fragment.app.AbstractComponentCallbacksC2838q r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = 0
        L7:
            java.util.ArrayList r5 = r0.f29861c
            int r5 = r5.size()
            if (r4 >= r5) goto Lbe
            java.util.ArrayList r5 = r0.f29861c
            java.lang.Object r5 = r5.get(r4)
            androidx.fragment.app.U$a r5 = (androidx.fragment.app.U.a) r5
            int r6 = r5.f29878a
            r7 = 1
            if (r6 == r7) goto Lb6
            r8 = 2
            r9 = 0
            r10 = 3
            r11 = 9
            if (r6 == r8) goto L5a
            if (r6 == r10) goto L43
            r8 = 6
            if (r6 == r8) goto L43
            r8 = 7
            if (r6 == r8) goto Lb6
            r8 = 8
            if (r6 == r8) goto L31
            goto Lbb
        L31:
            java.util.ArrayList r6 = r0.f29861c
            androidx.fragment.app.U$a r8 = new androidx.fragment.app.U$a
            r8.<init>(r11, r3, r7)
            r6.add(r4, r8)
            r5.f29880c = r7
            int r4 = r4 + 1
            androidx.fragment.app.q r3 = r5.f29879b
            goto Lbb
        L43:
            androidx.fragment.app.q r6 = r5.f29879b
            r1.remove(r6)
            androidx.fragment.app.q r5 = r5.f29879b
            if (r5 != r3) goto Lbb
            java.util.ArrayList r3 = r0.f29861c
            androidx.fragment.app.U$a r6 = new androidx.fragment.app.U$a
            r6.<init>(r11, r5)
            r3.add(r4, r6)
            int r4 = r4 + 1
            r3 = r9
            goto Lbb
        L5a:
            androidx.fragment.app.q r6 = r5.f29879b
            int r8 = r6.mContainerId
            int r12 = r1.size()
            int r12 = r12 - r7
            r13 = 0
        L64:
            if (r12 < 0) goto La4
            java.lang.Object r14 = r1.get(r12)
            androidx.fragment.app.q r14 = (androidx.fragment.app.AbstractComponentCallbacksC2838q) r14
            int r15 = r14.mContainerId
            if (r15 != r8) goto La1
            if (r14 != r6) goto L74
            r13 = r7
            goto La1
        L74:
            if (r14 != r3) goto L83
            java.util.ArrayList r3 = r0.f29861c
            androidx.fragment.app.U$a r15 = new androidx.fragment.app.U$a
            r15.<init>(r11, r14, r7)
            r3.add(r4, r15)
            int r4 = r4 + 1
            r3 = r9
        L83:
            androidx.fragment.app.U$a r15 = new androidx.fragment.app.U$a
            r15.<init>(r10, r14, r7)
            int r2 = r5.f29881d
            r15.f29881d = r2
            int r2 = r5.f29883f
            r15.f29883f = r2
            int r2 = r5.f29882e
            r15.f29882e = r2
            int r2 = r5.f29884g
            r15.f29884g = r2
            java.util.ArrayList r2 = r0.f29861c
            r2.add(r4, r15)
            r1.remove(r14)
            int r4 = r4 + r7
        La1:
            int r12 = r12 + (-1)
            goto L64
        La4:
            if (r13 == 0) goto Lae
            java.util.ArrayList r2 = r0.f29861c
            r2.remove(r4)
            int r4 = r4 + (-1)
            goto Lbb
        Lae:
            r5.f29878a = r7
            r5.f29880c = r7
            r1.add(r6)
            goto Lbb
        Lb6:
            androidx.fragment.app.q r2 = r5.f29879b
            r1.add(r2)
        Lbb:
            int r4 = r4 + r7
            goto L7
        Lbe:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C2822a.D(java.util.ArrayList, androidx.fragment.app.q):androidx.fragment.app.q");
    }

    public String E() {
        return this.f29869k;
    }

    public void F() {
        if (this.f29877s != null) {
            for (int i10 = 0; i10 < this.f29877s.size(); i10++) {
                ((Runnable) this.f29877s.get(i10)).run();
            }
            this.f29877s = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.fragment.app.AbstractComponentCallbacksC2838q G(java.util.ArrayList r6, androidx.fragment.app.AbstractComponentCallbacksC2838q r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.f29861c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L35
            java.util.ArrayList r2 = r5.f29861c
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.U$a r2 = (androidx.fragment.app.U.a) r2
            int r3 = r2.f29878a
            if (r3 == r1) goto L2d
            r4 = 3
            if (r3 == r4) goto L27
            switch(r3) {
                case 6: goto L27;
                case 7: goto L2d;
                case 8: goto L25;
                case 9: goto L22;
                case 10: goto L1d;
                default: goto L1c;
            }
        L1c:
            goto L32
        L1d:
            androidx.lifecycle.k$b r3 = r2.f29885h
            r2.f29886i = r3
            goto L32
        L22:
            androidx.fragment.app.q r7 = r2.f29879b
            goto L32
        L25:
            r7 = 0
            goto L32
        L27:
            androidx.fragment.app.q r2 = r2.f29879b
            r6.add(r2)
            goto L32
        L2d:
            androidx.fragment.app.q r2 = r2.f29879b
            r6.remove(r2)
        L32:
            int r0 = r0 + (-1)
            goto L8
        L35:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C2822a.G(java.util.ArrayList, androidx.fragment.app.q):androidx.fragment.app.q");
    }

    @Override // androidx.fragment.app.K.p
    public boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (K.Q0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f29867i) {
            return true;
        }
        this.f29920t.k(this);
        return true;
    }

    @Override // androidx.fragment.app.U
    public int h() {
        return y(false, true);
    }

    @Override // androidx.fragment.app.U
    public int i() {
        return y(true, true);
    }

    @Override // androidx.fragment.app.U
    public void j() {
        l();
        this.f29920t.i0(this, false);
    }

    @Override // androidx.fragment.app.U
    public void k() {
        l();
        this.f29920t.i0(this, true);
    }

    @Override // androidx.fragment.app.U
    void m(int i10, AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q, String str, int i11) {
        super.m(i10, abstractComponentCallbacksC2838q, str, i11);
        abstractComponentCallbacksC2838q.mFragmentManager = this.f29920t;
    }

    @Override // androidx.fragment.app.U
    public U n(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        K k10 = abstractComponentCallbacksC2838q.mFragmentManager;
        if (k10 == null || k10 == this.f29920t) {
            return super.n(abstractComponentCallbacksC2838q);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC2838q.toString() + " is already attached to a FragmentManager.");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f29922v >= 0) {
            sb2.append(" #");
            sb2.append(this.f29922v);
        }
        if (this.f29869k != null) {
            sb2.append(" ");
            sb2.append(this.f29869k);
        }
        sb2.append("}");
        return sb2.toString();
    }

    @Override // androidx.fragment.app.U
    public U u(AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q) {
        K k10;
        if (abstractComponentCallbacksC2838q == null || (k10 = abstractComponentCallbacksC2838q.mFragmentManager) == null || k10 == this.f29920t) {
            return super.u(abstractComponentCallbacksC2838q);
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC2838q.toString() + " is already attached to a FragmentManager.");
    }

    void w(int i10) {
        if (this.f29867i) {
            if (K.Q0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            int size = this.f29861c.size();
            for (int i11 = 0; i11 < size; i11++) {
                U.a aVar = (U.a) this.f29861c.get(i11);
                AbstractComponentCallbacksC2838q abstractComponentCallbacksC2838q = aVar.f29879b;
                if (abstractComponentCallbacksC2838q != null) {
                    abstractComponentCallbacksC2838q.mBackStackNesting += i10;
                    if (K.Q0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f29879b + " to " + aVar.f29879b.mBackStackNesting);
                    }
                }
            }
        }
    }

    void x() {
        int size = this.f29861c.size() - 1;
        while (size >= 0) {
            U.a aVar = (U.a) this.f29861c.get(size);
            if (aVar.f29880c) {
                if (aVar.f29878a == 8) {
                    aVar.f29880c = false;
                    this.f29861c.remove(size - 1);
                    size--;
                } else {
                    int i10 = aVar.f29879b.mContainerId;
                    aVar.f29878a = 2;
                    aVar.f29880c = false;
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        U.a aVar2 = (U.a) this.f29861c.get(i11);
                        if (aVar2.f29880c && aVar2.f29879b.mContainerId == i10) {
                            this.f29861c.remove(i11);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    int y(boolean z10, boolean z11) {
        if (this.f29921u) {
            throw new IllegalStateException("commit already called");
        }
        if (K.Q0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new Z("FragmentManager"));
            z("  ", printWriter);
            printWriter.close();
        }
        this.f29921u = true;
        if (this.f29867i) {
            this.f29922v = this.f29920t.p();
        } else {
            this.f29922v = -1;
        }
        if (z11) {
            this.f29920t.f0(this, z10);
        }
        return this.f29922v;
    }

    public void z(String str, PrintWriter printWriter) {
        A(str, printWriter, true);
    }
}
