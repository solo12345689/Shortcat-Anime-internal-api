package io.sentry.android.core.internal.threaddump;

import io.sentry.C5220j3;
import io.sentry.C5322z3;
import io.sentry.D3;
import io.sentry.EnumC5215i3;
import io.sentry.android.core.internal.util.u;
import io.sentry.protocol.B;
import io.sentry.protocol.C;
import io.sentry.protocol.D;
import io.sentry.protocol.DebugImage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
public class c {

    /* JADX INFO: renamed from: f */
    private static final Pattern f49800f = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");

    /* JADX INFO: renamed from: g */
    private static final Pattern f49801g = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");

    /* JADX INFO: renamed from: h */
    private static final Pattern f49802h = Pattern.compile(" *(?:native: )?#(\\d+) \\S+ ([0-9a-fA-F]+)\\s+((.*?)(?:\\s+\\(deleted\\))?(?:\\s+\\(offset (.*?)\\))?)(?:\\s+\\((?:\\?\\?\\?|(.*?)(?:\\+(\\d+))?)\\))?(?:\\s+\\(BuildId: (.*?)\\))?");

    /* JADX INFO: renamed from: i */
    private static final Pattern f49803i = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");

    /* JADX INFO: renamed from: j */
    private static final Pattern f49804j = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");

    /* JADX INFO: renamed from: k */
    private static final Pattern f49805k = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: l */
    private static final Pattern f49806l = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: m */
    private static final Pattern f49807m = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: n */
    private static final Pattern f49808n = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");

    /* JADX INFO: renamed from: o */
    private static final Pattern f49809o = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");

    /* JADX INFO: renamed from: p */
    private static final Pattern f49810p = Pattern.compile(" *- waiting to lock an unknown object");

    /* JADX INFO: renamed from: q */
    private static final Pattern f49811q = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: a */
    private final C5322z3 f49812a;

    /* JADX INFO: renamed from: b */
    private final boolean f49813b;

    /* JADX INFO: renamed from: c */
    private final D3 f49814c;

    /* JADX INFO: renamed from: d */
    private final Map f49815d = new HashMap();

    /* JADX INFO: renamed from: e */
    private final List f49816e = new ArrayList();

    public c(C5322z3 c5322z3, boolean z10) {
        this.f49812a = c5322z3;
        this.f49813b = z10;
        this.f49814c = new D3(c5322z3);
    }

    private void a(D d10, C5220j3 c5220j3) {
        Map mapK = d10.k();
        if (mapK == null) {
            mapK = new HashMap();
        }
        C5220j3 c5220j32 = (C5220j3) mapK.get(c5220j3.f());
        if (c5220j32 != null) {
            c5220j32.l(Math.max(c5220j32.g(), c5220j3.g()));
        } else {
            mapK.put(c5220j3.f(), new C5220j3(c5220j3));
        }
        d10.t(mapK);
    }

    private Integer c(Matcher matcher, int i10, Integer num) {
        String strGroup = matcher.group(i10);
        return (strGroup == null || strGroup.length() == 0) ? num : Integer.valueOf(Integer.parseInt(strGroup));
    }

    private Long d(Matcher matcher, int i10, Long l10) {
        String strGroup = matcher.group(i10);
        return (strGroup == null || strGroup.length() == 0) ? l10 : Long.valueOf(Long.parseLong(strGroup));
    }

    private Integer f(Matcher matcher, int i10, Integer num) {
        String strGroup = matcher.group(i10);
        if (strGroup != null && strGroup.length() != 0) {
            int i11 = Integer.parseInt(strGroup);
            Integer numValueOf = Integer.valueOf(i11);
            if (i11 >= 0) {
                return numValueOf;
            }
        }
        return num;
    }

