package com.revenuecat.purchases;

import Td.InterfaceC2154e;
import Vf.E;
import Vf.F;
import Vf.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002HÖ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"com/revenuecat/purchases/ColorAlias.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/ColorAlias;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize-QzpnlxU", "(LUf/e;)Ljava/lang/String;", "deserialize", "LUf/f;", "encoder", "value", "LTd/L;", "serialize-vLxeDZI", "(LUf/f;Ljava/lang/String;)V", "serialize", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class ColorAlias$$serializer implements E {
    public static final ColorAlias$$serializer INSTANCE;
    private static final /* synthetic */ F descriptor;

    static {
        ColorAlias$$serializer colorAlias$$serializer = new ColorAlias$$serializer();
        INSTANCE = colorAlias$$serializer;
        F f10 = new F("com.revenuecat.purchases.ColorAlias", colorAlias$$serializer);
        f10.g("value", false);
        descriptor = f10;
    }

    private ColorAlias$$serializer() {
    }

    @Override // Vf.E
    public Rf.b[] childSerializers() {
        return new Rf.b[]{x0.f20253a};
    }

    @Override // Rf.a
    public /* bridge */ /* synthetic */ Object deserialize(Uf.e eVar) {
        return ColorAlias.m114boximpl(m121deserializeQzpnlxU(eVar));
    }

    /* JADX INFO: renamed from: deserialize-QzpnlxU, reason: not valid java name */
    public String m121deserializeQzpnlxU(Uf.e decoder) {
        AbstractC5504s.h(decoder, "decoder");
        return ColorAlias.m115constructorimpl(decoder.z(getDescriptor()).A());
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public /* bridge */ /* synthetic */ void serialize(Uf.f fVar, Object obj) {
        m122serializevLxeDZI(fVar, ((ColorAlias) obj).m120unboximpl());
    }

    /* JADX INFO: renamed from: serialize-vLxeDZI, reason: not valid java name */
    public void m122serializevLxeDZI(Uf.f encoder, String value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Uf.f fVarD = encoder.D(getDescriptor());
        if (fVarD == null) {
            return;
        }
        fVarD.F(value);
    }

    @Override // Vf.E
    public Rf.b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
