.class public final LTa/j;
.super Lcom/facebook/react/uimanager/events/d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LTa/j$a;
    }
.end annotation


# static fields
.field public static final e:LTa/j$a;


# instance fields
.field private final a:F

.field private final b:Z

.field private final c:Z

.field private final d:S


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LTa/j$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LTa/j$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LTa/j;->e:LTa/j$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(IIFZZS)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/events/d;-><init>(II)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, LTa/j;->a:F

    .line 5
    .line 6
    iput-boolean p4, p0, LTa/j;->b:Z

    .line 7
    .line 8
    iput-boolean p5, p0, LTa/j;->c:Z

    .line 9
    .line 10
    iput-short p6, p0, LTa/j;->d:S

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public getCoalescingKey()S
    .locals 1

    .line 1
    iget-short v0, p0, LTa/j;->d:S

    .line 2
    .line 3
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
    iget v1, p0, LTa/j;->a:F

    .line 6
    .line 7
    float-to-double v1, v1

    .line 8
    const-string v3, "progress"

    .line 9
    .line 10
    invoke-interface {v0, v3, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 11
    .line 12
    .line 13
    const-string v1, "closing"

    .line 14
    .line 15
    iget-boolean v2, p0, LTa/j;->b:Z

    .line 16
    .line 17
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 18
    .line 19
    .line 20
    const-string v1, "goingForward"

    .line 21
    .line 22
    iget-boolean v2, p0, LTa/j;->c:Z

    .line 23
    .line 24
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "topTransitionProgress"

    .line 2
    .line 3
    return-object v0
.end method
