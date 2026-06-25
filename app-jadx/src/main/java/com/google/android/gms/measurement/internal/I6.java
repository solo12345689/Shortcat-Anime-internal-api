package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C3485i3;
import com.google.android.gms.internal.measurement.C3494j3;
import com.google.android.gms.internal.measurement.C3503k3;
import com.google.android.gms.internal.measurement.C3512l3;
import com.google.android.gms.internal.measurement.N6;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import t.C6551a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class I6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f40804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f40805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private C3494j3 f40806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BitSet f40807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BitSet f40808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f40809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f40810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ C3794e f40811h;

    /* synthetic */ I6(C3794e c3794e, String str, C3494j3 c3494j3, BitSet bitSet, BitSet bitSet2, Map map, Map map2, byte[] bArr) {
        Objects.requireNonNull(c3794e);
        this.f40811h = c3794e;
        this.f40804a = str;
        this.f40807d = bitSet;
        this.f40808e = bitSet2;
        this.f40809f = map;
        this.f40810g = new C6551a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f40810g.put(num, arrayList);
        }
        this.f40805b = false;
        this.f40806c = c3494j3;
    }

    final void a(AbstractC3778c abstractC3778c) {
        int iA = abstractC3778c.a();
        if (abstractC3778c.f41113c != null) {
            this.f40808e.set(iA, true);
        }
        Boolean bool = abstractC3778c.f41114d;
        if (bool != null) {
            this.f40807d.set(iA, bool.booleanValue());
        }
        if (abstractC3778c.f41115e != null) {
            Map map = this.f40809f;
            Integer numValueOf = Integer.valueOf(iA);
            Long l10 = (Long) map.get(numValueOf);
            long jLongValue = abstractC3778c.f41115e.longValue() / 1000;
            if (l10 == null || jLongValue > l10.longValue()) {
                this.f40809f.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (abstractC3778c.f41116f != null) {
            Map map2 = this.f40810g;
            Integer numValueOf2 = Integer.valueOf(iA);
            List arrayList = (List) map2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f40810g.put(numValueOf2, arrayList);
            }
            if (abstractC3778c.b()) {
                arrayList.clear();
            }
            N6.a();
            X2 x22 = this.f40811h.f40611a;
            C3856m c3856mW = x22.w();
            String str = this.f40804a;
            C3781c2 c3781c2 = AbstractC3789d2.f41154G0;
            if (c3856mW.H(str, c3781c2) && abstractC3778c.c()) {
                arrayList.clear();
            }
            N6.a();
            if (!x22.w().H(this.f40804a, c3781c2)) {
                arrayList.add(Long.valueOf(abstractC3778c.f41116f.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(abstractC3778c.f41116f.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    final com.google.android.gms.internal.measurement.G2 b(int i10) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.F2 f2J = com.google.android.gms.internal.measurement.G2.J();
        f2J.t(i10);
        f2J.x(this.f40805b);
        C3494j3 c3494j3 = this.f40806c;
        if (c3494j3 != null) {
            f2J.v(c3494j3);
        }
        C3485i3 c3485i3K = C3494j3.K();
        c3485i3K.v(u6.Q(this.f40807d));
        c3485i3K.t(u6.Q(this.f40808e));
        Map map = this.f40809f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f40809f.keySet()) {
                int iIntValue = num.intValue();
                Long l10 = (Long) this.f40809f.get(num);
                if (l10 != null) {
                    com.google.android.gms.internal.measurement.P2 p2G = com.google.android.gms.internal.measurement.Q2.G();
                    p2G.t(iIntValue);
                    p2G.u(l10.longValue());
                    arrayList2.add((com.google.android.gms.internal.measurement.Q2) p2G.q());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            c3485i3K.y(arrayList);
        }
        Map map2 = this.f40810g;
        if (map2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.f40810g.keySet()) {
                C3503k3 c3503k3H = C3512l3.H();
                c3503k3H.t(num2.intValue());
                List list2 = (List) this.f40810g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    c3503k3H.u(list2);
                }
                arrayList3.add((C3512l3) c3503k3H.q());
            }
            list = arrayList3;
        }
        c3485i3K.B(list);
        f2J.u(c3485i3K);
        return (com.google.android.gms.internal.measurement.G2) f2J.q();
    }

    final /* synthetic */ BitSet c() {
        return this.f40807d;
    }

    /* synthetic */ I6(C3794e c3794e, String str, byte[] bArr) {
        Objects.requireNonNull(c3794e);
        this.f40811h = c3794e;
        this.f40804a = str;
        this.f40805b = true;
        this.f40807d = new BitSet();
        this.f40808e = new BitSet();
        this.f40809f = new C6551a();
        this.f40810g = new C6551a();
    }
}
