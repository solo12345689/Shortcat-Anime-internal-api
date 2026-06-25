package G6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f7395a;

    public c(Set set) {
        this.f7395a = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar != null) {
                this.f7395a.add(eVar);
            }
        }
    }

    private void l(String str, Throwable th2) {
        AbstractC7283a.n("ForwardingRequestListener", str, th2);
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void a(String str, String str2) {
        int size = this.f7395a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f7395a.get(i10)).a(str, str2);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerStart", e10);
            }
        }
    }

    @Override // G6.e
    public void b(K6.b bVar, String str, Throwable th2, boolean z10) {
        int size = this.f7395a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f7395a.get(i10)).b(bVar, str, th2, z10);
            } catch (Exception e10) {
                l("InternalListener exception in onRequestFailure", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public boolean c(String str) {
        int size = this.f7395a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((e) this.f7395a.get(i10)).c(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void d(String str, String str2, Map map) {
        int size = this.f7395a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f7395a.get(i10)).d(str, str2, map);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    @Override // G6.e
    public void e(K6.b bVar, Object obj, String str, boolean z10) {
        int size = this.f7395a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f7395a.get(i10)).e(bVar, obj, str, z10);
            } catch (Exception e10) {
                l("InternalListener exception in onRequestStart", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void f(String str, String str2, Throwable th2, Map map) {
        int size = this.f7395a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f7395a.get(i10)).f(str, str2, th2, map);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerFinishWithFailure", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void g(String str, String str2, Map map) {
        int size = this.f7395a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f7395a.get(i10)).g(str, str2, map);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerFinishWithCancellation", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void h(String str, String str2, boolean z10) {
        int size = this.f7395a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f7395a.get(i10)).h(str, str2, z10);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    @Override // G6.e
    public void i(K6.b bVar, String str, boolean z10) {
        int size = this.f7395a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f7395a.get(i10)).i(bVar, str, z10);
            } catch (Exception e10) {
                l("InternalListener exception in onRequestSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void j(String str, String str2, String str3) {
        int size = this.f7395a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f7395a.get(i10)).j(str, str2, str3);
            } catch (Exception e10) {
                l("InternalListener exception in onIntermediateChunkStart", e10);
            }
        }
    }

    @Override // G6.e
    public void k(String str) {
        int size = this.f7395a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f7395a.get(i10)).k(str);
            } catch (Exception e10) {
                l("InternalListener exception in onRequestCancellation", e10);
            }
        }
    }

    public c(e... eVarArr) {
        this.f7395a = new ArrayList(eVarArr.length);
        for (e eVar : eVarArr) {
            if (eVar != null) {
                this.f7395a.add(eVar);
            }
        }
    }
}
