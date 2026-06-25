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
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/StackComponent.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/StackComponent;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class StackComponent$$serializer implements E {
    public static final StackComponent$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        StackComponent$$serializer stackComponent$$serializer = new StackComponent$$serializer();
        INSTANCE = stackComponent$$serializer;
        C2337k0 c2337k0 = new C2337k0("stack", stackComponent$$serializer, 15);
        c2337k0.g("components", false);
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
        c2337k0.g("overrides", true);
        descriptor = c2337k0;
    }

    private StackComponent$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        b[] bVarArr = StackComponent.$childSerializers;
        b bVar = bVarArr[0];
        b bVarP = a.p(C2330h.f20193a);
        b bVar2 = bVarArr[2];
        b bVarP2 = a.p(D.f20127a);
        b bVarP3 = a.p(ColorScheme$$serializer.INSTANCE);
        b bVarP4 = a.p(BackgroundDeserializer.INSTANCE);
        b bVarP5 = a.p(ShapeDeserializer.INSTANCE);
        b bVarP6 = a.p(Border$$serializer.INSTANCE);
        b bVarP7 = a.p(Shadow$$serializer.INSTANCE);
        b bVarP8 = a.p(Badge$$serializer.INSTANCE);
        b bVarP9 = a.p(StackOverflowDeserializer.INSTANCE);
        b bVar3 = bVarArr[14];
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{bVar, bVarP, bVar2, Size$$serializer.INSTANCE, bVarP2, bVarP3, bVarP4, padding$$serializer, padding$$serializer, bVarP5, bVarP6, bVarP7, bVarP8, bVarP9, bVar3};
    }

    @Override // Rf.a
    public StackComponent deserialize(e decoder) {
        int i10;
        List list;
        Dimension dimension;
        Shadow shadow;
        Border border;
        Padding padding;
        Padding padding2;
        Background background;
        Float f10;
        Shape shape;
        ColorScheme colorScheme;
        Size size;
        List list2;
        StackComponent.Overflow overflow;
        Badge badge;
        Boolean bool;
        List list3;
        List list4;
        Boolean bool2;
        Boolean bool3;
        List list5;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        b[] bVarArr = StackComponent.$childSerializers;
        if (cVarB.p()) {
            list = (List) cVarB.e(descriptor2, 0, bVarArr[0], null);
            Boolean bool4 = (Boolean) cVarB.B(descriptor2, 1, C2330h.f20193a, null);
            Dimension dimension2 = (Dimension) cVarB.e(descriptor2, 2, bVarArr[2], null);
            Size size2 = (Size) cVarB.e(descriptor2, 3, Size$$serializer.INSTANCE, null);
            Float f11 = (Float) cVarB.B(descriptor2, 4, D.f20127a, null);
            ColorScheme colorScheme2 = (ColorScheme) cVarB.B(descriptor2, 5, ColorScheme$$serializer.INSTANCE, null);
            Background background2 = (Background) cVarB.B(descriptor2, 6, BackgroundDeserializer.INSTANCE, null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding3 = (Padding) cVarB.e(descriptor2, 7, padding$$serializer, null);
            Padding padding4 = (Padding) cVarB.e(descriptor2, 8, padding$$serializer, null);
            Shape shape2 = (Shape) cVarB.B(descriptor2, 9, ShapeDeserializer.INSTANCE, null);
            Border border2 = (Border) cVarB.B(descriptor2, 10, Border$$serializer.INSTANCE, null);
            Shadow shadow2 = (Shadow) cVarB.B(descriptor2, 11, Shadow$$serializer.INSTANCE, null);
            Badge badge2 = (Badge) cVarB.B(descriptor2, 12, Badge$$serializer.INSTANCE, null);
            i10 = 32767;
            overflow = (StackComponent.Overflow) cVarB.B(descriptor2, 13, StackOverflowDeserializer.INSTANCE, null);
            bool = bool4;
            list2 = (List) cVarB.e(descriptor2, 14, bVarArr[14], null);
            border = border2;
            shape = shape2;
            padding2 = padding3;
            background = background2;
            colorScheme = colorScheme2;
            size = size2;
            padding = padding4;
            f10 = f11;
            dimension = dimension2;
            badge = badge2;
            shadow = shadow2;
        } else {
            int i11 = 14;
            boolean z10 = true;
            List list6 = null;
            Dimension dimension3 = null;
            Shadow shadow3 = null;
            Border border3 = null;
            Padding padding5 = null;
            Padding padding6 = null;
            Background background3 = null;
            Float f12 = null;
            Shape shape3 = null;
            ColorScheme colorScheme3 = null;
            Badge badge3 = null;
            StackComponent.Overflow overflow2 = null;
            List list7 = null;
            int i12 = 2;
            i10 = 0;
            Boolean bool5 = null;
            Size size3 = null;
            while (z10) {
                int i13 = i11;
                int i14 = cVarB.i(descriptor2);
                switch (i14) {
                    case -1:
                        list3 = list6;
                        list4 = list7;
                        bool2 = bool5;
                        z10 = false;
                        bool5 = bool2;
                        i11 = 14;
                        i12 = 2;
                        list7 = list4;
                        list6 = list3;
                        break;
                    case 0:
                        list3 = list6;
                        List list8 = list7;
                        bool2 = bool5;
                        list4 = (List) cVarB.e(descriptor2, 0, bVarArr[0], list8);
                        i10 |= 1;
                        bool5 = bool2;
                        i11 = 14;
                        i12 = 2;
                        list7 = list4;
                        list6 = list3;
                        break;
                    case 1:
                        bool5 = (Boolean) cVarB.B(descriptor2, 1, C2330h.f20193a, bool5);
                        i10 |= 2;
                        list6 = list6;
                        badge3 = badge3;
                        i11 = 14;
                        i12 = 2;
                        break;
                    case 2:
                        bool3 = bool5;
                        list5 = list6;
                        dimension3 = (Dimension) cVarB.e(descriptor2, i12, bVarArr[i12], dimension3);
                        i10 |= 4;
                        list6 = list5;
                        bool5 = bool3;
                        i11 = 14;
                        break;
                    case 3:
                        bool3 = bool5;
                        list5 = list6;
                        size3 = (Size) cVarB.e(descriptor2, 3, Size$$serializer.INSTANCE, size3);
                        i10 |= 8;
                        list6 = list5;
                        bool5 = bool3;
                        i11 = 14;
                        break;
                    case 4:
                        bool3 = bool5;
                        list5 = list6;
                        f12 = (Float) cVarB.B(descriptor2, 4, D.f20127a, f12);
                        i10 |= 16;
                        list6 = list5;
                        bool5 = bool3;
                        i11 = 14;
                        break;
                    case 5:
                        bool3 = bool5;
                        list5 = list6;
                        colorScheme3 = (ColorScheme) cVarB.B(descriptor2, 5, ColorScheme$$serializer.INSTANCE, colorScheme3);
                        i10 |= 32;
                        list6 = list5;
                        bool5 = bool3;
                        i11 = 14;
                        break;
                    case 6:
                        bool3 = bool5;
                        list5 = list6;
                        background3 = (Background) cVarB.B(descriptor2, 6, BackgroundDeserializer.INSTANCE, background3);
                        i10 |= 64;
                        list6 = list5;
                        bool5 = bool3;
                        i11 = 14;
                        break;
                    case 7:
                        bool3 = bool5;
                        list5 = list6;
                        padding6 = (Padding) cVarB.e(descriptor2, 7, Padding$$serializer.INSTANCE, padding6);
                        i10 |= 128;
                        list6 = list5;
                        bool5 = bool3;
                        i11 = 14;
                        break;
                    case 8:
                        bool3 = bool5;
                        list5 = list6;
                        padding5 = (Padding) cVarB.e(descriptor2, 8, Padding$$serializer.INSTANCE, padding5);
                        i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        list6 = list5;
                        bool5 = bool3;
                        i11 = 14;
                        break;
                    case 9:
                        bool3 = bool5;
                        list5 = list6;
                        shape3 = (Shape) cVarB.B(descriptor2, 9, ShapeDeserializer.INSTANCE, shape3);
                        i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        list6 = list5;
                        bool5 = bool3;
                        i11 = 14;
                        break;
                    case 10:
                        bool3 = bool5;
                        list5 = list6;
                        border3 = (Border) cVarB.B(descriptor2, 10, Border$$serializer.INSTANCE, border3);
                        i10 |= IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        list6 = list5;
                        bool5 = bool3;
                        i11 = 14;
                        break;
                    case 11:
                        bool3 = bool5;
                        list5 = list6;
                        shadow3 = (Shadow) cVarB.B(descriptor2, 11, Shadow$$serializer.INSTANCE, shadow3);
                        i10 |= 2048;
                        list6 = list5;
                        bool5 = bool3;
                        i11 = 14;
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        bool3 = bool5;
                        badge3 = (Badge) cVarB.B(descriptor2, 12, Badge$$serializer.INSTANCE, badge3);
                        i10 |= 4096;
                        list6 = list6;
                        overflow2 = overflow2;
                        bool5 = bool3;
                        i11 = 14;
                        break;
                    case 13:
                        bool3 = bool5;
                        list5 = list6;
                        overflow2 = (StackComponent.Overflow) cVarB.B(descriptor2, 13, StackOverflowDeserializer.INSTANCE, overflow2);
                        i10 |= 8192;
                        list6 = list5;
                        bool5 = bool3;
                        i11 = 14;
                        break;
                    case 14:
                        list6 = (List) cVarB.e(descriptor2, i13, bVarArr[i13], list6);
                        i10 |= 16384;
                        i11 = i13;
                        bool5 = bool5;
                        break;
                    default:
                        throw new m(i14);
                }
            }
            List list9 = list6;
            list = list7;
            dimension = dimension3;
            shadow = shadow3;
            border = border3;
            padding = padding5;
            padding2 = padding6;
            background = background3;
            f10 = f12;
            shape = shape3;
            colorScheme = colorScheme3;
            size = size3;
            list2 = list9;
            overflow = overflow2;
            badge = badge3;
            bool = bool5;
        }
        List list10 = list;
        int i15 = i10;
        cVarB.c(descriptor2);
        return new StackComponent(i15, list10, bool, dimension, size, f10, colorScheme, background, padding2, padding, shape, border, shadow, badge, overflow, list2, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, StackComponent value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        StackComponent.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
