package com.revenuecat.purchases;

import Td.InterfaceC2154e;
import Vf.C2337k0;
import Vf.E;
import Vf.t0;
import com.revenuecat.purchases.UiConfig;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/UiConfig.AppConfig.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/UiConfig$AppConfig;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/UiConfig$AppConfig;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/UiConfig$AppConfig;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class UiConfig$AppConfig$$serializer implements E {
    public static final UiConfig$AppConfig$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        UiConfig$AppConfig$$serializer uiConfig$AppConfig$$serializer = new UiConfig$AppConfig$$serializer();
        INSTANCE = uiConfig$AppConfig$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.UiConfig.AppConfig", uiConfig$AppConfig$$serializer, 2);
        c2337k0.g("colors", true);
        c2337k0.g("fonts", true);
        descriptor = c2337k0;
    }

    private UiConfig$AppConfig$$serializer() {
    }

    @Override // Vf.E
    public Rf.b[] childSerializers() {
        Rf.b[] bVarArr = UiConfig.AppConfig.$childSerializers;
        return new Rf.b[]{bVarArr[0], bVarArr[1]};
    }

    @Override // Rf.a
    public UiConfig.AppConfig deserialize(Uf.e decoder) {
        Map map;
        Map map2;
        int i10;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        Uf.c cVarB = decoder.b(descriptor2);
        Rf.b[] bVarArr = UiConfig.AppConfig.$childSerializers;
        t0 t0Var = null;
        if (cVarB.p()) {
            map2 = (Map) cVarB.e(descriptor2, 0, bVarArr[0], null);
            map = (Map) cVarB.e(descriptor2, 1, bVarArr[1], null);
            i10 = 3;
        } else {
            boolean z10 = true;
            int i11 = 0;
            Map map3 = null;
            Map map4 = null;
            while (z10) {
                int i12 = cVarB.i(descriptor2);
                if (i12 == -1) {
                    z10 = false;
                } else if (i12 == 0) {
                    map4 = (Map) cVarB.e(descriptor2, 0, bVarArr[0], map4);
                    i11 |= 1;
                } else {
                    if (i12 != 1) {
                        throw new Rf.m(i12);
                    }
                    map3 = (Map) cVarB.e(descriptor2, 1, bVarArr[1], map3);
                    i11 |= 2;
                }
            }
            map = map3;
            map2 = map4;
            i10 = i11;
        }
        cVarB.c(descriptor2);
        return new UiConfig.AppConfig(i10, map2, map, t0Var);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(Uf.f encoder, UiConfig.AppConfig value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        Uf.d dVarB = encoder.b(descriptor2);
        UiConfig.AppConfig.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public Rf.b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
