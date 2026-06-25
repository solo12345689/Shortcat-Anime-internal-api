.class final Landroidx/compose/foundation/selection/d;
.super Landroidx/compose/foundation/e;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private w:Z

.field private x:Lkotlin/jvm/functions/Function1;

.field private final y:Lie/a;


# direct methods
.method private constructor <init>(ZLB/m;Lx/I;ZLR0/h;Lkotlin/jvm/functions/Function1;)V
    .locals 8

    .line 2
    new-instance v6, Landroidx/compose/foundation/selection/d$a;

    invoke-direct {v6, p6, p1}, Landroidx/compose/foundation/selection/d$a;-><init>(Lkotlin/jvm/functions/Function1;Z)V

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move v3, p4

    move-object v5, p5

    .line 3
    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/e;-><init>(LB/m;Lx/I;ZLjava/lang/String;LR0/h;Lie/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 4
    iput-boolean p1, v0, Landroidx/compose/foundation/selection/d;->w:Z

    .line 5
    iput-object p6, v0, Landroidx/compose/foundation/selection/d;->x:Lkotlin/jvm/functions/Function1;

    .line 6
    new-instance p1, Landroidx/compose/foundation/selection/d$b;

    invoke-direct {p1, p0}, Landroidx/compose/foundation/selection/d$b;-><init>(Landroidx/compose/foundation/selection/d;)V

    iput-object p1, v0, Landroidx/compose/foundation/selection/d;->y:Lie/a;

    return-void
.end method

.method public synthetic constructor <init>(ZLB/m;Lx/I;ZLR0/h;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Landroidx/compose/foundation/selection/d;-><init>(ZLB/m;Lx/I;ZLR0/h;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic f2(Landroidx/compose/foundation/selection/d;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/selection/d;->x:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g2(Landroidx/compose/foundation/selection/d;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Landroidx/compose/foundation/selection/d;->w:Z

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public Q1(LR0/C;)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/selection/d;->w:Z

    .line 2
    .line 3
    invoke-static {v0}, LT0/b;->a(Z)LT0/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1, v0}, LR0/A;->p0(LR0/C;LT0/a;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final h2(ZLB/m;Lx/I;ZLR0/h;Lkotlin/jvm/functions/Function1;)V
    .locals 8

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/selection/d;->w:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Landroidx/compose/foundation/selection/d;->w:Z

    .line 6
    .line 7
    invoke-static {p0}, LK0/B0;->b(LK0/A0;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iput-object p6, p0, Landroidx/compose/foundation/selection/d;->x:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    iget-object v7, p0, Landroidx/compose/foundation/selection/d;->y:Lie/a;

    .line 14
    .line 15
    move-object v1, p0

    .line 16
    move-object v2, p2

    .line 17
    move-object v3, p3

    .line 18
    move v4, p4

    .line 19
    move-object v6, p5

    .line 20
    invoke-super/range {v1 .. v7}, Landroidx/compose/foundation/e;->e2(LB/m;Lx/I;ZLjava/lang/String;LR0/h;Lie/a;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
