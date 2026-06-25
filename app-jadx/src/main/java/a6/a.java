package A6;

import Td.L;
import com.facebook.imagepipeline.producers.AbstractC3183c;
import com.facebook.imagepipeline.producers.InterfaceC3194n;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.e0;
import com.facebook.imagepipeline.producers.l0;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5504s;
import y5.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends I5.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final l0 f314h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final G6.d f315i;

    /* JADX INFO: renamed from: A6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0004a extends AbstractC3183c {
        C0004a() {
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3183c
        protected void g() {
            a.this.C();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3183c
        protected void h(Throwable throwable) {
            AbstractC5504s.h(throwable, "throwable");
            a.this.D(throwable);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3183c
        protected void i(Object obj, int i10) {
            a aVar = a.this;
            aVar.E(obj, i10, aVar.B());
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC3183c
        protected void j(float f10) {
            a.this.r(f10);
        }
    }

    protected a(d0 producer, l0 settableProducerContext, G6.d requestListener) {
        AbstractC5504s.h(producer, "producer");
        AbstractC5504s.h(settableProducerContext, "settableProducerContext");
        AbstractC5504s.h(requestListener, "requestListener");
        this.f314h = settableProducerContext;
        this.f315i = requestListener;
        if (!L6.b.d()) {
            n(settableProducerContext.getExtras());
            if (L6.b.d()) {
                L6.b.a("AbstractProducerToDataSourceAdapter()->onRequestStart");
                try {
                    requestListener.a(settableProducerContext);
                    L l10 = L.f17438a;
                } finally {
                }
            } else {
                requestListener.a(settableProducerContext);
            }
            if (!L6.b.d()) {
                producer.a(z(), settableProducerContext);
                return;
            }
            L6.b.a("AbstractProducerToDataSourceAdapter()->produceResult");
            try {
                producer.a(z(), settableProducerContext);
                L l11 = L.f17438a;
                return;
            } finally {
            }
        }
        L6.b.a("AbstractProducerToDataSourceAdapter()");
        try {
            n(settableProducerContext.getExtras());
            if (L6.b.d()) {
                L6.b.a("AbstractProducerToDataSourceAdapter()->onRequestStart");
                try {
                    requestListener.a(settableProducerContext);
                    L l12 = L.f17438a;
                    L6.b.b();
                } finally {
                }
            } else {
                requestListener.a(settableProducerContext);
            }
            if (L6.b.d()) {
                L6.b.a("AbstractProducerToDataSourceAdapter()->produceResult");
                try {
                    producer.a(z(), settableProducerContext);
                    L l13 = L.f17438a;
                    L6.b.b();
                } finally {
                }
            } else {
                producer.a(z(), settableProducerContext);
            }
            L l14 = L.f17438a;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void C() {
        k.i(j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(Throwable th2) {
        if (super.p(th2, A(this.f314h))) {
            this.f315i.i(this.f314h, th2);
        }
    }

    private final InterfaceC3194n z() {
        return new C0004a();
    }

    protected final Map A(e0 producerContext) {
        AbstractC5504s.h(producerContext, "producerContext");
        return producerContext.getExtras();
    }

    public final l0 B() {
        return this.f314h;
    }

    protected void E(Object obj, int i10, e0 producerContext) {
        AbstractC5504s.h(producerContext, "producerContext");
        boolean zE = AbstractC3183c.e(i10);
        if (super.t(obj, zE, A(producerContext)) && zE) {
            this.f315i.e(this.f314h);
        }
    }

    @Override // I5.a, I5.c
    public boolean close() {
        if (!super.close()) {
            return false;
        }
        if (super.isFinished()) {
            return true;
        }
        this.f315i.g(this.f314h);
        this.f314h.i();
        return true;
    }
}
