package g;

import Cf.l;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC2857k;
import androidx.lifecycle.InterfaceC2861o;
import androidx.lifecycle.r;
import h.AbstractC4888a;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;
import me.AbstractC5666c;

/* JADX INFO: renamed from: g.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4816f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final b f47132h = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f47133a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f47134b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f47135c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f47136d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient Map f47137e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f47138f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f47139g = new Bundle();

    /* JADX INFO: renamed from: g.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC4812b f47140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AbstractC4888a f47141b;

        public a(InterfaceC4812b callback, AbstractC4888a contract) {
            AbstractC5504s.h(callback, "callback");
            AbstractC5504s.h(contract, "contract");
            this.f47140a = callback;
            this.f47141b = contract;
        }

        public final InterfaceC4812b a() {
            return this.f47140a;
        }

        public final AbstractC4888a b() {
            return this.f47141b;
        }
    }

    /* JADX INFO: renamed from: g.f$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: g.f$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC2857k f47142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f47143b;

        public c(AbstractC2857k lifecycle) {
            AbstractC5504s.h(lifecycle, "lifecycle");
            this.f47142a = lifecycle;
            this.f47143b = new ArrayList();
        }

        public final void a(InterfaceC2861o observer) {
            AbstractC5504s.h(observer, "observer");
            this.f47142a.addObserver(observer);
            this.f47143b.add(observer);
        }

        public final void b() {
            Iterator it = this.f47143b.iterator();
            while (it.hasNext()) {
                this.f47142a.removeObserver((InterfaceC2861o) it.next());
            }
            this.f47143b.clear();
        }
    }

    /* JADX INFO: renamed from: g.f$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class d extends AbstractC5506u implements InterfaceC5082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f47144a = new d();

        d() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        public final Integer invoke() {
            return Integer.valueOf(AbstractC5666c.f53326a.d(2147418112) + 65536);
        }
    }

    /* JADX INFO: renamed from: g.f$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends AbstractC4814d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f47146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC4888a f47147c;

        e(String str, AbstractC4888a abstractC4888a) {
            this.f47146b = str;
            this.f47147c = abstractC4888a;
        }

        @Override // g.AbstractC4814d
        public void b(Object obj, androidx.core.app.c cVar) throws Exception {
            Object obj2 = AbstractC4816f.this.f47134b.get(this.f47146b);
            AbstractC4888a abstractC4888a = this.f47147c;
            if (obj2 != null) {
                int iIntValue = ((Number) obj2).intValue();
                AbstractC4816f.this.f47136d.add(this.f47146b);
                try {
                    AbstractC4816f.this.i(iIntValue, this.f47147c, obj, cVar);
                    return;
                } catch (Exception e10) {
                    AbstractC4816f.this.f47136d.remove(this.f47146b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC4888a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // g.AbstractC4814d
        public void c() {
            AbstractC4816f.this.p(this.f47146b);
        }
    }

    /* JADX INFO: renamed from: g.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0756f extends AbstractC4814d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f47149b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC4888a f47150c;

        C0756f(String str, AbstractC4888a abstractC4888a) {
            this.f47149b = str;
            this.f47150c = abstractC4888a;
        }

        @Override // g.AbstractC4814d
        public void b(Object obj, androidx.core.app.c cVar) throws Exception {
            Object obj2 = AbstractC4816f.this.f47134b.get(this.f47149b);
            AbstractC4888a abstractC4888a = this.f47150c;
            if (obj2 != null) {
                int iIntValue = ((Number) obj2).intValue();
                AbstractC4816f.this.f47136d.add(this.f47149b);
                try {
                    AbstractC4816f.this.i(iIntValue, this.f47150c, obj, cVar);
                    return;
                } catch (Exception e10) {
                    AbstractC4816f.this.f47136d.remove(this.f47149b);
                    throw e10;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC4888a + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }

        @Override // g.AbstractC4814d
        public void c() {
            AbstractC4816f.this.p(this.f47149b);
        }
    }

    private final void d(int i10, String str) {
        this.f47133a.put(Integer.valueOf(i10), str);
        this.f47134b.put(str, Integer.valueOf(i10));
    }

    private final void g(String str, int i10, Intent intent, a aVar) {
        if ((aVar != null ? aVar.a() : null) == null || !this.f47136d.contains(str)) {
            this.f47138f.remove(str);
            this.f47139g.putParcelable(str, new C4811a(i10, intent));
        } else {
            aVar.a().onActivityResult(aVar.b().parseResult(i10, intent));
            this.f47136d.remove(str);
        }
    }

    private final int h() {
        for (Number number : l.n(d.f47144a)) {
            if (!this.f47133a.containsKey(Integer.valueOf(number.intValue()))) {
                return number.intValue();
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(AbstractC4816f this$0, String key, InterfaceC4812b callback, AbstractC4888a contract, r rVar, AbstractC2857k.a event) {
        AbstractC5504s.h(this$0, "this$0");
        AbstractC5504s.h(key, "$key");
        AbstractC5504s.h(callback, "$callback");
        AbstractC5504s.h(contract, "$contract");
        AbstractC5504s.h(rVar, "<anonymous parameter 0>");
        AbstractC5504s.h(event, "event");
        if (AbstractC2857k.a.ON_START != event) {
            if (AbstractC2857k.a.ON_STOP == event) {
                this$0.f47137e.remove(key);
                return;
            } else {
                if (AbstractC2857k.a.ON_DESTROY == event) {
                    this$0.p(key);
                    return;
                }
                return;
            }
        }
        this$0.f47137e.put(key, new a(callback, contract));
        if (this$0.f47138f.containsKey(key)) {
            Object obj = this$0.f47138f.get(key);
            this$0.f47138f.remove(key);
            callback.onActivityResult(obj);
        }
        C4811a c4811a = (C4811a) G1.b.a(this$0.f47139g, key, C4811a.class);
        if (c4811a != null) {
            this$0.f47139g.remove(key);
            callback.onActivityResult(contract.parseResult(c4811a.b(), c4811a.a()));
        }
    }

    private final void o(String str) {
        if (((Integer) this.f47134b.get(str)) != null) {
            return;
        }
        d(h(), str);
    }

    public final boolean e(int i10, int i11, Intent intent) {
        String str = (String) this.f47133a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        g(str, i11, intent, (a) this.f47137e.get(str));
        return true;
    }

    public final boolean f(int i10, Object obj) {
        String str = (String) this.f47133a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        a aVar = (a) this.f47137e.get(str);
        if ((aVar != null ? aVar.a() : null) == null) {
            this.f47139g.remove(str);
            this.f47138f.put(str, obj);
            return true;
        }
        InterfaceC4812b interfaceC4812bA = aVar.a();
        AbstractC5504s.f(interfaceC4812bA, "null cannot be cast to non-null type androidx.activity.result.ActivityResultCallback<O of androidx.activity.result.ActivityResultRegistry.dispatchResult>");
        if (!this.f47136d.remove(str)) {
            return true;
        }
        interfaceC4812bA.onActivityResult(obj);
        return true;
    }

    public abstract void i(int i10, AbstractC4888a abstractC4888a, Object obj, androidx.core.app.c cVar);

    public final void j(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        if (stringArrayList2 != null) {
            this.f47136d.addAll(stringArrayList2);
        }
        Bundle bundle2 = bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
        if (bundle2 != null) {
            this.f47139g.putAll(bundle2);
        }
        int size = stringArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = stringArrayList.get(i10);
            if (this.f47134b.containsKey(str)) {
                Integer num = (Integer) this.f47134b.remove(str);
                if (!this.f47139g.containsKey(str)) {
                    V.c(this.f47133a).remove(num);
                }
            }
            Integer num2 = integerArrayList.get(i10);
            AbstractC5504s.g(num2, "rcs[i]");
            int iIntValue = num2.intValue();
            String str2 = stringArrayList.get(i10);
            AbstractC5504s.g(str2, "keys[i]");
            d(iIntValue, str2);
        }
    }

    public final void k(Bundle outState) {
        AbstractC5504s.h(outState, "outState");
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f47134b.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f47134b.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f47136d));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(this.f47139g));
    }

    public final AbstractC4814d l(final String key, r lifecycleOwner, final AbstractC4888a contract, final InterfaceC4812b callback) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(lifecycleOwner, "lifecycleOwner");
        AbstractC5504s.h(contract, "contract");
        AbstractC5504s.h(callback, "callback");
        AbstractC2857k lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState().b(AbstractC2857k.b.f30238d)) {
            throw new IllegalStateException(("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.getCurrentState() + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        o(key);
        c cVar = (c) this.f47135c.get(key);
        if (cVar == null) {
            cVar = new c(lifecycle);
        }
        cVar.a(new InterfaceC2861o() { // from class: g.e
            @Override // androidx.lifecycle.InterfaceC2861o
            public final void g(r rVar, AbstractC2857k.a aVar) {
                AbstractC4816f.n(this.f47128a, key, callback, contract, rVar, aVar);
            }
        });
        this.f47135c.put(key, cVar);
        return new e(key, contract);
    }

    public final AbstractC4814d m(String key, AbstractC4888a contract, InterfaceC4812b callback) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(contract, "contract");
        AbstractC5504s.h(callback, "callback");
        o(key);
        this.f47137e.put(key, new a(callback, contract));
        if (this.f47138f.containsKey(key)) {
            Object obj = this.f47138f.get(key);
            this.f47138f.remove(key);
            callback.onActivityResult(obj);
        }
        C4811a c4811a = (C4811a) G1.b.a(this.f47139g, key, C4811a.class);
        if (c4811a != null) {
            this.f47139g.remove(key);
            callback.onActivityResult(contract.parseResult(c4811a.b(), c4811a.a()));
        }
        return new C0756f(key, contract);
    }

    public final void p(String key) {
        Integer num;
        AbstractC5504s.h(key, "key");
        if (!this.f47136d.contains(key) && (num = (Integer) this.f47134b.remove(key)) != null) {
            this.f47133a.remove(num);
        }
        this.f47137e.remove(key);
        if (this.f47138f.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + this.f47138f.get(key));
            this.f47138f.remove(key);
        }
        if (this.f47139g.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((C4811a) G1.b.a(this.f47139g, key, C4811a.class)));
            this.f47139g.remove(key);
        }
        c cVar = (c) this.f47135c.get(key);
        if (cVar != null) {
            cVar.b();
            this.f47135c.remove(key);
        }
    }
}
