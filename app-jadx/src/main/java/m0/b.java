package M0;

import Td.r;
import android.R;
import android.os.Build;
import be.AbstractC3048a;
import kotlin.enums.EnumEntries;
import l0.m;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f11616c = new b("Copy", 0, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f11617d = new b("Paste", 1, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f11618e = new b("Cut", 2, 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f11619f = new b("SelectAll", 3, 3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f11620g = new b("Autofill", 4, 4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ b[] f11621h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f11622i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11624b;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11625a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f11616c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f11617d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.f11618e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.f11619f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.f11620g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f11625a = iArr;
        }
    }

    static {
        b[] bVarArrA = a();
        f11621h = bVarArrA;
        f11622i = AbstractC3048a.a(bVarArrA);
    }

    private b(String str, int i10, int i11) {
        this.f11623a = i11;
        this.f11624b = i11;
    }

    private static final /* synthetic */ b[] a() {
        return new b[]{f11616c, f11617d, f11618e, f11619f, f11620g};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f11621h.clone();
    }

    public final int b() {
        return this.f11623a;
    }

    public final int c() {
        return this.f11624b;
    }

    public final int h() {
        int i10 = a.f11625a[ordinal()];
        if (i10 == 1) {
            return R.string.copy;
        }
        if (i10 == 2) {
            return R.string.paste;
        }
        if (i10 == 3) {
            return R.string.cut;
        }
        if (i10 == 4) {
            return R.string.selectAll;
        }
        if (i10 == 5) {
            return Build.VERSION.SDK_INT <= 26 ? m.f52386a : R.string.autofill;
        }
        throw new r();
    }
}
