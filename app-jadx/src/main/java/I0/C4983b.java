package i0;

import Td.C2160k;
import j0.AbstractC5325b;
import j0.C5324a;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: i0.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C4983b extends C4985d {

    /* JADX INFO: renamed from: i0.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class a implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function1 f48471a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Function1 f48472b;

        a(Function1 function1, Function1 function12) {
            this.f48471a = function1;
            this.f48472b = function12;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final C4985d invoke(C4997p c4997p) {
            long j10;
            synchronized (AbstractC5003v.O()) {
                j10 = AbstractC5003v.f48531f;
                AbstractC5003v.f48531f += (long) 1;
            }
            return new C4985d(j10, c4997p, this.f48471a, this.f48472b);
        }
    }

    /* JADX INFO: renamed from: i0.b$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class C0771b implements Function1 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function1 f48473a;

        C0771b(Function1 function1) {
            this.f48473a = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a */
        public final C4990i invoke(C4997p c4997p) {
            long j10;
            synchronized (AbstractC5003v.O()) {
                j10 = AbstractC5003v.f48531f;
                AbstractC5003v.f48531f += (long) 1;
            }
            return new C4990i(j10, c4997p, this.f48473a);
        }
    }

    public C4983b(long j10, C4997p c4997p) {
        super(j10, c4997p, null, new Function1() { // from class: i0.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C4983b.V(obj);
            }
        });
    }

    public static final Td.L V(Object obj) {
        synchronized (AbstractC5003v.O()) {
            List list = AbstractC5003v.f48535j;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((Function1) list.get(i10)).invoke(obj);
            }
        }
        return Td.L.f17438a;
    }

    @Override // i0.C4985d
    public AbstractC4994m C() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // i0.C4985d
    public C4985d R(Function1 function1, Function1 function12) {
        Function1 function13;
        Map map;
        b0.e eVar = AbstractC5325b.f51587a;
        if (eVar != null) {
            Pair pairE = AbstractC5325b.e(eVar, null, false, function1, function12);
            C5324a c5324a = (C5324a) pairE.c();
            Function1 function1A = c5324a.a();
            Function1 function1B = c5324a.b();
            map = (Map) pairE.d();
            function1 = function1A;
            function13 = function1B;
        } else {
            function13 = function12;
            map = null;
        }
        C4985d c4985d = (C4985d) AbstractC5003v.i0(new a(function1, function13));
        if (eVar != null) {
            AbstractC5325b.b(eVar, null, c4985d, map);
        }
        return c4985d;
    }

    @Override // i0.C4985d, i0.AbstractC4993l
    /* JADX INFO: renamed from: W */
    public Void m(AbstractC4993l abstractC4993l) {
        AbstractC4964H.b();
        throw new C2160k();
    }

    @Override // i0.C4985d, i0.AbstractC4993l
    /* JADX INFO: renamed from: X */
    public Void n(AbstractC4993l abstractC4993l) {
        AbstractC4964H.b();
        throw new C2160k();
    }

    @Override // i0.C4985d, i0.AbstractC4993l
    public void d() {
        synchronized (AbstractC5003v.O()) {
            q();
            Td.L l10 = Td.L.f17438a;
        }
    }

    @Override // i0.C4985d, i0.AbstractC4993l
    public void o() {
        AbstractC5003v.G();
    }

    @Override // i0.C4985d, i0.AbstractC4993l
    public AbstractC4993l x(Function1 function1) {
        Map map;
        b0.e eVar = AbstractC5325b.f51587a;
        if (eVar != null) {
            Pair pairE = AbstractC5325b.e(eVar, null, true, function1, null);
            C5324a c5324a = (C5324a) pairE.c();
            Function1 function1A = c5324a.a();
            c5324a.b();
            map = (Map) pairE.d();
            function1 = function1A;
        } else {
            map = null;
        }
        C4990i c4990i = (C4990i) AbstractC5003v.i0(new C0771b(function1));
        if (eVar != null) {
            AbstractC5325b.b(eVar, null, c4990i, map);
        }
        return c4990i;
    }
}
