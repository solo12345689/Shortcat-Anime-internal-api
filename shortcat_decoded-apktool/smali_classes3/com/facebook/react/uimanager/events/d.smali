.class public abstract Lcom/facebook/react/uimanager/events/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/events/d$a;,
        Lcom/facebook/react/uimanager/events/d$b;
    }
.end annotation


# static fields
.field private static final Companion:Lcom/facebook/react/uimanager/events/d$a;

.field private static uniqueIdCounter:I


# instance fields
.field private eventAnimationDriverMatchSpecCached:Lcom/facebook/react/uimanager/events/d$b;

.field private isInitialized:Z

.field private surfaceId:I

.field private timestampMs:J

.field private final uniqueID:I

.field private viewTag:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/events/d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/events/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/uimanager/events/d;->Companion:Lcom/facebook/react/uimanager/events/d$a;

    .line 8
    .line 9
    return-void
.end method

.method protected constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Lcom/facebook/react/uimanager/events/d;->uniqueIdCounter:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lcom/facebook/react/uimanager/events/d;->uniqueIdCounter:I

    iput v0, p0, Lcom/facebook/react/uimanager/events/d;->uniqueID:I

    return-void
.end method

.method protected constructor <init>(II)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    sget v0, Lcom/facebook/react/uimanager/events/d;->uniqueIdCounter:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lcom/facebook/react/uimanager/events/d;->uniqueIdCounter:I

    iput v0, p0, Lcom/facebook/react/uimanager/events/d;->uniqueID:I

    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/uimanager/events/d;->init(II)V

    return-void
.end method


# virtual methods
.method public canCoalesce()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public coalesce(Lcom/facebook/react/uimanager/events/d;)Lcom/facebook/react/uimanager/events/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/uimanager/events/d;",
            ")",
            "Lcom/facebook/react/uimanager/events/d;"
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/uimanager/events/d;->timestampMs:J

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-wide v2, p1, Lcom/facebook/react/uimanager/events/d;->timestampMs:J

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    :goto_0
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-ltz v0, :cond_1

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    return-object p1
.end method

.method public dispatch(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V
    .locals 3
    .annotation runtime LTd/e;
    .end annotation

    .line 1
    const-string v0, "rctEventEmitter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lcom/facebook/react/uimanager/events/d;->viewTag:I

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->internal_getEventNameCompat()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getEventData()Lcom/facebook/react/bridge/WritableMap;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-interface {p1, v0, v1, v2}, Lcom/facebook/react/uimanager/events/RCTEventEmitter;->receiveEvent(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public dispatchModern(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V
    .locals 9

    .line 1
    const-string v0, "rctEventEmitter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v2, p0, Lcom/facebook/react/uimanager/events/d;->surfaceId:I

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    if-eq v2, v0, :cond_0

    .line 10
    .line 11
    iget v3, p0, Lcom/facebook/react/uimanager/events/d;->viewTag:I

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->internal_getEventNameCompat()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->canCoalesce()Z

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getCoalescingKey()S

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getEventData()Lcom/facebook/react/bridge/WritableMap;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getEventCategory()I

    .line 30
    .line 31
    .line 32
    move-result v8

    .line 33
    move-object v1, p1

    .line 34
    invoke-interface/range {v1 .. v8}, Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;->receiveEvent(IILjava/lang/String;ZILcom/facebook/react/bridge/WritableMap;I)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    move-object v1, p1

    .line 39
    invoke-virtual {p0, v1}, Lcom/facebook/react/uimanager/events/d;->dispatch(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final dispose()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/facebook/react/uimanager/events/d;->isInitialized:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->onDispose()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method protected experimental_isSynchronous()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public getCoalescingKey()S
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public getEventAnimationDriverMatchSpec()Lcom/facebook/react/uimanager/events/d$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/d;->eventAnimationDriverMatchSpecCached:Lcom/facebook/react/uimanager/events/d$b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/facebook/react/uimanager/events/d$c;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lcom/facebook/react/uimanager/events/d$c;-><init>(Lcom/facebook/react/uimanager/events/d;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/facebook/react/uimanager/events/d;->eventAnimationDriverMatchSpecCached:Lcom/facebook/react/uimanager/events/d$b;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/d;->eventAnimationDriverMatchSpecCached:Lcom/facebook/react/uimanager/events/d$b;

    .line 13
    .line 14
    return-object v0
.end method

.method protected getEventCategory()I
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    return v0
.end method

.method protected getEventData()Lcom/facebook/react/bridge/WritableMap;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public abstract getEventName()Ljava/lang/String;
.end method

.method public final getSurfaceId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/events/d;->surfaceId:I

    .line 2
    .line 3
    return v0
.end method

.method public final getTimestampMs()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/facebook/react/uimanager/events/d;->timestampMs:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getUniqueID()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/events/d;->uniqueID:I

    .line 2
    .line 3
    return v0
.end method

.method public final getViewTag()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/events/d;->viewTag:I

    .line 2
    .line 3
    return v0
.end method

.method protected final init(I)V
    .locals 1
    .annotation runtime LTd/e;
    .end annotation

    const/4 v0, -0x1

    .line 1
    invoke-virtual {p0, v0, p1}, Lcom/facebook/react/uimanager/events/d;->init(II)V

    return-void
.end method

.method protected final init(II)V
    .locals 2

    .line 6
    invoke-static {}, LU6/i;->c()J

    move-result-wide v0

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/facebook/react/uimanager/events/d;->init(IIJ)V

    return-void
.end method

.method protected final init(IIJ)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/facebook/react/uimanager/events/d;->surfaceId:I

    .line 3
    iput p2, p0, Lcom/facebook/react/uimanager/events/d;->viewTag:I

    .line 4
    iput-wide p3, p0, Lcom/facebook/react/uimanager/events/d;->timestampMs:J

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/facebook/react/uimanager/events/d;->isInitialized:Z

    return-void
.end method

.method public final internal_experimental_isSynchronous$ReactAndroid_release()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->experimental_isSynchronous()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final internal_getEventCategory$ReactAndroid_release()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getEventCategory()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final internal_getEventData$ReactAndroid_release()Lcom/facebook/react/bridge/WritableMap;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getEventData()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final internal_getEventNameCompat()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/d;->getEventName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/uimanager/events/d;->isInitialized:Z

    .line 2
    .line 3
    return v0
.end method

.method public onDispose()V
    .locals 0

    .line 1
    return-void
.end method
