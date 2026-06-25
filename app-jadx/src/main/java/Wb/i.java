package Wb;

import Td.L;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.AbstractC2857k;
import androidx.lifecycle.InterfaceC2861o;
import androidx.lifecycle.r;
import g.C4811a;
import g.C4818h;
import g.InterfaceC4812b;
import ic.InterfaceC5068b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a */
    private final InterfaceC5068b f20817a;

    /* JADX INFO: renamed from: b */
    private Random f20818b;

    /* JADX INFO: renamed from: c */
    private final Map f20819c;

    /* JADX INFO: renamed from: d */
    private final Map f20820d;

    /* JADX INFO: renamed from: e */
    private final Map f20821e;

    /* JADX INFO: renamed from: f */
    private ArrayList f20822f;

    /* JADX INFO: renamed from: g */
    private final Map f20823g;

    /* JADX INFO: renamed from: h */
    private final Map f20824h;

    /* JADX INFO: renamed from: i */
    private final Bundle f20825i;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {

        /* JADX INFO: renamed from: a */
        private final e f20826a;

        /* JADX INFO: renamed from: b */
        private final InterfaceC4812b f20827b;

        /* JADX INFO: renamed from: c */
        private final Wb.d f20828c;

        public a(e fallbackCallback, InterfaceC4812b interfaceC4812b, Wb.d contract) {
            AbstractC5504s.h(fallbackCallback, "fallbackCallback");
            AbstractC5504s.h(contract, "contract");
            this.f20826a = fallbackCallback;
            this.f20827b = interfaceC4812b;
            this.f20828c = contract;
        }

        public final Wb.d a() {
            return this.f20828c;
        }

        public final e b() {
            return this.f20826a;
        }

        public final InterfaceC4812b c() {
            return this.f20827b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC5504s.c(this.f20826a, aVar.f20826a) && AbstractC5504s.c(this.f20827b, aVar.f20827b) && AbstractC5504s.c(this.f20828c, aVar.f20828c);
        }

        public int hashCode() {
            int iHashCode = this.f20826a.hashCode() * 31;
            InterfaceC4812b interfaceC4812b = this.f20827b;
            return ((iHashCode + (interfaceC4812b == null ? 0 : interfaceC4812b.hashCode())) * 31) + this.f20828c.hashCode();
        }

        public String toString() {
            return "CallbacksAndContract(fallbackCallback=" + this.f20826a + ", mainCallback=" + this.f20827b + ", contract=" + this.f20828c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final AbstractC2857k f20829a;

        /* JADX INFO: renamed from: b */
        private final ArrayList f20830b;

        public b(AbstractC2857k lifecycle) {
            AbstractC5504s.h(lifecycle, "lifecycle");
            this.f20829a = lifecycle;
            this.f20830b = new ArrayList();
        }

        public final void a(InterfaceC2861o observer) {
            AbstractC5504s.h(observer, "observer");
            this.f20829a.addObserver(observer);
            this.f20830b.add(observer);
        }

        public final void b() {
            Iterator it = this.f20830b.iterator();
            while (it.hasNext()) {
                this.f20829a.removeObserver((InterfaceC2861o) it.next());
            }
            this.f20830b.clear();
        }

        public final AbstractC2857k c() {
            return this.f20829a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f20831a;

        static {
            int[] iArr = new int[AbstractC2857k.a.values().length];
            try {
                iArr[AbstractC2857k.a.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC2857k.a.ON_DESTROY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f20831a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d extends f {

        /* JADX INFO: renamed from: a */
        private final Wb.d f20832a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Wb.d f20833b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ i f20834c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ String f20835d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ e f20836e;

        d(Wb.d dVar, i iVar, String str, e eVar) {
            this.f20833b = dVar;
            this.f20834c = iVar;
            this.f20835d = str;
            this.f20836e = eVar;
            this.f20832a = dVar;
        }

        @Override // Wb.f
        public void b(Serializable input, InterfaceC4812b callback) throws Exception {
            AbstractC5504s.h(input, "input");
            AbstractC5504s.h(callback, "callback");
            Integer num = (Integer) this.f20834c.f20820d.get(this.f20835d);
            if (num == null) {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f20833b + " and input " + input + ". You must ensure the ActivityResultLauncher is registered before calling launch()");
            }
            int iIntValue = num.intValue();
            this.f20834c.f20823g.put(this.f20835d, new a(this.f20836e, callback, this.f20833b));
            this.f20834c.f20824h.put(this.f20835d, input);
            this.f20834c.f20822f.add(this.f20835d);
            try {
                this.f20834c.k(iIntValue, this.f20833b, input);
            } catch (Exception e10) {
                this.f20834c.f20822f.remove(this.f20835d);
                throw e10;
            }
        }
    }

    public i(InterfaceC5068b currentActivityProvider) {
        AbstractC5504s.h(currentActivityProvider, "currentActivityProvider");
        this.f20817a = currentActivityProvider;
        this.f20818b = new Random();
        this.f20819c = new HashMap();
        this.f20820d = new HashMap();
        this.f20821e = new HashMap();
        this.f20822f = new ArrayList();
        this.f20823g = new HashMap();
        this.f20824h = new HashMap();
        this.f20825i = new Bundle();
    }

    private final void h(String str, int i10, Intent intent, a aVar) {
        AbstractC2857k abstractC2857kC;
        b bVar = (b) this.f20821e.get(str);
        AbstractC2857k.b currentState = (bVar == null || (abstractC2857kC = bVar.c()) == null) ? null : abstractC2857kC.getCurrentState();
        if ((aVar != null ? aVar.c() : null) != null && this.f20822f.contains(str)) {
            Object obj = this.f20824h.get(str);
            AbstractC5504s.f(obj, "null cannot be cast to non-null type I of expo.modules.kotlin.activityresult.AppContextActivityResultRegistry.doDispatch");
            aVar.c().onActivityResult(aVar.a().a((Serializable) obj, i10, intent));
            this.f20822f.remove(str);
            return;
        }
        if (currentState == null || !currentState.b(AbstractC2857k.b.f30238d) || aVar == null || !this.f20822f.contains(str)) {
            this.f20825i.putParcelable(str, new C4811a(i10, intent));
            return;
        }
        Object obj2 = this.f20824h.get(str);
        AbstractC5504s.f(obj2, "null cannot be cast to non-null type I of expo.modules.kotlin.activityresult.AppContextActivityResultRegistry.doDispatch");
        Serializable serializable = (Serializable) obj2;
        aVar.b().a(serializable, aVar.a().a(serializable, i10, intent));
        this.f20822f.remove(str);
    }

    private final int i() {
        int iNextInt = this.f20818b.nextInt(2147418112);
        while (true) {
            int i10 = iNextInt + 65536;
            if (!this.f20819c.containsKey(Integer.valueOf(i10))) {
                return i10;
            }
            iNextInt = this.f20818b.nextInt(2147418112);
        }
    }

    private final androidx.appcompat.app.c j() {
        Activity activityA = this.f20817a.a();
        androidx.appcompat.app.c cVar = activityA instanceof androidx.appcompat.app.c ? (androidx.appcompat.app.c) activityA : null;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException("Current Activity is not available at the moment");
    }

    public static final void l(i iVar, int i10, IntentSender.SendIntentException sendIntentException) {
        iVar.g(i10, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
    }

    public static final void o(i iVar, String str, r rVar, AbstractC2857k.a event) {
        AbstractC5504s.h(rVar, "<unused var>");
        AbstractC5504s.h(event, "event");
        int i10 = c.f20831a[event.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            iVar.q(str);
            return;
        }
        a aVar = (a) iVar.f20823g.get(str);
        if (aVar == null) {
            return;
        }
        Bundle bundle = iVar.f20825i;
        C4811a c4811a = (C4811a) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable(str, C4811a.class) : bundle.getParcelable(str));
        if (c4811a != null) {
            iVar.f20825i.remove(str);
            Object obj = iVar.f20824h.get(str);
            AbstractC5504s.f(obj, "null cannot be cast to non-null type I of expo.modules.kotlin.activityresult.AppContextActivityResultRegistry.register");
            Serializable serializable = (Serializable) obj;
            Object objA = aVar.a().a(serializable, c4811a.b(), c4811a.a());
            if (aVar.c() != null) {
                aVar.c().onActivityResult(objA);
            } else {
                aVar.b().a(serializable, objA);
            }
        }
    }

    public final boolean g(int i10, int i11, Intent intent) {
        String str = (String) this.f20819c.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        h(str, i11, intent, (a) this.f20823g.get(str));
        return true;
    }

    public final void k(int i10, Wb.d contract, Serializable input) {
        Bundle bundleExtra;
        int i11;
        final int i12;
        AbstractC5504s.h(contract, "contract");
        AbstractC5504s.h(input, "input");
        Intent intentB = contract.b(j(), input);
        if (intentB.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentB.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentB.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        String action = intentB.getAction();
        if (action == null) {
            i11 = i10;
        } else {
            int iHashCode = action.hashCode();
            if (iHashCode != -1837081951) {
                if (iHashCode == -591152331 && action.equals("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST")) {
                    Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intentB.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", C4818h.class) : intentB.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                    AbstractC5504s.e(parcelableExtra);
                    C4818h c4818h = (C4818h) parcelableExtra;
                    try {
                        i12 = i10;
                        try {
                            androidx.core.app.b.w(j(), c4818h.d(), i12, c4818h.a(), c4818h.b(), c4818h.c(), 0, bundle);
                            L l10 = L.f17438a;
                            return;
                        } catch (IntentSender.SendIntentException e10) {
                            e = e10;
                            final IntentSender.SendIntentException sendIntentException = e;
                            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: Wb.h
                                @Override // java.lang.Runnable
                                public final void run() {
                                    i.l(this.f20814a, i12, sendIntentException);
                                }
                            });
                            return;
                        }
                    } catch (IntentSender.SendIntentException e11) {
                        e = e11;
                        i12 = i10;
                    }
                }
                i11 = i10;
            } else {
                i11 = i10;
                if (action.equals("androidx.activity.result.contract.action.REQUEST_PERMISSIONS")) {
                    String[] stringArrayExtra = intentB.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    if (stringArrayExtra == null) {
                        stringArrayExtra = new String[0];
                    }
                    androidx.core.app.b.t(j(), stringArrayExtra, i11);
                    return;
                }
            }
        }
        androidx.core.app.b.v(j(), intentB, i11, bundle);
    }

    public final void m(Context context) {
        AbstractC5504s.h(context, "context");
        k kVarE = new k(context).d("launchedKeys", this.f20822f).e("keyToRequestCode", this.f20820d);
        Map map = this.f20824h;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (this.f20822f.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        kVarE.f("keyToParamsForFallbackCallback", linkedHashMap).b("pendingResult", this.f20825i).c("random", this.f20818b).h();
    }

    public final f n(final String key, r lifecycleOwner, Wb.d contract, e fallbackCallback) {
        AbstractC5504s.h(key, "key");
        AbstractC5504s.h(lifecycleOwner, "lifecycleOwner");
        AbstractC5504s.h(contract, "contract");
        AbstractC5504s.h(fallbackCallback, "fallbackCallback");
        AbstractC2857k lifecycle = lifecycleOwner.getLifecycle();
        this.f20823g.put(key, new a(fallbackCallback, null, contract));
        if (this.f20820d.get(key) == null) {
            int i10 = i();
            this.f20819c.put(Integer.valueOf(i10), key);
            this.f20820d.put(key, Integer.valueOf(i10));
            L l10 = L.f17438a;
        }
        InterfaceC2861o interfaceC2861o = new InterfaceC2861o() { // from class: Wb.g
            @Override // androidx.lifecycle.InterfaceC2861o
            public final void g(r rVar, AbstractC2857k.a aVar) {
                i.o(this.f20812a, key, rVar, aVar);
            }
        };
        b bVar = (b) this.f20821e.get(key);
        if (bVar == null) {
            bVar = new b(lifecycle);
        }
        bVar.a(interfaceC2861o);
        this.f20821e.put(key, bVar);
        return new d(contract, this, key, fallbackCallback);
    }

    public final void p(Context context) {
        AbstractC5504s.h(context, "context");
        k kVar = new k(context);
        ArrayList arrayListL = kVar.l("launchedKeys");
        if (arrayListL != null) {
            this.f20822f = arrayListL;
        }
        Map mapN = kVar.n("keyToParamsForFallbackCallback");
        if (mapN != null) {
            this.f20824h.putAll(mapN);
        }
        Bundle bundleI = kVar.i("pendingResult");
        if (bundleI != null) {
            this.f20825i.putAll(bundleI);
        }
        Serializable serializableK = kVar.k("random");
        if (serializableK != null) {
            this.f20818b = (Random) serializableK;
        }
        Map mapM = kVar.m("keyToRequestCode");
        if (mapM != null) {
            for (Map.Entry entry : mapM.entrySet()) {
                String str = (String) entry.getKey();
                int iIntValue = ((Number) entry.getValue()).intValue();
                this.f20820d.put(str, Integer.valueOf(iIntValue));
                this.f20819c.put(Integer.valueOf(iIntValue), str);
            }
        }
    }

    public final void q(String key) {
        Integer num;
        AbstractC5504s.h(key, "key");
        if (!this.f20822f.contains(key) && (num = (Integer) this.f20820d.remove(key)) != null) {
        }
        this.f20823g.remove(key);
        if (this.f20825i.containsKey(key)) {
            Bundle bundle = this.f20825i;
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + " : " + (Build.VERSION.SDK_INT >= 33 ? (Parcelable) bundle.getParcelable(key, C4811a.class) : bundle.getParcelable(key)));
            this.f20825i.remove(key);
        }
        b bVar = (b) this.f20821e.get(key);
        if (bVar != null) {
            bVar.b();
        }
    }
}
