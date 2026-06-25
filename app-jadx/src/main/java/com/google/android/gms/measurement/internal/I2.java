package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import java.util.Objects;
import t.C6575z;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class I2 extends C6575z {

    /* JADX INFO: renamed from: j */
    final /* synthetic */ P2 f40798j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    I2(P2 p22, int i10) {
        super(20);
        Objects.requireNonNull(p22);
        this.f40798j = p22;
    }

    @Override // t.C6575z
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        String str = (String) obj;
        AbstractC2115p.f(str);
        return this.f40798j.o(str);
    }
}
