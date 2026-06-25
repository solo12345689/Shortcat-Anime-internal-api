package A3;

import java.util.ArrayList;
import java.util.Collections;
import r3.r;
import s2.C6403a;
import t2.AbstractC6614a;
import t2.C6609I;
import t2.InterfaceC6627n;
import t2.a0;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a */
    private final C6609I f214a = new C6609I();

    private static C6403a d(C6609I c6609i, int i10) {
        CharSequence charSequenceR = null;
        C6403a.b bVarP = null;
        while (i10 > 0) {
            AbstractC6614a.b(i10 >= 8, "Incomplete vtt cue box header found.");
            int iV = c6609i.v();
            int iV2 = c6609i.v();
            int i11 = iV - 8;
            String strK = a0.K(c6609i.f(), c6609i.g(), i11);
            c6609i.c0(i11);
            i10 = (i10 - 8) - i11;
            if (iV2 == 1937011815) {
                bVarP = e.p(strK);
            } else if (iV2 == 1885436268) {
                charSequenceR = e.r(null, strK.trim(), Collections.EMPTY_LIST);
            }
        }
        if (charSequenceR == null) {
            charSequenceR = "";
        }
        return bVarP != null ? bVarP.o(charSequenceR).a() : e.m(charSequenceR);
    }

    @Override // r3.r
    public void a(byte[] bArr, int i10, int i11, r.b bVar, InterfaceC6627n interfaceC6627n) {
        this.f214a.Z(bArr, i11 + i10);
        this.f214a.b0(i10);
        ArrayList arrayList = new ArrayList();
        while (this.f214a.a() > 0) {
            AbstractC6614a.b(this.f214a.a() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int iV = this.f214a.v();
            if (this.f214a.v() == 1987343459) {
                arrayList.add(d(this.f214a, iV - 8));
            } else {
                this.f214a.c0(iV - 8);
            }
        }
        interfaceC6627n.accept(new r3.d(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // r3.r
    public int c() {
        return 2;
    }
}
