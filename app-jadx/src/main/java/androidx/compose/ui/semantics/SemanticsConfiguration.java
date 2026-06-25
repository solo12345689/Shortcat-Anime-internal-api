package androidx.compose.ui.semantics;

import R0.B;
import R0.C;
import R0.C2092a;
import Td.InterfaceC2158i;
import ie.InterfaceC5082a;
import java.util.Iterator;
import java.util.Map;
import je.InterfaceC5371a;
import kotlin.jvm.internal.AbstractC5504s;
import t.C6550P;
import t.Q;
import t.d0;
import t.e0;
import t.f0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class SemanticsConfiguration implements C, Iterable, InterfaceC5371a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6550P f27648a = d0.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f27649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Q f27650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f27651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f27652e;

    @Override // R0.C
    public void b(B b10, Object obj) {
        if ((obj instanceof C2092a) && e(b10)) {
            Object objE = this.f27648a.e(b10);
            AbstractC5504s.f(objE, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            C2092a c2092a = (C2092a) objE;
            C6550P c6550p = this.f27648a;
            C2092a c2092a2 = (C2092a) obj;
            String strB = c2092a2.b();
            if (strB == null) {
                strB = c2092a.b();
            }
            InterfaceC2158i interfaceC2158iA = c2092a2.a();
            if (interfaceC2158iA == null) {
                interfaceC2158iA = c2092a.a();
            }
            c6550p.x(b10, new C2092a(strB, interfaceC2158iA));
        } else {
            this.f27648a.x(b10, obj);
        }
        if (b10.a() != null) {
            if (this.f27650c == null) {
                this.f27650c = f0.b();
            }
            Q q10 = this.f27650c;
            if (q10 != null) {
                q10.h(b10);
            }
        }
    }

    public final void d(SemanticsConfiguration semanticsConfiguration) {
        int i10;
        if (semanticsConfiguration.f27651d) {
            this.f27651d = true;
        }
        if (semanticsConfiguration.f27652e) {
            this.f27652e = true;
        }
        C6550P c6550p = semanticsConfiguration.f27648a;
        Object[] objArr = c6550p.f60044b;
        Object[] objArr2 = c6550p.f60045c;
        long[] jArr = c6550p.f60043a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j10) < 128) {
                        int i15 = (i11 << 3) + i14;
                        Object obj = objArr[i15];
                        Object obj2 = objArr2[i15];
                        B b10 = (B) obj;
                        if (!this.f27648a.b(b10)) {
                            this.f27648a.x(b10, obj2);
                        } else if (obj2 instanceof C2092a) {
                            Object objE = this.f27648a.e(b10);
                            AbstractC5504s.f(objE, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            C2092a c2092a = (C2092a) objE;
                            C6550P c6550p2 = this.f27648a;
                            String strB = c2092a.b();
                            if (strB == null) {
                                strB = ((C2092a) obj2).b();
                            }
                            i10 = i12;
                            String str = strB;
                            InterfaceC2158i interfaceC2158iA = c2092a.a();
                            if (interfaceC2158iA == null) {
                                interfaceC2158iA = ((C2092a) obj2).a();
                            }
                            c6550p2.x(b10, new C2092a(str, interfaceC2158iA));
                        }
                        i10 = i12;
                    } else {
                        i10 = i12;
                    }
                    j10 >>= i10;
                    i14++;
                    i12 = i10;
                }
                if (i13 != i12) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    public final boolean e(B b10) {
        return this.f27648a.c(b10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemanticsConfiguration)) {
            return false;
        }
        SemanticsConfiguration semanticsConfiguration = (SemanticsConfiguration) obj;
        return AbstractC5504s.c(this.f27648a, semanticsConfiguration.f27648a) && this.f27651d == semanticsConfiguration.f27651d && this.f27652e == semanticsConfiguration.f27652e;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f() {
        /*
            r15 = this;
            t.P r0 = r15.f27648a
            java.lang.Object[] r1 = r0.f60044b
            java.lang.Object[] r2 = r0.f60045c
            long[] r0 = r0.f60043a
            int r3 = r0.length
            int r3 = r3 + (-2)
            r4 = 0
            if (r3 < 0) goto L50
            r5 = r4
        Lf:
            r6 = r0[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L4b
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L29:
            if (r10 >= r8) goto L49
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.32E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L45
            int r11 = r5 << 3
            int r11 = r11 + r10
            r12 = r1[r11]
            r11 = r2[r11]
            R0.B r12 = (R0.B) r12
            boolean r11 = r12.c()
            if (r11 == 0) goto L45
            r0 = 1
            return r0
        L45:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L29
        L49:
            if (r8 != r9) goto L50
        L4b:
            if (r5 == r3) goto L50
            int r5 = r5 + 1
            goto Lf
        L50:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.SemanticsConfiguration.f():boolean");
    }

    public int hashCode() {
        return (((this.f27648a.hashCode() * 31) + Boolean.hashCode(this.f27651d)) * 31) + Boolean.hashCode(this.f27652e);
    }

    public final SemanticsConfiguration i() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.f27651d = this.f27651d;
        semanticsConfiguration.f27652e = this.f27652e;
        semanticsConfiguration.f27648a.t(this.f27648a);
        return semanticsConfiguration;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Map mapA = this.f27649b;
        if (mapA == null) {
            mapA = this.f27648a.a();
            this.f27649b = mapA;
        }
        return mapA.entrySet().iterator();
    }

    public final Object l(B b10) {
        Object objE = this.f27648a.e(b10);
        if (objE != null) {
            return objE;
        }
        throw new IllegalStateException("Key not present: " + b10 + " - consider getOrElse or getOrNull");
    }

    public final e0 n() {
        return this.f27650c;
    }

    public final Object p(B b10, InterfaceC5082a interfaceC5082a) {
        Object objE = this.f27648a.e(b10);
        return objE == null ? interfaceC5082a.invoke() : objE;
    }

    public final Object r(B b10, InterfaceC5082a interfaceC5082a) {
        Object objE = this.f27648a.e(b10);
        return objE == null ? interfaceC5082a.invoke() : objE;
    }

    public final C6550P t() {
        return this.f27648a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007b A[PHI: r4
  0x007b: PHI (r4v4 java.lang.String) = (r4v3 java.lang.String), (r4v5 java.lang.String) binds: [B:12:0x0042, B:19:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r19 = this;
            r0 = r19
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.f27651d
            java.lang.String r3 = ", "
            java.lang.String r4 = ""
            if (r2 == 0) goto L18
            r1.append(r4)
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r4 = r3
        L18:
            boolean r2 = r0.f27652e
            if (r2 == 0) goto L25
            r1.append(r4)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r4 = r3
        L25:
            t.P r2 = r0.f27648a
            java.lang.Object[] r5 = r2.f60044b
            java.lang.Object[] r6 = r2.f60045c
            long[] r2 = r2.f60043a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L80
            r8 = 0
            r9 = r8
        L34:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L7b
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L4e:
            if (r14 >= r12) goto L79
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.32E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L75
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r5[r15]
            r15 = r6[r15]
            R0.B r16 = (R0.B) r16
            r1.append(r4)
            java.lang.String r4 = r16.b()
            r1.append(r4)
            java.lang.String r4 = " : "
            r1.append(r4)
            r1.append(r15)
            r4 = r3
        L75:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L4e
        L79:
            if (r12 != r13) goto L80
        L7b:
            if (r9 == r7) goto L80
            int r9 = r9 + 1
            goto L34
        L80:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
            java.lang.String r3 = androidx.compose.ui.platform.Y0.a(r0, r3)
            r2.append(r3)
            java.lang.String r3 = "{ "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " }"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.semantics.SemanticsConfiguration.toString():java.lang.String");
    }

    public final boolean u() {
        return this.f27652e;
    }

    public final boolean v() {
        return this.f27651d;
    }

    public final void w(SemanticsConfiguration semanticsConfiguration) {
        C6550P c6550p = semanticsConfiguration.f27648a;
        Object[] objArr = c6550p.f60044b;
        Object[] objArr2 = c6550p.f60045c;
        long[] jArr = c6550p.f60043a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        Object obj2 = objArr2[i13];
                        B b10 = (B) obj;
                        Object objE = this.f27648a.e(b10);
                        AbstractC5504s.f(b10, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object objD = b10.d(objE, obj2);
                        if (objD != null) {
                            this.f27648a.x(b10, objD);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void y(boolean z10) {
        this.f27652e = z10;
    }

    public final void z(boolean z10) {
        this.f27651d = z10;
    }
}
