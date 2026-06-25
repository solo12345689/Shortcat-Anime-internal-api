package com.revenuecat.purchases.paywalls.components;

import Rf.b;
import Rf.j;
import Tf.e;
import Tf.k;
import Uf.f;
import Wf.AbstractC2358b;
import Wf.C;
import Wf.E;
import Wf.h;
import Wf.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.O;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PaywallComponentSerializer;", "LRf/b;", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "<init>", "()V", "LUf/f;", "encoder", "value", "LTd/L;", "serialize", "(LUf/f;Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;)V", "LUf/e;", "decoder", "deserialize", "(LUf/e;)Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "LTf/e;", "descriptor", "LTf/e;", "getDescriptor", "()LTf/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PaywallComponentSerializer implements b {
    private final e descriptor = k.c("PaywallComponent", new e[0], PaywallComponentSerializer$descriptor$1.INSTANCE);

    @Override // Rf.b, Rf.k, Rf.a
    public e getDescriptor() {
        return this.descriptor;
    }

    @Override // Rf.k
    public void serialize(f encoder, PaywallComponent value) {
        AbstractC5504s.h(encoder, "encoder");
        AbstractC5504s.h(value, "value");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // Rf.a
    public PaywallComponent deserialize(Uf.e decoder) {
        String string;
        E eO;
        AbstractC5504s.h(decoder, "decoder");
        h hVar = decoder instanceof h ? (h) decoder : null;
        if (hVar == null) {
            throw new j("Can only deserialize PaywallComponent from JSON, got: " + O.b(decoder.getClass()));
        }
        C cN = Wf.j.n(hVar.g());
        i iVar = (i) cN.get("type");
        String strB = (iVar == null || (eO = Wf.j.o(iVar)) == null) ? null : eO.b();
        if (strB != null) {
            switch (strB.hashCode()) {
                case -2076650431:
                    if (strB.equals("timeline")) {
                        AbstractC2358b abstractC2358bD = hVar.d();
                        String string2 = cN.toString();
                        abstractC2358bD.a();
                        return (PaywallComponent) abstractC2358bD.d(TimelineComponent.INSTANCE.serializer(), string2);
                    }
                    break;
                case -1896978765:
                    if (strB.equals("tab_control")) {
                        AbstractC2358b abstractC2358bD2 = hVar.d();
                        String string3 = cN.toString();
                        abstractC2358bD2.a();
                        return (PaywallComponent) abstractC2358bD2.d(TabControlComponent.INSTANCE.serializer(), string3);
                    }
                    break;
                case -1822017359:
                    if (strB.equals("sticky_footer")) {
                        AbstractC2358b abstractC2358bD3 = hVar.d();
                        String string4 = cN.toString();
                        abstractC2358bD3.a();
                        return (PaywallComponent) abstractC2358bD3.d(StickyFooterComponent.INSTANCE.serializer(), string4);
                    }
                    break;
                case -1391809488:
                    if (strB.equals("purchase_button")) {
                        AbstractC2358b abstractC2358bD4 = hVar.d();
                        String string5 = cN.toString();
                        abstractC2358bD4.a();
                        return (PaywallComponent) abstractC2358bD4.d(PurchaseButtonComponent.INSTANCE.serializer(), string5);
                    }
                    break;
                case -1377687758:
                    if (strB.equals("button")) {
                        AbstractC2358b abstractC2358bD5 = hVar.d();
                        String string6 = cN.toString();
                        abstractC2358bD5.a();
                        return (PaywallComponent) abstractC2358bD5.d(ButtonComponent.INSTANCE.serializer(), string6);
                    }
                    break;
                case -807062458:
                    if (strB.equals("package")) {
                        AbstractC2358b abstractC2358bD6 = hVar.d();
                        String string7 = cN.toString();
                        abstractC2358bD6.a();
                        return (PaywallComponent) abstractC2358bD6.d(PackageComponent.INSTANCE.serializer(), string7);
                    }
                    break;
                case 2908512:
                    if (strB.equals("carousel")) {
                        AbstractC2358b abstractC2358bD7 = hVar.d();
                        String string8 = cN.toString();
                        abstractC2358bD7.a();
                        return (PaywallComponent) abstractC2358bD7.d(CarouselComponent.INSTANCE.serializer(), string8);
                    }
                    break;
                case 3226745:
                    if (strB.equals("icon")) {
                        AbstractC2358b abstractC2358bD8 = hVar.d();
                        String string9 = cN.toString();
                        abstractC2358bD8.a();
                        return (PaywallComponent) abstractC2358bD8.d(IconComponent.INSTANCE.serializer(), string9);
                    }
                    break;
                case 3552126:
                    if (strB.equals("tabs")) {
                        AbstractC2358b abstractC2358bD9 = hVar.d();
                        String string10 = cN.toString();
                        abstractC2358bD9.a();
                        return (PaywallComponent) abstractC2358bD9.d(TabsComponent.INSTANCE.serializer(), string10);
                    }
                    break;
                case 3556653:
                    if (strB.equals("text")) {
                        AbstractC2358b abstractC2358bD10 = hVar.d();
                        String string11 = cN.toString();
                        abstractC2358bD10.a();
                        return (PaywallComponent) abstractC2358bD10.d(TextComponent.INSTANCE.serializer(), string11);
                    }
                    break;
                case 100313435:
                    if (strB.equals("image")) {
                        AbstractC2358b abstractC2358bD11 = hVar.d();
                        String string12 = cN.toString();
                        abstractC2358bD11.a();
                        return (PaywallComponent) abstractC2358bD11.d(ImageComponent.INSTANCE.serializer(), string12);
                    }
                    break;
                case 109757064:
                    if (strB.equals("stack")) {
                        AbstractC2358b abstractC2358bD12 = hVar.d();
                        String string13 = cN.toString();
                        abstractC2358bD12.a();
                        return (PaywallComponent) abstractC2358bD12.d(StackComponent.INSTANCE.serializer(), string13);
                    }
                    break;
                case 112202875:
                    if (strB.equals("video")) {
                        AbstractC2358b abstractC2358bD13 = hVar.d();
                        String string14 = cN.toString();
                        abstractC2358bD13.a();
                        return (PaywallComponent) abstractC2358bD13.d(VideoComponent.INSTANCE.serializer(), string14);
                    }
                    break;
                case 318201406:
                    if (strB.equals("tab_control_button")) {
                        AbstractC2358b abstractC2358bD14 = hVar.d();
                        String string15 = cN.toString();
                        abstractC2358bD14.a();
                        return (PaywallComponent) abstractC2358bD14.d(TabControlButtonComponent.INSTANCE.serializer(), string15);
                    }
                    break;
                case 827585120:
                    if (strB.equals("tab_control_toggle")) {
                        AbstractC2358b abstractC2358bD15 = hVar.d();
                        String string16 = cN.toString();
                        abstractC2358bD15.a();
                        return (PaywallComponent) abstractC2358bD15.d(TabControlToggleComponent.INSTANCE.serializer(), string16);
                    }
                    break;
                case 1352226353:
                    if (strB.equals("countdown")) {
                        AbstractC2358b abstractC2358bD16 = hVar.d();
                        String string17 = cN.toString();
                        abstractC2358bD16.a();
                        return (PaywallComponent) abstractC2358bD16.d(CountdownComponent.INSTANCE.serializer(), string17);
                    }
                    break;
            }
        }
        i iVar2 = (i) cN.get("fallback");
        if (iVar2 != null) {
            C c10 = iVar2 instanceof C ? (C) iVar2 : null;
            if (c10 != null && (string = c10.toString()) != null) {
                AbstractC2358b abstractC2358bD17 = hVar.d();
                abstractC2358bD17.a();
                PaywallComponent paywallComponent = (PaywallComponent) abstractC2358bD17.d(PaywallComponent.INSTANCE.serializer(), string);
                if (paywallComponent != null) {
                    return paywallComponent;
                }
            }
        }
        throw new j("No fallback provided for unknown type: " + strB);
    }
}
