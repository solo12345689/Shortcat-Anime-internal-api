package com.revenuecat.purchases.paywalls.components;

import Rf.b;
import Rf.m;
import Sf.a;
import Td.InterfaceC2154e;
import Uf.c;
import Uf.d;
import Uf.e;
import Uf.f;
import Vf.C2337k0;
import Vf.E;
import Vf.t0;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/ActionSurrogate.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/ActionSurrogate;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class ActionSurrogate$$serializer implements E {
    public static final ActionSurrogate$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        ActionSurrogate$$serializer actionSurrogate$$serializer = new ActionSurrogate$$serializer();
        INSTANCE = actionSurrogate$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.paywalls.components.ActionSurrogate", actionSurrogate$$serializer, 4);
        c2337k0.g("type", false);
        c2337k0.g("destination", true);
        c2337k0.g("url", true);
        c2337k0.g("sheet", true);
        descriptor = c2337k0;
    }

    private ActionSurrogate$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        return new b[]{ActionTypeSurrogateDeserializer.INSTANCE, a.p(DestinationSurrogateDeserializer.INSTANCE), a.p(UrlSurrogate$$serializer.INSTANCE), a.p(ButtonComponent$Destination$Sheet$$serializer.INSTANCE)};
    }

    @Override // Rf.a
    public ActionSurrogate deserialize(e decoder) {
        int i10;
        ActionTypeSurrogate actionTypeSurrogate;
        DestinationSurrogate destinationSurrogate;
        UrlSurrogate urlSurrogate;
        ButtonComponent.Destination.Sheet sheet;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        ActionTypeSurrogate actionTypeSurrogate2 = null;
        if (cVarB.p()) {
            ActionTypeSurrogate actionTypeSurrogate3 = (ActionTypeSurrogate) cVarB.e(descriptor2, 0, ActionTypeSurrogateDeserializer.INSTANCE, null);
            DestinationSurrogate destinationSurrogate2 = (DestinationSurrogate) cVarB.B(descriptor2, 1, DestinationSurrogateDeserializer.INSTANCE, null);
            UrlSurrogate urlSurrogate2 = (UrlSurrogate) cVarB.B(descriptor2, 2, UrlSurrogate$$serializer.INSTANCE, null);
            actionTypeSurrogate = actionTypeSurrogate3;
            sheet = (ButtonComponent.Destination.Sheet) cVarB.B(descriptor2, 3, ButtonComponent$Destination$Sheet$$serializer.INSTANCE, null);
            urlSurrogate = urlSurrogate2;
            destinationSurrogate = destinationSurrogate2;
            i10 = 15;
        } else {
            boolean z10 = true;
            int i11 = 0;
            DestinationSurrogate destinationSurrogate3 = null;
            UrlSurrogate urlSurrogate3 = null;
            ButtonComponent.Destination.Sheet sheet2 = null;
            while (z10) {
                int i12 = cVarB.i(descriptor2);
                if (i12 == -1) {
                    z10 = false;
                } else if (i12 == 0) {
                    actionTypeSurrogate2 = (ActionTypeSurrogate) cVarB.e(descriptor2, 0, ActionTypeSurrogateDeserializer.INSTANCE, actionTypeSurrogate2);
                    i11 |= 1;
                } else if (i12 == 1) {
                    destinationSurrogate3 = (DestinationSurrogate) cVarB.B(descriptor2, 1, DestinationSurrogateDeserializer.INSTANCE, destinationSurrogate3);
                    i11 |= 2;
                } else if (i12 == 2) {
                    urlSurrogate3 = (UrlSurrogate) cVarB.B(descriptor2, 2, UrlSurrogate$$serializer.INSTANCE, urlSurrogate3);
                    i11 |= 4;
                } else {
                    if (i12 != 3) {
                        throw new m(i12);
                    }
                    sheet2 = (ButtonComponent.Destination.Sheet) cVarB.B(descriptor2, 3, ButtonComponent$Destination$Sheet$$serializer.INSTANCE, sheet2);
                    i11 |= 8;
                }
            }
            i10 = i11;
            actionTypeSurrogate = actionTypeSurrogate2;
            destinationSurrogate = destinationSurrogate3;
            urlSurrogate = urlSurrogate3;
            sheet = sheet2;
        }
        cVarB.c(descriptor2);
        return new ActionSurrogate(i10, actionTypeSurrogate, destinationSurrogate, urlSurrogate, sheet, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, ActionSurrogate value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        ActionSurrogate.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
