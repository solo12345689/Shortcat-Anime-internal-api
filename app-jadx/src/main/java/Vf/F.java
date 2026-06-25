package Vf;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class F extends C2337k0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f20132m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(String name, E generatedSerializer) {
        super(name, generatedSerializer, 1);
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(generatedSerializer, "generatedSerializer");
        this.f20132m = true;
    }

    @Override // Vf.C2337k0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        Tf.e eVar = (Tf.e) obj;
        if (!AbstractC5504s.c(o(), eVar.o())) {
            return false;
        }
        F f10 = (F) obj;
        if (!f10.isInline() || !Arrays.equals(u(), f10.u()) || k() != eVar.k()) {
            return false;
        }
        int iK = k();
        for (int i10 = 0; i10 < iK; i10++) {
            if (!AbstractC5504s.c(n(i10).o(), eVar.n(i10).o()) || !AbstractC5504s.c(n(i10).h(), eVar.n(i10).h())) {
                return false;
            }
        }
        return true;
    }

    @Override // Vf.C2337k0
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // Vf.C2337k0, Tf.e
    public boolean isInline() {
        return this.f20132m;
    }
}