    private boolean g(Matcher matcher, String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    private C i(b bVar, D d10) {
        Matcher matcher;
        ArrayList arrayList = new ArrayList();
        Matcher matcher2 = f49802h.matcher("");
        Matcher matcher3 = f49803i.matcher("");
        Matcher matcher4 = f49804j.matcher("");
        Matcher matcher5 = f49805k.matcher("");
        Matcher matcher6 = f49807m.matcher("");
        Matcher matcher7 = f49806l.matcher("");
        Matcher matcher8 = f49809o.matcher("");
        Matcher matcher9 = f49808n.matcher("");
        Matcher matcher10 = f49810p.matcher("");
        Matcher matcher11 = f49811q.matcher("");
        B b10 = null;
        while (true) {
            if (!bVar.a()) {
                break;
            }
            a aVarB = bVar.b();
            if (aVarB == null) {
                this.f49812a.getLogger().c(EnumC5215i3.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                break;
            }
            String str = aVarB.f49795b;
            Matcher matcher12 = matcher11;
            if (g(matcher3, str)) {
                b10 = new B();
                String str2 = String.format("%s.%s", matcher3.group(1), matcher3.group(2));
                b10.D(str2);
                b10.y(matcher3.group(3));
                b10.x(matcher3.group(4));
                b10.B(f(matcher3, 5, null));
                b10.z(this.f49814c.b(str2));
                arrayList.add(b10);
                matcher = matcher3;
            } else if (g(matcher2, str)) {
                B b11 = new B();
                b11.F(matcher2.group(3));
                b11.y(matcher2.group(6));
                b11.B(c(matcher2, 7, null));
                b11.A("0x" + matcher2.group(2));
                b11.G("native");
                String strGroup = matcher2.group(8);
                String strA = strGroup == null ? null : u.a(strGroup);
                if (strA != null) {
                    if (this.f49815d.containsKey(strA)) {
                        matcher = matcher3;
                    } else {
                        DebugImage debugImage = new DebugImage();
                        debugImage.setDebugId(strA);
                        matcher = matcher3;
                        debugImage.setType("elf");
                        debugImage.setCodeFile(matcher2.group(4));
                        debugImage.setCodeId(strGroup);
                        this.f49815d.put(strA, debugImage);
                    }
                    b11.w("rel:" + strA);
                } else {
                    matcher = matcher3;
                }
                arrayList.add(b11);
                matcher11 = matcher12;
                b10 = null;
                matcher3 = matcher;
            } else {
                matcher = matcher3;
                if (g(matcher4, str)) {
                    b10 = new B();
                    String str3 = String.format("%s.%s", matcher4.group(1), matcher4.group(2));
                    b10.D(str3);
                    b10.y(matcher4.group(3));
                    b10.z(this.f49814c.b(str3));
                    b10.E(Boolean.TRUE);
                    arrayList.add(b10);
                } else if (g(matcher5, str)) {
                    if (b10 != null) {
                        C5220j3 c5220j3 = new C5220j3();
                        c5220j3.l(1);
                        c5220j3.h(matcher5.group(1));
                        c5220j3.j(matcher5.group(2));
                        c5220j3.i(matcher5.group(3));
                        b10.C(c5220j3);
                        a(d10, c5220j3);
                    }
                } else if (g(matcher6, str)) {
                    if (b10 != null) {
                        C5220j3 c5220j32 = new C5220j3();
                        c5220j32.l(2);
                        c5220j32.h(matcher6.group(1));
                        c5220j32.j(matcher6.group(2));
                        c5220j32.i(matcher6.group(3));
                        b10.C(c5220j32);
                        a(d10, c5220j32);
                    }
                } else if (!g(matcher7, str)) {
                    if (!g(matcher8, str)) {
                        if (!g(matcher9, str)) {
                            if (!g(matcher10, str)) {
                                if (str.length() == 0) {
                                    break;
                                }
                                matcher11 = matcher12;
                                if (g(matcher11, str)) {
                                    break;
                                }
                                matcher3 = matcher;
                            } else if (b10 != null) {
                                C5220j3 c5220j33 = new C5220j3();
                                c5220j33.l(8);
                                b10.C(c5220j33);
                                a(d10, c5220j33);
                            }
                        } else if (b10 != null) {
                            C5220j3 c5220j34 = new C5220j3();
                            c5220j34.l(8);
                            c5220j34.h(matcher9.group(1));
                            c5220j34.j(matcher9.group(2));
                            c5220j34.i(matcher9.group(3));
                            b10.C(c5220j34);
                            a(d10, c5220j34);
                        }
                    } else if (b10 != null) {
                        C5220j3 c5220j35 = new C5220j3();
                        c5220j35.l(8);
                        c5220j35.h(matcher8.group(1));
                        c5220j35.j(matcher8.group(2));
                        c5220j35.i(matcher8.group(3));
                        c5220j35.k(d(matcher8, 4, null));
                        b10.C(c5220j35);
                        a(d10, c5220j35);
                    }
                    matcher11 = matcher12;
                    matcher3 = matcher;
                } else if (b10 != null) {
                    C5220j3 c5220j36 = new C5220j3();
                    c5220j36.l(4);
                    c5220j36.h(matcher7.group(1));
                    c5220j36.j(matcher7.group(2));
                    c5220j36.i(matcher7.group(3));
                    b10.C(c5220j36);
                    a(d10, c5220j36);
                }
            }
            matcher11 = matcher12;
            matcher3 = matcher;
        }
        Collections.reverse(arrayList);
        C c10 = new C(arrayList);
        c10.i(Boolean.TRUE);
        return c10;
    }

    private D j(b bVar) {
        D d10 = new D();
        Matcher matcher = f49800f.matcher("");
        Matcher matcher2 = f49801g.matcher("");
        if (!bVar.a()) {
            return null;
        }
        a aVarB = bVar.b();
        boolean z10 = false;
        if (aVarB == null) {
            this.f49812a.getLogger().c(EnumC5215i3.WARNING, "Internal error while parsing thread dump.", new Object[0]);
            return null;
        }
        if (g(matcher, aVarB.f49795b)) {
            Long lD = d(matcher, 4, null);
            if (lD == null) {
                this.f49812a.getLogger().c(EnumC5215i3.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            d10.u(lD);
            d10.w(matcher.group(1));
            String strGroup = matcher.group(5);
            if (strGroup != null) {
                if (strGroup.contains(" ")) {
                    d10.z(strGroup.substring(0, strGroup.indexOf(32)));
                } else {
                    d10.z(strGroup);
                }
            }
        } else if (g(matcher2, aVarB.f49795b)) {
            Long lD2 = d(matcher2, 3, null);
            if (lD2 == null) {
                this.f49812a.getLogger().c(EnumC5215i3.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                return null;
            }
            d10.u(lD2);
            d10.w(matcher2.group(1));
        }
        String strM = d10.m();
        if (strM != null) {
            boolean zEquals = strM.equals("main");
            d10.v(Boolean.valueOf(zEquals));
            d10.q(Boolean.valueOf(zEquals));
            if (zEquals && !this.f49813b) {
                z10 = true;
            }
            d10.r(Boolean.valueOf(z10));
        }
        d10.y(i(bVar, d10));
        return d10;
    }

    public List b() {
        return new ArrayList(this.f49815d.values());
    }

    public List e() {
        return this.f49816e;
    }

    public void h(b bVar) {
        Matcher matcher = f49800f.matcher("");
        Matcher matcher2 = f49801g.matcher("");
        while (bVar.a()) {
            a aVarB = bVar.b();
            if (aVarB == null) {
                this.f49812a.getLogger().c(EnumC5215i3.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                return;
            }
            String str = aVarB.f49795b;
            if (g(matcher, str) || g(matcher2, str)) {
                bVar.d();
                D dJ = j(bVar);
                if (dJ != null) {
                    this.f49816e.add(dJ);
                }
            }
        }
    }
}
