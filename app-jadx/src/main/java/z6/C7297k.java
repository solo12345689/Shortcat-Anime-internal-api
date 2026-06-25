package z6;

import Td.AbstractC2163n;
import ie.InterfaceC5082a;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC5504s;
import z6.C7297k;

/* JADX INFO: renamed from: z6.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7297k implements y5.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC7303q f65718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H6.D f65719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC7302p f65720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final x6.t f65721d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f65722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t5.d f65723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final t5.d f65724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f65725h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Lazy f65726i;

    /* JADX INFO: renamed from: z6.k$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a implements InterfaceC7289c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Lazy f65727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Lazy f65728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Lazy f65729c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Lazy f65730d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Lazy f65731e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Lazy f65732f;

        a(final C7297k c7297k) {
            Td.q qVar = Td.q.f17461a;
            this.f65727a = AbstractC2163n.a(qVar, new InterfaceC5082a() { // from class: z6.e
                @Override // ie.InterfaceC5082a
                public final Object invoke() {
                    return C7297k.a.p(c7297k);
                }
            });
            this.f65728b = AbstractC2163n.a(qVar, new InterfaceC5082a() { // from class: z6.f
                @Override // ie.InterfaceC5082a
                public final Object invoke() {
                    return C7297k.a.o(this.f65709a, c7297k);
                }
            });
            this.f65729c = AbstractC2163n.a(qVar, new InterfaceC5082a() { // from class: z6.g
                @Override // ie.InterfaceC5082a
                public final Object invoke() {
                    return C7297k.a.r(c7297k);
                }
            });
            this.f65730d = AbstractC2163n.a(qVar, new InterfaceC5082a() { // from class: z6.h
                @Override // ie.InterfaceC5082a
                public final Object invoke() {
                    return C7297k.a.q(this.f65712a, c7297k);
                }
            });
            this.f65731e = AbstractC2163n.a(qVar, new InterfaceC5082a() { // from class: z6.i
                @Override // ie.InterfaceC5082a
                public final Object invoke() {
                    return C7297k.a.k(c7297k, this);
                }
            });
            this.f65732f = AbstractC2163n.a(qVar, new InterfaceC5082a() { // from class: z6.j
                @Override // ie.InterfaceC5082a
                public final Object invoke() {
                    return C7297k.a.j(this.f65716a, c7297k);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y5.g j(a this$0, C7297k this$1) {
            AbstractC5504s.h(this$0, "this$0");
            AbstractC5504s.h(this$1, "this$1");
            Map mapL = this$0.l();
            LinkedHashMap linkedHashMap = new LinkedHashMap(Ud.S.e(mapL.size()));
            for (Map.Entry entry : mapL.entrySet()) {
                Object key = entry.getKey();
                t5.k kVar = (t5.k) entry.getValue();
                B5.i iVarI = this$1.f65719b.i(this$1.f65722e);
                AbstractC5504s.g(iVarI, "getPooledByteBufferFactory(...)");
                B5.l lVarJ = this$1.f65719b.j();
                AbstractC5504s.g(lVarJ, "getPooledByteStreams(...)");
                Executor executorF = this$1.f65720c.f();
                AbstractC5504s.g(executorF, "forLocalStorageRead(...)");
                Executor executorB = this$1.f65720c.b();
                AbstractC5504s.g(executorB, "forLocalStorageWrite(...)");
                linkedHashMap.put(key, new x6.j(kVar, iVarI, lVarJ, executorF, executorB, this$1.f65721d));
            }
            return y5.g.a(linkedHashMap);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map k(C7297k this$0, a this$1) {
            AbstractC5504s.h(this$0, "this$0");
            AbstractC5504s.h(this$1, "this$1");
            Map map = this$0.f65725h;
            if (map == null) {
                return Ud.S.i();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(Ud.S.e(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), this$0.f65718a.a((t5.d) entry.getValue()));
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x6.j o(a this$0, C7297k this$1) {
            AbstractC5504s.h(this$0, "this$0");
            AbstractC5504s.h(this$1, "this$1");
            t5.k kVarM = this$0.m();
            B5.i iVarI = this$1.f65719b.i(this$1.f65722e);
            AbstractC5504s.g(iVarI, "getPooledByteBufferFactory(...)");
            B5.l lVarJ = this$1.f65719b.j();
            AbstractC5504s.g(lVarJ, "getPooledByteStreams(...)");
            Executor executorF = this$1.f65720c.f();
            AbstractC5504s.g(executorF, "forLocalStorageRead(...)");
            Executor executorB = this$1.f65720c.b();
            AbstractC5504s.g(executorB, "forLocalStorageWrite(...)");
            return new x6.j(kVarM, iVarI, lVarJ, executorF, executorB, this$1.f65721d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final t5.k p(C7297k this$0) {
            AbstractC5504s.h(this$0, "this$0");
            return this$0.f65718a.a(this$0.f65723f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final x6.j q(a this$0, C7297k this$1) {
            AbstractC5504s.h(this$0, "this$0");
            AbstractC5504s.h(this$1, "this$1");
            t5.k kVarN = this$0.n();
            B5.i iVarI = this$1.f65719b.i(this$1.f65722e);
            AbstractC5504s.g(iVarI, "getPooledByteBufferFactory(...)");
            B5.l lVarJ = this$1.f65719b.j();
            AbstractC5504s.g(lVarJ, "getPooledByteStreams(...)");
            Executor executorF = this$1.f65720c.f();
            AbstractC5504s.g(executorF, "forLocalStorageRead(...)");
            Executor executorB = this$1.f65720c.b();
            AbstractC5504s.g(executorB, "forLocalStorageWrite(...)");
            return new x6.j(kVarN, iVarI, lVarJ, executorF, executorB, this$1.f65721d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final t5.k r(C7297k this$0) {
            AbstractC5504s.h(this$0, "this$0");
            return this$0.f65718a.a(this$0.f65724g);
        }

        @Override // z6.InterfaceC7289c
        public x6.j a() {
            return (x6.j) this.f65730d.getValue();
        }

        @Override // z6.InterfaceC7289c
        public x6.j b() {
            return (x6.j) this.f65728b.getValue();
        }

        @Override // z6.InterfaceC7289c
        public y5.g c() {
            Object value = this.f65732f.getValue();
            AbstractC5504s.g(value, "getValue(...)");
            return (y5.g) value;
        }

        public Map l() {
            return (Map) this.f65731e.getValue();
        }

        public t5.k m() {
            return (t5.k) this.f65727a.getValue();
        }

        public t5.k n() {
            return (t5.k) this.f65729c.getValue();
        }
    }

    public C7297k(InterfaceC7303q fileCacheFactory, H6.D poolFactory, InterfaceC7302p executorSupplier, x6.t imageCacheStatsTracker, int i10, t5.d mainDiskCacheConfig, t5.d smallImageDiskCacheConfig, Map map) {
        AbstractC5504s.h(fileCacheFactory, "fileCacheFactory");
        AbstractC5504s.h(poolFactory, "poolFactory");
        AbstractC5504s.h(executorSupplier, "executorSupplier");
        AbstractC5504s.h(imageCacheStatsTracker, "imageCacheStatsTracker");
        AbstractC5504s.h(mainDiskCacheConfig, "mainDiskCacheConfig");
        AbstractC5504s.h(smallImageDiskCacheConfig, "smallImageDiskCacheConfig");
        this.f65718a = fileCacheFactory;
        this.f65719b = poolFactory;
        this.f65720c = executorSupplier;
        this.f65721d = imageCacheStatsTracker;
        this.f65722e = i10;
        this.f65723f = mainDiskCacheConfig;
        this.f65724g = smallImageDiskCacheConfig;
        this.f65725h = map;
        this.f65726i = AbstractC2163n.a(Td.q.f17461a, new InterfaceC5082a() { // from class: z6.d
            @Override // ie.InterfaceC5082a
            public final Object invoke() {
                return C7297k.j(this.f65707a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a j(C7297k this$0) {
        AbstractC5504s.h(this$0, "this$0");
        return new a(this$0);
    }

    private final InterfaceC7289c l() {
        return (InterfaceC7289c) this.f65726i.getValue();
    }

    @Override // y5.n
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public InterfaceC7289c get() {
        return l();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7297k(InterfaceC7303q fileCacheFactory, InterfaceC7307v config) {
        this(fileCacheFactory, config.t(), config.H(), config.B(), config.u(), config.d(), config.j(), config.i());
        AbstractC5504s.h(fileCacheFactory, "fileCacheFactory");
        AbstractC5504s.h(config, "config");
    }
}
