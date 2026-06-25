.class public final Lcom/swmansion/gesturehandler/react/c;
.super Lcom/facebook/react/uimanager/events/d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/gesturehandler/react/c$a;
    }
.end annotation


# static fields
.field public static final d:Lcom/swmansion/gesturehandler/react/c$a;

.field private static final e:LK1/e;


# instance fields
.field private a:LRa/b;

.field private b:S

.field private c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/swmansion/gesturehandler/react/c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/swmansion/gesturehandler/react/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/swmansion/gesturehandler/react/c;->d:Lcom/swmansion/gesturehandler/react/c$a;

    .line 8
    .line 9
    new-instance v0, LK1/e;

    .line 10
    .line 11
    const/4 v1, 0x7

    .line 12
    invoke-direct {v0, v1}, LK1/e;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lcom/swmansion/gesturehandler/react/c;->e:LK1/e;

    .line 16
    .line 17
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/d;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/swmansion/gesturehandler/react/c;-><init>()V

    return-void
.end method

.method public static final synthetic b()LK1/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/swmansion/gesturehandler/react/c;->e:LK1/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic c(Lcom/swmansion/gesturehandler/react/c;LQa/d;LRa/b;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/swmansion/gesturehandler/react/c;->d(LQa/d;LRa/b;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final d(LQa/d;LRa/b;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, LQa/d;->W()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/facebook/react/uimanager/f0;->f(Landroid/view/View;)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-super {p0, v1, v0}, Lcom/facebook/react/uimanager/events/d;->init(II)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, Lcom/swmansion/gesturehandler/react/c;->a:LRa/b;

    .line 20
    .line 21
    iput-boolean p3, p0, Lcom/swmansion/gesturehandler/react/c;->c:Z

    .line 22
    .line 23
    invoke-virtual {p1}, LQa/d;->I()S

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iput-short p1, p0, Lcom/swmansion/gesturehandler/react/c;->b:S

    .line 28
    .line 29
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

.method public getCoalescingKey()S
    .locals 1

    .line 1
    iget-short v0, p0, Lcom/swmansion/gesturehandler/react/c;->b:S

    .line 2
    .line 3
    return v0
.end method

.method protected getEventData()Lcom/facebook/react/bridge/WritableMap;
    .locals 2

    .line 1
    sget-object v0, Lcom/swmansion/gesturehandler/react/c;->d:Lcom/swmansion/gesturehandler/react/c$a;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/swmansion/gesturehandler/react/c;->a:LRa/b;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/swmansion/gesturehandler/react/c$a;->a(LRa/b;)Lcom/facebook/react/bridge/WritableMap;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/gesturehandler/react/c;->c:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "topGestureHandlerEvent"

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const-string v0, "onGestureHandlerEvent"

    .line 9
    .line 10
    return-object v0
.end method

.method public onDispose()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/swmansion/gesturehandler/react/c;->a:LRa/b;

    .line 3
    .line 4
    sget-object v0, Lcom/swmansion/gesturehandler/react/c;->e:LK1/e;

    .line 5
    .line 6
    invoke-virtual {v0, p0}, LK1/e;->a(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method
