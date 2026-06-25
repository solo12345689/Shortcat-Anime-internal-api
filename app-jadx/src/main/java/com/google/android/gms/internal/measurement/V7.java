package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class V7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TreeMap f39602a = new TreeMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final TreeMap f39603b = new TreeMap();

    private static final int c(Y1 y12, C3544p c3544p, InterfaceC3553q interfaceC3553q) {
        InterfaceC3553q interfaceC3553qA = c3544p.a(y12, Collections.singletonList(interfaceC3553q));
        if (interfaceC3553qA instanceof C3490j) {
            return AbstractC3633z2.g(interfaceC3553qA.l().doubleValue());
        }
        return -1;
    }

    public final void a(String str, int i10, C3544p c3544p, String str2) {
        TreeMap treeMap;
        if ("create".equals(str2)) {
            treeMap = this.f39603b;
        } else {
            if (!"edit".equals(str2)) {
                throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(str2)));
            }
            treeMap = this.f39602a;
        }
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            i10 = ((Integer) treeMap.lastKey()).intValue() + 1;
        }
        treeMap.put(Integer.valueOf(i10), c3544p);
    }

    public final void b(Y1 y12, C3427c c3427c) {
        A4 a42 = new A4(c3427c);
        TreeMap treeMap = this.f39602a;
        for (Integer num : treeMap.keySet()) {
            C3418b c3418bClone = c3427c.c().clone();
            int iC = c(y12, (C3544p) treeMap.get(num), a42);
            if (iC == 2 || iC == -1) {
                c3427c.d(c3418bClone);
            }
        }
        TreeMap treeMap2 = this.f39603b;
        Iterator it = treeMap2.keySet().iterator();
        while (it.hasNext()) {
            c(y12, (C3544p) treeMap2.get((Integer) it.next()), a42);
        }
    }
}
