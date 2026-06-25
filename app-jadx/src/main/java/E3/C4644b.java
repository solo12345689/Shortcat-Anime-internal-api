package e3;

import d3.c;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import q2.C6078J;
import t2.C6608H;

/* JADX INFO: renamed from: e3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4644b extends c {
    private static C6078J c(C6608H c6608h) {
        c6608h.r(12);
        int iD = (c6608h.d() + c6608h.h(12)) - 4;
        c6608h.r(44);
        c6608h.s(c6608h.h(12));
        c6608h.r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strL = null;
            if (c6608h.d() >= iD) {
                break;
            }
            c6608h.r(48);
            int iH = c6608h.h(8);
            c6608h.r(4);
            int iD2 = c6608h.d() + c6608h.h(12);
            String strL2 = null;
            while (c6608h.d() < iD2) {
                int iH2 = c6608h.h(8);
                int iH3 = c6608h.h(8);
                int iD3 = c6608h.d() + iH3;
                if (iH2 == 2) {
                    int iH4 = c6608h.h(16);
                    c6608h.r(8);
                    if (iH4 == 3) {
                        while (c6608h.d() < iD3) {
                            strL = c6608h.l(c6608h.h(8), StandardCharsets.US_ASCII);
                            int iH5 = c6608h.h(8);
                            for (int i10 = 0; i10 < iH5; i10++) {
                                c6608h.s(c6608h.h(8));
                            }
                        }
                    }
                } else if (iH2 == 21) {
                    strL2 = c6608h.l(iH3, StandardCharsets.US_ASCII);
                }
                c6608h.p(iD3 * 8);
            }
            c6608h.p(iD2 * 8);
            if (strL != null && strL2 != null) {
                arrayList.add(new C4643a(iH, strL + strL2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C6078J(arrayList);
    }

    @Override // d3.c
    protected C6078J b(d3.b bVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new C6608H(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
