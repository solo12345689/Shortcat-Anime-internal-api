package u7;

import Df.r;
import U7.a;
import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends G6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f61412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f61413b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f61414c = new LinkedHashMap();

    @Override // G6.a, com.facebook.imagepipeline.producers.h0
    public void a(String requestId, String producerName) {
        AbstractC5504s.h(requestId, "requestId");
        AbstractC5504s.h(producerName, "producerName");
        if (U7.a.j(0L)) {
            Pair pairCreate = Pair.create(Integer.valueOf(this.f61412a), "FRESCO_PRODUCER_" + r.J(producerName, ':', '_', false, 4, null));
            Object second = pairCreate.second;
            AbstractC5504s.g(second, "second");
            U7.a.a(0L, (String) second, this.f61412a);
            this.f61413b.put(requestId, pairCreate);
            this.f61412a++;
        }
    }

    @Override // G6.e
    public void b(K6.b request, String requestId, Throwable throwable, boolean z10) {
        Pair pair;
        AbstractC5504s.h(request, "request");
        AbstractC5504s.h(requestId, "requestId");
        AbstractC5504s.h(throwable, "throwable");
        if (U7.a.j(0L) && (pair = (Pair) this.f61414c.get(requestId)) != null) {
            Object second = pair.second;
            AbstractC5504s.g(second, "second");
            Object first = pair.first;
            AbstractC5504s.g(first, "first");
            U7.a.g(0L, (String) second, ((Number) first).intValue());
            this.f61414c.remove(requestId);
        }
    }

    @Override // G6.a, com.facebook.imagepipeline.producers.h0
    public boolean c(String requestId) {
        AbstractC5504s.h(requestId, "requestId");
        return false;
    }

    @Override // G6.a, com.facebook.imagepipeline.producers.h0
    public void d(String requestId, String producerName, Map map) {
        Pair pair;
        AbstractC5504s.h(requestId, "requestId");
        AbstractC5504s.h(producerName, "producerName");
        if (U7.a.j(0L) && (pair = (Pair) this.f61413b.get(requestId)) != null) {
            Object second = pair.second;
            AbstractC5504s.g(second, "second");
            Object first = pair.first;
            AbstractC5504s.g(first, "first");
            U7.a.g(0L, (String) second, ((Number) first).intValue());
            this.f61413b.remove(requestId);
        }
    }

    @Override // G6.e
    public void e(K6.b request, Object callerContext, String requestId, boolean z10) {
        AbstractC5504s.h(request, "request");
        AbstractC5504s.h(callerContext, "callerContext");
        AbstractC5504s.h(requestId, "requestId");
        if (U7.a.j(0L)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("FRESCO_REQUEST_");
            String string = request.v().toString();
            AbstractC5504s.g(string, "toString(...)");
            sb2.append(r.J(string, ':', '_', false, 4, null));
            Pair pairCreate = Pair.create(Integer.valueOf(this.f61412a), sb2.toString());
            Object second = pairCreate.second;
            AbstractC5504s.g(second, "second");
            U7.a.a(0L, (String) second, this.f61412a);
            this.f61414c.put(requestId, pairCreate);
            this.f61412a++;
        }
    }

    @Override // G6.a, com.facebook.imagepipeline.producers.h0
    public void f(String requestId, String producerName, Throwable t10, Map map) {
        Pair pair;
        AbstractC5504s.h(requestId, "requestId");
        AbstractC5504s.h(producerName, "producerName");
        AbstractC5504s.h(t10, "t");
        if (U7.a.j(0L) && (pair = (Pair) this.f61413b.get(requestId)) != null) {
            Object second = pair.second;
            AbstractC5504s.g(second, "second");
            Object first = pair.first;
            AbstractC5504s.g(first, "first");
            U7.a.g(0L, (String) second, ((Number) first).intValue());
            this.f61413b.remove(requestId);
        }
    }

    @Override // G6.a, com.facebook.imagepipeline.producers.h0
    public void g(String requestId, String producerName, Map map) {
        Pair pair;
        AbstractC5504s.h(requestId, "requestId");
        AbstractC5504s.h(producerName, "producerName");
        if (U7.a.j(0L) && (pair = (Pair) this.f61413b.get(requestId)) != null) {
            Object second = pair.second;
            AbstractC5504s.g(second, "second");
            Object first = pair.first;
            AbstractC5504s.g(first, "first");
            U7.a.g(0L, (String) second, ((Number) first).intValue());
            this.f61413b.remove(requestId);
        }
    }

    @Override // G6.e
    public void i(K6.b request, String requestId, boolean z10) {
        Pair pair;
        AbstractC5504s.h(request, "request");
        AbstractC5504s.h(requestId, "requestId");
        if (U7.a.j(0L) && (pair = (Pair) this.f61414c.get(requestId)) != null) {
            Object second = pair.second;
            AbstractC5504s.g(second, "second");
            Object first = pair.first;
            AbstractC5504s.g(first, "first");
            U7.a.g(0L, (String) second, ((Number) first).intValue());
            this.f61414c.remove(requestId);
        }
    }

    @Override // G6.a, com.facebook.imagepipeline.producers.h0
    public void j(String requestId, String producerName, String eventName) {
        AbstractC5504s.h(requestId, "requestId");
        AbstractC5504s.h(producerName, "producerName");
        AbstractC5504s.h(eventName, "eventName");
        if (U7.a.j(0L)) {
            U7.a.n(0L, "FRESCO_PRODUCER_EVENT_" + r.J(requestId, ':', '_', false, 4, null) + "_" + r.J(producerName, ':', '_', false, 4, null) + "_" + r.J(eventName, ':', '_', false, 4, null), a.EnumC0330a.f19383b);
        }
    }

    @Override // G6.e
    public void k(String requestId) {
        Pair pair;
        AbstractC5504s.h(requestId, "requestId");
        if (U7.a.j(0L) && (pair = (Pair) this.f61414c.get(requestId)) != null) {
            Object second = pair.second;
            AbstractC5504s.g(second, "second");
            Object first = pair.first;
            AbstractC5504s.g(first, "first");
            U7.a.g(0L, (String) second, ((Number) first).intValue());
            this.f61414c.remove(requestId);
        }
    }
}
