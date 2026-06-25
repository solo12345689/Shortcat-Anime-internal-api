.class public final LBe/V$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LBe/V;
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
    invoke-direct {p0}, LBe/V$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lye/a;Lye/t0;ILze/h;LXe/f;Lqf/S;ZZZLqf/S;Lye/h0;Lie/a;)LBe/V;
    .locals 14

    .line 1
    const-string v0, "containingDeclaration"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "annotations"

    .line 7
    .line 8
    move-object/from16 v5, p4

    .line 9
    .line 10
    invoke-static {v5, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "name"

    .line 14
    .line 15
    move-object/from16 v6, p5

    .line 16
    .line 17
    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v0, "outType"

    .line 21
    .line 22
    move-object/from16 v7, p6

    .line 23
    .line 24
    invoke-static {v7, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string v0, "source"

    .line 28
    .line 29
    move-object/from16 v12, p11

    .line 30
    .line 31
    invoke-static {v12, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    if-nez p12, :cond_0

    .line 35
    .line 36
    new-instance v1, LBe/V;

    .line 37
    .line 38
    move-object v2, p1

    .line 39
    move-object/from16 v3, p2

    .line 40
    .line 41
    move/from16 v4, p3

    .line 42
    .line 43
    move/from16 v8, p7

    .line 44
    .line 45
    move/from16 v9, p8

    .line 46
    .line 47
    move/from16 v10, p9

    .line 48
    .line 49
    move-object/from16 v11, p10

    .line 50
    .line 51
    invoke-direct/range {v1 .. v12}, LBe/V;-><init>(Lye/a;Lye/t0;ILze/h;LXe/f;Lqf/S;ZZZLqf/S;Lye/h0;)V

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :cond_0
    new-instance v1, LBe/V$b;

    .line 56
    .line 57
    move-object v2, p1

    .line 58
    move-object/from16 v3, p2

    .line 59
    .line 60
    move/from16 v4, p3

    .line 61
    .line 62
    move-object/from16 v5, p4

    .line 63
    .line 64
    move-object/from16 v6, p5

    .line 65
    .line 66
    move-object/from16 v7, p6

    .line 67
    .line 68
    move/from16 v8, p7

    .line 69
    .line 70
    move/from16 v9, p8

    .line 71
    .line 72
    move/from16 v10, p9

    .line 73
    .line 74
    move-object/from16 v11, p10

    .line 75
    .line 76
    move-object/from16 v12, p11

    .line 77
    .line 78
    move-object/from16 v13, p12

    .line 79
    .line 80
    invoke-direct/range {v1 .. v13}, LBe/V$b;-><init>(Lye/a;Lye/t0;ILze/h;LXe/f;Lqf/S;ZZZLqf/S;Lye/h0;Lie/a;)V

    .line 81
    .line 82
    .line 83
    return-object v1
.end method
