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
import Vf.D;
import Vf.E;
import Vf.t0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.BackgroundDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.Badge;
import com.revenuecat.purchases.paywalls.components.properties.Badge$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
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
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/PartialStackComponent.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/PartialStackComponent;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/PartialStackComponent;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/PartialStackComponent;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class PartialStackComponent$$serializer implements E {
    public static final PartialStackComponent$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        PartialStackComponent$$serializer partialStackComponent$$serializer = new PartialStackComponent$$serializer();
        INSTANCE = partialStackComponent$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.paywalls.components.PartialStackComponent", partialStackComponent$$serializer, 13);
        c2337k0.g("visible", true);
        c2337k0.g("dimension", true);
        c2337k0.g("size", true);
        c2337k0.g("spacing", true);
        c2337k0.g("background_color", true);
        c2337k0.g(AppStateModule.APP_STATE_BACKGROUND, true);
        c2337k0.g("padding", true);
        c2337k0.g("margin", true);
        c2337k0.g("shape", true);
        c2337k0.g("border", true);
        c2337k0.g("shadow", true);
        c2337k0.g("badge", true);
        c2337k0.g("overflow", true);
        descriptor = c2337k0;
    }

    private PartialStackComponent$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        b[] bVarArr = PartialStackComponent.$childSerializers;
        b bVarP = a.p(C2330h.f20193a);
        b bVarP2 = a.p(bVarArr[1]);
        b bVarP3 = a.p(Size$$serializer.INSTANCE);
        b bVarP4 = a.p(D.f20127a);
        b bVarP5 = a.p(ColorScheme$$serializer.INSTANCE);
        b bVarP6 = a.p(BackgroundDeserializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{bVarP, bVarP2, bVarP3, bVarP4, bVarP5, bVarP6, a.p(padding$$serializer), a.p(padding$$serializer), a.p(ShapeDeserializer.INSTANCE), a.p(Border$$serializer.INSTANCE), a.p(Shadow$$serializer.INSTANCE), a.p(Badge$$serializer.INSTANCE), a.p(StackOverflowDeserializer.INSTANCE)};
    }

    @Override // Rf.a
    public PartialStackComponent deserialize(e decoder) {
        int i10;
        Boolean bool;
        Badge badge;
        Shadow shadow;
        Shape shape;
        Padding padding;
        Padding padding2;
        ColorScheme colorScheme;
        Border border;
        Background background;
        Float f10;
        Size size;
        Dimension dimension;
        StackComponent.Overflow overflow;
        Dimension dimension2;
        StackComponent.Overflow overflow2;
        Dimension dimension3;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        b[] bVarArr = PartialStackComponent.$childSerializers;
        if (cVarB.p()) {
            Boolean bool2 = (Boolean) cVarB.B(descriptor2, 0, C2330h.f20193a, null);
            Dimension dimension4 = (Dimension) cVarB.B(descriptor2, 1, bVarArr[1], null);
            Size size2 = (Size) cVarB.B(descriptor2, 2, Size$$serializer.INSTANCE, null);
            Float f11 = (Float) cVarB.B(descriptor2, 3, D.f20127a, null);
            ColorScheme colorScheme2 = (ColorScheme) cVarB.B(descriptor2, 4, ColorScheme$$serializer.INSTANCE, null);
            Background background2 = (Background) cVarB.B(descriptor2, 5, BackgroundDeserializer.INSTANCE, null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding3 = (Padding) cVarB.B(descriptor2, 6, padding$$serializer, null);
            Padding padding4 = (Padding) cVarB.B(descriptor2, 7, padding$$serializer, null);
            Shape shape2 = (Shape) cVarB.B(descriptor2, 8, ShapeDeserializer.INSTANCE, null);
            Border border2 = (Border) cVarB.B(descriptor2, 9, Border$$serializer.INSTANCE, null);
            Shadow shadow2 = (Shadow) cVarB.B(descriptor2, 10, Shadow$$serializer.INSTANCE, null);
            Badge badge2 = (Badge) cVarB.B(descriptor2, 11, Badge$$serializer.INSTANCE, null);
            i10 = 8191;
            overflow = (StackComponent.Overflow) cVarB.B(descriptor2, 12, StackOverflowDeserializer.INSTANCE, null);
            bool = bool2;
            size = size2;
            shadow = shadow2;
            border = border2;
            padding = padding4;
            padding2 = padding3;
            background = background2;
            f10 = f11;
            shape = shape2;
            colorScheme = colorScheme2;
            badge = badge2;
            dimension = dimension4;
        } else {
            StackComponent.Overflow overflow3 = null;
            Boolean bool3 = null;
            Badge badge3 = null;
            Shadow shadow3 = null;
            Shape shape3 = null;
            Padding padding5 = null;
            Padding padding6 = null;
            ColorScheme colorScheme3 = null;
            Border border3 = null;
            Background background3 = null;
            Float f12 = null;
            int i11 = 1;
            boolean z10 = true;
            i10 = 0;
            Dimension dimension5 = null;
            Size size3 = null;
            while (z10) {
                Boolean bool4 = bool3;
                int i12 = cVarB.i(descriptor2);
                switch (i12) {
                    case -1:
                        overflow2 = overflow3;
                        dimension3 = dimension5;
                        bool3 = bool4;
                        z10 = false;
                        dimension5 = dimension3;
                        overflow3 = overflow2;
                        i11 = 1;
                        break;
                    case 0:
                        overflow2 = overflow3;
                        dimension3 = dimension5;
                        bool3 = (Boolean) cVarB.B(descriptor2, 0, C2330h.f20193a, bool4);
                        i10 |= 1;
                        dimension5 = dimension3;
                        overflow3 = overflow2;
                        i11 = 1;
                        break;
                    case 1:
                        Dimension dimension6 = dimension5;
                        int i13 = i11;
                        dimension5 = (Dimension) cVarB.B(descriptor2, i13, bVarArr[i11], dimension6);
                        i10 |= 2;
                        i11 = i13;
                        overflow3 = overflow3;
                        bool3 = bool4;
                        break;
                    case 2:
                        dimension2 = dimension5;
                        size3 = (Size) cVarB.B(descriptor2, 2, Size$$serializer.INSTANCE, size3);
                        i10 |= 4;
                        bool3 = bool4;
                        dimension5 = dimension2;
                        break;
                    case 3:
                        dimension2 = dimension5;
                        f12 = (Float) cVarB.B(descriptor2, 3, D.f20127a, f12);
                        i10 |= 8;
                        bool3 = bool4;
                        dimension5 = dimension2;
                        break;
                    case 4:
                        dimension2 = dimension5;
                        colorScheme3 = (ColorScheme) cVarB.B(descriptor2, 4, ColorScheme$$serializer.INSTANCE, colorScheme3);
                        i10 |= 16;
                        bool3 = bool4;
                        dimension5 = dimension2;
                        break;
                    case 5:
                        dimension2 = dimension5;
                        background3 = (Background) cVarB.B(descriptor2, 5, BackgroundDeserializer.INSTANCE, background3);
                        i10 |= 32;
                        bool3 = bool4;
                        dimension5 = dimension2;
                        break;
                    case 6:
                        dimension2 = dimension5;
                        padding6 = (Padding) cVarB.B(descriptor2, 6, Padding$$serializer.INSTANCE, padding6);
                        i10 |= 64;
                        bool3 = bool4;
                        dimension5 = dimension2;
                        break;
                    case 7:
                        dimension2 = dimension5;
                        padding5 = (Padding) cVarB.B(descriptor2, 7, Padding$$serializer.INSTANCE, padding5);
                        i10 |= 128;
                        bool3 = bool4;
                        dimension5 = dimension2;
                        break;
                    case 8:
                        dimension2 = dimension5;
                        shape3 = (Shape) cVarB.B(descriptor2, 8, ShapeDeserializer.INSTANCE, shape3);
                        i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        bool3 = bool4;
                        dimension5 = dimension2;
                        break;
                    case 9:
                        dimension2 = dimension5;
                        border3 = (Border) cVarB.B(descriptor2, 9, Border$$serializer.INSTANCE, border3);
                        i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        bool3 = bool4;
                        dimension5 = dimension2;
                        break;
                    case 10:
                        dimension2 = dimension5;
                        shadow3 = (Shadow) cVarB.B(descriptor2, 10, Shadow$$serializer.INSTANCE, shadow3);
                        i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        bool3 = bool4;
                        dimension5 = dimension2;
                        break;
                    case 11:
                        dimension2 = dimension5;
                        badge3 = (Badge) cVarB.B(descriptor2, 11, Badge$$serializer.INSTANCE, badge3);
                        i10 |= 2048;
                        bool3 = bool4;
                        dimension5 = dimension2;
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        dimension2 = dimension5;
                        overflow3 = (StackComponent.Overflow) cVarB.B(descriptor2, 12, StackOverflowDeserializer.INSTANCE, overflow3);
                        i10 |= 4096;
                        bool3 = bool4;
                        dimension5 = dimension2;
                        break;
                    default:
                        throw new m(i12);
                }
            }
            bool = bool3;
            badge = badge3;
            shadow = shadow3;
            shape = shape3;
            padding = padding5;
            padding2 = padding6;
            colorScheme = colorScheme3;
            border = border3;
            background = background3;
            f10 = f12;
            size = size3;
            dimension = dimension5;
            overflow = overflow3;
        }
        int i14 = i10;
        cVarB.c(descriptor2);
        return new PartialStackComponent(i14, bool, dimension, size, f10, colorScheme, background, padding2, padding, shape, border, shadow, badge, overflow, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, PartialStackComponent value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PartialStackComponent.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
