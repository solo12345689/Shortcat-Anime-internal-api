package C0;

import com.facebook.imageutils.JfifUtil;
import com.facebook.imageutils.TiffUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.ui.revenuecatui.components.SensibleDefaults;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a */
    private final long f2482a;

    /* JADX INFO: renamed from: b */
    public static final C0028a f2332b = new C0028a(null);

    /* JADX INFO: renamed from: c */
    private static final long f2338c = f.a(0);

    /* JADX INFO: renamed from: d */
    private static final long f2344d = f.a(1);

    /* JADX INFO: renamed from: e */
    private static final long f2350e = f.a(2);

    /* JADX INFO: renamed from: f */
    private static final long f2356f = f.a(3);

    /* JADX INFO: renamed from: g */
    private static final long f2362g = f.a(4);

    /* JADX INFO: renamed from: h */
    private static final long f2368h = f.a(259);

    /* JADX INFO: renamed from: i */
    private static final long f2374i = f.a(260);

    /* JADX INFO: renamed from: j */
    private static final long f2380j = f.a(261);

    /* JADX INFO: renamed from: k */
    private static final long f2386k = f.a(262);

    /* JADX INFO: renamed from: l */
    private static final long f2392l = f.a(263);

    /* JADX INFO: renamed from: m */
    private static final long f2398m = f.a(280);

    /* JADX INFO: renamed from: n */
    private static final long f2404n = f.a(281);

    /* JADX INFO: renamed from: o */
    private static final long f2410o = f.a(282);

    /* JADX INFO: renamed from: p */
    private static final long f2416p = f.a(283);

    /* JADX INFO: renamed from: q */
    private static final long f2422q = f.a(5);

    /* JADX INFO: renamed from: r */
    private static final long f2428r = f.a(6);

    /* JADX INFO: renamed from: s */
    private static final long f2434s = f.a(19);

    /* JADX INFO: renamed from: t */
    private static final long f2440t = f.a(20);

    /* JADX INFO: renamed from: u */
    private static final long f2446u = f.a(21);

    /* JADX INFO: renamed from: v */
    private static final long f2452v = f.a(22);

    /* JADX INFO: renamed from: w */
    private static final long f2458w = f.a(23);

    /* JADX INFO: renamed from: x */
    private static final long f2464x = f.a(268);

    /* JADX INFO: renamed from: y */
    private static final long f2470y = f.a(269);

    /* JADX INFO: renamed from: z */
    private static final long f2476z = f.a(270);

    /* JADX INFO: renamed from: A */
    private static final long f2194A = f.a(271);

    /* JADX INFO: renamed from: B */
    private static final long f2200B = f.a(24);

    /* JADX INFO: renamed from: C */
    private static final long f2206C = f.a(25);

    /* JADX INFO: renamed from: D */
    private static final long f2212D = f.a(26);

    /* JADX INFO: renamed from: E */
    private static final long f2217E = f.a(27);

    /* JADX INFO: renamed from: F */
    private static final long f2222F = f.a(28);

    /* JADX INFO: renamed from: G */
    private static final long f2227G = f.a(7);

    /* JADX INFO: renamed from: H */
    private static final long f2232H = f.a(8);

    /* JADX INFO: renamed from: I */
    private static final long f2237I = f.a(9);

    /* JADX INFO: renamed from: J */
    private static final long f2242J = f.a(10);

    /* JADX INFO: renamed from: K */
    private static final long f2247K = f.a(11);

    /* JADX INFO: renamed from: L */
    private static final long f2252L = f.a(12);

    /* JADX INFO: renamed from: M */
    private static final long f2257M = f.a(13);

    /* JADX INFO: renamed from: N */
    private static final long f2262N = f.a(14);

    /* JADX INFO: renamed from: O */
    private static final long f2267O = f.a(15);

    /* JADX INFO: renamed from: P */
    private static final long f2272P = f.a(16);

    /* JADX INFO: renamed from: Q */
    private static final long f2277Q = f.a(81);

    /* JADX INFO: renamed from: R */
    private static final long f2282R = f.a(69);

    /* JADX INFO: renamed from: S */
    private static final long f2287S = f.a(17);

    /* JADX INFO: renamed from: T */
    private static final long f2292T = f.a(70);

    /* JADX INFO: renamed from: U */
    private static final long f2297U = f.a(18);

    /* JADX INFO: renamed from: V */
    private static final long f2302V = f.a(29);

    /* JADX INFO: renamed from: W */
    private static final long f2307W = f.a(30);

    /* JADX INFO: renamed from: X */
    private static final long f2312X = f.a(31);

    /* JADX INFO: renamed from: Y */
    private static final long f2317Y = f.a(32);

    /* JADX INFO: renamed from: Z */
    private static final long f2322Z = f.a(33);

    /* JADX INFO: renamed from: a0 */
    private static final long f2327a0 = f.a(34);

    /* JADX INFO: renamed from: b0 */
    private static final long f2333b0 = f.a(35);

    /* JADX INFO: renamed from: c0 */
    private static final long f2339c0 = f.a(36);

    /* JADX INFO: renamed from: d0 */
    private static final long f2345d0 = f.a(37);

    /* JADX INFO: renamed from: e0 */
    private static final long f2351e0 = f.a(38);

    /* JADX INFO: renamed from: f0 */
    private static final long f2357f0 = f.a(39);

    /* JADX INFO: renamed from: g0 */
    private static final long f2363g0 = f.a(40);

    /* JADX INFO: renamed from: h0 */
    private static final long f2369h0 = f.a(41);

    /* JADX INFO: renamed from: i0 */
    private static final long f2375i0 = f.a(42);

    /* JADX INFO: renamed from: j0 */
    private static final long f2381j0 = f.a(43);

    /* JADX INFO: renamed from: k0 */
    private static final long f2387k0 = f.a(44);

    /* JADX INFO: renamed from: l0 */
    private static final long f2393l0 = f.a(45);

    /* JADX INFO: renamed from: m0 */
    private static final long f2399m0 = f.a(46);

    /* JADX INFO: renamed from: n0 */
    private static final long f2405n0 = f.a(47);

    /* JADX INFO: renamed from: o0 */
    private static final long f2411o0 = f.a(48);

    /* JADX INFO: renamed from: p0 */
    private static final long f2417p0 = f.a(49);

    /* JADX INFO: renamed from: q0 */
    private static final long f2423q0 = f.a(50);

    /* JADX INFO: renamed from: r0 */
    private static final long f2429r0 = f.a(51);

    /* JADX INFO: renamed from: s0 */
    private static final long f2435s0 = f.a(52);

    /* JADX INFO: renamed from: t0 */
    private static final long f2441t0 = f.a(53);

    /* JADX INFO: renamed from: u0 */
    private static final long f2447u0 = f.a(54);

    /* JADX INFO: renamed from: v0 */
    private static final long f2453v0 = f.a(55);

    /* JADX INFO: renamed from: w0 */
    private static final long f2459w0 = f.a(56);

    /* JADX INFO: renamed from: x0 */
    private static final long f2465x0 = f.a(57);

    /* JADX INFO: renamed from: y0 */
    private static final long f2471y0 = f.a(58);

    /* JADX INFO: renamed from: z0 */
    private static final long f2477z0 = f.a(59);

    /* JADX INFO: renamed from: A0 */
    private static final long f2195A0 = f.a(60);

    /* JADX INFO: renamed from: B0 */
    private static final long f2201B0 = f.a(61);

    /* JADX INFO: renamed from: C0 */
    private static final long f2207C0 = f.a(62);

    /* JADX INFO: renamed from: D0 */
    private static final long f2213D0 = f.a(63);

    /* JADX INFO: renamed from: E0 */
    private static final long f2218E0 = f.a(64);

    /* JADX INFO: renamed from: F0 */
    private static final long f2223F0 = f.a(65);

    /* JADX INFO: renamed from: G0 */
    private static final long f2228G0 = f.a(66);

    /* JADX INFO: renamed from: H0 */
    private static final long f2233H0 = f.a(67);

    /* JADX INFO: renamed from: I0 */
    private static final long f2238I0 = f.a(112);

    /* JADX INFO: renamed from: J0 */
    private static final long f2243J0 = f.a(111);

    /* JADX INFO: renamed from: K0 */
    private static final long f2248K0 = f.a(113);

    /* JADX INFO: renamed from: L0 */
    private static final long f2253L0 = f.a(114);

    /* JADX INFO: renamed from: M0 */
    private static final long f2258M0 = f.a(115);

    /* JADX INFO: renamed from: N0 */
    private static final long f2263N0 = f.a(116);

    /* JADX INFO: renamed from: O0 */
    private static final long f2268O0 = f.a(117);

    /* JADX INFO: renamed from: P0 */
    private static final long f2273P0 = f.a(118);

    /* JADX INFO: renamed from: Q0 */
    private static final long f2278Q0 = f.a(119);

    /* JADX INFO: renamed from: R0 */
    private static final long f2283R0 = f.a(120);

    /* JADX INFO: renamed from: S0 */
    private static final long f2288S0 = f.a(121);

    /* JADX INFO: renamed from: T0 */
    private static final long f2293T0 = f.a(122);

    /* JADX INFO: renamed from: U0 */
    private static final long f2298U0 = f.a(123);

    /* JADX INFO: renamed from: V0 */
    private static final long f2303V0 = f.a(124);

    /* JADX INFO: renamed from: W0 */
    private static final long f2308W0 = f.a(277);

    /* JADX INFO: renamed from: X0 */
    private static final long f2313X0 = f.a(278);

    /* JADX INFO: renamed from: Y0 */
    private static final long f2318Y0 = f.a(279);

    /* JADX INFO: renamed from: Z0 */
    private static final long f2323Z0 = f.a(68);

    /* JADX INFO: renamed from: a1 */
    private static final long f2328a1 = f.a(71);

    /* JADX INFO: renamed from: b1 */
    private static final long f2334b1 = f.a(72);

    /* JADX INFO: renamed from: c1 */
    private static final long f2340c1 = f.a(76);

    /* JADX INFO: renamed from: d1 */
    private static final long f2346d1 = f.a(73);

    /* JADX INFO: renamed from: e1 */
    private static final long f2352e1 = f.a(74);

    /* JADX INFO: renamed from: f1 */
    private static final long f2358f1 = f.a(75);

    /* JADX INFO: renamed from: g1 */
    private static final long f2364g1 = f.a(77);

    /* JADX INFO: renamed from: h1 */
    private static final long f2370h1 = f.a(78);

    /* JADX INFO: renamed from: i1 */
    private static final long f2376i1 = f.a(79);

    /* JADX INFO: renamed from: j1 */
    private static final long f2382j1 = f.a(80);

    /* JADX INFO: renamed from: k1 */
    private static final long f2388k1 = f.a(82);

    /* JADX INFO: renamed from: l1 */
    private static final long f2394l1 = f.a(83);

    /* JADX INFO: renamed from: m1 */
    private static final long f2400m1 = f.a(84);

    /* JADX INFO: renamed from: n1 */
    private static final long f2406n1 = f.a(92);

    /* JADX INFO: renamed from: o1 */
    private static final long f2412o1 = f.a(93);

    /* JADX INFO: renamed from: p1 */
    private static final long f2418p1 = f.a(94);

    /* JADX INFO: renamed from: q1 */
    private static final long f2424q1 = f.a(95);

    /* JADX INFO: renamed from: r1 */
    private static final long f2430r1 = f.a(96);

    /* JADX INFO: renamed from: s1 */
    private static final long f2436s1 = f.a(97);

    /* JADX INFO: renamed from: t1 */
    private static final long f2442t1 = f.a(98);

    /* JADX INFO: renamed from: u1 */
    private static final long f2448u1 = f.a(99);

    /* JADX INFO: renamed from: v1 */
    private static final long f2454v1 = f.a(100);

    /* JADX INFO: renamed from: w1 */
    private static final long f2460w1 = f.a(101);

    /* JADX INFO: renamed from: x1 */
    private static final long f2466x1 = f.a(102);

    /* JADX INFO: renamed from: y1 */
    private static final long f2472y1 = f.a(103);

    /* JADX INFO: renamed from: z1 */
    private static final long f2478z1 = f.a(104);

    /* JADX INFO: renamed from: A1 */
    private static final long f2196A1 = f.a(105);

    /* JADX INFO: renamed from: B1 */
    private static final long f2202B1 = f.a(106);

    /* JADX INFO: renamed from: C1 */
    private static final long f2208C1 = f.a(107);

    /* JADX INFO: renamed from: D1 */
    private static final long f2214D1 = f.a(108);

    /* JADX INFO: renamed from: E1 */
    private static final long f2219E1 = f.a(109);

    /* JADX INFO: renamed from: F1 */
    private static final long f2224F1 = f.a(110);

    /* JADX INFO: renamed from: G1 */
    private static final long f2229G1 = f.a(188);

    /* JADX INFO: renamed from: H1 */
    private static final long f2234H1 = f.a(189);

    /* JADX INFO: renamed from: I1 */
    private static final long f2239I1 = f.a(190);

    /* JADX INFO: renamed from: J1 */
    private static final long f2244J1 = f.a(191);

    /* JADX INFO: renamed from: K1 */
    private static final long f2249K1 = f.a(JfifUtil.MARKER_SOFn);

    /* JADX INFO: renamed from: L1 */
    private static final long f2254L1 = f.a(193);

    /* JADX INFO: renamed from: M1 */
    private static final long f2259M1 = f.a(194);

    /* JADX INFO: renamed from: N1 */
    private static final long f2264N1 = f.a(195);

    /* JADX INFO: renamed from: O1 */
    private static final long f2269O1 = f.a(196);

    /* JADX INFO: renamed from: P1 */
    private static final long f2274P1 = f.a(197);

    /* JADX INFO: renamed from: Q1 */
    private static final long f2279Q1 = f.a(198);

    /* JADX INFO: renamed from: R1 */
    private static final long f2284R1 = f.a(199);

    /* JADX INFO: renamed from: S1 */
    private static final long f2289S1 = f.a(200);

    /* JADX INFO: renamed from: T1 */
    private static final long f2294T1 = f.a(RCHTTPStatusCodes.CREATED);

    /* JADX INFO: renamed from: U1 */
    private static final long f2299U1 = f.a(202);

    /* JADX INFO: renamed from: V1 */
    private static final long f2304V1 = f.a(203);

    /* JADX INFO: renamed from: W1 */
    private static final long f2309W1 = f.a(125);

    /* JADX INFO: renamed from: X1 */
    private static final long f2314X1 = f.a(131);

    /* JADX INFO: renamed from: Y1 */
    private static final long f2319Y1 = f.a(132);

    /* JADX INFO: renamed from: Z1 */
    private static final long f2324Z1 = f.a(133);

    /* JADX INFO: renamed from: a2 */
    private static final long f2329a2 = f.a(134);

    /* JADX INFO: renamed from: b2 */
    private static final long f2335b2 = f.a(135);

    /* JADX INFO: renamed from: c2 */
    private static final long f2341c2 = f.a(136);

    /* JADX INFO: renamed from: d2 */
    private static final long f2347d2 = f.a(137);

    /* JADX INFO: renamed from: e2 */
    private static final long f2353e2 = f.a(138);

    /* JADX INFO: renamed from: f2 */
    private static final long f2359f2 = f.a(139);

    /* JADX INFO: renamed from: g2 */
    private static final long f2365g2 = f.a(140);

    /* JADX INFO: renamed from: h2 */
    private static final long f2371h2 = f.a(141);

    /* JADX INFO: renamed from: i2 */
    private static final long f2377i2 = f.a(142);

    /* JADX INFO: renamed from: j2 */
    private static final long f2383j2 = f.a(143);

    /* JADX INFO: renamed from: k2 */
    private static final long f2389k2 = f.a(144);

    /* JADX INFO: renamed from: l2 */
    private static final long f2395l2 = f.a(145);

    /* JADX INFO: renamed from: m2 */
    private static final long f2401m2 = f.a(146);

    /* JADX INFO: renamed from: n2 */
    private static final long f2407n2 = f.a(147);

    /* JADX INFO: renamed from: o2 */
    private static final long f2413o2 = f.a(148);

    /* JADX INFO: renamed from: p2 */
    private static final long f2419p2 = f.a(149);

    /* JADX INFO: renamed from: q2 */
    private static final long f2425q2 = f.a(150);

    /* JADX INFO: renamed from: r2 */
    private static final long f2431r2 = f.a(151);

    /* JADX INFO: renamed from: s2 */
    private static final long f2437s2 = f.a(152);

    /* JADX INFO: renamed from: t2 */
    private static final long f2443t2 = f.a(153);

    /* JADX INFO: renamed from: u2 */
    private static final long f2449u2 = f.a(154);

    /* JADX INFO: renamed from: v2 */
    private static final long f2455v2 = f.a(ModuleDescriptor.MODULE_VERSION);

    /* JADX INFO: renamed from: w2 */
    private static final long f2461w2 = f.a(156);

    /* JADX INFO: renamed from: x2 */
    private static final long f2467x2 = f.a(157);

    /* JADX INFO: renamed from: y2 */
    private static final long f2473y2 = f.a(158);

    /* JADX INFO: renamed from: z2 */
    private static final long f2479z2 = f.a(159);

    /* JADX INFO: renamed from: A2 */
    private static final long f2197A2 = f.a(160);

    /* JADX INFO: renamed from: B2 */
    private static final long f2203B2 = f.a(161);

    /* JADX INFO: renamed from: C2 */
    private static final long f2209C2 = f.a(162);

    /* JADX INFO: renamed from: D2 */
    private static final long f2215D2 = f.a(163);

    /* JADX INFO: renamed from: E2 */
    private static final long f2220E2 = f.a(126);

    /* JADX INFO: renamed from: F2 */
    private static final long f2225F2 = f.a(127);

    /* JADX INFO: renamed from: G2 */
    private static final long f2230G2 = f.a(85);

    /* JADX INFO: renamed from: H2 */
    private static final long f2235H2 = f.a(86);

    /* JADX INFO: renamed from: I2 */
    private static final long f2240I2 = f.a(130);

    /* JADX INFO: renamed from: J2 */
    private static final long f2245J2 = f.a(87);

    /* JADX INFO: renamed from: K2 */
    private static final long f2250K2 = f.a(88);

    /* JADX INFO: renamed from: L2 */
    private static final long f2255L2 = f.a(89);

    /* JADX INFO: renamed from: M2 */
    private static final long f2260M2 = f.a(90);

    /* JADX INFO: renamed from: N2 */
    private static final long f2265N2 = f.a(128);

    /* JADX INFO: renamed from: O2 */
    private static final long f2270O2 = f.a(222);

    /* JADX INFO: renamed from: P2 */
    private static final long f2275P2 = f.a(129);

    /* JADX INFO: renamed from: Q2 */
    private static final long f2280Q2 = f.a(226);

    /* JADX INFO: renamed from: R2 */
    private static final long f2285R2 = f.a(272);

    /* JADX INFO: renamed from: S2 */
    private static final long f2290S2 = f.a(273);

    /* JADX INFO: renamed from: T2 */
    private static final long f2295T2 = f.a(TiffUtil.TIFF_TAG_ORIENTATION);

    /* JADX INFO: renamed from: U2 */
    private static final long f2300U2 = f.a(275);

    /* JADX INFO: renamed from: V2 */
    private static final long f2305V2 = f.a(91);

    /* JADX INFO: renamed from: W2 */
    private static final long f2310W2 = f.a(164);

    /* JADX INFO: renamed from: X2 */
    private static final long f2315X2 = f.a(165);

    /* JADX INFO: renamed from: Y2 */
    private static final long f2320Y2 = f.a(166);

    /* JADX INFO: renamed from: Z2 */
    private static final long f2325Z2 = f.a(167);

    /* JADX INFO: renamed from: a3 */
    private static final long f2330a3 = f.a(168);

    /* JADX INFO: renamed from: b3 */
    private static final long f2336b3 = f.a(169);

    /* JADX INFO: renamed from: c3 */
    private static final long f2342c3 = f.a(170);

    /* JADX INFO: renamed from: d3 */
    private static final long f2348d3 = f.a(171);

    /* JADX INFO: renamed from: e3 */
    private static final long f2354e3 = f.a(172);

    /* JADX INFO: renamed from: f3 */
    private static final long f2360f3 = f.a(173);

    /* JADX INFO: renamed from: g3 */
    private static final long f2366g3 = f.a(174);

    /* JADX INFO: renamed from: h3 */
    private static final long f2372h3 = f.a(175);

    /* JADX INFO: renamed from: i3 */
    private static final long f2378i3 = f.a(176);

    /* JADX INFO: renamed from: j3 */
    private static final long f2384j3 = f.a(177);

    /* JADX INFO: renamed from: k3 */
    private static final long f2390k3 = f.a(178);

    /* JADX INFO: renamed from: l3 */
    private static final long f2396l3 = f.a(179);

    /* JADX INFO: renamed from: m3 */
    private static final long f2402m3 = f.a(SensibleDefaults.X_OFFSET);

    /* JADX INFO: renamed from: n3 */
    private static final long f2408n3 = f.a(181);

    /* JADX INFO: renamed from: o3 */
    private static final long f2414o3 = f.a(182);

    /* JADX INFO: renamed from: p3 */
    private static final long f2420p3 = f.a(183);

    /* JADX INFO: renamed from: q3 */
    private static final long f2426q3 = f.a(184);

    /* JADX INFO: renamed from: r3 */
    private static final long f2432r3 = f.a(185);

    /* JADX INFO: renamed from: s3 */
    private static final long f2438s3 = f.a(186);

    /* JADX INFO: renamed from: t3 */
    private static final long f2444t3 = f.a(187);

    /* JADX INFO: renamed from: u3 */
    private static final long f2450u3 = f.a(204);

    /* JADX INFO: renamed from: v3 */
    private static final long f2456v3 = f.a(205);

    /* JADX INFO: renamed from: w3 */
    private static final long f2462w3 = f.a(206);

    /* JADX INFO: renamed from: x3 */
    private static final long f2468x3 = f.a(207);

    /* JADX INFO: renamed from: y3 */
    private static final long f2474y3 = f.a(JfifUtil.MARKER_RST0);

    /* JADX INFO: renamed from: z3 */
    private static final long f2480z3 = f.a(209);

    /* JADX INFO: renamed from: A3 */
    private static final long f2198A3 = f.a(210);

    /* JADX INFO: renamed from: B3 */
    private static final long f2204B3 = f.a(211);

    /* JADX INFO: renamed from: C3 */
    private static final long f2210C3 = f.a(212);

    /* JADX INFO: renamed from: D3 */
    private static final long f2216D3 = f.a(213);

    /* JADX INFO: renamed from: E3 */
    private static final long f2221E3 = f.a(214);

    /* JADX INFO: renamed from: F3 */
    private static final long f2226F3 = f.a(JfifUtil.MARKER_RST7);

    /* JADX INFO: renamed from: G3 */
    private static final long f2231G3 = f.a(JfifUtil.MARKER_SOI);

    /* JADX INFO: renamed from: H3 */
    private static final long f2236H3 = f.a(JfifUtil.MARKER_EOI);

    /* JADX INFO: renamed from: I3 */
    private static final long f2241I3 = f.a(JfifUtil.MARKER_SOS);

    /* JADX INFO: renamed from: J3 */
    private static final long f2246J3 = f.a(219);

    /* JADX INFO: renamed from: K3 */
    private static final long f2251K3 = f.a(220);

    /* JADX INFO: renamed from: L3 */
    private static final long f2256L3 = f.a(221);

    /* JADX INFO: renamed from: M3 */
    private static final long f2261M3 = f.a(223);

    /* JADX INFO: renamed from: N3 */
    private static final long f2266N3 = f.a(224);

    /* JADX INFO: renamed from: O3 */
    private static final long f2271O3 = f.a(276);

    /* JADX INFO: renamed from: P3 */
    private static final long f2276P3 = f.a(JfifUtil.MARKER_APP1);

    /* JADX INFO: renamed from: Q3 */
    private static final long f2281Q3 = f.a(229);

    /* JADX INFO: renamed from: R3 */
    private static final long f2286R3 = f.a(230);

    /* JADX INFO: renamed from: S3 */
    private static final long f2291S3 = f.a(231);

    /* JADX INFO: renamed from: T3 */
    private static final long f2296T3 = f.a(232);

    /* JADX INFO: renamed from: U3 */
    private static final long f2301U3 = f.a(233);

    /* JADX INFO: renamed from: V3 */
    private static final long f2306V3 = f.a(234);

    /* JADX INFO: renamed from: W3 */
    private static final long f2311W3 = f.a(235);

    /* JADX INFO: renamed from: X3 */
    private static final long f2316X3 = f.a(236);

    /* JADX INFO: renamed from: Y3 */
    private static final long f2321Y3 = f.a(237);

    /* JADX INFO: renamed from: Z3 */
    private static final long f2326Z3 = f.a(238);

    /* JADX INFO: renamed from: a4 */
    private static final long f2331a4 = f.a(239);

    /* JADX INFO: renamed from: b4 */
    private static final long f2337b4 = f.a(240);

    /* JADX INFO: renamed from: c4 */
    private static final long f2343c4 = f.a(241);

    /* JADX INFO: renamed from: d4 */
    private static final long f2349d4 = f.a(242);

    /* JADX INFO: renamed from: e4 */
    private static final long f2355e4 = f.a(243);

    /* JADX INFO: renamed from: f4 */
    private static final long f2361f4 = f.a(244);

    /* JADX INFO: renamed from: g4 */
    private static final long f2367g4 = f.a(245);

    /* JADX INFO: renamed from: h4 */
    private static final long f2373h4 = f.a(246);

    /* JADX INFO: renamed from: i4 */
    private static final long f2379i4 = f.a(247);

    /* JADX INFO: renamed from: j4 */
    private static final long f2385j4 = f.a(248);

    /* JADX INFO: renamed from: k4 */
    private static final long f2391k4 = f.a(249);

    /* JADX INFO: renamed from: l4 */
    private static final long f2397l4 = f.a(250);

    /* JADX INFO: renamed from: m4 */
    private static final long f2403m4 = f.a(251);

    /* JADX INFO: renamed from: n4 */
    private static final long f2409n4 = f.a(252);

    /* JADX INFO: renamed from: o4 */
    private static final long f2415o4 = f.a(253);

    /* JADX INFO: renamed from: p4 */
    private static final long f2421p4 = f.a(254);

    /* JADX INFO: renamed from: q4 */
    private static final long f2427q4 = f.a(255);

    /* JADX INFO: renamed from: r4 */
    private static final long f2433r4 = f.a(IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER);

    /* JADX INFO: renamed from: s4 */
    private static final long f2439s4 = f.a(257);

    /* JADX INFO: renamed from: t4 */
    private static final long f2445t4 = f.a(258);

    /* JADX INFO: renamed from: u4 */
    private static final long f2451u4 = f.a(264);

    /* JADX INFO: renamed from: v4 */
    private static final long f2457v4 = f.a(265);

    /* JADX INFO: renamed from: w4 */
    private static final long f2463w4 = f.a(266);

    /* JADX INFO: renamed from: x4 */
    private static final long f2469x4 = f.a(267);

    /* JADX INFO: renamed from: y4 */
    private static final long f2475y4 = f.a(284);

    /* JADX INFO: renamed from: z4 */
    private static final long f2481z4 = f.a(285);

    /* JADX INFO: renamed from: A4 */
    private static final long f2199A4 = f.a(286);

    /* JADX INFO: renamed from: B4 */
    private static final long f2205B4 = f.a(287);

    /* JADX INFO: renamed from: C4 */
    private static final long f2211C4 = f.a(288);

    /* JADX INFO: renamed from: C0.a$a */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class C0028a {
        public /* synthetic */ C0028a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return a.f2362g;
        }

        public final long b() {
            return a.f2458w;
        }

        public final long c() {
            return a.f2440t;
        }

        public final long d() {
            return a.f2446u;
        }

        public final long e() {
            return a.f2452v;
        }

        public final long f() {
            return a.f2434s;
        }

        public final long g() {
            return a.f2228G0;
        }

        public final long h() {
            return a.f2243J0;
        }

        public final long i() {
            return a.f2380j;
        }

        public final long j() {
            return a.f2374i;
        }

        public final long k() {
            return a.f2197A2;
        }

        public final long l() {
            return a.f2412o1;
        }

        public final long m() {
            return a.f2406n1;
        }

        public final long n() {
            return a.f2201B0;
        }

        private C0028a() {
        }
    }

    private /* synthetic */ a(long j10) {
        this.f2482a = j10;
    }

    public static final /* synthetic */ a o(long j10) {
        return new a(j10);
    }

    public static boolean q(long j10, Object obj) {
        return (obj instanceof a) && j10 == ((a) obj).u();
    }

    public static final boolean r(long j10, long j11) {
        return j10 == j11;
    }

    public static int s(long j10) {
        return Long.hashCode(j10);
    }

    public static String t(long j10) {
        return "Key code: " + j10;
    }

    public boolean equals(Object obj) {
        return q(this.f2482a, obj);
    }

    public int hashCode() {
        return s(this.f2482a);
    }

    public String toString() {
        return t(this.f2482a);
    }

    public final /* synthetic */ long u() {
        return this.f2482a;
    }

    public static long p(long j10) {
        return j10;
    }
}
