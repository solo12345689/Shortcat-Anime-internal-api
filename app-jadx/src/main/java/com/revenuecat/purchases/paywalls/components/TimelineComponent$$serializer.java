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
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/TimelineComponent.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/TimelineComponent;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class TimelineComponent$$serializer implements E {
    public static final TimelineComponent$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        TimelineComponent$$serializer timelineComponent$$serializer = new TimelineComponent$$serializer();
        INSTANCE = timelineComponent$$serializer;
        C2337k0 c2337k0 = new C2337k0("timeline", timelineComponent$$serializer, 10);
        c2337k0.g("item_spacing", false);
        c2337k0.g("text_spacing", false);
        c2337k0.g("column_gutter", false);
        c2337k0.g("icon_alignment", false);
        c2337k0.g("visible", true);
        c2337k0.g("size", true);
        c2337k0.g("padding", true);
        c2337k0.g("margin", true);
        c2337k0.g("items", true);
        c2337k0.g("overrides", true);
        descriptor = c2337k0;
    }

    private TimelineComponent$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        b[] bVarArr = TimelineComponent.$childSerializers;
        b bVarP = a.p(C2330h.f20193a);
        b bVar = bVarArr[8];
        b bVar2 = bVarArr[9];
        J j10 = J.f20144a;
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{j10, j10, j10, TimelineIconAlignmentDeserializer.INSTANCE, bVarP, Size$$serializer.INSTANCE, padding$$serializer, padding$$serializer, bVar, bVar2};
    }

    @Override // Rf.a
    public TimelineComponent deserialize(e decoder) {
        int iM;
        List list;
        List list2;
        Padding padding;
        Padding padding2;
        Size size;
        Boolean bool;
        TimelineComponent.IconAlignment iconAlignment;
        int i10;
        int i11;
        int i12;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        b[] bVarArr = TimelineComponent.$childSerializers;
        int i13 = 9;
        if (cVarB.p()) {
            iM = cVarB.m(descriptor2, 0);
            int iM2 = cVarB.m(descriptor2, 1);
            int iM3 = cVarB.m(descriptor2, 2);
            TimelineComponent.IconAlignment iconAlignment2 = (TimelineComponent.IconAlignment) cVarB.e(descriptor2, 3, TimelineIconAlignmentDeserializer.INSTANCE, null);
            Boolean bool2 = (Boolean) cVarB.B(descriptor2, 4, C2330h.f20193a, null);
            Size size2 = (Size) cVarB.e(descriptor2, 5, Size$$serializer.INSTANCE, null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding3 = (Padding) cVarB.e(descriptor2, 6, padding$$serializer, null);
            Padding padding4 = (Padding) cVarB.e(descriptor2, 7, padding$$serializer, null);
            List list3 = (List) cVarB.e(descriptor2, 8, bVarArr[8], null);
            list = (List) cVarB.e(descriptor2, 9, bVarArr[9], null);
            padding2 = padding4;
            padding = padding3;
            size = size2;
            iconAlignment = iconAlignment2;
            bool = bool2;
            i10 = iM3;
            i11 = 1023;
            list2 = list3;
            i12 = iM2;
        } else {
            boolean z10 = true;
            iM = 0;
            int i14 = 0;
            int iM4 = 0;
            List list4 = null;
            List list5 = null;
            Padding padding5 = null;
            Padding padding6 = null;
            Size size3 = null;
            Boolean bool3 = null;
            int iM5 = 0;
            TimelineComponent.IconAlignment iconAlignment3 = null;
            while (z10) {
                int i15 = cVarB.i(descriptor2);
                switch (i15) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        i14 |= 1;
                        iM = cVarB.m(descriptor2, 0);
                        i13 = 9;
                        break;
                    case 1:
                        iM4 = cVarB.m(descriptor2, 1);
                        i14 |= 2;
                        i13 = 9;
                        break;
                    case 2:
                        iM5 = cVarB.m(descriptor2, 2);
                        i14 |= 4;
                        i13 = 9;
                        break;
                    case 3:
                        iconAlignment3 = (TimelineComponent.IconAlignment) cVarB.e(descriptor2, 3, TimelineIconAlignmentDeserializer.INSTANCE, iconAlignment3);
                        i14 |= 8;
                        i13 = 9;
                        break;
                    case 4:
                        bool3 = (Boolean) cVarB.B(descriptor2, 4, C2330h.f20193a, bool3);
                        i14 |= 16;
                        i13 = 9;
                        break;
                    case 5:
                        size3 = (Size) cVarB.e(descriptor2, 5, Size$$serializer.INSTANCE, size3);
                        i14 |= 32;
                        i13 = 9;
                        break;
                    case 6:
                        padding5 = (Padding) cVarB.e(descriptor2, 6, Padding$$serializer.INSTANCE, padding5);
                        i14 |= 64;
                        i13 = 9;
                        break;
                    case 7:
                        padding6 = (Padding) cVarB.e(descriptor2, 7, Padding$$serializer.INSTANCE, padding6);
                        i14 |= 128;
                        i13 = 9;
                        break;
                    case 8:
                        list5 = (List) cVarB.e(descriptor2, 8, bVarArr[8], list5);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    case 9:
                        list4 = (List) cVarB.e(descriptor2, i13, bVarArr[i13], list4);
                        i14 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        break;
                    default:
                        throw new m(i15);
                }
            }
            list = list4;
            list2 = list5;
            padding = padding5;
            padding2 = padding6;
            size = size3;
            bool = bool3;
            iconAlignment = iconAlignment3;
            i10 = iM5;
            i11 = i14;
            i12 = iM4;
        }
        int i16 = iM;
        cVarB.c(descriptor2);
        return new TimelineComponent(i11, i16, i12, i10, iconAlignment, bool, size, padding, padding2, list2, list, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, TimelineComponent value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        TimelineComponent.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
