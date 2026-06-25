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
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.BackgroundDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
import com.revenuecat.purchases.paywalls.components.properties.ShapeDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/PartialTabsComponent.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/PartialTabsComponent;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class PartialTabsComponent$$serializer implements E {
    public static final PartialTabsComponent$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        PartialTabsComponent$$serializer partialTabsComponent$$serializer = new PartialTabsComponent$$serializer();
        INSTANCE = partialTabsComponent$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.paywalls.components.PartialTabsComponent", partialTabsComponent$$serializer, 9);
        c2337k0.g("visible", true);
        c2337k0.g("size", true);
        c2337k0.g("padding", true);
        c2337k0.g("margin", true);
        c2337k0.g("background_color", true);
        c2337k0.g(AppStateModule.APP_STATE_BACKGROUND, true);
        c2337k0.g("shape", true);
        c2337k0.g("border", true);
        c2337k0.g("shadow", true);
        descriptor = c2337k0;
    }

    private PartialTabsComponent$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        b bVarP = a.p(C2330h.f20193a);
        b bVarP2 = a.p(Size$$serializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{bVarP, bVarP2, a.p(padding$$serializer), a.p(padding$$serializer), a.p(ColorScheme$$serializer.INSTANCE), a.p(BackgroundDeserializer.INSTANCE), a.p(ShapeDeserializer.INSTANCE), a.p(Border$$serializer.INSTANCE), a.p(Shadow$$serializer.INSTANCE)};
    }

    @Override // Rf.a
    public PartialTabsComponent deserialize(e decoder) {
        int i10;
        Border border;
        Shadow shadow;
        Shape shape;
        Background background;
        ColorScheme colorScheme;
        Boolean bool;
        Size size;
        Padding padding;
        Padding padding2;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i11 = 7;
        Boolean bool2 = null;
        if (cVarB.p()) {
            Boolean bool3 = (Boolean) cVarB.B(descriptor2, 0, C2330h.f20193a, null);
            Size size2 = (Size) cVarB.B(descriptor2, 1, Size$$serializer.INSTANCE, null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding3 = (Padding) cVarB.B(descriptor2, 2, padding$$serializer, null);
            Padding padding4 = (Padding) cVarB.B(descriptor2, 3, padding$$serializer, null);
            ColorScheme colorScheme2 = (ColorScheme) cVarB.B(descriptor2, 4, ColorScheme$$serializer.INSTANCE, null);
            Background background2 = (Background) cVarB.B(descriptor2, 5, BackgroundDeserializer.INSTANCE, null);
            Shape shape2 = (Shape) cVarB.B(descriptor2, 6, ShapeDeserializer.INSTANCE, null);
            bool = bool3;
            border = (Border) cVarB.B(descriptor2, 7, Border$$serializer.INSTANCE, null);
            shape = shape2;
            background = background2;
            padding2 = padding4;
            shadow = (Shadow) cVarB.B(descriptor2, 8, Shadow$$serializer.INSTANCE, null);
            colorScheme = colorScheme2;
            padding = padding3;
            size = size2;
            i10 = 511;
        } else {
            boolean z10 = true;
            int i12 = 0;
            Border border2 = null;
            Shadow shadow2 = null;
            Shape shape3 = null;
            Background background3 = null;
            ColorScheme colorScheme3 = null;
            Size size3 = null;
            Padding padding5 = null;
            Padding padding6 = null;
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
                        size3 = (Size) cVarB.B(descriptor2, 1, Size$$serializer.INSTANCE, size3);
                        i12 |= 2;
                        i11 = 7;
                        break;
                    case 2:
                        padding5 = (Padding) cVarB.B(descriptor2, 2, Padding$$serializer.INSTANCE, padding5);
                        i12 |= 4;
                        i11 = 7;
                        break;
                    case 3:
                        padding6 = (Padding) cVarB.B(descriptor2, 3, Padding$$serializer.INSTANCE, padding6);
                        i12 |= 8;
                        i11 = 7;
                        break;
                    case 4:
                        colorScheme3 = (ColorScheme) cVarB.B(descriptor2, 4, ColorScheme$$serializer.INSTANCE, colorScheme3);
                        i12 |= 16;
                        i11 = 7;
                        break;
                    case 5:
                        background3 = (Background) cVarB.B(descriptor2, 5, BackgroundDeserializer.INSTANCE, background3);
                        i12 |= 32;
                        i11 = 7;
                        break;
                    case 6:
                        shape3 = (Shape) cVarB.B(descriptor2, 6, ShapeDeserializer.INSTANCE, shape3);
                        i12 |= 64;
                        break;
                    case 7:
                        border2 = (Border) cVarB.B(descriptor2, i11, Border$$serializer.INSTANCE, border2);
                        i12 |= 128;
                        break;
                    case 8:
                        shadow2 = (Shadow) cVarB.B(descriptor2, 8, Shadow$$serializer.INSTANCE, shadow2);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    default:
                        throw new m(i13);
                }
            }
            i10 = i12;
            border = border2;
            shadow = shadow2;
            shape = shape3;
            background = background3;
            colorScheme = colorScheme3;
            bool = bool2;
            size = size3;
            padding = padding5;
            padding2 = padding6;
        }
        cVarB.c(descriptor2);
        return new PartialTabsComponent(i10, bool, size, padding, padding2, colorScheme, background, shape, border, shadow, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, PartialTabsComponent value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PartialTabsComponent.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
