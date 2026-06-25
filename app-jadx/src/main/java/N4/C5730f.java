package n4;

import android.database.Cursor;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: n4.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5730f implements InterfaceC5729e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M3.q f53913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final M3.i f53914b;

    /* JADX INFO: renamed from: n4.f$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    class a extends M3.i {
        a(M3.q qVar) {
            super(qVar);
        }

        @Override // M3.w
        public String e() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // M3.i
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(S3.k kVar, C5728d c5728d) {
            if (c5728d.a() == null) {
                kVar.I1(1);
            } else {
                kVar.Z0(1, c5728d.a());
            }
            if (c5728d.b() == null) {
                kVar.I1(2);
            } else {
                kVar.m1(2, c5728d.b().longValue());
            }
        }
    }

    public C5730f(M3.q qVar) {
        this.f53913a = qVar;
        this.f53914b = new a(qVar);
    }

    public static List c() {
        return Collections.EMPTY_LIST;
    }

    @Override // n4.InterfaceC5729e
    public void a(C5728d c5728d) {
        this.f53913a.d();
        this.f53913a.e();
        try {
            this.f53914b.j(c5728d);
            this.f53913a.B();
        } finally {
            this.f53913a.i();
        }
    }

    @Override // n4.InterfaceC5729e
    public Long b(String str) {
        M3.t tVarG = M3.t.g("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            tVarG.I1(1);
        } else {
            tVarG.Z0(1, str);
        }
        this.f53913a.d();
        Long lValueOf = null;
        Cursor cursorB = O3.b.b(this.f53913a, tVarG, false, null);
        try {
            if (cursorB.moveToFirst() && !cursorB.isNull(0)) {
                lValueOf = Long.valueOf(cursorB.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorB.close();
            tVarG.k();
        }
    }
}
