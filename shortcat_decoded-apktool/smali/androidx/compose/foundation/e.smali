.class public Landroidx/compose/foundation/e;
.super Landroidx/compose/foundation/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method private constructor <init>(LB/m;Lx/I;ZLjava/lang/String;LR0/h;Lie/a;)V
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 2
    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/a;-><init>(LB/m;Lx/I;ZLjava/lang/String;LR0/h;Lie/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(LB/m;Lx/I;ZLjava/lang/String;LR0/h;Lie/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Landroidx/compose/foundation/e;-><init>(LB/m;Lx/I;ZLjava/lang/String;LR0/h;Lie/a;)V

    return-void
.end method

.method static synthetic d2(Landroidx/compose/foundation/e;LE0/L;LZd/e;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/foundation/e$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Landroidx/compose/foundation/e$a;-><init>(Landroidx/compose/foundation/e;LZd/e;)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Landroidx/compose/foundation/e$b;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Landroidx/compose/foundation/e$b;-><init>(Landroidx/compose/foundation/e;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v0, v1, p2}, Lz/A;->h(LE0/L;Lie/o;Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-ne p0, p1, :cond_0

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    sget-object p0, LTd/L;->a:LTd/L;

    .line 24
    .line 25
    return-object p0
.end method


# virtual methods
.method public R1(LE0/L;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/e;->d2(Landroidx/compose/foundation/e;LE0/L;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final e2(LB/m;Lx/I;ZLjava/lang/String;LR0/h;Lie/a;)V
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p6}, Landroidx/compose/foundation/a;->c2(LB/m;Lx/I;ZLjava/lang/String;LR0/h;Lie/a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
