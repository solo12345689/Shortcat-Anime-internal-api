package M3;

import Td.AbstractC2163n;
import ie.InterfaceC5082a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f12220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f12221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f12222c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a extends AbstractC5506u implements InterfaceC5082a {
        a() {
            super(0);
        }

        @Override // ie.InterfaceC5082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S3.k invoke() {
            return w.this.d();
        }
    }

    public w(q database) {
        AbstractC5504s.h(database, "database");
        this.f12220a = database;
        this.f12221b = new AtomicBoolean(false);
        this.f12222c = AbstractC2163n.b(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final S3.k d() {
        return this.f12220a.f(e());
    }

    private final S3.k f() {
        return (S3.k) this.f12222c.getValue();
    }

    private final S3.k g(boolean z10) {
        return z10 ? f() : d();
    }

    public S3.k b() {
        c();
        return g(this.f12221b.compareAndSet(false, true));
    }

    protected void c() {
        this.f12220a.c();
    }

    protected abstract String e();

    public void h(S3.k statement) {
        AbstractC5504s.h(statement, "statement");
        if (statement == f()) {
            this.f12221b.set(false);
        }
    }
}
