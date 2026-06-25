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
import Vf.t0;
import Vf.x0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.revenuecat.purchases.paywalls.components.IconComponent;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/IconComponent.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/IconComponent;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/IconComponent;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/IconComponent;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class IconComponent$$serializer implements E {
    public static final IconComponent$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        IconComponent$$serializer iconComponent$$serializer = new IconComponent$$serializer();
        INSTANCE = iconComponent$$serializer;
        C2337k0 c2337k0 = new C2337k0("icon", iconComponent$$serializer, 10);
        c2337k0.g("base_url", false);
        c2337k0.g("icon_name", false);
        c2337k0.g("formats", false);
        c2337k0.g("visible", true);
        c2337k0.g("size", true);
        c2337k0.g("color", true);
        c2337k0.g("padding", true);
        c2337k0.g("margin", true);
        c2337k0.g("icon_background", true);
        c2337k0.g("overrides", true);
        descriptor = c2337k0;
    }

    private IconComponent$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        b[] bVarArr = IconComponent.$childSerializers;
        b bVarP = a.p(C2330h.f20193a);
        b bVarP2 = a.p(ColorScheme$$serializer.INSTANCE);
        b bVarP3 = a.p(IconComponent$IconBackground$$serializer.INSTANCE);
        b bVar = bVarArr[9];
        x0 x0Var = x0.f20253a;
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{x0Var, x0Var, IconComponent$Formats$$serializer.INSTANCE, bVarP, Size$$serializer.INSTANCE, bVarP2, padding$$serializer, padding$$serializer, bVarP3, bVar};
    }

    @Override // Rf.a
    public IconComponent deserialize(e decoder) {
        int i10;
        List list;
        IconComponent.IconBackground iconBackground;
        Padding padding;
        ColorScheme colorScheme;
        Padding padding2;
        Size size;
        Boolean bool;
        IconComponent.Formats formats;
        String str;
        String str2;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        b[] bVarArr = IconComponent.$childSerializers;
        int i11 = 9;
        String strL = null;
        if (cVarB.p()) {
            String strL2 = cVarB.l(descriptor2, 0);
            String strL3 = cVarB.l(descriptor2, 1);
            IconComponent.Formats formats2 = (IconComponent.Formats) cVarB.e(descriptor2, 2, IconComponent$Formats$$serializer.INSTANCE, null);
            Boolean bool2 = (Boolean) cVarB.B(descriptor2, 3, C2330h.f20193a, null);
            Size size2 = (Size) cVarB.e(descriptor2, 4, Size$$serializer.INSTANCE, null);
            ColorScheme colorScheme2 = (ColorScheme) cVarB.B(descriptor2, 5, ColorScheme$$serializer.INSTANCE, null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding3 = (Padding) cVarB.e(descriptor2, 6, padding$$serializer, null);
            Padding padding4 = (Padding) cVarB.e(descriptor2, 7, padding$$serializer, null);
            IconComponent.IconBackground iconBackground2 = (IconComponent.IconBackground) cVarB.B(descriptor2, 8, IconComponent$IconBackground$$serializer.INSTANCE, null);
            list = (List) cVarB.e(descriptor2, 9, bVarArr[9], null);
            str = strL2;
            padding = padding4;
            padding2 = padding3;
            colorScheme = colorScheme2;
            bool = bool2;
            iconBackground = iconBackground2;
            size = size2;
            formats = formats2;
            i10 = 1023;
            str2 = strL3;
        } else {
            boolean z10 = true;
            int i12 = 0;
            List list2 = null;
            IconComponent.IconBackground iconBackground3 = null;
            Padding padding5 = null;
            ColorScheme colorScheme3 = null;
            Padding padding6 = null;
            Size size3 = null;
            Boolean bool3 = null;
            IconComponent.Formats formats3 = null;
            String strL4 = null;
            while (z10) {
                int i13 = cVarB.i(descriptor2);
                switch (i13) {
                    case -1:
                        z10 = false;
                        break;
                    case 0:
                        i12 |= 1;
                        strL = cVarB.l(descriptor2, 0);
                        i11 = 9;
                        break;
                    case 1:
                        strL4 = cVarB.l(descriptor2, 1);
                        i12 |= 2;
                        i11 = 9;
                        break;
                    case 2:
                        formats3 = (IconComponent.Formats) cVarB.e(descriptor2, 2, IconComponent$Formats$$serializer.INSTANCE, formats3);
                        i12 |= 4;
                        i11 = 9;
                        break;
                    case 3:
                        bool3 = (Boolean) cVarB.B(descriptor2, 3, C2330h.f20193a, bool3);
                        i12 |= 8;
                        i11 = 9;
                        break;
                    case 4:
                        size3 = (Size) cVarB.e(descriptor2, 4, Size$$serializer.INSTANCE, size3);
                        i12 |= 16;
                        i11 = 9;
                        break;
                    case 5:
                        colorScheme3 = (ColorScheme) cVarB.B(descriptor2, 5, ColorScheme$$serializer.INSTANCE, colorScheme3);
                        i12 |= 32;
                        i11 = 9;
                        break;
                    case 6:
                        padding6 = (Padding) cVarB.e(descriptor2, 6, Padding$$serializer.INSTANCE, padding6);
                        i12 |= 64;
                        i11 = 9;
                        break;
                    case 7:
                        padding5 = (Padding) cVarB.e(descriptor2, 7, Padding$$serializer.INSTANCE, padding5);
                        i12 |= 128;
                        i11 = 9;
                        break;
                    case 8:
                        iconBackground3 = (IconComponent.IconBackground) cVarB.B(descriptor2, 8, IconComponent$IconBackground$$serializer.INSTANCE, iconBackground3);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        i11 = 9;
                        break;
                    case 9:
                        list2 = (List) cVarB.e(descriptor2, i11, bVarArr[i11], list2);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        break;
                    default:
                        throw new m(i13);
                }
            }
            i10 = i12;
            list = list2;
            iconBackground = iconBackground3;
            padding = padding5;
            colorScheme = colorScheme3;
            padding2 = padding6;
            size = size3;
            bool = bool3;
            formats = formats3;
            str = strL;
            str2 = strL4;
        }
        cVarB.c(descriptor2);
        return new IconComponent(i10, str, str2, formats, bool, size, colorScheme, padding2, padding, iconBackground, list, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, IconComponent value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        IconComponent.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
