package com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel;

import G1.i;
import Gf.AbstractC1617k;
import Gf.O;
import Jf.AbstractC1744g;
import Jf.E;
import Jf.I;
import Jf.K;
import Jf.u;
import Td.L;
import Td.r;
import Td.v;
import U.C2175l;
import Ud.AbstractC2279u;
import Xd.a;
import Y.C0;
import Y.b2;
import Y.h2;
import Zd.e;
import ae.AbstractC2605b;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import app.notifee.core.event.LogEvent;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.CreateSupportTicketResult;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.ListenerConversionsCommonKt;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PeriodType;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.PurchasesException;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.SubscriptionInfo;
import com.revenuecat.purchases.common.SharedConstants;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import com.revenuecat.purchases.customercenter.CustomActionData;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.customercenter.CustomerCenterListener;
import com.revenuecat.purchases.customercenter.CustomerCenterManagementOption;
import com.revenuecat.purchases.customercenter.events.CustomerCenterImpressionEvent;
import com.revenuecat.purchases.customercenter.events.CustomerCenterSurveyOptionChosenEvent;
import com.revenuecat.purchases.models.GoogleStoreProduct;
import com.revenuecat.purchases.models.GoogleSubscriptionOption;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import com.revenuecat.purchases.models.Transaction;
import com.revenuecat.purchases.ui.revenuecatui.OfferingSelection;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivity;
import com.revenuecat.purchases.ui.revenuecatui.activity.PaywallActivityArgs;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CreateSupportTicketData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.FeedbackSurveyData;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PathUtils;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesState;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.navigation.CustomerCenterDestination;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.navigation.CustomerCenterNavigationState;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.TransactionDetails;
import com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType;
import com.revenuecat.purchases.ui.revenuecatui.helpers.LocaleHelpersKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import com.revenuecat.purchases.ui.revenuecatui.utils.DateFormatter;
import com.revenuecat.purchases.ui.revenuecatui.utils.DefaultDateFormatter;
import com.revenuecat.purchases.ui.revenuecatui.utils.URLOpener;
import com.revenuecat.purchases.ui.revenuecatui.utils.URLOpeningMethod;
import ie.InterfaceC5082a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC5504s;
import kotlin.jvm.internal.AbstractC5506u;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Æ\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 æ\u00012\u00020\u00012\u00020\u0002:\u0002æ\u0001B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b(\u0010'J+\u0010+\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)2\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b+\u0010,J\"\u0010.\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010-\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b.\u0010/J/\u00106\u001a\b\u0012\u0004\u0012\u00020)052\b\u00100\u001a\u0004\u0018\u00010\u001c2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b6\u00107J1\u00108\u001a\b\u0012\u0004\u0012\u00020)05*\b\u0012\u0004\u0012\u00020)052\b\u00100\u001a\u0004\u0018\u00010\u001c2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b8\u00109J!\u0010:\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b:\u0010;J!\u0010<\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b<\u0010;J\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020)052\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J.\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001c052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u00104\u001a\u000203H\u0082@¢\u0006\u0004\bA\u0010BJ\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020E052\u0006\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bF\u0010GJ\u0019\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bI\u0010JJ:\u0010N\u001a\u00020\u001c2\u0006\u0010K\u001a\u00020E2\b\u0010M\u001a\u0004\u0018\u00010L2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u00104\u001a\u000203H\u0082@¢\u0006\u0004\bN\u0010OJ\u0018\u0010Q\u001a\u00020\u00152\u0006\u0010P\u001a\u00020\u000bH\u0082@¢\u0006\u0004\bQ\u0010RJ#\u0010U\u001a\u00020=*\u00020=2\u0006\u0010P\u001a\u00020\u000b2\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u0015H\u0002¢\u0006\u0004\bW\u0010XJ)\u0010\\\u001a\u00020\u00152\u0006\u0010*\u001a\u00020Y2\b\u0010Z\u001a\u0004\u0018\u00010\u00112\u0006\u0010[\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\\\u0010]J\u000f\u0010_\u001a\u00020^H\u0002¢\u0006\u0004\b_\u0010`J-\u0010f\u001a\u00020\u00152\u0006\u0010b\u001a\u00020a2\u0014\u0010e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010d\u0012\u0004\u0012\u00020\u00150cH\u0002¢\u0006\u0004\bf\u0010gJ\"\u0010k\u001a\u0004\u0018\u00010j2\u0006\u0010i\u001a\u00020h2\u0006\u0010!\u001a\u00020 H\u0082@¢\u0006\u0004\bk\u0010lJ\"\u0010o\u001a\u0004\u0018\u00010 2\u0006\u0010m\u001a\u00020\u00112\u0006\u0010n\u001a\u00020\u0011H\u0082@¢\u0006\u0004\bo\u0010pJ!\u0010s\u001a\u0004\u0018\u00010j2\u0006\u0010q\u001a\u00020\u00112\u0006\u0010r\u001a\u00020 H\u0002¢\u0006\u0004\bs\u0010tJ>\u0010u\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010i\u001a\u0004\u0018\u00010h2\u0006\u0010*\u001a\u00020)2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0082@¢\u0006\u0004\bu\u0010vJ\u000f\u0010w\u001a\u00020\u0015H\u0002¢\u0006\u0004\bw\u0010XJ\u0013\u0010x\u001a\u00020=*\u00020=H\u0002¢\u0006\u0004\bx\u0010yJ\u001f\u0010{\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010z\u001a\u00020\u0011H\u0002¢\u0006\u0004\b{\u0010|J\u000f\u0010}\u001a\u00020\u0015H\u0002¢\u0006\u0004\b}\u0010XJ\u0017\u0010~\u001a\u00020\u00152\u0006\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\b~\u0010\u007fJ\u001c\u0010\u0082\u0001\u001a\u00020\u00152\b\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0011\u0010\u0084\u0001\u001a\u00020\u0015H\u0002¢\u0006\u0005\b\u0084\u0001\u0010XJ\u001b\u0010\u0086\u0001\u001a\u00020\u00152\u0007\u0010\u0085\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J$\u0010\u0088\u0001\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001c\u0010\u008c\u0001\u001a\u00020\u00152\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001H\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J#\u0010\u008f\u0001\u001a\u00020\u00152\u0006\u0010D\u001a\u00020C2\u0007\u0010K\u001a\u00030\u008e\u0001H\u0002¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001a\u0010\u0091\u0001\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J$\u0010\u0095\u0001\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0094\u0001\u001a\u00030\u0093\u0001H\u0002¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J%\u0010\u009a\u0001\u001a\u00020\u00152\u0007\u0010\u0097\u0001\u001a\u00020\u00112\b\u0010\u0099\u0001\u001a\u00030\u0098\u0001H\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0017\u0010\u009d\u0001\u001a\u00020H*\u00030\u009c\u0001H\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J,\u0010\u009f\u0001\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020)2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u001b\u0010¢\u0001\u001a\u00020\u00152\u0007\u0010¡\u0001\u001a\u00020\u001cH\u0016¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u001c\u0010¤\u0001\u001a\u00020\u00152\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001H\u0016¢\u0006\u0006\b¤\u0001\u0010\u008d\u0001J\u0011\u0010¥\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\b¥\u0001\u0010XJ\u0011\u0010¦\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\b¦\u0001\u0010XJ\u0011\u0010§\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\b§\u0001\u0010XJ\u0013\u0010¨\u0001\u001a\u00020\u0015H\u0096@¢\u0006\u0006\b¨\u0001\u0010©\u0001J\u0013\u0010ª\u0001\u001a\u00020\u0015H\u0096@¢\u0006\u0006\bª\u0001\u0010©\u0001J\"\u0010¬\u0001\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0007\u0010«\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0005\b¬\u0001\u0010|J,\u0010¯\u0001\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010Z\u001a\u00020\u00112\b\u0010®\u0001\u001a\u00030\u00ad\u0001H\u0016¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u0011\u0010±\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\b±\u0001\u0010XJ=\u0010³\u0001\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 2\u0006\u0010i\u001a\u00020h2\u0007\u0010²\u0001\u001a\u00020)2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096@¢\u0006\u0005\b³\u0001\u0010vJ(\u0010·\u0001\u001a\u00020\u00152\u0007\u0010´\u0001\u001a\u00020j2\n\u0010¶\u0001\u001a\u0005\u0018\u00010µ\u0001H\u0096@¢\u0006\u0006\b·\u0001\u0010¸\u0001J#\u0010¹\u0001\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0007\u0010²\u0001\u001a\u00020)H\u0016¢\u0006\u0006\b¹\u0001\u0010º\u0001J)\u0010¼\u0001\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\r\u0010»\u0001\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u0011\u0010Q\u001a\u00020\u0015H\u0097@¢\u0006\u0005\bQ\u0010©\u0001J\u0013\u0010¾\u0001\u001a\u00020\u0015H\u0096@¢\u0006\u0006\b¾\u0001\u0010©\u0001J\u001b\u0010À\u0001\u001a\u00020\u00152\u0007\u0010¿\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0006\bÀ\u0001\u0010Á\u0001J\u0011\u0010Â\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\bÂ\u0001\u0010XJ\u0011\u0010Ã\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\bÃ\u0001\u0010XJ\u0011\u0010Ä\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\bÄ\u0001\u0010XJ$\u0010Ç\u0001\u001a\u00020\u00152\u0007\u0010Å\u0001\u001a\u00020\t2\u0007\u0010Æ\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0006\bÇ\u0001\u0010È\u0001J\u0011\u0010É\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\bÉ\u0001\u0010XJ\u001a\u0010Ê\u0001\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0006\bÊ\u0001\u0010\u0092\u0001R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010Ë\u0001R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010Ì\u0001R\u0015\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\b\u0010Í\u0001R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010Î\u0001R\u0017\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\f\u0010Ï\u0001R\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010Ð\u0001R\u001c\u0010Ò\u0001\u001a\u0005\u0018\u00010Ñ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R\u0019\u0010Ô\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010Ï\u0001R\u0019\u0010Õ\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010Ï\u0001R\u001e\u0010×\u0001\u001a\t\u0012\u0004\u0012\u00020^0Ö\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b×\u0001\u0010Ø\u0001R\u001e\u0010Ù\u0001\u001a\t\u0012\u0004\u0012\u00020\t0Ö\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÙ\u0001\u0010Ø\u0001R\u001e\u0010Ú\u0001\u001a\t\u0012\u0004\u0012\u00020S0Ö\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÚ\u0001\u0010Ø\u0001R$\u0010>\u001a\t\u0012\u0004\u0012\u00020S0Û\u00018\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b>\u0010Ü\u0001\u001a\u0006\bÝ\u0001\u0010Þ\u0001R!\u0010à\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u0080\u00010ß\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R!\u0010å\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u0080\u00010â\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bã\u0001\u0010ä\u0001¨\u0006ç\u0001"}, d2 = {"Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;", "Landroidx/lifecycle/U;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModel;", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;", "purchases", "Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;", "dateFormatter", "Ljava/util/Locale;", "locale", "LU/l;", "colorScheme", "", "isDarkMode", "Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;", "listener", "<init>", "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;LU/l;ZLcom/revenuecat/purchases/customercenter/CustomerCenterListener;)V", "", "email", b.f34645c, "Lkotlin/Function0;", "LTd/L;", "onSuccess", "onError", "handleSupportTicketSubmit", "(Ljava/lang/String;Ljava/lang/String;Lie/a;Lie/a;)V", "Landroid/content/Context;", "context", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;", "purchaseInformation", "handleCancelPath", "(Landroid/content/Context;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V", "Lcom/revenuecat/purchases/models/StoreProduct;", "product", "startGoogleProductCancellation", "(Landroid/content/Context;Lcom/revenuecat/purchases/models/StoreProduct;)V", "Landroid/net/Uri;", "managementURL", "startAmazonCancellation", "(Landroid/content/Context;Landroid/net/Uri;)V", "startManagementUrlCancellation", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;", "path", "mainPathAction", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Landroid/content/Context;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V", "listenerName", "shouldResumeRestorePurchases", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;Ljava/lang/String;LZd/e;)Ljava/lang/Object;", "selectedPurchaseInformation", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;", "screen", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;", "localization", "", "supportedPaths", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)Ljava/util/List;", "transformPathsOnSubscriptionState", "(Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)Ljava/util/List;", "isPathAllowedForSubscriptionState", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)Z", "isPathAllowedForStore", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;", "state", "computeMainScreenPaths", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;)Ljava/util/List;", "loadPurchases", "(Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LZd/e;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;", "findActiveTransactions", "(Lcom/revenuecat/purchases/CustomerInfo;)Ljava/util/List;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;", "findLatestExpiredSubscription", "(Lcom/revenuecat/purchases/CustomerInfo;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;", "transaction", "Lcom/revenuecat/purchases/EntitlementInfo;", "entitlement", "createPurchaseInformation", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;Lcom/revenuecat/purchases/EntitlementInfo;Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LZd/e;)Ljava/lang/Object;", "isRefresh", "loadCustomerCenter", "(ZLZd/e;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;", "previousState", "preservingUIStateIfRefresh", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;ZLcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;", "launchRefreshIfPossible", "()V", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;", "url", "surveyOptionID", "trackCustomerCenterEventOptionChosen", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;Ljava/lang/String;Ljava/lang/String;)V", "LG1/i;", "getCurrentLocaleList", "()LG1/i;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;", "feedbackSurvey", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;", "onAnswerSubmitted", "displayFeedbackSurvey", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;Lkotlin/jvm/functions/Function1;)V", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;", "promotionalOffer", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "getPromotionalSubscriptionOption", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Lcom/revenuecat/purchases/models/StoreProduct;LZd/e;)Ljava/lang/Object;", "targetProductId", "sourceBasePlan", "findTargetProduct", "(Ljava/lang/String;Ljava/lang/String;LZd/e;)Ljava/lang/Object;", "offerIdentifier", "targetProduct", "getCustomerCenterSubscriptionOption", "(Ljava/lang/String;Lcom/revenuecat/purchases/models/StoreProduct;)Lcom/revenuecat/purchases/models/SubscriptionOption;", "handlePromotionalOffer", "(Landroid/content/Context;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;LZd/e;)Ljava/lang/Object;", "goBackToMain", "resetToMainScreen", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;", "productId", "showManageSubscriptions", "(Landroid/content/Context;Ljava/lang/String;)V", "notifyListenersForRestoreStarted", "notifyListenersForRestoreCompleted", "(Lcom/revenuecat/purchases/CustomerInfo;)V", "Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "notifyListenersForRestoreFailed", "(Lcom/revenuecat/purchases/PurchasesError;)V", "notifyListenersForManageSubscription", "feedbackSurveyOptionId", "notifyListenersForFeedbackSurveyCompleted", "(Ljava/lang/String;)V", "notifyListenersForManagementOptionSelected", "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V", "Lcom/revenuecat/purchases/customercenter/CustomActionData;", "customActionData", "notifyListenersForCustomActionSelected", "(Lcom/revenuecat/purchases/customercenter/CustomActionData;)V", "Lcom/revenuecat/purchases/models/StoreTransaction;", "notifyListenersForPromotionalOfferSucceeded", "(Lcom/revenuecat/purchases/CustomerInfo;Lcom/revenuecat/purchases/models/StoreTransaction;)V", "tryFallbackToCurrentOffering", "(Landroid/content/Context;)V", "Lcom/revenuecat/purchases/Offering;", "offering", "launchPaywallActivity", "(Landroid/content/Context;Lcom/revenuecat/purchases/Offering;)V", "message", "Lcom/revenuecat/purchases/PurchasesErrorCode;", "errorCode", "handlePaywallError", "(Ljava/lang/String;Lcom/revenuecat/purchases/PurchasesErrorCode;)V", "Lcom/revenuecat/purchases/SubscriptionInfo;", "asTransactionDetails", "(Lcom/revenuecat/purchases/SubscriptionInfo;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;", "pathButtonPressed", "(Landroid/content/Context;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V", "purchase", "selectPurchase", "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V", "onCustomActionSelected", "showVirtualCurrencyBalances", "showCreateSupportTicket", "dismissSupportTicketSuccessSnackbar", "dismissRestoreDialog", "(LZd/e;)Ljava/lang/Object;", "restorePurchases", "supportEmail", "contactSupport", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;", "method", "openURL", "(Landroid/content/Context;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;)V", "clearActionError", "originalPath", "loadAndDisplayPromotionalOffer", "subscriptionOption", "Landroid/app/Activity;", "activity", "onAcceptedPromotionalOffer", "(Lcom/revenuecat/purchases/models/SubscriptionOption;Landroid/app/Activity;LZd/e;)Ljava/lang/Object;", "dismissPromotionalOffer", "(Landroid/content/Context;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;)V", "onDismiss", "onNavigationButtonPressed", "(Landroid/content/Context;Lie/a;)V", "refreshCustomerCenter", "isChangingConfigurations", "onActivityStopped", "(Z)V", "onActivityStarted", "onActivityResumed", "refreshStateIfLocaleChanged", "currentColorScheme", "isSystemInDarkTheme", "refreshColors", "(LU/l;Z)V", "trackImpressionIfNeeded", "showPaywall", "Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;", "Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;", "Ljava/util/Locale;", "LU/l;", "Z", "Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent$CreationData;", "impressionCreationData", "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent$CreationData;", "wasBackgrounded", "shouldRefreshOnResume", "LJf/u;", "_lastLocaleList", "LJf/u;", "_colorScheme", "_state", "LJf/I;", "LJf/I;", "getState", "()LJf/I;", "LY/C0;", "_actionError", "LY/C0;", "LY/h2;", "getActionError", "()LY/h2;", "actionError", "Companion", "revenuecatui_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CustomerCenterViewModelImpl extends U implements CustomerCenterViewModel {
    private static final long STOP_FLOW_TIMEOUT = 5000;
    private final C0 _actionError;
    private final u _colorScheme;
    private final u _lastLocaleList;
    private final u _state;
    private final C2175l colorScheme;
    private final DateFormatter dateFormatter;
    private CustomerCenterImpressionEvent.CreationData impressionCreationData;
    private boolean isDarkMode;
    private final CustomerCenterListener listener;
    private final Locale locale;
    private final PurchasesType purchases;
    private boolean shouldRefreshOnResume;
    private final I state;
    private boolean wasBackgrounded;
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CustomerCenterConfigData.HelpPath.PathType.values().length];
            try {
                iArr[CustomerCenterConfigData.HelpPath.PathType.MISSING_PURCHASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CustomerCenterConfigData.HelpPath.PathType.CANCEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CustomerCenterConfigData.HelpPath.PathType.CUSTOM_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CustomerCenterConfigData.HelpPath.PathType.CUSTOM_ACTION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CustomerCenterConfigData.HelpPath.PathType.REFUND_REQUEST.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CustomerCenterConfigData.HelpPath.PathType.CHANGE_PLANS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CustomerCenterConfigData.HelpPath.PathType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CustomerCenterConfigData.HelpPath.OpenMethod.values().length];
            try {
                iArr2[CustomerCenterConfigData.HelpPath.OpenMethod.IN_APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CustomerCenterConfigData.HelpPath.OpenMethod.EXTERNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$createPurchaseInformation$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl", f = "CustomerCenterViewModel.kt", l = {793}, m = "createPurchaseInformation")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerCenterViewModelImpl.this.createPurchaseInformation(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$findTargetProduct$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl", f = "CustomerCenterViewModel.kt", l = {1252}, m = "findTargetProduct")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43601 extends d {
        int label;
        /* synthetic */ Object result;

        C43601(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerCenterViewModelImpl.this.findTargetProduct(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$getPromotionalSubscriptionOption$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl", f = "CustomerCenterViewModel.kt", l = {1227}, m = "getPromotionalSubscriptionOption")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43611 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C43611(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerCenterViewModelImpl.this.getPromotionalSubscriptionOption(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$handleSupportTicketSubmit$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$handleSupportTicketSubmit$1", f = "CustomerCenterViewModel.kt", l = {RCHTTPStatusCodes.UNAUTHORIZED}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
    static final class C43621 extends l implements Function2 {
        final /* synthetic */ String $description;
        final /* synthetic */ String $email;
        final /* synthetic */ InterfaceC5082a $onError;
        final /* synthetic */ InterfaceC5082a $onSuccess;
        int label;
        final /* synthetic */ CustomerCenterViewModelImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43621(String str, String str2, CustomerCenterViewModelImpl customerCenterViewModelImpl, InterfaceC5082a interfaceC5082a, InterfaceC5082a interfaceC5082a2, e eVar) {
            super(2, eVar);
            this.$email = str;
            this.$description = str2;
            this.this$0 = customerCenterViewModelImpl;
            this.$onSuccess = interfaceC5082a;
            this.$onError = interfaceC5082a2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return new C43621(this.$email, this.$description, this.this$0, this.$onSuccess, this.$onError, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, e eVar) {
            return ((C43621) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objAwaitCreateSupportTicket;
            Object value;
            Object objCopy$default;
            Object objF = AbstractC2605b.f();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    v.b(obj);
                    Logger.INSTANCE.d("Creating support ticket - email: " + this.$email + ", Description: " + this.$description);
                    PurchasesType purchasesType = this.this$0.purchases;
                    String str = this.$email;
                    String str2 = this.$description;
                    this.label = 1;
                    objAwaitCreateSupportTicket = purchasesType.awaitCreateSupportTicket(str, str2, this);
                    if (objAwaitCreateSupportTicket == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                    objAwaitCreateSupportTicket = obj;
                }
                if (((CreateSupportTicketResult) objAwaitCreateSupportTicket).getSuccess()) {
                    Logger.INSTANCE.d("Support ticket created successfully");
                    u uVar = this.this$0._state;
                    do {
                        value = uVar.getValue();
                        objCopy$default = (CustomerCenterState) value;
                        if (objCopy$default instanceof CustomerCenterState.Success) {
                            objCopy$default = CustomerCenterState.Success.copy$default((CustomerCenterState.Success) objCopy$default, null, null, null, null, null, null, ((CustomerCenterState.Success) objCopy$default).getNavigationState().pop(), ((CustomerCenterState.Success) objCopy$default).getNavigationState().pop().getCanNavigateBack() ? CustomerCenterState.NavigationButtonType.BACK : CustomerCenterState.NavigationButtonType.CLOSE, null, true, false, 1343, null);
                        }
                    } while (!uVar.f(value, objCopy$default));
                    this.$onSuccess.invoke();
                } else {
                    Logger.INSTANCE.e("Support ticket creation returned false");
                    this.$onError.invoke();
                }
            } catch (PurchasesException e10) {
                Logger.INSTANCE.e("Error creating support ticket", e10);
                this.$onError.invoke();
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$launchRefreshIfPossible$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$launchRefreshIfPossible$1", f = "CustomerCenterViewModel.kt", l = {1104}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
    static final class C43631 extends l implements Function2 {
        int label;

        C43631(e eVar) {
            super(2, eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return CustomerCenterViewModelImpl.this.new C43631(eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, e eVar) {
            return ((C43631) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objF = AbstractC2605b.f();
            int i10 = this.label;
            if (i10 == 0) {
                v.b(obj);
                CustomerCenterViewModelImpl customerCenterViewModelImpl = CustomerCenterViewModelImpl.this;
                this.label = 1;
                if (customerCenterViewModelImpl.refreshCustomerCenter(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$loadAndDisplayPromotionalOffer$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl", f = "CustomerCenterViewModel.kt", l = {858}, m = "loadAndDisplayPromotionalOffer")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43641 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C43641(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerCenterViewModelImpl.this.loadAndDisplayPromotionalOffer(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$loadCustomerCenter$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl", f = "CustomerCenterViewModel.kt", l = {1013, 1014, 1021, 1029}, m = "loadCustomerCenter")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class AnonymousClass2 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass2(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerCenterViewModelImpl.this.loadCustomerCenter(false, this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$loadPurchases$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl", f = "CustomerCenterViewModel.kt", l = {704, 717, 737}, m = "loadPurchases")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43651 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        C43651(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerCenterViewModelImpl.this.loadPurchases(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$onAcceptedPromotionalOffer$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl", f = "CustomerCenterViewModel.kt", l = {902, 910}, m = "onAcceptedPromotionalOffer")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43661 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C43661(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerCenterViewModelImpl.this.onAcceptedPromotionalOffer(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$pathButtonPressed$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$pathButtonPressed$2", f = "CustomerCenterViewModel.kt", l = {271}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGf/O;", "LTd/L;", "<anonymous>", "(LGf/O;)V"}, k = 3, mv = {1, 8, 0})
    static final class C43672 extends l implements Function2 {
        final /* synthetic */ Context $context;
        final /* synthetic */ CustomerCenterConfigData.HelpPath $path;
        final /* synthetic */ PurchaseInformation $purchaseInformation;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43672(Context context, PurchaseInformation purchaseInformation, CustomerCenterConfigData.HelpPath helpPath, e eVar) {
            super(2, eVar);
            this.$context = context;
            this.$purchaseInformation = purchaseInformation;
            this.$path = helpPath;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final e create(Object obj, e eVar) {
            return CustomerCenterViewModelImpl.this.new C43672(this.$context, this.$purchaseInformation, this.$path, eVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O o10, e eVar) {
            return ((C43672) create(o10, eVar)).invokeSuspend(L.f17438a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C43672 c43672;
            Object objF = AbstractC2605b.f();
            int i10 = this.label;
            if (i10 == 0) {
                v.b(obj);
                CustomerCenterViewModelImpl customerCenterViewModelImpl = CustomerCenterViewModelImpl.this;
                Context context = this.$context;
                PurchaseInformation purchaseInformation = this.$purchaseInformation;
                StoreProduct product = purchaseInformation != null ? purchaseInformation.getProduct() : null;
                CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer = this.$path.getPromotionalOffer();
                CustomerCenterConfigData.HelpPath helpPath = this.$path;
                PurchaseInformation purchaseInformation2 = this.$purchaseInformation;
                this.label = 1;
                c43672 = this;
                obj = customerCenterViewModelImpl.handlePromotionalOffer(context, product, promotionalOffer, helpPath, purchaseInformation2, c43672);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                c43672 = this;
            }
            if (!((Boolean) obj).booleanValue()) {
                CustomerCenterViewModelImpl.this.mainPathAction(c43672.$path, c43672.$context, c43672.$purchaseInformation);
            }
            return L.f17438a;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$restorePurchases$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl", f = "CustomerCenterViewModel.kt", l = {544, 545, 561}, m = "restorePurchases")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43681 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C43681(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerCenterViewModelImpl.this.restorePurchases(this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$shouldResumeRestorePurchases$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @f(c = "com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl", f = "CustomerCenterViewModel.kt", l = {1468}, m = "shouldResumeRestorePurchases")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class C43691 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C43691(e eVar) {
            super(eVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CustomerCenterViewModelImpl.this.shouldResumeRestorePurchases(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$tryFallbackToCurrentOffering$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", LogEvent.LEVEL_ERROR, "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43701 extends AbstractC5506u implements Function1 {
        C43701() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return L.f17438a;
        }

        public final void invoke(PurchasesError error) {
            AbstractC5504s.h(error, "error");
            CustomerCenterViewModelImpl.this.handlePaywallError("Failed to get current offering: " + error.getMessage(), error.getCode());
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$tryFallbackToCurrentOffering$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/Offerings;", "offerings", "LTd/L;", "invoke", "(Lcom/revenuecat/purchases/Offerings;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class C43712 extends AbstractC5506u implements Function1 {
        final /* synthetic */ Context $context;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C43712(Context context) {
            super(1);
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Offerings) obj);
            return L.f17438a;
        }

        public final void invoke(Offerings offerings) {
            AbstractC5504s.h(offerings, "offerings");
            Offering current = offerings.getCurrent();
            if (current == null) {
                CustomerCenterViewModelImpl.this.handlePaywallError("No offering available for paywall presentation", PurchasesErrorCode.ConfigurationError);
                return;
            }
            Logger.INSTANCE.d("Falling back to current offering: " + current.getIdentifier());
            CustomerCenterViewModelImpl.this.launchPaywallActivity(this.$context, current);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CustomerCenterViewModelImpl(PurchasesType purchasesType, DateFormatter dateFormatter, Locale locale, C2175l c2175l, boolean z10, CustomerCenterListener customerCenterListener, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        DateFormatter defaultDateFormatter = (i10 & 2) != 0 ? new DefaultDateFormatter() : dateFormatter;
        if ((i10 & 4) != 0) {
            locale = Locale.getDefault();
            AbstractC5504s.g(locale, "getDefault()");
        }
        this(purchasesType, defaultDateFormatter, locale, c2175l, z10, (i10 & 32) != 0 ? null : customerCenterListener);
    }

    private final TransactionDetails.Subscription asTransactionDetails(SubscriptionInfo subscriptionInfo) {
        return new TransactionDetails.Subscription(subscriptionInfo.getProductIdentifier(), subscriptionInfo.getProductPlanIdentifier(), subscriptionInfo.getStore(), subscriptionInfo.getIsActive(), subscriptionInfo.getWillRenew(), subscriptionInfo.getExpiresDate(), subscriptionInfo.getPeriodType() == PeriodType.TRIAL, subscriptionInfo.getManagementURL(), subscriptionInfo.getPrice(), subscriptionInfo.getIsSandbox());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath> computeMainScreenPaths(com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState.Success r5) {
        /*
            r4 = this;
            java.util.List r0 = r5.getPurchases()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L36
            java.util.List r0 = r5.getPurchases()
            if (r0 == 0) goto L17
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L17
            goto L36
        L17:
            java.util.Iterator r0 = r0.iterator()
        L1b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation r1 = (com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation) r1
            boolean r1 = r1.isExpired()
            if (r1 != 0) goto L1b
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData r0 = r5.getCustomerCenterConfigData()
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Screen r0 = r0.getManagementScreen()
            goto L3e
        L36:
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData r0 = r5.getCustomerCenterConfigData()
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Screen r0 = r0.getNoActiveScreen()
        L3e:
            r1 = 1
            if (r0 == 0) goto L65
            java.util.List r2 = r5.getPurchases()
            int r2 = r2.size()
            if (r2 != r1) goto L56
            java.util.List r2 = r5.getPurchases()
            java.lang.Object r2 = Ud.AbstractC2279u.m0(r2)
            com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation r2 = (com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation) r2
            goto L57
        L56:
            r2 = 0
        L57:
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData r3 = r5.getCustomerCenterConfigData()
            com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization r3 = r3.getLocalization()
            java.util.List r0 = r4.supportedPaths(r2, r0, r3)
            if (r0 != 0) goto L69
        L65:
            java.util.List r0 = Ud.AbstractC2279u.m()
        L69:
            java.util.List r5 = r5.getPurchases()
            int r5 = r5.size()
            if (r5 <= r1) goto L7a
            com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PathUtils r5 = com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PathUtils.INSTANCE
            java.util.List r5 = r5.filterGeneralPaths(r0)
            return r5
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl.computeMainScreenPaths(com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState$Success):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object createPurchaseInformation(com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.TransactionDetails r14, com.revenuecat.purchases.EntitlementInfo r15, com.revenuecat.purchases.ui.revenuecatui.utils.DateFormatter r16, java.util.Locale r17, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r18, Zd.e r19) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl.createPurchaseInformation(com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.TransactionDetails, com.revenuecat.purchases.EntitlementInfo, com.revenuecat.purchases.ui.revenuecatui.utils.DateFormatter, java.util.Locale, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, Zd.e):java.lang.Object");
    }

    private final void displayFeedbackSurvey(CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey, Function1 onAnswerSubmitted) {
        Object value;
        Object objCopy$default;
        u uVar = this._state;
        do {
            value = uVar.getValue();
            objCopy$default = (CustomerCenterState) value;
            if (objCopy$default instanceof CustomerCenterState.Success) {
                CustomerCenterState.Success success = (CustomerCenterState.Success) objCopy$default;
                objCopy$default = CustomerCenterState.Success.copy$default(success, null, null, null, null, null, null, success.getNavigationState().push(new CustomerCenterDestination.FeedbackSurvey(new FeedbackSurveyData(feedbackSurvey, onAnswerSubmitted), feedbackSurvey.getTitle())), CustomerCenterState.NavigationButtonType.BACK, null, false, false, 1855, null);
            }
        } while (!uVar.f(value, objCopy$default));
    }

    private final List<TransactionDetails> findActiveTransactions(CustomerInfo customerInfo) {
        Object nonSubscription;
        Collection<SubscriptionInfo> collectionValues = customerInfo.getSubscriptionsByProductIdentifier().values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (((SubscriptionInfo) obj).getIsActive()) {
                arrayList.add(obj);
            }
        }
        List listR0 = AbstractC2279u.R0(arrayList, new Comparator() { // from class: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$findActiveTransactions$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return a.d(((SubscriptionInfo) t10).getExpiresDate(), ((SubscriptionInfo) t11).getExpiresDate());
            }
        });
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listR0) {
            if (((SubscriptionInfo) obj2).getStore() == Store.PLAY_STORE) {
                arrayList2.add(obj2);
            }
        }
        List<Transaction> nonSubscriptionTransactions = customerInfo.getNonSubscriptionTransactions();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : nonSubscriptionTransactions) {
            if (((Transaction) obj3).getStore() == Store.PLAY_STORE) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : listR0) {
            if (((SubscriptionInfo) obj4).getStore() != Store.PLAY_STORE) {
                arrayList4.add(obj4);
            }
        }
        List<Transaction> nonSubscriptionTransactions2 = customerInfo.getNonSubscriptionTransactions();
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : nonSubscriptionTransactions2) {
            if (((Transaction) obj5).getStore() != Store.PLAY_STORE) {
                arrayList5.add(obj5);
            }
        }
        List listI0 = AbstractC2279u.I0(AbstractC2279u.I0(AbstractC2279u.I0(arrayList2, arrayList3), arrayList4), arrayList5);
        ArrayList arrayList6 = new ArrayList();
        for (Object obj6 : listI0) {
            if (obj6 instanceof SubscriptionInfo) {
                nonSubscription = asTransactionDetails((SubscriptionInfo) obj6);
            } else if (obj6 instanceof Transaction) {
                Transaction transaction = (Transaction) obj6;
                nonSubscription = new TransactionDetails.NonSubscription(transaction.getProductIdentifier(), transaction.getStore(), transaction.getPrice(), transaction.getIsSandbox());
            } else {
                nonSubscription = null;
            }
            if (nonSubscription != null) {
                arrayList6.add(nonSubscription);
            }
        }
        return arrayList6;
    }

    private final TransactionDetails.Subscription findLatestExpiredSubscription(CustomerInfo customerInfo) {
        Object next;
        Collection<SubscriptionInfo> collectionValues = customerInfo.getSubscriptionsByProductIdentifier().values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            SubscriptionInfo subscriptionInfo = (SubscriptionInfo) obj;
            if (!subscriptionInfo.getIsActive() && subscriptionInfo.getExpiresDate() != null) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                Date expiresDate = ((SubscriptionInfo) next).getExpiresDate();
                AbstractC5504s.e(expiresDate);
                do {
                    Object next2 = it.next();
                    Date expiresDate2 = ((SubscriptionInfo) next2).getExpiresDate();
                    AbstractC5504s.e(expiresDate2);
                    if (expiresDate.compareTo(expiresDate2) < 0) {
                        next = next2;
                        expiresDate = expiresDate2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        SubscriptionInfo subscriptionInfo2 = (SubscriptionInfo) next;
        if (subscriptionInfo2 != null) {
            return asTransactionDetails(subscriptionInfo2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object findTargetProduct(java.lang.String r11, java.lang.String r12, Zd.e r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl.C43601
            if (r0 == 0) goto L13
            r0 = r13
            com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$findTargetProduct$1 r0 = (com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl.C43601) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$findTargetProduct$1 r0 = new com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$findTargetProduct$1
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Td.v.b(r13)
            goto L5e
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            Td.v.b(r13)
            java.lang.String r13 = ":"
            java.lang.String[] r5 = new java.lang.String[]{r13}
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            r4 = r11
            java.util.List r11 = Df.r.N0(r4, r5, r6, r7, r8, r9)
            java.lang.Object r13 = Ud.AbstractC2279u.m0(r11)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r11 = Ud.AbstractC2279u.p0(r11, r3)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L52
            goto L53
        L52:
            r12 = r11
        L53:
            com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType r11 = r10.purchases
            r0.label = r3
            java.lang.Object r13 = r11.awaitGetProduct(r13, r12, r0)
            if (r13 != r1) goto L5e
            return r1
        L5e:
            com.revenuecat.purchases.models.StoreProduct r13 = (com.revenuecat.purchases.models.StoreProduct) r13
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl.findTargetProduct(java.lang.String, java.lang.String, Zd.e):java.lang.Object");
    }

    private final i getCurrentLocaleList() {
        String preferredUILocaleOverride = this.purchases.getPreferredUILocaleOverride();
        if (preferredUILocaleOverride == null) {
            i iVarD = i.d();
            AbstractC5504s.g(iVarD, "getDefault()");
            return iVarD;
        }
        try {
            i iVarA = i.a(LocaleHelpersKt.createLocaleFromString(preferredUILocaleOverride));
            AbstractC5504s.g(iVarA, "{\n            val locale….create(locale)\n        }");
            return iVarA;
        } catch (IllegalArgumentException unused) {
            Logger.INSTANCE.w("Invalid preferred locale format: " + preferredUILocaleOverride + ". Using system default.");
            i iVarD2 = i.d();
            AbstractC5504s.g(iVarD2, "{\n            Logger.w(\"…at.getDefault()\n        }");
            return iVarD2;
        }
    }

    private final SubscriptionOption getCustomerCenterSubscriptionOption(String offerIdentifier, StoreProduct targetProduct) {
        SubscriptionOptions subscriptionOptions = targetProduct.getSubscriptionOptions();
        SubscriptionOption subscriptionOption = null;
        if (subscriptionOptions == null) {
            return null;
        }
        Iterator<SubscriptionOption> it = subscriptionOptions.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SubscriptionOption next = it.next();
            SubscriptionOption subscriptionOption2 = next;
            if ((subscriptionOption2 instanceof GoogleSubscriptionOption) && subscriptionOption2.getTags().contains(SharedConstants.RC_CUSTOMER_CENTER_TAG) && AbstractC5504s.c(((GoogleSubscriptionOption) subscriptionOption2).getOfferId(), offerIdentifier)) {
                subscriptionOption = next;
                break;
            }
        }
        return subscriptionOption;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083 A[PHI: r2
  0x0083: PHI (r2v4 com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion) = 
  (r2v3 com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion)
  (r2v12 com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion)
  (r2v14 com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion)
 binds: [B:15:0x0054, B:19:0x0068, B:22:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getPromotionalSubscriptionOption(com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer r8, com.revenuecat.purchases.models.StoreProduct r9, Zd.e r10) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl.getPromotionalSubscriptionOption(com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer, com.revenuecat.purchases.models.StoreProduct, Zd.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void goBackToMain() {
        Object value;
        Object objResetToMainScreen;
        u uVar = this._state;
        do {
            value = uVar.getValue();
            objResetToMainScreen = (CustomerCenterState) value;
            if (objResetToMainScreen instanceof CustomerCenterState.Success) {
                objResetToMainScreen = resetToMainScreen((CustomerCenterState.Success) objResetToMainScreen);
            }
        } while (!uVar.f(value, objResetToMainScreen));
    }

    private final void handleCancelPath(Context context, PurchaseInformation purchaseInformation) {
        Object value = this._state.getValue();
        CustomerCenterState.Success success = value instanceof CustomerCenterState.Success ? (CustomerCenterState.Success) value : null;
        if (success == null) {
            return;
        }
        if (purchaseInformation == null) {
            CustomerCenterDestination currentDestination = success.getCurrentDestination();
            purchaseInformation = currentDestination instanceof CustomerCenterDestination.SelectedPurchaseDetail ? ((CustomerCenterDestination.SelectedPurchaseDetail) currentDestination).getPurchaseInformation() : success.getPurchases().size() == 1 ? (PurchaseInformation) AbstractC2279u.m0(success.getPurchases()) : null;
        }
        if ((purchaseInformation != null ? purchaseInformation.getStore() : null) == Store.PLAY_STORE && purchaseInformation.getProduct() != null) {
            startGoogleProductCancellation(context, purchaseInformation.getProduct());
            return;
        }
        if ((purchaseInformation != null ? purchaseInformation.getStore() : null) == Store.AMAZON && purchaseInformation.getManagementURL() != null) {
            startAmazonCancellation(context, purchaseInformation.getManagementURL());
            return;
        }
        if ((purchaseInformation != null ? purchaseInformation.getManagementURL() : null) != null) {
            startManagementUrlCancellation(context, purchaseInformation.getManagementURL());
        } else {
            Logger.INSTANCE.e("No product or management URL available for cancel path");
        }
    }

    static /* synthetic */ void handleCancelPath$default(CustomerCenterViewModelImpl customerCenterViewModelImpl, Context context, PurchaseInformation purchaseInformation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            purchaseInformation = null;
        }
        customerCenterViewModelImpl.handleCancelPath(context, purchaseInformation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePaywallError(String message, PurchasesErrorCode errorCode) {
        Logger.INSTANCE.e(message);
        this._actionError.setValue(new PurchasesError(errorCode, message));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handlePromotionalOffer(Context context, StoreProduct storeProduct, CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer, CustomerCenterConfigData.HelpPath helpPath, PurchaseInformation purchaseInformation, e eVar) {
        return (storeProduct == null || promotionalOffer == null) ? kotlin.coroutines.jvm.internal.b.a(false) : loadAndDisplayPromotionalOffer(context, storeProduct, promotionalOffer, helpPath, purchaseInformation, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleSupportTicketSubmit(String email, String description, InterfaceC5082a onSuccess, InterfaceC5082a onError) {
        if (((CustomerCenterState) this._state.getValue()) instanceof CustomerCenterState.Success) {
            AbstractC1617k.d(V.a(this), null, null, new C43621(email, description, this, onSuccess, onError, null), 3, null);
        }
    }

    private final boolean isPathAllowedForStore(CustomerCenterConfigData.HelpPath path, PurchaseInformation purchaseInformation) {
        switch (WhenMappings.$EnumSwitchMapping$0[path.getType().ordinal()]) {
            case 2:
                if ((purchaseInformation != null ? purchaseInformation.getStore() : null) != Store.PLAY_STORE) {
                    if ((purchaseInformation != null ? purchaseInformation.getManagementURL() : null) == null) {
                        return false;
                    }
                }
            case 1:
            case 3:
            case 4:
                return true;
            case 5:
            case 6:
            case 7:
                return false;
            default:
                throw new r();
        }
    }

    private final boolean isPathAllowedForSubscriptionState(CustomerCenterConfigData.HelpPath path, PurchaseInformation purchaseInformation) {
        if (path.getType() == CustomerCenterConfigData.HelpPath.PathType.CANCEL) {
            return (purchaseInformation == null || !purchaseInformation.isSubscription() || purchaseInformation.isExpired()) ? false : true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchPaywallActivity(Context context, Offering offering) {
        try {
            Logger logger = Logger.INSTANCE;
            logger.d("Showing paywall for offering: " + offering.getIdentifier());
            String identifier = offering.getIdentifier();
            Package r32 = (Package) AbstractC2279u.o0(offering.getAvailablePackages());
            PaywallActivityArgs paywallActivityArgs = new PaywallActivityArgs((String) null, new OfferingSelection.IdAndPresentedOfferingContext(identifier, r32 != null ? r32.getPresentedOfferingContext() : null), (Map) null, true, false, false, (Map) null, (Integer) null, 245, (DefaultConstructorMarker) null);
            Intent intent = new Intent(context, (Class<?>) PaywallActivity.class);
            intent.putExtra(PaywallActivity.ARGS_EXTRA, paywallActivityArgs);
            intent.addFlags(268435456);
            context.startActivity(intent);
            logger.d("Successfully launched paywall for offering: " + offering.getIdentifier());
        } catch (ActivityNotFoundException e10) {
            handlePaywallError("PaywallActivity not found: " + e10.getMessage(), PurchasesErrorCode.ConfigurationError);
        } catch (IllegalArgumentException e11) {
            handlePaywallError("Invalid argument for paywall: " + e11.getMessage(), PurchasesErrorCode.UnknownError);
        } catch (SecurityException e12) {
            handlePaywallError("Security error launching paywall: " + e12.getMessage(), PurchasesErrorCode.UnknownError);
        }
    }

    private final void launchRefreshIfPossible() {
        CustomerCenterState customerCenterState = (CustomerCenterState) this._state.getValue();
        if (!(customerCenterState instanceof CustomerCenterState.Success) || ((CustomerCenterState.Success) customerCenterState).isRefreshing()) {
            return;
        }
        AbstractC1617k.d(V.a(this), null, null, new C43631(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0196, code lost:
    
        if (r1 == r2) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0134 -> B:42:0x0139). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object loadPurchases(com.revenuecat.purchases.ui.revenuecatui.utils.DateFormatter r18, java.util.Locale r19, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization r20, Zd.e r21) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl.loadPurchases(com.revenuecat.purchases.ui.revenuecatui.utils.DateFormatter, java.util.Locale, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$Localization, Zd.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void mainPathAction(CustomerCenterConfigData.HelpPath path, Context context, PurchaseInformation purchaseInformation) {
        Object value;
        Object objCopy$default;
        String actionIdentifier;
        StoreProduct product;
        int i10 = WhenMappings.$EnumSwitchMapping$0[path.getType().ordinal()];
        if (i10 == 1) {
            u uVar = this._state;
            do {
                value = uVar.getValue();
                objCopy$default = (CustomerCenterState) value;
                if (objCopy$default instanceof CustomerCenterState.Success) {
                    objCopy$default = CustomerCenterState.Success.copy$default((CustomerCenterState.Success) objCopy$default, null, null, null, null, RestorePurchasesState.RESTORING, null, null, null, null, false, false, 2031, null);
                }
            } while (!uVar.f(value, objCopy$default));
            return;
        }
        if (i10 == 2) {
            handleCancelPath(context, purchaseInformation);
            return;
        }
        if (i10 != 3) {
            if (i10 == 4 && (actionIdentifier = path.getActionIdentifier()) != null) {
                onCustomActionSelected(new CustomActionData(actionIdentifier, (purchaseInformation == null || (product = purchaseInformation.getProduct()) == null) ? null : product.getId()));
                return;
            }
            return;
        }
        String url = path.getUrl();
        if (url != null) {
            CustomerCenterConfigData.HelpPath.OpenMethod openMethod = path.getOpenMethod();
            if (openMethod == null) {
                openMethod = CustomerCenterConfigData.HelpPath.OpenMethod.EXTERNAL;
            }
            openURL(context, url, openMethod);
        }
    }

    static /* synthetic */ void mainPathAction$default(CustomerCenterViewModelImpl customerCenterViewModelImpl, CustomerCenterConfigData.HelpPath helpPath, Context context, PurchaseInformation purchaseInformation, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            purchaseInformation = null;
        }
        customerCenterViewModelImpl.mainPathAction(helpPath, context, purchaseInformation);
    }

    private final void notifyListenersForCustomActionSelected(CustomActionData customActionData) {
        CustomerCenterListener customerCenterListener = this.listener;
        if (customerCenterListener != null) {
            customerCenterListener.onCustomActionSelected(customActionData.getActionIdentifier(), customActionData.getPurchaseIdentifier());
        }
        CustomerCenterListener customerCenterListener2 = this.purchases.getCustomerCenterListener();
        if (customerCenterListener2 != null) {
            customerCenterListener2.onCustomActionSelected(customActionData.getActionIdentifier(), customActionData.getPurchaseIdentifier());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyListenersForFeedbackSurveyCompleted(String feedbackSurveyOptionId) {
        CustomerCenterListener customerCenterListener = this.listener;
        if (customerCenterListener != null) {
            customerCenterListener.onFeedbackSurveyCompleted(feedbackSurveyOptionId);
        }
        CustomerCenterListener customerCenterListener2 = this.purchases.getCustomerCenterListener();
        if (customerCenterListener2 != null) {
            customerCenterListener2.onFeedbackSurveyCompleted(feedbackSurveyOptionId);
        }
    }

    private final void notifyListenersForManageSubscription() {
        CustomerCenterListener customerCenterListener = this.listener;
        if (customerCenterListener != null) {
            customerCenterListener.onShowingManageSubscriptions();
        }
        CustomerCenterListener customerCenterListener2 = this.purchases.getCustomerCenterListener();
        if (customerCenterListener2 != null) {
            customerCenterListener2.onShowingManageSubscriptions();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void notifyListenersForManagementOptionSelected(CustomerCenterConfigData.HelpPath path, PurchaseInformation purchaseInformation) {
        CustomerCenterManagementOption customUrl;
        String actionIdentifier;
        StoreProduct product;
        int i10 = WhenMappings.$EnumSwitchMapping$0[path.getType().ordinal()];
        if (i10 == 1) {
            customUrl = CustomerCenterManagementOption.MissingPurchase.INSTANCE;
        } else if (i10 != 2) {
            customUrl = null;
            id = null;
            String id2 = null;
            customUrl = null;
            customUrl = null;
            if (i10 == 3) {
                String url = path.getUrl();
                if (url != null) {
                    customUrl = new CustomerCenterManagementOption.CustomUrl(Uri.parse(url));
                }
            } else if (i10 == 4 && (actionIdentifier = path.getActionIdentifier()) != null) {
                if (purchaseInformation != null && (product = purchaseInformation.getProduct()) != null) {
                    id2 = product.getId();
                }
                customUrl = new CustomerCenterManagementOption.CustomAction(actionIdentifier, id2);
            }
        } else {
            customUrl = CustomerCenterManagementOption.Cancel.INSTANCE;
        }
        if (customUrl != null) {
            CustomerCenterListener customerCenterListener = this.listener;
            if (customerCenterListener != null) {
                customerCenterListener.onManagementOptionSelected(customUrl);
            }
            CustomerCenterListener customerCenterListener2 = this.purchases.getCustomerCenterListener();
            if (customerCenterListener2 != null) {
                customerCenterListener2.onManagementOptionSelected(customUrl);
            }
        }
    }

    private final void notifyListenersForPromotionalOfferSucceeded(CustomerInfo customerInfo, StoreTransaction transaction) {
        CustomerCenterListener customerCenterListener = this.listener;
        if (customerCenterListener != null) {
            customerCenterListener.onPromotionalOfferSucceeded(customerInfo, transaction);
        }
        CustomerCenterListener customerCenterListener2 = this.purchases.getCustomerCenterListener();
        if (customerCenterListener2 != null) {
            customerCenterListener2.onPromotionalOfferSucceeded(customerInfo, transaction);
        }
    }

    private final void notifyListenersForRestoreCompleted(CustomerInfo customerInfo) {
        CustomerCenterListener customerCenterListener = this.listener;
        if (customerCenterListener != null) {
            customerCenterListener.onRestoreCompleted(customerInfo);
        }
        CustomerCenterListener customerCenterListener2 = this.purchases.getCustomerCenterListener();
        if (customerCenterListener2 != null) {
            customerCenterListener2.onRestoreCompleted(customerInfo);
        }
    }

    private final void notifyListenersForRestoreFailed(PurchasesError error) {
        CustomerCenterListener customerCenterListener = this.listener;
        if (customerCenterListener != null) {
            customerCenterListener.onRestoreFailed(error);
        }
        CustomerCenterListener customerCenterListener2 = this.purchases.getCustomerCenterListener();
        if (customerCenterListener2 != null) {
            customerCenterListener2.onRestoreFailed(error);
        }
    }

    private final void notifyListenersForRestoreStarted() {
        CustomerCenterListener customerCenterListener = this.listener;
        if (customerCenterListener != null) {
            customerCenterListener.onRestoreStarted();
        }
        CustomerCenterListener customerCenterListener2 = this.purchases.getCustomerCenterListener();
        if (customerCenterListener2 != null) {
            customerCenterListener2.onRestoreStarted();
        }
    }

    private final CustomerCenterState.Success preservingUIStateIfRefresh(CustomerCenterState.Success success, boolean z10, CustomerCenterState customerCenterState) {
        if (!z10 || !(customerCenterState instanceof CustomerCenterState.Success)) {
            return success;
        }
        CustomerCenterState.Success success2 = (CustomerCenterState.Success) customerCenterState;
        CustomerCenterNavigationState navigationState = success2.getNavigationState();
        CustomerCenterState.NavigationButtonType navigationButtonType = customerCenterState.getNavigationButtonType();
        return CustomerCenterState.Success.copy$default(success, null, null, null, success2.getDetailScreenPaths(), success2.getRestorePurchasesState(), null, navigationState, navigationButtonType, null, success2.getShowSupportTicketSuccessSnackbar(), false, 1319, null);
    }

    private final CustomerCenterState.Success resetToMainScreen(CustomerCenterState.Success success) {
        return CustomerCenterState.Success.copy$default(success, null, null, null, null, null, null, success.getNavigationState().popToMain(), CustomerCenterState.NavigationButtonType.CLOSE, null, false, false, 1839, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object shouldResumeRestorePurchases(com.revenuecat.purchases.customercenter.CustomerCenterListener r7, java.lang.String r8, Zd.e r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl.C43691
            if (r0 == 0) goto L13
            r0 = r9
            com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$shouldResumeRestorePurchases$1 r0 = (com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl.C43691) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$shouldResumeRestorePurchases$1 r0 = new com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$shouldResumeRestorePurchases$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.L$0
            com.revenuecat.purchases.customercenter.CustomerCenterListener r7 = (com.revenuecat.purchases.customercenter.CustomerCenterListener) r7
            Td.v.b(r9)
            goto L96
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            Td.v.b(r9)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r3
            Gf.p r9 = new Gf.p
            Zd.e r2 = ae.AbstractC2605b.c(r0)
            r9.<init>(r2, r3)
            r9.C()
            com.revenuecat.purchases.ui.revenuecatui.helpers.Logger r2 = com.revenuecat.purchases.ui.revenuecatui.helpers.Logger.INSTANCE
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Restore Purchases Initiated… waiting for "
            r4.append(r5)
            r4.append(r8)
            java.lang.String r8 = " to proceed."
            r4.append(r8)
            java.lang.String r8 = r4.toString()
            r2.d(r8)
            if (r7 == 0) goto L76
            com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$shouldResumeRestorePurchases$shouldResume$1$1 r8 = new com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$shouldResumeRestorePurchases$shouldResume$1$1
            r8.<init>()
            r7.onRestoreInitiated(r8)
            Td.L r7 = Td.L.f17438a
            goto L77
        L76:
            r7 = 0
        L77:
            if (r7 != 0) goto L86
            Td.u$a r7 = Td.u.f17466b
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r3)
            java.lang.Object r7 = Td.u.b(r7)
            r9.resumeWith(r7)
        L86:
            java.lang.Object r9 = r9.v()
            java.lang.Object r7 = ae.AbstractC2605b.f()
            if (r9 != r7) goto L93
            kotlin.coroutines.jvm.internal.h.c(r0)
        L93:
            if (r9 != r1) goto L96
            return r1
        L96:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r7 = r9.booleanValue()
            if (r7 == 0) goto La1
            java.lang.String r8 = "will"
            goto La3
        La1:
            java.lang.String r8 = "will not"
        La3:
            com.revenuecat.purchases.ui.revenuecatui.helpers.Logger r9 = com.revenuecat.purchases.ui.revenuecatui.helpers.Logger.INSTANCE
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Restore Purchases gate complete. The SDK **"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = "** attempt to restore purchases."
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            r9.d(r8)
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl.shouldResumeRestorePurchases(com.revenuecat.purchases.customercenter.CustomerCenterListener, java.lang.String, Zd.e):java.lang.Object");
    }

    private final void showManageSubscriptions(Context context, String productId) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?sku=" + productId + "&package=" + context.getPackageName())));
        } catch (ActivityNotFoundException e10) {
            Logger.INSTANCE.e("Error opening manage subscriptions", e10);
        }
    }

    private final void startAmazonCancellation(Context context, Uri managementURL) {
        this.shouldRefreshOnResume = true;
        notifyListenersForManageSubscription();
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("amzn://apps/library/subscriptions")));
        } catch (ActivityNotFoundException unused) {
            String string = managementURL.toString();
            AbstractC5504s.g(string, "managementURL.toString()");
            openURL(context, string, CustomerCenterConfigData.HelpPath.OpenMethod.EXTERNAL);
        }
    }

    private final void startGoogleProductCancellation(Context context, StoreProduct product) {
        GoogleStoreProduct googleStoreProduct = product instanceof GoogleStoreProduct ? (GoogleStoreProduct) product : null;
        if (googleStoreProduct == null) {
            Logger.INSTANCE.e("Expected GoogleStoreProduct for Play Store cancellation");
            return;
        }
        this.shouldRefreshOnResume = true;
        notifyListenersForManageSubscription();
        showManageSubscriptions(context, googleStoreProduct.getProductId());
    }

    private final void startManagementUrlCancellation(Context context, Uri managementURL) {
        this.shouldRefreshOnResume = true;
        notifyListenersForManageSubscription();
        String string = managementURL.toString();
        AbstractC5504s.g(string, "managementURL.toString()");
        openURL(context, string, CustomerCenterConfigData.HelpPath.OpenMethod.EXTERNAL);
    }

    private final List<CustomerCenterConfigData.HelpPath> supportedPaths(PurchaseInformation selectedPurchaseInformation, CustomerCenterConfigData.Screen screen, CustomerCenterConfigData.Localization localization) {
        List<CustomerCenterConfigData.HelpPath> paths = screen.getPaths();
        ArrayList arrayList = new ArrayList();
        for (Object obj : paths) {
            if (isPathAllowedForStore((CustomerCenterConfigData.HelpPath) obj, selectedPurchaseInformation)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (isPathAllowedForSubscriptionState((CustomerCenterConfigData.HelpPath) obj2, selectedPurchaseInformation)) {
                arrayList2.add(obj2);
            }
        }
        return transformPathsOnSubscriptionState(arrayList2, selectedPurchaseInformation, localization);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackCustomerCenterEventOptionChosen(CustomerCenterConfigData.HelpPath.PathType path, String url, String surveyOptionID) {
        Locale localeC = ((i) this._lastLocaleList.getValue()).c(0);
        if (localeC == null) {
            localeC = Locale.getDefault();
        }
        Date date = new Date();
        boolean z10 = this.isDarkMode;
        String string = localeC.toString();
        AbstractC5504s.g(string, "locale.toString()");
        this.purchases.track(new CustomerCenterSurveyOptionChosenEvent(null, new CustomerCenterSurveyOptionChosenEvent.Data(date, z10, string, 0, 0, null, path, url, surveyOptionID, null, 568, null), 1, null));
    }

    private final List<CustomerCenterConfigData.HelpPath> transformPathsOnSubscriptionState(List<CustomerCenterConfigData.HelpPath> list, PurchaseInformation purchaseInformation, CustomerCenterConfigData.Localization localization) {
        ArrayList arrayList = new ArrayList(AbstractC2279u.x(list, 10));
        for (CustomerCenterConfigData.HelpPath helpPathCopy$default : list) {
            if (helpPathCopy$default.getType() == CustomerCenterConfigData.HelpPath.PathType.CANCEL && purchaseInformation != null && purchaseInformation.isCancelled()) {
                helpPathCopy$default = CustomerCenterConfigData.HelpPath.copy$default(helpPathCopy$default, null, localization.commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.RESUBSCRIBE), null, null, null, null, null, null, 229, null);
            }
            arrayList.add(helpPathCopy$default);
        }
        return arrayList;
    }

    private final void tryFallbackToCurrentOffering(Context context) {
        ListenerConversionsCommonKt.getOfferingsWith(Purchases.INSTANCE.getSharedInstance(), new C43701(), new C43712(context));
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel
    public void clearActionError() {
        this._actionError.setValue(null);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel
    public void contactSupport(Context context, String supportEmail) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(supportEmail, "supportEmail");
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:" + supportEmail));
        intent.putExtra("android.intent.extra.SUBJECT", "Support Request");
        intent.putExtra("android.intent.extra.TEXT", "Support request details...");
        context.startActivity(Intent.createChooser(intent, "Contact Support"));
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel
    public void dismissPromotionalOffer(Context context, CustomerCenterConfigData.HelpPath originalPath) {
        Object value;
        Object objCopy$default;
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(originalPath, "originalPath");
        Object value2 = this._state.getValue();
        CustomerCenterState.Success success = value2 instanceof CustomerCenterState.Success ? (CustomerCenterState.Success) value2 : null;
        CustomerCenterDestination currentDestination = success != null ? success.getCurrentDestination() : null;
        mainPathAction(originalPath, context, currentDestination instanceof CustomerCenterDestination.PromotionalOffer ? ((CustomerCenterDestination.PromotionalOffer) currentDestination).getPurchaseInformation() : null);
        u uVar = this._state;
        do {
            value = uVar.getValue();
            objCopy$default = (CustomerCenterState) value;
            if (objCopy$default instanceof CustomerCenterState.Success) {
                CustomerCenterState.Success success2 = (CustomerCenterState.Success) objCopy$default;
                objCopy$default = CustomerCenterState.Success.copy$default(success2, null, null, null, null, null, null, success2.getNavigationState().popToMain(), CustomerCenterState.NavigationButtonType.CLOSE, null, false, false, 1855, null);
            }
        } while (!uVar.f(value, objCopy$default));
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel
    public Object dismissRestoreDialog(e eVar) {
        Object objLoadCustomerCenter = loadCustomerCenter(eVar);
        return objLoadCustomerCenter == AbstractC2605b.f() ? objLoadCustomerCenter : L.f17438a;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel
    public void dismissSupportTicketSuccessSnackbar() {
        Object value;
        Object objCopy$default;
        u uVar = this._state;
        do {
            value = uVar.getValue();
            objCopy$default = (CustomerCenterState) value;
            if (objCopy$default instanceof CustomerCenterState.Success) {
                objCopy$default = CustomerCenterState.Success.copy$default((CustomerCenterState.Success) objCopy$default, null, null, null, null, null, null, null, null, null, false, false, 1535, null);
            }
        } while (!uVar.f(value, objCopy$default));
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel
    public h2 getActionError() {
        return this._actionError;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel
    public I getState() {
        return this.state;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object loadAndDisplayPromotionalOffer(android.content.Context r28, com.revenuecat.purchases.models.StoreProduct r29, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer r30, com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath r31, com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation r32, Zd.e r33) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl.loadAndDisplayPromotionalOffer(android.content.Context, com.revenuecat.purchases.models.StoreProduct, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer, com.revenuecat.purchases.customercenter.CustomerCenterConfigData$HelpPath, com.revenuecat.purchases.ui.revenuecatui.customercenter.data.PurchaseInformation, Zd.e):java.lang.Object");
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel
    public Object loadCustomerCenter(e eVar) {
        Object objLoadCustomerCenter = loadCustomerCenter(false, eVar);
        return objLoadCustomerCenter == AbstractC2605b.f() ? objLoadCustomerCenter : L.f17438a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
    
        if (r6.loadCustomerCenter(r0) == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object onAcceptedPromotionalOffer(com.revenuecat.purchases.models.SubscriptionOption r6, android.app.Activity r7, Zd.e r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl.C43661
            if (r0 == 0) goto L13
            r0 = r8
            com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$onAcceptedPromotionalOffer$1 r0 = (com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl.C43661) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$onAcceptedPromotionalOffer$1 r0 = new com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl$onAcceptedPromotionalOffer$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = ae.AbstractC2605b.f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.L$0
            com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl r6 = (com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl) r6
            Td.v.b(r8)     // Catch: com.revenuecat.purchases.PurchasesException -> L31
            goto La1
        L31:
            r7 = move-exception
            goto L8d
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            java.lang.Object r6 = r0.L$0
            com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl r6 = (com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl) r6
            Td.v.b(r8)     // Catch: com.revenuecat.purchases.PurchasesException -> L31
            goto L73
        L43:
            Td.v.b(r8)
            if (r7 != 0) goto L60
            com.revenuecat.purchases.ui.revenuecatui.helpers.Logger r6 = com.revenuecat.purchases.ui.revenuecatui.helpers.Logger.INSTANCE
            java.lang.String r7 = "Activity is null when accepting promotional offer"
            r6.e(r7)
            Y.C0 r6 = r5._actionError
            com.revenuecat.purchases.PurchasesError r7 = new com.revenuecat.purchases.PurchasesError
            com.revenuecat.purchases.PurchasesErrorCode r8 = com.revenuecat.purchases.PurchasesErrorCode.PurchaseInvalidError
            java.lang.String r0 = "Couldn't perform purchase"
            r7.<init>(r8, r0)
            r6.setValue(r7)
            Td.L r6 = Td.L.f17438a
            return r6
        L60:
            com.revenuecat.purchases.PurchaseParams$Builder r8 = new com.revenuecat.purchases.PurchaseParams$Builder
            r8.<init>(r7, r6)
            com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType r6 = r5.purchases     // Catch: com.revenuecat.purchases.PurchasesException -> L8b
            r0.L$0 = r5     // Catch: com.revenuecat.purchases.PurchasesException -> L8b
            r0.label = r4     // Catch: com.revenuecat.purchases.PurchasesException -> L8b
            java.lang.Object r8 = r6.awaitPurchase(r8, r0)     // Catch: com.revenuecat.purchases.PurchasesException -> L8b
            if (r8 != r1) goto L72
            goto L8a
        L72:
            r6 = r5
        L73:
            com.revenuecat.purchases.PurchaseResult r8 = (com.revenuecat.purchases.PurchaseResult) r8     // Catch: com.revenuecat.purchases.PurchasesException -> L31
            com.revenuecat.purchases.CustomerInfo r7 = r8.getCustomerInfo()     // Catch: com.revenuecat.purchases.PurchasesException -> L31
            com.revenuecat.purchases.models.StoreTransaction r8 = r8.getStoreTransaction()     // Catch: com.revenuecat.purchases.PurchasesException -> L31
            r6.notifyListenersForPromotionalOfferSucceeded(r7, r8)     // Catch: com.revenuecat.purchases.PurchasesException -> L31
            r0.L$0 = r6     // Catch: com.revenuecat.purchases.PurchasesException -> L31
            r0.label = r3     // Catch: com.revenuecat.purchases.PurchasesException -> L31
            java.lang.Object r6 = r6.loadCustomerCenter(r0)     // Catch: com.revenuecat.purchases.PurchasesException -> L31
            if (r6 != r1) goto La1
        L8a:
            return r1
        L8b:
            r7 = move-exception
            r6 = r5
        L8d:
            com.revenuecat.purchases.PurchasesErrorCode r8 = r7.getCode()
            com.revenuecat.purchases.PurchasesErrorCode r0 = com.revenuecat.purchases.PurchasesErrorCode.PurchaseCancelledError
            if (r8 == r0) goto La1
            Y.C0 r8 = r6._actionError
            com.revenuecat.purchases.PurchasesError r7 = r7.getError()
            r8.setValue(r7)
            r6.goBackToMain()
        La1:
            Td.L r6 = Td.L.f17438a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl.onAcceptedPromotionalOffer(com.revenuecat.purchases.models.SubscriptionOption, android.app.Activity, Zd.e):java.lang.Object");
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel
    public void onActivityResumed() {
        if (this.shouldRefreshOnResume) {
            this.shouldRefreshOnResume = false;
            Logger.INSTANCE.d("Refreshing Customer Center after returning from manage subscriptions");
            launchRefreshIfPossible();
        }
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel
    public void onActivityStarted() {
        if (this.wasBackgrounded) {
            this.wasBackgrounded = false;
            if (this.shouldRefreshOnResume) {
                return;
            }
            launchRefreshIfPossible();
        }
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel
    public void onActivityStopped(boolean isChangingConfigurations) {
        if (isChangingConfigurations) {
            return;
        }
        this.wasBackgrounded = true;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel
    public void onCustomActionSelected(CustomActionData customActionData) {
        AbstractC5504s.h(customActionData, "customActionData");
        notifyListenersForCustomActionSelected(customActionData);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel
    public void onNavigationButtonPressed(Context context, InterfaceC5082a onDismiss) {
        Object value;
        Object objCopy$default;
        CustomerCenterState.NavigationButtonType navigationButtonType;
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(onDismiss, "onDismiss");
        CustomerCenterState customerCenterState = (CustomerCenterState) this._state.getValue();
        if (customerCenterState instanceof CustomerCenterState.Success) {
            CustomerCenterState.Success success = (CustomerCenterState.Success) customerCenterState;
            if (success.getCurrentDestination() instanceof CustomerCenterDestination.PromotionalOffer) {
                CustomerCenterDestination currentDestination = success.getCurrentDestination();
                AbstractC5504s.f(currentDestination, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.customercenter.navigation.CustomerCenterDestination.PromotionalOffer");
                dismissPromotionalOffer(context, ((CustomerCenterDestination.PromotionalOffer) currentDestination).getData().getOriginalPath());
                return;
            }
        }
        CustomerCenterState.NavigationButtonType navigationButtonType2 = ((CustomerCenterState) getState().getValue()).getNavigationButtonType();
        u uVar = this._state;
        do {
            value = uVar.getValue();
            CustomerCenterState customerCenterState2 = (CustomerCenterState) value;
            if ((customerCenterState2 instanceof CustomerCenterState.Success) && navigationButtonType2 == (navigationButtonType = CustomerCenterState.NavigationButtonType.BACK)) {
                CustomerCenterState.Success success2 = (CustomerCenterState.Success) customerCenterState2;
                if (success2.getNavigationState().getCanNavigateBack()) {
                    CustomerCenterNavigationState customerCenterNavigationStatePop = success2.getNavigationState().pop();
                    if (!customerCenterNavigationStatePop.getCanNavigateBack()) {
                        navigationButtonType = CustomerCenterState.NavigationButtonType.CLOSE;
                    }
                    objCopy$default = CustomerCenterState.Success.copy$default(success2, null, null, null, null, null, null, customerCenterNavigationStatePop, navigationButtonType, null, false, false, 1855, null);
                } else {
                    objCopy$default = CustomerCenterState.NotLoaded.INSTANCE;
                }
            } else {
                objCopy$default = CustomerCenterState.NotLoaded.INSTANCE;
            }
        } while (!uVar.f(value, objCopy$default));
        if (navigationButtonType2 == CustomerCenterState.NavigationButtonType.CLOSE) {
            onDismiss.invoke();
        }
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel
    public void openURL(Context context, String url, CustomerCenterConfigData.HelpPath.OpenMethod method) {
        URLOpeningMethod uRLOpeningMethod;
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(url, "url");
        AbstractC5504s.h(method, "method");
        int i10 = WhenMappings.$EnumSwitchMapping$1[method.ordinal()];
        if (i10 == 1) {
            uRLOpeningMethod = URLOpeningMethod.IN_APP_BROWSER;
        } else {
            if (i10 != 2) {
                throw new r();
            }
            uRLOpeningMethod = URLOpeningMethod.EXTERNAL_BROWSER;
        }
        URLOpener.INSTANCE.openURL$revenuecatui_defaultsBc8Release(context, url, uRLOpeningMethod);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel
    public void pathButtonPressed(Context context, CustomerCenterConfigData.HelpPath path, PurchaseInformation purchaseInformation) {
        AbstractC5504s.h(context, "context");
        AbstractC5504s.h(path, "path");
        notifyListenersForManagementOptionSelected(path, purchaseInformation);
        CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey = path.getFeedbackSurvey();
        if (feedbackSurvey != null) {
            displayFeedbackSurvey(feedbackSurvey, new CustomerCenterViewModelImpl$pathButtonPressed$1$1(this, path, context, purchaseInformation));
        } else {
            AbstractC1617k.d(V.a(this), null, null, new C43672(context, purchaseInformation, path, null), 3, null);
        }
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel
    public void refreshColors(C2175l currentColorScheme, boolean isSystemInDarkTheme) {
        AbstractC5504s.h(currentColorScheme, "currentColorScheme");
        this.isDarkMode = isSystemInDarkTheme;
        this._colorScheme.setValue(currentColorScheme);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel
    public Object refreshCustomerCenter(e eVar) {
        Object objLoadCustomerCenter = loadCustomerCenter(true, eVar);
        return objLoadCustomerCenter == AbstractC2605b.f() ? objLoadCustomerCenter : L.f17438a;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel
    public void refreshStateIfLocaleChanged() {
        i currentLocaleList = getCurrentLocaleList();
        if (AbstractC5504s.c(this._lastLocaleList.getValue(), currentLocaleList)) {
            return;
        }
        this._lastLocaleList.setValue(currentLocaleList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x011f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0120, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x013c, code lost:
    
        r2 = com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState.Success.copy$default((com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState.Success) r2, null, null, null, null, com.revenuecat.purchases.ui.revenuecatui.customercenter.dialogs.RestorePurchasesState.PURCHASES_NOT_FOUND, null, null, null, null, false, false, 2031, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f6 A[Catch: PurchasesException -> 0x0038, TryCatch #1 {PurchasesException -> 0x0038, blocks: (B:14:0x0033, B:44:0x00cc, B:46:0x00da, B:50:0x00e6, B:51:0x00eb, B:53:0x00f6, B:55:0x00fb, B:58:0x0102, B:57:0x00ff, B:59:0x0118), top: B:76:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object restorePurchases(Zd.e r25) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModelImpl.restorePurchases(Zd.e):java.lang.Object");
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel
    public void selectPurchase(PurchaseInformation purchase) {
        Object value;
        Object error;
        AbstractC5504s.h(purchase, "purchase");
        u uVar = this._state;
        do {
            value = uVar.getValue();
            error = (CustomerCenterState) value;
            if (error instanceof CustomerCenterState.Success) {
                CustomerCenterState.Success success = (CustomerCenterState.Success) error;
                CustomerCenterConfigData.Screen managementScreen = success.getCustomerCenterConfigData().getManagementScreen();
                if (managementScreen != null) {
                    error = CustomerCenterState.Success.copy$default(success, null, null, null, PathUtils.INSTANCE.filterSubscriptionSpecificPaths(supportedPaths(purchase, managementScreen, success.getCustomerCenterConfigData().getLocalization())), null, null, success.getNavigationState().push(new CustomerCenterDestination.SelectedPurchaseDetail(purchase, managementScreen.getTitle())), CustomerCenterState.NavigationButtonType.BACK, null, false, false, 1847, null);
                } else {
                    Logger.INSTANCE.e("No management screen available in the customer center config data");
                    error = new CustomerCenterState.Error(new PurchasesError(PurchasesErrorCode.UnknownError, "No management screen available in the customer center config data"));
                }
            }
        } while (!uVar.f(value, error));
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel
    public void showCreateSupportTicket() {
        Object value;
        Object objCopy$default;
        CustomerCenterState customerCenterState = (CustomerCenterState) this._state.getValue();
        if (customerCenterState instanceof CustomerCenterState.Success) {
            u uVar = this._state;
            do {
                value = uVar.getValue();
                objCopy$default = (CustomerCenterState) value;
                if (objCopy$default instanceof CustomerCenterState.Success) {
                    CustomerCenterState.Success success = (CustomerCenterState.Success) objCopy$default;
                    objCopy$default = CustomerCenterState.Success.copy$default(success, null, null, null, null, null, null, success.getNavigationState().push(new CustomerCenterDestination.CreateSupportTicket(new CreateSupportTicketData(new CustomerCenterViewModelImpl$showCreateSupportTicket$1$createSupportTicketDestination$1(this), new CustomerCenterViewModelImpl$showCreateSupportTicket$1$createSupportTicketDestination$2(this), new CustomerCenterViewModelImpl$showCreateSupportTicket$1$createSupportTicketDestination$3(this)), ((CustomerCenterState.Success) customerCenterState).getCustomerCenterConfigData().getLocalization().commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.SUPPORT_TICKET_CREATE))), CustomerCenterState.NavigationButtonType.BACK, null, false, false, 1855, null);
                }
            } while (!uVar.f(value, objCopy$default));
        }
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel
    public void showPaywall(Context context) {
        AbstractC5504s.h(context, "context");
        CustomerCenterState customerCenterState = (CustomerCenterState) this._state.getValue();
        if (customerCenterState instanceof CustomerCenterState.Success) {
            Offering noActiveScreenOffering = ((CustomerCenterState.Success) customerCenterState).getNoActiveScreenOffering();
            if (noActiveScreenOffering != null) {
                launchPaywallActivity(context, noActiveScreenOffering);
            } else {
                tryFallbackToCurrentOffering(context);
            }
        }
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel
    public void showVirtualCurrencyBalances() {
        Object value;
        Object objCopy$default;
        CustomerCenterState customerCenterState = (CustomerCenterState) this._state.getValue();
        if (customerCenterState instanceof CustomerCenterState.Success) {
            CustomerCenterState.Success success = (CustomerCenterState.Success) customerCenterState;
            if (AbstractC5504s.c(success.getCustomerCenterConfigData().getSupport().getDisplayVirtualCurrencies(), Boolean.TRUE)) {
                u uVar = this._state;
                do {
                    value = uVar.getValue();
                    objCopy$default = (CustomerCenterState) value;
                    if (objCopy$default instanceof CustomerCenterState.Success) {
                        CustomerCenterState.Success success2 = (CustomerCenterState.Success) objCopy$default;
                        objCopy$default = CustomerCenterState.Success.copy$default(success2, null, null, null, null, null, null, success2.getNavigationState().push(new CustomerCenterDestination.VirtualCurrencyBalances(success.getCustomerCenterConfigData().getLocalization().commonLocalizedString(CustomerCenterConfigData.Localization.CommonLocalizedString.VIRTUAL_CURRENCY_BALANCES_SCREEN_HEADER))), CustomerCenterState.NavigationButtonType.BACK, null, false, false, 1855, null);
                    }
                } while (!uVar.f(value, objCopy$default));
            }
        }
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.viewmodel.CustomerCenterViewModel
    public void trackImpressionIfNeeded() {
        if (this.impressionCreationData == null) {
            this.impressionCreationData = new CustomerCenterImpressionEvent.CreationData(null, null, 3, null);
            Locale localeC = ((i) this._lastLocaleList.getValue()).c(0);
            if (localeC == null) {
                localeC = Locale.getDefault();
            }
            Date date = new Date();
            boolean z10 = this.isDarkMode;
            String string = localeC.toString();
            AbstractC5504s.g(string, "locale.toString()");
            this.purchases.track(new CustomerCenterImpressionEvent(null, new CustomerCenterImpressionEvent.Data(date, z10, string, 0, 0, null, 56, null), 1, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public final java.lang.Object loadCustomerCenter(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r29v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public CustomerCenterViewModelImpl(PurchasesType purchases, DateFormatter dateFormatter, Locale locale, C2175l colorScheme, boolean z10, CustomerCenterListener customerCenterListener) {
        AbstractC5504s.h(purchases, "purchases");
        AbstractC5504s.h(dateFormatter, "dateFormatter");
        AbstractC5504s.h(locale, "locale");
        AbstractC5504s.h(colorScheme, "colorScheme");
        this.purchases = purchases;
        this.dateFormatter = dateFormatter;
        this.locale = locale;
        this.colorScheme = colorScheme;
        this.isDarkMode = z10;
        this.listener = customerCenterListener;
        this._lastLocaleList = K.a(getCurrentLocaleList());
        this._colorScheme = K.a(colorScheme);
        u uVarA = K.a(CustomerCenterState.NotLoaded.INSTANCE);
        this._state = uVarA;
        this.state = AbstractC1744g.w(AbstractC1744g.v(uVarA, new CustomerCenterViewModelImpl$state$1(this, null)), V.a(this), E.a.b(E.f9525a, 5000L, 0L, 2, null), CustomerCenterState.Loading.INSTANCE);
        this._actionError = b2.e(null, null, 2, null);
    }
}
