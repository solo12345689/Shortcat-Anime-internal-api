package com.revenuecat.purchases.paywalls.components;

import Rf.m;
import Sf.a;
import Td.InterfaceC2154e;
import Uf.c;
import Uf.d;
import Uf.e;
import Uf.f;
import Vf.C2330h;
import Vf.C2337k0;
import Vf.E;
import Vf.t0;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/TimelineComponent.Item.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/TimelineComponent$Item;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class TimelineComponent$Item$$serializer implements E {
    public static final TimelineComponent$Item$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        TimelineComponent$Item$$serializer timelineComponent$Item$$serializer = new TimelineComponent$Item$$serializer();
        INSTANCE = timelineComponent$Item$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.paywalls.components.TimelineComponent.Item", timelineComponent$Item$$serializer, 6);
        c2337k0.g(b.f34626S, false);
        c2337k0.g("visible", true);
        c2337k0.g(b.f34645c, true);
        c2337k0.g("icon", false);
        c2337k0.g("connector", true);
        c2337k0.g("overrides", true);
        descriptor = c2337k0;
    }

    private TimelineComponent$Item$$serializer() {
    }

    @Override // Vf.E
    public Rf.b[] childSerializers() {
        Rf.b[] bVarArr = TimelineComponent.Item.$childSerializers;
        TextComponent$$serializer textComponent$$serializer = TextComponent$$serializer.INSTANCE;
        return new Rf.b[]{textComponent$$serializer, a.p(C2330h.f20193a), a.p(textComponent$$serializer), IconComponent$$serializer.INSTANCE, a.p(TimelineComponent$Connector$$serializer.INSTANCE), bVarArr[5]};
    }

    @Override // Rf.a
    public TimelineComponent.Item deserialize(e decoder) {
        int i10;
        TextComponent textComponent;
        Boolean bool;
        TextComponent textComponent2;
        IconComponent iconComponent;
        TimelineComponent.Connector connector;
        List list;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        Rf.b[] bVarArr = TimelineComponent.Item.$childSerializers;
        int i11 = 3;
        TextComponent textComponent3 = null;
        if (cVarB.p()) {
            TextComponent$$serializer textComponent$$serializer = TextComponent$$serializer.INSTANCE;
            TextComponent textComponent4 = (TextComponent) cVarB.e(descriptor2, 0, textComponent$$serializer, null);
            Boolean bool2 = (Boolean) cVarB.B(descriptor2, 1, C2330h.f20193a, null);
            TextComponent textComponent5 = (TextComponent) cVarB.B(descriptor2, 2, textComponent$$serializer, null);
            IconComponent iconComponent2 = (IconComponent) cVarB.e(descriptor2, 3, IconComponent$$serializer.INSTANCE, null);
            TimelineComponent.Connector connector2 = (TimelineComponent.Connector) cVarB.B(descriptor2, 4, TimelineComponent$Connector$$serializer.INSTANCE, null);
            list = (List) cVarB.e(descriptor2, 5, bVarArr[5], null);
            textComponent2 = textComponent5;
            iconComponent = iconComponent2;
            connector = connector2;
            i10 = 63;
            bool = bool2;
            textComponent = textComponent4;
        } else {
            boolean z10 = true;
            int i12 = 0;
            Boolean bool3 = null;
            TextComponent textComponent6 = null;
            IconComponent iconComponent3 = null;
            TimelineComponent.Connector connector3 = null;
            List list2 = null;
            while (z10) {
                int i13 = cVarB.i(descriptor2);
                switch (i13) {
                    case -1:
                        z10 = false;
                        i11 = 3;
                        break;
                    case 0:
                        textComponent3 = (TextComponent) cVarB.e(descriptor2, 0, TextComponent$$serializer.INSTANCE, textComponent3);
                        i12 |= 1;
                        i11 = 3;
                        break;
                    case 1:
                        bool3 = (Boolean) cVarB.B(descriptor2, 1, C2330h.f20193a, bool3);
                        i12 |= 2;
                        break;
                    case 2:
                        textComponent6 = (TextComponent) cVarB.B(descriptor2, 2, TextComponent$$serializer.INSTANCE, textComponent6);
                        i12 |= 4;
                        break;
                    case 3:
                        iconComponent3 = (IconComponent) cVarB.e(descriptor2, i11, IconComponent$$serializer.INSTANCE, iconComponent3);
                        i12 |= 8;
                        break;
                    case 4:
                        connector3 = (TimelineComponent.Connector) cVarB.B(descriptor2, 4, TimelineComponent$Connector$$serializer.INSTANCE, connector3);
                        i12 |= 16;
                        break;
                    case 5:
                        list2 = (List) cVarB.e(descriptor2, 5, bVarArr[5], list2);
                        i12 |= 32;
                        break;
                    default:
                        throw new m(i13);
                }
            }
            i10 = i12;
            textComponent = textComponent3;
            bool = bool3;
            textComponent2 = textComponent6;
            iconComponent = iconComponent3;
            connector = connector3;
            list = list2;
        }
        cVarB.c(descriptor2);
        return new TimelineComponent.Item(i10, textComponent, bool, textComponent2, iconComponent, connector, list, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, TimelineComponent.Item value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        TimelineComponent.Item.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public Rf.b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
