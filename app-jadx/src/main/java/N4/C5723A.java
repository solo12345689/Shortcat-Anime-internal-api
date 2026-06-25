package n4;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import n4.InterfaceC5750z;

/* JADX INFO: renamed from: n4.A, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5723A implements InterfaceC5750z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M3.q f53896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M3.i f53897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final M3.w f53898c;

    /* JADX INFO: renamed from: n4.A$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends M3.i {
        a(M3.q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // M3.i
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(S3.k kVar, C5749y c5749y) {
            if (c5749y.a() == null) {
                kVar.I1(1);
            } else {
                kVar.Z0(1, c5749y.a());
            }
            if (c5749y.b() == null) {
                kVar.I1(2);
            } else {
                kVar.Z0(2, c5749y.b());
            }
        }
    }

    /* JADX INFO: renamed from: n4.A$b */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class b extends M3.w {
        b(M3.q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "DELETE FROM worktag WHERE work_spec_id=?";
        }
    }

    public C5723A(M3.q qVar) {
        this.f53896a = qVar;
        this.f53897b = new a(qVar);
        this.f53898c = new b(qVar);
    }

    public static List e() {
        return Collections.EMPTY_LIST;
    }

    @Override // n4.InterfaceC5750z
    public List a(String str) {
        M3.t tVarG = M3.t.g("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            tVarG.I1(1);
        } else {
            tVarG.Z0(1, str);
        }
        this.f53896a.d();
        Cursor cursorB = O3.b.b(this.f53896a, tVarG, false, null);
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

    @Override // n4.InterfaceC5750z
    public void b(String str) {
        this.f53896a.d();
        S3.k kVarB = this.f53898c.b();
        if (str == null) {
            kVarB.I1(1);
        } else {
            kVarB.Z0(1, str);
        }
        this.f53896a.e();
        try {
            kVarB.Z();
            this.f53896a.B();
        } finally {
            this.f53896a.i();
            this.f53898c.h(kVarB);
        }
    }

    @Override // n4.InterfaceC5750z
    public void c(String str, Set set) {
        InterfaceC5750z.a.a(this, str, set);
    }

    @Override // n4.InterfaceC5750z
    public void d(C5749y c5749y) {
        this.f53896a.d();
        this.f53896a.e();
        try {
            this.f53897b.j(c5749y);
            this.f53896a.B();
        } finally {
            this.f53896a.i();
        }
    }
}
