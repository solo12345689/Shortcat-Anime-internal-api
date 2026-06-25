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
import Vf.J;
import Vf.t0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
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
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.VerticalAlignmentDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/PartialCarouselComponent.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/PartialCarouselComponent;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/PartialCarouselComponent;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/PartialCarouselComponent;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class PartialCarouselComponent$$serializer implements E {
    public static final PartialCarouselComponent$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        PartialCarouselComponent$$serializer partialCarouselComponent$$serializer = new PartialCarouselComponent$$serializer();
        INSTANCE = partialCarouselComponent$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.paywalls.components.PartialCarouselComponent", partialCarouselComponent$$serializer, 16);
        c2337k0.g("visible", true);
        c2337k0.g("initial_page_index", true);
        c2337k0.g("page_alignment", true);
        c2337k0.g("size", true);
        c2337k0.g("page_peek", true);
        c2337k0.g("page_spacing", true);
        c2337k0.g("background_color", true);
        c2337k0.g(AppStateModule.APP_STATE_BACKGROUND, true);
        c2337k0.g("padding", true);
        c2337k0.g("margin", true);
        c2337k0.g("shape", true);
        c2337k0.g("border", true);
        c2337k0.g("shadow", true);
        c2337k0.g("page_control", true);
        c2337k0.g("loop", true);
        c2337k0.g("auto_advance", true);
        descriptor = c2337k0;
    }

    private PartialCarouselComponent$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        C2330h c2330h = C2330h.f20193a;
        b bVarP = a.p(c2330h);
        J j10 = J.f20144a;
        b bVarP2 = a.p(j10);
        b bVarP3 = a.p(VerticalAlignmentDeserializer.INSTANCE);
        b bVarP4 = a.p(Size$$serializer.INSTANCE);
        b bVarP5 = a.p(j10);
        b bVarP6 = a.p(D.f20127a);
        b bVarP7 = a.p(ColorScheme$$serializer.INSTANCE);
        b bVarP8 = a.p(BackgroundDeserializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{bVarP, bVarP2, bVarP3, bVarP4, bVarP5, bVarP6, bVarP7, bVarP8, a.p(padding$$serializer), a.p(padding$$serializer), a.p(ShapeDeserializer.INSTANCE), a.p(Border$$serializer.INSTANCE), a.p(Shadow$$serializer.INSTANCE), a.p(CarouselComponent$PageControl$$serializer.INSTANCE), a.p(c2330h), a.p(CarouselComponent$AutoAdvancePages$$serializer.INSTANCE)};
    }

    @Override // Rf.a
    public PartialCarouselComponent deserialize(e decoder) {
        int i10;
        Boolean bool;
        Integer num;
        Boolean bool2;
        CarouselComponent.AutoAdvancePages autoAdvancePages;
        Shadow shadow;
        Shape shape;
        Padding padding;
        Padding padding2;
        ColorScheme colorScheme;
        Border border;
        Background background;
        Integer num2;
        VerticalAlignment verticalAlignment;
        Size size;
        Float f10;
        CarouselComponent.PageControl pageControl;
        Integer num3;
        CarouselComponent.PageControl pageControl2;
        Float f11;
        Size size2;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        if (cVarB.p()) {
            C2330h c2330h = C2330h.f20193a;
            Boolean bool3 = (Boolean) cVarB.B(descriptor2, 0, c2330h, null);
            J j10 = J.f20144a;
            Integer num4 = (Integer) cVarB.B(descriptor2, 1, j10, null);
            VerticalAlignment verticalAlignment2 = (VerticalAlignment) cVarB.B(descriptor2, 2, VerticalAlignmentDeserializer.INSTANCE, null);
            Size size3 = (Size) cVarB.B(descriptor2, 3, Size$$serializer.INSTANCE, null);
            Integer num5 = (Integer) cVarB.B(descriptor2, 4, j10, null);
            Float f12 = (Float) cVarB.B(descriptor2, 5, D.f20127a, null);
            ColorScheme colorScheme2 = (ColorScheme) cVarB.B(descriptor2, 6, ColorScheme$$serializer.INSTANCE, null);
            Background background2 = (Background) cVarB.B(descriptor2, 7, BackgroundDeserializer.INSTANCE, null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding3 = (Padding) cVarB.B(descriptor2, 8, padding$$serializer, null);
            Padding padding4 = (Padding) cVarB.B(descriptor2, 9, padding$$serializer, null);
            Shape shape2 = (Shape) cVarB.B(descriptor2, 10, ShapeDeserializer.INSTANCE, null);
            Border border2 = (Border) cVarB.B(descriptor2, 11, Border$$serializer.INSTANCE, null);
            Shadow shadow2 = (Shadow) cVarB.B(descriptor2, 12, Shadow$$serializer.INSTANCE, null);
            CarouselComponent.PageControl pageControl3 = (CarouselComponent.PageControl) cVarB.B(descriptor2, 13, CarouselComponent$PageControl$$serializer.INSTANCE, null);
            Boolean bool4 = (Boolean) cVarB.B(descriptor2, 14, c2330h, null);
            i10 = 65535;
            autoAdvancePages = (CarouselComponent.AutoAdvancePages) cVarB.B(descriptor2, 15, CarouselComponent$AutoAdvancePages$$serializer.INSTANCE, null);
            pageControl = pageControl3;
            num2 = num4;
            bool = bool3;
            num = num5;
            size = size3;
            padding = padding4;
            background = background2;
            colorScheme = colorScheme2;
            f10 = f12;
            shape = shape2;
            padding2 = padding3;
            bool2 = bool4;
            shadow = shadow2;
            border = border2;
            verticalAlignment = verticalAlignment2;
        } else {
            boolean z10 = true;
            CarouselComponent.PageControl pageControl4 = null;
            Float f13 = null;
            Integer num6 = null;
            Boolean bool5 = null;
            CarouselComponent.AutoAdvancePages autoAdvancePages2 = null;
            Shadow shadow3 = null;
            Shape shape3 = null;
            Padding padding5 = null;
            Padding padding6 = null;
            ColorScheme colorScheme3 = null;
            Border border3 = null;
            Background background3 = null;
            Boolean bool6 = null;
            Integer num7 = null;
            VerticalAlignment verticalAlignment3 = null;
            i10 = 0;
            Size size4 = null;
            while (z10) {
                Size size5 = size4;
                int i11 = cVarB.i(descriptor2);
                switch (i11) {
                    case -1:
                        pageControl2 = pageControl4;
                        f11 = f13;
                        size2 = size5;
                        z10 = false;
                        size4 = size2;
                        f13 = f11;
                        pageControl4 = pageControl2;
                        break;
                    case 0:
                        pageControl2 = pageControl4;
                        f11 = f13;
                        size2 = size5;
                        bool6 = (Boolean) cVarB.B(descriptor2, 0, C2330h.f20193a, bool6);
                        i10 |= 1;
                        num7 = num7;
                        size4 = size2;
                        f13 = f11;
                        pageControl4 = pageControl2;
                        break;
                    case 1:
                        pageControl2 = pageControl4;
                        f11 = f13;
                        size2 = size5;
                        num7 = (Integer) cVarB.B(descriptor2, 1, J.f20144a, num7);
                        i10 |= 2;
                        verticalAlignment3 = verticalAlignment3;
                        size4 = size2;
                        f13 = f11;
                        pageControl4 = pageControl2;
                        break;
                    case 2:
                        pageControl2 = pageControl4;
                        f11 = f13;
                        size2 = size5;
                        verticalAlignment3 = (VerticalAlignment) cVarB.B(descriptor2, 2, VerticalAlignmentDeserializer.INSTANCE, verticalAlignment3);
                        i10 |= 4;
                        size4 = size2;
                        f13 = f11;
                        pageControl4 = pageControl2;
                        break;
                    case 3:
                        pageControl2 = pageControl4;
                        f11 = f13;
                        size4 = (Size) cVarB.B(descriptor2, 3, Size$$serializer.INSTANCE, size5);
                        i10 |= 8;
                        f13 = f11;
                        pageControl4 = pageControl2;
                        break;
                    case 4:
                        num6 = (Integer) cVarB.B(descriptor2, 4, J.f20144a, num6);
                        i10 |= 16;
                        pageControl4 = pageControl4;
                        size4 = size5;
                        break;
                    case 5:
                        num3 = num6;
                        f13 = (Float) cVarB.B(descriptor2, 5, D.f20127a, f13);
                        i10 |= 32;
                        size4 = size5;
                        num6 = num3;
                        break;
                    case 6:
                        num3 = num6;
                        colorScheme3 = (ColorScheme) cVarB.B(descriptor2, 6, ColorScheme$$serializer.INSTANCE, colorScheme3);
                        i10 |= 64;
                        size4 = size5;
                        num6 = num3;
                        break;
                    case 7:
                        num3 = num6;
                        background3 = (Background) cVarB.B(descriptor2, 7, BackgroundDeserializer.INSTANCE, background3);
                        i10 |= 128;
                        size4 = size5;
                        num6 = num3;
                        break;
                    case 8:
                        num3 = num6;
                        padding6 = (Padding) cVarB.B(descriptor2, 8, Padding$$serializer.INSTANCE, padding6);
                        i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        size4 = size5;
                        num6 = num3;
                        break;
                    case 9:
                        num3 = num6;
                        padding5 = (Padding) cVarB.B(descriptor2, 9, Padding$$serializer.INSTANCE, padding5);
                        i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        size4 = size5;
                        num6 = num3;
                        break;
                    case 10:
                        num3 = num6;
                        shape3 = (Shape) cVarB.B(descriptor2, 10, ShapeDeserializer.INSTANCE, shape3);
                        i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        size4 = size5;
                        num6 = num3;
                        break;
                    case 11:
                        num3 = num6;
                        border3 = (Border) cVarB.B(descriptor2, 11, Border$$serializer.INSTANCE, border3);
                        i10 |= 2048;
                        size4 = size5;
                        num6 = num3;
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        num3 = num6;
                        shadow3 = (Shadow) cVarB.B(descriptor2, 12, Shadow$$serializer.INSTANCE, shadow3);
                        i10 |= 4096;
                        size4 = size5;
                        num6 = num3;
                        break;
                    case 13:
                        num3 = num6;
                        pageControl4 = (CarouselComponent.PageControl) cVarB.B(descriptor2, 13, CarouselComponent$PageControl$$serializer.INSTANCE, pageControl4);
                        i10 |= 8192;
                        size4 = size5;
                        num6 = num3;
                        break;
                    case 14:
                        num3 = num6;
                        bool5 = (Boolean) cVarB.B(descriptor2, 14, C2330h.f20193a, bool5);
                        i10 |= 16384;
                        size4 = size5;
                        num6 = num3;
                        break;
                    case 15:
                        num3 = num6;
                        autoAdvancePages2 = (CarouselComponent.AutoAdvancePages) cVarB.B(descriptor2, 15, CarouselComponent$AutoAdvancePages$$serializer.INSTANCE, autoAdvancePages2);
                        i10 |= 32768;
                        size4 = size5;
                        num6 = num3;
                        break;
                    default:
                        throw new m(i11);
                }
            }
            bool = bool6;
            num = num6;
            bool2 = bool5;
            autoAdvancePages = autoAdvancePages2;
            shadow = shadow3;
            shape = shape3;
            padding = padding5;
            padding2 = padding6;
            colorScheme = colorScheme3;
            border = border3;
            background = background3;
            num2 = num7;
            verticalAlignment = verticalAlignment3;
            size = size4;
            f10 = f13;
            pageControl = pageControl4;
        }
        int i12 = i10;
        cVarB.c(descriptor2);
        return new PartialCarouselComponent(i12, bool, num2, verticalAlignment, size, num, f10, colorScheme, background, padding2, padding, shape, border, shadow, pageControl, bool2, autoAdvancePages, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, PartialCarouselComponent value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        PartialCarouselComponent.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
