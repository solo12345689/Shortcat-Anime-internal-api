package W4;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import o5.k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f20700a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f20701b = new b();

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Lock f20702a = new ReentrantLock();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f20703b;

        a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue f20704a = new ArrayDeque();

        b() {
        }

        a a() {
            a aVar;
            synchronized (this.f20704a) {
                aVar = (a) this.f20704a.poll();
            }
            return aVar == null ? new a() : aVar;
        }

        void b(a aVar) {
            synchronized (this.f20704a) {
                try {
                    if (this.f20704a.size() < 10) {
                        this.f20704a.offer(aVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    c() {
    }

    void a(String str) {
        a aVarA;
        synchronized (this) {
            try {
                aVarA = (a) this.f20700a.get(str);
                if (aVarA == null) {
                    aVarA = this.f20701b.a();
                    this.f20700a.put(str, aVarA);
                }
                aVarA.f20703b++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVarA.f20702a.lock();
    }

    void b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) k.e((a) this.f20700a.get(str));
                int i10 = aVar.f20703b;
                if (i10 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f20703b);
                }
                int i11 = i10 - 1;
                aVar.f20703b = i11;
                if (i11 == 0) {
                    a aVar2 = (a) this.f20700a.remove(str);
                    if (!aVar2.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                    this.f20701b.b(aVar2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVar.f20702a.unlock();
    }
}
