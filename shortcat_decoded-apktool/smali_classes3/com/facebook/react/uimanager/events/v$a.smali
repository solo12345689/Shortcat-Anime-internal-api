.class public final Lcom/facebook/react/uimanager/events/v$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/events/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/v$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(IILcom/facebook/react/uimanager/events/x;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/w;)Lcom/facebook/react/uimanager/events/v;
    .locals 11

    .line 1
    const-string v0, "touchEventCoalescingKeyHelper"

    .line 2
    .line 3
    move-object/from16 v10, p9

    .line 4
    .line 5
    invoke-static {v10, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/facebook/react/uimanager/events/v;->b()LK1/e;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, LK1/e;->b()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lcom/facebook/react/uimanager/events/v;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    new-instance v0, Lcom/facebook/react/uimanager/events/v;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/events/v;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    move-object v1, v0

    .line 27
    invoke-static {p4}, LQ6/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p4

    .line 31
    const-string v0, "assertNotNull(...)"

    .line 32
    .line 33
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    move-object v5, p4

    .line 37
    check-cast v5, Landroid/view/MotionEvent;

    .line 38
    .line 39
    move v2, p1

    .line 40
    move v3, p2

    .line 41
    move-object v4, p3

    .line 42
    move-wide/from16 v6, p5

    .line 43
    .line 44
    move/from16 v8, p7

    .line 45
    .line 46
    move/from16 v9, p8

    .line 47
    .line 48
    invoke-static/range {v1 .. v10}, Lcom/facebook/react/uimanager/events/v;->c(Lcom/facebook/react/uimanager/events/v;IILcom/facebook/react/uimanager/events/x;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/w;)V

    .line 49
    .line 50
    .line 51
    return-object v1
.end method
