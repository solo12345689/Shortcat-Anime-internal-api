package ha;

import fa.InterfaceC4790a;
import fa.f;
import fa.g;
import ga.InterfaceC4870a;
import ga.InterfaceC4871b;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements InterfaceC4871b {

    /* JADX INFO: renamed from: e */
    private static final fa.d f47780e = new fa.d() { // from class: ha.a
        @Override // fa.d
        public final void a(Object obj, Object obj2) {
            d.c(obj, (fa.e) obj2);
        }
    };

    /* JADX INFO: renamed from: f */
    private static final f f47781f = new f() { // from class: ha.b
        @Override // fa.f
        public final void a(Object obj, Object obj2) {
            ((g) obj2).a((String) obj);
        }
    };

    /* JADX INFO: renamed from: g */
    private static final f f47782g = new f() { // from class: ha.c
        @Override // fa.f
        public final void a(Object obj, Object obj2) {
            ((g) obj2).e(((Boolean) obj).booleanValue());
        }
    };

    /* JADX INFO: renamed from: h */
    private static final b f47783h = new b(null);

    /* JADX INFO: renamed from: a */
    private final Map f47784a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Map f47785b = new HashMap();

    /* JADX INFO: renamed from: c */
    private fa.d f47786c = f47780e;

    /* JADX INFO: renamed from: d */
    private boolean f47787d = false;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a implements InterfaceC4790a {
        a() {
        }

        @Override // fa.InterfaceC4790a
        public void a(Object obj, Writer writer) {
            e eVar = new e(writer, d.this.f47784a, d.this.f47785b, d.this.f47786c, d.this.f47787d);
            eVar.h(obj, false);
            eVar.p();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class b implements f {

        /* JADX INFO: renamed from: a */
        private static final DateFormat f47789a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f47789a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private b() {
        }

        @Override // fa.f
        /* JADX INFO: renamed from: b */
        public void a(Date date, g gVar) {
            gVar.a(f47789a.format(date));
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public d() {
        m(String.class, f47781f);
        m(Boolean.class, f47782g);
        m(Date.class, f47783h);
    }

    public static /* synthetic */ void c(Object obj, fa.e eVar) {
        throw new fa.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    public InterfaceC4790a i() {
        return new a();
    }

    public d j(InterfaceC4870a interfaceC4870a) {
        interfaceC4870a.a(this);
        return this;
    }

    public d k(boolean z10) {
        this.f47787d = z10;
        return this;
    }

    @Override // ga.InterfaceC4871b
    /* JADX INFO: renamed from: l */
    public d a(Class cls, fa.d dVar) {
        this.f47784a.put(cls, dVar);
        this.f47785b.remove(cls);
        return this;
    }

    public d m(Class cls, f fVar) {
        this.f47785b.put(cls, fVar);
        this.f47784a.remove(cls);
        return this;
    }
}
