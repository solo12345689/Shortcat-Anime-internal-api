package com.google.android.gms.internal.measurement;

import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3454f implements Iterable, InterfaceC3553q, InterfaceC3517m {

    /* JADX INFO: renamed from: a */
    final SortedMap f39751a;

    /* JADX INFO: renamed from: b */
    final Map f39752b;

    public C3454f() {
        this.f39751a = new TreeMap();
        this.f39752b = new TreeMap();
    }

    public final void A(int i10) {
        SortedMap sortedMap = this.f39751a;
        int iIntValue = ((Integer) sortedMap.lastKey()).intValue();
        if (i10 > iIntValue || i10 < 0) {
            return;
        }
        sortedMap.remove(Integer.valueOf(i10));
        if (i10 == iIntValue) {
            int i11 = i10 - 1;
            Integer numValueOf = Integer.valueOf(i11);
            if (sortedMap.containsKey(numValueOf) || i11 < 0) {
                return;
            }
            sortedMap.put(numValueOf, InterfaceC3553q.f39929W);
            return;
        }
        while (true) {
            i10++;
            if (i10 > ((Integer) sortedMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i10);
            InterfaceC3553q interfaceC3553q = (InterfaceC3553q) sortedMap.get(numValueOf2);
            if (interfaceC3553q != null) {
                sortedMap.put(Integer.valueOf(i10 - 1), interfaceC3553q);
                sortedMap.remove(numValueOf2);
            }
        }
    }

    public final String B(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (!this.f39751a.isEmpty()) {
            int i10 = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i10 >= t()) {
                    break;
                }
                InterfaceC3553q interfaceC3553qV = v(i10);
                sb2.append(str2);
                if (!(interfaceC3553qV instanceof C3597v) && !(interfaceC3553qV instanceof C3535o)) {
                    sb2.append(interfaceC3553qV.k());
                }
                i10++;
            }
            sb2.delete(0, str2.length());
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3517m
    public final InterfaceC3553q c(String str) {
        InterfaceC3553q interfaceC3553q;
        return "length".equals(str) ? new C3490j(Double.valueOf(t())) : (!f(str) || (interfaceC3553q = (InterfaceC3553q) this.f39752b.get(str)) == null) ? InterfaceC3553q.f39929W : interfaceC3553q;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3517m
    public final void d(String str, InterfaceC3553q interfaceC3553q) {
        if (interfaceC3553q == null) {
            this.f39752b.remove(str);
        } else {
            this.f39752b.put(str, interfaceC3553q);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3454f)) {
            return false;
        }
        C3454f c3454f = (C3454f) obj;
        if (t() != c3454f.t()) {
            return false;
        }
        SortedMap sortedMap = this.f39751a;
        if (sortedMap.isEmpty()) {
            return c3454f.f39751a.isEmpty();
        }
        for (int iIntValue = ((Integer) sortedMap.firstKey()).intValue(); iIntValue <= ((Integer) sortedMap.lastKey()).intValue(); iIntValue++) {
            if (!v(iIntValue).equals(c3454f.v(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3517m
    public final boolean f(String str) {
        return "length".equals(str) || this.f39752b.containsKey(str);
    }

    public final int hashCode() {
        return this.f39751a.hashCode() * 31;
    }

    public final List i() {
        ArrayList arrayList = new ArrayList(t());
        for (int i10 = 0; i10 < t(); i10++) {
            arrayList.add(v(i10));
        }
        return arrayList;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3445e(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final String k() {
        return B(com.amazon.a.a.o.b.f.f34694a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final Double l() {
        SortedMap sortedMap = this.f39751a;
        return sortedMap.size() == 1 ? v(0).l() : sortedMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final Boolean m() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final Iterator n() {
        return new C3436d(this, this.f39751a.keySet().iterator(), this.f39752b.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final InterfaceC3553q p() {
        C3454f c3454f = new C3454f();
        for (Map.Entry entry : this.f39751a.entrySet()) {
            if (entry.getValue() instanceof InterfaceC3517m) {
                c3454f.f39751a.put((Integer) entry.getKey(), (InterfaceC3553q) entry.getValue());
            } else {
                c3454f.f39751a.put((Integer) entry.getKey(), ((InterfaceC3553q) entry.getValue()).p());
            }
        }
        return c3454f;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3553q
    public final InterfaceC3553q r(String str, Y1 y12, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || Constants.PUSH.equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? D.a(str, this, y12, list) : InterfaceC3517m.b(this, new C3588u(str), y12, list);
    }

    public final Iterator s() {
        return this.f39751a.keySet().iterator();
    }

    public final int t() {
        SortedMap sortedMap = this.f39751a;
        if (sortedMap.isEmpty()) {
            return 0;
        }
        return ((Integer) sortedMap.lastKey()).intValue() + 1;
    }

    public final String toString() {
        return B(com.amazon.a.a.o.b.f.f34694a);
    }

    public final int u() {
        return this.f39751a.size();
    }

    public final InterfaceC3553q v(int i10) {
        InterfaceC3553q interfaceC3553q;
        if (i10 < t()) {
            return (!x(i10) || (interfaceC3553q = (InterfaceC3553q) this.f39751a.get(Integer.valueOf(i10))) == null) ? InterfaceC3553q.f39929W : interfaceC3553q;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    public final void w(int i10, InterfaceC3553q interfaceC3553q) {
        if (i10 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Out of bounds index: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (interfaceC3553q == null) {
            this.f39751a.remove(Integer.valueOf(i10));
        } else {
            this.f39751a.put(Integer.valueOf(i10), interfaceC3553q);
        }
    }

    public final boolean x(int i10) {
        if (i10 >= 0) {
            SortedMap sortedMap = this.f39751a;
            if (i10 <= ((Integer) sortedMap.lastKey()).intValue()) {
                return sortedMap.containsKey(Integer.valueOf(i10));
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
        sb2.append("Out of bounds index: ");
        sb2.append(i10);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public final void y() {
        this.f39751a.clear();
    }

    public final void z(int i10, InterfaceC3553q interfaceC3553q) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Invalid value index: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i10 >= t()) {
            w(i10, interfaceC3553q);
            return;
        }
        SortedMap sortedMap = this.f39751a;
        for (int iIntValue = ((Integer) sortedMap.lastKey()).intValue(); iIntValue >= i10; iIntValue--) {
            Integer numValueOf = Integer.valueOf(iIntValue);
            InterfaceC3553q interfaceC3553q2 = (InterfaceC3553q) sortedMap.get(numValueOf);
            if (interfaceC3553q2 != null) {
                w(iIntValue + 1, interfaceC3553q2);
                sortedMap.remove(numValueOf);
            }
        }
        w(i10, interfaceC3553q);
    }

    public C3454f(List list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                w(i10, (InterfaceC3553q) list.get(i10));
            }
        }
    }
}
