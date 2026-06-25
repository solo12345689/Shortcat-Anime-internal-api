package com.revenuecat.purchases.utils;

import Td.z;
import Ud.AbstractC2279u;
import Ud.S;
import Wf.C;
import Wf.C2359c;
import Wf.E;
import Wf.i;
import Wf.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import oe.AbstractC5874j;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a#\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\b\u001a\u0004\u0018\u00010\u0003*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"LWf/i;", "", "", "", "asMap", "(LWf/i;)Ljava/util/Map;", "getExtractedContent", "(LWf/i;)Ljava/lang/Object;", "extractedContent", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class JsonElementExtensionsKt {
    public static final Map<String, Object> asMap(i iVar) {
        AbstractC5504s.h(iVar, "<this>");
        if (!(iVar instanceof C)) {
            return null;
        }
        Set<Map.Entry<String, i>> setEntrySet = j.n(iVar).entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(S.e(AbstractC2279u.x(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pairA = z.a(entry.getKey(), getExtractedContent((i) entry.getValue()));
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        return linkedHashMap;
    }

    private static final Object getExtractedContent(i iVar) {
        if (iVar instanceof E) {
            E eO = j.o(iVar);
            if (eO.d()) {
                return eO.b();
            }
            Object objE = j.e(eO);
            return (objE == null && (objE = j.l(eO)) == null && (objE = j.r(eO)) == null && (objE = j.j(eO)) == null && (objE = j.h(eO)) == null) ? j.f(eO) : objE;
        }
        if (iVar instanceof C2359c) {
            C2359c c2359cM = j.m(iVar);
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(c2359cM, 10));
            Iterator<i> it = c2359cM.iterator();
            while (it.hasNext()) {
                arrayList.add(getExtractedContent(it.next()));
            }
            return arrayList;
        }
        if (!(iVar instanceof C)) {
            return null;
        }
        Set<Map.Entry<String, i>> setEntrySet = j.n(iVar).entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5874j.e(S.e(AbstractC2279u.x(setEntrySet, 10)), 16));
        Iterator<T> it2 = setEntrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Pair pairA = z.a(entry.getKey(), getExtractedContent((i) entry.getValue()));
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        return linkedHashMap;
    }
}
