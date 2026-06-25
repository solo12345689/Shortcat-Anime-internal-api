package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class Y1 {

    /* JADX INFO: renamed from: a */
    public final Y1 f39685a;

    /* JADX INFO: renamed from: b */
    final C3622y f39686b;

    /* JADX INFO: renamed from: c */
    final Map f39687c = new HashMap();

    /* JADX INFO: renamed from: d */
    final Map f39688d = new HashMap();

    public Y1(Y1 y12, C3622y c3622y) {
        this.f39685a = y12;
        this.f39686b = c3622y;
    }

    public final InterfaceC3553q a(InterfaceC3553q interfaceC3553q) {
        return this.f39686b.b(this, interfaceC3553q);
    }

    public final InterfaceC3553q b(C3454f c3454f) {
        InterfaceC3553q interfaceC3553qB = InterfaceC3553q.f39929W;
        Iterator itS = c3454f.s();
        while (itS.hasNext()) {
            interfaceC3553qB = this.f39686b.b(this, c3454f.v(((Integer) itS.next()).intValue()));
            if (interfaceC3553qB instanceof C3472h) {
                break;
            }
        }
        return interfaceC3553qB;
    }

    public final Y1 c() {
        return new Y1(this, this.f39686b);
    }

    public final boolean d(String str) {
        if (this.f39687c.containsKey(str)) {
            return true;
        }
        Y1 y12 = this.f39685a;
        if (y12 != null) {
            return y12.d(str);
        }
        return false;
    }

    public final void e(String str, InterfaceC3553q interfaceC3553q) {
        Y1 y12;
        Map map = this.f39687c;
        if (!map.containsKey(str) && (y12 = this.f39685a) != null && y12.d(str)) {
            y12.e(str, interfaceC3553q);
        } else {
            if (this.f39688d.containsKey(str)) {
                return;
            }
            if (interfaceC3553q == null) {
                map.remove(str);
            } else {
                map.put(str, interfaceC3553q);
            }
        }
    }

    public final void f(String str, InterfaceC3553q interfaceC3553q) {
        if (this.f39688d.containsKey(str)) {
            return;
        }
        if (interfaceC3553q == null) {
            this.f39687c.remove(str);
        } else {
            this.f39687c.put(str, interfaceC3553q);
        }
    }

    public final void g(String str, InterfaceC3553q interfaceC3553q) {
        f(str, interfaceC3553q);
        this.f39688d.put(str, Boolean.TRUE);
    }

    public final InterfaceC3553q h(String str) {
        Map map = this.f39687c;
        if (map.containsKey(str)) {
            return (InterfaceC3553q) map.get(str);
        }
        Y1 y12 = this.f39685a;
        if (y12 != null) {
            return y12.h(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }
}
