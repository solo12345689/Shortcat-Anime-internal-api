.class public final LTa/d;
.super Lcom/facebook/react/uimanager/events/d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LTa/d$a;
    }
.end annotation


# static fields
.field public static final b:LTa/d$a;


# instance fields
.field private final a:D


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LTa/d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LTa/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LTa/d;->b:LTa/d$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(IID)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/events/d;-><init>(II)V

    .line 2
    .line 3
    .line 4
    iput-wide p3, p0, LTa/d;->a:D

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getCoalescingKey()S
    .locals 2

    .line 1
    iget-wide v0, p0, LTa/d;->a:D

    .line 2
    .line 3
    double-to-int v0, v0

    .line 4
    int-to-short v0, v0

    .line 5
    return v0
.end method

.method protected getEventData()Lcom/facebook/react/bridge/WritableMap;
    .locals 4

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "headerHeight"

    .line 6
    .line 7
    iget-wide v2, p0, LTa/d;->a:D

    .line 8
    .line 9
    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "topHeaderHeightChange"

    .line 2
    .line 3
    return-object v0
.end method
