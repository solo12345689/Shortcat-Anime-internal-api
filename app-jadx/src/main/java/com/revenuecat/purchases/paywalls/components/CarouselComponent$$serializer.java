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
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/CarouselComponent.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/CarouselComponent;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/CarouselComponent;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/CarouselComponent;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class CarouselComponent$$serializer implements E {
    public static final CarouselComponent$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        CarouselComponent$$serializer carouselComponent$$serializer = new CarouselComponent$$serializer();
        INSTANCE = carouselComponent$$serializer;
        C2337k0 c2337k0 = new C2337k0("carousel", carouselComponent$$serializer, 18);
        c2337k0.g("pages", false);
        c2337k0.g("visible", true);
        c2337k0.g("initial_page_index", true);
        c2337k0.g("page_alignment", false);
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
        c2337k0.g("overrides", true);
        descriptor = c2337k0;
    }

    private CarouselComponent$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        b[] bVarArr = CarouselComponent.$childSerializers;
        b bVar = bVarArr[0];
        C2330h c2330h = C2330h.f20193a;
        b bVarP = a.p(c2330h);
        J j10 = J.f20144a;
        b bVarP2 = a.p(j10);
        b bVarP3 = a.p(j10);
        b bVarP4 = a.p(D.f20127a);
        b bVarP5 = a.p(ColorScheme$$serializer.INSTANCE);
        b bVarP6 = a.p(BackgroundDeserializer.INSTANCE);
        b bVarP7 = a.p(ShapeDeserializer.INSTANCE);
        b bVarP8 = a.p(Border$$serializer.INSTANCE);
        b bVarP9 = a.p(Shadow$$serializer.INSTANCE);
        b bVarP10 = a.p(CarouselComponent$PageControl$$serializer.INSTANCE);
        b bVarP11 = a.p(c2330h);
        b bVarP12 = a.p(CarouselComponent$AutoAdvancePages$$serializer.INSTANCE);
        b bVar2 = bVarArr[17];
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{bVar, bVarP, bVarP2, VerticalAlignmentDeserializer.INSTANCE, Size$$serializer.INSTANCE, bVarP3, bVarP4, bVarP5, bVarP6, padding$$serializer, padding$$serializer, bVarP7, bVarP8, bVarP9, bVarP10, bVarP11, bVarP12, bVar2};
    }

    @Override // Rf.a
    public CarouselComponent deserialize(e decoder) {
        Background background;
        int i10;
        List list;
        ColorScheme colorScheme;
        Integer num;
        Size size;
        Border border;
        Integer num2;
        Padding padding;
        Padding padding2;
        Float f10;
        Shape shape;
        CarouselComponent.AutoAdvancePages autoAdvancePages;
        Boolean bool;
        CarouselComponent.PageControl pageControl;
        Boolean bool2;
        Shadow shadow;
        VerticalAlignment verticalAlignment;
        List list2;
        CarouselComponent.AutoAdvancePages autoAdvancePages2;
        List list3;
        Boolean bool3;
        List list4;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        b[] bVarArr = CarouselComponent.$childSerializers;
        if (cVarB.p()) {
            List list5 = (List) cVarB.e(descriptor2, 0, bVarArr[0], null);
            C2330h c2330h = C2330h.f20193a;
            Boolean bool4 = (Boolean) cVarB.B(descriptor2, 1, c2330h, null);
            J j10 = J.f20144a;
            Integer num3 = (Integer) cVarB.B(descriptor2, 2, j10, null);
            VerticalAlignment verticalAlignment2 = (VerticalAlignment) cVarB.e(descriptor2, 3, VerticalAlignmentDeserializer.INSTANCE, null);
            Size size2 = (Size) cVarB.e(descriptor2, 4, Size$$serializer.INSTANCE, null);
            Integer num4 = (Integer) cVarB.B(descriptor2, 5, j10, null);
            Float f11 = (Float) cVarB.B(descriptor2, 6, D.f20127a, null);
            ColorScheme colorScheme2 = (ColorScheme) cVarB.B(descriptor2, 7, ColorScheme$$serializer.INSTANCE, null);
            background = (Background) cVarB.B(descriptor2, 8, BackgroundDeserializer.INSTANCE, null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding3 = (Padding) cVarB.e(descriptor2, 9, padding$$serializer, null);
            Padding padding4 = (Padding) cVarB.e(descriptor2, 10, padding$$serializer, null);
            Shape shape2 = (Shape) cVarB.B(descriptor2, 11, ShapeDeserializer.INSTANCE, null);
            Border border2 = (Border) cVarB.B(descriptor2, 12, Border$$serializer.INSTANCE, null);
            Shadow shadow2 = (Shadow) cVarB.B(descriptor2, 13, Shadow$$serializer.INSTANCE, null);
            CarouselComponent.PageControl pageControl2 = (CarouselComponent.PageControl) cVarB.B(descriptor2, 14, CarouselComponent$PageControl$$serializer.INSTANCE, null);
            i10 = 262143;
            bool = (Boolean) cVarB.B(descriptor2, 15, c2330h, null);
            autoAdvancePages = (CarouselComponent.AutoAdvancePages) cVarB.B(descriptor2, 16, CarouselComponent$AutoAdvancePages$$serializer.INSTANCE, null);
            list = list5;
            size = size2;
            num2 = num3;
            bool2 = bool4;
            list2 = (List) cVarB.e(descriptor2, 17, bVarArr[17], null);
            num = num4;
            verticalAlignment = verticalAlignment2;
            colorScheme = colorScheme2;
            f10 = f11;
            padding2 = padding3;
            pageControl = pageControl2;
            shadow = shadow2;
            border = border2;
            shape = shape2;
            padding = padding4;
        } else {
            int i11 = 17;
            int i12 = 0;
            int i13 = 1;
            List list6 = null;
            ColorScheme colorScheme3 = null;
            Integer num5 = null;
            Size size3 = null;
            Boolean bool5 = null;
            Integer num6 = null;
            Padding padding5 = null;
            Padding padding6 = null;
            background = null;
            Float f12 = null;
            Shape shape3 = null;
            Border border3 = null;
            Shadow shadow3 = null;
            CarouselComponent.PageControl pageControl3 = null;
            Boolean bool6 = null;
            CarouselComponent.AutoAdvancePages autoAdvancePages3 = null;
            List list7 = null;
            i10 = 0;
            VerticalAlignment verticalAlignment3 = null;
            while (i13 != 0) {
                int i14 = i11;
                int i15 = cVarB.i(descriptor2);
                switch (i15) {
                    case -1:
                        autoAdvancePages2 = autoAdvancePages3;
                        list3 = list6;
                        i13 = i12;
                        bool5 = bool5;
                        verticalAlignment3 = verticalAlignment3;
                        i11 = 17;
                        i12 = i13;
                        list6 = list3;
                        autoAdvancePages3 = autoAdvancePages2;
                        break;
                    case 0:
                        VerticalAlignment verticalAlignment4 = verticalAlignment3;
                        autoAdvancePages2 = autoAdvancePages3;
                        list3 = list6;
                        b bVar = bVarArr[i12];
                        int i16 = i12;
                        list7 = (List) cVarB.e(descriptor2, i16, bVar, list7);
                        i10 |= 1;
                        bool5 = bool5;
                        verticalAlignment3 = verticalAlignment4;
                        i11 = 17;
                        i12 = i16;
                        list6 = list3;
                        autoAdvancePages3 = autoAdvancePages2;
                        break;
                    case 1:
                        autoAdvancePages2 = autoAdvancePages3;
                        list3 = list6;
                        i10 |= 2;
                        verticalAlignment3 = verticalAlignment3;
                        i11 = 17;
                        bool5 = (Boolean) cVarB.B(descriptor2, 1, C2330h.f20193a, bool5);
                        list6 = list3;
                        autoAdvancePages3 = autoAdvancePages2;
                        break;
                    case 2:
                        bool3 = bool5;
                        autoAdvancePages2 = autoAdvancePages3;
                        list4 = list6;
                        num6 = (Integer) cVarB.B(descriptor2, 2, J.f20144a, num6);
                        i10 |= 4;
                        list6 = list4;
                        bool5 = bool3;
                        i11 = 17;
                        autoAdvancePages3 = autoAdvancePages2;
                        break;
                    case 3:
                        bool3 = bool5;
                        autoAdvancePages2 = autoAdvancePages3;
                        list4 = list6;
                        verticalAlignment3 = (VerticalAlignment) cVarB.e(descriptor2, 3, VerticalAlignmentDeserializer.INSTANCE, verticalAlignment3);
                        i10 |= 8;
                        list6 = list4;
                        bool5 = bool3;
                        i11 = 17;
                        autoAdvancePages3 = autoAdvancePages2;
                        break;
                    case 4:
                        bool3 = bool5;
                        autoAdvancePages2 = autoAdvancePages3;
                        list4 = list6;
                        size3 = (Size) cVarB.e(descriptor2, 4, Size$$serializer.INSTANCE, size3);
                        i10 |= 16;
                        list6 = list4;
                        bool5 = bool3;
                        i11 = 17;
                        autoAdvancePages3 = autoAdvancePages2;
                        break;
                    case 5:
                        bool3 = bool5;
                        autoAdvancePages2 = autoAdvancePages3;
                        list4 = list6;
                        num5 = (Integer) cVarB.B(descriptor2, 5, J.f20144a, num5);
                        i10 |= 32;
                        list6 = list4;
                        bool5 = bool3;
                        i11 = 17;
                        autoAdvancePages3 = autoAdvancePages2;
                        break;
                    case 6:
                        bool3 = bool5;
                        autoAdvancePages2 = autoAdvancePages3;
                        list4 = list6;
                        f12 = (Float) cVarB.B(descriptor2, 6, D.f20127a, f12);
                        i10 |= 64;
                        list6 = list4;
                        bool5 = bool3;
                        i11 = 17;
                        autoAdvancePages3 = autoAdvancePages2;
                        break;
                    case 7:
                        bool3 = bool5;
                        autoAdvancePages2 = autoAdvancePages3;
                        list4 = list6;
                        colorScheme3 = (ColorScheme) cVarB.B(descriptor2, 7, ColorScheme$$serializer.INSTANCE, colorScheme3);
                        i10 |= 128;
                        list6 = list4;
                        bool5 = bool3;
                        i11 = 17;
                        autoAdvancePages3 = autoAdvancePages2;
                        break;
                    case 8:
                        bool3 = bool5;
                        autoAdvancePages2 = autoAdvancePages3;
                        list4 = list6;
                        background = (Background) cVarB.B(descriptor2, 8, BackgroundDeserializer.INSTANCE, background);
                        i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        list6 = list4;
                        bool5 = bool3;
                        i11 = 17;
                        autoAdvancePages3 = autoAdvancePages2;
                        break;
                    case 9:
                        bool3 = bool5;
                        autoAdvancePages2 = autoAdvancePages3;
                        list4 = list6;
                        padding6 = (Padding) cVarB.e(descriptor2, 9, Padding$$serializer.INSTANCE, padding6);
                        i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        list6 = list4;
                        bool5 = bool3;
                        i11 = 17;
                        autoAdvancePages3 = autoAdvancePages2;
                        break;
                    case 10:
                        bool3 = bool5;
                        autoAdvancePages2 = autoAdvancePages3;
                        list4 = list6;
                        padding5 = (Padding) cVarB.e(descriptor2, 10, Padding$$serializer.INSTANCE, padding5);
                        i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        list6 = list4;
                        bool5 = bool3;
                        i11 = 17;
                        autoAdvancePages3 = autoAdvancePages2;
                        break;
                    case 11:
                        bool3 = bool5;
                        autoAdvancePages2 = autoAdvancePages3;
                        list4 = list6;
                        shape3 = (Shape) cVarB.B(descriptor2, 11, ShapeDeserializer.INSTANCE, shape3);
                        i10 |= 2048;
                        list6 = list4;
                        bool5 = bool3;
                        i11 = 17;
                        autoAdvancePages3 = autoAdvancePages2;
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        bool3 = bool5;
                        autoAdvancePages2 = autoAdvancePages3;
                        list4 = list6;
                        border3 = (Border) cVarB.B(descriptor2, 12, Border$$serializer.INSTANCE, border3);
                        i10 |= 4096;
                        shadow3 = shadow3;
                        list6 = list4;
                        bool5 = bool3;
                        i11 = 17;
                        autoAdvancePages3 = autoAdvancePages2;
                        break;
                    case 13:
                        bool3 = bool5;
                        autoAdvancePages2 = autoAdvancePages3;
                        list4 = list6;
                        shadow3 = (Shadow) cVarB.B(descriptor2, 13, Shadow$$serializer.INSTANCE, shadow3);
                        i10 |= 8192;
                        pageControl3 = pageControl3;
                        list6 = list4;
                        bool5 = bool3;
                        i11 = 17;
                        autoAdvancePages3 = autoAdvancePages2;
                        break;
                    case 14:
                        bool3 = bool5;
                        autoAdvancePages2 = autoAdvancePages3;
                        list4 = list6;
                        pageControl3 = (CarouselComponent.PageControl) cVarB.B(descriptor2, 14, CarouselComponent$PageControl$$serializer.INSTANCE, pageControl3);
                        i10 |= 16384;
                        bool6 = bool6;
                        list6 = list4;
                        bool5 = bool3;
                        i11 = 17;
                        autoAdvancePages3 = autoAdvancePages2;
                        break;
                    case 15:
                        bool3 = bool5;
                        CarouselComponent.AutoAdvancePages autoAdvancePages4 = autoAdvancePages3;
                        list4 = list6;
                        autoAdvancePages2 = autoAdvancePages4;
                        bool6 = (Boolean) cVarB.B(descriptor2, 15, C2330h.f20193a, bool6);
                        i10 |= 32768;
                        list6 = list4;
                        bool5 = bool3;
                        i11 = 17;
                        autoAdvancePages3 = autoAdvancePages2;
                        break;
                    case 16:
                        i10 |= 65536;
                        list6 = list6;
                        bool5 = bool5;
                        autoAdvancePages3 = (CarouselComponent.AutoAdvancePages) cVarB.B(descriptor2, 16, CarouselComponent$AutoAdvancePages$$serializer.INSTANCE, autoAdvancePages3);
                        i11 = 17;
                        break;
                    case 17:
                        list6 = (List) cVarB.e(descriptor2, i14, bVarArr[i14], list6);
                        i10 |= 131072;
                        i11 = i14;
                        bool5 = bool5;
                        break;
                    default:
                        throw new m(i15);
                }
            }
            list = list7;
            colorScheme = colorScheme3;
            num = num5;
            size = size3;
            border = border3;
            num2 = num6;
            padding = padding5;
            padding2 = padding6;
            f10 = f12;
            shape = shape3;
            autoAdvancePages = autoAdvancePages3;
            bool = bool6;
            pageControl = pageControl3;
            bool2 = bool5;
            shadow = shadow3;
            verticalAlignment = verticalAlignment3;
            list2 = list6;
        }
        int i17 = i10;
        Background background2 = background;
        cVarB.c(descriptor2);
        return new CarouselComponent(i17, list, bool2, num2, verticalAlignment, size, num, f10, colorScheme, background2, padding2, padding, shape, border, shadow, pageControl, bool, autoAdvancePages, list2, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, CarouselComponent value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        CarouselComponent.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
