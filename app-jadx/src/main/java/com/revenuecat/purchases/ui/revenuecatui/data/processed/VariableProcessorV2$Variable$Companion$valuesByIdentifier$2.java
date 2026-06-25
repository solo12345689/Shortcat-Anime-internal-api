package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import Ud.S;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessorV2;
import ie.InterfaceC5082a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5506u;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/revenuecat/purchases/ui/revenuecatui/data/processed/VariableProcessorV2$Variable;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class VariableProcessorV2$Variable$Companion$valuesByIdentifier$2 extends AbstractC5506u implements InterfaceC5082a {
    public static final VariableProcessorV2$Variable$Companion$valuesByIdentifier$2 INSTANCE = new VariableProcessorV2$Variable$Companion$valuesByIdentifier$2();

    VariableProcessorV2$Variable$Companion$valuesByIdentifier$2() {
        super(0);
    }

    @Override // ie.InterfaceC5082a
    public final Map<String, VariableProcessorV2.Variable> invoke() {
        VariableProcessorV2.Variable[] variableArrValues = VariableProcessorV2.Variable.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(S.e(variableArrValues.length), 16));
        for (VariableProcessorV2.Variable variable : variableArrValues) {
            linkedHashMap.put(variable.getIdentifier(), variable);
        }
        return linkedHashMap;
    }
}
