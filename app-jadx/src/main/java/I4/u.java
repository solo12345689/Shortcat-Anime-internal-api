package i4;

import Ud.a0;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n4.C5745u;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u {

    /* JADX INFO: renamed from: d */
    public static final b f48697d = new b(null);

    /* JADX INFO: renamed from: a */
    private final UUID f48698a;

    /* JADX INFO: renamed from: b */
    private final C5745u f48699b;

    /* JADX INFO: renamed from: c */
    private final Set f48700c;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class a {

        /* JADX INFO: renamed from: a */
        private final Class f48701a;

        /* JADX INFO: renamed from: b */
        private boolean f48702b;

        /* JADX INFO: renamed from: c */
        private UUID f48703c;

        /* JADX INFO: renamed from: d */
        private C5745u f48704d;

        /* JADX INFO: renamed from: e */
        private final Set f48705e;

        public a(Class workerClass) {
            AbstractC5504s.h(workerClass, "workerClass");
            this.f48701a = workerClass;
            UUID uuidRandomUUID = UUID.randomUUID();
            AbstractC5504s.g(uuidRandomUUID, "randomUUID()");
            this.f48703c = uuidRandomUUID;
            String string = this.f48703c.toString();
            AbstractC5504s.g(string, "id.toString()");
            String name = workerClass.getName();
            AbstractC5504s.g(name, "workerClass.name");
            this.f48704d = new C5745u(string, name);
            String name2 = workerClass.getName();
            AbstractC5504s.g(name2, "workerClass.name");
            this.f48705e = a0.f(name2);
        }

        public final a a(String tag) {
            AbstractC5504s.h(tag, "tag");
            this.f48705e.add(tag);
            return g();
        }

        public final u b() {
            u uVarC = c();
            i4.b bVar = this.f48704d.f53952j;
            boolean z10 = bVar.e() || bVar.f() || bVar.g() || bVar.h();
            C5745u c5745u = this.f48704d;
            if (c5745u.f53959q) {
                if (z10) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (c5745u.f53949g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            AbstractC5504s.g(uuidRandomUUID, "randomUUID()");
            i(uuidRandomUUID);
            return uVarC;
        }

        public abstract u c();

        public final boolean d() {
            return this.f48702b;
        }

        public final UUID e() {
            return this.f48703c;
        }

        public final Set f() {
            return this.f48705e;
        }

        public abstract a g();

        public final C5745u h() {
            return this.f48704d;
        }

        public final a i(UUID id2) {
            AbstractC5504s.h(id2, "id");
            this.f48703c = id2;
            String string = id2.toString();
            AbstractC5504s.g(string, "id.toString()");
            this.f48704d = new C5745u(string, this.f48704d);
            return g();
        }

        public a j(long j10, TimeUnit timeUnit) {
            AbstractC5504s.h(timeUnit, "timeUnit");
            this.f48704d.f53949g = timeUnit.toMillis(j10);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f48704d.f53949g) {
                return g();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        public final a k(androidx.work.b inputData) {
            AbstractC5504s.h(inputData, "inputData");
            this.f48704d.f53947e = inputData;
            return g();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public u(UUID id2, C5745u workSpec, Set tags) {
        AbstractC5504s.h(id2, "id");
        AbstractC5504s.h(workSpec, "workSpec");
        AbstractC5504s.h(tags, "tags");
        this.f48698a = id2;
        this.f48699b = workSpec;
        this.f48700c = tags;
    }

    public UUID a() {
        return this.f48698a;
    }

    public final String b() {
        String string = a().toString();
        AbstractC5504s.g(string, "id.toString()");
        return string;
    }

    public final Set c() {
        return this.f48700c;
    }

    public final C5745u d() {
        return this.f48699b;
    }
}
