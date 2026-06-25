package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3544p extends AbstractC3499k implements InterfaceC3517m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final List f39918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final List f39919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Y1 f39920e;

    private C3544p(C3544p c3544p) {
        super(c3544p.f39806a);
        ArrayList arrayList = new ArrayList(c3544p.f39918c.size());
        this.f39918c = arrayList;
        arrayList.addAll(c3544p.f39918c);
        ArrayList arrayList2 = new ArrayList(c3544p.f39919d.size());
        this.f39919d = arrayList2;
        arrayList2.addAll(c3544p.f39919d);
        this.f39920e = c3544p.f39920e;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3499k
    public final InterfaceC3553q a(Y1 y12, List list) {
        Y1 y1C = this.f39920e.c();
        int i10 = 0;
        while (true) {
            List list2 = this.f39918c;
            if (i10 >= list2.size()) {
                break;
            }
            if (i10 < list.size()) {
                y1C.f((String) list2.get(i10), y12.a((InterfaceC3553q) list.get(i10)));
            } else {
                y1C.f((String) list2.get(i10), InterfaceC3553q.f39929W);
            }
            i10++;
        }
        for (InterfaceC3553q interfaceC3553q : this.f39919d) {
            InterfaceC3553q interfaceC3553qA = y1C.a(interfaceC3553q);
            if (interfaceC3553qA instanceof r) {
                interfaceC3553qA = y1C.a(interfaceC3553q);
            }
            if (interfaceC3553qA instanceof C3472h) {
                return ((C3472h) interfaceC3553qA).a();
            }
        }
        return InterfaceC3553q.f39929W;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3499k, com.google.android.gms.internal.measurement.InterfaceC3553q
    public final InterfaceC3553q p() {
        return new C3544p(this);
    }

    public C3544p(String str, List list, List list2, Y1 y12) {
        super(str);
        this.f39918c = new ArrayList();
        this.f39920e = y12;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f39918c.add(((InterfaceC3553q) it.next()).k());
            }
        }
        this.f39919d = new ArrayList(list2);
    }
}
