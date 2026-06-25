package com.facebook.react.uimanager;

import h7.C4921i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f37695a = new i0();

    private i0() {
    }

    public static final Map a() {
        return Ud.S.l(Td.z.a("bubblingEventTypes", h0.f37692b), Td.z.a("directEventTypes", h0.f37693c));
    }

    public static final Map b(z0 resolver) {
        AbstractC5504s.h(resolver, "resolver");
        return Ud.S.p(h0.f37694d, Ud.S.l(Td.z.a("ViewManagerNames", new ArrayList(resolver.a())), Td.z.a("LazyViewManagersEnabled", Boolean.TRUE)));
    }

    public static final Map c(List viewManagers, Map map, Map map2) {
        AbstractC5504s.h(viewManagers, "viewManagers");
        Map mapB = Ud.S.B(h0.f37694d);
        Map map3 = h0.f37692b;
        Map map4 = h0.f37693c;
        if (map != null) {
            map.putAll(map3);
        }
        if (map2 != null) {
            map2.putAll(map4);
        }
        Iterator it = viewManagers.iterator();
        while (it.hasNext()) {
            ViewManager viewManager = (ViewManager) it.next();
            String name = viewManager.getName();
            AbstractC5504s.g(name, "getName(...)");
            Map mapD = d(viewManager, null, null, map, map2);
            if (!mapD.isEmpty()) {
                mapB.put(name, mapD);
            }
        }
        mapB.put("genericBubblingEventTypes", map3);
        mapB.put("genericDirectEventTypes", map4);
        return mapB;
    }

    public static final Map d(ViewManager viewManager, Map map, Map map2, Map map3, Map map4) {
        AbstractC5504s.h(viewManager, "viewManager");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map exportedCustomBubblingEventTypeConstants = viewManager.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants != null) {
            if (C4921i.b() && C4921i.c()) {
                exportedCustomBubblingEventTypeConstants = f37695a.e(exportedCustomBubblingEventTypeConstants);
            }
            i0 i0Var = f37695a;
            i0Var.f(map3, exportedCustomBubblingEventTypeConstants);
            i0Var.f(exportedCustomBubblingEventTypeConstants, map);
            linkedHashMap.put("bubblingEventTypes", exportedCustomBubblingEventTypeConstants);
        } else if (map != null) {
            linkedHashMap.put("bubblingEventTypes", map);
        }
        Map exportedCustomDirectEventTypeConstants = viewManager.getExportedCustomDirectEventTypeConstants();
        i0 i0Var2 = f37695a;
        String name = viewManager.getName();
        AbstractC5504s.g(name, "getName(...)");
        i0Var2.g(name, exportedCustomDirectEventTypeConstants);
        if (exportedCustomDirectEventTypeConstants != null) {
            if (C4921i.b() && C4921i.c()) {
                exportedCustomDirectEventTypeConstants = i0Var2.e(exportedCustomDirectEventTypeConstants);
            }
            i0Var2.f(map4, exportedCustomDirectEventTypeConstants);
            i0Var2.f(exportedCustomDirectEventTypeConstants, map2);
            linkedHashMap.put("directEventTypes", exportedCustomDirectEventTypeConstants);
        } else if (map2 != null) {
            linkedHashMap.put("directEventTypes", map2);
        }
        Map<String, Object> exportedViewConstants = viewManager.getExportedViewConstants();
        if (exportedViewConstants != null) {
            linkedHashMap.put("Constants", exportedViewConstants);
        }
        Map<String, Integer> commandsMap = viewManager.getCommandsMap();
        if (commandsMap != null) {
            linkedHashMap.put("Commands", commandsMap);
        }
        Map<String, String> nativeProps = viewManager.getNativeProps();
        if (!nativeProps.isEmpty()) {
            AbstractC5504s.e(nativeProps);
            linkedHashMap.put("NativeProps", nativeProps);
        }
        return linkedHashMap;
    }

    private final void f(Map map, Map map2) {
        if (map == null || map2 == null || map2.isEmpty()) {
            return;
        }
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            Object obj = map.get(str);
            if (obj != null && kotlin.jvm.internal.V.m(value) && kotlin.jvm.internal.V.m(obj)) {
                if (!(obj instanceof HashMap)) {
                    HashMap map3 = new HashMap((Map) obj);
                    map.replace(str, kotlin.jvm.internal.V.c(map3));
                    obj = map3;
                }
                Map mapC = kotlin.jvm.internal.V.c(obj);
                AbstractC5504s.f(value, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any>");
                f(mapC, kotlin.jvm.internal.V.c(value));
            } else {
                map.put(str, value);
            }
        }
    }

    private final void g(String str, Map map) {
        String str2;
        if (!Y6.a.f22860b || map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            Object value = entry.getValue();
            if (kotlin.jvm.internal.V.m(value) && (str2 = (String) ((Map) value).get("registrationName")) != null && Df.r.Q(str3, "top", false, 2, null) && Df.r.Q(str2, "on", false, 2, null)) {
                String strSubstring = str3.substring(3);
                AbstractC5504s.g(strSubstring, "substring(...)");
                String strSubstring2 = str2.substring(2);
                AbstractC5504s.g(strSubstring2, "substring(...)");
                if (!AbstractC5504s.c(strSubstring, strSubstring2)) {
                    AbstractC7283a.m("UIManagerModuleConstantsHelper", "Direct event name for '" + str + "' doesn't correspond to the naming convention, expected 'topEventName'->'onEventName', got '" + str3 + "'->'" + str2 + "'");
                }
            }
        }
    }

    public final Map e(Map eventsToNormalize) {
        String strSubstring;
        AbstractC5504s.h(eventsToNormalize, "eventsToNormalize");
        HashSet<String> hashSet = new HashSet();
        for (String str : eventsToNormalize.keySet()) {
            if (!Df.r.Q(str, "top", false, 2, null)) {
                hashSet.add(str);
            }
        }
        if (!(eventsToNormalize instanceof HashMap)) {
            eventsToNormalize = new HashMap(eventsToNormalize);
        }
        for (String str2 : hashSet) {
            Object obj = eventsToNormalize.get(str2);
            if (obj == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (Df.r.Q(str2, "on", false, 2, null)) {
                strSubstring = str2.substring(2);
                AbstractC5504s.g(strSubstring, "substring(...)");
            } else {
                String strSubstring2 = str2.substring(0, 1);
                AbstractC5504s.g(strSubstring2, "substring(...)");
                Locale locale = Locale.getDefault();
                AbstractC5504s.g(locale, "getDefault(...)");
                String upperCase = strSubstring2.toUpperCase(locale);
                AbstractC5504s.g(upperCase, "toUpperCase(...)");
                String strSubstring3 = str2.substring(1);
                AbstractC5504s.g(strSubstring3, "substring(...)");
                strSubstring = upperCase + strSubstring3;
            }
            eventsToNormalize.put("top" + strSubstring, obj);
        }
        return eventsToNormalize;
    }
}
