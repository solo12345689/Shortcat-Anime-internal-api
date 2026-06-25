package Gf;

import Lf.AbstractC1903j;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: Gf.e0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
final class ExecutorC1606e0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f7569a;

    public ExecutorC1606e0(K k10) {
        this.f7569a = k10;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        K k10 = this.f7569a;
        Zd.j jVar = Zd.j.f23275a;
        if (AbstractC1903j.d(k10, jVar)) {
            AbstractC1903j.c(this.f7569a, jVar, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f7569a.toString();
    }
}
