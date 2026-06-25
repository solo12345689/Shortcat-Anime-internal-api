package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3584t4 implements D5 {
    private static void f(List list, int i10) {
        int size = list.size() - i10;
        StringBuilder sb2 = new StringBuilder(String.valueOf(size).length() + 26);
        sb2.append("Element at index ");
        sb2.append(size);
        sb2.append(" is null.");
        String string = sb2.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i10) {
                throw new NullPointerException(string);
            }
            list.remove(size2);
        }
    }

    protected static void i(Iterable iterable, List list) {
        byte[] bArr = AbstractC3505k5.f39813b;
        iterable.getClass();
        if (iterable instanceof InterfaceC3541o5) {
            List listZza = ((InterfaceC3541o5) iterable).zza();
            android.support.v4.media.session.b.a(list);
            list.size();
            Iterator it = listZza.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof I4) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr2 = (byte[]) next;
                I4.l(bArr2, 0, bArr2.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof L5) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof N5) {
                ((N5) list).d(list.size() + size);
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    f(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i10 = 0; i10 < size3; i10++) {
            Object obj2 = list2.get(i10);
            if (obj2 == null) {
                f(list, size2);
            }
            list.add(obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.D5
    public final /* synthetic */ D5 A1(byte[] bArr, R4 r42) {
        return h(bArr, 0, bArr.length, r42);
    }

    @Override // com.google.android.gms.internal.measurement.D5
    public final /* synthetic */ D5 B0(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    public abstract AbstractC3584t4 g(byte[] bArr, int i10, int i11);

    public abstract AbstractC3584t4 h(byte[] bArr, int i10, int i11, R4 r42);
}
