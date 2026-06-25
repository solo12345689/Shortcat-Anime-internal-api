.class public abstract Lz/l;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Lie/o;

.field private static final b:Lie/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lz/l$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lz/l$a;-><init>(LZd/e;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lz/l;->a:Lie/o;

    .line 8
    .line 9
    new-instance v0, Lz/l$b;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lz/l$b;-><init>(LZd/e;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lz/l;->b:Lie/o;

    .line 15
    .line 16
    return-void
.end method

.method public static final a(Lkotlin/jvm/functions/Function1;)Lz/m;
    .locals 1

    .line 1
    new-instance v0, Lz/g;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lz/g;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final synthetic b()Lie/o;
    .locals 1

    .line 1
    sget-object v0, Lz/l;->a:Lie/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic c()Lie/o;
    .locals 1

    .line 1
    sget-object v0, Lz/l;->b:Lie/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic d(JLz/q;)F
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lz/l;->j(JLz/q;)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic e(JLz/q;)F
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lz/l;->k(JLz/q;)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic f(J)J
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lz/l;->l(J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p0

    .line 5
    return-wide p0
.end method

.method public static final g(Landroidx/compose/ui/e;Lz/m;Lz/q;ZLB/m;ZLie/o;Lie/o;Z)Landroidx/compose/ui/e;
    .locals 9

    .line 1
    new-instance v0, Landroidx/compose/foundation/gestures/DraggableElement;

    .line 2
    .line 3
    move-object v1, p1

    .line 4
    move-object v2, p2

    .line 5
    move v3, p3

    .line 6
    move-object v4, p4

    .line 7
    move v5, p5

    .line 8
    move-object v6, p6

    .line 9
    move-object/from16 v7, p7

    .line 10
    .line 11
    move/from16 v8, p8

    .line 12
    .line 13
    invoke-direct/range {v0 .. v8}, Landroidx/compose/foundation/gestures/DraggableElement;-><init>(Lz/m;Lz/q;ZLB/m;ZLie/o;Lie/o;Z)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, v0}, Landroidx/compose/ui/e;->then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static synthetic h(Landroidx/compose/ui/e;Lz/m;Lz/q;ZLB/m;ZLie/o;Lie/o;ZILjava/lang/Object;)Landroidx/compose/ui/e;
    .locals 9

    .line 1
    move/from16 v0, p9

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x4

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const/4 p3, 0x1

    .line 8
    :cond_0
    move v3, p3

    .line 9
    and-int/lit8 p3, v0, 0x8

    .line 10
    .line 11
    if-eqz p3, :cond_1

    .line 12
    .line 13
    const/4 p4, 0x0

    .line 14
    :cond_1
    move-object v4, p4

    .line 15
    and-int/lit8 p3, v0, 0x10

    .line 16
    .line 17
    const/4 p4, 0x0

    .line 18
    if-eqz p3, :cond_2

    .line 19
    .line 20
    move v5, p4

    .line 21
    goto :goto_0

    .line 22
    :cond_2
    move v5, p5

    .line 23
    :goto_0
    and-int/lit8 p3, v0, 0x20

    .line 24
    .line 25
    if-eqz p3, :cond_3

    .line 26
    .line 27
    sget-object p3, Lz/l;->a:Lie/o;

    .line 28
    .line 29
    move-object v6, p3

    .line 30
    goto :goto_1

    .line 31
    :cond_3
    move-object v6, p6

    .line 32
    :goto_1
    and-int/lit8 p3, v0, 0x40

    .line 33
    .line 34
    if-eqz p3, :cond_4

    .line 35
    .line 36
    sget-object p3, Lz/l;->b:Lie/o;

    .line 37
    .line 38
    move-object v7, p3

    .line 39
    goto :goto_2

    .line 40
    :cond_4
    move-object/from16 v7, p7

    .line 41
    .line 42
    :goto_2
    and-int/lit16 p3, v0, 0x80

    .line 43
    .line 44
    if-eqz p3, :cond_5

    .line 45
    .line 46
    move v8, p4

    .line 47
    :goto_3
    move-object v0, p0

    .line 48
    move-object v1, p1

    .line 49
    move-object v2, p2

    .line 50
    goto :goto_4

    .line 51
    :cond_5
    move/from16 v8, p8

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :goto_4
    invoke-static/range {v0 .. v8}, Lz/l;->g(Landroidx/compose/ui/e;Lz/m;Lz/q;ZLB/m;ZLie/o;Lie/o;Z)Landroidx/compose/ui/e;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method

.method public static final i(Lkotlin/jvm/functions/Function1;LY/m;I)Lz/m;
    .locals 3

    .line 1
    invoke-static {}, LY/w;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    const-string v1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:135)"

    .line 9
    .line 10
    const v2, -0xaec199d

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    and-int/lit8 p2, p2, 0xe

    .line 17
    .line 18
    invoke-static {p0, p1, p2}, LY/U1;->o(Ljava/lang/Object;LY/m;I)LY/h2;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p1}, LY/m;->D()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    sget-object v0, LY/m;->a:LY/m$a;

    .line 27
    .line 28
    invoke-virtual {v0}, LY/m$a;->a()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-ne p2, v0, :cond_1

    .line 33
    .line 34
    new-instance p2, Lz/l$c;

    .line 35
    .line 36
    invoke-direct {p2, p0}, Lz/l$c;-><init>(LY/h2;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p2}, Lz/l;->a(Lkotlin/jvm/functions/Function1;)Lz/m;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-interface {p1, p2}, LY/m;->u(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    check-cast p2, Lz/m;

    .line 47
    .line 48
    invoke-static {}, LY/w;->L()Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_2

    .line 53
    .line 54
    invoke-static {}, LY/w;->T()V

    .line 55
    .line 56
    .line 57
    :cond_2
    return-object p2
.end method

.method private static final j(JLz/q;)F
    .locals 1

    .line 1
    sget-object v0, Lz/q;->a:Lz/q;

    .line 2
    .line 3
    if-ne p2, v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0, p1}, Lr0/f;->n(J)F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    invoke-static {p0, p1}, Lr0/f;->m(J)F

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method private static final k(JLz/q;)F
    .locals 1

    .line 1
    sget-object v0, Lz/q;->a:Lz/q;

    .line 2
    .line 3
    if-ne p2, v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0, p1}, Li1/y;->i(J)F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    invoke-static {p0, p1}, Li1/y;->h(J)F

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method private static final l(J)J
    .locals 3

    .line 1
    invoke-static {p0, p1}, Li1/y;->h(J)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    move v0, v1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {p0, p1}, Li1/y;->h(J)F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    :goto_0
    invoke-static {p0, p1}, Li1/y;->i(J)F

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    invoke-static {p0, p1}, Li1/y;->i(J)F

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    :goto_1
    invoke-static {v0, v1}, Li1/z;->a(FF)J

    .line 34
    .line 35
    .line 36
    move-result-wide p0

    .line 37
    return-wide p0
.end method
