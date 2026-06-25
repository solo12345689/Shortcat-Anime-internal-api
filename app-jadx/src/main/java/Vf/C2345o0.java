package Vf;

import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: renamed from: Vf.o0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2345o0 extends N {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20221c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2345o0(Tf.e primitive) {
        super(primitive, null);
        AbstractC5504s.h(primitive, "primitive");
        this.f20221c = primitive.o() + "Array";
    }

    @Override // Tf.e
    public String o() {
        return this.f20221c;
    }
}
