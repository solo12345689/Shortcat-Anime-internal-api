package com.google.android.gms.measurement.internal;

import R8.AbstractC2115p;
import android.app.BroadcastOptions;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC3455f0;
import com.google.android.gms.internal.measurement.C3431c3;
import com.google.android.gms.internal.measurement.C3440d3;
import com.google.android.gms.internal.measurement.C3498j7;
import com.google.android.gms.internal.measurement.C3502k2;
import com.google.android.gms.internal.measurement.C3523m5;
import com.google.android.gms.internal.measurement.C3592u3;
import com.google.android.gms.internal.measurement.C3601v3;
import com.google.android.gms.internal.measurement.C3609w2;
import com.google.android.gms.internal.measurement.EnumC3539o3;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import com.revenuecat.purchases.google.history.BillingConstants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import t.C6551a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
public final class q6 implements C3 {

    /* JADX INFO: renamed from: K */
    private static volatile q6 f41527K;

    /* JADX INFO: renamed from: A */
    private long f41528A;

    /* JADX INFO: renamed from: B */
    private final Map f41529B;

    /* JADX INFO: renamed from: C */
    private final Map f41530C;

    /* JADX INFO: renamed from: D */
    private final Map f41531D;

    /* JADX INFO: renamed from: F */
    private E4 f41533F;

    /* JADX INFO: renamed from: G */
    private String f41534G;

    /* JADX INFO: renamed from: H */
    private AbstractC3932x f41535H;

    /* JADX INFO: renamed from: I */
    private long f41536I;

    /* JADX INFO: renamed from: a */
    private final P2 f41538a;

    /* JADX INFO: renamed from: b */
    private final C3921v2 f41539b;

    /* JADX INFO: renamed from: c */
    private C3911u f41540c;

    /* JADX INFO: renamed from: d */
    private C3942y2 f41541d;

    /* JADX INFO: renamed from: e */
    private V5 f41542e;

    /* JADX INFO: renamed from: f */
    private C3794e f41543f;

    /* JADX INFO: renamed from: g */
    private final u6 f41544g;

    /* JADX INFO: renamed from: h */
    private C4 f41545h;

    /* JADX INFO: renamed from: i */
    private C3945y5 f41546i;

    /* JADX INFO: renamed from: j */
    private final C3793d6 f41547j;

    /* JADX INFO: renamed from: k */
    private H2 f41548k;

    /* JADX INFO: renamed from: l */
    private final X2 f41549l;

    /* JADX INFO: renamed from: n */
    private boolean f41551n;

    /* JADX INFO: renamed from: o */
    long f41552o;

    /* JADX INFO: renamed from: p */
    private List f41553p;

    /* JADX INFO: renamed from: r */
    private int f41555r;

    /* JADX INFO: renamed from: s */
    private int f41556s;

    /* JADX INFO: renamed from: t */
    private boolean f41557t;

    /* JADX INFO: renamed from: u */
    private boolean f41558u;

    /* JADX INFO: renamed from: v */
    private boolean f41559v;

    /* JADX INFO: renamed from: w */
    private FileLock f41560w;

    /* JADX INFO: renamed from: x */
    private FileChannel f41561x;

    /* JADX INFO: renamed from: y */
    private List f41562y;

    /* JADX INFO: renamed from: z */
    private List f41563z;

    /* JADX INFO: renamed from: m */
    private final AtomicBoolean f41550m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: q */
    private final Deque f41554q = new LinkedList();

    /* JADX INFO: renamed from: E */
    private final Map f41532E = new HashMap();

    /* JADX INFO: renamed from: J */
    private final y6 f41537J = new l6(this);

    q6(r6 r6Var, X2 x22) {
        AbstractC2115p.l(r6Var);
        this.f41549l = X2.O(r6Var.f41579a, null, null);
        this.f41528A = -1L;
        this.f41547j = new C3793d6(this);
        u6 u6Var = new u6(this);
        u6Var.k();
        this.f41544g = u6Var;
        C3921v2 c3921v2 = new C3921v2(this);
        c3921v2.k();
        this.f41539b = c3921v2;
        P2 p22 = new P2(this);
        p22.k();
        this.f41538a = p22;
        this.f41529B = new HashMap();
        this.f41530C = new HashMap();
        this.f41531D = new HashMap();
        b().t(new RunnableC3801e6(this, r6Var));
    }

    public static q6 F(Context context) {
        AbstractC2115p.l(context);
        AbstractC2115p.l(context.getApplicationContext());
        if (f41527K == null) {
            synchronized (q6.class) {
                try {
                    if (f41527K == null) {
                        f41527K = new q6((r6) AbstractC2115p.l(new r6(context)), null);
                    }
                } finally {
                }
            }
        }
        return f41527K;
    }

