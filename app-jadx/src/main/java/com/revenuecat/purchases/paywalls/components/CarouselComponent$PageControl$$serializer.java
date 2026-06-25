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
import Vf.J;
import Vf.t0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
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
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/CarouselComponent.PageControl.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent$PageControl;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class CarouselComponent$PageControl$$serializer implements E {
    public static final CarouselComponent$PageControl$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        CarouselComponent$PageControl$$serializer carouselComponent$PageControl$$serializer = new CarouselComponent$PageControl$$serializer();
        INSTANCE = carouselComponent$PageControl$$serializer;
        C2337k0 c2337k0 = new C2337k0("com.revenuecat.purchases.paywalls.components.CarouselComponent.PageControl", carouselComponent$PageControl$$serializer, 10);
        c2337k0.g("position", false);
        c2337k0.g("spacing", true);
        c2337k0.g("padding", true);
        c2337k0.g("margin", true);
        c2337k0.g("background_color", true);
        c2337k0.g("shape", true);
        c2337k0.g("border", true);
        c2337k0.g("shadow", true);
        c2337k0.g(AppStateModule.APP_STATE_ACTIVE, false);
        c2337k0.g("default", false);
        descriptor = c2337k0;
    }

    private CarouselComponent$PageControl$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        b bVarP = a.p(J.f20144a);
        b bVarP2 = a.p(ColorScheme$$serializer.INSTANCE);
        b bVarP3 = a.p(ShapeDeserializer.INSTANCE);
        b bVarP4 = a.p(Border$$serializer.INSTANCE);
        b bVarP5 = a.p(Shadow$$serializer.INSTANCE);
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        CarouselComponent$PageControl$Indicator$$serializer carouselComponent$PageControl$Indicator$$serializer = CarouselComponent$PageControl$Indicator$$serializer.INSTANCE;
        return new b[]{CarouselPageControlPositionDeserializer.INSTANCE, bVarP, padding$$serializer, padding$$serializer, bVarP2, bVarP3, bVarP4, bVarP5, carouselComponent$PageControl$Indicator$$serializer, carouselComponent$PageControl$Indicator$$serializer};
    }

    @Override // Rf.a
    public CarouselComponent.PageControl deserialize(e decoder) {
        int i10;
        CarouselComponent.PageControl.Indicator indicator;
        CarouselComponent.PageControl.Indicator indicator2;
        Border border;
        Shadow shadow;
        Shape shape;
        ColorScheme colorScheme;
        Padding padding;
        CarouselComponent.PageControl.Position position;
        Integer num;
        Padding padding2;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        int i11 = 9;
        CarouselComponent.PageControl.Position position2 = null;
        if (cVarB.p()) {
            CarouselComponent.PageControl.Position position3 = (CarouselComponent.PageControl.Position) cVarB.e(descriptor2, 0, CarouselPageControlPositionDeserializer.INSTANCE, null);
            Integer num2 = (Integer) cVarB.B(descriptor2, 1, J.f20144a, null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding3 = (Padding) cVarB.e(descriptor2, 2, padding$$serializer, null);
            Padding padding4 = (Padding) cVarB.e(descriptor2, 3, padding$$serializer, null);
            ColorScheme colorScheme2 = (ColorScheme) cVarB.B(descriptor2, 4, ColorScheme$$serializer.INSTANCE, null);
            Shape shape2 = (Shape) cVarB.B(descriptor2, 5, ShapeDeserializer.INSTANCE, null);
            Border border2 = (Border) cVarB.B(descriptor2, 6, Border$$serializer.INSTANCE, null);
            Shadow shadow2 = (Shadow) cVarB.B(descriptor2, 7, Shadow$$serializer.INSTANCE, null);
            CarouselComponent$PageControl$Indicator$$serializer carouselComponent$PageControl$Indicator$$serializer = CarouselComponent$PageControl$Indicator$$serializer.INSTANCE;
            CarouselComponent.PageControl.Indicator indicator3 = (CarouselComponent.PageControl.Indicator) cVarB.e(descriptor2, 8, carouselComponent$PageControl$Indicator$$serializer, null);
            position = position3;
            indicator = (CarouselComponent.PageControl.Indicator) cVarB.e(descriptor2, 9, carouselComponent$PageControl$Indicator$$serializer, null);
            shadow = shadow2;
            border = border2;
            shape = shape2;
            padding = padding4;
            indicator2 = indicator3;
            colorScheme = colorScheme2;
            padding2 = padding3;
            num = num2;
            i10 = 1023;
        } else {
            boolean z10 = true;
            int i12 = 0;
            CarouselComponent.PageControl.Indicator indicator4 = null;
            CarouselComponent.PageControl.Indicator indicator5 = null;
            Border border3 = null;
            Shadow shadow3 = null;
            Shape shape3 = null;
            ColorScheme colorScheme3 = null;
            Padding padding5 = null;
            Integer num3 = null;
            Padding padding6 = null;
            while (z10) {
                int i13 = cVarB.i(descriptor2);
                switch (i13) {
                    case -1:
                        z10 = false;
                        i11 = 9;
                        break;
                    case 0:
                        position2 = (CarouselComponent.PageControl.Position) cVarB.e(descriptor2, 0, CarouselPageControlPositionDeserializer.INSTANCE, position2);
                        i12 |= 1;
                        i11 = 9;
                        break;
                    case 1:
                        num3 = (Integer) cVarB.B(descriptor2, 1, J.f20144a, num3);
                        i12 |= 2;
                        i11 = 9;
                        break;
                    case 2:
                        padding6 = (Padding) cVarB.e(descriptor2, 2, Padding$$serializer.INSTANCE, padding6);
                        i12 |= 4;
                        i11 = 9;
                        break;
                    case 3:
                        padding5 = (Padding) cVarB.e(descriptor2, 3, Padding$$serializer.INSTANCE, padding5);
                        i12 |= 8;
                        i11 = 9;
                        break;
                    case 4:
                        colorScheme3 = (ColorScheme) cVarB.B(descriptor2, 4, ColorScheme$$serializer.INSTANCE, colorScheme3);
                        i12 |= 16;
                        i11 = 9;
                        break;
                    case 5:
                        shape3 = (Shape) cVarB.B(descriptor2, 5, ShapeDeserializer.INSTANCE, shape3);
                        i12 |= 32;
                        i11 = 9;
                        break;
                    case 6:
                        border3 = (Border) cVarB.B(descriptor2, 6, Border$$serializer.INSTANCE, border3);
                        i12 |= 64;
                        i11 = 9;
                        break;
                    case 7:
                        shadow3 = (Shadow) cVarB.B(descriptor2, 7, Shadow$$serializer.INSTANCE, shadow3);
                        i12 |= 128;
                        i11 = 9;
                        break;
                    case 8:
                        indicator5 = (CarouselComponent.PageControl.Indicator) cVarB.e(descriptor2, 8, CarouselComponent$PageControl$Indicator$$serializer.INSTANCE, indicator5);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        break;
                    case 9:
                        indicator4 = (CarouselComponent.PageControl.Indicator) cVarB.e(descriptor2, i11, CarouselComponent$PageControl$Indicator$$serializer.INSTANCE, indicator4);
                        i12 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        break;
                    default:
                        throw new m(i13);
                }
            }
            i10 = i12;
            indicator = indicator4;
            indicator2 = indicator5;
            border = border3;
            shadow = shadow3;
            shape = shape3;
            colorScheme = colorScheme3;
            padding = padding5;
            position = position2;
            num = num3;
            padding2 = padding6;
        }
        cVarB.c(descriptor2);
        return new CarouselComponent.PageControl(i10, position, num, padding2, padding, colorScheme, shape, border, shadow, indicator2, indicator, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, CarouselComponent.PageControl value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        CarouselComponent.PageControl.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
