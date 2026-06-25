package n9;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: n9.A */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC5756A implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ i f54000a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ B f54001b;

    RunnableC5756A(B b10, i iVar) {
        this.f54000a = iVar;
        Objects.requireNonNull(b10);
        this.f54001b = b10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            i iVarA = this.f54001b.c().a(this.f54000a.k());
            if (iVarA == null) {
                this.f54001b.onFailure(new NullPointerException("Continuation returned null"));
                return;
            }
            B b10 = this.f54001b;
            Executor executor = k.f54019b;
            iVarA.f(executor, b10);
            iVarA.d(executor, b10);
            iVarA.a(executor, b10);
        } catch (CancellationException unused) {
            this.f54001b.a();
        } catch (C5763g e10) {
            if (e10.getCause() instanceof Exception) {
                this.f54001b.onFailure((Exception) e10.getCause());
            } else {
                this.f54001b.onFailure(e10);
            }
        } catch (Exception e11) {
            this.f54001b.onFailure(e11);
        }
    }
}
