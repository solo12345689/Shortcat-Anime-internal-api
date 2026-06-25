package q2;

import P9.AbstractC2011u;
import P9.AbstractC2012v;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import q2.C6071C;
import t2.AbstractC6614a;
import t2.AbstractC6622i;

/* JADX INFO: renamed from: q2.C */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class C6071C {

    /* JADX INFO: renamed from: i */
    public static final C6071C f56320i = new c().a();

    /* JADX INFO: renamed from: j */
    private static final String f56321j = t2.a0.H0(0);

    /* JADX INFO: renamed from: k */
    private static final String f56322k = t2.a0.H0(1);

    /* JADX INFO: renamed from: l */
    private static final String f56323l = t2.a0.H0(2);

    /* JADX INFO: renamed from: m */
    private static final String f56324m = t2.a0.H0(3);

    /* JADX INFO: renamed from: n */
    private static final String f56325n = t2.a0.H0(4);

    /* JADX INFO: renamed from: o */
    private static final String f56326o = t2.a0.H0(5);

    /* JADX INFO: renamed from: a */
    public final String f56327a;

    /* JADX INFO: renamed from: b */
    public final h f56328b;

    /* JADX INFO: renamed from: c */
    public final h f56329c;

    /* JADX INFO: renamed from: d */
    public final g f56330d;

    /* JADX INFO: renamed from: e */
    public final C6077I f56331e;

    /* JADX INFO: renamed from: f */
    public final d f56332f;

    /* JADX INFO: renamed from: g */
    public final e f56333g;

    /* JADX INFO: renamed from: h */
    public final i f56334h;

    /* JADX INFO: renamed from: q2.C$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class b {

        /* JADX INFO: renamed from: c */
        private static final String f56335c = t2.a0.H0(0);

        /* JADX INFO: renamed from: a */
        public final Uri f56336a;

        /* JADX INFO: renamed from: b */
        public final Object f56337b;

        /* JADX INFO: renamed from: q2.C$b$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {

            /* JADX INFO: renamed from: a */
            private Uri f56338a;

            /* JADX INFO: renamed from: b */
            private Object f56339b;

            public a(Uri uri) {
                this.f56338a = uri;
            }

            public b c() {
                return new b(this);
            }
        }

        /* synthetic */ b(a aVar, a aVar2) {
            this(aVar);
        }

        public static b a(Bundle bundle) {
            Uri uri = (Uri) bundle.getParcelable(f56335c);
            AbstractC6614a.e(uri);
            return new a(uri).c();
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f56335c, this.f56336a);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f56336a.equals(bVar.f56336a) && Objects.equals(this.f56337b, bVar.f56337b);
        }

        public int hashCode() {
            int iHashCode = this.f56336a.hashCode() * 31;
            Object obj = this.f56337b;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }

        private b(a aVar) {
            this.f56336a = aVar.f56338a;
            this.f56337b = aVar.f56339b;
        }
    }

    /* JADX INFO: renamed from: q2.C$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class c {

        /* JADX INFO: renamed from: a */
        private String f56340a;

        /* JADX INFO: renamed from: b */
        private Uri f56341b;

        /* JADX INFO: renamed from: c */
        private String f56342c;

        /* JADX INFO: renamed from: d */
        private d.a f56343d;

        /* JADX INFO: renamed from: e */
        private f.a f56344e;

        /* JADX INFO: renamed from: f */
        private List f56345f;

        /* JADX INFO: renamed from: g */
        private String f56346g;

        /* JADX INFO: renamed from: h */
        private AbstractC2011u f56347h;

        /* JADX INFO: renamed from: i */
        private b f56348i;

        /* JADX INFO: renamed from: j */
        private Object f56349j;

        /* JADX INFO: renamed from: k */
        private long f56350k;

        /* JADX INFO: renamed from: l */
        private C6077I f56351l;

        /* JADX INFO: renamed from: m */
        private g.a f56352m;

        /* JADX INFO: renamed from: n */
        private i f56353n;

        /* synthetic */ c(C6071C c6071c, a aVar) {
            this(c6071c);
        }

        public C6071C a() {
            h hVar;
            AbstractC6614a.g(this.f56344e.f56398b == null || this.f56344e.f56397a != null);
            Uri uri = this.f56341b;
            if (uri != null) {
                hVar = new h(uri, this.f56342c, this.f56344e.f56397a != null ? this.f56344e.i() : null, this.f56348i, this.f56345f, this.f56346g, this.f56347h, this.f56349j, this.f56350k);
            } else {
                hVar = null;
            }
            String str = this.f56340a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e eVarH = this.f56343d.h();
            g gVarF = this.f56352m.f();
            C6077I c6077i = this.f56351l;
            if (c6077i == null) {
                c6077i = C6077I.f56472K;
            }
            return new C6071C(str2, eVarH, hVar, gVarF, c6077i, this.f56353n);
        }

        public c b(f fVar) {
            this.f56344e = fVar != null ? fVar.b() : new f.a();
            return this;
        }

        public c c(g gVar) {
            this.f56352m = gVar.a();
            return this;
        }

        public c d(String str) {
            this.f56340a = (String) AbstractC6614a.e(str);
            return this;
        }

        public c e(C6077I c6077i) {
            this.f56351l = c6077i;
            return this;
        }

        public c f(String str) {
            this.f56342c = str;
            return this;
        }

        public c g(i iVar) {
            this.f56353n = iVar;
            return this;
        }

        public c h(List list) {
            this.f56347h = AbstractC2011u.w(list);
            return this;
        }

        public c i(Object obj) {
            this.f56349j = obj;
            return this;
        }

        public c j(Uri uri) {
            this.f56341b = uri;
            return this;
        }

        public c k(String str) {
            return j(str == null ? null : Uri.parse(str));
        }

        public c() {
            this.f56343d = new d.a();
            this.f56344e = new f.a();
            this.f56345f = Collections.EMPTY_LIST;
            this.f56347h = AbstractC2011u.A();
            this.f56352m = new g.a();
            this.f56353n = i.f56439d;
            this.f56350k = -9223372036854775807L;
        }

        private c(C6071C c6071c) {
            f.a aVar;
            this();
            this.f56343d = c6071c.f56332f.a();
            this.f56340a = c6071c.f56327a;
            this.f56351l = c6071c.f56331e;
            this.f56352m = c6071c.f56330d.a();
            this.f56353n = c6071c.f56334h;
            h hVar = c6071c.f56328b;
            if (hVar != null) {
                this.f56346g = hVar.f56434f;
                this.f56342c = hVar.f56430b;
                this.f56341b = hVar.f56429a;
                this.f56345f = hVar.f56433e;
                this.f56347h = hVar.f56435g;
                this.f56349j = hVar.f56437i;
                f fVar = hVar.f56431c;
                if (fVar != null) {
                    aVar = fVar.b();
                } else {
                    aVar = new f.a();
                }
                this.f56344e = aVar;
                this.f56348i = hVar.f56432d;
                this.f56350k = hVar.f56438j;
            }
        }
    }

    /* JADX INFO: renamed from: q2.C$d */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class d {

        /* JADX INFO: renamed from: i */
        public static final d f56354i = new a().g();

        /* JADX INFO: renamed from: j */
        private static final String f56355j = t2.a0.H0(0);

        /* JADX INFO: renamed from: k */
        private static final String f56356k = t2.a0.H0(1);

        /* JADX INFO: renamed from: l */
        private static final String f56357l = t2.a0.H0(2);

        /* JADX INFO: renamed from: m */
        private static final String f56358m = t2.a0.H0(3);

        /* JADX INFO: renamed from: n */
        private static final String f56359n = t2.a0.H0(4);

        /* JADX INFO: renamed from: o */
        static final String f56360o = t2.a0.H0(5);

        /* JADX INFO: renamed from: p */
        static final String f56361p = t2.a0.H0(6);

        /* JADX INFO: renamed from: q */
        private static final String f56362q = t2.a0.H0(7);

        /* JADX INFO: renamed from: a */
        public final long f56363a;

        /* JADX INFO: renamed from: b */
        public final long f56364b;

        /* JADX INFO: renamed from: c */
        public final long f56365c;

        /* JADX INFO: renamed from: d */
        public final long f56366d;

        /* JADX INFO: renamed from: e */
        public final boolean f56367e;

        /* JADX INFO: renamed from: f */
        public final boolean f56368f;

        /* JADX INFO: renamed from: g */
        public final boolean f56369g;

        /* JADX INFO: renamed from: h */
        public final boolean f56370h;

        /* JADX INFO: renamed from: q2.C$d$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {

            /* JADX INFO: renamed from: a */
            private long f56371a;

            /* JADX INFO: renamed from: b */
            private long f56372b;

            /* JADX INFO: renamed from: c */
            private boolean f56373c;

            /* JADX INFO: renamed from: d */
            private boolean f56374d;

            /* JADX INFO: renamed from: e */
            private boolean f56375e;

            /* JADX INFO: renamed from: f */
            private boolean f56376f;

            /* synthetic */ a(d dVar, a aVar) {
                this(dVar);
            }

            public d g() {
                return new d(this);
            }

            public e h() {
                return new e(this);
            }

            public a i(boolean z10) {
                this.f56376f = z10;
                return this;
            }

            public a j(long j10) {
                return k(t2.a0.V0(j10));
            }

            public a k(long j10) {
                AbstractC6614a.a(j10 == Long.MIN_VALUE || j10 >= 0);
                this.f56372b = j10;
                return this;
            }

            public a l(boolean z10) {
                this.f56374d = z10;
                return this;
            }

            public a m(boolean z10) {
                this.f56373c = z10;
                return this;
            }

            public a n(long j10) {
                return o(t2.a0.V0(j10));
            }

            public a o(long j10) {
                AbstractC6614a.a(j10 >= 0);
                this.f56371a = j10;
                return this;
            }

            public a p(boolean z10) {
                this.f56375e = z10;
                return this;
            }

            public a() {
                this.f56372b = Long.MIN_VALUE;
            }

            private a(d dVar) {
                this.f56371a = dVar.f56364b;
                this.f56372b = dVar.f56366d;
                this.f56373c = dVar.f56367e;
                this.f56374d = dVar.f56368f;
                this.f56375e = dVar.f56369g;
                this.f56376f = dVar.f56370h;
            }
        }

        /* synthetic */ d(a aVar, a aVar2) {
            this(aVar);
        }

        public static e b(Bundle bundle) {
            a aVar = new a();
            String str = f56355j;
            d dVar = f56354i;
            a aVarI = aVar.n(bundle.getLong(str, dVar.f56363a)).j(bundle.getLong(f56356k, dVar.f56365c)).m(bundle.getBoolean(f56357l, dVar.f56367e)).l(bundle.getBoolean(f56358m, dVar.f56368f)).p(bundle.getBoolean(f56359n, dVar.f56369g)).i(bundle.getBoolean(f56362q, dVar.f56370h));
            long j10 = bundle.getLong(f56360o, dVar.f56364b);
            if (j10 != dVar.f56364b) {
                aVarI.o(j10);
            }
            long j11 = bundle.getLong(f56361p, dVar.f56366d);
            if (j11 != dVar.f56366d) {
                aVarI.k(j11);
            }
            return aVarI.h();
        }

        public a a() {
            return new a();
        }

        public Bundle c() {
            Bundle bundle = new Bundle();
            long j10 = this.f56363a;
            d dVar = f56354i;
            if (j10 != dVar.f56363a) {
                bundle.putLong(f56355j, j10);
            }
            long j11 = this.f56365c;
            if (j11 != dVar.f56365c) {
                bundle.putLong(f56356k, j11);
            }
            long j12 = this.f56364b;
            if (j12 != dVar.f56364b) {
                bundle.putLong(f56360o, j12);
            }
            long j13 = this.f56366d;
            if (j13 != dVar.f56366d) {
                bundle.putLong(f56361p, j13);
            }
            boolean z10 = this.f56367e;
            if (z10 != dVar.f56367e) {
                bundle.putBoolean(f56357l, z10);
            }
            boolean z11 = this.f56368f;
            if (z11 != dVar.f56368f) {
                bundle.putBoolean(f56358m, z11);
            }
            boolean z12 = this.f56369g;
            if (z12 != dVar.f56369g) {
                bundle.putBoolean(f56359n, z12);
            }
            boolean z13 = this.f56370h;
            if (z13 != dVar.f56370h) {
                bundle.putBoolean(f56362q, z13);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f56364b == dVar.f56364b && this.f56366d == dVar.f56366d && this.f56367e == dVar.f56367e && this.f56368f == dVar.f56368f && this.f56369g == dVar.f56369g && this.f56370h == dVar.f56370h;
        }

        public int hashCode() {
            long j10 = this.f56364b;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            long j11 = this.f56366d;
            return ((((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f56367e ? 1 : 0)) * 31) + (this.f56368f ? 1 : 0)) * 31) + (this.f56369g ? 1 : 0)) * 31) + (this.f56370h ? 1 : 0);
        }

        private d(a aVar) {
            this.f56363a = t2.a0.F1(aVar.f56371a);
            this.f56365c = t2.a0.F1(aVar.f56372b);
            this.f56364b = aVar.f56371a;
            this.f56366d = aVar.f56372b;
            this.f56367e = aVar.f56373c;
            this.f56368f = aVar.f56374d;
            this.f56369g = aVar.f56375e;
            this.f56370h = aVar.f56376f;
        }
    }

    /* JADX INFO: renamed from: q2.C$e */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class e extends d {

        /* JADX INFO: renamed from: r */
        public static final e f56377r = new d.a().h();

        /* synthetic */ e(d.a aVar, a aVar2) {
            this(aVar);
        }

        private e(d.a aVar) {
            super(aVar);
        }
    }

    /* JADX INFO: renamed from: q2.C$f */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class f {

        /* JADX INFO: renamed from: l */
        private static final String f56378l = t2.a0.H0(0);

        /* JADX INFO: renamed from: m */
        private static final String f56379m = t2.a0.H0(1);

        /* JADX INFO: renamed from: n */
        private static final String f56380n = t2.a0.H0(2);

        /* JADX INFO: renamed from: o */
        private static final String f56381o = t2.a0.H0(3);

        /* JADX INFO: renamed from: p */
        static final String f56382p = t2.a0.H0(4);

        /* JADX INFO: renamed from: q */
        private static final String f56383q = t2.a0.H0(5);

        /* JADX INFO: renamed from: r */
        private static final String f56384r = t2.a0.H0(6);

        /* JADX INFO: renamed from: s */
        private static final String f56385s = t2.a0.H0(7);

        /* JADX INFO: renamed from: a */
        public final UUID f56386a;

        /* JADX INFO: renamed from: b */
        public final UUID f56387b;

        /* JADX INFO: renamed from: c */
        public final Uri f56388c;

        /* JADX INFO: renamed from: d */
        public final AbstractC2012v f56389d;

        /* JADX INFO: renamed from: e */
        public final AbstractC2012v f56390e;

        /* JADX INFO: renamed from: f */
        public final boolean f56391f;

        /* JADX INFO: renamed from: g */
        public final boolean f56392g;

        /* JADX INFO: renamed from: h */
        public final boolean f56393h;

        /* JADX INFO: renamed from: i */
        public final AbstractC2011u f56394i;

        /* JADX INFO: renamed from: j */
        public final AbstractC2011u f56395j;

        /* JADX INFO: renamed from: k */
        private final byte[] f56396k;

        /* JADX INFO: renamed from: q2.C$f$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {

            /* JADX INFO: renamed from: a */
            private UUID f56397a;

            /* JADX INFO: renamed from: b */
            private Uri f56398b;

            /* JADX INFO: renamed from: c */
            private AbstractC2012v f56399c;

            /* JADX INFO: renamed from: d */
            private boolean f56400d;

            /* JADX INFO: renamed from: e */
            private boolean f56401e;

            /* JADX INFO: renamed from: f */
            private boolean f56402f;

            /* JADX INFO: renamed from: g */
            private AbstractC2011u f56403g;

            /* JADX INFO: renamed from: h */
            private byte[] f56404h;

            /* synthetic */ a(a aVar) {
                this();
            }

            public f i() {
                return new f(this);
            }

            public a j(boolean z10) {
                this.f56402f = z10;
                return this;
            }

            public a k(List list) {
                this.f56403g = AbstractC2011u.w(list);
                return this;
            }

            public a l(byte[] bArr) {
                this.f56404h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
                return this;
            }

            public a m(Map map) {
                this.f56399c = AbstractC2012v.d(map);
                return this;
            }

            public a n(Uri uri) {
                this.f56398b = uri;
                return this;
            }

            public a o(String str) {
                this.f56398b = str == null ? null : Uri.parse(str);
                return this;
            }

            public a p(boolean z10) {
                this.f56400d = z10;
                return this;
            }

            public a q(boolean z10) {
                this.f56401e = z10;
                return this;
            }

            /* synthetic */ a(f fVar, a aVar) {
                this(fVar);
            }

            public a(UUID uuid) {
                this();
                this.f56397a = uuid;
            }

            private a() {
                this.f56399c = AbstractC2012v.k();
                this.f56401e = true;
                this.f56403g = AbstractC2011u.A();
            }

            private a(f fVar) {
                this.f56397a = fVar.f56386a;
                this.f56398b = fVar.f56388c;
                this.f56399c = fVar.f56390e;
                this.f56400d = fVar.f56391f;
                this.f56401e = fVar.f56392g;
                this.f56402f = fVar.f56393h;
                this.f56403g = fVar.f56395j;
                this.f56404h = fVar.f56396k;
            }
        }

        /* synthetic */ f(a aVar, a aVar2) {
            this(aVar);
        }

        public static f c(Bundle bundle) {
            UUID uuidFromString = UUID.fromString((String) AbstractC6614a.e(bundle.getString(f56378l)));
            Uri uri = (Uri) bundle.getParcelable(f56379m);
            AbstractC2012v abstractC2012vB = AbstractC6622i.b(AbstractC6622i.e(bundle, f56380n, Bundle.EMPTY));
            boolean z10 = bundle.getBoolean(f56381o, false);
            boolean z11 = bundle.getBoolean(f56382p, false);
            boolean z12 = bundle.getBoolean(f56383q, false);
            AbstractC2011u abstractC2011uW = AbstractC2011u.w(AbstractC6622i.f(bundle, f56384r, new ArrayList()));
            return new a(uuidFromString).n(uri).m(abstractC2012vB).p(z10).j(z12).q(z11).k(abstractC2011uW).l(bundle.getByteArray(f56385s)).i();
        }

        public a b() {
            return new a();
        }

        public byte[] d() {
            byte[] bArr = this.f56396k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public Bundle e() {
            Bundle bundle = new Bundle();
            bundle.putString(f56378l, this.f56386a.toString());
            Uri uri = this.f56388c;
            if (uri != null) {
                bundle.putParcelable(f56379m, uri);
            }
            if (!this.f56390e.isEmpty()) {
                bundle.putBundle(f56380n, AbstractC6622i.g(this.f56390e));
            }
            boolean z10 = this.f56391f;
            if (z10) {
                bundle.putBoolean(f56381o, z10);
            }
            boolean z11 = this.f56392g;
            if (z11) {
                bundle.putBoolean(f56382p, z11);
            }
            boolean z12 = this.f56393h;
            if (z12) {
                bundle.putBoolean(f56383q, z12);
            }
            if (!this.f56395j.isEmpty()) {
                bundle.putIntegerArrayList(f56384r, new ArrayList<>(this.f56395j));
            }
            byte[] bArr = this.f56396k;
            if (bArr != null) {
                bundle.putByteArray(f56385s, bArr);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f56386a.equals(fVar.f56386a) && Objects.equals(this.f56388c, fVar.f56388c) && Objects.equals(this.f56390e, fVar.f56390e) && this.f56391f == fVar.f56391f && this.f56393h == fVar.f56393h && this.f56392g == fVar.f56392g && this.f56395j.equals(fVar.f56395j) && Arrays.equals(this.f56396k, fVar.f56396k);
        }

        public int hashCode() {
            int iHashCode = this.f56386a.hashCode() * 31;
            Uri uri = this.f56388c;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f56390e.hashCode()) * 31) + (this.f56391f ? 1 : 0)) * 31) + (this.f56393h ? 1 : 0)) * 31) + (this.f56392g ? 1 : 0)) * 31) + this.f56395j.hashCode()) * 31) + Arrays.hashCode(this.f56396k);
        }

        private f(a aVar) {
            AbstractC6614a.g((aVar.f56402f && aVar.f56398b == null) ? false : true);
            UUID uuid = (UUID) AbstractC6614a.e(aVar.f56397a);
            this.f56386a = uuid;
            this.f56387b = uuid;
            this.f56388c = aVar.f56398b;
            this.f56389d = aVar.f56399c;
            this.f56390e = aVar.f56399c;
            this.f56391f = aVar.f56400d;
            this.f56393h = aVar.f56402f;
            this.f56392g = aVar.f56401e;
            this.f56394i = aVar.f56403g;
            this.f56395j = aVar.f56403g;
            this.f56396k = aVar.f56404h != null ? Arrays.copyOf(aVar.f56404h, aVar.f56404h.length) : null;
        }
    }

    /* JADX INFO: renamed from: q2.C$g */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g {

        /* JADX INFO: renamed from: f */
        public static final g f56405f = new a().f();

        /* JADX INFO: renamed from: g */
        private static final String f56406g = t2.a0.H0(0);

        /* JADX INFO: renamed from: h */
        private static final String f56407h = t2.a0.H0(1);

        /* JADX INFO: renamed from: i */
        private static final String f56408i = t2.a0.H0(2);

        /* JADX INFO: renamed from: j */
        private static final String f56409j = t2.a0.H0(3);

        /* JADX INFO: renamed from: k */
        private static final String f56410k = t2.a0.H0(4);

        /* JADX INFO: renamed from: a */
        public final long f56411a;

        /* JADX INFO: renamed from: b */
        public final long f56412b;

        /* JADX INFO: renamed from: c */
        public final long f56413c;

        /* JADX INFO: renamed from: d */
        public final float f56414d;

        /* JADX INFO: renamed from: e */
        public final float f56415e;

        /* JADX INFO: renamed from: q2.C$g$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {

            /* JADX INFO: renamed from: a */
            private long f56416a;

            /* JADX INFO: renamed from: b */
            private long f56417b;

            /* JADX INFO: renamed from: c */
            private long f56418c;

            /* JADX INFO: renamed from: d */
            private float f56419d;

            /* JADX INFO: renamed from: e */
            private float f56420e;

            /* synthetic */ a(g gVar, a aVar) {
                this(gVar);
            }

            public g f() {
                return new g(this);
            }

            public a g(long j10) {
                this.f56418c = j10;
                return this;
            }

            public a h(float f10) {
                this.f56420e = f10;
                return this;
            }

            public a i(long j10) {
                this.f56417b = j10;
                return this;
            }

            public a j(float f10) {
                this.f56419d = f10;
                return this;
            }

            public a k(long j10) {
                this.f56416a = j10;
                return this;
            }

            public a() {
                this.f56416a = -9223372036854775807L;
                this.f56417b = -9223372036854775807L;
                this.f56418c = -9223372036854775807L;
                this.f56419d = -3.4028235E38f;
                this.f56420e = -3.4028235E38f;
            }

            private a(g gVar) {
                this.f56416a = gVar.f56411a;
                this.f56417b = gVar.f56412b;
                this.f56418c = gVar.f56413c;
                this.f56419d = gVar.f56414d;
                this.f56420e = gVar.f56415e;
            }
        }

        /* synthetic */ g(a aVar, a aVar2) {
            this(aVar);
        }

        public static g b(Bundle bundle) {
            a aVar = new a();
            String str = f56406g;
            g gVar = f56405f;
            return aVar.k(bundle.getLong(str, gVar.f56411a)).i(bundle.getLong(f56407h, gVar.f56412b)).g(bundle.getLong(f56408i, gVar.f56413c)).j(bundle.getFloat(f56409j, gVar.f56414d)).h(bundle.getFloat(f56410k, gVar.f56415e)).f();
        }

        public a a() {
            return new a();
        }

        public Bundle c() {
            Bundle bundle = new Bundle();
            long j10 = this.f56411a;
            g gVar = f56405f;
            if (j10 != gVar.f56411a) {
                bundle.putLong(f56406g, j10);
            }
            long j11 = this.f56412b;
            if (j11 != gVar.f56412b) {
                bundle.putLong(f56407h, j11);
            }
            long j12 = this.f56413c;
            if (j12 != gVar.f56413c) {
                bundle.putLong(f56408i, j12);
            }
            float f10 = this.f56414d;
            if (f10 != gVar.f56414d) {
                bundle.putFloat(f56409j, f10);
            }
            float f11 = this.f56415e;
            if (f11 != gVar.f56415e) {
                bundle.putFloat(f56410k, f11);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f56411a == gVar.f56411a && this.f56412b == gVar.f56412b && this.f56413c == gVar.f56413c && this.f56414d == gVar.f56414d && this.f56415e == gVar.f56415e;
        }

        public int hashCode() {
            long j10 = this.f56411a;
            long j11 = this.f56412b;
            int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f56413c;
            int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f10 = this.f56414d;
            int iFloatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f56415e;
            return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }

        private g(a aVar) {
            this(aVar.f56416a, aVar.f56417b, aVar.f56418c, aVar.f56419d, aVar.f56420e);
        }

        public g(long j10, long j11, long j12, float f10, float f11) {
            this.f56411a = j10;
            this.f56412b = j11;
            this.f56413c = j12;
            this.f56414d = f10;
            this.f56415e = f11;
        }
    }

    /* JADX INFO: renamed from: q2.C$h */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class h {

        /* JADX INFO: renamed from: k */
        private static final String f56421k = t2.a0.H0(0);

        /* JADX INFO: renamed from: l */
        private static final String f56422l = t2.a0.H0(1);

        /* JADX INFO: renamed from: m */
        private static final String f56423m = t2.a0.H0(2);

        /* JADX INFO: renamed from: n */
        private static final String f56424n = t2.a0.H0(3);

        /* JADX INFO: renamed from: o */
        private static final String f56425o = t2.a0.H0(4);

        /* JADX INFO: renamed from: p */
        private static final String f56426p = t2.a0.H0(5);

        /* JADX INFO: renamed from: q */
        private static final String f56427q = t2.a0.H0(6);

        /* JADX INFO: renamed from: r */
        private static final String f56428r = t2.a0.H0(7);

        /* JADX INFO: renamed from: a */
        public final Uri f56429a;

        /* JADX INFO: renamed from: b */
        public final String f56430b;

        /* JADX INFO: renamed from: c */
        public final f f56431c;

        /* JADX INFO: renamed from: d */
        public final b f56432d;

        /* JADX INFO: renamed from: e */
        public final List f56433e;

        /* JADX INFO: renamed from: f */
        public final String f56434f;

        /* JADX INFO: renamed from: g */
        public final AbstractC2011u f56435g;

        /* JADX INFO: renamed from: h */
        public final List f56436h;

        /* JADX INFO: renamed from: i */
        public final Object f56437i;

        /* JADX INFO: renamed from: j */
        public final long f56438j;

        /* synthetic */ h(Uri uri, String str, f fVar, b bVar, List list, String str2, AbstractC2011u abstractC2011u, Object obj, long j10, a aVar) {
            this(uri, str, fVar, bVar, list, str2, abstractC2011u, obj, j10);
        }

        public static h a(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(f56423m);
            f fVarC = bundle2 == null ? null : f.c(bundle2);
            Bundle bundle3 = bundle.getBundle(f56424n);
            b bVarA = bundle3 != null ? b.a(bundle3) : null;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f56425o);
            AbstractC2011u abstractC2011uA = parcelableArrayList == null ? AbstractC2011u.A() : AbstractC6622i.d(new O9.f() { // from class: q2.F
                @Override // O9.f
                public final Object apply(Object obj) {
                    return U.b((Bundle) obj);
                }
            }, parcelableArrayList);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(f56427q);
            return new h((Uri) AbstractC6614a.e((Uri) bundle.getParcelable(f56421k)), bundle.getString(f56422l), fVarC, bVarA, abstractC2011uA, bundle.getString(f56426p), parcelableArrayList2 == null ? AbstractC2011u.A() : AbstractC6622i.d(new O9.f() { // from class: q2.G
                @Override // O9.f
                public final Object apply(Object obj) {
                    return C6071C.k.b((Bundle) obj);
                }
            }, parcelableArrayList2), null, bundle.getLong(f56428r, -9223372036854775807L));
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f56421k, this.f56429a);
            String str = this.f56430b;
            if (str != null) {
                bundle.putString(f56422l, str);
            }
            f fVar = this.f56431c;
            if (fVar != null) {
                bundle.putBundle(f56423m, fVar.e());
            }
            b bVar = this.f56432d;
            if (bVar != null) {
                bundle.putBundle(f56424n, bVar.b());
            }
            if (!this.f56433e.isEmpty()) {
                bundle.putParcelableArrayList(f56425o, AbstractC6622i.h(this.f56433e, new O9.f() { // from class: q2.D
                    @Override // O9.f
                    public final Object apply(Object obj) {
                        return ((U) obj).u();
                    }
                }));
            }
            String str2 = this.f56434f;
            if (str2 != null) {
                bundle.putString(f56426p, str2);
            }
            if (!this.f56435g.isEmpty()) {
                bundle.putParcelableArrayList(f56427q, AbstractC6622i.h(this.f56435g, new O9.f() { // from class: q2.E
                    @Override // O9.f
                    public final Object apply(Object obj) {
                        return ((C6071C.k) obj).c();
                    }
                }));
            }
            long j10 = this.f56438j;
            if (j10 != -9223372036854775807L) {
                bundle.putLong(f56428r, j10);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f56429a.equals(hVar.f56429a) && Objects.equals(this.f56430b, hVar.f56430b) && Objects.equals(this.f56431c, hVar.f56431c) && Objects.equals(this.f56432d, hVar.f56432d) && this.f56433e.equals(hVar.f56433e) && Objects.equals(this.f56434f, hVar.f56434f) && this.f56435g.equals(hVar.f56435g) && Objects.equals(this.f56437i, hVar.f56437i) && this.f56438j == hVar.f56438j;
        }

        public int hashCode() {
            int iHashCode = this.f56429a.hashCode() * 31;
            String str = this.f56430b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f56431c;
            int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            b bVar = this.f56432d;
            int iHashCode4 = (((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f56433e.hashCode()) * 31;
            String str2 = this.f56434f;
            int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f56435g.hashCode()) * 31;
            Object obj = this.f56437i;
            return (int) ((((long) (iHashCode5 + (obj != null ? obj.hashCode() : 0))) * 31) + this.f56438j);
        }

        private h(Uri uri, String str, f fVar, b bVar, List list, String str2, AbstractC2011u abstractC2011u, Object obj, long j10) {
            this.f56429a = uri;
            this.f56430b = AbstractC6079K.u(str);
            this.f56431c = fVar;
            this.f56432d = bVar;
            this.f56433e = list;
            this.f56434f = str2;
            this.f56435g = abstractC2011u;
            AbstractC2011u.a aVarT = AbstractC2011u.t();
            for (int i10 = 0; i10 < abstractC2011u.size(); i10++) {
                aVarT.a(((k) abstractC2011u.get(i10)).a().j());
            }
            this.f56436h = aVarT.k();
            this.f56437i = obj;
            this.f56438j = j10;
        }
    }

    /* JADX INFO: renamed from: q2.C$i */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class i {

        /* JADX INFO: renamed from: d */
        public static final i f56439d = new a().d();

        /* JADX INFO: renamed from: e */
        private static final String f56440e = t2.a0.H0(0);

        /* JADX INFO: renamed from: f */
        private static final String f56441f = t2.a0.H0(1);

        /* JADX INFO: renamed from: g */
        private static final String f56442g = t2.a0.H0(2);

        /* JADX INFO: renamed from: a */
        public final Uri f56443a;

        /* JADX INFO: renamed from: b */
        public final String f56444b;

        /* JADX INFO: renamed from: c */
        public final Bundle f56445c;

        /* JADX INFO: renamed from: q2.C$i$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {

            /* JADX INFO: renamed from: a */
            private Uri f56446a;

            /* JADX INFO: renamed from: b */
            private String f56447b;

            /* JADX INFO: renamed from: c */
            private Bundle f56448c;

            public i d() {
                return new i(this);
            }

            public a e(Bundle bundle) {
                this.f56448c = bundle;
                return this;
            }

            public a f(Uri uri) {
                this.f56446a = uri;
                return this;
            }

            public a g(String str) {
                this.f56447b = str;
                return this;
            }
        }

        /* synthetic */ i(a aVar, a aVar2) {
            this(aVar);
        }

        public static i a(Bundle bundle) {
            return new a().f((Uri) bundle.getParcelable(f56440e)).g(bundle.getString(f56441f)).e(bundle.getBundle(f56442g)).d();
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            Uri uri = this.f56443a;
            if (uri != null) {
                bundle.putParcelable(f56440e, uri);
            }
            String str = this.f56444b;
            if (str != null) {
                bundle.putString(f56441f, str);
            }
            Bundle bundle2 = this.f56445c;
            if (bundle2 != null) {
                bundle.putBundle(f56442g, bundle2);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (Objects.equals(this.f56443a, iVar.f56443a) && Objects.equals(this.f56444b, iVar.f56444b)) {
                if ((this.f56445c == null) == (iVar.f56445c == null)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Uri uri = this.f56443a;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f56444b;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f56445c != null ? 1 : 0);
        }

        private i(a aVar) {
            this.f56443a = aVar.f56446a;
            this.f56444b = aVar.f56447b;
            this.f56445c = aVar.f56448c;
        }
    }

    /* JADX INFO: renamed from: q2.C$j */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class j extends k {
        /* synthetic */ j(k.a aVar, a aVar2) {
            this(aVar);
        }

        private j(k.a aVar) {
            super(aVar);
        }
    }

    /* JADX INFO: renamed from: q2.C$k */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static class k {

        /* JADX INFO: renamed from: h */
        private static final String f56449h = t2.a0.H0(0);

        /* JADX INFO: renamed from: i */
        private static final String f56450i = t2.a0.H0(1);

        /* JADX INFO: renamed from: j */
        private static final String f56451j = t2.a0.H0(2);

        /* JADX INFO: renamed from: k */
        private static final String f56452k = t2.a0.H0(3);

        /* JADX INFO: renamed from: l */
        private static final String f56453l = t2.a0.H0(4);

        /* JADX INFO: renamed from: m */
        private static final String f56454m = t2.a0.H0(5);

        /* JADX INFO: renamed from: n */
        private static final String f56455n = t2.a0.H0(6);

        /* JADX INFO: renamed from: a */
        public final Uri f56456a;

        /* JADX INFO: renamed from: b */
        public final String f56457b;

        /* JADX INFO: renamed from: c */
        public final String f56458c;

        /* JADX INFO: renamed from: d */
        public final int f56459d;

        /* JADX INFO: renamed from: e */
        public final int f56460e;

        /* JADX INFO: renamed from: f */
        public final String f56461f;

        /* JADX INFO: renamed from: g */
        public final String f56462g;

        /* JADX INFO: renamed from: q2.C$k$a */
        /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
        public static final class a {

            /* JADX INFO: renamed from: a */
            private Uri f56463a;

            /* JADX INFO: renamed from: b */
            private String f56464b;

            /* JADX INFO: renamed from: c */
            private String f56465c;

            /* JADX INFO: renamed from: d */
            private int f56466d;

            /* JADX INFO: renamed from: e */
            private int f56467e;

            /* JADX INFO: renamed from: f */
            private String f56468f;

            /* JADX INFO: renamed from: g */
            private String f56469g;

            /* synthetic */ a(k kVar, a aVar) {
                this(kVar);
            }

            public j j() {
                return new j(this);
            }

            public k i() {
                return new k(this);
            }

            public a k(String str) {
                this.f56469g = str;
                return this;
            }

            public a l(String str) {
                this.f56468f = str;
                return this;
            }

            public a m(String str) {
                this.f56465c = str;
                return this;
            }

            public a n(String str) {
                this.f56464b = AbstractC6079K.u(str);
                return this;
            }

            public a o(int i10) {
                this.f56467e = i10;
                return this;
            }

            public a p(int i10) {
                this.f56466d = i10;
                return this;
            }

            public a(Uri uri) {
                this.f56463a = uri;
            }

            private a(k kVar) {
                this.f56463a = kVar.f56456a;
                this.f56464b = kVar.f56457b;
                this.f56465c = kVar.f56458c;
                this.f56466d = kVar.f56459d;
                this.f56467e = kVar.f56460e;
                this.f56468f = kVar.f56461f;
                this.f56469g = kVar.f56462g;
            }
        }

        /* synthetic */ k(a aVar, a aVar2) {
            this(aVar);
        }

        public static k b(Bundle bundle) {
            Uri uri = (Uri) AbstractC6614a.e((Uri) bundle.getParcelable(f56449h));
            String string = bundle.getString(f56450i);
            String string2 = bundle.getString(f56451j);
            int i10 = bundle.getInt(f56452k, 0);
            int i11 = bundle.getInt(f56453l, 0);
            String string3 = bundle.getString(f56454m);
            return new a(uri).n(string).m(string2).p(i10).o(i11).l(string3).k(bundle.getString(f56455n)).i();
        }

        public a a() {
            return new a();
        }

        public Bundle c() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f56449h, this.f56456a);
            String str = this.f56457b;
            if (str != null) {
                bundle.putString(f56450i, str);
            }
            String str2 = this.f56458c;
            if (str2 != null) {
                bundle.putString(f56451j, str2);
            }
            int i10 = this.f56459d;
            if (i10 != 0) {
                bundle.putInt(f56452k, i10);
            }
            int i11 = this.f56460e;
            if (i11 != 0) {
                bundle.putInt(f56453l, i11);
            }
            String str3 = this.f56461f;
            if (str3 != null) {
                bundle.putString(f56454m, str3);
            }
            String str4 = this.f56462g;
            if (str4 != null) {
                bundle.putString(f56455n, str4);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f56456a.equals(kVar.f56456a) && Objects.equals(this.f56457b, kVar.f56457b) && Objects.equals(this.f56458c, kVar.f56458c) && this.f56459d == kVar.f56459d && this.f56460e == kVar.f56460e && Objects.equals(this.f56461f, kVar.f56461f) && Objects.equals(this.f56462g, kVar.f56462g);
        }

        public int hashCode() {
            int iHashCode = this.f56456a.hashCode() * 31;
            String str = this.f56457b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f56458c;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f56459d) * 31) + this.f56460e) * 31;
            String str3 = this.f56461f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f56462g;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        private k(a aVar) {
            this.f56456a = aVar.f56463a;
            this.f56457b = aVar.f56464b;
            this.f56458c = aVar.f56465c;
            this.f56459d = aVar.f56466d;
            this.f56460e = aVar.f56467e;
            this.f56461f = aVar.f56468f;
            this.f56462g = aVar.f56469g;
        }
    }

    /* synthetic */ C6071C(String str, e eVar, h hVar, g gVar, C6077I c6077i, i iVar, a aVar) {
        this(str, eVar, hVar, gVar, c6077i, iVar);
    }

    public static C6071C b(Bundle bundle) {
        String str = (String) AbstractC6614a.e(bundle.getString(f56321j, ""));
        Bundle bundle2 = bundle.getBundle(f56322k);
        g gVarB = bundle2 == null ? g.f56405f : g.b(bundle2);
        Bundle bundle3 = bundle.getBundle(f56323l);
        C6077I c6077iB = bundle3 == null ? C6077I.f56472K : C6077I.b(bundle3);
        Bundle bundle4 = bundle.getBundle(f56324m);
        e eVarB = bundle4 == null ? e.f56377r : d.b(bundle4);
        Bundle bundle5 = bundle.getBundle(f56325n);
        i iVarA = bundle5 == null ? i.f56439d : i.a(bundle5);
        Bundle bundle6 = bundle.getBundle(f56326o);
        return new C6071C(str, eVarB, bundle6 == null ? null : h.a(bundle6), gVarB, c6077iB, iVarA);
    }

    public static C6071C c(Uri uri) {
        return new c().j(uri).a();
    }

    public static C6071C d(String str) {
        return new c().k(str).a();
    }

    private Bundle f(boolean z10) {
        h hVar;
        Bundle bundle = new Bundle();
        if (!this.f56327a.equals("")) {
            bundle.putString(f56321j, this.f56327a);
        }
        if (!this.f56330d.equals(g.f56405f)) {
            bundle.putBundle(f56322k, this.f56330d.c());
        }
        if (!this.f56331e.equals(C6077I.f56472K)) {
            bundle.putBundle(f56323l, this.f56331e.e());
        }
        if (!this.f56332f.equals(d.f56354i)) {
            bundle.putBundle(f56324m, this.f56332f.c());
        }
        if (!this.f56334h.equals(i.f56439d)) {
            bundle.putBundle(f56325n, this.f56334h.b());
        }
        if (z10 && (hVar = this.f56328b) != null) {
            bundle.putBundle(f56326o, hVar.b());
        }
        return bundle;
    }

    public c a() {
        return new c();
    }

    public Bundle e() {
        return f(false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6071C)) {
            return false;
        }
        C6071C c6071c = (C6071C) obj;
        return Objects.equals(this.f56327a, c6071c.f56327a) && this.f56332f.equals(c6071c.f56332f) && Objects.equals(this.f56328b, c6071c.f56328b) && Objects.equals(this.f56330d, c6071c.f56330d) && Objects.equals(this.f56331e, c6071c.f56331e) && Objects.equals(this.f56334h, c6071c.f56334h);
    }

    public Bundle g() {
        return f(true);
    }

    public int hashCode() {
        int iHashCode = this.f56327a.hashCode() * 31;
        h hVar = this.f56328b;
        return ((((((((iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f56330d.hashCode()) * 31) + this.f56332f.hashCode()) * 31) + this.f56331e.hashCode()) * 31) + this.f56334h.hashCode();
    }

    private C6071C(String str, e eVar, h hVar, g gVar, C6077I c6077i, i iVar) {
        this.f56327a = str;
        this.f56328b = hVar;
        this.f56329c = hVar;
        this.f56330d = gVar;
        this.f56331e = c6077i;
        this.f56332f = eVar;
        this.f56333g = eVar;
        this.f56334h = iVar;
    }
}
