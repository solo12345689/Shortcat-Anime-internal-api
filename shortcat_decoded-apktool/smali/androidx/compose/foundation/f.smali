.class final Landroidx/compose/foundation/f;
.super Landroidx/compose/foundation/a;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/v0;


# instance fields
.field private w:Ljava/lang/String;

.field private x:Lie/a;

.field private y:Lie/a;


# direct methods
.method private constructor <init>(Lie/a;Ljava/lang/String;Lie/a;Lie/a;LB/m;Lx/I;ZLjava/lang/String;LR0/h;)V
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move-object v6, p1

    move-object v1, p5

    move-object v2, p6

    move v3, p7

    move-object/from16 v4, p8

    move-object/from16 v5, p9

    .line 2
    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/a;-><init>(LB/m;Lx/I;ZLjava/lang/String;LR0/h;Lie/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/f;->w:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Landroidx/compose/foundation/f;->x:Lie/a;

    .line 5
    iput-object p4, p0, Landroidx/compose/foundation/f;->y:Lie/a;

    return-void
.end method

.method public synthetic constructor <init>(Lie/a;Ljava/lang/String;Lie/a;Lie/a;LB/m;Lx/I;ZLjava/lang/String;LR0/h;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p9}, Landroidx/compose/foundation/f;-><init>(Lie/a;Ljava/lang/String;Lie/a;Lie/a;LB/m;Lx/I;ZLjava/lang/String;LR0/h;)V

    return-void
.end method

.method public static final synthetic d2(Landroidx/compose/foundation/f;)Lie/a;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/f;->y:Lie/a;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e2(Landroidx/compose/foundation/f;)Lie/a;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/f;->x:Lie/a;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public Q1(LR0/C;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/f;->x:Lie/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/compose/foundation/f;->w:Ljava/lang/String;

    .line 6
    .line 7
    new-instance v1, Landroidx/compose/foundation/f$a;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Landroidx/compose/foundation/f$a;-><init>(Landroidx/compose/foundation/f;)V

    .line 10
    .line 11
    .line 12
    invoke-static {p1, v0, v1}, LR0/A;->w(LR0/C;Ljava/lang/String;Lie/a;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public R1(LE0/L;LZd/e;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/compose/foundation/a;->W1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/compose/foundation/f;->y:Lie/a;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v0, Landroidx/compose/foundation/f$b;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Landroidx/compose/foundation/f$b;-><init>(Landroidx/compose/foundation/f;)V

    .line 15
    .line 16
    .line 17
    move-object v3, v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v3, v1

    .line 20
    :goto_0
    invoke-virtual {p0}, Landroidx/compose/foundation/a;->W1()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, Landroidx/compose/foundation/f;->x:Lie/a;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    new-instance v0, Landroidx/compose/foundation/f$c;

    .line 31
    .line 32
    invoke-direct {v0, p0}, Landroidx/compose/foundation/f$c;-><init>(Landroidx/compose/foundation/f;)V

    .line 33
    .line 34
    .line 35
    move-object v4, v0

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move-object v4, v1

    .line 38
    :goto_1
    new-instance v5, Landroidx/compose/foundation/f$d;

    .line 39
    .line 40
    invoke-direct {v5, p0, v1}, Landroidx/compose/foundation/f$d;-><init>(Landroidx/compose/foundation/f;LZd/e;)V

    .line 41
    .line 42
    .line 43
    new-instance v6, Landroidx/compose/foundation/f$e;

    .line 44
    .line 45
    invoke-direct {v6, p0}, Landroidx/compose/foundation/f$e;-><init>(Landroidx/compose/foundation/f;)V

    .line 46
    .line 47
    .line 48
    move-object v2, p1

    .line 49
    move-object v7, p2

    .line 50
    invoke-static/range {v2 .. v7}, Lz/A;->i(LE0/L;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lie/o;Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    if-ne p1, p2, :cond_2

    .line 59
    .line 60
    return-object p1

    .line 61
    :cond_2
    sget-object p1, LTd/L;->a:LTd/L;

    .line 62
    .line 63
    return-object p1
.end method

.method public f2(Lie/a;Ljava/lang/String;Lie/a;Lie/a;LB/m;Lx/I;ZLjava/lang/String;LR0/h;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/f;->w:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0, p2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object p2, p0, Landroidx/compose/foundation/f;->w:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {p0}, LK0/B0;->b(LK0/A0;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object p2, p0, Landroidx/compose/foundation/f;->x:Lie/a;

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    const/4 v1, 0x0

    .line 18
    if-nez p2, :cond_1

    .line 19
    .line 20
    move p2, v0

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    move p2, v1

    .line 23
    :goto_0
    if-nez p3, :cond_2

    .line 24
    .line 25
    move v2, v0

    .line 26
    goto :goto_1

    .line 27
    :cond_2
    move v2, v1

    .line 28
    :goto_1
    if-eq p2, v2, :cond_3

    .line 29
    .line 30
    invoke-virtual {p0}, Landroidx/compose/foundation/a;->T1()V

    .line 31
    .line 32
    .line 33
    invoke-static {p0}, LK0/B0;->b(LK0/A0;)V

    .line 34
    .line 35
    .line 36
    move p2, v0

    .line 37
    goto :goto_2

    .line 38
    :cond_3
    move p2, v1

    .line 39
    :goto_2
    iput-object p3, p0, Landroidx/compose/foundation/f;->x:Lie/a;

    .line 40
    .line 41
    iget-object p3, p0, Landroidx/compose/foundation/f;->y:Lie/a;

    .line 42
    .line 43
    if-nez p3, :cond_4

    .line 44
    .line 45
    move p3, v0

    .line 46
    goto :goto_3

    .line 47
    :cond_4
    move p3, v1

    .line 48
    :goto_3
    if-nez p4, :cond_5

    .line 49
    .line 50
    move v1, v0

    .line 51
    :cond_5
    if-eq p3, v1, :cond_6

    .line 52
    .line 53
    move p2, v0

    .line 54
    :cond_6
    iput-object p4, p0, Landroidx/compose/foundation/f;->y:Lie/a;

    .line 55
    .line 56
    invoke-virtual {p0}, Landroidx/compose/foundation/a;->W1()Z

    .line 57
    .line 58
    .line 59
    move-result p3

    .line 60
    if-eq p3, p7, :cond_7

    .line 61
    .line 62
    :goto_4
    move-object p2, p5

    .line 63
    move-object p3, p6

    .line 64
    move p4, p7

    .line 65
    move-object p5, p8

    .line 66
    move-object p6, p9

    .line 67
    move-object p7, p1

    .line 68
    move-object p1, p0

    .line 69
    goto :goto_5

    .line 70
    :cond_7
    move v0, p2

    .line 71
    goto :goto_4

    .line 72
    :goto_5
    invoke-virtual/range {p1 .. p7}, Landroidx/compose/foundation/a;->c2(LB/m;Lx/I;ZLjava/lang/String;LR0/h;Lie/a;)V

    .line 73
    .line 74
    .line 75
    if-eqz v0, :cond_8

    .line 76
    .line 77
    invoke-virtual {p0}, Landroidx/compose/foundation/a;->a2()LTd/L;

    .line 78
    .line 79
    .line 80
    :cond_8
    return-void
.end method
