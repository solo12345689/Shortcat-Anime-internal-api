package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class B implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC3499k f39327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Y1 f39328b;

    B(AbstractC3499k abstractC3499k, Y1 y12) {
        this.f39327a = abstractC3499k;
        this.f39328b = y12;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        InterfaceC3553q interfaceC3553q = (InterfaceC3553q) obj;
        InterfaceC3553q interfaceC3553q2 = (InterfaceC3553q) obj2;
        if (interfaceC3553q instanceof C3597v) {
            return !(interfaceC3553q2 instanceof C3597v) ? 1 : 0;
        }
        if (interfaceC3553q2 instanceof C3597v) {
            return -1;
        }
        AbstractC3499k abstractC3499k = this.f39327a;
        return abstractC3499k == null ? interfaceC3553q.k().compareTo(interfaceC3553q2.k()) : (int) AbstractC3633z2.i(abstractC3499k.a(this.f39328b, Arrays.asList(interfaceC3553q, interfaceC3553q2)).l().doubleValue());
    }
}
