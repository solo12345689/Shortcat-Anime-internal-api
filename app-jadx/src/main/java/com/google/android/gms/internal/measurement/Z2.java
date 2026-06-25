package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class Z2 extends AbstractC3424b5 implements F5 {
    /* synthetic */ Z2(byte[] bArr) {
        super(C3431c3.zzh);
    }

    public final Z2 A(Iterable iterable) {
        k();
        ((C3431c3) this.f39716b).N(iterable);
        return this;
    }

    public final Z2 B() {
        k();
        ((C3431c3) this.f39716b).O();
        return this;
    }

    public final String C() {
        return ((C3431c3) this.f39716b).G();
    }

    public final Z2 D(String str) {
        k();
        ((C3431c3) this.f39716b).P(str);
        return this;
    }

    public final Z2 E(String str) {
        k();
        ((C3431c3) this.f39716b).Q(str);
        return this;
    }

    public final List t() {
        return Collections.unmodifiableList(((C3431c3) this.f39716b).C());
    }

    public final int u() {
        return ((C3431c3) this.f39716b).D();
    }

    public final C3449e3 v(int i10) {
        return ((C3431c3) this.f39716b).E(i10);
    }

    public final Z2 x(int i10, C3440d3 c3440d3) {
        k();
        ((C3431c3) this.f39716b).L(i10, (C3449e3) c3440d3.q());
        return this;
    }

    public final Z2 y(C3440d3 c3440d3) {
        k();
        ((C3431c3) this.f39716b).M((C3449e3) c3440d3.q());
        return this;
    }
}
