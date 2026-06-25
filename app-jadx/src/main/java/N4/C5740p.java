package n4;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: n4.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5740p implements InterfaceC5739o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M3.q f53930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M3.i f53931b;

    /* JADX INFO: renamed from: n4.p$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends M3.i {
        a(M3.q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // M3.i
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(S3.k kVar, C5738n c5738n) {
            if (c5738n.a() == null) {
                kVar.I1(1);
            } else {
                kVar.Z0(1, c5738n.a());
            }
            if (c5738n.b() == null) {
                kVar.I1(2);
            } else {
                kVar.Z0(2, c5738n.b());
            }
        }
    }

    public C5740p(M3.q qVar) {
        this.f53930a = qVar;
        this.f53931b = new a(qVar);
    }

    public static List c() {
        return Collections.EMPTY_LIST;
    }

    @Override // n4.InterfaceC5739o
    public void a(C5738n c5738n) {
        this.f53930a.d();
        this.f53930a.e();
        try {
            this.f53931b.j(c5738n);
            this.f53930a.B();
        } finally {
            this.f53930a.i();
        }
    }

    @Override // n4.InterfaceC5739o
    public List b(String str) {
        M3.t tVarG = M3.t.g("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            tVarG.I1(1);
        } else {
            tVarG.Z0(1, str);
        }
        this.f53930a.d();
        Cursor cursorB = O3.b.b(this.f53930a, tVarG, false, null);
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
}
