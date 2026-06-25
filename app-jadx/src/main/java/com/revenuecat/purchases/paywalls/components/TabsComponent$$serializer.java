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
import com.facebook.react.modules.appstate.AppStateModule;
import com.revenuecat.purchases.common.verification.SigningManager;
import com.revenuecat.purchases.paywalls.components.TabsComponent;
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
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/TabsComponent.$serializer", "LVf/E;", "Lcom/revenuecat/purchases/paywalls/components/TabsComponent;", "<init>", "()V", "", "LRf/b;", "childSerializers", "()[LRf/b;", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/TabsComponent;", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/TabsComponent;)V", "LTf/e;", "getDescriptor", "()LTf/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@InterfaceC2154e
public final class TabsComponent$$serializer implements E {
    public static final TabsComponent$$serializer INSTANCE;
    private static final /* synthetic */ C2337k0 descriptor;

    static {
        TabsComponent$$serializer tabsComponent$$serializer = new TabsComponent$$serializer();
        INSTANCE = tabsComponent$$serializer;
        C2337k0 c2337k0 = new C2337k0("tabs", tabsComponent$$serializer, 13);
        c2337k0.g("visible", true);
        c2337k0.g("size", true);
        c2337k0.g("padding", true);
        c2337k0.g("margin", true);
        c2337k0.g("background_color", true);
        c2337k0.g(AppStateModule.APP_STATE_BACKGROUND, true);
        c2337k0.g("shape", true);
        c2337k0.g("border", true);
        c2337k0.g("shadow", true);
        c2337k0.g("control", false);
        c2337k0.g("tabs", false);
        c2337k0.g("default_tab_id", true);
        c2337k0.g("overrides", true);
        descriptor = c2337k0;
    }

    private TabsComponent$$serializer() {
    }

    @Override // Vf.E
    public b[] childSerializers() {
        b[] bVarArr = TabsComponent.$childSerializers;
        b bVarP = a.p(C2330h.f20193a);
        b bVarP2 = a.p(ColorScheme$$serializer.INSTANCE);
        b bVarP3 = a.p(BackgroundDeserializer.INSTANCE);
        b bVarP4 = a.p(ShapeDeserializer.INSTANCE);
        b bVarP5 = a.p(Border$$serializer.INSTANCE);
        b bVarP6 = a.p(Shadow$$serializer.INSTANCE);
        b bVar = bVarArr[9];
        b bVar2 = bVarArr[10];
        b bVarP7 = a.p(x0.f20253a);
        b bVar3 = bVarArr[12];
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{bVarP, Size$$serializer.INSTANCE, padding$$serializer, padding$$serializer, bVarP2, bVarP3, bVarP4, bVarP5, bVarP6, bVar, bVar2, bVarP7, bVar3};
    }

