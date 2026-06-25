package com.amazon.a.a.m;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class b implements com.amazon.a.a.e.b<a> {

    /* JADX INFO: renamed from: a */
    private static final com.amazon.a.a.o.c f34457a = new com.amazon.a.a.o.c("ExpirableValueDataStore");

    /* JADX INFO: renamed from: b */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.k.b f34458b;

    /* JADX INFO: renamed from: c */
    private final Map<String, a> f34459c = new HashMap();

    /* JADX INFO: renamed from: com.amazon.a.a.m.b$1 */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class AnonymousClass1 extends a {
        AnonymousClass1(Object obj, Date date) {
            super(obj, date);
        }

        @Override // com.amazon.a.a.e.a
        protected void d() {
            if (com.amazon.a.a.o.c.f34700b) {
                b.f34457a.b("Woah, non-expirable value was expired!!!!");
            }
        }
    }

    public synchronized <T> T b(String str) {
        try {
            if (com.amazon.a.a.o.c.f34699a) {
                f34457a.a("Fetching value: " + str);
            }
            a aVar = this.f34459c.get(str);
            if (aVar != null) {
                return (T) aVar.h();
            }
            if (com.amazon.a.a.o.c.f34699a) {
                f34457a.a("Value not present in store, returning null");
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void c(String str) {
        try {
            a aVar = this.f34459c.get(str);
            if (aVar == null) {
                return;
            }
            if (com.amazon.a.a.o.c.f34699a) {
                f34457a.a("Removing value associated with key: " + str + ", value: " + aVar);
            }
            this.f34459c.remove(str);
            aVar.f();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public String toString() {
        return this.f34459c.toString();
    }

    public synchronized boolean a(String str) {
        return b(str) != null;
    }

    public synchronized void a(String str, a aVar) {
        try {
            com.amazon.a.a.o.a.a.a((Object) str, SubscriberAttributeKt.JSON_NAME_KEY);
            com.amazon.a.a.o.a.a.a((Object) aVar, "value");
            if (com.amazon.a.a.o.c.f34699a) {
                f34457a.a("Placing value into store with key: " + str + ", expiration: " + aVar.a());
            }
            this.f34458b.b(aVar);
            aVar.a(this);
            this.f34459c.put(str, aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized <T> void a(String str, T t10) {
        try {
            if (com.amazon.a.a.o.c.f34699a) {
                f34457a.a("Placing non-expiring value into store with key: " + str);
            }
            this.f34459c.put(str, new a(t10, new Date()) { // from class: com.amazon.a.a.m.b.1
                AnonymousClass1(Object t102, Date date) {
                    super(t102, date);
                }

                @Override // com.amazon.a.a.e.a
                protected void d() {
                    if (com.amazon.a.a.o.c.f34700b) {
                        b.f34457a.b("Woah, non-expirable value was expired!!!!");
                    }
                }
            });
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.amazon.a.a.e.b
    public synchronized void a(a aVar) {
        try {
            if (com.amazon.a.a.o.c.f34699a) {
                f34457a.a("Observed expiration: " + aVar + " removing from store!");
            }
            Iterator<Map.Entry<String, a>> it = this.f34459c.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue() == aVar) {
                    if (com.amazon.a.a.o.c.f34699a) {
                        f34457a.a("Removing entry from store: " + aVar);
                    }
                    it.remove();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