    static final void G(com.google.android.gms.internal.measurement.R2 r22, int i10, String str) {
        List listT = r22.t();
        for (int i11 = 0; i11 < listT.size(); i11++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.W2) listT.get(i11)).D())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.V2 v2O = com.google.android.gms.internal.measurement.W2.O();
        v2O.u("_err");
        v2O.A(i10);
        com.google.android.gms.internal.measurement.W2 w22 = (com.google.android.gms.internal.measurement.W2) v2O.q();
        com.google.android.gms.internal.measurement.V2 v2O2 = com.google.android.gms.internal.measurement.W2.O();
        v2O2.u("_ev");
        v2O2.x(str);
        com.google.android.gms.internal.measurement.W2 w23 = (com.google.android.gms.internal.measurement.W2) v2O2.q();
        r22.A(w22);
        r22.A(w23);
    }

    static final void H(com.google.android.gms.internal.measurement.R2 r22, String str) {
        List listT = r22.t();
        for (int i10 = 0; i10 < listT.size(); i10++) {
            if (str.equals(((com.google.android.gms.internal.measurement.W2) listT.get(i10)).D())) {
                r22.E(i10);
                return;
            }
        }
    }

    private final int I(String str, C3870o c3870o) {
        j9.v vVar;
        j9.u uVarM;
        P2 p22 = this.f41538a;
        if (p22.R(str) == null) {
            c3870o.c(j9.v.AD_PERSONALIZATION, EnumC3863n.FAILSAFE);
            return 1;
        }
        C3928w2 c3928w2J0 = F0().J0(str);
        if (c3928w2J0 != null && C3788d1.c(c3928w2J0.I()).a() == j9.u.POLICY && (uVarM = p22.m(str, (vVar = j9.v.AD_PERSONALIZATION))) != j9.u.UNINITIALIZED) {
            c3870o.c(vVar, EnumC3863n.REMOTE_ENFORCED_DEFAULT);
            return uVarM == j9.u.GRANTED ? 0 : 1;
        }
        j9.v vVar2 = j9.v.AD_PERSONALIZATION;
        c3870o.c(vVar2, EnumC3863n.REMOTE_DEFAULT);
        return p22.P(str, vVar2) ? 0 : 1;
    }

    private final Map J(com.google.android.gms.internal.measurement.S2 s22) {
        HashMap map = new HashMap();
        K0();
        for (Map.Entry entry : u6.t(s22, "gad_").entrySet()) {
            map.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return map;
    }

    private final AbstractC3932x K() {
        if (this.f41535H == null) {
            this.f41535H = new C3825h6(this, this.f41549l);
        }
        return this.f41535H;
    }

    /* JADX INFO: renamed from: L */
    public final void v0() {
        b().h();
        if (this.f41554q.isEmpty() || K().c()) {
            return;
        }
        long jMax = Math.max(0L, ((long) ((Integer) AbstractC3789d2.f41146C0.b(null)).intValue()) - (e().c() - this.f41536I));
        a().w().b("Scheduling notify next app runnable, delay in ms", Long.valueOf(jMax));
        K().b(jMax);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(40:552|(5:553|554|(4:556|557|(4:559|(1:566)|569|1032)(18:570|571|(2:579|(3:581|(1:588)(1:587)|589)(0))(1:578)|590|(2:592|(3:594|(4:597|(1:1037)(2:603|1034)|604|595)|1033))|605|606|(5:608|609|(3:612|(0)|(7:661|(5:665|(2:667|1048)(2:668|(2:670|1047)(1:1049))|671|662|663)|1046|672|(2:675|(3:681|(1:683)(2:684|(3:686|(3:689|(1:691)(1:1065)|687)|1064))|692)(2:679|680))(1:674)|693|(2:695|(6:(2:700|(6:702|703|737|(9:739|(4:742|(2:755|(2:757|1051)(1:1053))(5:746|(5:749|(2:752|750)|1055|753|747)|1054|754|1052)|758|740)|1050|759|(4:762|(3:1057|764|1060)(1:1059)|1058|760)|1056|765|(2:768|766)|1061)(1:769)|770|1031))|704|737|(0)(0)|770|1031)(7:705|706|736|737|(0)(0)|770|1031))(2:707|(8:709|(6:(2:714|(6:716|703|737|(0)(0)|770|1031))|717|737|(0)(0)|770|1031)|706|736|737|(0)(0)|770|1031)(7:718|(2:729|(2:730|(2:732|(2:1063|734)(1:735))(1:1062)))(0)|736|737|(0)(0)|770|1031)))(3:680|693|(0)(0)))|615|(0)(0))(1:616)|614|(3:617|618|(3:620|(2:622|1040)(2:623|(2:625|1039)(1:1041))|626)(1:1038))|627|(1:631)(1:630)|(1:633)|634|(1:636)(1:637)|638|(2:641|(4:643|(4:646|(2:648|1044)(2:649|(2:651|1043)(1:1045))|652|644)|1042|(1:(1:658)(1:659))(1:(1:655)(2:656|(0)(0)))))|(0)(0))|771)(1:1030)|1019|1020)|772|(3:774|(2:776|(2:778|1068)(2:779|(1:1069)(3:781|(1:783)(1:784)|(1:1071)(2:788|1067))))(0)|789)|1066|790|(3:791|792|(1:1072)(2:794|(2:1073|796)(1:1074)))|797|(1:799)(2:800|(1:802))|803|(1:805)(1:806)|807|(1:809)(1:810)|811|(6:814|(1:816)|817|(2:819|1076)(1:1077)|820|812)|1075|821|(2:826|(1:830))(1:825)|831|(1:833)|834|(1:836)|837|(1:845)|846|(10:1028|848|(7:851|852|(5:854|(1:858)|(1:875)(5:862|(1:866)|868|(1:873)(1:872)|874)|876|877)(7:879|880|(6:1021|882|883|888|(6:890|(3:893|(3:1086|895|(3:897|903|(1:905)(7:906|(6:908|(1:910)|913|(1:915)(1:917)|916|(4:919|(1:927)|928|1084)(4:929|(3:931|(1:933)|934)(5:935|(1:937)(1:938)|939|(3:941|(1:943)|944)(2:946|(1:948))|945)|949|1082))(1:912)|911|913|(0)(0)|916|(0)(0)))(2:898|(0)(0)))(1:901)|891)|1085|902|903|(0)(0))(3:902|903|(0)(0))|950)(1:887)|886|888|(0)(0)|950)|878|1083|950|849)|1081|951|(1:953)|954|(2:957|955)|1087|958)(1:959)|960|(1:962)(13:964|(9:966|(1:968)(1:969)|970|(1:972)(1:973)|974|(1:976)(1:977)|978|(1:980)(1:981)|982)|983|(4:985|986|(2:994|(1:996)(1:997))(1:991)|998)(1:999)|1000|(3:(2:1004|1079)(1:1080)|1005|1001)|1078|1006|(1:1008)|1009|1024|1010|1014)|963|983|(0)(0)|1000|(1:1001)|1078|1006|(0)|1009|1024|1010|1014) */
    /* JADX WARN: Code restructure failed: missing block: B:1012:0x0dda, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1013:0x0ddb, code lost:
    
        r3.f40611a.a().o().c("Failed to remove unused event metadata. appId", com.google.android.gms.measurement.internal.C3887q2.x(r1), r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1003:0x0d7c  */
    /* JADX WARN: Removed duplicated region for block: B:1008:0x0dad A[Catch: all -> 0x0d21, TryCatch #1 {all -> 0x0d21, blocks: (B:986:0x0cfd, B:988:0x0d12, B:991:0x0d19, B:998:0x0d4d, B:1000:0x0d5f, B:1001:0x0d76, B:1004:0x0d7e, B:1005:0x0d83, B:1006:0x0d93, B:1008:0x0dad, B:1009:0x0dc8, B:1010:0x0dd0, B:1014:0x0dee, B:1013:0x0ddb, B:994:0x0d24, B:996:0x0d30, B:997:0x0d36, B:1015:0x0df7), top: B:1023:0x002c, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:658:0x03bd A[Catch: all -> 0x00f6, TryCatch #3 {all -> 0x00f6, blocks: (B:547:0x0017, B:549:0x002e, B:552:0x0038, B:553:0x004e, B:556:0x0060, B:559:0x008a, B:561:0x00bf, B:564:0x00d0, B:566:0x00da, B:771:0x06d0, B:570:0x0107, B:573:0x0119, B:575:0x011f, B:590:0x0163, B:592:0x0171, B:595:0x0191, B:597:0x0197, B:599:0x01a7, B:601:0x01b5, B:603:0x01c5, B:604:0x01d2, B:605:0x01d5, B:608:0x01eb, B:617:0x021e, B:620:0x0228, B:622:0x0236, B:626:0x027d, B:623:0x0253, B:625:0x0263, B:630:0x028a, B:633:0x02bf, B:634:0x02e9, B:636:0x0322, B:638:0x0328, B:641:0x0334, B:643:0x036b, B:644:0x0386, B:646:0x038c, B:648:0x039a, B:652:0x03af, B:649:0x03a3, B:655:0x03b6, B:658:0x03bd, B:659:0x03d5, B:661:0x03ee, B:662:0x03fa, B:665:0x0404, B:671:0x0427, B:668:0x0416, B:693:0x04a5, B:695:0x04b1, B:698:0x04c2, B:700:0x04d3, B:702:0x04df, B:737:0x05ab, B:739:0x05b1, B:740:0x05bd, B:742:0x05c3, B:744:0x05d3, B:746:0x05dd, B:747:0x05ee, B:749:0x05f4, B:750:0x060f, B:752:0x0615, B:753:0x0633, B:754:0x0640, B:758:0x0665, B:755:0x0646, B:757:0x0652, B:759:0x066c, B:760:0x0682, B:762:0x0688, B:764:0x069b, B:765:0x06a8, B:766:0x06ac, B:768:0x06b2, B:770:0x06be, B:707:0x04fc, B:709:0x050a, B:712:0x051d, B:714:0x052f, B:716:0x053b, B:718:0x054b, B:720:0x055a, B:723:0x0566, B:725:0x0570, B:727:0x057a, B:730:0x0585, B:732:0x058b, B:734:0x059b, B:735:0x05a6, B:675:0x042f, B:677:0x043b, B:679:0x0447, B:692:0x048d, B:684:0x0465, B:687:0x0477, B:689:0x047d, B:691:0x0487, B:579:0x012b, B:581:0x0138, B:583:0x0144, B:585:0x014a, B:589:0x0155, B:774:0x06ea, B:776:0x06f8, B:778:0x0701, B:789:0x0731, B:779:0x0709, B:781:0x0712, B:783:0x0718, B:786:0x0724, B:788:0x072c, B:790:0x0734, B:791:0x0740, B:794:0x0748, B:796:0x075a, B:797:0x0765, B:799:0x076d, B:803:0x0793, B:805:0x07ad, B:807:0x07c2, B:809:0x07dc, B:811:0x07f1, B:812:0x07ff, B:814:0x0805, B:816:0x0815, B:817:0x081c, B:819:0x0828, B:820:0x082f, B:821:0x0832, B:823:0x0874, B:825:0x087a, B:831:0x08a1, B:833:0x08a9, B:834:0x08b2, B:836:0x08b8, B:837:0x08be, B:839:0x08d3, B:841:0x08e3, B:843:0x08f3, B:845:0x08fb, B:846:0x08fe, B:854:0x0974, B:856:0x098d, B:858:0x09a3, B:860:0x09a8, B:862:0x09ac, B:864:0x09b0, B:866:0x09ba, B:868:0x09c3, B:870:0x09c7, B:872:0x09cd, B:874:0x09d8, B:876:0x09e6, B:882:0x0a0e, B:885:0x0a16, B:826:0x0888, B:828:0x088e, B:830:0x0894, B:810:0x07ee, B:806:0x07bf, B:800:0x0773, B:802:0x0779), top: B:1026:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:659:0x03d5 A[Catch: all -> 0x00f6, TryCatch #3 {all -> 0x00f6, blocks: (B:547:0x0017, B:549:0x002e, B:552:0x0038, B:553:0x004e, B:556:0x0060, B:559:0x008a, B:561:0x00bf, B:564:0x00d0, B:566:0x00da, B:771:0x06d0, B:570:0x0107, B:573:0x0119, B:575:0x011f, B:590:0x0163, B:592:0x0171, B:595:0x0191, B:597:0x0197, B:599:0x01a7, B:601:0x01b5, B:603:0x01c5, B:604:0x01d2, B:605:0x01d5, B:608:0x01eb, B:617:0x021e, B:620:0x0228, B:622:0x0236, B:626:0x027d, B:623:0x0253, B:625:0x0263, B:630:0x028a, B:633:0x02bf, B:634:0x02e9, B:636:0x0322, B:638:0x0328, B:641:0x0334, B:643:0x036b, B:644:0x0386, B:646:0x038c, B:648:0x039a, B:652:0x03af, B:649:0x03a3, B:655:0x03b6, B:658:0x03bd, B:659:0x03d5, B:661:0x03ee, B:662:0x03fa, B:665:0x0404, B:671:0x0427, B:668:0x0416, B:693:0x04a5, B:695:0x04b1, B:698:0x04c2, B:700:0x04d3, B:702:0x04df, B:737:0x05ab, B:739:0x05b1, B:740:0x05bd, B:742:0x05c3, B:744:0x05d3, B:746:0x05dd, B:747:0x05ee, B:749:0x05f4, B:750:0x060f, B:752:0x0615, B:753:0x0633, B:754:0x0640, B:758:0x0665, B:755:0x0646, B:757:0x0652, B:759:0x066c, B:760:0x0682, B:762:0x0688, B:764:0x069b, B:765:0x06a8, B:766:0x06ac, B:768:0x06b2, B:770:0x06be, B:707:0x04fc, B:709:0x050a, B:712:0x051d, B:714:0x052f, B:716:0x053b, B:718:0x054b, B:720:0x055a, B:723:0x0566, B:725:0x0570, B:727:0x057a, B:730:0x0585, B:732:0x058b, B:734:0x059b, B:735:0x05a6, B:675:0x042f, B:677:0x043b, B:679:0x0447, B:692:0x048d, B:684:0x0465, B:687:0x0477, B:689:0x047d, B:691:0x0487, B:579:0x012b, B:581:0x0138, B:583:0x0144, B:585:0x014a, B:589:0x0155, B:774:0x06ea, B:776:0x06f8, B:778:0x0701, B:789:0x0731, B:779:0x0709, B:781:0x0712, B:783:0x0718, B:786:0x0724, B:788:0x072c, B:790:0x0734, B:791:0x0740, B:794:0x0748, B:796:0x075a, B:797:0x0765, B:799:0x076d, B:803:0x0793, B:805:0x07ad, B:807:0x07c2, B:809:0x07dc, B:811:0x07f1, B:812:0x07ff, B:814:0x0805, B:816:0x0815, B:817:0x081c, B:819:0x0828, B:820:0x082f, B:821:0x0832, B:823:0x0874, B:825:0x087a, B:831:0x08a1, B:833:0x08a9, B:834:0x08b2, B:836:0x08b8, B:837:0x08be, B:839:0x08d3, B:841:0x08e3, B:843:0x08f3, B:845:0x08fb, B:846:0x08fe, B:854:0x0974, B:856:0x098d, B:858:0x09a3, B:860:0x09a8, B:862:0x09ac, B:864:0x09b0, B:866:0x09ba, B:868:0x09c3, B:870:0x09c7, B:872:0x09cd, B:874:0x09d8, B:876:0x09e6, B:882:0x0a0e, B:885:0x0a16, B:826:0x0888, B:828:0x088e, B:830:0x0894, B:810:0x07ee, B:806:0x07bf, B:800:0x0773, B:802:0x0779), top: B:1026:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:661:0x03ee A[Catch: all -> 0x00f6, TryCatch #3 {all -> 0x00f6, blocks: (B:547:0x0017, B:549:0x002e, B:552:0x0038, B:553:0x004e, B:556:0x0060, B:559:0x008a, B:561:0x00bf, B:564:0x00d0, B:566:0x00da, B:771:0x06d0, B:570:0x0107, B:573:0x0119, B:575:0x011f, B:590:0x0163, B:592:0x0171, B:595:0x0191, B:597:0x0197, B:599:0x01a7, B:601:0x01b5, B:603:0x01c5, B:604:0x01d2, B:605:0x01d5, B:608:0x01eb, B:617:0x021e, B:620:0x0228, B:622:0x0236, B:626:0x027d, B:623:0x0253, B:625:0x0263, B:630:0x028a, B:633:0x02bf, B:634:0x02e9, B:636:0x0322, B:638:0x0328, B:641:0x0334, B:643:0x036b, B:644:0x0386, B:646:0x038c, B:648:0x039a, B:652:0x03af, B:649:0x03a3, B:655:0x03b6, B:658:0x03bd, B:659:0x03d5, B:661:0x03ee, B:662:0x03fa, B:665:0x0404, B:671:0x0427, B:668:0x0416, B:693:0x04a5, B:695:0x04b1, B:698:0x04c2, B:700:0x04d3, B:702:0x04df, B:737:0x05ab, B:739:0x05b1, B:740:0x05bd, B:742:0x05c3, B:744:0x05d3, B:746:0x05dd, B:747:0x05ee, B:749:0x05f4, B:750:0x060f, B:752:0x0615, B:753:0x0633, B:754:0x0640, B:758:0x0665, B:755:0x0646, B:757:0x0652, B:759:0x066c, B:760:0x0682, B:762:0x0688, B:764:0x069b, B:765:0x06a8, B:766:0x06ac, B:768:0x06b2, B:770:0x06be, B:707:0x04fc, B:709:0x050a, B:712:0x051d, B:714:0x052f, B:716:0x053b, B:718:0x054b, B:720:0x055a, B:723:0x0566, B:725:0x0570, B:727:0x057a, B:730:0x0585, B:732:0x058b, B:734:0x059b, B:735:0x05a6, B:675:0x042f, B:677:0x043b, B:679:0x0447, B:692:0x048d, B:684:0x0465, B:687:0x0477, B:689:0x047d, B:691:0x0487, B:579:0x012b, B:581:0x0138, B:583:0x0144, B:585:0x014a, B:589:0x0155, B:774:0x06ea, B:776:0x06f8, B:778:0x0701, B:789:0x0731, B:779:0x0709, B:781:0x0712, B:783:0x0718, B:786:0x0724, B:788:0x072c, B:790:0x0734, B:791:0x0740, B:794:0x0748, B:796:0x075a, B:797:0x0765, B:799:0x076d, B:803:0x0793, B:805:0x07ad, B:807:0x07c2, B:809:0x07dc, B:811:0x07f1, B:812:0x07ff, B:814:0x0805, B:816:0x0815, B:817:0x081c, B:819:0x0828, B:820:0x082f, B:821:0x0832, B:823:0x0874, B:825:0x087a, B:831:0x08a1, B:833:0x08a9, B:834:0x08b2, B:836:0x08b8, B:837:0x08be, B:839:0x08d3, B:841:0x08e3, B:843:0x08f3, B:845:0x08fb, B:846:0x08fe, B:854:0x0974, B:856:0x098d, B:858:0x09a3, B:860:0x09a8, B:862:0x09ac, B:864:0x09b0, B:866:0x09ba, B:868:0x09c3, B:870:0x09c7, B:872:0x09cd, B:874:0x09d8, B:876:0x09e6, B:882:0x0a0e, B:885:0x0a16, B:826:0x0888, B:828:0x088e, B:830:0x0894, B:810:0x07ee, B:806:0x07bf, B:800:0x0773, B:802:0x0779), top: B:1026:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:680:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x04b1 A[Catch: all -> 0x00f6, TryCatch #3 {all -> 0x00f6, blocks: (B:547:0x0017, B:549:0x002e, B:552:0x0038, B:553:0x004e, B:556:0x0060, B:559:0x008a, B:561:0x00bf, B:564:0x00d0, B:566:0x00da, B:771:0x06d0, B:570:0x0107, B:573:0x0119, B:575:0x011f, B:590:0x0163, B:592:0x0171, B:595:0x0191, B:597:0x0197, B:599:0x01a7, B:601:0x01b5, B:603:0x01c5, B:604:0x01d2, B:605:0x01d5, B:608:0x01eb, B:617:0x021e, B:620:0x0228, B:622:0x0236, B:626:0x027d, B:623:0x0253, B:625:0x0263, B:630:0x028a, B:633:0x02bf, B:634:0x02e9, B:636:0x0322, B:638:0x0328, B:641:0x0334, B:643:0x036b, B:644:0x0386, B:646:0x038c, B:648:0x039a, B:652:0x03af, B:649:0x03a3, B:655:0x03b6, B:658:0x03bd, B:659:0x03d5, B:661:0x03ee, B:662:0x03fa, B:665:0x0404, B:671:0x0427, B:668:0x0416, B:693:0x04a5, B:695:0x04b1, B:698:0x04c2, B:700:0x04d3, B:702:0x04df, B:737:0x05ab, B:739:0x05b1, B:740:0x05bd, B:742:0x05c3, B:744:0x05d3, B:746:0x05dd, B:747:0x05ee, B:749:0x05f4, B:750:0x060f, B:752:0x0615, B:753:0x0633, B:754:0x0640, B:758:0x0665, B:755:0x0646, B:757:0x0652, B:759:0x066c, B:760:0x0682, B:762:0x0688, B:764:0x069b, B:765:0x06a8, B:766:0x06ac, B:768:0x06b2, B:770:0x06be, B:707:0x04fc, B:709:0x050a, B:712:0x051d, B:714:0x052f, B:716:0x053b, B:718:0x054b, B:720:0x055a, B:723:0x0566, B:725:0x0570, B:727:0x057a, B:730:0x0585, B:732:0x058b, B:734:0x059b, B:735:0x05a6, B:675:0x042f, B:677:0x043b, B:679:0x0447, B:692:0x048d, B:684:0x0465, B:687:0x0477, B:689:0x047d, B:691:0x0487, B:579:0x012b, B:581:0x0138, B:583:0x0144, B:585:0x014a, B:589:0x0155, B:774:0x06ea, B:776:0x06f8, B:778:0x0701, B:789:0x0731, B:779:0x0709, B:781:0x0712, B:783:0x0718, B:786:0x0724, B:788:0x072c, B:790:0x0734, B:791:0x0740, B:794:0x0748, B:796:0x075a, B:797:0x0765, B:799:0x076d, B:803:0x0793, B:805:0x07ad, B:807:0x07c2, B:809:0x07dc, B:811:0x07f1, B:812:0x07ff, B:814:0x0805, B:816:0x0815, B:817:0x081c, B:819:0x0828, B:820:0x082f, B:821:0x0832, B:823:0x0874, B:825:0x087a, B:831:0x08a1, B:833:0x08a9, B:834:0x08b2, B:836:0x08b8, B:837:0x08be, B:839:0x08d3, B:841:0x08e3, B:843:0x08f3, B:845:0x08fb, B:846:0x08fe, B:854:0x0974, B:856:0x098d, B:858:0x09a3, B:860:0x09a8, B:862:0x09ac, B:864:0x09b0, B:866:0x09ba, B:868:0x09c3, B:870:0x09c7, B:872:0x09cd, B:874:0x09d8, B:876:0x09e6, B:882:0x0a0e, B:885:0x0a16, B:826:0x0888, B:828:0x088e, B:830:0x0894, B:810:0x07ee, B:806:0x07bf, B:800:0x0773, B:802:0x0779), top: B:1026:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:707:0x04fc A[Catch: all -> 0x00f6, TryCatch #3 {all -> 0x00f6, blocks: (B:547:0x0017, B:549:0x002e, B:552:0x0038, B:553:0x004e, B:556:0x0060, B:559:0x008a, B:561:0x00bf, B:564:0x00d0, B:566:0x00da, B:771:0x06d0, B:570:0x0107, B:573:0x0119, B:575:0x011f, B:590:0x0163, B:592:0x0171, B:595:0x0191, B:597:0x0197, B:599:0x01a7, B:601:0x01b5, B:603:0x01c5, B:604:0x01d2, B:605:0x01d5, B:608:0x01eb, B:617:0x021e, B:620:0x0228, B:622:0x0236, B:626:0x027d, B:623:0x0253, B:625:0x0263, B:630:0x028a, B:633:0x02bf, B:634:0x02e9, B:636:0x0322, B:638:0x0328, B:641:0x0334, B:643:0x036b, B:644:0x0386, B:646:0x038c, B:648:0x039a, B:652:0x03af, B:649:0x03a3, B:655:0x03b6, B:658:0x03bd, B:659:0x03d5, B:661:0x03ee, B:662:0x03fa, B:665:0x0404, B:671:0x0427, B:668:0x0416, B:693:0x04a5, B:695:0x04b1, B:698:0x04c2, B:700:0x04d3, B:702:0x04df, B:737:0x05ab, B:739:0x05b1, B:740:0x05bd, B:742:0x05c3, B:744:0x05d3, B:746:0x05dd, B:747:0x05ee, B:749:0x05f4, B:750:0x060f, B:752:0x0615, B:753:0x0633, B:754:0x0640, B:758:0x0665, B:755:0x0646, B:757:0x0652, B:759:0x066c, B:760:0x0682, B:762:0x0688, B:764:0x069b, B:765:0x06a8, B:766:0x06ac, B:768:0x06b2, B:770:0x06be, B:707:0x04fc, B:709:0x050a, B:712:0x051d, B:714:0x052f, B:716:0x053b, B:718:0x054b, B:720:0x055a, B:723:0x0566, B:725:0x0570, B:727:0x057a, B:730:0x0585, B:732:0x058b, B:734:0x059b, B:735:0x05a6, B:675:0x042f, B:677:0x043b, B:679:0x0447, B:692:0x048d, B:684:0x0465, B:687:0x0477, B:689:0x047d, B:691:0x0487, B:579:0x012b, B:581:0x0138, B:583:0x0144, B:585:0x014a, B:589:0x0155, B:774:0x06ea, B:776:0x06f8, B:778:0x0701, B:789:0x0731, B:779:0x0709, B:781:0x0712, B:783:0x0718, B:786:0x0724, B:788:0x072c, B:790:0x0734, B:791:0x0740, B:794:0x0748, B:796:0x075a, B:797:0x0765, B:799:0x076d, B:803:0x0793, B:805:0x07ad, B:807:0x07c2, B:809:0x07dc, B:811:0x07f1, B:812:0x07ff, B:814:0x0805, B:816:0x0815, B:817:0x081c, B:819:0x0828, B:820:0x082f, B:821:0x0832, B:823:0x0874, B:825:0x087a, B:831:0x08a1, B:833:0x08a9, B:834:0x08b2, B:836:0x08b8, B:837:0x08be, B:839:0x08d3, B:841:0x08e3, B:843:0x08f3, B:845:0x08fb, B:846:0x08fe, B:854:0x0974, B:856:0x098d, B:858:0x09a3, B:860:0x09a8, B:862:0x09ac, B:864:0x09b0, B:866:0x09ba, B:868:0x09c3, B:870:0x09c7, B:872:0x09cd, B:874:0x09d8, B:876:0x09e6, B:882:0x0a0e, B:885:0x0a16, B:826:0x0888, B:828:0x088e, B:830:0x0894, B:810:0x07ee, B:806:0x07bf, B:800:0x0773, B:802:0x0779), top: B:1026:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:739:0x05b1 A[Catch: all -> 0x00f6, TryCatch #3 {all -> 0x00f6, blocks: (B:547:0x0017, B:549:0x002e, B:552:0x0038, B:553:0x004e, B:556:0x0060, B:559:0x008a, B:561:0x00bf, B:564:0x00d0, B:566:0x00da, B:771:0x06d0, B:570:0x0107, B:573:0x0119, B:575:0x011f, B:590:0x0163, B:592:0x0171, B:595:0x0191, B:597:0x0197, B:599:0x01a7, B:601:0x01b5, B:603:0x01c5, B:604:0x01d2, B:605:0x01d5, B:608:0x01eb, B:617:0x021e, B:620:0x0228, B:622:0x0236, B:626:0x027d, B:623:0x0253, B:625:0x0263, B:630:0x028a, B:633:0x02bf, B:634:0x02e9, B:636:0x0322, B:638:0x0328, B:641:0x0334, B:643:0x036b, B:644:0x0386, B:646:0x038c, B:648:0x039a, B:652:0x03af, B:649:0x03a3, B:655:0x03b6, B:658:0x03bd, B:659:0x03d5, B:661:0x03ee, B:662:0x03fa, B:665:0x0404, B:671:0x0427, B:668:0x0416, B:693:0x04a5, B:695:0x04b1, B:698:0x04c2, B:700:0x04d3, B:702:0x04df, B:737:0x05ab, B:739:0x05b1, B:740:0x05bd, B:742:0x05c3, B:744:0x05d3, B:746:0x05dd, B:747:0x05ee, B:749:0x05f4, B:750:0x060f, B:752:0x0615, B:753:0x0633, B:754:0x0640, B:758:0x0665, B:755:0x0646, B:757:0x0652, B:759:0x066c, B:760:0x0682, B:762:0x0688, B:764:0x069b, B:765:0x06a8, B:766:0x06ac, B:768:0x06b2, B:770:0x06be, B:707:0x04fc, B:709:0x050a, B:712:0x051d, B:714:0x052f, B:716:0x053b, B:718:0x054b, B:720:0x055a, B:723:0x0566, B:725:0x0570, B:727:0x057a, B:730:0x0585, B:732:0x058b, B:734:0x059b, B:735:0x05a6, B:675:0x042f, B:677:0x043b, B:679:0x0447, B:692:0x048d, B:684:0x0465, B:687:0x0477, B:689:0x047d, B:691:0x0487, B:579:0x012b, B:581:0x0138, B:583:0x0144, B:585:0x014a, B:589:0x0155, B:774:0x06ea, B:776:0x06f8, B:778:0x0701, B:789:0x0731, B:779:0x0709, B:781:0x0712, B:783:0x0718, B:786:0x0724, B:788:0x072c, B:790:0x0734, B:791:0x0740, B:794:0x0748, B:796:0x075a, B:797:0x0765, B:799:0x076d, B:803:0x0793, B:805:0x07ad, B:807:0x07c2, B:809:0x07dc, B:811:0x07f1, B:812:0x07ff, B:814:0x0805, B:816:0x0815, B:817:0x081c, B:819:0x0828, B:820:0x082f, B:821:0x0832, B:823:0x0874, B:825:0x087a, B:831:0x08a1, B:833:0x08a9, B:834:0x08b2, B:836:0x08b8, B:837:0x08be, B:839:0x08d3, B:841:0x08e3, B:843:0x08f3, B:845:0x08fb, B:846:0x08fe, B:854:0x0974, B:856:0x098d, B:858:0x09a3, B:860:0x09a8, B:862:0x09ac, B:864:0x09b0, B:866:0x09ba, B:868:0x09c3, B:870:0x09c7, B:872:0x09cd, B:874:0x09d8, B:876:0x09e6, B:882:0x0a0e, B:885:0x0a16, B:826:0x0888, B:828:0x088e, B:830:0x0894, B:810:0x07ee, B:806:0x07bf, B:800:0x0773, B:802:0x0779), top: B:1026:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:769:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:779:0x0709 A[Catch: all -> 0x00f6, TryCatch #3 {all -> 0x00f6, blocks: (B:547:0x0017, B:549:0x002e, B:552:0x0038, B:553:0x004e, B:556:0x0060, B:559:0x008a, B:561:0x00bf, B:564:0x00d0, B:566:0x00da, B:771:0x06d0, B:570:0x0107, B:573:0x0119, B:575:0x011f, B:590:0x0163, B:592:0x0171, B:595:0x0191, B:597:0x0197, B:599:0x01a7, B:601:0x01b5, B:603:0x01c5, B:604:0x01d2, B:605:0x01d5, B:608:0x01eb, B:617:0x021e, B:620:0x0228, B:622:0x0236, B:626:0x027d, B:623:0x0253, B:625:0x0263, B:630:0x028a, B:633:0x02bf, B:634:0x02e9, B:636:0x0322, B:638:0x0328, B:641:0x0334, B:643:0x036b, B:644:0x0386, B:646:0x038c, B:648:0x039a, B:652:0x03af, B:649:0x03a3, B:655:0x03b6, B:658:0x03bd, B:659:0x03d5, B:661:0x03ee, B:662:0x03fa, B:665:0x0404, B:671:0x0427, B:668:0x0416, B:693:0x04a5, B:695:0x04b1, B:698:0x04c2, B:700:0x04d3, B:702:0x04df, B:737:0x05ab, B:739:0x05b1, B:740:0x05bd, B:742:0x05c3, B:744:0x05d3, B:746:0x05dd, B:747:0x05ee, B:749:0x05f4, B:750:0x060f, B:752:0x0615, B:753:0x0633, B:754:0x0640, B:758:0x0665, B:755:0x0646, B:757:0x0652, B:759:0x066c, B:760:0x0682, B:762:0x0688, B:764:0x069b, B:765:0x06a8, B:766:0x06ac, B:768:0x06b2, B:770:0x06be, B:707:0x04fc, B:709:0x050a, B:712:0x051d, B:714:0x052f, B:716:0x053b, B:718:0x054b, B:720:0x055a, B:723:0x0566, B:725:0x0570, B:727:0x057a, B:730:0x0585, B:732:0x058b, B:734:0x059b, B:735:0x05a6, B:675:0x042f, B:677:0x043b, B:679:0x0447, B:692:0x048d, B:684:0x0465, B:687:0x0477, B:689:0x047d, B:691:0x0487, B:579:0x012b, B:581:0x0138, B:583:0x0144, B:585:0x014a, B:589:0x0155, B:774:0x06ea, B:776:0x06f8, B:778:0x0701, B:789:0x0731, B:779:0x0709, B:781:0x0712, B:783:0x0718, B:786:0x0724, B:788:0x072c, B:790:0x0734, B:791:0x0740, B:794:0x0748, B:796:0x075a, B:797:0x0765, B:799:0x076d, B:803:0x0793, B:805:0x07ad, B:807:0x07c2, B:809:0x07dc, B:811:0x07f1, B:812:0x07ff, B:814:0x0805, B:816:0x0815, B:817:0x081c, B:819:0x0828, B:820:0x082f, B:821:0x0832, B:823:0x0874, B:825:0x087a, B:831:0x08a1, B:833:0x08a9, B:834:0x08b2, B:836:0x08b8, B:837:0x08be, B:839:0x08d3, B:841:0x08e3, B:843:0x08f3, B:845:0x08fb, B:846:0x08fe, B:854:0x0974, B:856:0x098d, B:858:0x09a3, B:860:0x09a8, B:862:0x09ac, B:864:0x09b0, B:866:0x09ba, B:868:0x09c3, B:870:0x09c7, B:872:0x09cd, B:874:0x09d8, B:876:0x09e6, B:882:0x0a0e, B:885:0x0a16, B:826:0x0888, B:828:0x088e, B:830:0x0894, B:810:0x07ee, B:806:0x07bf, B:800:0x0773, B:802:0x0779), top: B:1026:0x0017, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:890:0x0a4b A[Catch: all -> 0x0a7c, TryCatch #4 {all -> 0x0a7c, blocks: (B:848:0x0940, B:849:0x0953, B:851:0x0959, B:950:0x0c1c, B:880:0x09f8, B:888:0x0a31, B:890:0x0a4b, B:891:0x0a53, B:893:0x0a59, B:895:0x0a6b, B:903:0x0a86, B:905:0x0a9a, B:906:0x0abd, B:908:0x0ac9, B:910:0x0adf, B:913:0x0b24, B:919:0x0b40, B:921:0x0b4b, B:923:0x0b4f, B:925:0x0b53, B:927:0x0b57, B:928:0x0b63, B:929:0x0b6f, B:931:0x0b75, B:933:0x0b8b, B:934:0x0b90, B:949:0x0c19, B:935:0x0ba8, B:937:0x0bac, B:941:0x0bcf, B:943:0x0bef, B:944:0x0bf6, B:948:0x0c0c, B:938:0x0bb7, B:951:0x0c2a, B:953:0x0c39, B:954:0x0c3f, B:955:0x0c47, B:957:0x0c4d, B:960:0x0c67, B:962:0x0c77, B:983:0x0cf5, B:964:0x0c90, B:966:0x0c96, B:968:0x0c9e, B:970:0x0ca5, B:976:0x0cb3, B:978:0x0cba, B:980:0x0ce6, B:982:0x0ced, B:981:0x0cea, B:977:0x0cb7, B:969:0x0ca2), top: B:1028:0x0940 }] */
    /* JADX WARN: Removed duplicated region for block: B:902:0x0a84 A[PHI: r10
  0x0a84: PHI (r10v7 java.lang.String) = (r10v6 java.lang.String), (r10v22 java.lang.String) binds: [B:889:0x0a49, B:1085:0x0a84] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:905:0x0a9a A[Catch: all -> 0x0a7c, TryCatch #4 {all -> 0x0a7c, blocks: (B:848:0x0940, B:849:0x0953, B:851:0x0959, B:950:0x0c1c, B:880:0x09f8, B:888:0x0a31, B:890:0x0a4b, B:891:0x0a53, B:893:0x0a59, B:895:0x0a6b, B:903:0x0a86, B:905:0x0a9a, B:906:0x0abd, B:908:0x0ac9, B:910:0x0adf, B:913:0x0b24, B:919:0x0b40, B:921:0x0b4b, B:923:0x0b4f, B:925:0x0b53, B:927:0x0b57, B:928:0x0b63, B:929:0x0b6f, B:931:0x0b75, B:933:0x0b8b, B:934:0x0b90, B:949:0x0c19, B:935:0x0ba8, B:937:0x0bac, B:941:0x0bcf, B:943:0x0bef, B:944:0x0bf6, B:948:0x0c0c, B:938:0x0bb7, B:951:0x0c2a, B:953:0x0c39, B:954:0x0c3f, B:955:0x0c47, B:957:0x0c4d, B:960:0x0c67, B:962:0x0c77, B:983:0x0cf5, B:964:0x0c90, B:966:0x0c96, B:968:0x0c9e, B:970:0x0ca5, B:976:0x0cb3, B:978:0x0cba, B:980:0x0ce6, B:982:0x0ced, B:981:0x0cea, B:977:0x0cb7, B:969:0x0ca2), top: B:1028:0x0940 }] */
    /* JADX WARN: Removed duplicated region for block: B:906:0x0abd A[Catch: all -> 0x0a7c, TryCatch #4 {all -> 0x0a7c, blocks: (B:848:0x0940, B:849:0x0953, B:851:0x0959, B:950:0x0c1c, B:880:0x09f8, B:888:0x0a31, B:890:0x0a4b, B:891:0x0a53, B:893:0x0a59, B:895:0x0a6b, B:903:0x0a86, B:905:0x0a9a, B:906:0x0abd, B:908:0x0ac9, B:910:0x0adf, B:913:0x0b24, B:919:0x0b40, B:921:0x0b4b, B:923:0x0b4f, B:925:0x0b53, B:927:0x0b57, B:928:0x0b63, B:929:0x0b6f, B:931:0x0b75, B:933:0x0b8b, B:934:0x0b90, B:949:0x0c19, B:935:0x0ba8, B:937:0x0bac, B:941:0x0bcf, B:943:0x0bef, B:944:0x0bf6, B:948:0x0c0c, B:938:0x0bb7, B:951:0x0c2a, B:953:0x0c39, B:954:0x0c3f, B:955:0x0c47, B:957:0x0c4d, B:960:0x0c67, B:962:0x0c77, B:983:0x0cf5, B:964:0x0c90, B:966:0x0c96, B:968:0x0c9e, B:970:0x0ca5, B:976:0x0cb3, B:978:0x0cba, B:980:0x0ce6, B:982:0x0ced, B:981:0x0cea, B:977:0x0cb7, B:969:0x0ca2), top: B:1028:0x0940 }] */
    /* JADX WARN: Removed duplicated region for block: B:915:0x0b37  */
    /* JADX WARN: Removed duplicated region for block: B:917:0x0b3b  */
    /* JADX WARN: Removed duplicated region for block: B:919:0x0b40 A[Catch: all -> 0x0a7c, TryCatch #4 {all -> 0x0a7c, blocks: (B:848:0x0940, B:849:0x0953, B:851:0x0959, B:950:0x0c1c, B:880:0x09f8, B:888:0x0a31, B:890:0x0a4b, B:891:0x0a53, B:893:0x0a59, B:895:0x0a6b, B:903:0x0a86, B:905:0x0a9a, B:906:0x0abd, B:908:0x0ac9, B:910:0x0adf, B:913:0x0b24, B:919:0x0b40, B:921:0x0b4b, B:923:0x0b4f, B:925:0x0b53, B:927:0x0b57, B:928:0x0b63, B:929:0x0b6f, B:931:0x0b75, B:933:0x0b8b, B:934:0x0b90, B:949:0x0c19, B:935:0x0ba8, B:937:0x0bac, B:941:0x0bcf, B:943:0x0bef, B:944:0x0bf6, B:948:0x0c0c, B:938:0x0bb7, B:951:0x0c2a, B:953:0x0c39, B:954:0x0c3f, B:955:0x0c47, B:957:0x0c4d, B:960:0x0c67, B:962:0x0c77, B:983:0x0cf5, B:964:0x0c90, B:966:0x0c96, B:968:0x0c9e, B:970:0x0ca5, B:976:0x0cb3, B:978:0x0cba, B:980:0x0ce6, B:982:0x0ced, B:981:0x0cea, B:977:0x0cb7, B:969:0x0ca2), top: B:1028:0x0940 }] */
    /* JADX WARN: Removed duplicated region for block: B:929:0x0b6f A[Catch: all -> 0x0a7c, TryCatch #4 {all -> 0x0a7c, blocks: (B:848:0x0940, B:849:0x0953, B:851:0x0959, B:950:0x0c1c, B:880:0x09f8, B:888:0x0a31, B:890:0x0a4b, B:891:0x0a53, B:893:0x0a59, B:895:0x0a6b, B:903:0x0a86, B:905:0x0a9a, B:906:0x0abd, B:908:0x0ac9, B:910:0x0adf, B:913:0x0b24, B:919:0x0b40, B:921:0x0b4b, B:923:0x0b4f, B:925:0x0b53, B:927:0x0b57, B:928:0x0b63, B:929:0x0b6f, B:931:0x0b75, B:933:0x0b8b, B:934:0x0b90, B:949:0x0c19, B:935:0x0ba8, B:937:0x0bac, B:941:0x0bcf, B:943:0x0bef, B:944:0x0bf6, B:948:0x0c0c, B:938:0x0bb7, B:951:0x0c2a, B:953:0x0c39, B:954:0x0c3f, B:955:0x0c47, B:957:0x0c4d, B:960:0x0c67, B:962:0x0c77, B:983:0x0cf5, B:964:0x0c90, B:966:0x0c96, B:968:0x0c9e, B:970:0x0ca5, B:976:0x0cb3, B:978:0x0cba, B:980:0x0ce6, B:982:0x0ced, B:981:0x0cea, B:977:0x0cb7, B:969:0x0ca2), top: B:1028:0x0940 }] */
    /* JADX WARN: Removed duplicated region for block: B:985:0x0cfb  */
    /* JADX WARN: Removed duplicated region for block: B:999:0x0d5d  */
    /* JADX WARN: Type inference failed for: r11v14, types: [com.google.android.gms.internal.measurement.R2, com.google.android.gms.internal.measurement.b5] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [com.google.android.gms.internal.measurement.R2, com.google.android.gms.internal.measurement.b5] */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v18 */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v20 */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v22 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [com.google.android.gms.internal.measurement.R2, com.google.android.gms.internal.measurement.b5] */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.measurement.internal.q6] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.measurement.internal.q6] */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v14 */
    /* JADX WARN: Type inference failed for: r21v15 */
    /* JADX WARN: Type inference failed for: r21v16 */
    /* JADX WARN: Type inference failed for: r21v17 */
    /* JADX WARN: Type inference failed for: r21v18 */
    /* JADX WARN: Type inference failed for: r21v19 */
    /* JADX WARN: Type inference failed for: r21v20 */
    /* JADX WARN: Type inference failed for: r21v21 */
    /* JADX WARN: Type inference failed for: r21v22 */
    /* JADX WARN: Type inference failed for: r21v23 */
    /* JADX WARN: Type inference failed for: r28v10 */
    /* JADX WARN: Type inference failed for: r28v14 */
    /* JADX WARN: Type inference failed for: r28v15 */
    /* JADX WARN: Type inference failed for: r28v16 */
    /* JADX WARN: Type inference failed for: r28v17 */
    /* JADX WARN: Type inference failed for: r28v18 */
    /* JADX WARN: Type inference failed for: r28v19 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v20 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v115 */
    /* JADX WARN: Type inference failed for: r2v116 */
    /* JADX WARN: Type inference failed for: r2v117 */
    /* JADX WARN: Type inference failed for: r2v118 */
    /* JADX WARN: Type inference failed for: r2v119 */
    /* JADX WARN: Type inference failed for: r2v120 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.google.android.gms.measurement.internal.q6] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33, types: [com.google.android.gms.measurement.internal.q6] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.gms.measurement.internal.q6] */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.google.android.gms.measurement.internal.q6] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r9v10, types: [com.google.android.gms.internal.measurement.d3] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v17, types: [com.google.android.gms.internal.measurement.d3] */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v6, types: [com.google.android.gms.internal.measurement.b5, com.google.android.gms.internal.measurement.d3] */
    /* JADX WARN: Type inference failed for: r9v7, types: [com.google.android.gms.internal.measurement.d3] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean M(java.lang.String r44, long r45) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3599
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q6.M(java.lang.String, long):boolean");
    }

    private final void N(C3440d3 c3440d3, long j10, boolean z10) {
        Object obj;
        String str = true != z10 ? "_lte" : "_se";
        x6 x6VarB0 = F0().B0(c3440d3.F(), str);
        x6 x6Var = (x6VarB0 == null || (obj = x6VarB0.f41777e) == null) ? new x6(c3440d3.F(), "auto", str, e().a(), Long.valueOf(j10)) : new x6(c3440d3.F(), "auto", str, e().a(), Long.valueOf(((Long) obj).longValue() + j10));
        C3592u3 c3592u3N = C3601v3.N();
        c3592u3N.u(str);
        c3592u3N.t(e().a());
        Object obj2 = x6Var.f41777e;
        c3592u3N.y(((Long) obj2).longValue());
        C3601v3 c3601v3 = (C3601v3) c3592u3N.q();
        int iX = u6.X(c3440d3, str);
        if (iX >= 0) {
            c3440d3.a1(iX, c3601v3);
        } else {
            c3440d3.b1(c3601v3);
        }
        if (j10 > 0) {
            F0().A0(x6Var);
            a().w().c("Updated engagement user property. scope, value", true != z10 ? "lifetime" : "session-scoped", obj2);
        }
    }

    private final boolean O(com.google.android.gms.internal.measurement.R2 r22, com.google.android.gms.internal.measurement.R2 r23) {
        AbstractC2115p.a("_e".equals(r22.F()));
        K0();
        com.google.android.gms.internal.measurement.W2 w2R = u6.r((com.google.android.gms.internal.measurement.S2) r22.q(), "_sc");
        String strF = w2R == null ? null : w2R.F();
        K0();
        com.google.android.gms.internal.measurement.W2 w2R2 = u6.r((com.google.android.gms.internal.measurement.S2) r23.q(), "_pc");
        String strF2 = w2R2 != null ? w2R2.F() : null;
        if (strF2 == null || !strF2.equals(strF)) {
            return false;
        }
        AbstractC2115p.a("_e".equals(r22.F()));
        K0();
        com.google.android.gms.internal.measurement.W2 w2R3 = u6.r((com.google.android.gms.internal.measurement.S2) r22.q(), "_et");
        if (w2R3 == null || !w2R3.G() || w2R3.H() <= 0) {
            return true;
        }
        long jH = w2R3.H();
        K0();
        com.google.android.gms.internal.measurement.W2 w2R4 = u6.r((com.google.android.gms.internal.measurement.S2) r23.q(), "_et");
        if (w2R4 != null && w2R4.H() > 0) {
            jH += w2R4.H();
        }
        K0();
        u6.o(r23, "_et", Long.valueOf(jH));
        K0();
        u6.o(r22, "_fr", 1L);
        return true;
    }

    private final boolean P() {
        b().h();
        O0();
        return F0().B() || !TextUtils.isEmpty(F0().r());
    }

    private static String Q(Map map, String str) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    private final void R() {
        long jMax;
        long jMax2;
        b().h();
        O0();
        if (this.f41552o > 0) {
            long jAbs = 3600000 - Math.abs(e().c() - this.f41552o);
            if (jAbs > 0) {
                a().w().b("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(jAbs));
                G0().b();
                H0().n();
                return;
            }
            this.f41552o = 0L;
        }
        if (!this.f41549l.m() || !P()) {
            a().w().a("Nothing to upload or uploading impossible");
            G0().b();
            H0().n();
            return;
        }
        long jA = e().a();
        B0();
        long jMax3 = Math.max(0L, ((Long) AbstractC3789d2.f41171P.b(null)).longValue());
        boolean z10 = true;
        if (!F0().D() && !F0().s()) {
            z10 = false;
        }
        if (z10) {
            String strI = B0().i();
            if (TextUtils.isEmpty(strI) || ".none.".equals(strI)) {
                B0();
                jMax = Math.max(0L, ((Long) AbstractC3789d2.f41159J.b(null)).longValue());
            } else {
                B0();
                jMax = Math.max(0L, ((Long) AbstractC3789d2.f41161K.b(null)).longValue());
            }
        } else {
            B0();
            jMax = Math.max(0L, ((Long) AbstractC3789d2.f41157I.b(null)).longValue());
        }
        long jA2 = this.f41546i.f41795h.a();
        long jA3 = this.f41546i.f41796i.a();
        long j10 = 0;
        boolean z11 = z10;
        long jMax4 = Math.max(F0().y(), F0().A());
        if (jMax4 == 0) {
            jMax2 = 0;
        } else {
            long jAbs2 = jA - Math.abs(jMax4 - jA);
            long jAbs3 = jA - Math.abs(jA2 - jA);
            long jAbs4 = jA - Math.abs(jA3 - jA);
            jMax2 = jMax3 + jAbs2;
            long jMax5 = Math.max(jAbs3, jAbs4);
            if (z11 && jMax5 > 0) {
                jMax2 = Math.min(jAbs2, jMax5) + jMax;
            }
            if (!K0().S(jMax5, jMax)) {
                jMax2 = jMax5 + jMax;
            }
            if (jAbs4 != 0 && jAbs4 >= jAbs2) {
                int i10 = 0;
                while (true) {
                    B0();
                    if (i10 >= Math.min(20, Math.max(0, ((Integer) AbstractC3789d2.f41175R.b(null)).intValue()))) {
                        jMax2 = 0;
                        break;
                    }
                    B0();
                    jMax2 += Math.max(j10, ((Long) AbstractC3789d2.f41173Q.b(null)).longValue()) * (1 << i10);
                    if (jMax2 > jAbs4) {
                        break;
                    }
                    i10++;
                    j10 = 0;
                }
            }
            j10 = 0;
        }
        if (jMax2 == j10) {
            a().w().a("Next upload time is 0");
            G0().b();
            H0().n();
            return;
        }
        if (!E0().m()) {
            a().w().a("No network");
            G0().a();
            H0().n();
            return;
        }
        long jA4 = this.f41546i.f41794g.a();
        B0();
        long jMax6 = Math.max(0L, ((Long) AbstractC3789d2.f41153G.b(null)).longValue());
        if (!K0().S(jA4, jMax6)) {
            jMax2 = Math.max(jMax2, jA4 + jMax6);
        }
        G0().b();
        long jA5 = jMax2 - e().a();
        if (jA5 <= 0) {
            B0();
            jA5 = Math.max(0L, ((Long) AbstractC3789d2.f41163L.b(null)).longValue());
            this.f41546i.f41795h.b(e().a());
        }
        a().w().b("Upload scheduled in approximately ms", Long.valueOf(jA5));
        H0().m(jA5);
    }

    private final void S() {
        b().h();
        if (this.f41557t || this.f41558u || this.f41559v) {
            a().w().d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.f41557t), Boolean.valueOf(this.f41558u), Boolean.valueOf(this.f41559v));
            return;
        }
        a().w().a("Stopping uploading service(s)");
        List list = this.f41553p;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((List) AbstractC2115p.l(this.f41553p)).clear();
    }

    private final Boolean T(C3928w2 c3928w2) {
        try {
            if (c3928w2.F0() != -2147483648L) {
                if (c3928w2.F0() == X8.e.a(this.f41549l.d()).e(c3928w2.o0(), 0).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = X8.e.a(this.f41549l.d()).e(c3928w2.o0(), 0).versionName;
                String strD0 = c3928w2.D0();
                if (strD0 != null && strD0.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final B6 U(String str) {
        C3928w2 c3928w2J0 = F0().J0(str);
        if (c3928w2J0 == null || TextUtils.isEmpty(c3928w2J0.D0())) {
            a().v().b("No app data available; dropping", str);
            return null;
        }
        Boolean boolT = T(c3928w2J0);
        if (boolT == null || boolT.booleanValue()) {
            return new B6(str, c3928w2J0.r0(), c3928w2J0.D0(), c3928w2J0.F0(), c3928w2J0.H0(), c3928w2J0.J0(), c3928w2J0.L0(), (String) null, c3928w2J0.d(), false, c3928w2J0.x0(), 0L, 0, c3928w2J0.P(), false, c3928w2J0.R(), c3928w2J0.b(), c3928w2J0.T(), g(str).l(), "", (String) null, c3928w2J0.V(), c3928w2J0.X(), g(str).b(), R0(str).e(), c3928w2J0.b0(), c3928w2J0.j0(), c3928w2J0.l0(), c3928w2J0.I(), 0L, c3928w2J0.M());
        }
        a().o().b("App version does not match; dropping. appId", C3887q2.x(str));
        return null;
    }

    private final boolean V(String str, String str2) {
        C cV0 = F0().v0(str, str2);
        return cV0 == null || cV0.f40674c < 1;
    }

    public static void W(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
    }

    private static final boolean X(B6 b62) {
        return !TextUtils.isEmpty(b62.f40647b);
    }

    private static final AbstractC3777b6 Y(AbstractC3777b6 abstractC3777b6) {
        if (abstractC3777b6 == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (abstractC3777b6.i()) {
            return abstractC3777b6;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC3777b6.getClass())));
    }

    private static final Boolean Z(B6 b62) {
        Boolean bool = b62.f40661p;
        String str = b62.f40643C;
        if (!TextUtils.isEmpty(str)) {
            j9.u uVarA = C3788d1.c(str).a();
            j9.u uVar = j9.u.UNINITIALIZED;
            int iOrdinal = uVarA.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                return null;
            }
            if (iOrdinal == 2) {
                return Boolean.TRUE;
            }
            if (iOrdinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0071 A[Catch: all -> 0x0016, TryCatch #2 {all -> 0x0016, blocks: (B:119:0x0013, B:123:0x001b, B:131:0x0034, B:136:0x0080, B:135:0x0071, B:137:0x008c, B:139:0x00a3, B:142:0x00b6, B:144:0x00c4, B:146:0x00e4, B:188:0x021f, B:190:0x0232, B:192:0x023c, B:200:0x025c, B:194:0x0242, B:196:0x024c, B:198:0x0252, B:199:0x0256, B:201:0x025f, B:202:0x0266, B:145:0x00d7, B:203:0x0267), top: B:210:0x0013, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x008c A[Catch: all -> 0x0016, PHI: r0
  0x008c: PHI (r0v2 int) = (r0v0 int), (r0v37 int) binds: [B:124:0x0027, B:130:0x0032] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x0016, blocks: (B:119:0x0013, B:123:0x001b, B:131:0x0034, B:136:0x0080, B:135:0x0071, B:137:0x008c, B:139:0x00a3, B:142:0x00b6, B:144:0x00c4, B:146:0x00e4, B:188:0x021f, B:190:0x0232, B:192:0x023c, B:200:0x025c, B:194:0x0242, B:196:0x024c, B:198:0x0252, B:199:0x0256, B:201:0x025f, B:202:0x0266, B:145:0x00d7, B:203:0x0267), top: B:210:0x0013, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00c4 A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #1 {SQLiteException -> 0x00b3, blocks: (B:139:0x00a3, B:142:0x00b6, B:144:0x00c4, B:146:0x00e4, B:188:0x021f, B:190:0x0232, B:192:0x023c, B:200:0x025c, B:194:0x0242, B:196:0x024c, B:198:0x0252, B:199:0x0256, B:201:0x025f, B:202:0x0266, B:145:0x00d7), top: B:209:0x00a3, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00d7 A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #1 {SQLiteException -> 0x00b3, blocks: (B:139:0x00a3, B:142:0x00b6, B:144:0x00c4, B:146:0x00e4, B:188:0x021f, B:190:0x0232, B:192:0x023c, B:200:0x025c, B:194:0x0242, B:196:0x024c, B:198:0x0252, B:199:0x0256, B:201:0x025f, B:202:0x0266, B:145:0x00d7), top: B:209:0x00a3, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00fc A[Catch: all -> 0x0155, TryCatch #0 {all -> 0x0155, blocks: (B:147:0x00eb, B:148:0x00f4, B:150:0x00fc, B:152:0x0113, B:156:0x013d, B:158:0x0147, B:162:0x0158, B:163:0x015d, B:165:0x0163, B:167:0x017a, B:169:0x019f, B:171:0x01ba, B:173:0x01dd, B:174:0x01ee, B:175:0x01f2, B:177:0x01f8, B:178:0x01ff, B:181:0x020c, B:183:0x0210, B:186:0x0217, B:187:0x0218), top: B:208:0x00eb, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0163 A[Catch: all -> 0x0155, TryCatch #0 {all -> 0x0155, blocks: (B:147:0x00eb, B:148:0x00f4, B:150:0x00fc, B:152:0x0113, B:156:0x013d, B:158:0x0147, B:162:0x0158, B:163:0x015d, B:165:0x0163, B:167:0x017a, B:169:0x019f, B:171:0x01ba, B:173:0x01dd, B:174:0x01ee, B:175:0x01f2, B:177:0x01f8, B:178:0x01ff, B:181:0x020c, B:183:0x0210, B:186:0x0217, B:187:0x0218), top: B:208:0x00eb, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01ba A[Catch: all -> 0x0155, TryCatch #0 {all -> 0x0155, blocks: (B:147:0x00eb, B:148:0x00f4, B:150:0x00fc, B:152:0x0113, B:156:0x013d, B:158:0x0147, B:162:0x0158, B:163:0x015d, B:165:0x0163, B:167:0x017a, B:169:0x019f, B:171:0x01ba, B:173:0x01dd, B:174:0x01ee, B:175:0x01f2, B:177:0x01f8, B:178:0x01ff, B:181:0x020c, B:183:0x0210, B:186:0x0217, B:187:0x0218), top: B:208:0x00eb, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01f8 A[Catch: all -> 0x0155, TRY_LEAVE, TryCatch #0 {all -> 0x0155, blocks: (B:147:0x00eb, B:148:0x00f4, B:150:0x00fc, B:152:0x0113, B:156:0x013d, B:158:0x0147, B:162:0x0158, B:163:0x015d, B:165:0x0163, B:167:0x017a, B:169:0x019f, B:171:0x01ba, B:173:0x01dd, B:174:0x01ee, B:175:0x01f2, B:177:0x01f8, B:178:0x01ff, B:181:0x020c, B:183:0x0210, B:186:0x0217, B:187:0x0218), top: B:208:0x00eb, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0242 A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #1 {SQLiteException -> 0x00b3, blocks: (B:139:0x00a3, B:142:0x00b6, B:144:0x00c4, B:146:0x00e4, B:188:0x021f, B:190:0x0232, B:192:0x023c, B:200:0x025c, B:194:0x0242, B:196:0x024c, B:198:0x0252, B:199:0x0256, B:201:0x025f, B:202:0x0266, B:145:0x00d7), top: B:209:0x00a3, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0256 A[Catch: all -> 0x0016, SQLiteException -> 0x00b3, TryCatch #1 {SQLiteException -> 0x00b3, blocks: (B:139:0x00a3, B:142:0x00b6, B:144:0x00c4, B:146:0x00e4, B:188:0x021f, B:190:0x0232, B:192:0x023c, B:200:0x025c, B:194:0x0242, B:196:0x024c, B:198:0x0252, B:199:0x0256, B:201:0x025f, B:202:0x0266, B:145:0x00d7), top: B:209:0x00a3, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void A(boolean r19, int r20, java.lang.Throwable r21, byte[] r22, java.lang.String r23, java.util.List r24) {
        /*
            Method dump skipped, instruction units count: 669
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q6.A(boolean, int, java.lang.Throwable, byte[], java.lang.String, java.util.List):void");
    }

    protected final void A0() {
        b().h();
        F0().u();
        C3911u c3911uF0 = F0();
        c3911uF0.h();
        c3911uF0.j();
        if (c3911uF0.a0()) {
            C3781c2 c3781c2 = AbstractC3789d2.f41250w0;
            if (((Long) c3781c2.b(null)).longValue() != 0) {
                SQLiteDatabase sQLiteDatabaseU0 = c3911uF0.u0();
                X2 x22 = c3911uF0.f40611a;
                int iDelete = sQLiteDatabaseU0.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(x22.e().a()), String.valueOf(c3781c2.b(null))});
                if (iDelete > 0) {
                    x22.a().w().b("Deleted stale trigger uris. rowsDeleted", Integer.valueOf(iDelete));
                }
            }
        }
        if (this.f41546i.f41795h.a() == 0) {
            this.f41546i.f41795h.b(e().a());
        }
        R();
    }

    final void B(C3928w2 c3928w2) {
        b().h();
        if (TextUtils.isEmpty(c3928w2.r0())) {
            C((String) AbstractC2115p.l(c3928w2.o0()), 204, null, null, null);
            return;
        }
        String str = (String) AbstractC2115p.l(c3928w2.o0());
        a().w().b("Fetching remote configuration", str);
        C3502k2 c3502k2W = D0().w(str);
        String strY = D0().y(str);
        C6551a c6551a = null;
        if (c3502k2W != null) {
            if (!TextUtils.isEmpty(strY)) {
                c6551a = new C6551a();
                c6551a.put("If-Modified-Since", strY);
            }
            String strZ = D0().z(str);
            if (!TextUtils.isEmpty(strZ)) {
                if (c6551a == null) {
                    c6551a = new C6551a();
                }
                c6551a.put("If-None-Match", strZ);
            }
        }
        this.f41557t = true;
        E0().o(c3928w2, c6551a, new InterfaceC3900s2() { // from class: com.google.android.gms.measurement.internal.p6
            @Override // com.google.android.gms.measurement.internal.InterfaceC3900s2
            public final /* synthetic */ void a(String str2, int i10, Throwable th2, byte[] bArr, Map map) {
                this.f41498a.C(str2, i10, th2, bArr, map);
            }
        });
    }

    public final C3856m B0() {
        return ((X2) AbstractC2115p.l(this.f41549l)).w();
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void C(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q6.C(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    public final C3793d6 C0() {
        return this.f41547j;
    }

    final void D(Runnable runnable) {
        b().h();
        if (this.f41553p == null) {
            this.f41553p = new ArrayList();
        }
        this.f41553p.add(runnable);
    }

    public final P2 D0() {
        P2 p22 = this.f41538a;
        Y(p22);
        return p22;
    }

    final void E() {
        b().h();
        O0();
        if (this.f41551n) {
            return;
        }
        this.f41551n = true;
        if (a0()) {
            FileChannel fileChannel = this.f41561x;
            b().h();
            int i10 = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                a().o().a("Bad channel to read from");
            } else {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int i11 = fileChannel.read(byteBufferAllocate);
                    if (i11 == 4) {
                        byteBufferAllocate.flip();
                        i10 = byteBufferAllocate.getInt();
                    } else if (i11 != -1) {
                        a().r().b("Unexpected data length. Bytes read", Integer.valueOf(i11));
                    }
                } catch (IOException e10) {
                    a().o().b("Failed to read from channel", e10);
                }
            }
            int iT = this.f41549l.L().t();
            b().h();
            if (i10 > iT) {
                a().o().c("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i10), Integer.valueOf(iT));
                return;
            }
            if (i10 < iT) {
                FileChannel fileChannel2 = this.f41561x;
                b().h();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    a().o().a("Bad channel to read from");
                } else {
                    ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
                    byteBufferAllocate2.putInt(iT);
                    byteBufferAllocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(byteBufferAllocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            a().o().b("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        a().w().c("Storage version upgraded. Previous, current version", Integer.valueOf(i10), Integer.valueOf(iT));
                        return;
                    } catch (IOException e11) {
                        a().o().b("Failed to write to channel", e11);
                    }
                }
                a().o().c("Storage version upgrade failed. Previous, current version", Integer.valueOf(i10), Integer.valueOf(iT));
            }
        }
    }

    public final C3921v2 E0() {
        C3921v2 c3921v2 = this.f41539b;
        Y(c3921v2);
        return c3921v2;
    }

    public final C3911u F0() {
        C3911u c3911u = this.f41540c;
        Y(c3911u);
        return c3911u;
    }

    public final C3942y2 G0() {
        C3942y2 c3942y2 = this.f41541d;
        if (c3942y2 != null) {
            return c3942y2;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final V5 H0() {
        V5 v52 = this.f41542e;
        Y(v52);
        return v52;
    }

    public final C3794e I0() {
        C3794e c3794e = this.f41543f;
        Y(c3794e);
        return c3794e;
    }

    public final C4 J0() {
        C4 c42 = this.f41545h;
        Y(c42);
        return c42;
    }

    public final u6 K0() {
        u6 u6Var = this.f41544g;
        Y(u6Var);
        return u6Var;
    }

    public final C3945y5 L0() {
        return this.f41546i;
    }

    public final C3837j2 M0() {
        return this.f41549l.D();
    }

    public final z6 N0() {
        return ((X2) AbstractC2115p.l(this.f41549l)).C();
    }

    final void O0() {
        if (!this.f41550m.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    final void P0(B6 b62) {
        b().h();
        O0();
        String str = b62.f40646a;
        AbstractC2115p.f(str);
        E3 e3F = E3.f(b62.f40664s, b62.f40669x);
        g(str);
        a().w().c("Setting storage consent for package", str, e3F);
        f(str, e3F);
    }

    final void Q0(B6 b62) {
        b().h();
        O0();
        String str = b62.f40646a;
        AbstractC2115p.f(str);
        C3939y c3939yG = C3939y.g(b62.f40670y);
        a().w().c("Setting DMA consent for package", str, c3939yG);
        b().h();
        O0();
        j9.u uVarC = C3939y.h(S0(str), 100).c();
        this.f41530C.put(str, c3939yG);
        F0().V(str, c3939yG);
        j9.u uVarC2 = C3939y.h(S0(str), 100).c();
        b().h();
        O0();
        j9.u uVar = j9.u.DENIED;
        boolean z10 = uVarC == uVar && uVarC2 == j9.u.GRANTED;
        boolean z11 = uVarC == j9.u.GRANTED && uVarC2 == uVar;
        if (z10 || z11) {
            a().w().b("Generated _dcu event for", str);
            Bundle bundle = new Bundle();
            if (F0().L0(h(), str, false, false, false, false, false, false, false).f41504f < B0().E(str, AbstractC3789d2.f41232n0)) {
                bundle.putLong("_r", 1L);
                a().w().c("_dcu realtime event count", str, Long.valueOf(F0().L0(h(), str, false, false, false, false, false, true, false).f41504f));
            }
            this.f41537J.d(str, "_dcu", bundle);
        }
    }

    final C3939y R0(String str) {
        b().h();
        O0();
        Map map = this.f41530C;
        C3939y c3939y = (C3939y) map.get(str);
        if (c3939y != null) {
            return c3939y;
        }
        C3939y c3939yU = F0().U(str);
        map.put(str, c3939yU);
        return c3939yU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    final Bundle S0(String str) {
        b().h();
        O0();
        if (D0().R(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        E3 e3G = g(str);
        bundle.putAll(e3G.n());
        bundle.putAll(T0(str, R0(str), e3G, new C3870o()).f());
        x6 x6VarB0 = F0().B0(str, "_npa");
        bundle.putString("ad_personalization", 1 != (x6VarB0 != null ? x6VarB0.f41777e.equals(1L) : I(str, new C3870o())) ? "granted" : "denied");
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final com.google.android.gms.measurement.internal.C3939y T0(java.lang.String r10, com.google.android.gms.measurement.internal.C3939y r11, com.google.android.gms.measurement.internal.E3 r12, com.google.android.gms.measurement.internal.C3870o r13) {
        /*
            r9 = this;
            com.google.android.gms.measurement.internal.P2 r0 = r9.D0()
            com.google.android.gms.internal.measurement.e2 r0 = r0.R(r10)
            java.lang.String r1 = "-"
            r2 = 90
            if (r0 != 0) goto L31
            j9.u r10 = r11.c()
            j9.u r12 = j9.u.DENIED
            if (r10 != r12) goto L20
            int r2 = r11.b()
            j9.v r10 = j9.v.AD_USER_DATA
            r13.b(r10, r2)
            goto L27
        L20:
            j9.v r10 = j9.v.AD_USER_DATA
            com.google.android.gms.measurement.internal.n r11 = com.google.android.gms.measurement.internal.EnumC3863n.FAILSAFE
            r13.c(r10, r11)
        L27:
            com.google.android.gms.measurement.internal.y r10 = new com.google.android.gms.measurement.internal.y
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r10.<init>(r11, r2, r12, r1)
            return r10
        L31:
            j9.u r0 = r11.c()
            j9.u r3 = j9.u.GRANTED
            if (r0 == r3) goto L85
            j9.u r4 = j9.u.DENIED
            if (r0 != r4) goto L3e
            goto L85
        L3e:
            j9.u r11 = j9.u.POLICY
            if (r0 != r11) goto L55
            com.google.android.gms.measurement.internal.P2 r11 = r9.f41538a
            j9.v r0 = j9.v.AD_USER_DATA
            j9.u r11 = r11.m(r10, r0)
            j9.u r5 = j9.u.UNINITIALIZED
            if (r11 == r5) goto L55
            com.google.android.gms.measurement.internal.n r12 = com.google.android.gms.measurement.internal.EnumC3863n.REMOTE_ENFORCED_DEFAULT
            r13.c(r0, r12)
            r0 = r11
            goto L8e
        L55:
            com.google.android.gms.measurement.internal.P2 r11 = r9.f41538a
            j9.v r0 = j9.v.AD_USER_DATA
            j9.v r5 = r11.Q(r10, r0)
            j9.u r12 = r12.p()
            r6 = 1
            if (r12 == r3) goto L66
            if (r12 != r4) goto L68
        L66:
            r7 = r6
            goto L69
        L68:
            r7 = 0
        L69:
            j9.v r8 = j9.v.AD_STORAGE
            if (r5 != r8) goto L76
            if (r7 == 0) goto L76
            com.google.android.gms.measurement.internal.n r11 = com.google.android.gms.measurement.internal.EnumC3863n.REMOTE_DELEGATION
            r13.c(r0, r11)
            r0 = r12
            goto L8e
        L76:
            com.google.android.gms.measurement.internal.n r12 = com.google.android.gms.measurement.internal.EnumC3863n.REMOTE_DEFAULT
            r13.c(r0, r12)
            boolean r11 = r11.P(r10, r0)
            if (r6 == r11) goto L83
            r0 = r4
            goto L8e
        L83:
            r0 = r3
            goto L8e
        L85:
            int r2 = r11.b()
            j9.v r11 = j9.v.AD_USER_DATA
            r13.b(r11, r2)
        L8e:
            com.google.android.gms.measurement.internal.P2 r11 = r9.f41538a
            boolean r11 = r11.S(r10)
            com.google.android.gms.measurement.internal.P2 r12 = r9.D0()
            java.util.SortedSet r10 = r12.T(r10)
            j9.u r12 = j9.u.DENIED
            if (r0 == r12) goto Lbb
            boolean r12 = r10.isEmpty()
            if (r12 == 0) goto La7
            goto Lbb
        La7:
            com.google.android.gms.measurement.internal.y r12 = new com.google.android.gms.measurement.internal.y
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            java.lang.String r1 = ""
            if (r11 == 0) goto Lb7
            java.lang.String r1 = android.text.TextUtils.join(r1, r10)
        Lb7:
            r12.<init>(r13, r2, r0, r1)
            return r12
        Lbb:
            com.google.android.gms.measurement.internal.y r10 = new com.google.android.gms.measurement.internal.y
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r10.<init>(r12, r2, r11, r1)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q6.T0(java.lang.String, com.google.android.gms.measurement.internal.y, com.google.android.gms.measurement.internal.E3, com.google.android.gms.measurement.internal.o):com.google.android.gms.measurement.internal.y");
    }

    @Override // com.google.android.gms.measurement.internal.C3
    public final C3887q2 a() {
        return ((X2) AbstractC2115p.l(this.f41549l)).a();
    }

    final boolean a0() {
        b().h();
        FileLock fileLock = this.f41560w;
        if (fileLock != null && fileLock.isValid()) {
            a().w().a("Storage concurrent access okay");
            return true;
        }
        this.f41540c.f40611a.w();
        File filesDir = this.f41549l.d().getFilesDir();
        com.google.android.gms.internal.measurement.Z.a();
        int i10 = AbstractC3455f0.f39754b;
        try {
            FileChannel channel = new RandomAccessFile(new File(new File(filesDir, "google_app_measurement.db").getPath()), "rw").getChannel();
            this.f41561x = channel;
            FileLock fileLockTryLock = channel.tryLock();
            this.f41560w = fileLockTryLock;
            if (fileLockTryLock != null) {
                a().w().a("Storage concurrent access okay");
                return true;
            }
            a().o().a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e10) {
            a().o().b("Failed to acquire storage lock", e10);
            return false;
        } catch (IOException e11) {
            a().o().b("Failed to access storage lock file", e11);
            return false;
        } catch (OverlappingFileLockException e12) {
            a().r().b("Storage lock already acquired", e12);
            return false;
        }
    }

    @Override // com.google.android.gms.measurement.internal.C3
    public final T2 b() {
        return ((X2) AbstractC2115p.l(this.f41549l)).b();
    }

    final void b0(B6 b62) {
        if (this.f41562y != null) {
            ArrayList arrayList = new ArrayList();
            this.f41563z = arrayList;
            arrayList.addAll(this.f41562y);
        }
        C3911u c3911uF0 = F0();
        String str = (String) AbstractC2115p.l(b62.f40646a);
        AbstractC2115p.f(str);
        c3911uF0.h();
        c3911uF0.j();
        try {
            SQLiteDatabase sQLiteDatabaseU0 = c3911uF0.u0();
            String[] strArr = {str};
            int iDelete = sQLiteDatabaseU0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseU0.delete("events", "app_id=?", strArr) + sQLiteDatabaseU0.delete("events_snapshot", "app_id=?", strArr) + sQLiteDatabaseU0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseU0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseU0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseU0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseU0.delete("queue", "app_id=?", strArr) + sQLiteDatabaseU0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseU0.delete("main_event_params", "app_id=?", strArr) + sQLiteDatabaseU0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseU0.delete("trigger_uris", "app_id=?", strArr) + sQLiteDatabaseU0.delete("upload_queue", "app_id=?", strArr);
            com.google.android.gms.internal.measurement.H6.a();
            X2 x22 = c3911uF0.f40611a;
            if (x22.w().H(null, AbstractC3789d2.f41219i1)) {
                iDelete += sQLiteDatabaseU0.delete("no_data_mode_events", "app_id=?", strArr);
            }
            if (iDelete > 0) {
                x22.a().w().c("Reset analytics data. app, records", str, Integer.valueOf(iDelete));
            }
        } catch (SQLiteException e10) {
            c3911uF0.f40611a.a().o().c("Error resetting analytics data. appId, error", C3887q2.x(str), e10);
        }
        if (b62.f40653h) {
            h0(b62);
        }
    }

    @Override // com.google.android.gms.measurement.internal.C3
    public final C3802f c() {
        return this.f41549l.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void c0(com.google.android.gms.measurement.internal.v6 r22, com.google.android.gms.measurement.internal.B6 r23) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q6.c0(com.google.android.gms.measurement.internal.v6, com.google.android.gms.measurement.internal.B6):void");
    }

    @Override // com.google.android.gms.measurement.internal.C3
    public final Context d() {
        return this.f41549l.d();
    }

    final void d0(String str, B6 b62) {
        b().h();
        O0();
        if (X(b62)) {
            if (!b62.f40653h) {
                o0(b62);
                return;
            }
            Boolean boolZ = Z(b62);
            if ("_npa".equals(str) && boolZ != null) {
                a().v().a("Falling back to manifest metadata value for ad personalization");
                c0(new v6("_npa", e().a(), Long.valueOf(true != boolZ.booleanValue() ? 0L : 1L), "auto"), b62);
                return;
            }
            C3873o2 c3873o2V = a().v();
            X2 x22 = this.f41549l;
            c3873o2V.b("Removing user property", x22.D().c(str));
            F0().r0();
            try {
                o0(b62);
                if ("_id".equals(str)) {
                    F0().z0((String) AbstractC2115p.l(b62.f40646a), "_lair");
                }
                F0().z0((String) AbstractC2115p.l(b62.f40646a), str);
                F0().s0();
                a().v().b("User property removed", x22.D().c(str));
                F0().t0();
            } catch (Throwable th2) {
                F0().t0();
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.C3
    public final com.google.android.gms.common.util.d e() {
        return ((X2) AbstractC2115p.l(this.f41549l)).e();
    }

    final void e0() {
        this.f41555r++;
    }

    final void f(String str, E3 e32) {
        b().h();
        O0();
        this.f41529B.put(str, e32);
        F0().L(str, e32);
    }

    final void f0() {
        this.f41556s++;
    }

    final E3 g(String str) {
        E3 e32 = E3.f40738c;
        b().h();
        O0();
        E3 e3J = (E3) this.f41529B.get(str);
        if (e3J == null) {
            e3J = F0().J(str);
            if (e3J == null) {
                e3J = E3.f40738c;
            }
            f(str, e3J);
        }
        return e3J;
    }

    final X2 g0() {
        return this.f41549l;
    }

    final long h() {
        long jA = e().a();
        C3945y5 c3945y5 = this.f41546i;
        c3945y5.j();
        c3945y5.h();
        B2 b22 = c3945y5.f41797j;
        long jA2 = b22.a();
        if (jA2 == 0) {
            jA2 = ((long) c3945y5.f40611a.C().q0().nextInt(86400000)) + 1;
            b22.b(jA2);
        }
        return ((((jA + jA2) / 1000) / 60) / 60) / 24;
    }

    final void h0(B6 b62) {
        long j10;
        long j11;
        C cV0;
        boolean z10;
        String str;
        PackageInfo packageInfoE;
        ApplicationInfo applicationInfoC;
        long j12;
        boolean z11;
        b().h();
        O0();
        AbstractC2115p.l(b62);
        String str2 = b62.f40646a;
        AbstractC2115p.f(str2);
        if (X(b62)) {
            C3928w2 c3928w2J0 = F0().J0(str2);
            if (c3928w2J0 != null && TextUtils.isEmpty(c3928w2J0.r0()) && !TextUtils.isEmpty(b62.f40647b)) {
                c3928w2J0.i(0L);
                F0().K0(c3928w2J0, false, false);
                D0().B(str2);
            }
            if (!b62.f40653h) {
                o0(b62);
                return;
            }
            long jA = b62.f40657l;
            if (jA == 0) {
                jA = e().a();
            }
            long j13 = jA;
            int i10 = b62.f40658m;
            if (i10 != 0 && i10 != 1) {
                a().r().c("Incorrect app type, assuming installed app. appId, appType", C3887q2.x(str2), Integer.valueOf(i10));
                i10 = 0;
            }
            F0().r0();
            try {
                x6 x6VarB0 = F0().B0(str2, "_npa");
                Boolean boolZ = Z(b62);
                if (x6VarB0 != null && !"auto".equals(x6VarB0.f41774b)) {
                    j10 = j13;
                    j11 = 1;
                } else if (boolZ != null) {
                    v6 v6Var = new v6("_npa", j13, Long.valueOf(true != boolZ.booleanValue() ? 0L : 1L), "auto");
                    j11 = 1;
                    j10 = j13;
                    if (x6VarB0 == null || !x6VarB0.f41777e.equals(v6Var.f41671d)) {
                        c0(v6Var, b62);
                    }
                } else {
                    j10 = j13;
                    j11 = 1;
                    if (x6VarB0 != null) {
                        d0("_npa", b62);
                    }
                }
                if (B0().H(null, AbstractC3789d2.f41201c1)) {
                    n0(b62, b62.f40644D);
                } else {
                    n0(b62, j10);
                }
                o0(b62);
                if (i10 == 0) {
                    cV0 = F0().v0(str2, "_f");
                    z10 = false;
                } else {
                    cV0 = F0().v0(str2, "_v");
                    z10 = true;
                }
                if (cV0 == null) {
                    long j14 = ((j10 / 3600000) + j11) * 3600000;
                    if (z10) {
                        long j15 = j10;
                        c0(new v6("_fvt", j15, Long.valueOf(j14), "auto"), b62);
                        b().h();
                        O0();
                        Bundle bundle = new Bundle();
                        bundle.putLong("_c", 1L);
                        bundle.putLong("_r", 1L);
                        bundle.putLong("_et", 1L);
                        if (b62.f40660o) {
                            bundle.putLong("_dac", 1L);
                        }
                        if (B0().H(null, AbstractC3789d2.f41225k1)) {
                            bundle.putLong("_elt", e().a());
                        }
                        j(new G("_v", new E(bundle), "auto", j15), b62);
                    } else {
                        Long lValueOf = Long.valueOf(j14);
                        long j16 = j10;
                        c0(new v6("_fot", j16, lValueOf, "auto"), b62);
                        b().h();
                        H2 h22 = (H2) AbstractC2115p.l(this.f41548k);
                        if (str2 == null || str2.isEmpty()) {
                            str = "_elt";
                            h22.f40788a.a().s().a("Install Referrer Reporter was called with invalid app package name");
                        } else {
                            X2 x22 = h22.f40788a;
                            x22.b().h();
                            if (h22.a()) {
                                G2 g22 = new G2(h22, str2);
                                x22.b().h();
                                Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                str = "_elt";
                                intent.setComponent(new ComponentName(BillingConstants.VENDING_PACKAGE, "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                PackageManager packageManager = x22.d().getPackageManager();
                                if (packageManager == null) {
                                    x22.a().s().a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                } else {
                                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                                    if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                                        x22.a().u().a("Play Service for fetching Install Referrer is unavailable on device");
                                    } else {
                                        ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                                        if (serviceInfo != null) {
                                            String str3 = serviceInfo.packageName;
                                            if (serviceInfo.name != null && BillingConstants.VENDING_PACKAGE.equals(str3) && h22.a()) {
                                                try {
                                                    x22.a().w().b("Install Referrer Service is", V8.a.b().a(x22.d(), new Intent(intent), g22, 1) ? "available" : "not available");
                                                } catch (RuntimeException e10) {
                                                    h22.f40788a.a().o().b("Exception occurred while binding to Install Referrer Service", e10.getMessage());
                                                }
                                            } else {
                                                x22.a().r().a("Play Store version 8.3.73 or higher required for Install Referrer");
                                            }
                                        }
                                    }
                                }
                            } else {
                                x22.a().u().a("Install Referrer Reporter is not available");
                                str = "_elt";
                            }
                        }
                        b().h();
                        O0();
                        Bundle bundle2 = new Bundle();
                        long j17 = j11;
                        bundle2.putLong("_c", j17);
                        bundle2.putLong("_r", j17);
                        bundle2.putLong("_uwa", 0L);
                        bundle2.putLong("_pfo", 0L);
                        bundle2.putLong("_sys", 0L);
                        bundle2.putLong("_sysu", 0L);
                        bundle2.putLong("_et", j17);
                        if (b62.f40660o) {
                            bundle2.putLong("_dac", j17);
                        }
                        String str4 = (String) AbstractC2115p.l(b62.f40646a);
                        C3911u c3911uF0 = F0();
                        AbstractC2115p.f(str4);
                        c3911uF0.h();
                        c3911uF0.j();
                        long jZ = c3911uF0.z(str4, "first_open_count");
                        X2 x23 = this.f41549l;
                        if (x23.d().getPackageManager() == null) {
                            a().o().b("PackageManager is null, first open report might be inaccurate. appId", C3887q2.x(str4));
                        } else {
                            try {
                                packageInfoE = X8.e.a(x23.d()).e(str4, 0);
                            } catch (PackageManager.NameNotFoundException e11) {
                                a().o().c("Package info is null, first open report might be inaccurate. appId", C3887q2.x(str4), e11);
                                packageInfoE = null;
                            }
                            if (packageInfoE != null) {
                                long j18 = packageInfoE.firstInstallTime;
                                if (j18 != 0) {
                                    if (j18 != packageInfoE.lastUpdateTime) {
                                        if (!B0().H(null, AbstractC3789d2.f41160J0)) {
                                            bundle2.putLong("_uwa", 1L);
                                        } else if (jZ == 0) {
                                            bundle2.putLong("_uwa", 1L);
                                            jZ = 0;
                                        }
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    c0(new v6("_fi", j16, Long.valueOf(true != z11 ? 0L : 1L), "auto"), b62);
                                }
                            }
                            try {
                                applicationInfoC = X8.e.a(this.f41549l.d()).c(str4, 0);
                            } catch (PackageManager.NameNotFoundException e12) {
                                a().o().c("Application info is null, first open report might be inaccurate. appId", C3887q2.x(str4), e12);
                                applicationInfoC = null;
                            }
                            if (applicationInfoC != null) {
                                if ((applicationInfoC.flags & 1) != 0) {
                                    j12 = 1;
                                    bundle2.putLong("_sys", 1L);
                                } else {
                                    j12 = 1;
                                }
                                if ((applicationInfoC.flags & 128) != 0) {
                                    bundle2.putLong("_sysu", j12);
                                }
                            }
                        }
                        if (jZ >= 0) {
                            bundle2.putLong("_pfo", jZ);
                        }
                        if (B0().H(null, AbstractC3789d2.f41225k1)) {
                            bundle2.putLong(str, e().a());
                        }
                        j(new G("_f", new E(bundle2), "auto", j16), b62);
                    }
                } else {
                    long j19 = j10;
                    if (b62.f40654i) {
                        j(new G("_cd", new E(new Bundle()), "auto", j19), b62);
                    }
                }
                F0().s0();
                F0().t0();
            } catch (Throwable th2) {
                F0().t0();
                throw th2;
            }
        }
    }

    final void i(G g10, String str) {
        C3928w2 c3928w2J0 = F0().J0(str);
        if (c3928w2J0 == null || TextUtils.isEmpty(c3928w2J0.D0())) {
            a().v().b("No app data available; dropping event", str);
            return;
        }
        Boolean boolT = T(c3928w2J0);
        if (boolT == null) {
            if (!"_ui".equals(g10.f40764a)) {
                a().r().b("Could not find package. appId", C3887q2.x(str));
            }
        } else if (!boolT.booleanValue()) {
            a().o().b("App version does not match; dropping event. appId", C3887q2.x(str));
            return;
        }
        j(g10, new B6(str, c3928w2J0.r0(), c3928w2J0.D0(), c3928w2J0.F0(), c3928w2J0.H0(), c3928w2J0.J0(), c3928w2J0.L0(), (String) null, c3928w2J0.d(), false, c3928w2J0.x0(), 0L, 0, c3928w2J0.P(), false, c3928w2J0.R(), c3928w2J0.b(), c3928w2J0.T(), g(str).l(), "", (String) null, c3928w2J0.V(), c3928w2J0.X(), g(str).b(), R0(str).e(), c3928w2J0.b0(), c3928w2J0.j0(), c3928w2J0.l0(), c3928w2J0.I(), 0L, c3928w2J0.M()));
    }

    final void i0(B6 b62) throws Throwable {
        b().h();
        O0();
        AbstractC2115p.l(b62);
        String str = b62.f40646a;
        AbstractC2115p.f(str);
        int i10 = 0;
        if (B0().H(null, AbstractC3789d2.f41142A0)) {
            long jA = e().a();
            int iE = B0().E(null, AbstractC3789d2.f41221j0);
            B0();
            long jN = jA - C3856m.n();
            while (i10 < iE && M(null, jN)) {
                i10++;
            }
        } else {
            B0();
            long jP = C3856m.p();
            while (i10 < jP && M(str, 0L)) {
                i10++;
            }
        }
        if (B0().H(null, AbstractC3789d2.f41144B0)) {
            b().h();
            v0();
        }
        if (this.f41547j.j(str, EnumC3539o3.a(b62.f40645E))) {
            a().w().b("[sgtm] Going background, trigger client side upload. appId", str);
            s(str, e().a());
        }
    }

    final void j(G g10, B6 b62) {
        String str = b62.f40646a;
        AbstractC2115p.f(str);
        C3893r2 c3893r2A = C3893r2.a(g10);
        N0().w(c3893r2A.f41573d, F0().G(str));
        N0().u(c3893r2A, B0().w(str));
        G gB = c3893r2A.b();
        if (!B0().H(null, AbstractC3789d2.f41213g1) && "_cmp".equals(gB.f40764a)) {
            E e10 = gB.f40765b;
            if ("referrer API v2".equals(e10.f("_cis"))) {
                String strF = e10.f("gclid");
                if (!TextUtils.isEmpty(strF)) {
                    c0(new v6("_lgclid", gB.f40767d, strF, "auto"), b62);
                }
            }
        }
        k(gB, b62);
    }

    final void j0(C3826i c3826i) {
        B6 b6U = U((String) AbstractC2115p.l(c3826i.f41351a));
        if (b6U != null) {
            k0(c3826i, b6U);
        }
    }

    final void k(G g10, B6 b62) {
        G g11;
        List<C3826i> listI0;
        List<C3826i> listI02;
        List<C3826i> listI03;
        String str;
        AbstractC2115p.l(b62);
        String str2 = b62.f40646a;
        AbstractC2115p.f(str2);
        b().h();
        O0();
        long j10 = g10.f40767d;
        C3893r2 c3893r2A = C3893r2.a(g10);
        b().h();
        z6.k0((this.f41533F == null || (str = this.f41534G) == null || !str.equals(str2)) ? null : this.f41533F, c3893r2A.f41573d, false);
        G gB = c3893r2A.b();
        K0();
        if (u6.p(gB, b62)) {
            if (!b62.f40653h) {
                o0(b62);
                return;
            }
            List list = b62.f40663r;
            if (list != null) {
                String str3 = gB.f40764a;
                if (!list.contains(str3)) {
                    a().v().d("Dropping non-safelisted event. appId, event name, origin", str2, gB.f40764a, gB.f40766c);
                    return;
                } else {
                    Bundle bundleL = gB.f40765b.l();
                    bundleL.putLong("ga_safelisted", 1L);
                    g11 = new G(str3, new E(bundleL), gB.f40766c, gB.f40767d);
                }
            } else {
                g11 = gB;
            }
            F0().r0();
            try {
                String str4 = g11.f40764a;
                if ("_s".equals(str4) && !F0().C(str2, "_s") && g11.f40765b.d("_sid").longValue() != 0) {
                    if (F0().C(str2, "_f") || F0().C(str2, "_v")) {
                        F0().I(str2, null, "_sid", l(str2, g11));
                    } else {
                        F0().I(str2, Long.valueOf(e().a() - 15000), "_sid", l(str2, g11));
                    }
                }
                C3911u c3911uF0 = F0();
                AbstractC2115p.f(str2);
                c3911uF0.h();
                c3911uF0.j();
                if (j10 < 0) {
                    c3911uF0.f40611a.a().r().c("Invalid time querying timed out conditional properties", C3887q2.x(str2), Long.valueOf(j10));
                    listI0 = Collections.EMPTY_LIST;
                } else {
                    listI0 = c3911uF0.I0("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j10)});
                }
                for (C3826i c3826i : listI0) {
                    if (c3826i != null) {
                        a().w().d("User property timed out", c3826i.f41351a, this.f41549l.D().c(c3826i.f41353c.f41669b), c3826i.f41353c.c());
                        G g12 = c3826i.f41357g;
                        if (g12 != null) {
                            m(new G(g12, j10), b62);
                        }
                        F0().G0(str2, c3826i.f41353c.f41669b);
                    }
                }
                C3911u c3911uF02 = F0();
                AbstractC2115p.f(str2);
                c3911uF02.h();
                c3911uF02.j();
                if (j10 < 0) {
                    c3911uF02.f40611a.a().r().c("Invalid time querying expired conditional properties", C3887q2.x(str2), Long.valueOf(j10));
                    listI02 = Collections.EMPTY_LIST;
                } else {
                    listI02 = c3911uF02.I0("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j10)});
                }
                ArrayList arrayList = new ArrayList(listI02.size());
                for (C3826i c3826i2 : listI02) {
                    if (c3826i2 != null) {
                        a().w().d("User property expired", c3826i2.f41351a, this.f41549l.D().c(c3826i2.f41353c.f41669b), c3826i2.f41353c.c());
                        F0().z0(str2, c3826i2.f41353c.f41669b);
                        G g13 = c3826i2.f41361k;
                        if (g13 != null) {
                            arrayList.add(g13);
                        }
                        F0().G0(str2, c3826i2.f41353c.f41669b);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m(new G((G) it.next(), j10), b62);
                }
                C3911u c3911uF03 = F0();
                AbstractC2115p.f(str2);
                AbstractC2115p.f(str4);
                c3911uF03.h();
                c3911uF03.j();
                if (j10 < 0) {
                    X2 x22 = c3911uF03.f40611a;
                    x22.a().r().d("Invalid time querying triggered conditional properties", C3887q2.x(str2), x22.D().a(str4), Long.valueOf(j10));
                    listI03 = Collections.EMPTY_LIST;
                } else {
                    listI03 = c3911uF03.I0("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j10)});
                }
                ArrayList arrayList2 = new ArrayList(listI03.size());
                for (C3826i c3826i3 : listI03) {
                    if (c3826i3 != null) {
                        v6 v6Var = c3826i3.f41353c;
                        x6 x6Var = new x6((String) AbstractC2115p.l(c3826i3.f41351a), c3826i3.f41352b, v6Var.f41669b, j10, AbstractC2115p.l(v6Var.c()));
                        if (F0().A0(x6Var)) {
                            a().w().d("User property triggered", c3826i3.f41351a, this.f41549l.D().c(x6Var.f41775c), x6Var.f41777e);
                        } else {
                            a().o().d("Too many active user properties, ignoring", C3887q2.x(c3826i3.f41351a), this.f41549l.D().c(x6Var.f41775c), x6Var.f41777e);
                        }
                        G g14 = c3826i3.f41359i;
                        if (g14 != null) {
                            arrayList2.add(g14);
                        }
                        c3826i3.f41353c = new v6(x6Var);
                        c3826i3.f41355e = true;
                        F0().E0(c3826i3);
                    }
                }
                m(g11, b62);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    m(new G((G) it2.next(), j10), b62);
                }
                F0().s0();
                F0().t0();
            } catch (Throwable th2) {
                F0().t0();
                throw th2;
            }
        }
    }

    final void k0(C3826i c3826i, B6 b62) {
        AbstractC2115p.l(c3826i);
        AbstractC2115p.f(c3826i.f41351a);
        AbstractC2115p.l(c3826i.f41352b);
        AbstractC2115p.l(c3826i.f41353c);
        AbstractC2115p.f(c3826i.f41353c.f41669b);
        b().h();
        O0();
        if (X(b62)) {
            if (!b62.f40653h) {
                o0(b62);
                return;
            }
            C3826i c3826i2 = new C3826i(c3826i);
            boolean z10 = false;
            c3826i2.f41355e = false;
            F0().r0();
            try {
                C3826i c3826iF0 = F0().F0((String) AbstractC2115p.l(c3826i2.f41351a), c3826i2.f41353c.f41669b);
                if (c3826iF0 != null && !c3826iF0.f41352b.equals(c3826i2.f41352b)) {
                    a().r().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.f41549l.D().c(c3826i2.f41353c.f41669b), c3826i2.f41352b, c3826iF0.f41352b);
                }
                if (c3826iF0 != null && c3826iF0.f41355e) {
                    c3826i2.f41352b = c3826iF0.f41352b;
                    c3826i2.f41354d = c3826iF0.f41354d;
                    c3826i2.f41358h = c3826iF0.f41358h;
                    c3826i2.f41356f = c3826iF0.f41356f;
                    c3826i2.f41359i = c3826iF0.f41359i;
                    c3826i2.f41355e = true;
                    v6 v6Var = c3826i2.f41353c;
                    c3826i2.f41353c = new v6(v6Var.f41669b, c3826iF0.f41353c.f41670c, v6Var.c(), c3826iF0.f41353c.f41673f);
                } else if (TextUtils.isEmpty(c3826i2.f41356f)) {
                    v6 v6Var2 = c3826i2.f41353c;
                    c3826i2.f41353c = new v6(v6Var2.f41669b, c3826i2.f41354d, v6Var2.c(), c3826i2.f41353c.f41673f);
                    c3826i2.f41355e = true;
                    z10 = true;
                }
                if (c3826i2.f41355e) {
                    v6 v6Var3 = c3826i2.f41353c;
                    x6 x6Var = new x6((String) AbstractC2115p.l(c3826i2.f41351a), c3826i2.f41352b, v6Var3.f41669b, v6Var3.f41670c, AbstractC2115p.l(v6Var3.c()));
                    if (F0().A0(x6Var)) {
                        a().v().d("User property updated immediately", c3826i2.f41351a, this.f41549l.D().c(x6Var.f41775c), x6Var.f41777e);
                    } else {
                        a().o().d("(2)Too many active user properties, ignoring", C3887q2.x(c3826i2.f41351a), this.f41549l.D().c(x6Var.f41775c), x6Var.f41777e);
                    }
                    if (z10 && c3826i2.f41359i != null) {
                        m(new G(c3826i2.f41359i, c3826i2.f41354d), b62);
                    }
                }
                if (F0().E0(c3826i2)) {
                    a().v().d("Conditional property added", c3826i2.f41351a, this.f41549l.D().c(c3826i2.f41353c.f41669b), c3826i2.f41353c.c());
                } else {
                    a().o().d("Too many conditional properties, ignoring", C3887q2.x(c3826i2.f41351a), this.f41549l.D().c(c3826i2.f41353c.f41669b), c3826i2.f41353c.c());
                }
                F0().s0();
                F0().t0();
            } catch (Throwable th2) {
                F0().t0();
                throw th2;
            }
        }
    }

    final Bundle l(String str, G g10) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", g10.f40765b.d("_sid").longValue());
        x6 x6VarB0 = F0().B0(str, "_sno");
        if (x6VarB0 != null) {
            Object obj = x6VarB0.f41777e;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    final void l0(C3826i c3826i) {
        B6 b6U = U((String) AbstractC2115p.l(c3826i.f41351a));
        if (b6U != null) {
            m0(c3826i, b6U);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:445:0x018d A[PHI: r28 r29
  0x018d: PHI (r28v6 java.lang.String) = (r28v1 java.lang.String), (r28v1 java.lang.String), (r28v7 java.lang.String) binds: [B:462:0x020c, B:464:0x021a, B:444:0x0189] A[DONT_GENERATE, DONT_INLINE]
  0x018d: PHI (r29v6 java.lang.String) = (r29v1 java.lang.String), (r29v1 java.lang.String), (r29v7 java.lang.String) binds: [B:462:0x020c, B:464:0x021a, B:444:0x0189] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:448:0x019d A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:428:0x0155, B:431:0x0164, B:433:0x016c, B:439:0x0179, B:481:0x02f2, B:490:0x0325, B:492:0x0366, B:494:0x036b, B:495:0x0382, B:497:0x038d, B:499:0x03a6, B:501:0x03ab, B:502:0x03c2, B:505:0x03e4, B:509:0x0407, B:510:0x041e, B:512:0x042a, B:515:0x0447, B:516:0x045b, B:518:0x0463, B:520:0x046f, B:522:0x0475, B:523:0x047c, B:525:0x0489, B:527:0x0491, B:529:0x0499, B:531:0x04a1, B:532:0x04ad, B:533:0x04ba, B:539:0x04fc, B:540:0x0511, B:542:0x0533, B:545:0x054a, B:548:0x0585, B:550:0x05b0, B:552:0x05e8, B:553:0x05eb, B:555:0x05f3, B:556:0x05f6, B:558:0x05fe, B:559:0x0601, B:561:0x0609, B:562:0x060c, B:564:0x0615, B:565:0x0619, B:567:0x0626, B:568:0x0629, B:570:0x0655, B:572:0x065f, B:576:0x0674, B:581:0x0680, B:584:0x0689, B:588:0x0696, B:592:0x06a4, B:596:0x06b2, B:600:0x06c0, B:604:0x06ce, B:608:0x06d9, B:612:0x06e6, B:613:0x06f2, B:615:0x06f8, B:616:0x06fb, B:618:0x071e, B:621:0x0727, B:624:0x0730, B:625:0x074a, B:627:0x0750, B:629:0x0764, B:631:0x0770, B:633:0x077d, B:636:0x0796, B:637:0x07a6, B:641:0x07af, B:642:0x07b2, B:644:0x07bf, B:645:0x07c4, B:647:0x07e2, B:649:0x07e6, B:651:0x07f6, B:653:0x0801, B:654:0x080a, B:656:0x0814, B:658:0x0820, B:660:0x082a, B:662:0x0830, B:664:0x083f, B:666:0x0855, B:668:0x085b, B:669:0x0864, B:671:0x0872, B:673:0x08ae, B:675:0x08b8, B:676:0x08bb, B:678:0x08c5, B:680:0x08e1, B:681:0x08ec, B:683:0x0924, B:685:0x092c, B:687:0x0936, B:688:0x0943, B:690:0x094d, B:691:0x095a, B:692:0x0963, B:694:0x0969, B:696:0x09a5, B:698:0x09af, B:700:0x09c1, B:702:0x09c7, B:703:0x0a0c, B:704:0x0a17, B:705:0x0a22, B:707:0x0a28, B:716:0x0a75, B:717:0x0ac0, B:719:0x0ad1, B:733:0x0b32, B:724:0x0ae9, B:725:0x0aec, B:710:0x0a35, B:712:0x0a61, B:730:0x0b05, B:731:0x0b1c, B:732:0x0b1d, B:619:0x0721, B:549:0x05a2, B:536:0x04e3, B:484:0x0306, B:485:0x030d, B:487:0x0313, B:489:0x031f, B:446:0x0191, B:448:0x019d, B:450:0x01b2, B:456:0x01d2, B:461:0x0208, B:463:0x020e, B:465:0x021c, B:467:0x022a, B:470:0x0236, B:478:0x02bb, B:480:0x02c5, B:472:0x025f, B:473:0x0278, B:477:0x029e, B:476:0x028b, B:459:0x01de, B:460:0x01fc), top: B:745:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:460:0x01fc A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:428:0x0155, B:431:0x0164, B:433:0x016c, B:439:0x0179, B:481:0x02f2, B:490:0x0325, B:492:0x0366, B:494:0x036b, B:495:0x0382, B:497:0x038d, B:499:0x03a6, B:501:0x03ab, B:502:0x03c2, B:505:0x03e4, B:509:0x0407, B:510:0x041e, B:512:0x042a, B:515:0x0447, B:516:0x045b, B:518:0x0463, B:520:0x046f, B:522:0x0475, B:523:0x047c, B:525:0x0489, B:527:0x0491, B:529:0x0499, B:531:0x04a1, B:532:0x04ad, B:533:0x04ba, B:539:0x04fc, B:540:0x0511, B:542:0x0533, B:545:0x054a, B:548:0x0585, B:550:0x05b0, B:552:0x05e8, B:553:0x05eb, B:555:0x05f3, B:556:0x05f6, B:558:0x05fe, B:559:0x0601, B:561:0x0609, B:562:0x060c, B:564:0x0615, B:565:0x0619, B:567:0x0626, B:568:0x0629, B:570:0x0655, B:572:0x065f, B:576:0x0674, B:581:0x0680, B:584:0x0689, B:588:0x0696, B:592:0x06a4, B:596:0x06b2, B:600:0x06c0, B:604:0x06ce, B:608:0x06d9, B:612:0x06e6, B:613:0x06f2, B:615:0x06f8, B:616:0x06fb, B:618:0x071e, B:621:0x0727, B:624:0x0730, B:625:0x074a, B:627:0x0750, B:629:0x0764, B:631:0x0770, B:633:0x077d, B:636:0x0796, B:637:0x07a6, B:641:0x07af, B:642:0x07b2, B:644:0x07bf, B:645:0x07c4, B:647:0x07e2, B:649:0x07e6, B:651:0x07f6, B:653:0x0801, B:654:0x080a, B:656:0x0814, B:658:0x0820, B:660:0x082a, B:662:0x0830, B:664:0x083f, B:666:0x0855, B:668:0x085b, B:669:0x0864, B:671:0x0872, B:673:0x08ae, B:675:0x08b8, B:676:0x08bb, B:678:0x08c5, B:680:0x08e1, B:681:0x08ec, B:683:0x0924, B:685:0x092c, B:687:0x0936, B:688:0x0943, B:690:0x094d, B:691:0x095a, B:692:0x0963, B:694:0x0969, B:696:0x09a5, B:698:0x09af, B:700:0x09c1, B:702:0x09c7, B:703:0x0a0c, B:704:0x0a17, B:705:0x0a22, B:707:0x0a28, B:716:0x0a75, B:717:0x0ac0, B:719:0x0ad1, B:733:0x0b32, B:724:0x0ae9, B:725:0x0aec, B:710:0x0a35, B:712:0x0a61, B:730:0x0b05, B:731:0x0b1c, B:732:0x0b1d, B:619:0x0721, B:549:0x05a2, B:536:0x04e3, B:484:0x0306, B:485:0x030d, B:487:0x0313, B:489:0x031f, B:446:0x0191, B:448:0x019d, B:450:0x01b2, B:456:0x01d2, B:461:0x0208, B:463:0x020e, B:465:0x021c, B:467:0x022a, B:470:0x0236, B:478:0x02bb, B:480:0x02c5, B:472:0x025f, B:473:0x0278, B:477:0x029e, B:476:0x028b, B:459:0x01de, B:460:0x01fc), top: B:745:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:463:0x020e A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:428:0x0155, B:431:0x0164, B:433:0x016c, B:439:0x0179, B:481:0x02f2, B:490:0x0325, B:492:0x0366, B:494:0x036b, B:495:0x0382, B:497:0x038d, B:499:0x03a6, B:501:0x03ab, B:502:0x03c2, B:505:0x03e4, B:509:0x0407, B:510:0x041e, B:512:0x042a, B:515:0x0447, B:516:0x045b, B:518:0x0463, B:520:0x046f, B:522:0x0475, B:523:0x047c, B:525:0x0489, B:527:0x0491, B:529:0x0499, B:531:0x04a1, B:532:0x04ad, B:533:0x04ba, B:539:0x04fc, B:540:0x0511, B:542:0x0533, B:545:0x054a, B:548:0x0585, B:550:0x05b0, B:552:0x05e8, B:553:0x05eb, B:555:0x05f3, B:556:0x05f6, B:558:0x05fe, B:559:0x0601, B:561:0x0609, B:562:0x060c, B:564:0x0615, B:565:0x0619, B:567:0x0626, B:568:0x0629, B:570:0x0655, B:572:0x065f, B:576:0x0674, B:581:0x0680, B:584:0x0689, B:588:0x0696, B:592:0x06a4, B:596:0x06b2, B:600:0x06c0, B:604:0x06ce, B:608:0x06d9, B:612:0x06e6, B:613:0x06f2, B:615:0x06f8, B:616:0x06fb, B:618:0x071e, B:621:0x0727, B:624:0x0730, B:625:0x074a, B:627:0x0750, B:629:0x0764, B:631:0x0770, B:633:0x077d, B:636:0x0796, B:637:0x07a6, B:641:0x07af, B:642:0x07b2, B:644:0x07bf, B:645:0x07c4, B:647:0x07e2, B:649:0x07e6, B:651:0x07f6, B:653:0x0801, B:654:0x080a, B:656:0x0814, B:658:0x0820, B:660:0x082a, B:662:0x0830, B:664:0x083f, B:666:0x0855, B:668:0x085b, B:669:0x0864, B:671:0x0872, B:673:0x08ae, B:675:0x08b8, B:676:0x08bb, B:678:0x08c5, B:680:0x08e1, B:681:0x08ec, B:683:0x0924, B:685:0x092c, B:687:0x0936, B:688:0x0943, B:690:0x094d, B:691:0x095a, B:692:0x0963, B:694:0x0969, B:696:0x09a5, B:698:0x09af, B:700:0x09c1, B:702:0x09c7, B:703:0x0a0c, B:704:0x0a17, B:705:0x0a22, B:707:0x0a28, B:716:0x0a75, B:717:0x0ac0, B:719:0x0ad1, B:733:0x0b32, B:724:0x0ae9, B:725:0x0aec, B:710:0x0a35, B:712:0x0a61, B:730:0x0b05, B:731:0x0b1c, B:732:0x0b1d, B:619:0x0721, B:549:0x05a2, B:536:0x04e3, B:484:0x0306, B:485:0x030d, B:487:0x0313, B:489:0x031f, B:446:0x0191, B:448:0x019d, B:450:0x01b2, B:456:0x01d2, B:461:0x0208, B:463:0x020e, B:465:0x021c, B:467:0x022a, B:470:0x0236, B:478:0x02bb, B:480:0x02c5, B:472:0x025f, B:473:0x0278, B:477:0x029e, B:476:0x028b, B:459:0x01de, B:460:0x01fc), top: B:745:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0306 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:428:0x0155, B:431:0x0164, B:433:0x016c, B:439:0x0179, B:481:0x02f2, B:490:0x0325, B:492:0x0366, B:494:0x036b, B:495:0x0382, B:497:0x038d, B:499:0x03a6, B:501:0x03ab, B:502:0x03c2, B:505:0x03e4, B:509:0x0407, B:510:0x041e, B:512:0x042a, B:515:0x0447, B:516:0x045b, B:518:0x0463, B:520:0x046f, B:522:0x0475, B:523:0x047c, B:525:0x0489, B:527:0x0491, B:529:0x0499, B:531:0x04a1, B:532:0x04ad, B:533:0x04ba, B:539:0x04fc, B:540:0x0511, B:542:0x0533, B:545:0x054a, B:548:0x0585, B:550:0x05b0, B:552:0x05e8, B:553:0x05eb, B:555:0x05f3, B:556:0x05f6, B:558:0x05fe, B:559:0x0601, B:561:0x0609, B:562:0x060c, B:564:0x0615, B:565:0x0619, B:567:0x0626, B:568:0x0629, B:570:0x0655, B:572:0x065f, B:576:0x0674, B:581:0x0680, B:584:0x0689, B:588:0x0696, B:592:0x06a4, B:596:0x06b2, B:600:0x06c0, B:604:0x06ce, B:608:0x06d9, B:612:0x06e6, B:613:0x06f2, B:615:0x06f8, B:616:0x06fb, B:618:0x071e, B:621:0x0727, B:624:0x0730, B:625:0x074a, B:627:0x0750, B:629:0x0764, B:631:0x0770, B:633:0x077d, B:636:0x0796, B:637:0x07a6, B:641:0x07af, B:642:0x07b2, B:644:0x07bf, B:645:0x07c4, B:647:0x07e2, B:649:0x07e6, B:651:0x07f6, B:653:0x0801, B:654:0x080a, B:656:0x0814, B:658:0x0820, B:660:0x082a, B:662:0x0830, B:664:0x083f, B:666:0x0855, B:668:0x085b, B:669:0x0864, B:671:0x0872, B:673:0x08ae, B:675:0x08b8, B:676:0x08bb, B:678:0x08c5, B:680:0x08e1, B:681:0x08ec, B:683:0x0924, B:685:0x092c, B:687:0x0936, B:688:0x0943, B:690:0x094d, B:691:0x095a, B:692:0x0963, B:694:0x0969, B:696:0x09a5, B:698:0x09af, B:700:0x09c1, B:702:0x09c7, B:703:0x0a0c, B:704:0x0a17, B:705:0x0a22, B:707:0x0a28, B:716:0x0a75, B:717:0x0ac0, B:719:0x0ad1, B:733:0x0b32, B:724:0x0ae9, B:725:0x0aec, B:710:0x0a35, B:712:0x0a61, B:730:0x0b05, B:731:0x0b1c, B:732:0x0b1d, B:619:0x0721, B:549:0x05a2, B:536:0x04e3, B:484:0x0306, B:485:0x030d, B:487:0x0313, B:489:0x031f, B:446:0x0191, B:448:0x019d, B:450:0x01b2, B:456:0x01d2, B:461:0x0208, B:463:0x020e, B:465:0x021c, B:467:0x022a, B:470:0x0236, B:478:0x02bb, B:480:0x02c5, B:472:0x025f, B:473:0x0278, B:477:0x029e, B:476:0x028b, B:459:0x01de, B:460:0x01fc), top: B:745:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0366 A[Catch: all -> 0x0176, TryCatch #3 {all -> 0x0176, blocks: (B:428:0x0155, B:431:0x0164, B:433:0x016c, B:439:0x0179, B:481:0x02f2, B:490:0x0325, B:492:0x0366, B:494:0x036b, B:495:0x0382, B:497:0x038d, B:499:0x03a6, B:501:0x03ab, B:502:0x03c2, B:505:0x03e4, B:509:0x0407, B:510:0x041e, B:512:0x042a, B:515:0x0447, B:516:0x045b, B:518:0x0463, B:520:0x046f, B:522:0x0475, B:523:0x047c, B:525:0x0489, B:527:0x0491, B:529:0x0499, B:531:0x04a1, B:532:0x04ad, B:533:0x04ba, B:539:0x04fc, B:540:0x0511, B:542:0x0533, B:545:0x054a, B:548:0x0585, B:550:0x05b0, B:552:0x05e8, B:553:0x05eb, B:555:0x05f3, B:556:0x05f6, B:558:0x05fe, B:559:0x0601, B:561:0x0609, B:562:0x060c, B:564:0x0615, B:565:0x0619, B:567:0x0626, B:568:0x0629, B:570:0x0655, B:572:0x065f, B:576:0x0674, B:581:0x0680, B:584:0x0689, B:588:0x0696, B:592:0x06a4, B:596:0x06b2, B:600:0x06c0, B:604:0x06ce, B:608:0x06d9, B:612:0x06e6, B:613:0x06f2, B:615:0x06f8, B:616:0x06fb, B:618:0x071e, B:621:0x0727, B:624:0x0730, B:625:0x074a, B:627:0x0750, B:629:0x0764, B:631:0x0770, B:633:0x077d, B:636:0x0796, B:637:0x07a6, B:641:0x07af, B:642:0x07b2, B:644:0x07bf, B:645:0x07c4, B:647:0x07e2, B:649:0x07e6, B:651:0x07f6, B:653:0x0801, B:654:0x080a, B:656:0x0814, B:658:0x0820, B:660:0x082a, B:662:0x0830, B:664:0x083f, B:666:0x0855, B:668:0x085b, B:669:0x0864, B:671:0x0872, B:673:0x08ae, B:675:0x08b8, B:676:0x08bb, B:678:0x08c5, B:680:0x08e1, B:681:0x08ec, B:683:0x0924, B:685:0x092c, B:687:0x0936, B:688:0x0943, B:690:0x094d, B:691:0x095a, B:692:0x0963, B:694:0x0969, B:696:0x09a5, B:698:0x09af, B:700:0x09c1, B:702:0x09c7, B:703:0x0a0c, B:704:0x0a17, B:705:0x0a22, B:707:0x0a28, B:716:0x0a75, B:717:0x0ac0, B:719:0x0ad1, B:733:0x0b32, B:724:0x0ae9, B:725:0x0aec, B:710:0x0a35, B:712:0x0a61, B:730:0x0b05, B:731:0x0b1c, B:732:0x0b1d, B:619:0x0721, B:549:0x05a2, B:536:0x04e3, B:484:0x0306, B:485:0x030d, B:487:0x0313, B:489:0x031f, B:446:0x0191, B:448:0x019d, B:450:0x01b2, B:456:0x01d2, B:461:0x0208, B:463:0x020e, B:465:0x021c, B:467:0x022a, B:470:0x0236, B:478:0x02bb, B:480:0x02c5, B:472:0x025f, B:473:0x0278, B:477:0x029e, B:476:0x028b, B:459:0x01de, B:460:0x01fc), top: B:745:0x0155, inners: #0, #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:496:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x086f  */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void m(com.google.android.gms.measurement.internal.G r45, com.google.android.gms.measurement.internal.B6 r46) {
        /*
            Method dump skipped, instruction units count: 2923
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q6.m(com.google.android.gms.measurement.internal.G, com.google.android.gms.measurement.internal.B6):void");
    }

    final void m0(C3826i c3826i, B6 b62) {
        AbstractC2115p.l(c3826i);
        AbstractC2115p.f(c3826i.f41351a);
        AbstractC2115p.l(c3826i.f41353c);
        AbstractC2115p.f(c3826i.f41353c.f41669b);
        b().h();
        O0();
        if (X(b62)) {
            if (!b62.f40653h) {
                o0(b62);
                return;
            }
            F0().r0();
            try {
                o0(b62);
                String str = (String) AbstractC2115p.l(c3826i.f41351a);
                C3826i c3826iF0 = F0().F0(str, c3826i.f41353c.f41669b);
                if (c3826iF0 != null) {
                    a().v().c("Removing conditional user property", c3826i.f41351a, this.f41549l.D().c(c3826i.f41353c.f41669b));
                    F0().G0(str, c3826i.f41353c.f41669b);
                    if (c3826iF0.f41355e) {
                        F0().z0(str, c3826i.f41353c.f41669b);
                    }
                    G g10 = c3826i.f41361k;
                    if (g10 != null) {
                        E e10 = g10.f40765b;
                        m((G) AbstractC2115p.l(N0().R(str, ((G) AbstractC2115p.l(g10)).f40764a, e10 != null ? e10.l() : null, c3826iF0.f41352b, g10.f40767d, true, true)), b62);
                    }
                } else {
                    a().r().c("Conditional user property doesn't exist", C3887q2.x(c3826i.f41351a), this.f41549l.D().c(c3826i.f41353c.f41669b));
                }
                F0().s0();
                F0().t0();
            } catch (Throwable th2) {
                F0().t0();
                throw th2;
            }
        }
    }

    final void n(C3928w2 c3928w2, C3440d3 c3440d3) {
        C3601v3 c3601v3;
        b().h();
        O0();
        C3870o c3870oD = C3870o.d(c3440d3.W());
        String strO0 = c3928w2.o0();
        b().h();
        O0();
        E3 e3G = g(strO0);
        j9.u uVar = j9.u.UNINITIALIZED;
        int iOrdinal = e3G.p().ordinal();
        if (iOrdinal == 1) {
            c3870oD.c(j9.v.AD_STORAGE, EnumC3863n.REMOTE_ENFORCED_DEFAULT);
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            c3870oD.b(j9.v.AD_STORAGE, e3G.b());
        } else {
            c3870oD.c(j9.v.AD_STORAGE, EnumC3863n.FAILSAFE);
        }
        int iOrdinal2 = e3G.q().ordinal();
        if (iOrdinal2 == 1) {
            c3870oD.c(j9.v.ANALYTICS_STORAGE, EnumC3863n.REMOTE_ENFORCED_DEFAULT);
        } else if (iOrdinal2 == 2 || iOrdinal2 == 3) {
            c3870oD.b(j9.v.ANALYTICS_STORAGE, e3G.b());
        } else {
            c3870oD.c(j9.v.ANALYTICS_STORAGE, EnumC3863n.FAILSAFE);
        }
        String strO02 = c3928w2.o0();
        b().h();
        O0();
        C3939y c3939yT0 = T0(strO02, R0(strO02), g(strO02), c3870oD);
        c3440d3.Z(((Boolean) AbstractC2115p.l(c3939yT0.j())).booleanValue());
        if (!TextUtils.isEmpty(c3939yT0.k())) {
            c3440d3.b0(c3939yT0.k());
        }
        b().h();
        O0();
        Iterator it = c3440d3.X0().iterator();
        while (true) {
            if (it.hasNext()) {
                c3601v3 = (C3601v3) it.next();
                if ("_npa".equals(c3601v3.E())) {
                    break;
                }
            } else {
                c3601v3 = null;
                break;
            }
        }
        if (c3601v3 != null) {
            j9.v vVar = j9.v.AD_PERSONALIZATION;
            if (c3870oD.a(vVar) == EnumC3863n.UNSET) {
                x6 x6VarB0 = F0().B0(c3928w2.o0(), "_npa");
                if (x6VarB0 != null) {
                    String str = x6VarB0.f41774b;
                    if ("tcf".equals(str)) {
                        c3870oD.c(vVar, EnumC3863n.TCF);
                    } else if ("app".equals(str)) {
                        c3870oD.c(vVar, EnumC3863n.API);
                    } else {
                        c3870oD.c(vVar, EnumC3863n.MANIFEST);
                    }
                } else {
                    Boolean boolR = c3928w2.R();
                    if (boolR == null || ((boolR.booleanValue() && c3601v3.I() != 1) || !(boolR.booleanValue() || c3601v3.I() == 0))) {
                        c3870oD.c(vVar, EnumC3863n.API);
                    } else {
                        c3870oD.c(vVar, EnumC3863n.MANIFEST);
                    }
                }
            }
        } else {
            int I10 = I(c3928w2.o0(), c3870oD);
            C3592u3 c3592u3N = C3601v3.N();
            c3592u3N.u("_npa");
            c3592u3N.t(e().a());
            c3592u3N.y(I10);
            c3440d3.b1((C3601v3) c3592u3N.q());
            a().w().c("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(I10));
        }
        c3440d3.X(c3870oD.toString());
        boolean zS = this.f41538a.S(c3928w2.o0());
        List listO0 = c3440d3.O0();
        int i10 = 0;
        for (int i11 = 0; i11 < listO0.size(); i11++) {
            if ("_tcf".equals(((com.google.android.gms.internal.measurement.S2) listO0.get(i11)).F())) {
                com.google.android.gms.internal.measurement.R2 r22 = (com.google.android.gms.internal.measurement.R2) ((com.google.android.gms.internal.measurement.S2) listO0.get(i11)).p();
                List listT = r22.t();
                int i12 = 0;
                while (true) {
                    if (i12 >= listT.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((com.google.android.gms.internal.measurement.W2) listT.get(i12)).D())) {
                        String strF = ((com.google.android.gms.internal.measurement.W2) listT.get(i12)).F();
                        if (zS && strF.length() > 4) {
                            char[] charArray = strF.toCharArray();
                            int i13 = 1;
                            while (true) {
                                if (i13 >= 64) {
                                    break;
                                }
                                if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i13)) {
                                    i10 = i13;
                                    break;
                                }
                                i13++;
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10 | 1);
                            strF = String.valueOf(charArray);
                        }
                        com.google.android.gms.internal.measurement.V2 v2O = com.google.android.gms.internal.measurement.W2.O();
                        v2O.u("_tcfd");
                        v2O.x(strF);
                        r22.y(i12, v2O);
                    } else {
                        i12++;
                    }
                }
                c3440d3.S0(i11, r22);
                return;
            }
        }
    }

    final void n0(B6 b62, long j10) {
        C3928w2 c3928w2J0 = F0().J0((String) AbstractC2115p.l(b62.f40646a));
        if (c3928w2J0 != null && N0().p(b62.f40647b, c3928w2J0.r0())) {
            a().r().b("New GMP App Id passed in. Removing cached database data. appId", C3887q2.x(c3928w2J0.o0()));
            C3911u c3911uF0 = F0();
            String strO0 = c3928w2J0.o0();
            c3911uF0.j();
            c3911uF0.h();
            AbstractC2115p.f(strO0);
            try {
                SQLiteDatabase sQLiteDatabaseU0 = c3911uF0.u0();
                String[] strArr = {strO0};
                int iDelete = sQLiteDatabaseU0.delete("events", "app_id=?", strArr) + sQLiteDatabaseU0.delete("user_attributes", "app_id=?", strArr) + sQLiteDatabaseU0.delete("conditional_properties", "app_id=?", strArr) + sQLiteDatabaseU0.delete("apps", "app_id=?", strArr) + sQLiteDatabaseU0.delete("raw_events", "app_id=?", strArr) + sQLiteDatabaseU0.delete("raw_events_metadata", "app_id=?", strArr) + sQLiteDatabaseU0.delete("event_filters", "app_id=?", strArr) + sQLiteDatabaseU0.delete("property_filters", "app_id=?", strArr) + sQLiteDatabaseU0.delete("audience_filter_values", "app_id=?", strArr) + sQLiteDatabaseU0.delete("consent_settings", "app_id=?", strArr) + sQLiteDatabaseU0.delete("default_event_params", "app_id=?", strArr) + sQLiteDatabaseU0.delete("trigger_uris", "app_id=?", strArr);
                com.google.android.gms.internal.measurement.H6.a();
                X2 x22 = c3911uF0.f40611a;
                if (x22.w().H(null, AbstractC3789d2.f41219i1)) {
                    iDelete += sQLiteDatabaseU0.delete("no_data_mode_events", "app_id=?", strArr);
                }
                if (iDelete > 0) {
                    x22.a().w().c("Deleted application data. app, records", strO0, Integer.valueOf(iDelete));
                }
            } catch (SQLiteException e10) {
                c3911uF0.f40611a.a().o().c("Error deleting application data. appId, error", C3887q2.x(strO0), e10);
            }
            c3928w2J0 = null;
        }
        if (c3928w2J0 != null) {
            boolean z10 = (c3928w2J0.F0() == -2147483648L || c3928w2J0.F0() == b62.f40655j) ? false : true;
            String strD0 = c3928w2J0.D0();
            if (z10 || ((c3928w2J0.F0() != -2147483648L || strD0 == null || strD0.equals(b62.f40648c)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", strD0);
                G g10 = new G("_au", new E(bundle), "auto", j10);
                if (B0().H(null, AbstractC3789d2.f41204d1)) {
                    j(g10, b62);
                } else {
                    k(g10, b62);
                }
            }
        }
    }

    final void o(C3928w2 c3928w2, C3440d3 c3440d3) {
        b().h();
        O0();
        C3609w2 c3609w2C0 = com.google.android.gms.internal.measurement.A2.c0();
        byte[] bArrK = c3928w2.K();
        if (bArrK != null) {
            try {
                c3609w2C0 = (C3609w2) u6.W(c3609w2C0, bArrK);
            } catch (C3523m5 unused) {
                a().r().b("Failed to parse locally stored ad campaign info. appId", C3887q2.x(c3928w2.o0()));
            }
        }
        for (com.google.android.gms.internal.measurement.S2 s22 : c3440d3.O0()) {
            if (s22.F().equals("_cmp")) {
                String str = (String) u6.v(s22, "gclid", "");
                String str2 = (String) u6.v(s22, "gbraid", "");
                String str3 = (String) u6.v(s22, "gad_source", "");
                String[] strArrSplit = ((String) AbstractC3789d2.f41216h1.b(null)).split(com.amazon.a.a.o.b.f.f34694a);
                K0();
                if (!u6.s(s22, strArrSplit).isEmpty()) {
                    long jLongValue = ((Long) u6.v(s22, "click_timestamp", 0L)).longValue();
                    if (jLongValue <= 0) {
                        jLongValue = s22.H();
                    }
                    if ("referrer API v2".equals(u6.u(s22, "_cis"))) {
                        if (jLongValue > c3609w2C0.J()) {
                            if (str.isEmpty()) {
                                c3609w2C0.E();
                            } else {
                                c3609w2C0.D(str);
                            }
                            if (str2.isEmpty()) {
                                c3609w2C0.G();
                            } else {
                                c3609w2C0.F(str2);
                            }
                            if (str3.isEmpty()) {
                                c3609w2C0.I();
                            } else {
                                c3609w2C0.H(str3);
                            }
                            c3609w2C0.K(jLongValue);
                            c3609w2C0.N();
                            c3609w2C0.O(J(s22));
                        }
                    } else if (jLongValue > c3609w2C0.B()) {
                        if (str.isEmpty()) {
                            c3609w2C0.u();
                        } else {
                            c3609w2C0.t(str);
                        }
                        if (str2.isEmpty()) {
                            c3609w2C0.x();
                        } else {
                            c3609w2C0.v(str2);
                        }
                        if (str3.isEmpty()) {
                            c3609w2C0.A();
                        } else {
                            c3609w2C0.y(str3);
                        }
                        c3609w2C0.C(jLongValue);
                        c3609w2C0.L();
                        c3609w2C0.M(J(s22));
                    }
                }
            }
        }
        if (!((com.google.android.gms.internal.measurement.A2) c3609w2C0.q()).equals(com.google.android.gms.internal.measurement.A2.d0())) {
            c3440d3.i0((com.google.android.gms.internal.measurement.A2) c3609w2C0.q());
        }
        c3928w2.J(((com.google.android.gms.internal.measurement.A2) c3609w2C0.q()).b());
        if (c3928w2.A()) {
            F0().K0(c3928w2, false, false);
        }
        if (B0().H(null, AbstractC3789d2.f41213g1)) {
            F0().z0(c3928w2.o0(), "_lgclid");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final com.google.android.gms.measurement.internal.C3928w2 o0(com.google.android.gms.measurement.internal.B6 r13) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q6.o0(com.google.android.gms.measurement.internal.B6):com.google.android.gms.measurement.internal.w2");
    }

    final String p(E3 e32) {
        if (!e32.o(j9.v.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        N0().q0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    final String p0(B6 b62) {
        try {
            return (String) b().r(new CallableC3833i6(this, b62)).get(HTTPTimeoutManager.DEFAULT_TIMEOUT_MS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            a().o().c("Failed to get app instance id. appId", C3887q2.x(b62.f40646a), e10);
            return null;
        }
    }

    final void q(List list) {
        AbstractC2115p.a(!list.isEmpty());
        if (this.f41562y != null) {
            a().o().a("Set uploading progress before finishing the previous upload");
        } else {
            this.f41562y = new ArrayList(list);
        }
    }

    final List q0(B6 b62, Bundle bundle) {
        b().h();
        C3498j7.a();
        C3856m c3856mB0 = B0();
        String str = b62.f40646a;
        if (!c3856mB0.H(str, AbstractC3789d2.f41174Q0) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    a().o().a("Uri sources and timestamps do not match");
                } else {
                    for (int i10 = 0; i10 < intArray.length; i10++) {
                        C3911u c3911uF0 = F0();
                        int i11 = intArray[i10];
                        long j10 = longArray[i10];
                        AbstractC2115p.f(str);
                        c3911uF0.h();
                        c3911uF0.j();
                        try {
                            int iDelete = c3911uF0.u0().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i11), String.valueOf(j10)});
                            C3873o2 c3873o2W = c3911uF0.f40611a.a().w();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(iDelete).length() + 46);
                            sb2.append("Pruned ");
                            sb2.append(iDelete);
                            sb2.append(" trigger URIs. appId, source, timestamp");
                            c3873o2W.d(sb2.toString(), str, Integer.valueOf(i11), Long.valueOf(j10));
                        } catch (SQLiteException e10) {
                            c3911uF0.f40611a.a().o().c("Error pruning trigger URIs. appId", C3887q2.x(str), e10);
                        }
                    }
                }
            }
        }
        C3911u c3911uF02 = F0();
        String str2 = b62.f40646a;
        AbstractC2115p.f(str2);
        c3911uF02.h();
        c3911uF02.j();
        List arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = c3911uF02.u0().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new S5(string, cursorQuery.getLong(1), cursorQuery.getInt(2)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e11) {
                c3911uF02.f40611a.a().o().c("Error querying trigger uris. appId", C3887q2.x(str2), e11);
                arrayList = Collections.EMPTY_LIST;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return arrayList;
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.measurement.internal.q6] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.database.Cursor] */
    final void r() {
        SQLiteException e10;
        C3928w2 c3928w2J0;
        b().h();
        O0();
        this.f41559v = true;
        try {
            X2 x22 = this.f41549l;
            x22.c();
            Boolean boolX = x22.J().x();
            if (boolX == null) {
                a().r().a("Upload data called on the client side before use of service was decided");
            } else if (boolX.booleanValue()) {
                a().o().a("Upload called in the client side when service should be used");
            } else if (this.f41552o > 0) {
                R();
            } else {
                b().h();
                if (this.f41562y != null) {
                    a().w().a("Uploading requested multiple times");
                } else if (E0().m()) {
                    ?? A10 = e().a();
                    ?? r72 = 0;
                    cursorRawQuery = null;
                    Cursor cursorRawQuery = null;
                    string = null;
                    string = null;
                    String string = null;
                    int iE = B0().E(null, AbstractC3789d2.f41221j0);
                    B0();
                    long jN = A10 - C3856m.n();
                    for (int i10 = 0; i10 < iE && M(null, jN); i10++) {
                    }
                    C3498j7.a();
                    b().h();
                    v0();
                    long jA = this.f41546i.f41795h.a();
                    if (jA != 0) {
                        a().v().b("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(A10 - jA)));
                    }
                    String strR = F0().r();
                    long j10 = -1;
                    if (TextUtils.isEmpty(strR)) {
                        try {
                            this.f41528A = -1L;
                            C3911u c3911uF0 = F0();
                            B0();
                            long jN2 = A10 - C3856m.n();
                            c3911uF0.h();
                            c3911uF0.j();
                            try {
                                A10 = c3911uF0.u0().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(jN2)});
                            } catch (SQLiteException e11) {
                                e10 = e11;
                                A10 = 0;
                            } catch (Throwable th2) {
                                th = th2;
                                if (r72 == 0) {
                                    throw th;
                                }
                                throw th;
                            }
                            try {
                                if (A10.moveToFirst()) {
                                    string = A10.getString(0);
                                } else {
                                    c3911uF0.f40611a.a().w().a("No expired configs for apps with pending events");
                                }
                            } catch (SQLiteException e12) {
                                e10 = e12;
                                A10 = A10;
                                c3911uF0.f40611a.a().o().b("Error selecting expired configs", e10);
                                if (A10 != 0) {
                                }
                                if (!TextUtils.isEmpty(string)) {
                                    B(c3928w2J0);
                                }
                                this.f41559v = false;
                                S();
                            }
                            A10.close();
                            if (!TextUtils.isEmpty(string) && (c3928w2J0 = F0().J0(string)) != null) {
                                B(c3928w2J0);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            r72 = A10;
                        }
                    } else {
                        if (this.f41528A == -1) {
                            C3911u c3911uF02 = F0();
                            try {
                                try {
                                    cursorRawQuery = c3911uF02.u0().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                    if (cursorRawQuery.moveToFirst()) {
                                        j10 = cursorRawQuery.getLong(0);
                                    }
                                } catch (SQLiteException e13) {
                                    c3911uF02.f40611a.a().o().b("Error querying raw events", e13);
                                    if (cursorRawQuery != null) {
                                    }
                                    this.f41528A = j10;
                                    s(strR, A10);
                                    this.f41559v = false;
                                    S();
                                }
                                cursorRawQuery.close();
                                this.f41528A = j10;
                            } finally {
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                            }
                        }
                        s(strR, A10);
                    }
                } else {
                    a().w().a("Network not connected, ignoring upload request");
                    R();
                }
            }
            this.f41559v = false;
            S();
        } catch (Throwable th4) {
            this.f41559v = false;
            S();
            throw th4;
        }
    }

    final void r0(String str, C3810g c3810g) {
        b().h();
        O0();
        C3911u c3911uF0 = F0();
        long j10 = c3810g.f41301a;
        t6 t6VarN = c3911uF0.n(j10);
        if (t6VarN == null) {
            a().r().c("[sgtm] Queued batch doesn't exist. appId, rowId", str, Long.valueOf(j10));
            return;
        }
        String strE = t6VarN.e();
        if (c3810g.f41302b != j9.F.SUCCESS.zza()) {
            if (c3810g.f41302b == j9.F.BACKOFF.zza()) {
                Map map = this.f41532E;
                o6 o6Var = (o6) map.get(strE);
                if (o6Var == null) {
                    o6Var = new o6(this);
                    map.put(strE, o6Var);
                } else {
                    o6Var.a();
                }
                a().w().d("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str, strE, Long.valueOf((o6Var.c() - e().a()) / 1000));
            }
            C3911u c3911uF02 = F0();
            Long lValueOf = Long.valueOf(c3810g.f41301a);
            c3911uF02.w(lValueOf);
            a().w().c("[sgtm] increased batch retry count after failed client upload. appId, rowId", str, lValueOf);
            return;
        }
        Map map2 = this.f41532E;
        if (map2.containsKey(strE)) {
            map2.remove(strE);
        }
        C3911u c3911uF03 = F0();
        Long lValueOf2 = Long.valueOf(j10);
        c3911uF03.q(lValueOf2);
        a().w().c("[sgtm] queued batch deleted after successful client upload. appId, rowId", str, lValueOf2);
        long j11 = c3810g.f41303c;
        if (j11 > 0) {
            C3911u c3911uF04 = F0();
            c3911uF04.h();
            c3911uF04.j();
            Long lValueOf3 = Long.valueOf(j11);
            AbstractC2115p.l(lValueOf3);
            ContentValues contentValues = new ContentValues();
            contentValues.put("upload_type", Integer.valueOf(j9.G.GOOGLE_SIGNAL.zza()));
            X2 x22 = c3911uF04.f40611a;
            contentValues.put("creation_timestamp", Long.valueOf(x22.e().a()));
            try {
                if (c3911uF04.u0().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j11), str, String.valueOf(j9.G.GOOGLE_SIGNAL_PENDING.zza())}) != 1) {
                    x22.a().r().c("Google Signal pending batch not updated. appId, rowId", str, lValueOf3);
                }
                a().w().c("[sgtm] queued Google Signal batch updated. appId, signalRowId", str, Long.valueOf(c3810g.f41303c));
                u(str);
            } catch (SQLiteException e10) {
                c3911uF04.f40611a.a().o().d("Failed to update google Signal pending batch. appid, rowId", str, Long.valueOf(j11), e10);
                throw e10;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:494:0x006b A[PHI: r0 r10 r23
  0x006b: PHI (r0v117 java.util.List) = (r0v8 java.util.List), (r0v141 java.util.List) binds: [B:585:0x022a, B:493:0x0069] A[DONT_GENERATE, DONT_INLINE]
  0x006b: PHI (r10v57 android.database.Cursor) = (r10v5 android.database.Cursor), (r10v59 android.database.Cursor) binds: [B:585:0x022a, B:493:0x0069] A[DONT_GENERATE, DONT_INLINE]
  0x006b: PHI (r23v28 long) = (r23v2 long), (r23v29 long) binds: [B:585:0x022a, B:493:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x045e A[PHI: r10 r16 r23
  0x045e: PHI (r10v39 java.util.List) = (r10v53 java.util.List), (r10v38 java.util.List) binds: [B:661:0x0484, B:653:0x045c] A[DONT_GENERATE, DONT_INLINE]
  0x045e: PHI (r16v7 java.util.List) = (r16v12 java.util.List), (r16v13 java.util.List) binds: [B:661:0x0484, B:653:0x045c] A[DONT_GENERATE, DONT_INLINE]
  0x045e: PHI (r23v12 android.database.Cursor) = (r23v18 android.database.Cursor), (r23v22 android.database.Cursor) binds: [B:661:0x0484, B:653:0x045c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:666:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:699:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:853:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:861:0x0a05  */
    /* JADX WARN: Removed duplicated region for block: B:952:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:953:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void s(java.lang.String r33, long r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q6.s(java.lang.String, long):void");
    }

    final void s0(boolean z10) {
        R();
    }

    final boolean t(String str, String str2) {
        C3928w2 c3928w2J0 = F0().J0(str);
        if (c3928w2J0 != null && N0().P(str, c3928w2J0.l0())) {
            this.f41532E.remove(str2);
            return true;
        }
        o6 o6Var = (o6) this.f41532E.get(str2);
        if (o6Var == null) {
            return true;
        }
        return o6Var.b();
    }

    public final void t0(String str, E4 e42) {
        b().h();
        String str2 = this.f41534G;
        if (str2 == null || str2.equals(str) || e42 != null) {
            this.f41534G = str;
            this.f41533F = e42;
        }
    }

    final void u(String str) {
        C3431c3 c3431c3D;
        b().h();
        O0();
        this.f41559v = true;
        try {
            X2 x22 = this.f41549l;
            x22.c();
            Boolean boolX = x22.J().x();
            if (boolX == null) {
                a().r().a("Upload data called on the client side before use of service was decided");
            } else if (boolX.booleanValue()) {
                a().o().a("Upload called in the client side when service should be used");
            } else if (this.f41552o > 0) {
                R();
            } else if (!E0().m()) {
                a().w().a("Network not connected, ignoring upload request");
                R();
            } else if (F0().p(str)) {
                C3911u c3911uF0 = F0();
                AbstractC2115p.f(str);
                c3911uF0.h();
                c3911uF0.j();
                List listO = c3911uF0.o(str, j9.J.c(j9.G.GOOGLE_SIGNAL), 1);
                t6 t6Var = listO.isEmpty() ? null : (t6) listO.get(0);
                if (t6Var != null && (c3431c3D = t6Var.d()) != null) {
                    a().w().d("[sgtm] Uploading data from upload queue. appId, type, url", str, t6Var.f(), t6Var.e());
                    byte[] bArrB = c3431c3D.b();
                    if (Log.isLoggable(a().z(), 2)) {
                        a().w().d("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(bArrB.length), K0().K(c3431c3D));
                    }
                    C3785c6 c3785c6A = t6Var.a();
                    this.f41558u = true;
                    E0().n(str, c3785c6A, c3431c3D, new C3817g6(this, str, t6Var));
                }
            } else {
                a().w().b("[sgtm] Upload queue has no batches for appId", str);
            }
            this.f41559v = false;
            S();
        } catch (Throwable th2) {
            this.f41559v = false;
            S();
            throw th2;
        }
    }

    final /* synthetic */ void u0(r6 r6Var) {
        b().h();
        this.f41548k = new H2(this);
        C3911u c3911u = new C3911u(this);
        c3911u.k();
        this.f41540c = c3911u;
        B0().t((InterfaceC3849l) AbstractC2115p.l(this.f41538a));
        C3945y5 c3945y5 = new C3945y5(this);
        c3945y5.k();
        this.f41546i = c3945y5;
        C3794e c3794e = new C3794e(this);
        c3794e.k();
        this.f41543f = c3794e;
        C4 c42 = new C4(this);
        c42.k();
        this.f41545h = c42;
        V5 v52 = new V5(this);
        v52.k();
        this.f41542e = v52;
        this.f41541d = new C3942y2(this);
        if (this.f41555r != this.f41556s) {
            a().o().c("Not all upload components initialized", Integer.valueOf(this.f41555r), Integer.valueOf(this.f41556s));
        }
        this.f41550m.set(true);
        a().w().a("UploadController is now fully initialized");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x001e A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:32:0x000d, B:47:0x005a, B:50:0x0080, B:41:0x001e, B:43:0x0048, B:45:0x0052, B:46:0x0056), top: B:55:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void v(java.lang.String r4, int r5, java.lang.Throwable r6, byte[] r7, com.google.android.gms.measurement.internal.t6 r8) {
        /*
            r3 = this;
            com.google.android.gms.measurement.internal.T2 r0 = r3.b()
            r0.h()
            r3.O0()
            r0 = 0
            if (r7 != 0) goto L13
            byte[] r7 = new byte[r0]     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r4 = move-exception
            goto L9b
        L13:
            r1 = 200(0xc8, float:2.8E-43)
            if (r5 == r1) goto L1c
            r1 = 204(0xcc, float:2.86E-43)
            if (r5 != r1) goto L5a
            r5 = r1
        L1c:
            if (r6 != 0) goto L5a
            com.google.android.gms.measurement.internal.u r6 = r3.F0()     // Catch: java.lang.Throwable -> L10
            long r7 = r8.c()     // Catch: java.lang.Throwable -> L10
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L10
            r6.q(r7)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.q2 r6 = r3.a()     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.o2 r6 = r6.w()     // Catch: java.lang.Throwable -> L10
            java.lang.String r7 = "Successfully uploaded batch from upload queue. appId, status"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            r6.c(r7, r4, r5)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.v2 r5 = r3.E0()     // Catch: java.lang.Throwable -> L10
            boolean r5 = r5.m()     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L56
            com.google.android.gms.measurement.internal.u r5 = r3.F0()     // Catch: java.lang.Throwable -> L10
            boolean r5 = r5.p(r4)     // Catch: java.lang.Throwable -> L10
            if (r5 == 0) goto L56
            r3.u(r4)     // Catch: java.lang.Throwable -> L10
            goto L95
        L56:
            r3.R()     // Catch: java.lang.Throwable -> L10
            goto L95
        L5a:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L10
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L10
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L10
            int r7 = r1.length()     // Catch: java.lang.Throwable -> L10
            r2 = 32
            int r7 = java.lang.Math.min(r2, r7)     // Catch: java.lang.Throwable -> L10
            java.lang.String r7 = r1.substring(r0, r7)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.q2 r1 = r3.a()     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.o2 r1 = r1.t()     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = "Network upload failed. Will retry later. appId, status, error"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            if (r6 != 0) goto L80
            r6 = r7
        L80:
            r1.d(r2, r4, r5, r6)     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.measurement.internal.u r4 = r3.F0()     // Catch: java.lang.Throwable -> L10
            long r5 = r8.c()     // Catch: java.lang.Throwable -> L10
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L10
            r4.w(r5)     // Catch: java.lang.Throwable -> L10
            r3.R()     // Catch: java.lang.Throwable -> L10
        L95:
            r3.f41558u = r0
            r3.S()
            return
        L9b:
            r3.f41558u = r0
            r3.S()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.q6.v(java.lang.String, int, java.lang.Throwable, byte[], com.google.android.gms.measurement.internal.t6):void");
    }

    final void w(String str, boolean z10, Long l10, Long l11) {
        C3928w2 c3928w2J0 = F0().J0(str);
        if (c3928w2J0 != null) {
            c3928w2J0.e0(z10);
            c3928w2J0.g0(l10);
            c3928w2J0.i0(l11);
            if (c3928w2J0.A()) {
                F0().K0(c3928w2J0, false, false);
            }
        }
    }

    final void x(String str, C3440d3 c3440d3) {
        int iX;
        int iIndexOf;
        Set setF = D0().F(str);
        if (setF != null) {
            c3440d3.K0(setF);
        }
        if (D0().J(str)) {
            c3440d3.B();
        }
        if (D0().K(str)) {
            String strX = c3440d3.x();
            if (!TextUtils.isEmpty(strX) && (iIndexOf = strX.indexOf(".")) != -1) {
                c3440d3.y(strX.substring(0, iIndexOf));
            }
        }
        if (D0().L(str) && (iX = u6.X(c3440d3, "_id")) != -1) {
            c3440d3.e1(iX);
        }
        if (D0().M(str)) {
            c3440d3.A0();
        }
        if (D0().N(str)) {
            c3440d3.S();
            if (g(str).o(j9.v.ANALYTICS_STORAGE)) {
                Map map = this.f41531D;
                n6 n6Var = (n6) map.get(str);
                if (n6Var == null || n6Var.f41468b + B0().D(str, AbstractC3789d2.f41227l0) < e().c()) {
                    n6Var = new n6(this, (byte[]) null);
                    map.put(str, n6Var);
                }
                c3440d3.L0(n6Var.f41467a);
            }
        }
        if (D0().O(str)) {
            c3440d3.J0();
        }
    }

    final /* synthetic */ X2 x0() {
        return this.f41549l;
    }

    final void y(C3440d3 c3440d3, m6 m6Var) {
        for (int i10 = 0; i10 < c3440d3.P0(); i10++) {
            com.google.android.gms.internal.measurement.R2 r22 = (com.google.android.gms.internal.measurement.R2) c3440d3.Q0(i10).p();
            Iterator it = r22.t().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((com.google.android.gms.internal.measurement.W2) it.next()).D())) {
                    if (m6Var.f41436a.V0() >= B0().E(m6Var.f41436a.C(), AbstractC3789d2.f41230m0)) {
                        int iE = B0().E(m6Var.f41436a.C(), AbstractC3789d2.f41256z0);
                        String strL0 = null;
                        if (iE <= 0) {
                            if (B0().H(m6Var.f41436a.C(), AbstractC3789d2.f41178S0)) {
                                strL0 = N0().l0();
                                com.google.android.gms.internal.measurement.V2 v2O = com.google.android.gms.internal.measurement.W2.O();
                                v2O.u("_tu");
                                v2O.x(strL0);
                                r22.A((com.google.android.gms.internal.measurement.W2) v2O.q());
                            }
                            com.google.android.gms.internal.measurement.V2 v2O2 = com.google.android.gms.internal.measurement.W2.O();
                            v2O2.u("_tr");
                            v2O2.A(1L);
                            r22.A((com.google.android.gms.internal.measurement.W2) v2O2.q());
                            S5 s5I = K0().I(m6Var.f41436a.C(), c3440d3, r22, strL0);
                            if (s5I != null) {
                                a().w().c("Generated trigger URI. appId, uri", m6Var.f41436a.C(), s5I.f40962a);
                                F0().K(m6Var.f41436a.C(), s5I);
                                Deque deque = this.f41554q;
                                if (!deque.contains(m6Var.f41436a.C())) {
                                    deque.add(m6Var.f41436a.C());
                                }
                            }
                        } else if (F0().L0(h(), m6Var.f41436a.C(), false, false, false, false, false, false, true).f41505g > iE) {
                            com.google.android.gms.internal.measurement.V2 v2O3 = com.google.android.gms.internal.measurement.W2.O();
                            v2O3.u("_tnr");
                            v2O3.A(1L);
                            r22.A((com.google.android.gms.internal.measurement.W2) v2O3.q());
                        } else {
                            if (B0().H(m6Var.f41436a.C(), AbstractC3789d2.f41178S0)) {
                                strL0 = N0().l0();
                                com.google.android.gms.internal.measurement.V2 v2O4 = com.google.android.gms.internal.measurement.W2.O();
                                v2O4.u("_tu");
                                v2O4.x(strL0);
                                r22.A((com.google.android.gms.internal.measurement.W2) v2O4.q());
                            }
                            com.google.android.gms.internal.measurement.V2 v2O5 = com.google.android.gms.internal.measurement.W2.O();
                            v2O5.u("_tr");
                            v2O5.A(1L);
                            r22.A((com.google.android.gms.internal.measurement.W2) v2O5.q());
                            S5 s5I2 = K0().I(m6Var.f41436a.C(), c3440d3, r22, strL0);
                            if (s5I2 != null) {
                                a().w().c("Generated trigger URI. appId, uri", m6Var.f41436a.C(), s5I2.f40962a);
                                F0().K(m6Var.f41436a.C(), s5I2);
                                Deque deque2 = this.f41554q;
                                if (!deque2.contains(m6Var.f41436a.C())) {
                                    deque2.add(m6Var.f41436a.C());
                                }
                            }
                        }
                    }
                    c3440d3.R0(i10, (com.google.android.gms.internal.measurement.S2) r22.q());
                }
            }
        }
    }

    final /* synthetic */ Deque y0() {
        return this.f41554q;
    }

    final void z(String str, com.google.android.gms.internal.measurement.V2 v22, Bundle bundle, String str2) {
        List listB = com.google.android.gms.common.util.e.b("_o", "_sn", "_sc", "_si");
        long jY = (z6.N(v22.t()) || z6.N(str)) ? B0().y(str2, true) : B0().x(str2, true);
        long jCodePointCount = v22.v().codePointCount(0, v22.v().length());
        z6 z6VarN0 = N0();
        String strT = v22.t();
        B0();
        String strQ = z6VarN0.q(strT, 40, true);
        if (jCodePointCount <= jY || listB.contains(v22.t())) {
            return;
        }
        if ("_ev".equals(v22.t())) {
            bundle.putString("_ev", N0().q(v22.v(), B0().y(str2, true), true));
            return;
        }
        a().t().c("Param value is too long; discarded. Name, value length", strQ, Long.valueOf(jCodePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", strQ);
                bundle.putLong("_el", jCodePointCount);
            }
        }
        bundle.remove(v22.t());
    }

    final /* synthetic */ void z0(long j10) {
        this.f41536I = j10;
    }
}
