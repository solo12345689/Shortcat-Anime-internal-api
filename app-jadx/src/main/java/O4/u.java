package o4;

import androidx.work.WorkerParameters;
import androidx.work.impl.E;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private E f54510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.work.impl.v f54511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WorkerParameters.a f54512c;

    public u(E e10, androidx.work.impl.v vVar, WorkerParameters.a aVar) {
        this.f54510a = e10;
        this.f54511b = vVar;
        this.f54512c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        this.f54510a.s().o(this.f54511b, this.f54512c);
    }
}
