.class public abstract Lv/v;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Lw/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x7

    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-static {v2, v2, v0, v1, v0}, Lw/j;->h(FFLjava/lang/Object;ILjava/lang/Object;)Lw/h0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Lv/v;->a:Lw/h0;

    .line 9
    .line 10
    return-void
.end method

.method public static final a(JLw/i;Ljava/lang/String;Lkotlin/jvm/functions/Function1;LY/m;II)LY/h2;
    .locals 9

    .line 1
    and-int/lit8 v0, p7, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p2, Lv/v;->a:Lw/h0;

    .line 6
    .line 7
    :cond_0
    move-object v2, p2

    .line 8
    and-int/lit8 p2, p7, 0x4

    .line 9
    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    const-string p3, "ColorAnimation"

    .line 13
    .line 14
    :cond_1
    move-object v4, p3

    .line 15
    and-int/lit8 p2, p7, 0x8

    .line 16
    .line 17
    if-eqz p2, :cond_2

    .line 18
    .line 19
    const/4 p4, 0x0

    .line 20
    :cond_2
    move-object v5, p4

    .line 21
    invoke-static {}, LY/w;->L()Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-eqz p2, :cond_3

    .line 26
    .line 27
    const/4 p2, -0x1

    .line 28
    const-string p3, "androidx.compose.animation.animateColorAsState (SingleValueAnimation.kt:61)"

    .line 29
    .line 30
    const p4, -0x1aef6ee4

    .line 31
    .line 32
    .line 33
    invoke-static {p4, p6, p2, p3}, LY/w;->U(IIILjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_3
    invoke-static {p0, p1}, Ls0/r0;->v(J)Lt0/c;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-interface {p5, p2}, LY/m;->U(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    invoke-interface {p5}, LY/m;->D()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    if-nez p2, :cond_4

    .line 49
    .line 50
    sget-object p2, LY/m;->a:LY/m$a;

    .line 51
    .line 52
    invoke-virtual {p2}, LY/m$a;->a()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    if-ne p3, p2, :cond_5

    .line 57
    .line 58
    :cond_4
    sget-object p2, Ls0/r0;->b:Ls0/r0$a;

    .line 59
    .line 60
    invoke-static {p2}, Lv/i;->a(Ls0/r0$a;)Lkotlin/jvm/functions/Function1;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-static {p0, p1}, Ls0/r0;->v(J)Lt0/c;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    invoke-interface {p2, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    move-object p3, p2

    .line 73
    check-cast p3, Lw/s0;

    .line 74
    .line 75
    invoke-interface {p5, p3}, LY/m;->u(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    :cond_5
    move-object v1, p3

    .line 79
    check-cast v1, Lw/s0;

    .line 80
    .line 81
    invoke-static {p0, p1}, Ls0/r0;->m(J)Ls0/r0;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    and-int/lit8 p0, p6, 0xe

    .line 86
    .line 87
    shl-int/lit8 p1, p6, 0x3

    .line 88
    .line 89
    and-int/lit16 p1, p1, 0x380

    .line 90
    .line 91
    or-int/2addr p0, p1

    .line 92
    shl-int/lit8 p1, p6, 0x6

    .line 93
    .line 94
    const p2, 0xe000

    .line 95
    .line 96
    .line 97
    and-int/2addr p2, p1

    .line 98
    or-int/2addr p0, p2

    .line 99
    const/high16 p2, 0x70000

    .line 100
    .line 101
    and-int/2addr p1, p2

    .line 102
    or-int v7, p0, p1

    .line 103
    .line 104
    const/16 v8, 0x8

    .line 105
    .line 106
    const/4 v3, 0x0

    .line 107
    move-object v6, p5

    .line 108
    invoke-static/range {v0 .. v8}, Lw/c;->e(Ljava/lang/Object;Lw/s0;Lw/i;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;LY/m;II)LY/h2;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    invoke-static {}, LY/w;->L()Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-eqz p1, :cond_6

    .line 117
    .line 118
    invoke-static {}, LY/w;->T()V

    .line 119
    .line 120
    .line 121
    :cond_6
    return-object p0
.end method
