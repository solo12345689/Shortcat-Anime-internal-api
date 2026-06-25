package com.revenuecat.purchases.utils;

import Ud.AbstractC2279u;
import Ud.C2272m;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.PackageComponent;
import com.revenuecat.purchases.paywalls.components.PaywallComponent;
import com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.StickyFooterComponent;
import com.revenuecat.purchases.paywalls.components.TabControlButtonComponent;
import com.revenuecat.purchases.paywalls.components.TabsComponent;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a&\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¨\u0006\u0006"}, d2 = {"filter", "", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "predicate", "Lkotlin/Function1;", "", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PaywallComponentFilterExtensionKt {
    public static final List<PaywallComponent> filter(PaywallComponent paywallComponent, Function1 predicate) {
        AbstractC5504s.h(paywallComponent, "<this>");
        AbstractC5504s.h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        C2272m c2272m = new C2272m();
        c2272m.add(paywallComponent);
        while (!c2272m.isEmpty()) {
            PaywallComponent paywallComponent2 = (PaywallComponent) c2272m.removeFirst();
            if (((Boolean) predicate.invoke(paywallComponent2)).booleanValue()) {
                arrayList.add(paywallComponent2);
            }
            if (paywallComponent2 instanceof StackComponent) {
                c2272m.addAll(((StackComponent) paywallComponent2).getComponents());
            } else if (paywallComponent2 instanceof PurchaseButtonComponent) {
                c2272m.add(((PurchaseButtonComponent) paywallComponent2).getStack());
            } else if (paywallComponent2 instanceof ButtonComponent) {
                c2272m.add(((ButtonComponent) paywallComponent2).getStack());
            } else if (paywallComponent2 instanceof PackageComponent) {
                c2272m.add(((PackageComponent) paywallComponent2).getStack());
            } else if (paywallComponent2 instanceof StickyFooterComponent) {
                c2272m.add(((StickyFooterComponent) paywallComponent2).getStack());
            } else if (paywallComponent2 instanceof CarouselComponent) {
                c2272m.addAll(((CarouselComponent) paywallComponent2).getPages());
            } else if (paywallComponent2 instanceof TabControlButtonComponent) {
                c2272m.add(((TabControlButtonComponent) paywallComponent2).getStack());
            } else if (paywallComponent2 instanceof TabsComponent) {
                TabsComponent tabsComponent = (TabsComponent) paywallComponent2;
                TabsComponent.TabControl control = tabsComponent.getControl();
                if (control instanceof TabsComponent.TabControl.Buttons) {
                    c2272m.add(((TabsComponent.TabControl.Buttons) control).getStack());
                } else if (control instanceof TabsComponent.TabControl.Toggle) {
                    c2272m.add(((TabsComponent.TabControl.Toggle) control).getStack());
                }
                List tabs = tabsComponent.getTabs();
                ArrayList arrayList2 = new ArrayList(AbstractC2279u.x(tabs, 10));
                Iterator it = tabs.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((TabsComponent.Tab) it.next()).getStack());
                }
                c2272m.addAll(arrayList2);
            } else if (paywallComponent2 instanceof TimelineComponent) {
                List<TimelineComponent.Item> items = ((TimelineComponent) paywallComponent2).getItems();
                ArrayList arrayList3 = new ArrayList();
                for (TimelineComponent.Item item : items) {
                    AbstractC2279u.D(arrayList3, AbstractC2279u.r(item.getTitle(), item.getDescription(), item.getIcon()));
                }
                c2272m.addAll(arrayList3);
            } else if (paywallComponent2 instanceof CountdownComponent) {
                CountdownComponent countdownComponent = (CountdownComponent) paywallComponent2;
                c2272m.add(countdownComponent.getCountdownStack());
                StackComponent endStack = countdownComponent.getEndStack();
                if (endStack != null) {
                    c2272m.add(endStack);
                }
                StackComponent fallback = countdownComponent.getFallback();
                if (fallback != null) {
                    c2272m.add(fallback);
                }
            }
        }
        return arrayList;
    }
}
