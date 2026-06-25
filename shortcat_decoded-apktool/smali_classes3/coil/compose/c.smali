.class public abstract Lcoil/compose/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Li1/b;->b:Li1/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1, v1}, Li1/b$a;->c(II)J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    sput-wide v0, Lcoil/compose/c;->a:J

    .line 9
    .line 10
    return-void
.end method

.method public static final a(JF)F
    .locals 1

    .line 1
    invoke-static {p0, p1}, Li1/b;->m(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    invoke-static {p0, p1}, Li1/b;->k(J)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    int-to-float p0, p0

    .line 11
    invoke-static {p2, v0, p0}, Loe/j;->l(FFF)F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public static final b(JF)F
    .locals 1

    .line 1
    invoke-static {p0, p1}, Li1/b;->n(J)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v0, v0

    .line 6
    invoke-static {p0, p1}, Li1/b;->l(J)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    int-to-float p0, p0

    .line 11
    invoke-static {p2, v0, p0}, Loe/j;->l(FFF)F

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public static final c()J
    .locals 2

    .line 1
    sget-wide v0, Lcoil/compose/c;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    if-nez p0, :cond_1

    .line 2
    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    return-object p0

    .line 10
    :cond_1
    :goto_0
    new-instance v0, Lcoil/compose/c$a;

    .line 11
    .line 12
    invoke-direct {v0, p0, p1, p2}, Lcoil/compose/c$a;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public static final e(Ljava/lang/Object;LY/m;I)LG4/h;
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
    const-string v1, "coil.compose.requestOf (Utils.kt:21)"

    .line 9
    .line 10
    const v2, 0x44a78b4a

    .line 11
    .line 12
    .line 13
    invoke-static {v2, p2, v0, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    instance-of p2, p0, LG4/h;

    .line 17
    .line 18
    if-eqz p2, :cond_1

    .line 19
    .line 20
    check-cast p0, LG4/h;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    new-instance p2, LG4/h$a;

    .line 24
    .line 25
    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->g()LY/b1;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {p1, v0}, LY/m;->n(LY/D;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Landroid/content/Context;

    .line 34
    .line 35
    invoke-direct {p2, p1}, LG4/h$a;-><init>(Landroid/content/Context;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2, p0}, LG4/h$a;->c(Ljava/lang/Object;)LG4/h$a;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, LG4/h$a;->a()LG4/h;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method

.method public static final f(J)J
    .locals 1

    .line 1
    invoke-static {p0, p1}, Lr0/l;->i(J)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lke/a;->d(F)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {p0, p1}, Lr0/l;->g(J)F

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-static {p0}, Lke/a;->d(F)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {v0, p0}, Li1/s;->a(II)J

    .line 18
    .line 19
    .line 20
    move-result-wide p0

    .line 21
    return-wide p0
.end method

.method public static final g(LI0/f;)LH4/g;
    .locals 2

    .line 1
    sget-object v0, LI0/f;->a:LI0/f$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LI0/f$a;->b()LI0/f;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {p0, v1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v0}, LI0/f$a;->c()LI0/f;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    :goto_0
    if-eqz p0, :cond_1

    .line 24
    .line 25
    sget-object p0, LH4/g;->b:LH4/g;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_1
    sget-object p0, LH4/g;->a:LH4/g;

    .line 29
    .line 30
    return-object p0
.end method

.method public static final h(Lw0/b;Lw0/b;Lw0/b;)Lkotlin/jvm/functions/Function1;
    .locals 1

    .line 1
    if-nez p0, :cond_1

    .line 2
    .line 3
    if-nez p1, :cond_1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object p0, Lcoil/compose/AsyncImagePainter;->v:Lcoil/compose/AsyncImagePainter$b;

    .line 9
    .line 10
    invoke-virtual {p0}, Lcoil/compose/AsyncImagePainter$b;->a()Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_1
    :goto_0
    new-instance v0, Lcoil/compose/c$b;

    .line 16
    .line 17
    invoke-direct {v0, p0, p2, p1}, Lcoil/compose/c$b;-><init>(Lw0/b;Lw0/b;Lw0/b;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method
