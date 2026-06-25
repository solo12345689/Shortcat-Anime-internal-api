package n4;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: n4.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5727c implements InterfaceC5726b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M3.q f53908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M3.i f53909b;

    /* JADX INFO: renamed from: n4.c$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends M3.i {
        a(M3.q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // M3.i
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(S3.k kVar, C5725a c5725a) {
            if (c5725a.b() == null) {
                kVar.I1(1);
            } else {
                kVar.Z0(1, c5725a.b());
            }
            if (c5725a.a() == null) {
                kVar.I1(2);
            } else {
                kVar.Z0(2, c5725a.a());
            }
        }
    }

    public C5727c(M3.q qVar) {
        this.f53908a = qVar;
        this.f53909b = new a(qVar);
    }

    public static List e() {
        return Collections.EMPTY_LIST;
    }

    @Override // n4.InterfaceC5726b
    public List a(String str) {
        M3.t tVarG = M3.t.g("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            tVarG.I1(1);
        } else {
            tVarG.Z0(1, str);
        }
        this.f53908a.d();
        Cursor cursorB = O3.b.b(this.f53908a, tVarG, false, null);
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

    @Override // n4.InterfaceC5726b
    public void b(C5725a c5725a) {
        this.f53908a.d();
        this.f53908a.e();
        try {
            this.f53909b.j(c5725a);
            this.f53908a.B();
        } finally {
            this.f53908a.i();
        }
    }

    @Override // n4.InterfaceC5726b
    public boolean c(String str) {
        M3.t tVarG = M3.t.g("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            tVarG.I1(1);
        } else {
            tVarG.Z0(1, str);
        }
        this.f53908a.d();
        boolean z10 = false;
        Cursor cursorB = O3.b.b(this.f53908a, tVarG, false, null);
        try {
            if (cursorB.moveToFirst()) {
                z10 = cursorB.getInt(0) != 0;
            }
            return z10;
        } finally {
            cursorB.close();
            tVarG.k();
        }
    }

    @Override // n4.InterfaceC5726b
    public boolean d(String str) {
        M3.t tVarG = M3.t.g("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            tVarG.I1(1);
        } else {
            tVarG.Z0(1, str);
        }
        this.f53908a.d();
        boolean z10 = false;
        Cursor cursorB = O3.b.b(this.f53908a, tVarG, false, null);
        try {
            if (cursorB.moveToFirst()) {
                z10 = cursorB.getInt(0) != 0;
            }
            return z10;
        } finally {
            cursorB.close();
            tVarG.k();
        }
    }
}
