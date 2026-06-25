package Rf;

import Td.C2160k;
import Vf.AbstractC2318b;
import Vf.AbstractC2320c;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class d {
    public static final a a(AbstractC2318b abstractC2318b, Uf.c decoder, String str) {
        AbstractC5504s.h(abstractC2318b, "<this>");
        AbstractC5504s.h(decoder, "decoder");
        a aVarC = abstractC2318b.c(decoder, str);
        if (aVarC != null) {
            return aVarC;
        }
        AbstractC2320c.a(str, abstractC2318b.e());
        throw new C2160k();
    }

    public static final k b(AbstractC2318b abstractC2318b, Uf.f encoder, Object value) {
        AbstractC5504s.h(abstractC2318b, "<this>");
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        k kVarD = abstractC2318b.d(encoder, value);
        if (kVarD != null) {
            return kVarD;
        }
        AbstractC2320c.b(O.b(value.getClass()), abstractC2318b.e());
        throw new C2160k();
    }
}
