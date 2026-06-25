package r1;

import java.util.HashMap;
import q1.g;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends q1.e {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    protected float f58360q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    protected HashMap f58361r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    protected HashMap f58362s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    protected HashMap f58363t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private HashMap f58364u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private HashMap f58365v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    protected g.a f58366w0;

    public d(q1.g gVar, g.d dVar) {
        super(gVar, dVar);
        this.f58360q0 = 0.5f;
        this.f58361r0 = new HashMap();
        this.f58362s0 = new HashMap();
        this.f58363t0 = new HashMap();
        this.f58366w0 = g.a.SPREAD;
    }

    float A0(String str) {
        HashMap map = this.f58364u0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return ((Float) this.f58364u0.get(str)).floatValue();
    }

    protected float B0(String str) {
        if (this.f58362s0.containsKey(str)) {
            return ((Float) this.f58362s0.get(str)).floatValue();
        }
        return 0.0f;
    }

    protected float C0(String str) {
        if (this.f58361r0.containsKey(str)) {
            return ((Float) this.f58361r0.get(str)).floatValue();
        }
        return -1.0f;
    }

    public d D0(g.a aVar) {
        this.f58366w0 = aVar;
        return this;
    }

    public void w0(Object obj, float f10, float f11, float f12, float f13, float f14) {
        super.s0(obj);
        String string = obj.toString();
        if (!Float.isNaN(f10)) {
            this.f58361r0.put(string, Float.valueOf(f10));
        }
        if (!Float.isNaN(f11)) {
            this.f58362s0.put(string, Float.valueOf(f11));
        }
        if (!Float.isNaN(f12)) {
            this.f58363t0.put(string, Float.valueOf(f12));
        }
        if (!Float.isNaN(f13)) {
            if (this.f58364u0 == null) {
                this.f58364u0 = new HashMap();
            }
            this.f58364u0.put(string, Float.valueOf(f13));
        }
        if (Float.isNaN(f14)) {
            return;
        }
        if (this.f58365v0 == null) {
            this.f58365v0 = new HashMap();
        }
        this.f58365v0.put(string, Float.valueOf(f14));
    }

    public d x0(float f10) {
        this.f58360q0 = f10;
        return this;
    }

    float y0(String str) {
        HashMap map = this.f58365v0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return ((Float) this.f58365v0.get(str)).floatValue();
    }

    protected float z0(String str) {
        if (this.f58363t0.containsKey(str)) {
            return ((Float) this.f58363t0.get(str)).floatValue();
        }
        return 0.0f;
    }
}
