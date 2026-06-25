.class public final LYa/c;
.super LYa/d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYa/c$a;
    }
.end annotation


# static fields
.field public static final d:LYa/c$a;


# instance fields
.field private final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LYa/c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LYa/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LYa/c;->d:LYa/c$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(IIZ)V
    .locals 2

    .line 1
    const-string v0, "topDismiss"

    .line 2
    .line 3
    const-string v1, "onDismiss"

    .line 4
    .line 5
    invoke-direct {p0, p1, p2, v0, v1}, LYa/d;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iput-boolean p3, p0, LYa/c;->c:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method protected getEventData()Lcom/facebook/react/bridge/WritableMap;
    .locals 3

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "isNativeDismiss"

    .line 6
    .line 7
    iget-boolean v2, p0, LYa/c;->c:Z

    .line 8
    .line 9
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
