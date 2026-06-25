package Xf;

import Tf.l;
import Tf.m;
import Ud.AbstractC2279u;
import Wf.AbstractC2358b;
import Xf.C2384v;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class E {

    /* JADX INFO: renamed from: a */
    private static final C2384v.a f21901a = new C2384v.a();

    /* JADX INFO: renamed from: b */
    private static final C2384v.a f21902b = new C2384v.a();

    private static final Map b(Tf.e eVar, AbstractC2358b abstractC2358b) {
        String lowerCase;
        String[] strArrNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean zD = d(abstractC2358b, eVar);
        m(eVar, abstractC2358b);
        int iK = eVar.k();
        for (int i10 = 0; i10 < iK; i10++) {
            List listM = eVar.m(i10);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM) {
                if (obj instanceof Wf.x) {
                    arrayList.add(obj);
                }
            }
            Wf.x xVar = (Wf.x) AbstractC2279u.O0(arrayList);
            if (xVar != null && (strArrNames = xVar.names()) != null) {
                for (String lowerCase2 : strArrNames) {
                    if (zD) {
                        lowerCase2 = lowerCase2.toLowerCase(Locale.ROOT);
                        AbstractC5504s.g(lowerCase2, "toLowerCase(...)");
                    }
                    c(linkedHashMap, eVar, lowerCase2, i10);
                }
            }
            if (zD) {
                lowerCase = eVar.l(i10).toLowerCase(Locale.ROOT);
                AbstractC5504s.g(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                c(linkedHashMap, eVar, lowerCase, i10);
            }
        }
        return linkedHashMap.isEmpty() ? Ud.S.i() : linkedHashMap;
    }

    private static final void c(Map map, Tf.e eVar, String str, int i10) {
        String str2 = AbstractC5504s.c(eVar.h(), l.b.f17533a) ? "enum value" : "property";
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i10));
            return;
        }
        throw new B("The suggested name '" + str + "' for " + str2 + ' ' + eVar.l(i10) + " is already one of the names for " + str2 + ' ' + eVar.l(((Number) Ud.S.j(map, str)).intValue()) + " in " + eVar);
    }

    private static final boolean d(AbstractC2358b abstractC2358b, Tf.e eVar) {
        return abstractC2358b.f().h() && AbstractC5504s.c(eVar.h(), l.b.f17533a);
    }

    public static final Map e(final AbstractC2358b abstractC2358b, final Tf.e descriptor) {
        AbstractC5504s.h(abstractC2358b, "<this>");
        AbstractC5504s.h(descriptor, "descriptor");
        return (Map) Wf.G.a(abstractC2358b).b(descriptor, f21901a, new InterfaceC5082a() { // from class: Xf.D
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return E.f(descriptor, abstractC2358b);
            }
        });
    }

    public static final Map f(Tf.e eVar, AbstractC2358b abstractC2358b) {
        return b(eVar, abstractC2358b);
    }

    public static final C2384v.a g() {
        return f21901a;
    }

    public static final String h(Tf.e eVar, AbstractC2358b json, int i10) {
        AbstractC5504s.h(eVar, "<this>");
        AbstractC5504s.h(json, "json");
        m(eVar, json);
        return eVar.l(i10);
    }

    public static final int i(Tf.e eVar, AbstractC2358b json, String name) {
        AbstractC5504s.h(eVar, "<this>");
        AbstractC5504s.h(json, "json");
        AbstractC5504s.h(name, "name");
        if (d(json, eVar)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            AbstractC5504s.g(lowerCase, "toLowerCase(...)");
            return l(eVar, json, lowerCase);
        }
        m(eVar, json);
        int iJ = eVar.j(name);
        return (iJ == -3 && json.f().o()) ? l(eVar, json, name) : iJ;
    }

    public static final int j(Tf.e eVar, AbstractC2358b json, String name, String suffix) {
        AbstractC5504s.h(eVar, "<this>");
        AbstractC5504s.h(json, "json");
        AbstractC5504s.h(name, "name");
        AbstractC5504s.h(suffix, "suffix");
        int i10 = i(eVar, json, name);
        if (i10 != -3) {
            return i10;
        }
        throw new Rf.j(eVar.o() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static /* synthetic */ int k(Tf.e eVar, AbstractC2358b abstractC2358b, String str, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        return j(eVar, abstractC2358b, str, str2);
    }

    private static final int l(Tf.e eVar, AbstractC2358b abstractC2358b, String str) {
        Integer num = (Integer) e(abstractC2358b, eVar).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final Wf.y m(Tf.e eVar, AbstractC2358b json) {
        AbstractC5504s.h(eVar, "<this>");
        AbstractC5504s.h(json, "json");
        if (AbstractC5504s.c(eVar.h(), m.a.f17534a)) {
            json.f().l();
        }
        return null;
    }
}
