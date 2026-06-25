package com.revenuecat.purchases.ui.revenuecatui.helpers;

import Td.L;
import Td.r;
import Td.z;
import Ud.AbstractC2279u;
import app.notifee.core.event.LogEvent;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Result;
import ie.InterfaceC5096o;
import ie.p;
import ie.q;
import ie.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a:\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\b\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0004\u0018\u00018\u00002\u0006\u0010\u0002\u001a\u00028\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aO\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0006H\u0080\bø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001aU\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u000b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0006H\u0080\bø\u0001\u0001¢\u0006\u0004\b\r\u0010\n\u001aa\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u000b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00010\u00030\u0006H\u0080\bø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\n\u001aU\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u000b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006H\u0080\bø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\n\u001aa\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u000b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00030\u0006H\u0080\bø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\n\u001aM\u0010\u0012\u001a\u00028\u0002\"\b\b\u0000\u0010\u0000*\u00028\u0002\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u000b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006H\u0080\bø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a+\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a-\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0000¢\u0006\u0004\b\u0016\u0010\u0015\u001a-\u0010\u0017\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0000¢\u0006\u0004\b\u0017\u0010\u0015\u001a;\u0010\u0018\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u008b\u0001\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u001c0\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u001a\"\u0004\b\u0003\u0010\u001b2\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u001c0\u00032\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u001c0\u00032\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u001fH\u0080\bø\u0001\u0001¢\u0006\u0004\b \u0010!\u001a±\u0001\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u001c0\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\"\"\u0004\b\u0003\u0010\u001a\"\u0004\b\u0004\u0010\u001b2\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u001c0\u00032\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u001c0\u00032\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u001c0\u00032\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030$H\u0080\bø\u0001\u0001¢\u0006\u0004\b \u0010%\u001a×\u0001\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u001c0\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\"\"\u0004\b\u0003\u0010&\"\u0004\b\u0004\u0010\u001a\"\u0004\b\u0005\u0010\u001b2\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u001c0\u00032\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u001c0\u00032\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u001c0\u00032\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00050\u001c0\u00032$\u0010\f\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040(H\u0080\bø\u0001\u0001¢\u0006\u0004\b \u0010)\u001aý\u0001\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00060\u001c0\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\"\"\u0004\b\u0003\u0010&\"\u0004\b\u0004\u0010*\"\u0004\b\u0005\u0010\u001a\"\u0004\b\u0006\u0010\u001b2\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00060\u001c0\u00032\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00060\u001c0\u00032\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00060\u001c0\u00032\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00060\u001c0\u00032\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00060\u001c0\u00032*\u0010\f\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050,H\u0080\bø\u0001\u0001¢\u0006\u0004\b \u0010-\u001a£\u0002\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00070\u001c0\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\"\"\u0004\b\u0003\u0010&\"\u0004\b\u0004\u0010*\"\u0004\b\u0005\u0010.\"\u0004\b\u0006\u0010\u001a\"\u0004\b\u0007\u0010\u001b2\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00070\u001c0\u00032\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00070\u001c0\u00032\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00070\u001c0\u00032\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00070\u001c0\u00032\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00070\u001c0\u00032\u0018\u0010/\u001a\u0014\u0012\u0004\u0012\u00028\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00070\u001c0\u000320\u0010\f\u001a,\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u000600H\u0080\bø\u0001\u0001¢\u0006\u0004\b \u00101\u001aÉ\u0002\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\b0\u001c0\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\"\"\u0004\b\u0003\u0010&\"\u0004\b\u0004\u0010*\"\u0004\b\u0005\u0010.\"\u0004\b\u0006\u0010\u001a\"\u0004\b\u0007\u0010\u001b\"\u0004\b\b\u001022\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\b0\u001c0\u00032\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\b0\u001c0\u00032\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\b0\u001c0\u00032\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\b0\u001c0\u00032\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\b0\u001c0\u00032\u0018\u0010/\u001a\u0014\u0012\u0004\u0012\u00028\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\b0\u001c0\u00032\u0018\u00103\u001a\u0014\u0012\u0004\u0012\u00028\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\b0\u001c0\u000326\u0010\f\u001a2\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u000704H\u0080\bø\u0001\u0001¢\u0006\u0004\b \u00105\u001am\u00108\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000107\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u001c0\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010**\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u001c0\u0003062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H\u0080\bø\u0001\u0001¢\u0006\u0004\b8\u00109\u001a\u007f\u0010<\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020;\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u001c0\u0003\"\u0004\b\u0000\u0010:\"\u0004\b\u0001\u0010\u0000\"\u0004\b\u0002\u0010\u0001\"\u0004\b\u0003\u0010** \u0012\u0004\u0012\u00028\u0000\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u001c0\u00030;2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006H\u0080\bø\u0001\u0001¢\u0006\u0004\b<\u0010=\u001a\u007f\u0010<\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020>\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u001c0\u0003\"\u0004\b\u0000\u0010:\"\u0004\b\u0001\u0010\u0000\"\u0004\b\u0002\u0010\u0001\"\u0004\b\u0003\u0010** \u0012\u0004\u0012\u00028\u0000\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u001c0\u00030>2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006H\u0080\bø\u0001\u0001¢\u0006\u0004\b<\u0010?\u001a=\u0010A\u001a\b\u0012\u0004\u0012\u00028\u000107\"\u0004\b\u0000\u0010@\"\u0004\b\u0001\u0010.*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u001c0\u000307H\u0002¢\u0006\u0004\bA\u0010B\" \u0010D\u001a\u00020C*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E\" \u0010F\u001a\u00020C*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010E\u0082\u0002\u000b\n\u0002\b9\n\u0005\b\u009920\u0001¨\u0006G"}, d2 = {"A", "B", LogEvent.LEVEL_ERROR, "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "errorIfNull", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lkotlin/Function1;", "LTd/L;", "block", "onError", "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;Lkotlin/jvm/functions/Function1;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "R", "transform", "map", "flatMap", "mapError", "flatMapError", "onFailure", "getOrElse", "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "getOrThrow", "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;)Ljava/lang/Object;", "getOrNull", "errorOrNull", "orSuccessfullyNull", "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "G", "H", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyList;", "first", "second", "Lkotlin/Function2;", "zipOrAccumulate", "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;Lkotlin/jvm/functions/Function2;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "C", "third", "Lkotlin/Function3;", "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;Lie/o;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "D", "fourth", "Lkotlin/Function4;", "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;Lie/p;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "E", "fifth", "Lkotlin/Function5;", "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;Lie/q;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "F", "sixth", "Lkotlin/Function6;", "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;Lie/r;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "I", "seventh", "Lkotlin/Function7;", "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;Lie/s;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "", "", "mapOrAccumulate", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "K", "", "mapValuesOrAccumulate", "(Ljava/util/Map;Lkotlin/jvm/functions/Function1;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;", "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/NonEmptyMap;Lkotlin/jvm/functions/Function1;)Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;", "T", "collectErrors", "(Ljava/util/List;)Ljava/util/List;", "", "isSuccess", "(Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Result;)Z", "isError", "revenuecatui_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final /* synthetic */ class ResultKt {
    public static final <T, F> List<F> collectErrors(List<? extends Result<? extends T, ? extends NonEmptyList<? extends F>>> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Result result = (Result) it.next();
            Result.Error error = result instanceof Result.Error ? (Result.Error) result : null;
            NonEmptyList nonEmptyList = error != null ? (NonEmptyList) error.getValue() : null;
            if (nonEmptyList != null) {
                arrayList.add(nonEmptyList);
            }
        }
        return AbstractC2279u.z(arrayList);
    }

    public static final /* synthetic */ Result errorIfNull(Object obj, Object obj2) {
        return obj != null ? new Result.Success(obj) : new Result.Error(obj2);
    }

    public static final /* synthetic */ Object errorOrNull(Result result) {
        AbstractC5504s.h(result, "<this>");
        if (result instanceof Result.Success) {
            return null;
        }
        if (result instanceof Result.Error) {
            return ((Result.Error) result).getValue();
        }
        throw new r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <A, B, R> Result<R, B> flatMap(Result<? extends A, ? extends B> result, Function1 transform) {
        AbstractC5504s.h(result, "<this>");
        AbstractC5504s.h(transform, "transform");
        if (result instanceof Result.Success) {
            return (Result) transform.invoke(((Result.Success) result).getValue());
        }
        if (result instanceof Result.Error) {
            return result;
        }
        throw new r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <A, B, R> Result<A, R> flatMapError(Result<? extends A, ? extends B> result, Function1 transform) {
        AbstractC5504s.h(result, "<this>");
        AbstractC5504s.h(transform, "transform");
        if (result instanceof Result.Success) {
            return result;
        }
        if (result instanceof Result.Error) {
            return (Result) transform.invoke(((Result.Error) result).getValue());
        }
        throw new r();
    }

    public static final /* synthetic */ <A extends R, B, R> R getOrElse(Result<? extends A, ? extends B> result, Function1 onFailure) {
        AbstractC5504s.h(result, "<this>");
        AbstractC5504s.h(onFailure, "onFailure");
        if (result instanceof Result.Success) {
            return (R) ((Result.Success) result).getValue();
        }
        if (result instanceof Result.Error) {
            return (R) onFailure.invoke(((Result.Error) result).getValue());
        }
        throw new r();
    }

    public static final /* synthetic */ Object getOrNull(Result result) {
        AbstractC5504s.h(result, "<this>");
        if (result instanceof Result.Success) {
            return ((Result.Success) result).getValue();
        }
        if (result instanceof Result.Error) {
            return null;
        }
        throw new r();
    }

    public static final /* synthetic */ Object getOrThrow(Result result) throws Throwable {
        AbstractC5504s.h(result, "<this>");
        if (result instanceof Result.Success) {
            return ((Result.Success) result).getValue();
        }
        if (!(result instanceof Result.Error)) {
            throw new r();
        }
        Result.Error error = (Result.Error) result;
        if (error.getValue() instanceof Throwable) {
            throw ((Throwable) error.getValue());
        }
        throw new IllegalStateException(("Result was unsuccessful: " + error.getValue()).toString());
    }

    public static final /* synthetic */ boolean isError(Result result) {
        AbstractC5504s.h(result, "<this>");
        return result instanceof Result.Error;
    }

    public static final /* synthetic */ boolean isSuccess(Result result) {
        AbstractC5504s.h(result, "<this>");
        return result instanceof Result.Success;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <A, B, R> Result<R, B> map(Result<? extends A, ? extends B> result, Function1 transform) {
        AbstractC5504s.h(result, "<this>");
        AbstractC5504s.h(transform, "transform");
        if (result instanceof Result.Success) {
            return new Result.Success(transform.invoke(((Result.Success) result).getValue()));
        }
        if (result instanceof Result.Error) {
            return result;
        }
        throw new r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <A, B, R> Result<A, R> mapError(Result<? extends A, ? extends B> result, Function1 transform) {
        AbstractC5504s.h(result, "<this>");
        AbstractC5504s.h(transform, "transform");
        if (result instanceof Result.Success) {
            return result;
        }
        if (result instanceof Result.Error) {
            return new Result.Error(transform.invoke(((Result.Error) result).getValue()));
        }
        throw new r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <A, B, E> Result<List<B>, NonEmptyList<E>> mapOrAccumulate(Iterable<? extends Result<? extends A, ? extends NonEmptyList<? extends E>>> iterable, Function1 transform) {
        AbstractC5504s.h(iterable, "<this>");
        AbstractC5504s.h(transform, "transform");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Result<? extends A, ? extends NonEmptyList<? extends E>> result : iterable) {
            if (result instanceof Result.Success) {
                if (arrayList2.isEmpty()) {
                    arrayList.add(transform.invoke(((Result.Success) result).getValue()));
                }
            } else if (result instanceof Result.Error) {
                arrayList2.addAll((Collection) ((Result.Error) result).getValue());
            }
        }
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(arrayList2);
        return nonEmptyListOrNull != null ? new Result.Error(nonEmptyListOrNull) : new Result.Success(arrayList);
    }

    public static final /* synthetic */ <K, A, B, E> Result<Map<K, B>, NonEmptyList<E>> mapValuesOrAccumulate(Map<K, ? extends Result<? extends A, ? extends NonEmptyList<? extends E>>> map, Function1 transform) {
        AbstractC5504s.h(map, "<this>");
        AbstractC5504s.h(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<K, ? extends Result<? extends A, ? extends NonEmptyList<? extends E>>> entry : map.entrySet()) {
            K key = entry.getKey();
            Result<? extends A, ? extends NonEmptyList<? extends E>> value = entry.getValue();
            if (value instanceof Result.Success) {
                if (arrayList.isEmpty()) {
                    linkedHashMap.put(key, transform.invoke(((Result.Success) value).getValue()));
                }
            } else if (value instanceof Result.Error) {
                arrayList.addAll((Collection) ((Result.Error) value).getValue());
            }
        }
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(arrayList);
        return nonEmptyListOrNull != null ? new Result.Error(nonEmptyListOrNull) : new Result.Success(linkedHashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <A, B> Result<A, B> onError(Result<? extends A, ? extends B> result, Function1 block) {
        AbstractC5504s.h(result, "<this>");
        AbstractC5504s.h(block, "block");
        if (!(result instanceof Result.Success) && (result instanceof Result.Error)) {
            block.invoke(((Result.Error) result).getValue());
        }
        return result;
    }

    public static final /* synthetic */ Result orSuccessfullyNull(Result result) {
        return result == null ? new Result.Success(null) : result;
    }

    public static final /* synthetic */ <A, B, G, H> Result<G, NonEmptyList<H>> zipOrAccumulate(Result<? extends A, ? extends NonEmptyList<? extends H>> first, Result<? extends B, ? extends NonEmptyList<? extends H>> second, Function2 transform) {
        AbstractC5504s.h(first, "first");
        AbstractC5504s.h(second, "second");
        AbstractC5504s.h(transform, "transform");
        L l10 = L.f17438a;
        Result.Success success = new Result.Success(l10);
        Result.Success success2 = new Result.Success(l10);
        Result.Success success3 = new Result.Success(l10);
        Result.Success success4 = new Result.Success(l10);
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(collectErrors(AbstractC2279u.p(first, second, success, success2, success3, success4)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        Object value = ((Result.Success) first).getValue();
        Object value2 = ((Result.Success) second).getValue();
        Object value3 = success.getValue();
        Object value4 = success2.getValue();
        Object value5 = success3.getValue();
        return new Result.Success(transform.invoke(value, value2));
    }

    public static final /* synthetic */ <K, A, B, E> Result<NonEmptyMap<K, B>, NonEmptyList<E>> mapValuesOrAccumulate(NonEmptyMap<K, ? extends Result<? extends A, ? extends NonEmptyList<? extends E>>> nonEmptyMap, Function1 transform) {
        AbstractC5504s.h(nonEmptyMap, "<this>");
        AbstractC5504s.h(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        Result success = (Result) nonEmptyMap.getEntry().getValue();
        if (success instanceof Result.Success) {
            success = new Result.Success(transform.invoke(((Result.Success) success).getValue()));
        } else if (!(success instanceof Result.Error)) {
            throw new r();
        }
        if (success instanceof Result.Success) {
            success = new Result.Success(z.a(nonEmptyMap.getEntry().getKey(), ((Result.Success) success).getValue()));
        } else if (!(success instanceof Result.Error)) {
            throw new r();
        }
        if (!(success instanceof Result.Success) && (success instanceof Result.Error)) {
            arrayList.addAll((NonEmptyList) ((Result.Error) success).getValue());
        }
        for (Map.Entry<K, ? extends Result<? extends A, ? extends NonEmptyList<? extends E>>> entry : nonEmptyMap.entrySet()) {
            K key = entry.getKey();
            Result<? extends A, ? extends NonEmptyList<? extends E>> value = entry.getValue();
            if (value instanceof Result.Success) {
                if (arrayList.isEmpty() && !AbstractC5504s.c(key, nonEmptyMap.getEntry().getKey())) {
                    linkedHashMap.put(key, transform.invoke(((Result.Success) value).getValue()));
                }
            } else if (value instanceof Result.Error) {
                arrayList.addAll((Collection) ((Result.Error) value).getValue());
            }
        }
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(arrayList);
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        return new Result.Success(NonEmptyMapKt.nonEmptyMapOf((Pair) getOrThrow(success), linkedHashMap));
    }

    public static final /* synthetic */ <A, B, C, G, H> Result<G, NonEmptyList<H>> zipOrAccumulate(Result<? extends A, ? extends NonEmptyList<? extends H>> first, Result<? extends B, ? extends NonEmptyList<? extends H>> second, Result<? extends C, ? extends NonEmptyList<? extends H>> third, InterfaceC5096o transform) {
        AbstractC5504s.h(first, "first");
        AbstractC5504s.h(second, "second");
        AbstractC5504s.h(third, "third");
        AbstractC5504s.h(transform, "transform");
        L l10 = L.f17438a;
        Result.Success success = new Result.Success(l10);
        Result.Success success2 = new Result.Success(l10);
        Result.Success success3 = new Result.Success(l10);
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(collectErrors(AbstractC2279u.p(first, second, third, success, success2, success3)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        Object value = ((Result.Success) first).getValue();
        Object value2 = ((Result.Success) second).getValue();
        Object value3 = ((Result.Success) third).getValue();
        Object value4 = success.getValue();
        Object value5 = success2.getValue();
        return new Result.Success(transform.invoke(value, value2, value3));
    }

    public static final /* synthetic */ <A, B, C, D, G, H> Result<G, NonEmptyList<H>> zipOrAccumulate(Result<? extends A, ? extends NonEmptyList<? extends H>> first, Result<? extends B, ? extends NonEmptyList<? extends H>> second, Result<? extends C, ? extends NonEmptyList<? extends H>> third, Result<? extends D, ? extends NonEmptyList<? extends H>> fourth, p transform) {
        AbstractC5504s.h(first, "first");
        AbstractC5504s.h(second, "second");
        AbstractC5504s.h(third, "third");
        AbstractC5504s.h(fourth, "fourth");
        AbstractC5504s.h(transform, "transform");
        L l10 = L.f17438a;
        Result.Success success = new Result.Success(l10);
        Result.Success success2 = new Result.Success(l10);
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(collectErrors(AbstractC2279u.p(first, second, third, fourth, success, success2)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        Object value = ((Result.Success) first).getValue();
        Object value2 = ((Result.Success) second).getValue();
        Object value3 = ((Result.Success) third).getValue();
        Object value4 = ((Result.Success) fourth).getValue();
        Object value5 = success.getValue();
        return new Result.Success(transform.invoke(value, value2, value3, value4));
    }

    public static final /* synthetic */ <A, B, C, D, E, G, H> Result<G, NonEmptyList<H>> zipOrAccumulate(Result<? extends A, ? extends NonEmptyList<? extends H>> first, Result<? extends B, ? extends NonEmptyList<? extends H>> second, Result<? extends C, ? extends NonEmptyList<? extends H>> third, Result<? extends D, ? extends NonEmptyList<? extends H>> fourth, Result<? extends E, ? extends NonEmptyList<? extends H>> fifth, q transform) {
        AbstractC5504s.h(first, "first");
        AbstractC5504s.h(second, "second");
        AbstractC5504s.h(third, "third");
        AbstractC5504s.h(fourth, "fourth");
        AbstractC5504s.h(fifth, "fifth");
        AbstractC5504s.h(transform, "transform");
        Result.Success success = new Result.Success(L.f17438a);
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(collectErrors(AbstractC2279u.p(first, second, third, fourth, fifth, success)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        Object value = ((Result.Success) first).getValue();
        Object value2 = ((Result.Success) second).getValue();
        Object value3 = ((Result.Success) third).getValue();
        Object value4 = ((Result.Success) fourth).getValue();
        Object value5 = ((Result.Success) fifth).getValue();
        return new Result.Success(transform.invoke(value, value2, value3, value4, value5));
    }

    public static final /* synthetic */ <A, B, C, D, E, F, G, H> Result<G, NonEmptyList<H>> zipOrAccumulate(Result<? extends A, ? extends NonEmptyList<? extends H>> first, Result<? extends B, ? extends NonEmptyList<? extends H>> second, Result<? extends C, ? extends NonEmptyList<? extends H>> third, Result<? extends D, ? extends NonEmptyList<? extends H>> fourth, Result<? extends E, ? extends NonEmptyList<? extends H>> fifth, Result<? extends F, ? extends NonEmptyList<? extends H>> sixth, ie.r transform) {
        AbstractC5504s.h(first, "first");
        AbstractC5504s.h(second, "second");
        AbstractC5504s.h(third, "third");
        AbstractC5504s.h(fourth, "fourth");
        AbstractC5504s.h(fifth, "fifth");
        AbstractC5504s.h(sixth, "sixth");
        AbstractC5504s.h(transform, "transform");
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(collectErrors(AbstractC2279u.p(first, second, third, fourth, fifth, sixth)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        return new Result.Success(transform.l(((Result.Success) first).getValue(), ((Result.Success) second).getValue(), ((Result.Success) third).getValue(), ((Result.Success) fourth).getValue(), ((Result.Success) fifth).getValue(), ((Result.Success) sixth).getValue()));
    }

    public static final /* synthetic */ <A, B, C, D, E, F, G, H, I> Result<H, NonEmptyList<I>> zipOrAccumulate(Result<? extends A, ? extends NonEmptyList<? extends I>> first, Result<? extends B, ? extends NonEmptyList<? extends I>> second, Result<? extends C, ? extends NonEmptyList<? extends I>> third, Result<? extends D, ? extends NonEmptyList<? extends I>> fourth, Result<? extends E, ? extends NonEmptyList<? extends I>> fifth, Result<? extends F, ? extends NonEmptyList<? extends I>> sixth, Result<? extends G, ? extends NonEmptyList<? extends I>> seventh, s transform) {
        AbstractC5504s.h(first, "first");
        AbstractC5504s.h(second, "second");
        AbstractC5504s.h(third, "third");
        AbstractC5504s.h(fourth, "fourth");
        AbstractC5504s.h(fifth, "fifth");
        AbstractC5504s.h(sixth, "sixth");
        AbstractC5504s.h(seventh, "seventh");
        AbstractC5504s.h(transform, "transform");
        NonEmptyList nonEmptyListOrNull = NonEmptyListKt.toNonEmptyListOrNull(collectErrors(AbstractC2279u.p(first, second, third, fourth, fifth, sixth)));
        if (nonEmptyListOrNull != null) {
            return new Result.Error(nonEmptyListOrNull);
        }
        return new Result.Success(transform.m(((Result.Success) first).getValue(), ((Result.Success) second).getValue(), ((Result.Success) third).getValue(), ((Result.Success) fourth).getValue(), ((Result.Success) fifth).getValue(), ((Result.Success) sixth).getValue(), ((Result.Success) seventh).getValue()));
    }
}
