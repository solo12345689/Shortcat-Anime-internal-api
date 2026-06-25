package r3;

import java.util.List;
import t2.InterfaceC6627n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    private static int a(j jVar, long j10) {
        if (j10 == -9223372036854775807L) {
            return 0;
        }
        int iA = jVar.a(j10);
        if (iA == -1) {
            iA = jVar.h();
        }
        return (iA <= 0 || jVar.c(iA + (-1)) != j10) ? iA : iA - 1;
    }

    private static void b(j jVar, int i10, InterfaceC6627n interfaceC6627n) {
        long jC = jVar.c(i10);
        List listB = jVar.b(jC);
        if (listB.isEmpty()) {
            return;
        }
        if (i10 == jVar.h() - 1) {
            throw new IllegalStateException();
        }
        long jC2 = jVar.c(i10 + 1) - jVar.c(i10);
        if (jC2 > 0) {
            interfaceC6627n.accept(new d(listB, jC, jC2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(r3.j r11, r3.r.b r12, t2.InterfaceC6627n r13) {
        /*
            long r0 = r12.f58523a
            int r0 = a(r11, r0)
            long r1 = r12.f58523a
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L3a
            int r1 = r11.h()
            if (r0 >= r1) goto L3a
            long r3 = r12.f58523a
            java.util.List r6 = r11.b(r3)
            long r3 = r11.c(r0)
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L3a
            long r7 = r12.f58523a
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 >= 0) goto L3a
            r3.d r5 = new r3.d
            long r9 = r3 - r7
            r5.<init>(r6, r7, r9)
            r13.accept(r5)
            r1 = 1
            goto L3b
        L3a:
            r1 = r2
        L3b:
            r3 = r0
        L3c:
            int r4 = r11.h()
            if (r3 >= r4) goto L48
            b(r11, r3, r13)
            int r3 = r3 + 1
            goto L3c
        L48:
            boolean r3 = r12.f58524b
            if (r3 == 0) goto L74
            if (r1 == 0) goto L50
            int r0 = r0 + (-1)
        L50:
            if (r2 >= r0) goto L58
            b(r11, r2, r13)
            int r2 = r2 + 1
            goto L50
        L58:
            if (r1 == 0) goto L74
            r3.d r3 = new r3.d
            long r1 = r12.f58523a
            java.util.List r4 = r11.b(r1)
            long r5 = r11.c(r0)
            long r1 = r12.f58523a
            long r11 = r11.c(r0)
            long r7 = r1 - r11
            r3.<init>(r4, r5, r7)
            r13.accept(r3)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.h.c(r3.j, r3.r$b, t2.n):void");
    }
}
