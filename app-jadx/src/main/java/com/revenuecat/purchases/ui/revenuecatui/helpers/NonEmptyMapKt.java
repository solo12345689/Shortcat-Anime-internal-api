package com.revenuecat.purchases.ui.revenuecatui.helpers;

import Td.L;
import Ud.S;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\u001ae\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00050\u0007\"\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005H\u0000¢\u0006\u0002\u0010\b\u001aH\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\nH\u0000\u001a2\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\nH\u0000¨\u0006\f"}, d2 = {"nonEmptyMapOf", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;", "K", "V", "entry", "Lkotlin/Pair;", "t", "", "(Lkotlin/Pair;[Lkotlin/Pair;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;", "map", "", "toNonEmptyMapOrNull", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class NonEmptyMapKt {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.helpers.NonEmptyMapKt$toNonEmptyMapOrNull$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"K", "V", "", "<name for destructuring parameter 0>", "LTd/L;", "invoke", "(Ljava/util/Map$Entry;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends AbstractC5506u implements Function1 {
        final /* synthetic */ LinkedHashMap $remaining;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LinkedHashMap linkedHashMap) {
            super(1);
            this.$remaining = linkedHashMap;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Map.Entry) obj);
            return L.f17438a;
        }

        public final void invoke(Map.Entry entry) {
            AbstractC5504s.h(entry, "<name for destructuring parameter 0>");
            this.$remaining.put(entry.getKey(), entry.getValue());
        }
    }

    public static final /* synthetic */ NonEmptyMap nonEmptyMapOf(Pair entry, Pair... t10) {
        AbstractC5504s.h(entry, "entry");
        AbstractC5504s.h(t10, "t");
        return new NonEmptyMap(entry, S.z(t10));
    }

    public static final /* synthetic */ NonEmptyMap toNonEmptyMapOrNull(Map map) {
        AbstractC5504s.h(map, "<this>");
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size() - 1);
        final AnonymousClass1 anonymousClass1 = new AnonymousClass1(linkedHashMap);
        it.forEachRemaining(new Consumer() { // from class: com.revenuecat.purchases.ui.revenuecatui.helpers.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                anonymousClass1.invoke(obj);
            }
        });
        return new NonEmptyMap(new Pair(entry.getKey(), entry.getValue()), linkedHashMap);
    }

    public static final /* synthetic */ NonEmptyMap nonEmptyMapOf(Pair entry, Map map) {
        AbstractC5504s.h(entry, "entry");
        AbstractC5504s.h(map, "map");
        return new NonEmptyMap(entry, map);
    }
}
