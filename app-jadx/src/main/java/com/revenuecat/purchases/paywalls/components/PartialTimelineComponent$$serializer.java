package com.revenuecat.purchases.paywalls.components;

import Rf.b;
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
import Vf.J;
import Vf.t0;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/PartialTimelineComponent.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/PartialTimelineComponent;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class PartialTimelineComponent$$serializer implements E {
    public static final PartialTimelineComponent$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        PartialTimelineComponent$$serializer partialTimelineComponent$$serializer = new PartialTimelineComponent$$serializer();
        INSTANCE = partialTimelineComponent$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.paywalls.components.PartialTimelineComponent", partialTimelineComponent$$serializer, 8);
        c2337k0.g("visible", true);
        c2337k0.g("item_spacing", true);
        c2337k0.g("text_spacing", true);
        c2337k0.g("column_gutter", true);
        c2337k0.g("icon_alignment", true);
        c2337k0.g("size", true);
        c2337k0.g("padding", true);
        c2337k0.g("margin", true);
        descriptor = c2337k0;
    }

    private PartialTimelineComponent$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        b bVarP = a.p(C2330h.f20193a);
        J j10 = J.f20144a;
        b bVarP2 = a.p(j10);
        b bVarP3 = a.p(j10);
        b bVarP4 = a.p(j10);
        b bVarP5 = a.p(TimelineIconAlignmentDeserializer.INSTANCE);
        b bVarP6 = a.p(Size$$serializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{bVarP, bVarP2, bVarP3, bVarP4, bVarP5, bVarP6, a.p(padding$$serializer), a.p(padding$$serializer)};
    }

    @Override // Rf.a
    public PartialTimelineComponent deserialize(e decoder) {
        int i10;
        Padding padding;
        Padding padding2;
        Size size;
        Boolean bool;
        Integer num;
        Integer num2;
        Integer num3;
        TimelineComponent.IconAlignment iconAlignment;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i11 = 7;
        Boolean bool2 = null;
        if (cVarB.p()) {
            Boolean bool3 = (Boolean) cVarB.B(descriptor2, 0, C2330h.f20193a, null);
            J j10 = J.f20144a;
            Integer num4 = (Integer) cVarB.B(descriptor2, 1, j10, null);
            Integer num5 = (Integer) cVarB.B(descriptor2, 2, j10, null);
            Integer num6 = (Integer) cVarB.B(descriptor2, 3, j10, null);
            TimelineComponent.IconAlignment iconAlignment2 = (TimelineComponent.IconAlignment) cVarB.B(descriptor2, 4, TimelineIconAlignmentDeserializer.INSTANCE, null);
            Size size2 = (Size) cVarB.B(descriptor2, 5, Size$$serializer.INSTANCE, null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding3 = (Padding) cVarB.B(descriptor2, 6, padding$$serializer, null);
            bool = bool3;
            padding = (Padding) cVarB.B(descriptor2, 7, padding$$serializer, null);
            padding2 = padding3;
            size = size2;
            num3 = num6;
            iconAlignment = iconAlignment2;
            num2 = num5;
            num = num4;
            i10 = 255;
        } else {
            boolean z10 = true;
            int i12 = 0;
            Padding padding4 = null;
            Padding padding5 = null;
            Size size3 = null;
            Integer num7 = null;
            Integer num8 = null;
            Integer num9 = null;
            TimelineComponent.IconAlignment iconAlignment3 = null;
            while (z10) {
                int i13 = cVarB.i(descriptor2);
                switch (i13) {
                    case -1:
                        z10 = false;
                        i11 = 7;
                        break;
                    case 0:
                        bool2 = (Boolean) cVarB.B(descriptor2, 0, C2330h.f20193a, bool2);
                        i12 |= 1;
                        i11 = 7;
                        break;
                    case 1:
                        num7 = (Integer) cVarB.B(descriptor2, 1, J.f20144a, num7);
                        i12 |= 2;
                        i11 = 7;
                        break;
                    case 2:
                        num8 = (Integer) cVarB.B(descriptor2, 2, J.f20144a, num8);
                        i12 |= 4;
                        i11 = 7;
                        break;
                    case 3:
                        num9 = (Integer) cVarB.B(descriptor2, 3, J.f20144a, num9);
                        i12 |= 8;
                        i11 = 7;
                        break;
                    case 4:
                        iconAlignment3 = (TimelineComponent.IconAlignment) cVarB.B(descriptor2, 4, TimelineIconAlignmentDeserializer.INSTANCE, iconAlignment3);
                        i12 |= 16;
                        break;
                    case 5:
                        size3 = (Size) cVarB.B(descriptor2, 5, Size$$serializer.INSTANCE, size3);
                        i12 |= 32;
                        break;
                    case 6:
                        padding5 = (Padding) cVarB.B(descriptor2, 6, Padding$$serializer.INSTANCE, padding5);
                        i12 |= 64;
                        break;
                    case 7:
                        padding4 = (Padding) cVarB.B(descriptor2, i11, Padding$$serializer.INSTANCE, padding4);
                        i12 |= 128;
                        break;
                    default:
                        throw new m(i13);
                }
            }
            i10 = i12;
            padding = padding4;
            padding2 = padding5;
            size = size3;
            bool = bool2;
            num = num7;
            num2 = num8;
            num3 = num9;
            iconAlignment = iconAlignment3;
        }
        cVarB.c(descriptor2);
        return new PartialTimelineComponent(i10, bool, num, num2, num3, iconAlignment, size, padding2, padding, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, PartialTimelineComponent value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PartialTimelineComponent.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
