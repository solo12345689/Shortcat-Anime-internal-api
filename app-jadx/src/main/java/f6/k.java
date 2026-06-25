package f6;

import Td.L;
import a6.InterfaceC2583d;
import e6.C4655c;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f46937d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ConcurrentHashMap f46938e = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w6.d f46939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f46940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f46941c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Date until) {
            AbstractC5504s.h(until, "until");
            synchronized (k.f46938e) {
                try {
                    ConcurrentHashMap concurrentHashMap = k.f46938e;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry entry : concurrentHashMap.entrySet()) {
                        if (((m) entry.getValue()).b().compareTo(until) < 0) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        ((m) entry2.getValue()).a().clear();
                        k.f46938e.remove(entry2.getKey());
                    }
                    L l10 = L.f17438a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void b(String cacheKey, j frameLoader) {
            AbstractC5504s.h(cacheKey, "cacheKey");
            AbstractC5504s.h(frameLoader, "frameLoader");
            k.f46938e.put(cacheKey, new m(frameLoader, new Date()));
        }

        private a() {
        }
    }

    public k(w6.d platformBitmapFactory, int i10, int i11) {
        AbstractC5504s.h(platformBitmapFactory, "platformBitmapFactory");
        this.f46939a = platformBitmapFactory;
        this.f46940b = i10;
        this.f46941c = i11;
    }

    public final j b(String cacheKey, b6.c bitmapFrameRenderer, InterfaceC2583d animationInformation) {
        AbstractC5504s.h(cacheKey, "cacheKey");
        AbstractC5504s.h(bitmapFrameRenderer, "bitmapFrameRenderer");
        AbstractC5504s.h(animationInformation, "animationInformation");
        ConcurrentHashMap concurrentHashMap = f46938e;
        synchronized (concurrentHashMap) {
            m mVar = (m) concurrentHashMap.get(cacheKey);
            if (mVar == null) {
                L l10 = L.f17438a;
                return new g(this.f46939a, bitmapFrameRenderer, new C4655c(this.f46940b), animationInformation, this.f46941c);
            }
            concurrentHashMap.remove(cacheKey);
            return mVar.a();
        }
    }
}