    @Override // Rf.a
    public TabsComponent deserialize(e decoder) {
        int i10;
        Size size;
        TabsComponent.TabControl tabControl;
        Shadow shadow;
        Border border;
        Background background;
        List list;
        Shape shape;
        ColorScheme colorScheme;
        Boolean bool;
        String str;
        Padding padding;
        List list2;
        Padding padding2;
        Boolean bool2;
        List list3;
        int i11;
        List list4;
        Padding padding3;
        int i12;
        List list5;
        AbstractC5504s.h(decoder, "decoder");
        Tf.e descriptor2 = getDescriptor();
        c cVarB = decoder.b(descriptor2);
        b[] bVarArr = TabsComponent.$childSerializers;
        Boolean bool3 = null;
        if (cVarB.p()) {
            Boolean bool4 = (Boolean) cVarB.B(descriptor2, 0, C2330h.f20193a, null);
            Size size2 = (Size) cVarB.e(descriptor2, 1, Size$$serializer.INSTANCE, null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            Padding padding4 = (Padding) cVarB.e(descriptor2, 2, padding$$serializer, null);
            Padding padding5 = (Padding) cVarB.e(descriptor2, 3, padding$$serializer, null);
            ColorScheme colorScheme2 = (ColorScheme) cVarB.B(descriptor2, 4, ColorScheme$$serializer.INSTANCE, null);
            Background background2 = (Background) cVarB.B(descriptor2, 5, BackgroundDeserializer.INSTANCE, null);
            Shape shape2 = (Shape) cVarB.B(descriptor2, 6, ShapeDeserializer.INSTANCE, null);
            Border border2 = (Border) cVarB.B(descriptor2, 7, Border$$serializer.INSTANCE, null);
            Shadow shadow2 = (Shadow) cVarB.B(descriptor2, 8, Shadow$$serializer.INSTANCE, null);
            TabsComponent.TabControl tabControl2 = (TabsComponent.TabControl) cVarB.e(descriptor2, 9, bVarArr[9], null);
            List list6 = (List) cVarB.e(descriptor2, 10, bVarArr[10], null);
            i10 = 8191;
            str = (String) cVarB.B(descriptor2, 11, x0.f20253a, null);
            bool = bool4;
            list2 = (List) cVarB.e(descriptor2, 12, bVarArr[12], null);
            border = border2;
            shape = shape2;
            background = background2;
            padding = padding5;
            shadow = shadow2;
            colorScheme = colorScheme2;
            padding2 = padding4;
            list = list6;
            tabControl = tabControl2;
            size = size2;
        } else {
            int i13 = 12;
            int i14 = 0;
            Padding padding6 = null;
            Size size3 = null;
            TabsComponent.TabControl tabControl3 = null;
            Shadow shadow3 = null;
            Border border3 = null;
            Background background3 = null;
            List list7 = null;
            Shape shape3 = null;
            ColorScheme colorScheme3 = null;
            int i15 = 10;
            int i16 = 9;
            boolean z10 = true;
            List list8 = null;
            String str2 = null;
            Padding padding7 = null;
            while (z10) {
                int i17 = i13;
                int i18 = cVarB.i(descriptor2);
                switch (i18) {
                    case -1:
                        padding3 = padding6;
                        i12 = i14;
                        list5 = list8;
                        z10 = false;
                        list8 = list5;
                        padding6 = padding3;
                        i16 = 9;
                        i15 = 10;
                        i14 = i12;
                        i13 = 12;
                        break;
                    case 0:
                        int i19 = i14;
                        list5 = list8;
                        padding3 = padding6;
                        bool3 = (Boolean) cVarB.B(descriptor2, 0, C2330h.f20193a, bool3);
                        i12 = i19 | 1;
                        list8 = list5;
                        padding6 = padding3;
                        i16 = 9;
                        i15 = 10;
                        i14 = i12;
                        i13 = 12;
                        break;
                    case 1:
                        bool2 = bool3;
                        int i20 = i14;
                        list3 = list8;
                        size3 = (Size) cVarB.e(descriptor2, 1, Size$$serializer.INSTANCE, size3);
                        i11 = i20 | 2;
                        list8 = list3;
                        i13 = 12;
                        i16 = 9;
                        i15 = 10;
                        i14 = i11;
                        bool3 = bool2;
                        break;
                    case 2:
                        bool2 = bool3;
                        int i21 = i14;
                        list3 = list8;
                        padding6 = (Padding) cVarB.e(descriptor2, 2, Padding$$serializer.INSTANCE, padding6);
                        i11 = i21 | 4;
                        list8 = list3;
                        i13 = 12;
                        i16 = 9;
                        i15 = 10;
                        i14 = i11;
                        bool3 = bool2;
                        break;
                    case 3:
                        bool2 = bool3;
                        int i22 = i14;
                        list3 = list8;
                        padding7 = (Padding) cVarB.e(descriptor2, 3, Padding$$serializer.INSTANCE, padding7);
                        i11 = i22 | 8;
                        list8 = list3;
                        i13 = 12;
                        i16 = 9;
                        i15 = 10;
                        i14 = i11;
                        bool3 = bool2;
                        break;
                    case 4:
                        bool2 = bool3;
                        int i23 = i14;
                        list3 = list8;
                        colorScheme3 = (ColorScheme) cVarB.B(descriptor2, 4, ColorScheme$$serializer.INSTANCE, colorScheme3);
                        i11 = i23 | 16;
                        list8 = list3;
                        i13 = 12;
                        i16 = 9;
                        i15 = 10;
                        i14 = i11;
                        bool3 = bool2;
                        break;
                    case 5:
                        bool2 = bool3;
                        int i24 = i14;
                        list3 = list8;
                        background3 = (Background) cVarB.B(descriptor2, 5, BackgroundDeserializer.INSTANCE, background3);
                        i11 = i24 | 32;
                        list8 = list3;
                        i13 = 12;
                        i16 = 9;
                        i15 = 10;
                        i14 = i11;
                        bool3 = bool2;
                        break;
                    case 6:
                        bool2 = bool3;
                        int i25 = i14;
                        list3 = list8;
                        shape3 = (Shape) cVarB.B(descriptor2, 6, ShapeDeserializer.INSTANCE, shape3);
                        i11 = i25 | 64;
                        list8 = list3;
                        i13 = 12;
                        i16 = 9;
                        i15 = 10;
                        i14 = i11;
                        bool3 = bool2;
                        break;
                    case 7:
                        bool2 = bool3;
                        int i26 = i14;
                        list3 = list8;
                        border3 = (Border) cVarB.B(descriptor2, 7, Border$$serializer.INSTANCE, border3);
                        i11 = i26 | 128;
                        list8 = list3;
                        i13 = 12;
                        i16 = 9;
                        i15 = 10;
                        i14 = i11;
                        bool3 = bool2;
                        break;
                    case 8:
                        bool2 = bool3;
                        int i27 = i14;
                        list3 = list8;
                        shadow3 = (Shadow) cVarB.B(descriptor2, 8, Shadow$$serializer.INSTANCE, shadow3);
                        i11 = i27 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
                        list8 = list3;
                        i13 = 12;
                        i16 = 9;
                        i15 = 10;
                        i14 = i11;
                        bool3 = bool2;
                        break;
                    case 9:
                        bool2 = bool3;
                        int i28 = i14;
                        tabControl3 = (TabsComponent.TabControl) cVarB.e(descriptor2, i16, bVarArr[i16], tabControl3);
                        i11 = i28 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
                        list8 = list8;
                        i13 = 12;
                        i15 = 10;
                        i14 = i11;
                        bool3 = bool2;
                        break;
                    case 10:
                        bool2 = bool3;
                        int i29 = i14;
                        list4 = list8;
                        list7 = (List) cVarB.e(descriptor2, i15, bVarArr[i15], list7);
                        i11 = i29 | IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
                        list8 = list4;
                        i13 = 12;
                        i14 = i11;
                        bool3 = bool2;
                        break;
                    case 11:
                        bool2 = bool3;
                        int i30 = i14;
                        list4 = list8;
                        str2 = (String) cVarB.B(descriptor2, 11, x0.f20253a, str2);
                        i11 = i30 | 2048;
                        list8 = list4;
                        i13 = 12;
                        i14 = i11;
                        bool3 = bool2;
                        break;
                    case SigningManager.NONCE_BYTES_SIZE /* 12 */:
                        bool2 = bool3;
                        list8 = (List) cVarB.e(descriptor2, i17, bVarArr[i17], list8);
                        i14 |= 4096;
                        i13 = i17;
                        bool3 = bool2;
                        break;
                    default:
                        throw new m(i18);
                }
            }
            i10 = i14;
            size = size3;
            tabControl = tabControl3;
            shadow = shadow3;
            border = border3;
            background = background3;
            list = list7;
            shape = shape3;
            colorScheme = colorScheme3;
            bool = bool3;
            str = str2;
            padding = padding7;
            list2 = list8;
            padding2 = padding6;
        }
        int i31 = i10;
        cVarB.c(descriptor2);
        return new TabsComponent(i31, bool, size, padding2, padding, colorScheme, background, shape, border, shadow, tabControl, list, str, list2, (t0) null);
    }

    @Override // Rf.b, Rf.k, Rf.a
    public Tf.e getDescriptor() {
        return descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, TabsComponent value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
        Tf.e descriptor2 = getDescriptor();
        d dVarB = encoder.b(descriptor2);
        TabsComponent.write$Self$purchases_defaultsBc8Release(value, dVarB, descriptor2);
        dVarB.c(descriptor2);
    }

    @Override // Vf.E
    public b[] typeParametersSerializers() {
        return E.a.a(this);
    }
}
