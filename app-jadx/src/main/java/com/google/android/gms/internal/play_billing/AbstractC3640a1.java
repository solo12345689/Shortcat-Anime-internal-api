package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a1 */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3640a1 implements InterfaceC3666f2 {
    protected int zza = 0;

    protected static void g(Iterable iterable, List list) {
        byte[] bArr = P1.f40250b;
        int size = ((Collection) iterable).size();
        if (list instanceof ArrayList) {
            ((ArrayList) list).ensureCapacity(list.size() + size);
        } else if (list instanceof C3706n2) {
            ((C3706n2) list).d(list.size() + size);
        }
        int size2 = list.size();
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i10 = 0; i10 < size3; i10++) {
            Object obj = list2.get(i10);
            if (obj == null) {
                String str = "Element at index " + (list.size() - size2) + " is null.";
                int size4 = list.size();
                while (true) {
                    size4--;
                    if (size4 < size2) {
                        throw new NullPointerException(str);
                    }
                    list.remove(size4);
                }
            } else {
                list.add(obj);
            }
        }
    }

    public final byte[] b() {
        try {
            int iC = c();
            byte[] bArr = new byte[iC];
            int i10 = AbstractC3744v1.f40576d;
            C3729s1 c3729s1 = new C3729s1(bArr, 0, iC);
            d(c3729s1);
            c3729s1.e();
            return bArr;
        } catch (IOException e10) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e10);
        }
    }

    abstract int e(InterfaceC3716p2 interfaceC3716p2);
}
