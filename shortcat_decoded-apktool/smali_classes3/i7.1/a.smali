.class public final Li7/a;
.super Lcom/facebook/react/uimanager/events/d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li7/a$a;
    }
.end annotation


# static fields
.field private static final c:Li7/a$a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/facebook/react/bridge/WritableMap;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Li7/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Li7/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Li7/a;->c:Li7/a$a;

    .line 8
    .line 9
    const-string v0, "InteropEvent"

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    invoke-static {v0, v1, v2, v1}, LW6/b;->b(Ljava/lang/String;LW6/a;ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;II)V
    .locals 1

    .line 1
    const-string v0, "interopEventName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p3, p4}, Lcom/facebook/react/uimanager/events/d;-><init>(II)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Li7/a;->a:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p2, p0, Li7/a;->b:Lcom/facebook/react/bridge/WritableMap;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method protected getEventData()Lcom/facebook/react/bridge/WritableMap;
    .locals 1

    .line 1
    iget-object v0, p0, Li7/a;->b:Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Li7/a;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
