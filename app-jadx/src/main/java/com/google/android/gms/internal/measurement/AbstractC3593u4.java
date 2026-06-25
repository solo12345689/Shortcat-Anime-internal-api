package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u4 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3593u4 implements E5 {
    protected int zza = 0;

    protected static void g(Iterable iterable, List list) {
        AbstractC3584t4.i(iterable, list);
    }

    public final byte[] b() {
        try {
            int iA = a();
            byte[] bArr = new byte[iA];
            int i10 = N4.f39512d;
            L4 l42 = new L4(bArr, 0, iA);
            c(l42);
            l42.e();
            return bArr;
        } catch (IOException e10) {
            String name = getClass().getName();
            StringBuilder sb2 = new StringBuilder(name.length() + 72);
            sb2.append("Serializing ");
            sb2.append(name);
            sb2.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    abstract int f(P5 p52);
}
