package Cd;

import Cd.e;
import Gf.O;
import Td.r;
import Td.z;
import Ud.S;
import Ud.a0;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ud.InterfaceC6765a;
import xd.C7136g;
import zd.AbstractC7365j;
import zd.C7366k;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f3059g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Map f3060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map f3061i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C7136g f3062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC6765a f3063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f3064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C7366k f3065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h f3066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Cd.b f3067f;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Cd.b b(Cd.b bVar, e eVar) {
            if (eVar instanceof e.n) {
                return bVar.d((65534 & 1) != 0 ? bVar.f3019a : true, (65534 & 2) != 0 ? bVar.f3020b : false, (65534 & 4) != 0 ? bVar.f3021c : false, (65534 & 8) != 0 ? bVar.f3022d : false, (65534 & 16) != 0 ? bVar.f3023e : false, (65534 & 32) != 0 ? bVar.f3031m : 0.0d, (65534 & 64) != 0 ? bVar.f3024f : false, (65534 & 128) != 0 ? bVar.f3025g : 0, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? bVar.f3026h : null, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? bVar.f3027i : null, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? bVar.f3028j : null, (65534 & 2048) != 0 ? bVar.f3029k : null, (65534 & 4096) != 0 ? bVar.f3030l : null, (65534 & 8192) != 0 ? bVar.f3032n : null, (65534 & 16384) != 0 ? bVar.f3034p : null, (65534 & 32768) != 0 ? bVar.f3035q : null);
            }
            if (eVar instanceof e.l) {
                return bVar.d((65534 & 1) != 0 ? bVar.f3019a : false, (65534 & 2) != 0 ? bVar.f3020b : false, (65534 & 4) != 0 ? bVar.f3021c : false, (65534 & 8) != 0 ? bVar.f3022d : false, (65534 & 16) != 0 ? bVar.f3023e : false, (65534 & 32) != 0 ? bVar.f3031m : 0.0d, (65534 & 64) != 0 ? bVar.f3024f : false, (65534 & 128) != 0 ? bVar.f3025g : 0, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? bVar.f3026h : null, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? bVar.f3027i : null, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? bVar.f3028j : null, (65534 & 2048) != 0 ? bVar.f3029k : null, (65534 & 4096) != 0 ? bVar.f3030l : null, (65534 & 8192) != 0 ? bVar.f3032n : null, (65534 & 16384) != 0 ? bVar.f3034p : null, (65534 & 32768) != 0 ? bVar.f3035q : null);
            }
            if (eVar instanceof e.a) {
                return bVar.d((65534 & 1) != 0 ? bVar.f3019a : false, (65534 & 2) != 0 ? bVar.f3020b : false, (65534 & 4) != 0 ? bVar.f3021c : false, (65534 & 8) != 0 ? bVar.f3022d : true, (65534 & 16) != 0 ? bVar.f3023e : false, (65534 & 32) != 0 ? bVar.f3031m : 0.0d, (65534 & 64) != 0 ? bVar.f3024f : false, (65534 & 128) != 0 ? bVar.f3025g : 0, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? bVar.f3026h : null, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? bVar.f3027i : null, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? bVar.f3028j : null, (65534 & 2048) != 0 ? bVar.f3029k : null, (65534 & 4096) != 0 ? bVar.f3030l : null, (65534 & 8192) != 0 ? bVar.f3032n : null, (65534 & 16384) != 0 ? bVar.f3034p : null, (65534 & 32768) != 0 ? bVar.f3035q : null);
            }
            if (eVar instanceof e.b) {
                return bVar.d((65534 & 1) != 0 ? bVar.f3019a : false, (65534 & 2) != 0 ? bVar.f3020b : false, (65534 & 4) != 0 ? bVar.f3021c : false, (65534 & 8) != 0 ? bVar.f3022d : false, (65534 & 16) != 0 ? bVar.f3023e : false, (65534 & 32) != 0 ? bVar.f3031m : 0.0d, (65534 & 64) != 0 ? bVar.f3024f : false, (65534 & 128) != 0 ? bVar.f3025g : 0, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? bVar.f3026h : null, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? bVar.f3027i : null, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? bVar.f3028j : null, (65534 & 2048) != 0 ? bVar.f3029k : null, (65534 & 4096) != 0 ? bVar.f3030l : null, (65534 & 8192) != 0 ? bVar.f3032n : new Date(), (65534 & 16384) != 0 ? bVar.f3034p : null, (65534 & 32768) != 0 ? bVar.f3035q : null);
            }
            if (eVar instanceof e.c) {
                return bVar.d((65534 & 1) != 0 ? bVar.f3019a : false, (65534 & 2) != 0 ? bVar.f3020b : true, (65534 & 4) != 0 ? bVar.f3021c : false, (65534 & 8) != 0 ? bVar.f3022d : false, (65534 & 16) != 0 ? bVar.f3023e : false, (65534 & 32) != 0 ? bVar.f3031m : 0.0d, (65534 & 64) != 0 ? bVar.f3024f : false, (65534 & 128) != 0 ? bVar.f3025g : 0, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? bVar.f3026h : null, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? bVar.f3027i : null, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? bVar.f3028j : new c(((e.c) eVar).b()), (65534 & 2048) != 0 ? bVar.f3029k : null, (65534 & 4096) != 0 ? bVar.f3030l : null, (65534 & 8192) != 0 ? bVar.f3032n : new Date(), (65534 & 16384) != 0 ? bVar.f3034p : null, (65534 & 32768) != 0 ? bVar.f3035q : null);
            }
            if (eVar instanceof e.d) {
                return bVar.d((65534 & 1) != 0 ? bVar.f3019a : false, (65534 & 2) != 0 ? bVar.f3020b : true, (65534 & 4) != 0 ? bVar.f3021c : false, (65534 & 8) != 0 ? bVar.f3022d : false, (65534 & 16) != 0 ? bVar.f3023e : false, (65534 & 32) != 0 ? bVar.f3031m : 0.0d, (65534 & 64) != 0 ? bVar.f3024f : false, (65534 & 128) != 0 ? bVar.f3025g : 0, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? bVar.f3026h : ((e.d) eVar).b(), (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? bVar.f3027i : null, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? bVar.f3028j : null, (65534 & 2048) != 0 ? bVar.f3029k : null, (65534 & 4096) != 0 ? bVar.f3030l : null, (65534 & 8192) != 0 ? bVar.f3032n : new Date(), (65534 & 16384) != 0 ? bVar.f3034p : null, (65534 & 32768) != 0 ? bVar.f3035q : null);
            }
            if (eVar instanceof e.C0035e) {
                return bVar.d((65534 & 1) != 0 ? bVar.f3019a : false, (65534 & 2) != 0 ? bVar.f3020b : false, (65534 & 4) != 0 ? bVar.f3021c : false, (65534 & 8) != 0 ? bVar.f3022d : false, (65534 & 16) != 0 ? bVar.f3023e : false, (65534 & 32) != 0 ? bVar.f3031m : 0.0d, (65534 & 64) != 0 ? bVar.f3024f : false, (65534 & 128) != 0 ? bVar.f3025g : 0, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? bVar.f3026h : null, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? bVar.f3027i : null, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? bVar.f3028j : null, (65534 & 2048) != 0 ? bVar.f3029k : ((e.C0035e) eVar).b(), (65534 & 4096) != 0 ? bVar.f3030l : null, (65534 & 8192) != 0 ? bVar.f3032n : new Date(), (65534 & 16384) != 0 ? bVar.f3034p : null, (65534 & 32768) != 0 ? bVar.f3035q : null);
            }
            if (eVar instanceof e.f) {
                return bVar.d((65534 & 1) != 0 ? bVar.f3019a : false, (65534 & 2) != 0 ? bVar.f3020b : false, (65534 & 4) != 0 ? bVar.f3021c : false, (65534 & 8) != 0 ? bVar.f3022d : false, (65534 & 16) != 0 ? bVar.f3023e : true, (65534 & 32) != 0 ? bVar.f3031m : 0.0d, (65534 & 64) != 0 ? bVar.f3024f : false, (65534 & 128) != 0 ? bVar.f3025g : 0, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? bVar.f3026h : null, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? bVar.f3027i : null, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? bVar.f3028j : null, (65534 & 2048) != 0 ? bVar.f3029k : null, (65534 & 4096) != 0 ? bVar.f3030l : null, (65534 & 8192) != 0 ? bVar.f3032n : null, (65534 & 16384) != 0 ? bVar.f3034p : new Date(), (65534 & 32768) != 0 ? bVar.f3035q : null);
            }
            if (eVar instanceof e.k) {
                return bVar.d((65534 & 1) != 0 ? bVar.f3019a : false, (65534 & 2) != 0 ? bVar.f3020b : false, (65534 & 4) != 0 ? bVar.f3021c : false, (65534 & 8) != 0 ? bVar.f3022d : false, (65534 & 16) != 0 ? bVar.f3023e : false, (65534 & 32) != 0 ? bVar.f3031m : ((e.k) eVar).b(), (65534 & 64) != 0 ? bVar.f3024f : false, (65534 & 128) != 0 ? bVar.f3025g : 0, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? bVar.f3026h : null, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? bVar.f3027i : null, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? bVar.f3028j : null, (65534 & 2048) != 0 ? bVar.f3029k : null, (65534 & 4096) != 0 ? bVar.f3030l : null, (65534 & 8192) != 0 ? bVar.f3032n : null, (65534 & 16384) != 0 ? bVar.f3034p : null, (65534 & 32768) != 0 ? bVar.f3035q : null);
            }
            if (eVar instanceof e.g) {
                return bVar.d((65534 & 1) != 0 ? bVar.f3019a : false, (65534 & 2) != 0 ? bVar.f3020b : false, (65534 & 4) != 0 ? bVar.f3021c : true, (65534 & 8) != 0 ? bVar.f3022d : false, (65534 & 16) != 0 ? bVar.f3023e : false, (65534 & 32) != 0 ? bVar.f3031m : 1.0d, (65534 & 64) != 0 ? bVar.f3024f : false, (65534 & 128) != 0 ? bVar.f3025g : 0, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? bVar.f3026h : null, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? bVar.f3027i : null, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? bVar.f3028j : null, (65534 & 2048) != 0 ? bVar.f3029k : null, (65534 & 4096) != 0 ? bVar.f3030l : null, (65534 & 8192) != 0 ? bVar.f3032n : null, (65534 & 16384) != 0 ? bVar.f3034p : null, (65534 & 32768) != 0 ? bVar.f3035q : null);
            }
            if (eVar instanceof e.h) {
                return bVar.d((65534 & 1) != 0 ? bVar.f3019a : false, (65534 & 2) != 0 ? bVar.f3020b : false, (65534 & 4) != 0 ? bVar.f3021c : true, (65534 & 8) != 0 ? bVar.f3022d : false, (65534 & 16) != 0 ? bVar.f3023e : false, (65534 & 32) != 0 ? bVar.f3031m : 0.0d, (65534 & 64) != 0 ? bVar.f3024f : false, (65534 & 128) != 0 ? bVar.f3025g : 0, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? bVar.f3026h : null, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? bVar.f3027i : null, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? bVar.f3028j : null, (65534 & 2048) != 0 ? bVar.f3029k : null, (65534 & 4096) != 0 ? bVar.f3030l : null, (65534 & 8192) != 0 ? bVar.f3032n : null, (65534 & 16384) != 0 ? bVar.f3034p : null, (65534 & 32768) != 0 ? bVar.f3035q : null);
            }
            if (eVar instanceof e.i) {
                e.i iVar = (e.i) eVar;
                return bVar.d((65534 & 1) != 0 ? bVar.f3019a : false, (65534 & 2) != 0 ? bVar.f3020b : true, (65534 & 4) != 0 ? bVar.f3021c : true, (65534 & 8) != 0 ? bVar.f3022d : false, (65534 & 16) != 0 ? bVar.f3023e : false, (65534 & 32) != 0 ? bVar.f3031m : 0.0d, (65534 & 64) != 0 ? bVar.f3024f : false, (65534 & 128) != 0 ? bVar.f3025g : 0, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? bVar.f3026h : iVar.b(), (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? bVar.f3027i : iVar.b(), (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? bVar.f3028j : null, (65534 & 2048) != 0 ? bVar.f3029k : null, (65534 & 4096) != 0 ? bVar.f3030l : null, (65534 & 8192) != 0 ? bVar.f3032n : null, (65534 & 16384) != 0 ? bVar.f3034p : null, (65534 & 32768) != 0 ? bVar.f3035q : new Date());
            }
            if (eVar instanceof e.j) {
                return bVar.d((65534 & 1) != 0 ? bVar.f3019a : false, (65534 & 2) != 0 ? bVar.f3020b : false, (65534 & 4) != 0 ? bVar.f3021c : false, (65534 & 8) != 0 ? bVar.f3022d : false, (65534 & 16) != 0 ? bVar.f3023e : false, (65534 & 32) != 0 ? bVar.f3031m : 0.0d, (65534 & 64) != 0 ? bVar.f3024f : false, (65534 & 128) != 0 ? bVar.f3025g : 0, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? bVar.f3026h : null, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? bVar.f3027i : null, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? bVar.f3028j : null, (65534 & 2048) != 0 ? bVar.f3029k : null, (65534 & 4096) != 0 ? bVar.f3030l : ((e.j) eVar).b(), (65534 & 8192) != 0 ? bVar.f3032n : null, (65534 & 16384) != 0 ? bVar.f3034p : null, (65534 & 32768) != 0 ? bVar.f3035q : null);
            }
            if (eVar instanceof e.m) {
                return bVar.d((65534 & 1) != 0 ? bVar.f3019a : false, (65534 & 2) != 0 ? bVar.f3020b : false, (65534 & 4) != 0 ? bVar.f3021c : false, (65534 & 8) != 0 ? bVar.f3022d : false, (65534 & 16) != 0 ? bVar.f3023e : false, (65534 & 32) != 0 ? bVar.f3031m : 0.0d, (65534 & 64) != 0 ? bVar.f3024f : true, (65534 & 128) != 0 ? bVar.f3025g : 0, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? bVar.f3026h : null, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? bVar.f3027i : null, (65534 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? bVar.f3028j : null, (65534 & 2048) != 0 ? bVar.f3029k : null, (65534 & 4096) != 0 ? bVar.f3030l : null, (65534 & 8192) != 0 ? bVar.f3032n : null, (65534 & 16384) != 0 ? bVar.f3034p : null, (65534 & 32768) != 0 ? bVar.f3035q : null);
            }
            throw new r();
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b implements AbstractC7365j.b {
        b() {
        }

        @Override // zd.AbstractC7365j.b
        public void a(e event) {
            AbstractC5504s.h(event, "event");
            g.this.e(event);
        }

        @Override // zd.AbstractC7365j.b
        public void b() {
            g.this.g();
        }

        @Override // zd.AbstractC7365j.b
        public h d() {
            return g.this.f3066e;
        }
    }

    static {
        h hVar = h.f3069b;
        f fVar = f.f3045b;
        f fVar2 = f.f3046c;
        f fVar3 = f.f3047d;
        f fVar4 = f.f3051h;
        f fVar5 = f.f3055l;
        Pair pairA = z.a(hVar, a0.h(fVar, fVar2, fVar3, fVar4, fVar5));
        h hVar2 = h.f3070c;
        f fVar6 = f.f3049f;
        f fVar7 = f.f3048e;
        f fVar8 = f.f3050g;
        Pair pairA2 = z.a(hVar2, a0.h(fVar6, fVar7, fVar8));
        h hVar3 = h.f3071d;
        f fVar9 = f.f3053j;
        f fVar10 = f.f3054k;
        f fVar11 = f.f3052i;
        Pair pairA3 = z.a(hVar3, a0.h(fVar9, fVar10, fVar11));
        h hVar4 = h.f3072e;
        f3060h = S.l(pairA, pairA2, pairA3, z.a(hVar4, a0.d()));
        f3061i = S.l(z.a(fVar, hVar), z.a(fVar2, hVar), z.a(fVar3, hVar2), z.a(fVar6, hVar), z.a(fVar7, hVar), z.a(fVar8, hVar), z.a(fVar4, hVar3), z.a(fVar11, hVar3), z.a(fVar9, hVar), z.a(fVar10, hVar), z.a(fVar5, hVar4));
    }

    public g(C7136g logger, InterfaceC6765a eventManager, Set validUpdatesStateValues, O scope) {
        AbstractC5504s.h(logger, "logger");
        AbstractC5504s.h(eventManager, "eventManager");
        AbstractC5504s.h(validUpdatesStateValues, "validUpdatesStateValues");
        AbstractC5504s.h(scope, "scope");
        this.f3062a = logger;
        this.f3063b = eventManager;
        this.f3064c = validUpdatesStateValues;
        this.f3065d = new C7366k(logger, new b(), scope);
        this.f3066e = h.f3069b;
        this.f3067f = new Cd.b(false, false, false, false, false, false, 0, null, null, null, null, null, 0.0d, null, null, null, 65535, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(e eVar) {
        Ed.b bVar;
        if (i(eVar)) {
            this.f3067f = f3059g.b(this.f3067f, eVar);
            if (!(eVar instanceof e.k)) {
                C7136g.k(this.f3062a, "Updates state change: " + eVar.a() + ", context = " + this.f3067f.g(), null, 2, null);
            }
            WeakReference weakReferenceA = Ed.a.f5899a.a();
            if (weakReferenceA != null && (bVar = (Ed.b) weakReferenceA.get()) != null && (bVar instanceof expo.modules.updates.b)) {
                expo.modules.updates.b bVar2 = (expo.modules.updates.b) bVar;
                Iterator it = bVar2.O().keySet().iterator();
                while (it.hasNext()) {
                    android.support.v4.media.session.b.a(bVar2.O().get((String) it.next()));
                }
            }
            h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g() {
        this.f3066e = h.f3069b;
        Cd.b bVarH = this.f3067f.h();
        this.f3067f = bVarH;
        C7136g.k(this.f3062a, "Updates state change: reset, context = " + bVarH.g(), null, 2, null);
        h();
    }

    private final boolean i(e eVar) {
        Set setD = (Set) f3060h.get(this.f3066e);
        if (setD == null) {
            setD = a0.d();
        }
        if (!setD.contains(eVar.a())) {
            return false;
        }
        h hVar = (h) f3061i.get(eVar.a());
        if (hVar == null) {
            hVar = h.f3069b;
        }
        if (!this.f3064c.contains(hVar)) {
            return false;
        }
        this.f3066e = hVar;
        return true;
    }

    public final Cd.b d() {
        return this.f3067f;
    }

    public final void f(AbstractC7365j stateMachineProcedure) {
        AbstractC5504s.h(stateMachineProcedure, "stateMachineProcedure");
        this.f3065d.f(stateMachineProcedure);
    }

    public final void h() {
        this.f3063b.b(this.f3067f);
    }
}
