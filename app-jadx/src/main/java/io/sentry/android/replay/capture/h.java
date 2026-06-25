package io.sentry.android.replay.capture;

import Td.L;
import Ud.AbstractC2279u;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import io.sentry.A1;
import io.sentry.A3;
import io.sentry.C5191e;
import io.sentry.C5322z3;
import io.sentry.G1;
import io.sentry.H;
import io.sentry.InterfaceC5114a0;
import io.sentry.Y;
import io.sentry.android.replay.capture.h;
import io.sentry.android.replay.s;
import io.sentry.protocol.x;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.N;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public interface h {

    /* JADX INFO: renamed from: a */
    public static final a f50252a = a.f50253a;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ a f50253a = new a();

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.h$a$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        static final class C0790a extends AbstractC5506u implements Function1 {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Date f50254a;

            /* JADX INFO: renamed from: b */
            final /* synthetic */ List f50255b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0790a(Date date, List list) {
                super(1);
                this.f50254a = date;
                this.f50255b = list;
            }

            public final void a(io.sentry.rrweb.b event) {
                AbstractC5504s.h(event, "event");
                if (event.e() >= this.f50254a.getTime()) {
                    this.f50255b.add(event);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((io.sentry.rrweb.b) obj);
                return L.f17438a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Xd.a.d(Long.valueOf(((io.sentry.rrweb.b) obj).e()), Long.valueOf(((io.sentry.rrweb.b) obj2).e()));
            }
        }

        private a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0124  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final io.sentry.android.replay.capture.h.c b(io.sentry.C5322z3 r19, java.io.File r20, io.sentry.protocol.x r21, java.util.Date r22, int r23, int r24, int r25, int r26, int r27, long r28, io.sentry.A3.b r30, java.lang.String r31, java.util.List r32, java.util.Deque r33) {
            /*
                Method dump skipped, instruction units count: 397
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.capture.h.a.b(io.sentry.z3, java.io.File, io.sentry.protocol.x, java.util.Date, int, int, int, int, int, long, io.sentry.A3$b, java.lang.String, java.util.List, java.util.Deque):io.sentry.android.replay.capture.h$c");
        }

        public static final void d(N n10, Y scope) {
            AbstractC5504s.h(scope, "scope");
            n10.f52259a = new ArrayList(scope.r());
        }

        private final boolean e(C5191e c5191e) {
            if (c5191e == null || !AbstractC5504s.c(c5191e.r(), "network.event")) {
                return false;
            }
            Map mapT = c5191e.t();
            AbstractC5504s.g(mapT, "getData(...)");
            Object obj = mapT.get("action");
            if (obj == null) {
                obj = null;
            }
            return AbstractC5504s.c(obj, "NETWORK_AVAILABLE");
        }

        private final boolean f(C5191e c5191e) {
            return AbstractC5504s.c(c5191e.r(), "network.event") && c5191e.t().containsKey("network_type");
        }

        public static /* synthetic */ void h(a aVar, Deque deque, long j10, Function1 function1, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                function1 = null;
            }
            aVar.g(deque, j10, function1);
        }

        public final c c(InterfaceC5114a0 interfaceC5114a0, C5322z3 options, long j10, Date currentSegmentTimestamp, x replayId, int i10, int i11, int i12, A3.b replayType, io.sentry.android.replay.i iVar, int i13, int i14, String str, List list, Deque events) {
            io.sentry.android.replay.c cVarM;
            List list2;
            AbstractC5504s.h(options, "options");
            AbstractC5504s.h(currentSegmentTimestamp, "currentSegmentTimestamp");
            AbstractC5504s.h(replayId, "replayId");
            AbstractC5504s.h(replayType, "replayType");
            AbstractC5504s.h(events, "events");
            if (iVar == null || (cVarM = io.sentry.android.replay.i.m(iVar, Math.min(j10, 300000L), currentSegmentTimestamp.getTime(), i10, i11, i12, i13, i14, null, 128, null)) == null) {
                return c.b.f50258a;
            }
            File fileA = cVarM.a();
            int iB = cVarM.b();
            long jC = cVarM.c();
            if (list == null) {
                final N n10 = new N();
                n10.f52259a = AbstractC2279u.m();
                if (interfaceC5114a0 != null) {
                    interfaceC5114a0.r(new G1() { // from class: io.sentry.android.replay.capture.g
                        @Override // io.sentry.G1
                        public final void a(Y y10) {
                            h.a.d(n10, y10);
                        }
                    });
                }
                list2 = (List) n10.f52259a;
            } else {
                list2 = list;
            }
            return b(options, fileA, replayId, currentSegmentTimestamp, i10, i11, i12, iB, i13, jC, replayType, str, list2, events);
        }

        public final void g(Deque events, long j10, Function1 function1) {
            AbstractC5504s.h(events, "events");
            Iterator it = events.iterator();
            AbstractC5504s.g(it, "iterator(...)");
            while (it.hasNext()) {
                io.sentry.rrweb.b bVar = (io.sentry.rrweb.b) it.next();
                if (bVar.e() < j10) {
                    if (function1 != null) {
                        AbstractC5504s.e(bVar);
                        function1.invoke(bVar);
                    }
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {
        public static /* synthetic */ void a(h hVar, int i10, x xVar, A3.b bVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
            }
            if ((i11 & 1) != 0) {
                i10 = 0;
            }
            if ((i11 & 2) != 0) {
                xVar = new x();
            }
            if ((i11 & 4) != 0) {
                bVar = null;
            }
            hVar.h(i10, xVar, bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static abstract class c {

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a extends c {

            /* JADX INFO: renamed from: a */
            private final A3 f50256a;

            /* JADX INFO: renamed from: b */
            private final A1 f50257b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(A3 replay, A1 recording) {
                super(null);
                AbstractC5504s.h(replay, "replay");
                AbstractC5504s.h(recording, "recording");
                this.f50256a = replay;
                this.f50257b = recording;
            }

            public static /* synthetic */ void b(a aVar, InterfaceC5114a0 interfaceC5114a0, H h10, int i10, Object obj) {
                if ((i10 & 2) != 0) {
                    h10 = new H();
                }
                aVar.a(interfaceC5114a0, h10);
            }

            public final void a(InterfaceC5114a0 interfaceC5114a0, H hint) {
                AbstractC5504s.h(hint, "hint");
                if (interfaceC5114a0 != null) {
                    A3 a32 = this.f50256a;
                    hint.l(this.f50257b);
                    L l10 = L.f17438a;
                    interfaceC5114a0.u(a32, hint);
                }
            }

            public final A3 c() {
                return this.f50256a;
            }

            public final void d(int i10) {
                this.f50256a.m0(i10);
                List<io.sentry.rrweb.b> listA = this.f50257b.a();
                if (listA != null) {
                    for (io.sentry.rrweb.b bVar : listA) {
                        if (bVar instanceof io.sentry.rrweb.j) {
                            ((io.sentry.rrweb.j) bVar).C(i10);
                        }
                    }
                }
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return AbstractC5504s.c(this.f50256a, aVar.f50256a) && AbstractC5504s.c(this.f50257b, aVar.f50257b);
            }

            public int hashCode() {
                return (this.f50256a.hashCode() * 31) + this.f50257b.hashCode();
            }

            public String toString() {
                return "Created(replay=" + this.f50256a + ", recording=" + this.f50257b + ')';
            }
        }

        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class b extends c {

            /* JADX INFO: renamed from: a */
            public static final b f50258a = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    x a();

    void b(MotionEvent motionEvent);

    void c(int i10);

    int d();

    void e(boolean z10, Function1 function1);

    void f(Bitmap bitmap, Function2 function2);

    h g();

    void h(int i10, x xVar, A3.b bVar);

    void i();

    void j(Date date);

    void pause();

    void r(s sVar);

    void stop();
}
