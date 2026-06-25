package androidx.work.impl;

import S3.h;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n4.InterfaceC5726b;
import n4.InterfaceC5729e;
import n4.InterfaceC5734j;
import n4.InterfaceC5739o;
import n4.InterfaceC5742r;
import n4.InterfaceC5746v;
import n4.InterfaceC5750z;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "LM3/q;", "<init>", "()V", "Ln4/v;", "J", "()Ln4/v;", "Ln4/b;", "E", "()Ln4/b;", "Ln4/z;", "K", "()Ln4/z;", "Ln4/j;", "G", "()Ln4/j;", "Ln4/o;", "H", "()Ln4/o;", "Ln4/r;", "I", "()Ln4/r;", "Ln4/e;", "F", "()Ln4/e;", "p", "a", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class WorkDatabase extends M3.q {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: androidx.work.impl.WorkDatabase$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final S3.h c(Context context, h.b configuration) {
            AbstractC5504s.h(context, "$context");
            AbstractC5504s.h(configuration, "configuration");
            h.b.a aVarA = h.b.f15916f.a(context);
            aVarA.d(configuration.f15918b).c(configuration.f15919c).e(true).a(true);
            return new T3.f().a(aVarA.b());
        }

        public final WorkDatabase b(final Context context, Executor queryExecutor, boolean z10) {
            AbstractC5504s.h(context, "context");
            AbstractC5504s.h(queryExecutor, "queryExecutor");
            return (WorkDatabase) (z10 ? M3.p.c(context, WorkDatabase.class).c() : M3.p.a(context, WorkDatabase.class, "androidx.work.workdb").f(new h.c() { // from class: androidx.work.impl.y
                @Override // S3.h.c
                public final S3.h a(h.b bVar) {
                    return WorkDatabase.Companion.c(context, bVar);
                }
            })).g(queryExecutor).a(C2953c.f32844a).b(C2959i.f32878c).b(new s(context, 2, 3)).b(C2960j.f32879c).b(C2961k.f32880c).b(new s(context, 5, 6)).b(l.f32881c).b(m.f32882c).b(n.f32883c).b(new F(context)).b(new s(context, 10, 11)).b(C2956f.f32847c).b(C2957g.f32876c).b(C2958h.f32877c).e().d();
        }

        private Companion() {
        }
    }

    public static final WorkDatabase D(Context context, Executor executor, boolean z10) {
        return INSTANCE.b(context, executor, z10);
    }

    public abstract InterfaceC5726b E();

    public abstract InterfaceC5729e F();

    public abstract InterfaceC5734j G();

    public abstract InterfaceC5739o H();

    public abstract InterfaceC5742r I();

    public abstract InterfaceC5746v J();

    public abstract InterfaceC5750z K();
}
