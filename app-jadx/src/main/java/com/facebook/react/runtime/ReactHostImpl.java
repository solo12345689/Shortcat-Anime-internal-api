package com.facebook.react.runtime;

import Gf.AbstractC1617k;
import Gf.C1608f0;
import Td.InterfaceC2158i;
import Ud.AbstractC2279u;
import ae.AbstractC2605b;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.view.Window;
import c7.InterfaceC3082a;
import c7.f;
import com.facebook.react.ComponentCallbacks2C3243h;
import com.facebook.react.ReactHost;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.MemoryPressureListener;
import com.facebook.react.bridge.NativeArray;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RuntimeExecutor;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.AbstractC3234u;
import com.facebook.react.devsupport.C3232s;
import com.facebook.react.devsupport.C3235v;
import com.facebook.react.devsupport.InspectorFlags;
import com.facebook.react.devsupport.InterfaceC3213b0;
import com.facebook.react.devsupport.inspector.FrameTimingSequence;
import com.facebook.react.devsupport.inspector.FrameTimingsObserver;
import com.facebook.react.devsupport.inspector.InspectorNetworkRequestListener;
import com.facebook.react.devsupport.inspector.TracingState;
import com.facebook.react.devsupport.inspector.TracingStateListener;
import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.modules.appearance.AppearanceModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.runtime.C3253a;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.react.uimanager.C3289e;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import e7.InterfaceC4656a;
import f7.InterfaceC4779a;
import h7.C4914b;
import h7.C4921i;
import ie.InterfaceC5082a;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InterfaceC5499m;
import q7.InterfaceC6143a;
import y7.InterfaceC7207a;
import y7.n;
import z5.AbstractC7283a;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¸\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 Ã\u00022\u00020\u0001:\u0004Ä\u0002Å\u0002BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001a\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001dH\u0003¢\u0006\u0004\b\u001f\u0010 J!\u0010$\u001a\u0004\u0018\u00010\u00182\u0006\u0010!\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\"H\u0003¢\u0006\u0004\b$\u0010%J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J\u0015\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+H\u0003¢\u0006\u0004\b-\u0010.J\u0019\u00101\u001a\u00020\u00152\b\u00100\u001a\u0004\u0018\u00010/H\u0003¢\u0006\u0004\b1\u00102J+\u00106\u001a\u00020\u00152\u0006\u00103\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u00105\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\b6\u00107J;\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000b0+2\u0006\u00103\u001a\u00020\u00182\b\b\u0002\u00108\u001a\u00020\b2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u001509H\u0002¢\u0006\u0004\b;\u0010<J;\u0010=\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u00103\u001a\u00020\u00182\b\b\u0002\u00108\u001a\u00020\b2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u001509H\u0002¢\u0006\u0004\b=\u0010<J\u0015\u0010>\u001a\b\u0012\u0004\u0012\u00020&0+H\u0002¢\u0006\u0004\b>\u0010.J\u0015\u0010?\u001a\b\u0012\u0004\u0012\u00020&0+H\u0003¢\u0006\u0004\b?\u0010.J%\u0010B\u001a\b\u0012\u0004\u0012\u00020&0+2\u0006\u0010@\u001a\u00020\"2\u0006\u0010A\u001a\u00020\"H\u0003¢\u0006\u0004\bB\u0010CJ\u0015\u0010D\u001a\b\u0012\u0004\u0012\u00020&0+H\u0003¢\u0006\u0004\bD\u0010.J\u0015\u0010F\u001a\b\u0012\u0004\u0012\u00020E0+H\u0002¢\u0006\u0004\bF\u0010.J\u001f\u0010H\u001a\u00020\u00152\u0006\u0010G\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\bH\u0010IJ\u001f\u0010J\u001a\u00020\u00152\u0006\u0010G\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\bJ\u0010IJA\u0010N\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0+\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010&0M2\u0006\u0010K\u001a\u00020\u00182\u0006\u0010G\u001a\u00020\u00182\u0006\u0010L\u001a\u00020\u0018H\u0002¢\u0006\u0004\bN\u0010OJ\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00020&0+2\u0006\u0010L\u001a\u00020\u0018H\u0003¢\u0006\u0004\bP\u0010QJ-\u0010U\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010L\u001a\u00020\u00182\u000e\u0010T\u001a\n\u0018\u00010Rj\u0004\u0018\u0001`SH\u0003¢\u0006\u0004\bU\u0010VJ\u000f\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u0015H\u0002¢\u0006\u0004\bZ\u0010[J\u0015\u0010]\u001a\b\u0012\u0004\u0012\u00020,0\\H\u0016¢\u0006\u0004\b]\u0010^J\u001d\u0010c\u001a\b\u0012\u0004\u0012\u00020,0\\2\u0006\u0010`\u001a\u00020_H\u0000¢\u0006\u0004\ba\u0010bJ\u001d\u0010e\u001a\b\u0012\u0004\u0012\u00020,0\\2\u0006\u0010`\u001a\u00020_H\u0000¢\u0006\u0004\bd\u0010bJ\u001d\u0010g\u001a\b\u0012\u0004\u0012\u00020,0\\2\u0006\u0010`\u001a\u00020_H\u0000¢\u0006\u0004\bf\u0010bJ#\u0010l\u001a\u00020\u00152\b\u0010i\u001a\u0004\u0018\u00010h2\b\u0010k\u001a\u0004\u0018\u00010jH\u0017¢\u0006\u0004\bl\u0010mJ\u0019\u0010l\u001a\u00020\u00152\b\u0010i\u001a\u0004\u0018\u00010hH\u0017¢\u0006\u0004\bl\u0010nJ\u0019\u0010o\u001a\u00020\u00152\b\u0010i\u001a\u0004\u0018\u00010hH\u0017¢\u0006\u0004\bo\u0010nJ\u0019\u0010p\u001a\u00020\u00152\b\u0010i\u001a\u0004\u0018\u00010hH\u0017¢\u0006\u0004\bp\u0010nJ\u000f\u0010p\u001a\u00020\u0015H\u0017¢\u0006\u0004\bp\u0010[J\u000f\u0010q\u001a\u00020\u0015H\u0017¢\u0006\u0004\bq\u0010[J\u0019\u0010q\u001a\u00020\u00152\b\u0010i\u001a\u0004\u0018\u00010hH\u0017¢\u0006\u0004\bq\u0010nJ)\u0010v\u001a\u00020u2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010r\u001a\u00020\u00182\b\u0010t\u001a\u0004\u0018\u00010sH\u0016¢\u0006\u0004\bv\u0010wJ\u000f\u0010x\u001a\u00020\u000bH\u0017¢\u0006\u0004\bx\u0010yJ\u0017\u0010{\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020zH\u0016¢\u0006\u0004\b{\u0010|J\u0017\u0010}\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020zH\u0016¢\u0006\u0004\b}\u0010|J\u001a\u0010\u0080\u0001\u001a\u00020\u00152\u0006\u0010\u007f\u001a\u00020~H\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J \u0010\u0082\u0001\u001a\b\u0012\u0004\u0012\u00020,0\\2\u0006\u0010L\u001a\u00020\u0018H\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001JE\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020,0\\2\u0006\u0010L\u001a\u00020\u00182\u000e\u0010T\u001a\n\u0018\u00010Rj\u0004\u0018\u0001`S2\u0013\u0010\u0084\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001509H\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J0\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020,0\\2\u0006\u0010L\u001a\u00020\u00182\u000e\u0010T\u001a\n\u0018\u00010Rj\u0004\u0018\u0001`SH\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0087\u0001J.\u0010\u008e\u0001\u001a\u00020\u000b\"\n\b\u0000\u0010\u0089\u0001*\u00030\u0088\u00012\u000e\u0010\u008b\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u008a\u0001H\u0000¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J0\u0010\u0091\u0001\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0089\u0001*\u00030\u0088\u00012\u000e\u0010\u008b\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u008a\u0001H\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001e\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0088\u00012\u0007\u0010\u0092\u0001\u001a\u00020\u0018H\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0093\u0001J8\u0010\u0098\u0001\u001a\u00020\u00152\u0006\u0010i\u001a\u00020h2\u0007\u0010\u0094\u0001\u001a\u00020\"2\u0007\u0010\u0095\u0001\u001a\u00020\"2\n\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u0001H\u0017¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001a\u0010\u009b\u0001\u001a\u00020\u00152\u0007\u0010\u009a\u0001\u001a\u00020\u000bH\u0017¢\u0006\u0005\b\u009b\u0001\u0010\u0017J\u001c\u0010\u009d\u0001\u001a\u00020\u00152\b\u0010\u009c\u0001\u001a\u00030\u0096\u0001H\u0017¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u001a\u0010 \u0001\u001a\u00020\u00152\u0007\u0010\u009f\u0001\u001a\u00020\u0018H\u0017¢\u0006\u0005\b \u0001\u0010\u001bJR\u0010 \u0001\u001a\u00020\u00152\u0007\u0010¡\u0001\u001a\u00020\u00182\u0006\u0010r\u001a\u00020\u00182-\u0010£\u0001\u001a(\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180¢\u0001\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180¢\u000109H\u0017¢\u0006\u0006\b \u0001\u0010¤\u0001J\u001a\u0010¥\u0001\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0006\b¥\u0001\u0010¦\u0001J!\u0010ª\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0+2\u0007\u0010§\u0001\u001a\u00020EH\u0000¢\u0006\u0006\b¨\u0001\u0010©\u0001J6\u0010±\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0+2\u0007\u0010«\u0001\u001a\u00020\"2\u0007\u0010¬\u0001\u001a\u00020\u00182\n\u0010®\u0001\u001a\u0005\u0018\u00010\u00ad\u0001H\u0000¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u001f\u0010µ\u0001\u001a\u00020\u00152\u000b\u0010²\u0001\u001a\u00060Rj\u0002`SH\u0000¢\u0006\u0006\b³\u0001\u0010´\u0001J3\u0010»\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0+2\u0006\u0010r\u001a\u00020\u00182\u0007\u0010¶\u0001\u001a\u00020\u00182\b\u0010¸\u0001\u001a\u00030·\u0001H\u0000¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u001a\u0010¾\u0001\u001a\u00020\u00152\u0006\u0010`\u001a\u00020_H\u0000¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u001a\u0010À\u0001\u001a\u00020\u00152\u0006\u0010`\u001a\u00020_H\u0000¢\u0006\u0006\b¿\u0001\u0010½\u0001J\u001a\u0010Ã\u0001\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020_H\u0000¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J\u001a\u0010Æ\u0001\u001a\u00020\u000b2\u0006\u0010r\u001a\u00020\u0018H\u0000¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J\"\u0010É\u0001\u001a\u00020\u00152\u000e\u0010È\u0001\u001a\t\u0012\u0004\u0012\u00020\u00150Ç\u0001H\u0016¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J\"\u0010Ë\u0001\u001a\u00020\u00152\u000e\u0010È\u0001\u001a\t\u0012\u0004\u0012\u00020\u00150Ç\u0001H\u0016¢\u0006\u0006\bË\u0001\u0010Ê\u0001J\u0013\u0010Í\u0001\u001a\u0004\u0018\u00010WH\u0000¢\u0006\u0005\bÌ\u0001\u0010YJ\u001c\u0010Ð\u0001\u001a\u00020\u00152\b\u0010'\u001a\u0004\u0018\u00010&H\u0001¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001J\u0011\u0010Ñ\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\bÑ\u0001\u0010[R\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0003\u0010Ò\u0001R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010Ó\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010Ô\u0001R\u0015\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\t\u0010Õ\u0001R\u0015\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010Õ\u0001R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010Ö\u0001R\u0015\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\r\u0010Ö\u0001R\u0018\u0010Ø\u0001\u001a\u00030×\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R \u0010Û\u0001\u001a\u00030Ú\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bÛ\u0001\u0010Ü\u0001\u001a\u0006\bÝ\u0001\u0010Þ\u0001R \u0010à\u0001\u001a\u00030ß\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bà\u0001\u0010á\u0001\u001a\u0006\bâ\u0001\u0010ã\u0001R\u001e\u0010å\u0001\u001a\t\u0012\u0004\u0012\u00020_0ä\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bå\u0001\u0010æ\u0001R$\u0010è\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0+0ç\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bè\u0001\u0010é\u0001R\u0019\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b'\u0010ê\u0001R\u001f\u0010ì\u0001\u001a\n\u0012\u0005\u0012\u00030ë\u00010ç\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bì\u0001\u0010é\u0001R\u0017\u0010í\u0001\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bí\u0001\u0010î\u0001R\u001e\u0010i\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010h0ï\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bi\u0010ð\u0001R9\u0010ó\u0001\u001a$\u0012\u001f\u0012\u001d\u0012\u0006\u0012\u0004\u0018\u00010h ò\u0001*\r\u0012\u0006\u0012\u0004\u0018\u00010h\u0018\u00010ñ\u00010ñ\u00010ï\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bó\u0001\u0010ð\u0001R\u0018\u0010õ\u0001\u001a\u00030ô\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bõ\u0001\u0010ö\u0001R\u0018\u0010ø\u0001\u001a\u00030÷\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bø\u0001\u0010ù\u0001R\u001b\u0010ú\u0001\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bú\u0001\u0010û\u0001R\u001b\u0010ü\u0001\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bü\u0001\u0010ý\u0001R\u001e\u0010ÿ\u0001\u001a\t\u0012\u0004\u0012\u00020z0þ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÿ\u0001\u0010\u0080\u0002R%\u0010\u0081\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00150Ç\u00010þ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0002\u0010\u0080\u0002R*\u0010\u0082\u0002\u001a\u0004\u0018\u00010W8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0082\u0002\u0010\u0083\u0002\u001a\u0005\b\u0084\u0002\u0010Y\"\u0006\b\u0085\u0002\u0010\u0086\u0002R\u001c\u0010\u0088\u0002\u001a\u0005\u0018\u00010\u0087\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0002\u0010\u0089\u0002R\u0019\u0010\u008a\u0002\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0002\u0010Ö\u0001R!\u0010\u008b\u0002\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u008b\u0002\u0010\u008c\u0002R!\u0010\u008d\u0002\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010+8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u008d\u0002\u0010\u008c\u0002R!\u0010\u008e\u0002\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u008e\u0002\u0010\u008c\u0002R&\u0010\u0091\u0002\u001a\u0011\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00180¢\u00018CX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008f\u0002\u0010\u0090\u0002R,\u0010\u0095\u0002\u001a\u0004\u0018\u00010h2\b\u0010i\u001a\u0004\u0018\u00010h8@@BX\u0080\u000e¢\u0006\u000f\u001a\u0006\b\u0092\u0002\u0010\u0093\u0002\"\u0005\b\u0094\u0002\u0010nR\u001c\u0010\u0097\u0002\u001a\b\u0012\u0004\u0012\u00020E0+8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0096\u0002\u0010.R\u001c\u0010\u0098\u0002\u001a\b\u0012\u0004\u0012\u00020\u000b0+8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0002\u0010.R\u0018\u0010\u009c\u0002\u001a\u00030\u0099\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009a\u0002\u0010\u009b\u0002R\u0019\u0010\u009f\u0002\u001a\u0004\u0018\u00010/8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009d\u0002\u0010\u009e\u0002R\u0016\u0010¡\u0002\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b \u0002\u0010yR\u001a\u0010¥\u0002\u001a\u0005\u0018\u00010¢\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b£\u0002\u0010¤\u0002R\u0019\u0010§\u0002\u001a\u0004\u0018\u00010h8@X\u0080\u0004¢\u0006\b\u001a\u0006\b¦\u0002\u0010\u0093\u0002R\u0018\u0010«\u0002\u001a\u00030¨\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b©\u0002\u0010ª\u0002R\u001a\u0010¯\u0002\u001a\u0005\u0018\u00010¬\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u00ad\u0002\u0010®\u0002R\u001f\u0010³\u0002\u001a\n\u0012\u0005\u0012\u00030\u0088\u00010°\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b±\u0002\u0010²\u0002R\u001a\u0010·\u0002\u001a\u0005\u0018\u00010´\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bµ\u0002\u0010¶\u0002R\u001a\u0010»\u0002\u001a\u0005\u0018\u00010¸\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b¹\u0002\u0010º\u0002R\u001a\u0010¿\u0002\u001a\u0005\u0018\u00010¼\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b½\u0002\u0010¾\u0002R\u0017\u0010Â\u0002\u001a\u00020j8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÀ\u0002\u0010Á\u0002¨\u0006Æ\u0002"}, d2 = {"Lcom/facebook/react/runtime/ReactHostImpl;", "Lcom/facebook/react/ReactHost;", "Landroid/content/Context;", "context", "Lcom/facebook/react/runtime/f;", "reactHostDelegate", "Lcom/facebook/react/fabric/ComponentFactory;", "componentFactory", "Ljava/util/concurrent/Executor;", "bgExecutor", "uiExecutor", "", "allowPackagerServerAccess", "useDevSupport", "Lcom/facebook/react/devsupport/b0;", "devSupportManagerFactory", "<init>", "(Landroid/content/Context;Lcom/facebook/react/runtime/f;Lcom/facebook/react/fabric/ComponentFactory;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZLcom/facebook/react/devsupport/b0;)V", "delegate", "(Landroid/content/Context;Lcom/facebook/react/runtime/f;Lcom/facebook/react/fabric/ComponentFactory;ZZ)V", "enabled", "LTd/L;", "maybeEnableDevSupport", "(Z)V", "", "message", "setPausedInDebuggerMessage", "(Ljava/lang/String;)V", "url", "Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;", "listener", "loadNetworkResource", "(Ljava/lang/String;Lcom/facebook/react/devsupport/inspector/InspectorNetworkRequestListener;)V", "format", "", "quality", "captureScreenshot", "(Ljava/lang/String;I)Ljava/lang/String;", "Lcom/facebook/react/runtime/ReactInstance;", "reactInstance", "Lcom/facebook/react/bridge/MemoryPressureListener;", "createMemoryPressureListener", "(Lcom/facebook/react/runtime/ReactInstance;)Lcom/facebook/react/bridge/MemoryPressureListener;", "Ly7/n;", "Ljava/lang/Void;", "getOrCreateStartTask", "()Ly7/n;", "Lcom/facebook/react/bridge/ReactContext;", "currentContext", "moveToHostDestroy", "(Lcom/facebook/react/bridge/ReactContext;)V", "callingMethod", "", "throwable", "raiseSoftException", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "executor", "Lkotlin/Function1;", "runnable", "callWithExistingReactInstance", "(Ljava/lang/String;Ljava/util/concurrent/Executor;Lkotlin/jvm/functions/Function1;)Ly7/n;", "callAfterGetOrCreateReactInstance", "getOrCreateReactInstance", "waitThenCallGetOrCreateReactInstanceTask", "tryNum", "maxTries", "waitThenCallGetOrCreateReactInstanceTaskWithRetries", "(II)Ly7/n;", "getOrCreateReactInstanceTask", "Lcom/facebook/react/bridge/JSBundleLoader;", "loadJSBundleFromMetro", "method", "stopAttachedSurfaces", "(Ljava/lang/String;Lcom/facebook/react/runtime/ReactInstance;)V", "startAttachedSurfaces", "tag", "reason", "Lkotlin/Function2;", "createReactInstanceUnwrapper", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lkotlin/jvm/functions/Function2;", "getOrCreateReloadTask", "(Ljava/lang/String;)Ly7/n;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "ex", "getOrCreateDestroyTask", "(Ljava/lang/String;Ljava/lang/Exception;)Ly7/n;", "Lcom/facebook/react/runtime/ReactHostInspectorTarget;", "createReactHostInspectorTarget", "()Lcom/facebook/react/runtime/ReactHostInspectorTarget;", "destroyReactHostInspectorTarget", "()V", "Le7/a;", "start", "()Le7/a;", "Lcom/facebook/react/runtime/j0;", "surface", "prerenderSurface$ReactAndroid_release", "(Lcom/facebook/react/runtime/j0;)Le7/a;", "prerenderSurface", "startSurface$ReactAndroid_release", "startSurface", "stopSurface$ReactAndroid_release", "stopSurface", "Landroid/app/Activity;", "activity", "Lq7/a;", "defaultBackButtonImpl", "onHostResume", "(Landroid/app/Activity;Lq7/a;)V", "(Landroid/app/Activity;)V", "onHostLeaveHint", "onHostPause", "onHostDestroy", "moduleName", "Landroid/os/Bundle;", "initialProps", "Lf7/a;", "createSurface", "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)Lf7/a;", "onBackPressed", "()Z", "Lcom/facebook/react/z;", "addReactInstanceEventListener", "(Lcom/facebook/react/z;)V", "removeReactInstanceEventListener", "Lcom/facebook/react/devsupport/u;", "config", "setDevMenuConfiguration", "(Lcom/facebook/react/devsupport/u;)V", "reload", "(Ljava/lang/String;)Le7/a;", "onDestroyFinished", "destroy", "(Ljava/lang/String;Ljava/lang/Exception;Lkotlin/jvm/functions/Function1;)Le7/a;", "(Ljava/lang/String;Ljava/lang/Exception;)Le7/a;", "Lcom/facebook/react/bridge/NativeModule;", "T", "Ljava/lang/Class;", "nativeModuleInterface", "hasNativeModule$ReactAndroid_release", "(Ljava/lang/Class;)Z", "hasNativeModule", "getNativeModule$ReactAndroid_release", "(Ljava/lang/Class;)Lcom/facebook/react/bridge/NativeModule;", "getNativeModule", "nativeModuleName", "(Ljava/lang/String;)Lcom/facebook/react/bridge/NativeModule;", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(Landroid/app/Activity;IILandroid/content/Intent;)V", "hasFocus", "onWindowFocusChange", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "filePath", "setBundleSource", "debugServerHost", "", "queryMapper", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "onConfigurationChanged", "(Landroid/content/Context;)V", "bundleLoader", "loadBundle$ReactAndroid_release", "(Lcom/facebook/react/bridge/JSBundleLoader;)Ly7/n;", "loadBundle", "segmentId", "path", "Lcom/facebook/react/bridge/Callback;", "callback", "registerSegment$ReactAndroid_release", "(ILjava/lang/String;Lcom/facebook/react/bridge/Callback;)Ly7/n;", "registerSegment", "e", "handleHostException$ReactAndroid_release", "(Ljava/lang/Exception;)V", "handleHostException", "methodName", "Lcom/facebook/react/bridge/NativeArray;", "args", "callFunctionOnModule$ReactAndroid_release", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/NativeArray;)Ly7/n;", "callFunctionOnModule", "attachSurface$ReactAndroid_release", "(Lcom/facebook/react/runtime/j0;)V", "attachSurface", "detachSurface$ReactAndroid_release", "detachSurface", "isSurfaceAttached$ReactAndroid_release", "(Lcom/facebook/react/runtime/j0;)Z", "isSurfaceAttached", "isSurfaceWithModuleNameAttached$ReactAndroid_release", "(Ljava/lang/String;)Z", "isSurfaceWithModuleNameAttached", "Lkotlin/Function0;", "onBeforeDestroy", "addBeforeDestroyListener", "(Lie/a;)V", "removeBeforeDestroyListener", "getOrCreateReactHostInspectorTarget$ReactAndroid_release", "getOrCreateReactHostInspectorTarget", "unregisterInstanceFromInspector$ReactAndroid_release", "(Lcom/facebook/react/runtime/ReactInstance;)V", "unregisterInstanceFromInspector", "invalidate", "Landroid/content/Context;", "Lcom/facebook/react/runtime/f;", "Lcom/facebook/react/fabric/ComponentFactory;", "Ljava/util/concurrent/Executor;", "Z", "Lcom/facebook/react/runtime/b0;", "reactHostImplDevHelper", "Lcom/facebook/react/runtime/b0;", "Lc7/f;", "devSupportManager", "Lc7/f;", "getDevSupportManager", "()Lc7/f;", "Lcom/facebook/react/h;", "memoryPressureRouter", "Lcom/facebook/react/h;", "getMemoryPressureRouter", "()Lcom/facebook/react/h;", "", "attachedSurfaces", "Ljava/util/Set;", "Lcom/facebook/react/runtime/a;", "createReactInstanceTaskRef", "Lcom/facebook/react/runtime/a;", "Lcom/facebook/react/runtime/ReactInstance;", "Lcom/facebook/react/runtime/c;", "bridgelessReactContextRef", DiagnosticsEntry.ID_KEY, "I", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "lastUsedActivityRef", "Lcom/facebook/react/runtime/c0;", "stateTracker", "Lcom/facebook/react/runtime/c0;", "Lcom/facebook/react/runtime/h0;", "reactLifecycleStateManager", "Lcom/facebook/react/runtime/h0;", "memoryPressureListener", "Lcom/facebook/react/bridge/MemoryPressureListener;", "defaultHardwareBackBtnHandler", "Lq7/a;", "", "reactInstanceEventListeners", "Ljava/util/List;", "beforeDestroyListeners", "reactHostInspectorTarget", "Lcom/facebook/react/runtime/ReactHostInspectorTarget;", "getReactHostInspectorTarget$ReactAndroid_release", "setReactHostInspectorTarget$ReactAndroid_release", "(Lcom/facebook/react/runtime/ReactHostInspectorTarget;)V", "Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;", "frameTimingsObserver", "Lcom/facebook/react/devsupport/inspector/FrameTimingsObserver;", "hostInvalidated", "startTask", "Ly7/n;", "reloadTask", "destroyTask", "getHostMetadata", "()Ljava/util/Map;", "hostMetadata", "getCurrentActivity$ReactAndroid_release", "()Landroid/app/Activity;", "setCurrentActivity", "currentActivity", "getJsBundleLoader", "jsBundleLoader", "isMetroRunning", "Lcom/facebook/react/common/LifecycleState;", "getLifecycleState", "()Lcom/facebook/react/common/LifecycleState;", "lifecycleState", "getCurrentReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "currentReactContext", "isInstanceInitialized$ReactAndroid_release", "isInstanceInitialized", "Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;", "getReactQueueConfiguration", "()Lcom/facebook/react/bridge/queue/ReactQueueConfiguration;", "reactQueueConfiguration", "getLastUsedActivity$ReactAndroid_release", "lastUsedActivity", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "getEventDispatcher$ReactAndroid_release", "()Lcom/facebook/react/uimanager/events/EventDispatcher;", "eventDispatcher", "Lcom/facebook/react/fabric/FabricUIManager;", "getUiManager$ReactAndroid_release", "()Lcom/facebook/react/fabric/FabricUIManager;", "uiManager", "", "getNativeModules$ReactAndroid_release", "()Ljava/util/Collection;", "nativeModules", "Lcom/facebook/react/bridge/RuntimeExecutor;", "getRuntimeExecutor$ReactAndroid_release", "()Lcom/facebook/react/bridge/RuntimeExecutor;", "runtimeExecutor", "Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;", "getJsCallInvokerHolder$ReactAndroid_release", "()Lcom/facebook/react/turbomodule/core/interfaces/CallInvokerHolder;", "jsCallInvokerHolder", "Lcom/facebook/react/bridge/JavaScriptContextHolder;", "getJavaScriptContextHolder$ReactAndroid_release", "()Lcom/facebook/react/bridge/JavaScriptContextHolder;", "javaScriptContextHolder", "getDefaultBackButtonHandler$ReactAndroid_release", "()Lq7/a;", "defaultBackButtonHandler", "Companion", "b", "a", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactHostImpl implements ReactHost {
    private static final int BRIDGELESS_MARKER_INSTANCE_KEY = 1;
    private static final String TAG = "ReactHost";
    private final AtomicReference<Activity> activity;
    private final boolean allowPackagerServerAccess;
    private final Set<j0> attachedSurfaces;
    private final List<InterfaceC5082a> beforeDestroyListeners;
    private final Executor bgExecutor;
    private final C3253a bridgelessReactContextRef;
    private final ComponentFactory componentFactory;
    private final Context context;
    private final C3253a createReactInstanceTaskRef;
    private InterfaceC6143a defaultHardwareBackBtnHandler;
    private y7.n destroyTask;
    private final c7.f devSupportManager;
    private FrameTimingsObserver frameTimingsObserver;
    private volatile boolean hostInvalidated;
    private final int id;
    private final AtomicReference<WeakReference<Activity>> lastUsedActivityRef;
    private MemoryPressureListener memoryPressureListener;
    private final ComponentCallbacks2C3243h memoryPressureRouter;
    private final InterfaceC3258f reactHostDelegate;
    private final b0 reactHostImplDevHelper;
    private ReactHostInspectorTarget reactHostInspectorTarget;
    private ReactInstance reactInstance;
    private final List<com.facebook.react.z> reactInstanceEventListeners;
    private final h0 reactLifecycleStateManager;
    private y7.n reloadTask;
    private y7.n startTask;
    private final c0 stateTracker;
    private final Executor uiExecutor;
    private final boolean useDevSupport;
    private static final a Companion = new a(null);
    private static final AtomicInteger counter = new AtomicInteger(0);

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ReactInstance f37204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ReactContext f37205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f37206c;

        public b(ReactInstance instance, ReactContext context, boolean z10) {
            AbstractC5504s.h(instance, "instance");
            AbstractC5504s.h(context, "context");
            this.f37204a = instance;
            this.f37205b = context;
            this.f37206c = z10;
        }

        public final ReactContext a() {
            return this.f37205b;
        }

        public final ReactInstance b() {
            return this.f37204a;
        }

        public final boolean c() {
            return this.f37206c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37207a;

        static {
            int[] iArr = new int[TracingState.values().length];
            try {
                iArr[TracingState.ENABLED_IN_BACKGROUND_MODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TracingState.ENABLED_IN_CDP_MODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TracingState.DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37207a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class d implements InterfaceC3082a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f37210c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.facebook.react.devsupport.Y f37211d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ y7.o f37212e;

        d(String str, String str2, com.facebook.react.devsupport.Y y10, y7.o oVar) {
            this.f37209b = str;
            this.f37210c = str2;
            this.f37211d = y10;
            this.f37212e = oVar;
        }

        @Override // c7.InterfaceC3082a
        public void a() {
            ReactHostImpl.this.stateTracker.a(this.f37209b, "Creating BundleLoader");
            this.f37212e.d(JSBundleLoader.INSTANCE.createCachedBundleFromNetworkLoader(this.f37210c, this.f37211d.j()));
        }

        @Override // c7.InterfaceC3082a
        public void b(Exception cause) {
            AbstractC5504s.h(cause, "cause");
            this.f37212e.c(cause);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class e implements InterfaceC7207a, InterfaceC5499m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f37213a;

        e(Function1 function) {
            AbstractC5504s.h(function, "function");
            this.f37213a = function;
        }

        @Override // y7.InterfaceC7207a
        public final /* synthetic */ Object a(y7.n nVar) {
            return this.f37213a.invoke(nVar);
        }

        @Override // kotlin.jvm.internal.InterfaceC5499m
        public final InterfaceC2158i b() {
            return this.f37213a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC7207a) && (obj instanceof InterfaceC5499m)) {
                return AbstractC5504s.c(b(), ((InterfaceC5499m) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    static final class f extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f37214a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1 f37216c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f37217d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f37218e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Function1 function1, String str, String str2, Zd.e eVar) {
            super(2, eVar);
            this.f37216c = function1;
            this.f37217d = str;
            this.f37218e = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Zd.e create(Object obj, Zd.e eVar) {
            return ReactHostImpl.this.new f(this.f37216c, this.f37217d, this.f37218e, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Gf.O o10, Zd.e eVar) {
            return ((f) create(o10, eVar)).invokeSuspend(Td.L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC2605b.f();
            if (this.f37214a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Td.v.b(obj);
            c7.f devSupportManager = ReactHostImpl.this.getDevSupportManager();
            AbstractC5504s.f(devSupportManager, "null cannot be cast to non-null type com.facebook.react.devsupport.DevSupportManagerBase");
            ((com.facebook.react.devsupport.Y) devSupportManager).u0().j();
            x7.f fVarJ = ((com.facebook.react.devsupport.Y) ReactHostImpl.this.getDevSupportManager()).D().j();
            fVarJ.g(this.f37216c);
            fVarJ.f(this.f37217d);
            ((com.facebook.react.devsupport.Y) ReactHostImpl.this.getDevSupportManager()).P0(this.f37218e);
            ReactHostImpl.this.reload("Changed bundle source");
            return Td.L.f17438a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    public static final class g implements f.a {
        g() {
        }

        @Override // c7.f.a
        public void onResume() {
            UiThreadUtil.assertOnUiThread();
            ReactHostInspectorTarget reactHostInspectorTarget = ReactHostImpl.this.getReactHostInspectorTarget();
            if (reactHostInspectorTarget != null) {
                reactHostInspectorTarget.sendDebuggerResumeCommand();
            }
        }
    }

    public ReactHostImpl(Context context, InterfaceC3258f reactHostDelegate, ComponentFactory componentFactory, Executor bgExecutor, Executor uiExecutor, boolean z10, boolean z11, InterfaceC3213b0 interfaceC3213b0) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(reactHostDelegate, "reactHostDelegate");
        AbstractC5504s.h(componentFactory, "componentFactory");
        AbstractC5504s.h(bgExecutor, "bgExecutor");
        AbstractC5504s.h(uiExecutor, "uiExecutor");
        this.context = context;
        this.reactHostDelegate = reactHostDelegate;
        this.componentFactory = componentFactory;
        this.bgExecutor = bgExecutor;
        this.uiExecutor = uiExecutor;
        this.allowPackagerServerAccess = z10;
        this.useDevSupport = z11;
        b0 b0Var = new b0(this);
        this.reactHostImplDevHelper = b0Var;
        InterfaceC3213b0 c3232s = interfaceC3213b0 == null ? new C3232s() : interfaceC3213b0;
        Context applicationContext = context.getApplicationContext();
        AbstractC5504s.g(applicationContext, "getApplicationContext(...)");
        c7.f fVarA = c3232s.a(applicationContext, b0Var, reactHostDelegate.getJsMainModulePath(), true, null, null, 2, null, null, null, null, z11);
        if (fVarA instanceof com.facebook.react.devsupport.Y) {
            ((com.facebook.react.devsupport.Y) fVarA).Q0(b0Var);
        }
        this.devSupportManager = fVarA;
        this.memoryPressureRouter = new ComponentCallbacks2C3243h(context);
        this.attachedSurfaces = new HashSet();
        this.createReactInstanceTaskRef = new C3253a(y7.n.f64899g.r(null));
        this.bridgelessReactContextRef = new C3253a(null, 1, null);
        int andIncrement = counter.getAndIncrement();
        this.id = andIncrement;
        this.activity = new AtomicReference<>();
        this.lastUsedActivityRef = new AtomicReference<>(new WeakReference(null));
        c0 c0Var = new c0(andIncrement);
        this.stateTracker = c0Var;
        this.reactLifecycleStateManager = new h0(c0Var);
        this.reactInstanceEventListeners = new CopyOnWriteArrayList();
        this.beforeDestroyListeners = new CopyOnWriteArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_defaultBackButtonHandler_$lambda$18(ReactHostImpl reactHostImpl) {
        UiThreadUtil.assertOnUiThread();
        InterfaceC6143a interfaceC6143a = reactHostImpl.defaultHardwareBackBtnHandler;
        if (interfaceC6143a != null) {
            interfaceC6143a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _get_isMetroRunning_$lambda$46(ReactHostImpl reactHostImpl, String str, y7.o oVar, boolean z10) {
        reactHostImpl.stateTracker.a(str, "Async result = " + z10);
        oVar.d(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y7.n _get_jsBundleLoader_$lambda$45(ReactHostImpl reactHostImpl, y7.n task) {
        AbstractC5504s.h(task, "task");
        Object objS = task.s();
        if (objS != null) {
            return ((Boolean) objS).booleanValue() ? reactHostImpl.loadJSBundleFromMetro() : y7.n.f64899g.r(reactHostImpl.reactHostDelegate.getJsBundleLoader());
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final y7.n callAfterGetOrCreateReactInstance(final String callingMethod, Executor executor, final Function1 runnable) {
        return getOrCreateReactInstance().y(new InterfaceC7207a() { // from class: com.facebook.react.runtime.V
            @Override // y7.InterfaceC7207a
            public final Object a(y7.n nVar) {
                return ReactHostImpl.callAfterGetOrCreateReactInstance$lambda$32(this.f37245a, callingMethod, runnable, nVar);
            }
        }, executor);
    }

    static /* synthetic */ y7.n callAfterGetOrCreateReactInstance$default(ReactHostImpl reactHostImpl, String str, Executor executor, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            executor = y7.n.f64900h;
        }
        return reactHostImpl.callAfterGetOrCreateReactInstance(str, executor, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void callAfterGetOrCreateReactInstance$lambda$32(ReactHostImpl reactHostImpl, String str, Function1 function1, y7.n task) {
        AbstractC5504s.h(task, "task");
        ReactInstance reactInstance = (ReactInstance) task.s();
        if (reactInstance != null) {
            function1.invoke(reactInstance);
            return null;
        }
        raiseSoftException$default(reactHostImpl, "callAfterGetOrCreateReactInstance(" + str + ")", "Execute: reactInstance is null. Dropping work.", null, 4, null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L callFunctionOnModule$lambda$21(String str, String str2, NativeArray nativeArray, ReactInstance reactInstance) {
        AbstractC5504s.h(reactInstance, "reactInstance");
        reactInstance.callFunctionOnModule(str, str2, nativeArray);
        return Td.L.f17438a;
    }

    private final y7.n callWithExistingReactInstance(final String callingMethod, Executor executor, final Function1 runnable) {
        return ((y7.n) this.createReactInstanceTaskRef.a()).y(new InterfaceC7207a() { // from class: com.facebook.react.runtime.M
            @Override // y7.InterfaceC7207a
            public final Object a(y7.n nVar) {
                return ReactHostImpl.callWithExistingReactInstance$lambda$31(this.f37190a, callingMethod, runnable, nVar);
            }
        }, executor);
    }

    static /* synthetic */ y7.n callWithExistingReactInstance$default(ReactHostImpl reactHostImpl, String str, Executor executor, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            executor = y7.n.f64900h;
        }
        return reactHostImpl.callWithExistingReactInstance(str, executor, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean callWithExistingReactInstance$lambda$31(ReactHostImpl reactHostImpl, String str, Function1 function1, y7.n task) {
        boolean z10;
        AbstractC5504s.h(task, "task");
        ReactInstance reactInstance = (ReactInstance) task.s();
        if (reactInstance == null) {
            raiseSoftException$default(reactHostImpl, "callWithExistingReactInstance(" + str + ")", "Execute: reactInstance is null. Dropping work.", null, 4, null);
            z10 = false;
        } else {
            function1.invoke(reactInstance);
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    private final String captureScreenshot(String format, int quality) {
        Window window;
        Activity currentActivity$ReactAndroid_release = getCurrentActivity$ReactAndroid_release();
        if (currentActivity$ReactAndroid_release == null || (window = currentActivity$ReactAndroid_release.getWindow()) == null) {
            return null;
        }
        View rootView = window.getDecorView().getRootView();
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        if (width <= 0 || height <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        rootView.draw(new Canvas(bitmapCreateBitmap));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap.CompressFormat compressFormat = AbstractC5504s.c(format, "jpeg") ? Bitmap.CompressFormat.JPEG : AbstractC5504s.c(format, "webp") ? Build.VERSION.SDK_INT >= 30 ? Bitmap.CompressFormat.WEBP_LOSSY : Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.PNG;
        if (quality < 0 || quality >= 101) {
            quality = 80;
        }
        bitmapCreateBitmap.compress(compressFormat, quality, byteArrayOutputStream);
        bitmapCreateBitmap.recycle();
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
    }

    private final MemoryPressureListener createMemoryPressureListener(ReactInstance reactInstance) {
        final WeakReference weakReference = new WeakReference(reactInstance);
        return new MemoryPressureListener() { // from class: com.facebook.react.runtime.u
            @Override // com.facebook.react.bridge.MemoryPressureListener
            public final void handleMemoryPressure(int i10) {
                ReactHostImpl.createMemoryPressureListener$lambda$13(this.f37340a, weakReference, i10);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createMemoryPressureListener$lambda$13(ReactHostImpl reactHostImpl, final WeakReference weakReference, final int i10) {
        reactHostImpl.bgExecutor.execute(new Runnable() { // from class: com.facebook.react.runtime.r
            @Override // java.lang.Runnable
            public final void run() {
                ReactHostImpl.createMemoryPressureListener$lambda$13$lambda$12(weakReference, i10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createMemoryPressureListener$lambda$13$lambda$12(WeakReference weakReference, int i10) {
        ReactInstance reactInstance = (ReactInstance) weakReference.get();
        if (reactInstance != null) {
            reactInstance.u(i10);
        }
    }

    private final ReactHostInspectorTarget createReactHostInspectorTarget() {
        final ReactHostInspectorTarget reactHostInspectorTarget = new ReactHostInspectorTarget(this);
        reactHostInspectorTarget.registerTracingStateListener(new TracingStateListener() { // from class: com.facebook.react.runtime.B
            @Override // com.facebook.react.devsupport.inspector.TracingStateListener
            public final void onStateChanged(TracingState tracingState, boolean z10) {
                ReactHostImpl.createReactHostInspectorTarget$lambda$68(this.f37160a, reactHostInspectorTarget, tracingState, z10);
            }
        });
        return reactHostInspectorTarget;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createReactHostInspectorTarget$lambda$68(ReactHostImpl reactHostImpl, final ReactHostInspectorTarget reactHostInspectorTarget, TracingState state, boolean z10) {
        AbstractC5504s.h(state, "state");
        int i10 = c.f37207a[state.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                throw new Td.r();
            }
            FrameTimingsObserver frameTimingsObserver = reactHostImpl.frameTimingsObserver;
            if (frameTimingsObserver != null) {
                frameTimingsObserver.stop();
            }
            reactHostImpl.frameTimingsObserver = null;
            return;
        }
        if (InspectorFlags.getFrameRecordingEnabled()) {
            FrameTimingsObserver frameTimingsObserver2 = new FrameTimingsObserver(z10, new Function1() { // from class: com.facebook.react.runtime.o
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ReactHostImpl.createReactHostInspectorTarget$lambda$68$lambda$67(reactHostInspectorTarget, (FrameTimingSequence) obj);
                }
            });
            Activity currentActivity$ReactAndroid_release = reactHostImpl.getCurrentActivity$ReactAndroid_release();
            frameTimingsObserver2.setCurrentWindow(currentActivity$ReactAndroid_release != null ? currentActivity$ReactAndroid_release.getWindow() : null);
            frameTimingsObserver2.start();
            reactHostImpl.frameTimingsObserver = frameTimingsObserver2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L createReactHostInspectorTarget$lambda$68$lambda$67(ReactHostInspectorTarget reactHostInspectorTarget, FrameTimingSequence frameTimingsSequence) {
        AbstractC5504s.h(frameTimingsSequence, "frameTimingsSequence");
        reactHostInspectorTarget.recordFrameTimings(frameTimingsSequence);
        return Td.L.f17438a;
    }

    private final Function2 createReactInstanceUnwrapper(final String tag, final String method, final String reason) {
        return new Function2() { // from class: com.facebook.react.runtime.T
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ReactHostImpl.createReactInstanceUnwrapper$lambda$49(this.f37240a, tag, reason, method, (y7.n) obj, (String) obj2);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactInstance createReactInstanceUnwrapper$lambda$49(ReactHostImpl reactHostImpl, String str, String str2, String str3, y7.n task, String stage) {
        AbstractC5504s.h(task, "task");
        AbstractC5504s.h(stage, "stage");
        ReactInstance reactInstance = (ReactInstance) task.s();
        ReactInstance reactInstance2 = reactHostImpl.reactInstance;
        String str4 = "Stage: " + stage;
        String str5 = str + " reason: " + str2;
        if (task.v()) {
            Exception excR = task.r();
            if (excR == null) {
                throw new IllegalStateException("Required value was null.");
            }
            raiseSoftException$default(reactHostImpl, str3, str + ": ReactInstance task faulted. " + str4 + ". " + ("Fault reason: " + excR.getMessage()) + ". " + str5, null, 4, null);
            return reactInstance2;
        }
        if (task.t()) {
            raiseSoftException$default(reactHostImpl, str3, str + ": ReactInstance task cancelled. " + str4 + ". " + str5, null, 4, null);
            return reactInstance2;
        }
        if (reactInstance == null) {
            raiseSoftException$default(reactHostImpl, str3, str + ": ReactInstance task returned null. " + str4 + ". " + str5, null, 4, null);
            return reactInstance2;
        }
        if (reactInstance2 != null && !AbstractC5504s.c(reactInstance, reactInstance2)) {
            raiseSoftException$default(reactHostImpl, str3, str + ": Detected two different ReactInstances. Returning old. " + str4 + ". " + str5, null, 4, null);
        }
        return reactInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y7.n destroy$lambda$11(final ReactHostImpl reactHostImpl, final String str, final Exception exc) {
        y7.n nVar = reactHostImpl.reloadTask;
        if (nVar == null) {
            return reactHostImpl.getOrCreateDestroyTask(str, exc);
        }
        reactHostImpl.stateTracker.a("destroy()", "Reloading React Native. Waiting for reload to finish before destroying React Native.");
        return nVar.o(new InterfaceC7207a() { // from class: com.facebook.react.runtime.W
            @Override // y7.InterfaceC7207a
            public final Object a(y7.n nVar2) {
                return ReactHostImpl.destroy$lambda$11$lambda$10(this.f37248a, str, exc, nVar2);
            }
        }, reactHostImpl.bgExecutor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y7.n destroy$lambda$11$lambda$10(ReactHostImpl reactHostImpl, String str, Exception exc, y7.n it) {
        AbstractC5504s.h(it, "it");
        return reactHostImpl.getOrCreateDestroyTask(str, exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void destroy$lambda$9(Function1 function1, y7.n task) {
        AbstractC5504s.h(task, "task");
        function1.invoke(Boolean.valueOf(task.u() && !task.v()));
        return null;
    }

    private final void destroyReactHostInspectorTarget() {
        FrameTimingsObserver frameTimingsObserver = this.frameTimingsObserver;
        if (frameTimingsObserver != null) {
            frameTimingsObserver.stop();
        }
        this.frameTimingsObserver = null;
        ReactHostInspectorTarget reactHostInspectorTarget = this.reactHostInspectorTarget;
        if (reactHostInspectorTarget != null) {
            reactHostInspectorTarget.close();
        }
        this.reactHostInspectorTarget = null;
    }

    private final Map<String, String> getHostMetadata() {
        return com.facebook.react.modules.systeminfo.a.f(this.context);
    }

    private final y7.n getJsBundleLoader() {
        c0.b(this.stateTracker, "getJSBundleLoader()", null, 2, null);
        if (getDevSupportManager().C() != null) {
            try {
                n.a aVar = y7.n.f64899g;
                JSBundleLoader.Companion companion = JSBundleLoader.INSTANCE;
                String strC = getDevSupportManager().C();
                if (strC != null) {
                    return aVar.r(companion.createFileLoader(strC));
                }
                throw new IllegalStateException("Required value was null.");
            } catch (Exception e10) {
                return y7.n.f64899g.q(e10);
            }
        }
        if (this.useDevSupport && this.allowPackagerServerAccess) {
            return isMetroRunning().B(new InterfaceC7207a() { // from class: com.facebook.react.runtime.Y
                @Override // y7.InterfaceC7207a
                public final Object a(y7.n nVar) {
                    return ReactHostImpl._get_jsBundleLoader_$lambda$45(this.f37254a, nVar);
                }
            }, this.bgExecutor);
        }
        if (Y6.a.f22860b) {
            AbstractC7283a.b(TAG, "Packager server access is disabled in this environment");
        }
        try {
            return y7.n.f64899g.r(this.reactHostDelegate.getJsBundleLoader());
        } catch (Exception e11) {
            return y7.n.f64899g.q(e11);
        }
    }

    private final y7.n getOrCreateDestroyTask(final String reason, Exception ex) {
        final String str = "getOrCreateDestroyTask()";
        c0.b(this.stateTracker, "getOrCreateDestroyTask()", null, 2, null);
        raiseSoftException("getOrCreateDestroyTask()", reason, ex);
        y7.n nVar = this.destroyTask;
        if (nVar != null) {
            return nVar;
        }
        final Function2 function2CreateReactInstanceUnwrapper = createReactInstanceUnwrapper("Destroy", "getOrCreateDestroyTask()", reason);
        this.stateTracker.a("getOrCreateDestroyTask()", "Resetting createReactInstance task ref");
        y7.n nVarM = y7.n.m(((y7.n) this.createReactInstanceTaskRef.b()).o(new InterfaceC7207a() { // from class: com.facebook.react.runtime.G
            @Override // y7.InterfaceC7207a
            public final Object a(y7.n nVar2) {
                return ReactHostImpl.getOrCreateDestroyTask$lambda$60(this.f37168a, str, function2CreateReactInstanceUnwrapper, reason, nVar2);
            }
        }, this.uiExecutor).o(new InterfaceC7207a() { // from class: com.facebook.react.runtime.H
            @Override // y7.InterfaceC7207a
            public final Object a(y7.n nVar2) {
                return ReactHostImpl.getOrCreateDestroyTask$lambda$62(function2CreateReactInstanceUnwrapper, this, str, nVar2);
            }
        }, this.bgExecutor).o(new InterfaceC7207a() { // from class: com.facebook.react.runtime.I
            @Override // y7.InterfaceC7207a
            public final Object a(y7.n nVar2) {
                return ReactHostImpl.getOrCreateDestroyTask$lambda$63(function2CreateReactInstanceUnwrapper, this, str, reason, nVar2);
            }
        }, this.uiExecutor).o(new InterfaceC7207a() { // from class: com.facebook.react.runtime.J
            @Override // y7.InterfaceC7207a
            public final Object a(y7.n nVar2) {
                return ReactHostImpl.getOrCreateDestroyTask$lambda$64(function2CreateReactInstanceUnwrapper, this, str, nVar2);
            }
        }, this.bgExecutor), new InterfaceC7207a() { // from class: com.facebook.react.runtime.K
            @Override // y7.InterfaceC7207a
            public final Object a(y7.n nVar2) {
                return ReactHostImpl.getOrCreateDestroyTask$lambda$65(this.f37184a, str, reason, nVar2);
            }
        }, null, 2, null);
        this.destroyTask = nVarM;
        return nVarM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y7.n getOrCreateDestroyTask$lambda$60(ReactHostImpl reactHostImpl, String str, Function2 function2, String str2, y7.n task) {
        ReactHostImpl reactHostImpl2;
        String str3;
        AbstractC5504s.h(task, "task");
        reactHostImpl.stateTracker.a(str, "Starting React Native destruction");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "1: Starting destroy");
        reactHostImpl.unregisterInstanceFromInspector$ReactAndroid_release(reactInstance);
        if (reactHostImpl.hostInvalidated) {
            reactHostImpl.destroyReactHostInspectorTarget();
        }
        if (reactHostImpl.useDevSupport) {
            reactHostImpl.stateTracker.a(str, "DevSupportManager cleanup");
            reactHostImpl.getDevSupportManager().l();
        }
        C3255c c3255c = (C3255c) reactHostImpl.bridgelessReactContextRef.c();
        if (c3255c == null) {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
            raiseSoftException$default(reactHostImpl2, str3, "ReactContext is null. Destroy reason: " + str2, null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
        }
        reactHostImpl2.stateTracker.a(str3, "Move ReactHost to onHostDestroy()");
        reactHostImpl2.reactLifecycleStateManager.b(c3255c);
        return y7.n.f64899g.r(reactInstance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y7.n getOrCreateDestroyTask$lambda$62(Function2 function2, ReactHostImpl reactHostImpl, String str, y7.n task) {
        AbstractC5504s.h(task, "task");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "2: Stopping surfaces");
        if (reactInstance == null) {
            raiseSoftException$default(reactHostImpl, str, "Skipping surface shutdown: ReactInstance null", null, 4, null);
            return task;
        }
        reactHostImpl.stopAttachedSurfaces(str, reactInstance);
        synchronized (reactHostImpl.attachedSurfaces) {
            reactHostImpl.attachedSurfaces.clear();
            Td.L l10 = Td.L.f17438a;
        }
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y7.n getOrCreateDestroyTask$lambda$63(Function2 function2, ReactHostImpl reactHostImpl, String str, String str2, y7.n task) {
        ReactHostImpl reactHostImpl2;
        String str3;
        AbstractC5504s.h(task, "task");
        function2.invoke(task, "3: Destroying ReactContext");
        Iterator<InterfaceC5082a> it = reactHostImpl.beforeDestroyListeners.iterator();
        while (it.hasNext()) {
            it.next().invoke();
        }
        C3255c c3255c = (C3255c) reactHostImpl.bridgelessReactContextRef.c();
        if (c3255c == null) {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
            raiseSoftException$default(reactHostImpl2, str3, "ReactContext is null. Destroy reason: " + str2, null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
        }
        reactHostImpl2.stateTracker.a(str3, "Destroying MemoryPressureRouter");
        reactHostImpl2.getMemoryPressureRouter().b(reactHostImpl2.context);
        if (c3255c != null) {
            reactHostImpl2.stateTracker.a(str3, "Resetting ReactContext ref");
            reactHostImpl2.bridgelessReactContextRef.e();
            reactHostImpl2.stateTracker.a(str3, "Destroying ReactContext");
            c3255c.destroy();
        }
        reactHostImpl2.setCurrentActivity(null);
        N7.c.b();
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y7.n getOrCreateDestroyTask$lambda$64(Function2 function2, ReactHostImpl reactHostImpl, String str, y7.n task) {
        ReactHostImpl reactHostImpl2;
        String str2;
        AbstractC5504s.h(task, "task");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "4: Destroying ReactInstance");
        if (reactInstance == null) {
            reactHostImpl2 = reactHostImpl;
            str2 = str;
            raiseSoftException$default(reactHostImpl2, str2, "Skipping ReactInstance.destroy(): ReactInstance null", null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str2 = str;
            reactHostImpl2.stateTracker.a(str2, "Resetting ReactInstance ptr");
            reactHostImpl2.reactInstance = null;
            reactHostImpl2.stateTracker.a(str2, "Destroying ReactInstance");
            reactInstance.m();
        }
        reactHostImpl2.stateTracker.a(str2, "Resetting start/destroy task ref");
        reactHostImpl2.startTask = null;
        reactHostImpl2.destroyTask = null;
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void getOrCreateDestroyTask$lambda$65(ReactHostImpl reactHostImpl, String str, String str2, y7.n task) {
        AbstractC5504s.h(task, "task");
        if (task.v()) {
            Exception excR = task.r();
            if (excR == null) {
                throw new IllegalStateException("Required value was null.");
            }
            reactHostImpl.raiseSoftException(str, "React destruction failed. ReactInstance task faulted. Fault reason: " + excR.getMessage() + ". Destroy reason: " + str2, task.r());
        }
        if (!task.t()) {
            return null;
        }
        raiseSoftException$default(reactHostImpl, str, "React destruction failed. ReactInstance task cancelled. Destroy reason: " + str2, null, 4, null);
        return null;
    }

    private final y7.n getOrCreateReactInstance() {
        return y7.n.f64899g.h(new Callable() { // from class: com.facebook.react.runtime.Z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f37255a.waitThenCallGetOrCreateReactInstanceTask();
            }
        }, this.bgExecutor);
    }

    private final y7.n getOrCreateReactInstanceTask() {
        final String str = "getOrCreateReactInstanceTask()";
        c0.b(this.stateTracker, "getOrCreateReactInstanceTask()", null, 2, null);
        return (y7.n) this.createReactInstanceTaskRef.d(new C3253a.InterfaceC0622a() { // from class: com.facebook.react.runtime.t
            @Override // com.facebook.react.runtime.C3253a.InterfaceC0622a
            public final Object get() {
                return ReactHostImpl.getOrCreateReactInstanceTask$lambda$44(this.f37338a, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y7.n getOrCreateReactInstanceTask$lambda$44(final ReactHostImpl reactHostImpl, final String str) {
        reactHostImpl.stateTracker.a(str, "Start");
        Q6.a.b(!reactHostImpl.hostInvalidated, "Cannot start a new ReactInstance on an invalidated ReactHost");
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGELESS_LOADING_START, 1);
        y7.n nVarY = reactHostImpl.getJsBundleLoader().y(new InterfaceC7207a() { // from class: com.facebook.react.runtime.D
            @Override // y7.InterfaceC7207a
            public final Object a(y7.n nVar) {
                return ReactHostImpl.getOrCreateReactInstanceTask$lambda$44$lambda$40(this.f37164a, str, nVar);
            }
        }, reactHostImpl.bgExecutor);
        nVarY.l(new e(new Function1() { // from class: com.facebook.react.runtime.E
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReactHostImpl.getOrCreateReactInstanceTask$lambda$44$lambda$42(this.f37166a, str, (y7.n) obj);
            }
        }), reactHostImpl.uiExecutor);
        return y7.n.z(nVarY, new InterfaceC7207a() { // from class: com.facebook.react.runtime.F
            @Override // y7.InterfaceC7207a
            public final Object a(y7.n nVar) {
                return ReactHostImpl.getOrCreateReactInstanceTask$lambda$44$lambda$43(nVar);
            }
        }, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b getOrCreateReactInstanceTask$lambda$44$lambda$40(final ReactHostImpl reactHostImpl, final String str, y7.n task) {
        AbstractC5504s.h(task, "task");
        Object objS = task.s();
        if (objS == null) {
            throw new IllegalStateException("Required value was null.");
        }
        C3255c c3255c = (C3255c) reactHostImpl.bridgelessReactContextRef.d(new C3253a.InterfaceC0622a() { // from class: com.facebook.react.runtime.x
            @Override // com.facebook.react.runtime.C3253a.InterfaceC0622a
            public final Object get() {
                return ReactHostImpl.getOrCreateReactInstanceTask$lambda$44$lambda$40$lambda$37(this.f37345a, str);
            }
        });
        c3255c.setJSExceptionHandler(reactHostImpl.getDevSupportManager());
        reactHostImpl.stateTracker.a(str, "Creating ReactInstance");
        ReactInstance reactInstance = new ReactInstance(c3255c, reactHostImpl.reactHostDelegate, reactHostImpl.componentFactory, reactHostImpl.getDevSupportManager(), new QueueThreadExceptionHandler() { // from class: com.facebook.react.runtime.y
            @Override // com.facebook.react.bridge.queue.QueueThreadExceptionHandler
            public final void handleException(Exception exc) {
                ReactHostImpl.getOrCreateReactInstanceTask$lambda$44$lambda$40$lambda$38(this.f37347a, exc);
            }
        }, reactHostImpl.useDevSupport, reactHostImpl.getOrCreateReactHostInspectorTarget$ReactAndroid_release());
        reactHostImpl.reactInstance = reactInstance;
        MemoryPressureListener memoryPressureListenerCreateMemoryPressureListener = reactHostImpl.createMemoryPressureListener(reactInstance);
        reactHostImpl.memoryPressureListener = memoryPressureListenerCreateMemoryPressureListener;
        reactHostImpl.getMemoryPressureRouter().a(memoryPressureListenerCreateMemoryPressureListener);
        reactInstance.w();
        reactHostImpl.stateTracker.a(str, "Loading JS Bundle");
        reactInstance.y((JSBundleLoader) objS);
        reactHostImpl.stateTracker.a(str, "DevSupportManager.onNewReactContextCreated()");
        reactHostImpl.getDevSupportManager().A(c3255c);
        c3255c.runOnJSQueueThread(new Runnable() { // from class: com.facebook.react.runtime.z
            @Override // java.lang.Runnable
            public final void run() {
                ReactHostImpl.getOrCreateReactInstanceTask$lambda$44$lambda$40$lambda$39();
            }
        });
        return new b(reactInstance, c3255c, reactHostImpl.reloadTask != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C3255c getOrCreateReactInstanceTask$lambda$44$lambda$40$lambda$37(ReactHostImpl reactHostImpl, String str) {
        reactHostImpl.stateTracker.a(str, "Creating BridgelessReactContext");
        return new C3255c(reactHostImpl.context, reactHostImpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOrCreateReactInstanceTask$lambda$44$lambda$40$lambda$38(ReactHostImpl reactHostImpl, Exception e10) {
        AbstractC5504s.h(e10, "e");
        reactHostImpl.handleHostException$ReactAndroid_release(e10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOrCreateReactInstanceTask$lambda$44$lambda$40$lambda$39() {
        ReactMarker.logMarker(ReactMarkerConstants.REACT_BRIDGELESS_LOADING_END, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L getOrCreateReactInstanceTask$lambda$44$lambda$42(final ReactHostImpl reactHostImpl, String str, final y7.n task) {
        AbstractC5504s.h(task, "task");
        if (task.v()) {
            reactHostImpl.uiExecutor.execute(new Runnable() { // from class: com.facebook.react.runtime.g
                @Override // java.lang.Runnable
                public final void run() {
                    ReactHostImpl.getOrCreateReactInstanceTask$lambda$44$lambda$42$lambda$41(this.f37285a, task);
                }
            });
            return Td.L.f17438a;
        }
        Object objS = task.s();
        if (objS == null) {
            throw new IllegalStateException("Required value was null.");
        }
        b bVar = (b) objS;
        ReactContext reactContextA = bVar.a();
        boolean zC = bVar.c();
        boolean z10 = reactHostImpl.reactLifecycleStateManager.a() == LifecycleState.f36552c;
        if (!zC || z10) {
            reactHostImpl.reactLifecycleStateManager.e(reactContextA, reactHostImpl.getCurrentActivity$ReactAndroid_release());
        } else {
            reactHostImpl.reactLifecycleStateManager.d(reactContextA, reactHostImpl.getCurrentActivity$ReactAndroid_release());
        }
        reactHostImpl.stateTracker.a(str, "Executing ReactInstanceEventListeners");
        Iterator<com.facebook.react.z> it = reactHostImpl.reactInstanceEventListeners.iterator();
        while (it.hasNext()) {
            it.next().a(reactContextA);
        }
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOrCreateReactInstanceTask$lambda$44$lambda$42$lambda$41(ReactHostImpl reactHostImpl, y7.n nVar) {
        Exception excR = nVar.r();
        if (excR == null) {
            throw new IllegalStateException("Required value was null.");
        }
        reactHostImpl.handleHostException$ReactAndroid_release(excR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactInstance getOrCreateReactInstanceTask$lambda$44$lambda$43(y7.n task) {
        AbstractC5504s.h(task, "task");
        Object objS = task.s();
        if (objS != null) {
            return ((b) objS).b();
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final y7.n getOrCreateReloadTask(final String reason) {
        final String str = "getOrCreateReloadTask()";
        c0.b(this.stateTracker, "getOrCreateReloadTask()", null, 2, null);
        raiseSoftException$default(this, "getOrCreateReloadTask()", reason, null, 4, null);
        y7.n nVar = this.reloadTask;
        if (nVar != null) {
            return nVar;
        }
        final Function2 function2CreateReactInstanceUnwrapper = createReactInstanceUnwrapper("Reload", "getOrCreateReloadTask()", reason);
        this.stateTracker.a("getOrCreateReloadTask()", "Resetting createReactInstance task ref");
        y7.n nVarO = ((y7.n) this.createReactInstanceTaskRef.b()).o(new InterfaceC7207a() { // from class: com.facebook.react.runtime.i
            @Override // y7.InterfaceC7207a
            public final Object a(y7.n nVar2) {
                return ReactHostImpl.getOrCreateReloadTask$lambda$51(this.f37294a, str, function2CreateReactInstanceUnwrapper, reason, nVar2);
            }
        }, this.uiExecutor).o(new InterfaceC7207a() { // from class: com.facebook.react.runtime.j
            @Override // y7.InterfaceC7207a
            public final Object a(y7.n nVar2) {
                return ReactHostImpl.getOrCreateReloadTask$lambda$52(function2CreateReactInstanceUnwrapper, this, str, nVar2);
            }
        }, this.bgExecutor).o(new InterfaceC7207a() { // from class: com.facebook.react.runtime.k
            @Override // y7.InterfaceC7207a
            public final Object a(y7.n nVar2) {
                return ReactHostImpl.getOrCreateReloadTask$lambda$54(function2CreateReactInstanceUnwrapper, this, str, nVar2);
            }
        }, this.uiExecutor).o(new InterfaceC7207a() { // from class: com.facebook.react.runtime.l
            @Override // y7.InterfaceC7207a
            public final Object a(y7.n nVar2) {
                return ReactHostImpl.getOrCreateReloadTask$lambda$55(function2CreateReactInstanceUnwrapper, this, str, nVar2);
            }
        }, this.bgExecutor).o(new InterfaceC7207a() { // from class: com.facebook.react.runtime.m
            @Override // y7.InterfaceC7207a
            public final Object a(y7.n nVar2) {
                return ReactHostImpl.getOrCreateReloadTask$lambda$56(function2CreateReactInstanceUnwrapper, this, str, nVar2);
            }
        }, this.bgExecutor).o(new InterfaceC7207a() { // from class: com.facebook.react.runtime.n
            @Override // y7.InterfaceC7207a
            public final Object a(y7.n nVar2) {
                return ReactHostImpl.getOrCreateReloadTask$lambda$57(this.f37323a, str, reason, nVar2);
            }
        }, this.bgExecutor);
        this.reloadTask = nVarO;
        return nVarO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y7.n getOrCreateReloadTask$lambda$51(ReactHostImpl reactHostImpl, String str, Function2 function2, String str2, y7.n task) {
        ReactHostImpl reactHostImpl2;
        String str3;
        AbstractC5504s.h(task, "task");
        reactHostImpl.stateTracker.a(str, "Starting React Native reload");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "1: Starting reload");
        reactHostImpl.unregisterInstanceFromInspector$ReactAndroid_release(reactInstance);
        C3255c c3255c = (C3255c) reactHostImpl.bridgelessReactContextRef.c();
        if (c3255c == null) {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
            raiseSoftException$default(reactHostImpl2, str3, "ReactContext is null. Reload reason: " + str2, null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
        }
        if (c3255c != null && reactHostImpl2.reactLifecycleStateManager.a() == LifecycleState.f36552c) {
            reactHostImpl2.stateTracker.a(str3, "Calling ReactContext.onHostPause()");
            c3255c.onHostPause();
        }
        return y7.n.f64899g.r(reactInstance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y7.n getOrCreateReloadTask$lambda$52(Function2 function2, ReactHostImpl reactHostImpl, String str, y7.n task) {
        AbstractC5504s.h(task, "task");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "2: Surface shutdown");
        if (reactInstance == null) {
            raiseSoftException$default(reactHostImpl, str, "Skipping surface shutdown: ReactInstance null", null, 4, null);
            return task;
        }
        reactHostImpl.stopAttachedSurfaces(str, reactInstance);
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y7.n getOrCreateReloadTask$lambda$54(Function2 function2, ReactHostImpl reactHostImpl, String str, y7.n task) {
        AbstractC5504s.h(task, "task");
        function2.invoke(task, "3: Destroying ReactContext");
        Iterator<InterfaceC5082a> it = reactHostImpl.beforeDestroyListeners.iterator();
        while (it.hasNext()) {
            it.next().invoke();
        }
        MemoryPressureListener memoryPressureListener = reactHostImpl.memoryPressureListener;
        if (memoryPressureListener != null) {
            reactHostImpl.stateTracker.a(str, "Removing memory pressure listener");
            reactHostImpl.getMemoryPressureRouter().d(memoryPressureListener);
        }
        C3255c c3255c = (C3255c) reactHostImpl.bridgelessReactContextRef.c();
        if (c3255c != null) {
            reactHostImpl.stateTracker.a(str, "Resetting ReactContext ref");
            reactHostImpl.bridgelessReactContextRef.e();
            reactHostImpl.stateTracker.a(str, "Destroying ReactContext");
            c3255c.destroy();
        }
        if (reactHostImpl.useDevSupport && c3255c != null) {
            reactHostImpl.stateTracker.a(str, "Calling DevSupportManager.onReactInstanceDestroyed(reactContext)");
            reactHostImpl.getDevSupportManager().H(c3255c);
        }
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y7.n getOrCreateReloadTask$lambda$55(Function2 function2, ReactHostImpl reactHostImpl, String str, y7.n task) {
        ReactHostImpl reactHostImpl2;
        String str2;
        AbstractC5504s.h(task, "task");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "4: Destroying ReactInstance");
        if (reactInstance == null) {
            reactHostImpl2 = reactHostImpl;
            str2 = str;
            raiseSoftException$default(reactHostImpl2, str2, "Skipping ReactInstance.destroy(): ReactInstance null", null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str2 = str;
            reactHostImpl2.stateTracker.a(str2, "Resetting ReactInstance ptr");
            reactHostImpl2.reactInstance = null;
            reactHostImpl2.stateTracker.a(str2, "Destroying ReactInstance");
            reactInstance.m();
        }
        reactHostImpl2.stateTracker.a(str2, "Resetting start task ref");
        reactHostImpl2.startTask = null;
        return reactHostImpl2.getOrCreateReactInstanceTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y7.n getOrCreateReloadTask$lambda$56(Function2 function2, ReactHostImpl reactHostImpl, String str, y7.n task) {
        AbstractC5504s.h(task, "task");
        ReactInstance reactInstance = (ReactInstance) function2.invoke(task, "5: Restarting surfaces");
        if (reactInstance == null) {
            raiseSoftException$default(reactHostImpl, str, "Skipping surface restart: ReactInstance null", null, 4, null);
            return task;
        }
        reactHostImpl.startAttachedSurfaces(str, reactInstance);
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y7.n getOrCreateReloadTask$lambda$57(ReactHostImpl reactHostImpl, String str, String str2, y7.n task) {
        ReactHostImpl reactHostImpl2;
        String str3;
        AbstractC5504s.h(task, "task");
        if (task.v()) {
            Exception excR = task.r();
            if (excR == null) {
                throw new IllegalStateException("Required value was null.");
            }
            reactHostImpl.raiseSoftException(str, "Error during reload. ReactInstance task faulted. Fault reason: " + excR.getMessage() + ". Reload reason: " + str2, task.r());
        }
        if (task.t()) {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
            raiseSoftException$default(reactHostImpl2, str3, "Error during reload. ReactInstance task cancelled. Reload reason: " + str2, null, 4, null);
        } else {
            reactHostImpl2 = reactHostImpl;
            str3 = str;
        }
        reactHostImpl2.stateTracker.a(str3, "Resetting reload task ref");
        reactHostImpl2.reloadTask = null;
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y7.n getOrCreateStartTask() {
        y7.n nVar = this.startTask;
        if (nVar != null) {
            return nVar;
        }
        this.stateTracker.a("getOrCreateStartTask()", "Schedule");
        if (Y6.a.f22860b) {
            Q6.a.b(C4921i.a(), "enableBridgelessArchitecture FeatureFlag must be set to start ReactNative.");
            Q6.a.b(C4921i.b(), "enableFabricRenderer FeatureFlag must be set to start ReactNative.");
            Q6.a.b(C4921i.e(), "useTurboModules FeatureFlag must be set to start ReactNative.");
        }
        if (Y6.a.f22864f) {
            Q6.a.b(!C4921i.c(), "useFabricInterop FeatureFlag must be false when UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE == true.");
            Q6.a.b(!C4921i.d(), "useTurboModuleInterop FeatureFlag must be false when UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE == true.");
        }
        y7.n nVarO = waitThenCallGetOrCreateReactInstanceTask().o(new InterfaceC7207a() { // from class: com.facebook.react.runtime.A
            @Override // y7.InterfaceC7207a
            public final Object a(y7.n nVar2) {
                return ReactHostImpl.getOrCreateStartTask$lambda$29(this.f37159a, nVar2);
            }
        }, this.bgExecutor);
        this.startTask = nVarO;
        return nVarO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y7.n getOrCreateStartTask$lambda$29(ReactHostImpl reactHostImpl, y7.n task) {
        AbstractC5504s.h(task, "task");
        if (!task.v()) {
            return task.w();
        }
        final Exception excR = task.r();
        if (excR == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (reactHostImpl.useDevSupport) {
            reactHostImpl.getDevSupportManager().handleException(excR);
        } else {
            reactHostImpl.reactHostDelegate.e(excR);
        }
        return y7.n.p(reactHostImpl.getOrCreateDestroyTask("getOrCreateStartTask() failure: " + excR.getMessage(), excR), new InterfaceC7207a() { // from class: com.facebook.react.runtime.h
            @Override // y7.InterfaceC7207a
            public final Object a(y7.n nVar) {
                return ReactHostImpl.getOrCreateStartTask$lambda$29$lambda$28(excR, nVar);
            }
        }, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y7.n getOrCreateStartTask$lambda$29$lambda$28(Exception exc, y7.n it) {
        AbstractC5504s.h(it, "it");
        return y7.n.f64899g.q(exc);
    }

    private final y7.n isMetroRunning() {
        final String str = "isMetroRunning()";
        c0.b(this.stateTracker, "isMetroRunning()", null, 2, null);
        final y7.o oVar = new y7.o();
        getDevSupportManager().n(new c7.h() { // from class: com.facebook.react.runtime.P
            @Override // c7.h
            public final void a(boolean z10) {
                ReactHostImpl._get_isMetroRunning_$lambda$46(this.f37197a, str, oVar, z10);
            }
        });
        return oVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L loadBundle$lambda$19(ReactHostImpl reactHostImpl, String str, JSBundleLoader jSBundleLoader, ReactInstance reactInstance) {
        AbstractC5504s.h(reactInstance, "reactInstance");
        reactHostImpl.stateTracker.a(str, "Execute");
        reactInstance.y(jSBundleLoader);
        return Td.L.f17438a;
    }

    private final y7.n loadJSBundleFromMetro() {
        c0.b(this.stateTracker, "loadJSBundleFromMetro()", null, 2, null);
        y7.o oVar = new y7.o();
        c7.f devSupportManager = getDevSupportManager();
        AbstractC5504s.f(devSupportManager, "null cannot be cast to non-null type com.facebook.react.devsupport.DevSupportManagerBase");
        com.facebook.react.devsupport.Y y10 = (com.facebook.react.devsupport.Y) devSupportManager;
        C3235v c3235vU0 = y10.u0();
        String strV0 = y10.v0();
        if (strV0 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        String strQ = c3235vU0.q(strV0);
        y10.F0(strQ, new d("loadJSBundleFromMetro()", strQ, y10, oVar));
        return oVar.a();
    }

    private final void loadNetworkResource(String url, InspectorNetworkRequestListener listener) {
        b7.f.a(url, listener);
    }

    private final void maybeEnableDevSupport(boolean enabled) {
        if (this.useDevSupport) {
            getDevSupportManager().s(enabled);
        }
    }

    private final void moveToHostDestroy(ReactContext currentContext) {
        this.reactLifecycleStateManager.b(currentContext);
        setCurrentActivity(null);
        FrameTimingsObserver frameTimingsObserver = this.frameTimingsObserver;
        if (frameTimingsObserver != null) {
            frameTimingsObserver.setCurrentWindow(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L prerenderSurface$lambda$2(ReactHostImpl reactHostImpl, String str, j0 j0Var, ReactInstance reactInstance) {
        AbstractC5504s.h(reactInstance, "reactInstance");
        reactHostImpl.stateTracker.a(str, "Execute");
        reactInstance.z(j0Var);
        return Td.L.f17438a;
    }

    private final void raiseSoftException(String callingMethod, String message, Throwable throwable) {
        String str = "raiseSoftException(" + callingMethod + ")";
        this.stateTracker.a(str, message);
        ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException(str + ": " + message, throwable));
    }

    static /* synthetic */ void raiseSoftException$default(ReactHostImpl reactHostImpl, String str, String str2, Throwable th2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        reactHostImpl.raiseSoftException(str, str2, th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L registerSegment$lambda$20(ReactHostImpl reactHostImpl, String str, int i10, String str2, Callback callback, ReactInstance reactInstance) {
        AbstractC5504s.h(reactInstance, "reactInstance");
        reactHostImpl.stateTracker.a(str, "Execute");
        reactInstance.A(i10, str2);
        if (callback == null) {
            throw new IllegalStateException("Required value was null.");
        }
        callback.invoke(new Object[0]);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final y7.n reload$lambda$8(final com.facebook.react.runtime.ReactHostImpl r4, final java.lang.String r5) {
        /*
            y7.n r0 = r4.destroyTask
            if (r0 == 0) goto L1a
            com.facebook.react.runtime.c0 r1 = r4.stateTracker
            java.lang.String r2 = "reload()"
            java.lang.String r3 = "Waiting for destroy to finish, before reloading React Native."
            r1.a(r2, r3)
            com.facebook.react.runtime.v r1 = new com.facebook.react.runtime.v
            r1.<init>()
            java.util.concurrent.Executor r2 = r4.bgExecutor
            y7.n r0 = r0.o(r1, r2)
            if (r0 != 0) goto L1e
        L1a:
            y7.n r0 = r4.getOrCreateReloadTask(r5)
        L1e:
            y7.n r5 = r0.w()
            com.facebook.react.runtime.w r0 = new com.facebook.react.runtime.w
            r0.<init>()
            java.util.concurrent.Executor r4 = r4.bgExecutor
            y7.n r4 = r5.o(r0, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.runtime.ReactHostImpl.reload$lambda$8(com.facebook.react.runtime.ReactHostImpl, java.lang.String):y7.n");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y7.n reload$lambda$8$lambda$6$lambda$5(ReactHostImpl reactHostImpl, String str, y7.n it) {
        AbstractC5504s.h(it, "it");
        return reactHostImpl.getOrCreateReloadTask(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y7.n reload$lambda$8$lambda$7(ReactHostImpl reactHostImpl, y7.n task) {
        AbstractC5504s.h(task, "task");
        if (!task.v()) {
            return task;
        }
        Exception excR = task.r();
        if (excR == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (reactHostImpl.useDevSupport) {
            reactHostImpl.getDevSupportManager().handleException(excR);
        } else {
            reactHostImpl.reactHostDelegate.e(excR);
        }
        return reactHostImpl.getOrCreateDestroyTask("Reload failed", excR);
    }

    private final void setCurrentActivity(Activity activity) {
        this.activity.set(activity);
        if (activity != null) {
            this.lastUsedActivityRef.set(new WeakReference<>(activity));
        }
    }

    private final void setPausedInDebuggerMessage(String message) {
        if (message == null) {
            getDevSupportManager().f();
        } else {
            getDevSupportManager().h(message, new g());
        }
    }

    private final void startAttachedSurfaces(String method, ReactInstance reactInstance) {
        this.stateTracker.a(method, "Restarting previously running React Native Surfaces");
        synchronized (this.attachedSurfaces) {
            try {
                Iterator<j0> it = this.attachedSurfaces.iterator();
                while (it.hasNext()) {
                    reactInstance.B(it.next());
                }
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L startSurface$lambda$3(ReactHostImpl reactHostImpl, String str, j0 j0Var, ReactInstance reactInstance) {
        AbstractC5504s.h(reactInstance, "reactInstance");
        reactHostImpl.stateTracker.a(str, "Execute");
        reactInstance.B(j0Var);
        return Td.L.f17438a;
    }

    private final void stopAttachedSurfaces(String method, ReactInstance reactInstance) {
        this.stateTracker.a(method, "Stopping all React Native surfaces");
        synchronized (this.attachedSurfaces) {
            try {
                for (j0 j0Var : this.attachedSurfaces) {
                    reactInstance.C(j0Var);
                    j0Var.e();
                }
                Td.L l10 = Td.L.f17438a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Td.L stopSurface$lambda$4(ReactHostImpl reactHostImpl, String str, j0 j0Var, ReactInstance reactInstance) {
        AbstractC5504s.h(reactInstance, "reactInstance");
        reactHostImpl.stateTracker.a(str, "Execute");
        reactInstance.C(j0Var);
        return Td.L.f17438a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y7.n waitThenCallGetOrCreateReactInstanceTask() {
        return waitThenCallGetOrCreateReactInstanceTaskWithRetries(0, 4);
    }

    private final y7.n waitThenCallGetOrCreateReactInstanceTaskWithRetries(final int tryNum, final int maxTries) {
        y7.n nVar = this.reloadTask;
        if (nVar != null) {
            this.stateTracker.a("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is reloading. Return reload task.");
            return nVar;
        }
        y7.n nVar2 = this.destroyTask;
        if (nVar2 != null) {
            if (tryNum < maxTries) {
                this.stateTracker.a("waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is tearing down.Wait for teardown to finish, before trying again (try count = " + tryNum + ").");
                return nVar2.B(new InterfaceC7207a() { // from class: com.facebook.react.runtime.a0
                    @Override // y7.InterfaceC7207a
                    public final Object a(y7.n nVar3) {
                        return ReactHostImpl.waitThenCallGetOrCreateReactInstanceTaskWithRetries$lambda$36$lambda$35(this.f37266a, tryNum, maxTries, nVar3);
                    }
                }, this.bgExecutor);
            }
            raiseSoftException$default(this, "waitThenCallGetOrCreateReactInstanceTaskWithRetries", "React Native is tearing down. Not wait for teardown to finish: reached max retries.", null, 4, null);
        }
        return getOrCreateReactInstanceTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y7.n waitThenCallGetOrCreateReactInstanceTaskWithRetries$lambda$36$lambda$35(ReactHostImpl reactHostImpl, int i10, int i11, y7.n it) {
        AbstractC5504s.h(it, "it");
        return reactHostImpl.waitThenCallGetOrCreateReactInstanceTaskWithRetries(i10 + 1, i11);
    }

    @Override // com.facebook.react.ReactHost
    public void addBeforeDestroyListener(InterfaceC5082a onBeforeDestroy) {
        AbstractC5504s.h(onBeforeDestroy, "onBeforeDestroy");
        this.beforeDestroyListeners.add(onBeforeDestroy);
    }

    @Override // com.facebook.react.ReactHost
    public void addReactInstanceEventListener(com.facebook.react.z listener) {
        AbstractC5504s.h(listener, "listener");
        this.reactInstanceEventListeners.add(listener);
    }

    public final void attachSurface$ReactAndroid_release(j0 surface) {
        AbstractC5504s.h(surface, "surface");
        c0.b(this.stateTracker, "attachSurface(surfaceId = " + surface.l() + ")", null, 2, null);
        synchronized (this.attachedSurfaces) {
            this.attachedSurfaces.add(surface);
        }
    }

    public final y7.n callFunctionOnModule$ReactAndroid_release(final String moduleName, final String methodName, final NativeArray args) {
        AbstractC5504s.h(moduleName, "moduleName");
        AbstractC5504s.h(methodName, "methodName");
        AbstractC5504s.h(args, "args");
        return callWithExistingReactInstance$default(this, "callFunctionOnModule(\"" + moduleName + "\", \"" + methodName + "\")", null, new Function1() { // from class: com.facebook.react.runtime.X
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReactHostImpl.callFunctionOnModule$lambda$21(moduleName, methodName, args, (ReactInstance) obj);
            }
        }, 2, null);
    }

    @Override // com.facebook.react.ReactHost
    public InterfaceC4779a createSurface(Context context, String moduleName, Bundle initialProps) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(moduleName, "moduleName");
        j0 j0Var = new j0(context, moduleName, initialProps);
        k0 k0Var = new k0(context, j0Var);
        k0Var.setShouldLogContentAppeared(true);
        j0Var.d(k0Var);
        j0Var.c(this);
        return j0Var;
    }

    @Override // com.facebook.react.ReactHost
    public InterfaceC4656a destroy(String reason, Exception ex, final Function1 onDestroyFinished) {
        AbstractC5504s.h(reason, "reason");
        AbstractC5504s.h(onDestroyFinished, "onDestroyFinished");
        InterfaceC4656a interfaceC4656aDestroy = destroy(reason, ex);
        AbstractC5504s.f(interfaceC4656aDestroy, "null cannot be cast to non-null type com.facebook.react.runtime.internal.bolts.Task<java.lang.Void>");
        return y7.n.m((y7.n) interfaceC4656aDestroy, new InterfaceC7207a() { // from class: com.facebook.react.runtime.q
            @Override // y7.InterfaceC7207a
            public final Object a(y7.n nVar) {
                return ReactHostImpl.destroy$lambda$9(onDestroyFinished, nVar);
            }
        }, null, 2, null);
    }

    public final void detachSurface$ReactAndroid_release(j0 surface) {
        AbstractC5504s.h(surface, "surface");
        c0.b(this.stateTracker, "detachSurface(surfaceId = " + surface.l() + ")", null, 2, null);
        synchronized (this.attachedSurfaces) {
            this.attachedSurfaces.remove(surface);
        }
    }

    public final Activity getCurrentActivity$ReactAndroid_release() {
        return this.activity.get();
    }

    @Override // com.facebook.react.ReactHost
    public ReactContext getCurrentReactContext() {
        return (ReactContext) this.bridgelessReactContextRef.c();
    }

    public final InterfaceC6143a getDefaultBackButtonHandler$ReactAndroid_release() {
        return new InterfaceC6143a() { // from class: com.facebook.react.runtime.O
            @Override // q7.InterfaceC6143a
            public final void a() {
                ReactHostImpl._get_defaultBackButtonHandler_$lambda$18(this.f37196a);
            }
        };
    }

    @Override // com.facebook.react.ReactHost
    public c7.f getDevSupportManager() {
        return this.devSupportManager;
    }

    public final EventDispatcher getEventDispatcher$ReactAndroid_release() {
        EventDispatcher eventDispatcherN;
        ReactInstance reactInstance = this.reactInstance;
        return (reactInstance == null || (eventDispatcherN = reactInstance.n()) == null) ? com.facebook.react.uimanager.events.b.f37583a : eventDispatcherN;
    }

    public final JavaScriptContextHolder getJavaScriptContextHolder$ReactAndroid_release() {
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.getJavaScriptContextHolder();
        }
        return null;
    }

    public final CallInvokerHolder getJsCallInvokerHolder$ReactAndroid_release() {
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.getJSCallInvokerHolder();
        }
        raiseSoftException$default(this, "getJSCallInvokerHolder()", "Tried to get JSCallInvokerHolder while instance is not ready", null, 4, null);
        return null;
    }

    public final Activity getLastUsedActivity$ReactAndroid_release() {
        WeakReference<Activity> weakReference = this.lastUsedActivityRef.get();
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // com.facebook.react.ReactHost
    public LifecycleState getLifecycleState() {
        return this.reactLifecycleStateManager.a();
    }

    @Override // com.facebook.react.ReactHost
    public ComponentCallbacks2C3243h getMemoryPressureRouter() {
        return this.memoryPressureRouter;
    }

    public final <T extends NativeModule> T getNativeModule$ReactAndroid_release(Class<T> nativeModuleInterface) {
        AbstractC5504s.h(nativeModuleInterface, "nativeModuleInterface");
        if (!Y6.a.f22864f && AbstractC5504s.c(nativeModuleInterface, UIManagerModule.class)) {
            ReactSoftExceptionLogger.logSoftExceptionVerbose(TAG, new ReactNoCrashSoftException("getNativeModule(UIManagerModule.class) cannot be called when the bridge is disabled"));
        }
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return (T) reactInstance.q(nativeModuleInterface);
        }
        return null;
    }

    public final Collection<NativeModule> getNativeModules$ReactAndroid_release() {
        Collection<NativeModule> collectionS;
        ReactInstance reactInstance = this.reactInstance;
        return (reactInstance == null || (collectionS = reactInstance.s()) == null) ? AbstractC2279u.m() : collectionS;
    }

    public final ReactHostInspectorTarget getOrCreateReactHostInspectorTarget$ReactAndroid_release() {
        if (this.reactHostInspectorTarget == null && InspectorFlags.getFuseboxEnabled()) {
            this.reactHostInspectorTarget = createReactHostInspectorTarget();
        }
        return this.reactHostInspectorTarget;
    }

    /* JADX INFO: renamed from: getReactHostInspectorTarget$ReactAndroid_release, reason: from getter */
    public final ReactHostInspectorTarget getReactHostInspectorTarget() {
        return this.reactHostInspectorTarget;
    }

    @Override // com.facebook.react.ReactHost
    public ReactQueueConfiguration getReactQueueConfiguration() {
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.getReactQueueConfiguration();
        }
        return null;
    }

    public final RuntimeExecutor getRuntimeExecutor$ReactAndroid_release() {
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.getBufferedRuntimeExecutor();
        }
        raiseSoftException$default(this, "getRuntimeExecutor()", "Tried to get runtime executor while instance is not ready", null, 4, null);
        return null;
    }

    public final FabricUIManager getUiManager$ReactAndroid_release() {
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.getFabricUIManager();
        }
        return null;
    }

    public final void handleHostException$ReactAndroid_release(Exception e10) {
        AbstractC5504s.h(e10, "e");
        String str = "handleHostException(message = \"" + e10.getMessage() + "\")";
        c0.b(this.stateTracker, str, null, 2, null);
        if (this.useDevSupport) {
            getDevSupportManager().handleException(e10);
        } else {
            this.reactHostDelegate.e(e10);
        }
        destroy(str, e10);
    }

    public final <T extends NativeModule> boolean hasNativeModule$ReactAndroid_release(Class<T> nativeModuleInterface) {
        AbstractC5504s.h(nativeModuleInterface, "nativeModuleInterface");
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.v(nativeModuleInterface);
        }
        return false;
    }

    @Override // com.facebook.react.ReactHost
    public void invalidate() {
        AbstractC7283a.b(TAG, "ReactHostImpl.invalidate()");
        this.hostInvalidated = true;
        destroy("ReactHostImpl.invalidate()", null);
    }

    public final boolean isInstanceInitialized$ReactAndroid_release() {
        return this.reactInstance != null;
    }

    public final boolean isSurfaceAttached$ReactAndroid_release(j0 surface) {
        boolean zContains;
        AbstractC5504s.h(surface, "surface");
        synchronized (this.attachedSurfaces) {
            zContains = this.attachedSurfaces.contains(surface);
        }
        return zContains;
    }

    public final boolean isSurfaceWithModuleNameAttached$ReactAndroid_release(String moduleName) {
        boolean z10;
        AbstractC5504s.h(moduleName, "moduleName");
        synchronized (this.attachedSurfaces) {
            try {
                Set<j0> set = this.attachedSurfaces;
                z10 = false;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    Iterator<T> it = set.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (AbstractC5504s.c(((j0) it.next()).i(), moduleName)) {
                            z10 = true;
                            break;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    public final y7.n loadBundle$ReactAndroid_release(final JSBundleLoader bundleLoader) {
        AbstractC5504s.h(bundleLoader, "bundleLoader");
        final String str = "loadBundle()";
        this.stateTracker.a("loadBundle()", "Schedule");
        return callWithExistingReactInstance$default(this, "loadBundle()", null, new Function1() { // from class: com.facebook.react.runtime.Q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReactHostImpl.loadBundle$lambda$19(this.f37200a, str, bundleLoader, (ReactInstance) obj);
            }
        }, 2, null);
    }

    @Override // com.facebook.react.ReactHost
    public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {
        AbstractC5504s.h(activity, "activity");
        String str = "onActivityResult(activity = \"" + activity + "\", requestCode = \"" + requestCode + "\", resultCode = \"" + resultCode + "\", data = \"" + data + "\")";
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            currentReactContext.onActivityResult(activity, requestCode, resultCode, data);
        } else {
            raiseSoftException$default(this, str, "Tried to access onActivityResult while context is not ready", null, 4, null);
        }
    }

    @Override // com.facebook.react.ReactHost
    public boolean onBackPressed() {
        DeviceEventManagerModule deviceEventManagerModule;
        UiThreadUtil.assertOnUiThread();
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance == null || (deviceEventManagerModule = (DeviceEventManagerModule) reactInstance.q(DeviceEventManagerModule.class)) == null) {
            return false;
        }
        deviceEventManagerModule.emitHardwareBackPressed();
        return true;
    }

    @Override // com.facebook.react.ReactHost
    public void onConfigurationChanged(Context context) {
        AbstractC5504s.h(context, "context");
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            if (C4914b.n()) {
                float fJ = com.facebook.react.uimanager.B.j(1.0d);
                C3289e.h(currentReactContext);
                if (fJ != com.facebook.react.uimanager.B.j(1.0d)) {
                    synchronized (this.attachedSurfaces) {
                        try {
                            Iterator<T> it = this.attachedSurfaces.iterator();
                            while (it.hasNext()) {
                                k0 k0VarA = ((j0) it.next()).a();
                                if (k0VarA != null) {
                                    k0VarA.requestLayout();
                                }
                            }
                            Td.L l10 = Td.L.f17438a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            AppearanceModule appearanceModule = (AppearanceModule) currentReactContext.getNativeModule(AppearanceModule.class);
            if (appearanceModule != null) {
                appearanceModule.onConfigurationChanged(context);
            }
        }
    }

    @Override // com.facebook.react.ReactHost
    public void onHostDestroy() {
        c0.b(this.stateTracker, "onHostDestroy()", null, 2, null);
        maybeEnableDevSupport(false);
        moveToHostDestroy(getCurrentReactContext());
    }

    @Override // com.facebook.react.ReactHost
    public void onHostLeaveHint(Activity activity) {
        c0.b(this.stateTracker, "onUserLeaveHint(activity)", null, 2, null);
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            currentReactContext.onUserLeaveHint(activity);
        }
    }

    @Override // com.facebook.react.ReactHost
    public void onHostPause(Activity activity) {
        c0.b(this.stateTracker, "onHostPause(activity)", null, 2, null);
        Activity currentActivity$ReactAndroid_release = getCurrentActivity$ReactAndroid_release();
        if (currentActivity$ReactAndroid_release != null) {
            boolean z10 = activity == currentActivity$ReactAndroid_release;
            if (!z10) {
                String str = "Pausing an activity that is not the current activity, this is incorrect! Current activity: " + currentActivity$ReactAndroid_release.getClass().getSimpleName() + " Paused activity: " + (activity == null ? "null" : activity.getClass().getSimpleName());
                if (C4914b.I()) {
                    AbstractC7283a.K(TAG, "onHostPause(activity)", str);
                } else {
                    Q6.a.b(z10, str);
                }
            }
        }
        maybeEnableDevSupport(false);
        this.defaultHardwareBackBtnHandler = null;
        this.reactLifecycleStateManager.c(getCurrentReactContext(), currentActivity$ReactAndroid_release);
    }

    @Override // com.facebook.react.ReactHost
    public void onHostResume(Activity activity, InterfaceC6143a defaultBackButtonImpl) {
        this.defaultHardwareBackBtnHandler = defaultBackButtonImpl;
        onHostResume(activity);
    }

    @Override // com.facebook.react.ReactHost
    public void onNewIntent(Intent intent) {
        DeviceEventManagerModule deviceEventManagerModule;
        AbstractC5504s.h(intent, "intent");
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext == null) {
            raiseSoftException$default(this, "onNewIntent(intent = \"" + intent + "\")", "Tried to access onNewIntent while context is not ready", null, 4, null);
            return;
        }
        String action = intent.getAction();
        Uri data = intent.getData();
        if (data != null && ((AbstractC5504s.c("android.intent.action.VIEW", action) || AbstractC5504s.c("android.nfc.action.NDEF_DISCOVERED", action)) && (deviceEventManagerModule = (DeviceEventManagerModule) currentReactContext.getNativeModule(DeviceEventManagerModule.class)) != null)) {
            deviceEventManagerModule.emitNewIntentReceived(data);
        }
        currentReactContext.onNewIntent(getCurrentActivity$ReactAndroid_release(), intent);
    }

    @Override // com.facebook.react.ReactHost
    public void onWindowFocusChange(boolean hasFocus) {
        ReactContext currentReactContext = getCurrentReactContext();
        if (currentReactContext != null) {
            currentReactContext.onWindowFocusChange(hasFocus);
            return;
        }
        raiseSoftException$default(this, "onWindowFocusChange(hasFocus = \"" + hasFocus + "\")", "Tried to access onWindowFocusChange while context is not ready", null, 4, null);
    }

    public final InterfaceC4656a prerenderSurface$ReactAndroid_release(final j0 surface) {
        AbstractC5504s.h(surface, "surface");
        final String str = "prerenderSurface(surfaceId = " + surface.l() + ")";
        this.stateTracker.a(str, "Schedule");
        attachSurface$ReactAndroid_release(surface);
        return callAfterGetOrCreateReactInstance(str, this.bgExecutor, new Function1() { // from class: com.facebook.react.runtime.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReactHostImpl.prerenderSurface$lambda$2(this.f37335a, str, surface, (ReactInstance) obj);
            }
        });
    }

    public final y7.n registerSegment$ReactAndroid_release(final int segmentId, final String path, final Callback callback) {
        AbstractC5504s.h(path, "path");
        final String str = "registerSegment(segmentId = \"" + segmentId + "\", path = \"" + path + "\")";
        this.stateTracker.a(str, "Schedule");
        return callWithExistingReactInstance$default(this, str, null, new Function1() { // from class: com.facebook.react.runtime.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReactHostImpl.registerSegment$lambda$20(this.f37327a, str, segmentId, path, callback, (ReactInstance) obj);
            }
        }, 2, null);
    }

    @Override // com.facebook.react.ReactHost
    public InterfaceC4656a reload(final String reason) {
        AbstractC5504s.h(reason, "reason");
        return y7.n.f64899g.h(new Callable() { // from class: com.facebook.react.runtime.C
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReactHostImpl.reload$lambda$8(this.f37162a, reason);
            }
        }, this.bgExecutor);
    }

    @Override // com.facebook.react.ReactHost
    public void removeBeforeDestroyListener(InterfaceC5082a onBeforeDestroy) {
        AbstractC5504s.h(onBeforeDestroy, "onBeforeDestroy");
        this.beforeDestroyListeners.remove(onBeforeDestroy);
    }

    @Override // com.facebook.react.ReactHost
    public void removeReactInstanceEventListener(com.facebook.react.z listener) {
        AbstractC5504s.h(listener, "listener");
        this.reactInstanceEventListeners.remove(listener);
    }

    @Override // com.facebook.react.ReactHost
    public void setBundleSource(String filePath) {
        AbstractC5504s.h(filePath, "filePath");
        getDevSupportManager().q(filePath);
        reload("Change bundle source");
    }

    @Override // com.facebook.react.ReactHost
    public void setDevMenuConfiguration(AbstractC3234u config) {
        AbstractC5504s.h(config, "config");
        getDevSupportManager();
        throw null;
    }

    public final void setReactHostInspectorTarget$ReactAndroid_release(ReactHostInspectorTarget reactHostInspectorTarget) {
        this.reactHostInspectorTarget = reactHostInspectorTarget;
    }

    @Override // com.facebook.react.ReactHost
    public InterfaceC4656a start() {
        return y7.n.f64899g.h(new Callable() { // from class: com.facebook.react.runtime.U
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f37244a.getOrCreateStartTask();
            }
        }, this.bgExecutor);
    }

    public final InterfaceC4656a startSurface$ReactAndroid_release(final j0 surface) {
        AbstractC5504s.h(surface, "surface");
        final String str = "startSurface(surfaceId = " + surface.l() + ")";
        this.stateTracker.a(str, "Schedule");
        attachSurface$ReactAndroid_release(surface);
        return callAfterGetOrCreateReactInstance(str, this.bgExecutor, new Function1() { // from class: com.facebook.react.runtime.N
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReactHostImpl.startSurface$lambda$3(this.f37193a, str, surface, (ReactInstance) obj);
            }
        });
    }

    public final InterfaceC4656a stopSurface$ReactAndroid_release(final j0 surface) {
        AbstractC5504s.h(surface, "surface");
        final String str = "stopSurface(surfaceId = " + surface.l() + ")";
        this.stateTracker.a(str, "Schedule");
        detachSurface$ReactAndroid_release(surface);
        return callWithExistingReactInstance(str, this.bgExecutor, new Function1() { // from class: com.facebook.react.runtime.L
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ReactHostImpl.stopSurface$lambda$4(this.f37187a, str, surface, (ReactInstance) obj);
            }
        }).w();
    }

    public final void unregisterInstanceFromInspector$ReactAndroid_release(ReactInstance reactInstance) {
        if (reactInstance != null) {
            if (InspectorFlags.getFuseboxEnabled()) {
                ReactHostInspectorTarget reactHostInspectorTarget = this.reactHostInspectorTarget;
                boolean z10 = false;
                if (reactHostInspectorTarget != null && reactHostInspectorTarget.isValid()) {
                    z10 = true;
                }
                Q6.a.b(z10, "Host inspector target destroyed before instance was unregistered");
            }
            reactInstance.unregisterFromInspector();
        }
    }

    @Override // com.facebook.react.ReactHost
    public InterfaceC4656a destroy(final String reason, final Exception ex) {
        AbstractC5504s.h(reason, "reason");
        return y7.n.f64899g.h(new Callable() { // from class: com.facebook.react.runtime.S
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ReactHostImpl.destroy$lambda$11(this.f37237a, reason, ex);
            }
        }, this.bgExecutor);
    }

    @Override // com.facebook.react.ReactHost
    public void onHostResume(Activity activity) {
        c0.b(this.stateTracker, "onHostResume(activity)", null, 2, null);
        setCurrentActivity(activity);
        FrameTimingsObserver frameTimingsObserver = this.frameTimingsObserver;
        if (frameTimingsObserver != null) {
            frameTimingsObserver.setCurrentWindow(activity != null ? activity.getWindow() : null);
        }
        maybeEnableDevSupport(true);
        this.reactLifecycleStateManager.d(getCurrentReactContext(), activity);
    }

    @Override // com.facebook.react.ReactHost
    public void setBundleSource(String debugServerHost, String moduleName, Function1 queryMapper) {
        AbstractC5504s.h(debugServerHost, "debugServerHost");
        AbstractC5504s.h(moduleName, "moduleName");
        AbstractC5504s.h(queryMapper, "queryMapper");
        AbstractC1617k.d(Gf.P.a(C1608f0.a()), null, null, new f(queryMapper, debugServerHost, moduleName, null), 3, null);
    }

    @Override // com.facebook.react.ReactHost
    public void onHostDestroy(Activity activity) {
        c0.b(this.stateTracker, "onHostDestroy(activity)", null, 2, null);
        if (getCurrentActivity$ReactAndroid_release() == activity) {
            maybeEnableDevSupport(false);
            moveToHostDestroy(getCurrentReactContext());
        }
    }

    public final NativeModule getNativeModule$ReactAndroid_release(String nativeModuleName) {
        AbstractC5504s.h(nativeModuleName, "nativeModuleName");
        ReactInstance reactInstance = this.reactInstance;
        if (reactInstance != null) {
            return reactInstance.r(nativeModuleName);
        }
        return null;
    }

    @Override // com.facebook.react.ReactHost
    public void onHostPause() {
        c0.b(this.stateTracker, "onHostPause()", null, 2, null);
        maybeEnableDevSupport(false);
        this.defaultHardwareBackBtnHandler = null;
        this.reactLifecycleStateManager.c(getCurrentReactContext(), getCurrentActivity$ReactAndroid_release());
    }

    public /* synthetic */ ReactHostImpl(Context context, InterfaceC3258f interfaceC3258f, ComponentFactory componentFactory, Executor executor, Executor executor2, boolean z10, boolean z11, InterfaceC3213b0 interfaceC3213b0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, interfaceC3258f, componentFactory, (i10 & 8) != 0 ? Executors.newSingleThreadExecutor() : executor, (i10 & 16) != 0 ? y7.n.f64901i : executor2, z10, z11, (i10 & 128) != 0 ? null : interfaceC3213b0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ReactHostImpl(Context context, InterfaceC3258f delegate, ComponentFactory componentFactory, boolean z10, boolean z11) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(delegate, "delegate");
        AbstractC5504s.h(componentFactory, "componentFactory");
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        AbstractC5504s.g(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this(context, delegate, componentFactory, executorServiceNewSingleThreadExecutor, y7.n.f64901i, z10, z11, null, 128, null);
    }
}
