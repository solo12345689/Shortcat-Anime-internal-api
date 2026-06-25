package n4;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n4.InterfaceC5734j;

/* JADX INFO: renamed from: n4.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5735k implements InterfaceC5734j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M3.q f53919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M3.i f53920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final M3.w f53921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final M3.w f53922d;

    /* JADX INFO: renamed from: n4.k$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends M3.i {
        a(M3.q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }

        @Override // M3.i
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(S3.k kVar, C5733i c5733i) {
            String str = c5733i.f53916a;
            if (str == null) {
                kVar.I1(1);
            } else {
                kVar.Z0(1, str);
            }
            kVar.m1(2, c5733i.a());
            kVar.m1(3, c5733i.f53918c);
        }
    }

    /* JADX INFO: renamed from: n4.k$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends M3.w {
        b(M3.q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
        }
    }

    /* JADX INFO: renamed from: n4.k$c */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class c extends M3.w {
        c(M3.q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public C5735k(M3.q qVar) {
        this.f53919a = qVar;
        this.f53920b = new a(qVar);
        this.f53921c = new b(qVar);
        this.f53922d = new c(qVar);
    }

    public static List h() {
        return Collections.EMPTY_LIST;
    }

    @Override // n4.InterfaceC5734j
    public void a(C5733i c5733i) {
        this.f53919a.d();
        this.f53919a.e();
        try {
            this.f53920b.j(c5733i);
            this.f53919a.B();
        } finally {
            this.f53919a.i();
        }
    }

    @Override // n4.InterfaceC5734j
    public C5733i b(C5737m c5737m) {
        return InterfaceC5734j.a.a(this, c5737m);
    }

    @Override // n4.InterfaceC5734j
    public C5733i c(String str, int i10) {
        M3.t tVarG = M3.t.g("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        if (str == null) {
            tVarG.I1(1);
        } else {
            tVarG.Z0(1, str);
        }
        tVarG.m1(2, i10);
        this.f53919a.d();
        C5733i c5733i = null;
        String string = null;
        Cursor cursorB = O3.b.b(this.f53919a, tVarG, false, null);
        try {
            int iE = O3.a.e(cursorB, "work_spec_id");
            int iE2 = O3.a.e(cursorB, "generation");
            int iE3 = O3.a.e(cursorB, "system_id");
            if (cursorB.moveToFirst()) {
                if (!cursorB.isNull(iE)) {
                    string = cursorB.getString(iE);
                }
                c5733i = new C5733i(string, cursorB.getInt(iE2), cursorB.getInt(iE3));
            }
            return c5733i;
        } finally {
            cursorB.close();
            tVarG.k();
        }
    }

    @Override // n4.InterfaceC5734j
    public List d() {
        M3.t tVarG = M3.t.g("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.f53919a.d();
        Cursor cursorB = O3.b.b(this.f53919a, tVarG, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.isNull(0) ? null : cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            tVarG.k();
        }
    }

    @Override // n4.InterfaceC5734j
    public void e(C5737m c5737m) {
        InterfaceC5734j.a.b(this, c5737m);
    }

    @Override // n4.InterfaceC5734j
    public void f(String str, int i10) {
        this.f53919a.d();
        S3.k kVarB = this.f53921c.b();
        if (str == null) {
            kVarB.I1(1);
        } else {
            kVarB.Z0(1, str);
        }
        kVarB.m1(2, i10);
        this.f53919a.e();
        try {
            kVarB.Z();
            this.f53919a.B();
        } finally {
            this.f53919a.i();
            this.f53921c.h(kVarB);
        }
    }

    @Override // n4.InterfaceC5734j
    public void g(String str) {
        this.f53919a.d();
        S3.k kVarB = this.f53922d.b();
        if (str == null) {
            kVarB.I1(1);
        } else {
            kVarB.Z0(1, str);
        }
        this.f53919a.e();
        try {
            kVarB.Z();
            this.f53919a.B();
        } finally {
            this.f53919a.i();
            this.f53922d.h(kVarB);
        }
    }
}
