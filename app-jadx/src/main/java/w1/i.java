package W1;

import Td.L;
import Td.v;
import Ud.AbstractC2279u;
import X1.f;
import ae.AbstractC2605b;
import android.content.Context;
import ie.InterfaceC5096o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set f20636a = new LinkedHashSet();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends l implements InterfaceC5096o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f20638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f20639c;

        a(Zd.e eVar) {
            super(3, eVar);
        }

        @Override // ie.InterfaceC5096o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(V1.c cVar, X1.f fVar, Zd.e eVar) {
            a aVar = new a(eVar);
            aVar.f20638b = cVar;
            aVar.f20639c = fVar;
            return aVar.invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f20637a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            V1.c cVar = (V1.c) this.f20638b;
            X1.f fVar = (X1.f) this.f20639c;
            Set setKeySet = fVar.a().keySet();
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((f.a) it.next()).a());
            }
            Map mapA = cVar.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapA.entrySet()) {
                if (!arrayList.contains((String) entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            X1.c cVarC = fVar.c();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str = (String) entry2.getKey();
                Object value = entry2.getValue();
                if (value instanceof Boolean) {
                    cVarC.i(X1.i.a(str), value);
                } else if (value instanceof Float) {
                    cVarC.i(X1.i.d(str), value);
                } else if (value instanceof Integer) {
                    cVarC.i(X1.i.e(str), value);
                } else if (value instanceof Long) {
                    cVarC.i(X1.i.f(str), value);
                } else if (value instanceof String) {
                    cVarC.i(X1.i.g(str), value);
                } else if (value instanceof Set) {
                    f.a aVarH = X1.i.h(str);
                    AbstractC5504s.f(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
                    cVarC.i(aVarH, (Set) value);
                }
            }
            return cVarC.d();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b extends l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f20640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f20641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Set f20642c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Set set, Zd.e eVar) {
            super(2, eVar);
            this.f20642c = set;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(X1.f fVar, Zd.e eVar) {
            return ((b) create(fVar, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            b bVar = new b(this.f20642c, eVar);
            bVar.f20641b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f20640a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v.b(obj);
            Set setKeySet = ((X1.f) this.f20641b).a().keySet();
            ArrayList arrayList = new ArrayList(AbstractC2279u.x(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(((f.a) it.next()).a());
            }
            boolean z10 = true;
            if (this.f20642c != i.c()) {
                Set set = this.f20642c;
                if ((set instanceof Collection) && set.isEmpty()) {
                    z10 = false;
                } else {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (!arrayList.contains((String) it2.next())) {
                            break;
                        }
                    }
                    z10 = false;
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }
    }

    public static final V1.a a(Context context, String sharedPreferencesName, Set keysToMigrate) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(sharedPreferencesName, "sharedPreferencesName");
        AbstractC5504s.h(keysToMigrate, "keysToMigrate");
        return keysToMigrate == f20636a ? new V1.a(context, sharedPreferencesName, null, e(keysToMigrate), d(), 4, null) : new V1.a(context, sharedPreferencesName, keysToMigrate, e(keysToMigrate), d());
    }

    public static /* synthetic */ V1.a b(Context context, String str, Set set, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            set = f20636a;
        }
        return a(context, str, set);
    }

    public static final Set c() {
        return f20636a;
    }

    private static final InterfaceC5096o d() {
        return new a(null);
    }

    private static final Function2 e(Set set) {
        return new b(set, null);
    }
}
