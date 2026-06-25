package R0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    /* JADX WARN: Removed duplicated region for block: B:92:0x0075 A[LOOP:0: B:61:0x0016->B:92:0x0075, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x007a A[EDGE_INSN: B:99:0x007a->B:93:0x007a BREAK  A[LOOP:0: B:61:0x0016->B:92:0x0075], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final R0.s a(K0.J r10, boolean r11) {
        /*
            K0.c0 r0 = r10.t0()
            r1 = 8
            int r1 = K0.AbstractC1789g0.a(r1)
            int r2 = K0.C1781c0.c(r0)
            r2 = r2 & r1
            r3 = 0
            if (r2 == 0) goto L7a
            androidx.compose.ui.e$c r0 = r0.k()
        L16:
            if (r0 == 0) goto L7a
            int r2 = r0.getKindSet$ui_release()
            r2 = r2 & r1
            if (r2 == 0) goto L6e
            r2 = r0
            r4 = r3
        L21:
            if (r2 == 0) goto L6e
            boolean r5 = r2 instanceof K0.A0
            if (r5 == 0) goto L29
            r3 = r2
            goto L7a
        L29:
            int r5 = r2.getKindSet$ui_release()
            r5 = r5 & r1
            if (r5 == 0) goto L69
            boolean r5 = r2 instanceof K0.AbstractC1800m
            if (r5 == 0) goto L69
            r5 = r2
            K0.m r5 = (K0.AbstractC1800m) r5
            androidx.compose.ui.e$c r5 = r5.F1()
            r6 = 0
            r7 = r6
        L3d:
            r8 = 1
            if (r5 == 0) goto L66
            int r9 = r5.getKindSet$ui_release()
            r9 = r9 & r1
            if (r9 == 0) goto L61
            int r7 = r7 + 1
            if (r7 != r8) goto L4d
            r2 = r5
            goto L61
        L4d:
            if (r4 != 0) goto L58
            a0.c r4 = new a0.c
            r8 = 16
            androidx.compose.ui.e$c[] r8 = new androidx.compose.ui.e.c[r8]
            r4.<init>(r8, r6)
        L58:
            if (r2 == 0) goto L5e
            r4.c(r2)
            r2 = r3
        L5e:
            r4.c(r5)
        L61:
            androidx.compose.ui.e$c r5 = r5.getChild$ui_release()
            goto L3d
        L66:
            if (r7 != r8) goto L69
            goto L21
        L69:
            androidx.compose.ui.e$c r2 = K0.AbstractC1796k.b(r4)
            goto L21
        L6e:
            int r2 = r0.getAggregateChildKindSet$ui_release()
            r2 = r2 & r1
            if (r2 == 0) goto L7a
            androidx.compose.ui.e$c r0 = r0.getChild$ui_release()
            goto L16
        L7a:
            kotlin.jvm.internal.AbstractC5504s.e(r3)
            K0.A0 r3 = (K0.A0) r3
            androidx.compose.ui.e$c r0 = r3.getNode()
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = r10.e()
            if (r1 != 0) goto L8e
            androidx.compose.ui.semantics.SemanticsConfiguration r1 = new androidx.compose.ui.semantics.SemanticsConfiguration
            r1.<init>()
        L8e:
            R0.s r2 = new R0.s
            r2.<init>(r0, r11, r10, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.t.a(K0.J, boolean):R0.s");
    }

    public static final int e(s sVar) {
        return sVar.q() + 2000000000;
    }

    public static final C2099h f(s sVar) {
        return (C2099h) m.a(sVar.y(), x.f15043a.D());
    }

    public static final int g(s sVar) {
        return sVar.q() + 1000000000;
    }
}
