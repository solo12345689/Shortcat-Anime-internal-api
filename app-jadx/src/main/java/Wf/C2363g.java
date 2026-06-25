package Wf;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Wf.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C2363g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f20922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f20923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f20924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f20925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f20926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f20927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f20928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f20929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f20930i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f20931j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f20932k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f20933l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f20934m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f20935n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f20936o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private EnumC2357a f20937p;

    public C2363g(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String prettyPrintIndent, boolean z16, boolean z17, String classDiscriminator, boolean z18, boolean z19, y yVar, boolean z20, boolean z21, boolean z22, EnumC2357a classDiscriminatorMode) {
        AbstractC5504s.h(prettyPrintIndent, "prettyPrintIndent");
        AbstractC5504s.h(classDiscriminator, "classDiscriminator");
        AbstractC5504s.h(classDiscriminatorMode, "classDiscriminatorMode");
        this.f20922a = z10;
        this.f20923b = z11;
        this.f20924c = z12;
        this.f20925d = z13;
        this.f20926e = z14;
        this.f20927f = z15;
        this.f20928g = prettyPrintIndent;
        this.f20929h = z16;
        this.f20930i = z17;
        this.f20931j = classDiscriminator;
        this.f20932k = z18;
        this.f20933l = z19;
        this.f20934m = z20;
        this.f20935n = z21;
        this.f20936o = z22;
        this.f20937p = classDiscriminatorMode;
    }

    public final boolean a() {
        return this.f20936o;
    }

    public final boolean b() {
        return this.f20932k;
    }

    public final boolean c() {
        return this.f20925d;
    }

    public final boolean d() {
        return this.f20935n;
    }

    public final String e() {
        return this.f20931j;
    }

    public final EnumC2357a f() {
        return this.f20937p;
    }

    public final boolean g() {
        return this.f20929h;
    }

    public final boolean h() {
        return this.f20934m;
    }

    public final boolean i() {
        return this.f20922a;
    }

    public final boolean j() {
        return this.f20927f;
    }

    public final boolean k() {
        return this.f20923b;
    }

    public final y l() {
        return null;
    }

    public final boolean m() {
        return this.f20926e;
    }

    public final String n() {
        return this.f20928g;
    }

    public final boolean o() {
        return this.f20933l;
    }

    public final boolean p() {
        return this.f20930i;
    }

    public final boolean q() {
        return this.f20924c;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f20922a + ", ignoreUnknownKeys=" + this.f20923b + ", isLenient=" + this.f20924c + ", allowStructuredMapKeys=" + this.f20925d + ", prettyPrint=" + this.f20926e + ", explicitNulls=" + this.f20927f + ", prettyPrintIndent='" + this.f20928g + "', coerceInputValues=" + this.f20929h + ", useArrayPolymorphism=" + this.f20930i + ", classDiscriminator='" + this.f20931j + "', allowSpecialFloatingPointValues=" + this.f20932k + ", useAlternativeNames=" + this.f20933l + ", namingStrategy=" + ((Object) null) + ", decodeEnumsCaseInsensitive=" + this.f20934m + ", allowTrailingComma=" + this.f20935n + ", allowComments=" + this.f20936o + ", classDiscriminatorMode=" + this.f20937p + ')';
    }

    public /* synthetic */ C2363g(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, boolean z16, boolean z17, String str2, boolean z18, boolean z19, y yVar, boolean z20, boolean z21, boolean z22, EnumC2357a enumC2357a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? false : z14, (i10 & 32) != 0 ? true : z15, (i10 & 64) != 0 ? "    " : str, (i10 & 128) != 0 ? false : z16, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? false : z17, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? "type" : str2, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? false : z18, (i10 & 2048) == 0 ? z19 : true, (i10 & 4096) != 0 ? null : yVar, (i10 & 8192) != 0 ? false : z20, (i10 & 16384) != 0 ? false : z21, (i10 & 32768) != 0 ? false : z22, (i10 & 65536) != 0 ? EnumC2357a.f20892c : enumC2357a);
    }
}
