.class public final Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$b;
.super Ldg/J;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;->connectWebSocket(Ljava/lang/String;Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;)Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$IWebSocket;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;

.field final synthetic b:Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$b;->a:Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$b;->b:Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;

    .line 4
    .line 5
    invoke-direct {p0}, Ldg/J;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static synthetic g(Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$b;->k(Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic h(Ljava/lang/Throwable;Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$b;->l(Ljava/lang/Throwable;Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic i(Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$b;->m(Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic j(Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$b;->n(Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final k(Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;->didClose()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;->close()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private static final l(Ljava/lang/Throwable;Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const-string p0, "<Unknown error>"

    .line 8
    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p1, v0, p0}, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;->didFailWithError(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;->close()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private static final m(Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;->didReceiveMessage(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final n(Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;->didOpen()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Ldg/I;ILjava/lang/String;)V
    .locals 2

    .line 1
    const-string p2, "webSocket"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "reason"

    .line 7
    .line 8
    invoke-static {p3, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$b;->a:Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;

    .line 12
    .line 13
    iget-object p2, p0, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$b;->b:Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;

    .line 14
    .line 15
    new-instance p3, Lcom/facebook/react/devsupport/i;

    .line 16
    .line 17
    invoke-direct {p3, p2}, Lcom/facebook/react/devsupport/i;-><init>(Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;)V

    .line 18
    .line 19
    .line 20
    const-wide/16 v0, 0x0

    .line 21
    .line 22
    invoke-virtual {p1, p3, v0, v1}, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;->scheduleCallback(Ljava/lang/Runnable;J)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public c(Ldg/I;Ljava/lang/Throwable;Ldg/E;)V
    .locals 1

    .line 1
    const-string p3, "webSocket"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "t"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$b;->a:Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;

    .line 12
    .line 13
    iget-object p3, p0, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$b;->b:Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;

    .line 14
    .line 15
    new-instance v0, Lcom/facebook/react/devsupport/h;

    .line 16
    .line 17
    invoke-direct {v0, p2, p3}, Lcom/facebook/react/devsupport/h;-><init>(Ljava/lang/Throwable;Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;)V

    .line 18
    .line 19
    .line 20
    const-wide/16 p2, 0x0

    .line 21
    .line 22
    invoke-virtual {p1, v0, p2, p3}, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;->scheduleCallback(Ljava/lang/Runnable;J)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public d(Ldg/I;Ljava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "webSocket"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "text"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$b;->a:Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;

    .line 12
    .line 13
    iget-object v0, p0, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$b;->b:Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;

    .line 14
    .line 15
    new-instance v1, Lcom/facebook/react/devsupport/k;

    .line 16
    .line 17
    invoke-direct {v1, v0, p2}, Lcom/facebook/react/devsupport/k;-><init>(Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-wide/16 v2, 0x0

    .line 21
    .line 22
    invoke-virtual {p1, v1, v2, v3}, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;->scheduleCallback(Ljava/lang/Runnable;J)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public f(Ldg/I;Ldg/E;)V
    .locals 3

    .line 1
    const-string v0, "webSocket"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "response"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$b;->a:Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;

    .line 12
    .line 13
    iget-object p2, p0, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl$b;->b:Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;

    .line 14
    .line 15
    new-instance v0, Lcom/facebook/react/devsupport/j;

    .line 16
    .line 17
    invoke-direct {v0, p2}, Lcom/facebook/react/devsupport/j;-><init>(Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$WebSocketDelegate;)V

    .line 18
    .line 19
    .line 20
    const-wide/16 v1, 0x0

    .line 21
    .line 22
    invoke-virtual {p1, v0, v1, v2}, Lcom/facebook/react/devsupport/CxxInspectorPackagerConnection$DelegateImpl;->scheduleCallback(Ljava/lang/Runnable;J)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
