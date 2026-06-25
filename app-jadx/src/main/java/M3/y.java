package M3;

import Td.L;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class y implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f12226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque f12227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f12228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f12229d;

    public y(Executor executor) {
        AbstractC5504s.h(executor, "executor");
        this.f12226a = executor;
        this.f12227b = new ArrayDeque();
        this.f12229d = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Runnable command, y this$0) {
        AbstractC5504s.h(command, "$command");
        AbstractC5504s.h(this$0, "this$0");
        try {
            command.run();
        } finally {
            this$0.d();
        }
    }

    public final void d() {
        synchronized (this.f12229d) {
            try {
                Object objPoll = this.f12227b.poll();
                Runnable runnable = (Runnable) objPoll;
                this.f12228c = runnable;
                if (objPoll != null) {
                    this.f12226a.execute(runnable);
                }
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable command) {
        AbstractC5504s.h(command, "command");
        synchronized (this.f12229d) {
            try {
                this.f12227b.offer(new Runnable() { // from class: M3.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        y.c(command, this);
                    }
                });
                if (this.f12228c == null) {
                    d();
                }
                L l10 = L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
