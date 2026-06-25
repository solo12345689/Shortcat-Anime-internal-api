.class final Landroidx/compose/foundation/selection/b;
.super Landroidx/compose/foundation/e;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private w:Z


# direct methods
.method private constructor <init>(ZLB/m;Lx/I;ZLR0/h;Lie/a;)V
    .locals 8

    const/4 v4, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move v3, p4

    move-object v5, p5

    move-object v6, p6

    .line 2
    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/e;-><init>(LB/m;Lx/I;ZLjava/lang/String;LR0/h;Lie/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-boolean p1, v0, Landroidx/compose/foundation/selection/b;->w:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLB/m;Lx/I;ZLR0/h;Lie/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Landroidx/compose/foundation/selection/b;-><init>(ZLB/m;Lx/I;ZLR0/h;Lie/a;)V

    return-void
.end method


# virtual methods
.method public Q1(LR0/C;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/selection/b;->w:Z

    .line 2
    .line 3
    invoke-static {p1, v0}, LR0/A;->d0(LR0/C;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f2(ZLB/m;Lx/I;ZLR0/h;Lie/a;)V
    .locals 8

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/selection/b;->w:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Landroidx/compose/foundation/selection/b;->w:Z

    .line 6
    .line 7
    invoke-static {p0}, LK0/B0;->b(LK0/A0;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v5, 0x0

    .line 11
    move-object v1, p0

    .line 12
    move-object v2, p2

    .line 13
    move-object v3, p3

    .line 14
    move v4, p4

    .line 15
    move-object v6, p5

    .line 16
    move-object v7, p6

    .line 17
    invoke-super/range {v1 .. v7}, Landroidx/compose/foundation/e;->e2(LB/m;Lx/I;ZLjava/lang/String;LR0/h;Lie/a;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
