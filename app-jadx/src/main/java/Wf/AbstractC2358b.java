package Wf;

import Xf.C2384v;
import Xf.I;
import Xf.J;
import Xf.U;
import Xf.X;
import Xf.Y;
import Xf.b0;
import Xf.d0;
import Xf.e0;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Wf.b */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC2358b implements Rf.l {

    /* JADX INFO: renamed from: d */
    public static final a f20895d = new a(null);

    /* JADX INFO: renamed from: a */
    private final C2363g f20896a;

    /* JADX INFO: renamed from: b */
    private final Yf.e f20897b;

    /* JADX INFO: renamed from: c */
    private final C2384v f20898c;

    /* JADX INFO: renamed from: Wf.b$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class a extends AbstractC2358b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(new C2363g(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null), Yf.g.a(), null);
        }
    }

    public /* synthetic */ AbstractC2358b(C2363g c2363g, Yf.e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2363g, eVar);
    }

    @Override // Rf.i
    public Yf.e a() {
        return this.f20897b;
    }

    @Override // Rf.l
    public final String b(Rf.k serializer, Object obj) {
        AbstractC5504s.h(serializer, "serializer");
        J j10 = new J();
        try {
            I.a(this, j10, serializer, obj);
            return j10.toString();
        } finally {
            j10.g();
        }
    }

    public final Object c(Rf.a deserializer, i element) {
        AbstractC5504s.h(deserializer, "deserializer");
        AbstractC5504s.h(element, "element");
        return b0.a(this, element, deserializer);
    }

    public final Object d(Rf.a deserializer, String string) {
        AbstractC5504s.h(deserializer, "deserializer");
        AbstractC5504s.h(string, "string");
        X xA = Y.a(this, string);
        Object objC = new U(this, e0.f21988c, xA, deserializer.getDescriptor(), null).C(deserializer);
        xA.v();
        return objC;
    }

    public final i e(Rf.k serializer, Object obj) {
        AbstractC5504s.h(serializer, "serializer");
        return d0.d(this, obj, serializer);
    }

    public final C2363g f() {
        return this.f20896a;
    }

    public final C2384v g() {
        return this.f20898c;
    }

    private AbstractC2358b(C2363g c2363g, Yf.e eVar) {
        this.f20896a = c2363g;
        this.f20897b = eVar;
        this.f20898c = new C2384v();
    }
}
