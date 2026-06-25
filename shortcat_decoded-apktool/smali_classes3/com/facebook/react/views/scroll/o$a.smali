.class public final Lcom/facebook/react/views/scroll/o$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/views/scroll/o;
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
    invoke-direct {p0}, Lcom/facebook/react/views/scroll/o$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(IILcom/facebook/react/views/scroll/p;FFFFIIII)Lcom/facebook/react/views/scroll/o;
    .locals 14

    .line 1
    invoke-static {}, Lcom/facebook/react/views/scroll/o;->b()LK1/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LK1/e;->b()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/facebook/react/views/scroll/o;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lcom/facebook/react/views/scroll/o;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-direct {v0, v1}, Lcom/facebook/react/views/scroll/o;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    move v3, p1

    .line 20
    move/from16 v4, p2

    .line 21
    .line 22
    move-object/from16 v5, p3

    .line 23
    .line 24
    move/from16 v6, p4

    .line 25
    .line 26
    move/from16 v7, p5

    .line 27
    .line 28
    move/from16 v8, p6

    .line 29
    .line 30
    move/from16 v9, p7

    .line 31
    .line 32
    move/from16 v10, p8

    .line 33
    .line 34
    move/from16 v11, p9

    .line 35
    .line 36
    move/from16 v12, p10

    .line 37
    .line 38
    move/from16 v13, p11

    .line 39
    .line 40
    move-object v2, v0

    .line 41
    invoke-static/range {v2 .. v13}, Lcom/facebook/react/views/scroll/o;->c(Lcom/facebook/react/views/scroll/o;IILcom/facebook/react/views/scroll/p;FFFFIIII)V

    .line 42
    .line 43
    .line 44
    move-object v0, v2

    .line 45
    return-object v0
.end method
