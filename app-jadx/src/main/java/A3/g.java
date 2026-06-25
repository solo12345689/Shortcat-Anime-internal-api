package A3;

import android.text.TextUtils;
import java.util.ArrayList;
import q2.C6080L;
import r3.r;
import t2.C6609I;
import t2.InterfaceC6627n;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6609I f263a = new C6609I();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f264b = new b();

    private static int d(C6609I c6609i) {
        int i10 = -1;
        int iG = 0;
        while (i10 == -1) {
            iG = c6609i.g();
            String strX = c6609i.x();
            i10 = strX == null ? 0 : "STYLE".equals(strX) ? 2 : strX.startsWith("NOTE") ? 1 : 3;
        }
        c6609i.b0(iG);
        return i10;
    }

    private static void e(C6609I c6609i) {
        while (!TextUtils.isEmpty(c6609i.x())) {
        }
    }

    @Override // r3.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, InterfaceC6627n interfaceC6627n) {
        d dVarO;
        this.f263a.Z(bArr, i11 + i10);
        this.f263a.b0(i10);
        ArrayList arrayList = new ArrayList();
        try {
            h.e(this.f263a);
            while (!TextUtils.isEmpty(this.f263a.x())) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int iD = d(this.f263a);
                if (iD == 0) {
                    r3.h.c(new j(arrayList2), bVar, interfaceC6627n);
                    return;
                }
                if (iD == 1) {
                    e(this.f263a);
                } else if (iD == 2) {
                    if (!arrayList2.isEmpty()) {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                    this.f263a.x();
                    arrayList.addAll(this.f264b.d(this.f263a));
                } else if (iD == 3 && (dVarO = e.o(this.f263a, arrayList)) != null) {
                    arrayList2.add(dVarO);
                }
            }
        } catch (C6080L e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // r3.r
    public int c() {
        return 1;
    }
}
