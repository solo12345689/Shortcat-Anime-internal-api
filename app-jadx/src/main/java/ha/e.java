package ha;

import android.util.Base64;
import android.util.JsonWriter;
import fa.f;
import fa.g;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
final class e implements fa.e, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f47790a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f47791b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JsonWriter f47792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f47793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f47794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final fa.d f47795f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f47796g;

    e(Writer writer, Map map, Map map2, fa.d dVar, boolean z10) {
        this.f47792c = new JsonWriter(writer);
        this.f47793d = map;
        this.f47794e = map2;
        this.f47795f = dVar;
        this.f47796g = z10;
    }

    private boolean o(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e r(String str, Object obj) throws IOException {
        t();
        this.f47792c.name(str);
        if (obj != null) {
            return h(obj, false);
        }
        this.f47792c.nullValue();
        return this;
    }

    private e s(String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        t();
        this.f47792c.name(str);
        return h(obj, false);
    }

    private void t() throws IOException {
        if (!this.f47791b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f47790a;
        if (eVar != null) {
            eVar.t();
            this.f47790a.f47791b = false;
            this.f47790a = null;
            this.f47792c.endObject();
        }
    }

    @Override // fa.e
    public fa.e b(fa.c cVar, Object obj) {
        return l(cVar.b(), obj);
    }

    @Override // fa.e
    public fa.e c(fa.c cVar, int i10) {
        return j(cVar.b(), i10);
    }

    @Override // fa.e
    public fa.e d(fa.c cVar, long j10) {
        return k(cVar.b(), j10);
    }

    public e f(int i10) throws IOException {
        t();
        this.f47792c.value(i10);
        return this;
    }

    public e g(long j10) throws IOException {
        t();
        this.f47792c.value(j10);
        return this;
    }

    e h(Object obj, boolean z10) {
        if (z10 && o(obj)) {
            throw new fa.b(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f47792c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f47792c.value((Number) obj);
            return this;
        }
        int i10 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f47792c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    h(it.next(), false);
                }
                this.f47792c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f47792c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        l((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new fa.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                this.f47792c.endObject();
                return this;
            }
            fa.d dVar = (fa.d) this.f47793d.get(obj.getClass());
            if (dVar != null) {
                return q(dVar, obj, z10);
            }
            f fVar = (f) this.f47794e.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return q(this.f47795f, obj, z10);
            }
            a(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return n((byte[]) obj);
        }
        this.f47792c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i10 < length) {
                this.f47792c.value(r6[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                g(jArr[i10]);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                this.f47792c.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                this.f47792c.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                h(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                h(obj2, false);
            }
        }
        this.f47792c.endArray();
        return this;
    }

    @Override // fa.g
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public e a(String str) throws IOException {
        t();
        this.f47792c.value(str);
        return this;
    }

    public e j(String str, int i10) throws IOException {
        t();
        this.f47792c.name(str);
        return f(i10);
    }

    public e k(String str, long j10) throws IOException {
        t();
        this.f47792c.name(str);
        return g(j10);
    }

    public e l(String str, Object obj) {
        return this.f47796g ? s(str, obj) : r(str, obj);
    }

    @Override // fa.g
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public e e(boolean z10) throws IOException {
        t();
        this.f47792c.value(z10);
        return this;
    }

    public e n(byte[] bArr) throws IOException {
        t();
        if (bArr == null) {
            this.f47792c.nullValue();
            return this;
        }
        this.f47792c.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    void p() {
        t();
        this.f47792c.flush();
    }

    e q(fa.d dVar, Object obj, boolean z10) throws IOException {
        if (!z10) {
            this.f47792c.beginObject();
        }
        dVar.a(obj, this);
        if (!z10) {
            this.f47792c.endObject();
        }
        return this;
    }
}
