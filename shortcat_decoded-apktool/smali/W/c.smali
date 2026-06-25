.class public abstract LW/c;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Lw/D;

.field private static final b:Lw/r0;

.field private static final c:Lw/r0;

.field private static final d:Lw/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v3, Lw/x;

    .line 2
    .line 3
    const v0, 0x3f19999a    # 0.6f

    .line 4
    .line 5
    .line 6
    const/high16 v1, 0x3f800000    # 1.0f

    .line 7
    .line 8
    const v2, 0x3ecccccd    # 0.4f

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    invoke-direct {v3, v2, v4, v0, v1}, Lw/x;-><init>(FFFF)V

    .line 13
    .line 14
    .line 15
    sput-object v3, LW/c;->a:Lw/D;

    .line 16
    .line 17
    new-instance v5, Lw/r0;

    .line 18
    .line 19
    invoke-static {}, Lw/F;->d()Lw/D;

    .line 20
    .line 21
    .line 22
    move-result-object v8

    .line 23
    const/4 v9, 0x2

    .line 24
    const/4 v10, 0x0

    .line 25
    const/16 v6, 0x78

    .line 26
    .line 27
    const/4 v7, 0x0

    .line 28
    invoke-direct/range {v5 .. v10}, Lw/r0;-><init>(IILw/D;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 29
    .line 30
    .line 31
    sput-object v5, LW/c;->b:Lw/r0;

    .line 32
    .line 33
    new-instance v0, Lw/r0;

    .line 34
    .line 35
    const/4 v4, 0x2

    .line 36
    const/4 v5, 0x0

    .line 37
    const/16 v1, 0x96

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    invoke-direct/range {v0 .. v5}, Lw/r0;-><init>(IILw/D;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 41
    .line 42
    .line 43
    sput-object v0, LW/c;->c:Lw/r0;

    .line 44
    .line 45
    new-instance v0, Lw/r0;

    .line 46
    .line 47
    const/16 v1, 0x78

    .line 48
    .line 49
    invoke-direct/range {v0 .. v5}, Lw/r0;-><init>(IILw/D;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 50
    .line 51
    .line 52
    sput-object v0, LW/c;->d:Lw/r0;

    .line 53
    .line 54
    return-void
.end method

.method public static final synthetic a()Lw/r0;
    .locals 1

    .line 1
    sget-object v0, LW/c;->b:Lw/r0;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic b()Lw/r0;
    .locals 1

    .line 1
    sget-object v0, LW/c;->c:Lw/r0;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic c()Lw/r0;
    .locals 1

    .line 1
    sget-object v0, LW/c;->d:Lw/r0;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final d(Lw/a;FLB/j;LB/j;LZd/e;)Ljava/lang/Object;
    .locals 8

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    sget-object p2, LW/b;->a:LW/b;

    .line 4
    .line 5
    invoke-virtual {p2, p3}, LW/b;->a(LB/j;)Lw/i;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    :goto_0
    move-object v2, p2

    .line 10
    goto :goto_1

    .line 11
    :cond_0
    if-eqz p2, :cond_1

    .line 12
    .line 13
    sget-object p3, LW/b;->a:LW/b;

    .line 14
    .line 15
    invoke-virtual {p3, p2}, LW/b;->b(LB/j;)Lw/i;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p2, 0x0

    .line 21
    goto :goto_0

    .line 22
    :goto_1
    if-eqz v2, :cond_3

    .line 23
    .line 24
    invoke-static {p1}, Li1/h;->h(F)Li1/h;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const/16 v6, 0xc

    .line 29
    .line 30
    const/4 v7, 0x0

    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    move-object v0, p0

    .line 34
    move-object v5, p4

    .line 35
    invoke-static/range {v0 .. v7}, Lw/a;->f(Lw/a;Ljava/lang/Object;Lw/i;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;LZd/e;ILjava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    if-ne p0, p1, :cond_2

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_2
    sget-object p0, LTd/L;->a:LTd/L;

    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_3
    move-object v0, p0

    .line 50
    move-object v5, p4

    .line 51
    invoke-static {p1}, Li1/h;->h(F)Li1/h;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {v0, p0, v5}, Lw/a;->s(Ljava/lang/Object;LZd/e;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    if-ne p0, p1, :cond_4

    .line 64
    .line 65
    return-object p0

    .line 66
    :cond_4
    sget-object p0, LTd/L;->a:LTd/L;

    .line 67
    .line 68
    return-object p0
.end method
