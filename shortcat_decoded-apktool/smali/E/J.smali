.class public abstract LE/J;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:LE/u;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .line 1
    new-instance v5, LE/J$a;

    .line 2
    .line 3
    invoke-direct {v5}, LE/J$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object v11

    .line 10
    sget-object v16, Lz/q;->a:Lz/q;

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    const/4 v1, 0x0

    .line 14
    const/high16 v2, 0x3f800000    # 1.0f

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-static {v2, v3, v0, v1}, Li1/f;->b(FFILjava/lang/Object;)Li1/d;

    .line 18
    .line 19
    .line 20
    move-result-object v8

    .line 21
    sget-object v0, LZd/j;->a:LZd/j;

    .line 22
    .line 23
    invoke-static {v0}, LGf/P;->a(LZd/i;)LGf/O;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    new-instance v0, LE/u;

    .line 28
    .line 29
    sget-object v10, LE/J$b;->a:LE/J$b;

    .line 30
    .line 31
    const/16 v17, 0x0

    .line 32
    .line 33
    const/16 v18, 0x0

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    const/4 v3, 0x0

    .line 37
    const/4 v4, 0x0

    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v9, 0x0

    .line 40
    const/4 v12, 0x0

    .line 41
    const/4 v13, 0x0

    .line 42
    const/4 v14, 0x0

    .line 43
    const/4 v15, 0x0

    .line 44
    invoke-direct/range {v0 .. v18}, LE/u;-><init>(LE/x;IZFLI0/C;ZLGf/O;Li1/d;ILkotlin/jvm/functions/Function1;Ljava/util/List;IIIZLz/q;II)V

    .line 45
    .line 46
    .line 47
    sput-object v0, LE/J;->a:LE/u;

    .line 48
    .line 49
    return-void
.end method

.method public static final synthetic a()LE/u;
    .locals 1

    .line 1
    sget-object v0, LE/J;->a:LE/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final b(IILY/m;II)LE/I;
    .locals 10

    .line 1
    and-int/lit8 v0, p4, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move p0, v1

    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x2

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    move p1, v1

    .line 12
    :cond_1
    invoke-static {}, LY/w;->L()Z

    .line 13
    .line 14
    .line 15
    move-result p4

    .line 16
    if-eqz p4, :cond_2

    .line 17
    .line 18
    const/4 p4, -0x1

    .line 19
    const-string v0, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:71)"

    .line 20
    .line 21
    const v2, 0x1bd5b8c

    .line 22
    .line 23
    .line 24
    invoke-static {v2, p3, p4, v0}, LY/w;->U(IIILjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_2
    new-array v3, v1, [Ljava/lang/Object;

    .line 28
    .line 29
    sget-object p4, LE/I;->v:LE/I$c;

    .line 30
    .line 31
    invoke-virtual {p4}, LE/I$c;->a()Lh0/v;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    and-int/lit8 p4, p3, 0xe

    .line 36
    .line 37
    xor-int/lit8 p4, p4, 0x6

    .line 38
    .line 39
    const/4 v0, 0x4

    .line 40
    const/4 v2, 0x1

    .line 41
    if-le p4, v0, :cond_3

    .line 42
    .line 43
    invoke-interface {p2, p0}, LY/m;->c(I)Z

    .line 44
    .line 45
    .line 46
    move-result p4

    .line 47
    if-nez p4, :cond_4

    .line 48
    .line 49
    :cond_3
    and-int/lit8 p4, p3, 0x6

    .line 50
    .line 51
    if-ne p4, v0, :cond_5

    .line 52
    .line 53
    :cond_4
    move p4, v2

    .line 54
    goto :goto_0

    .line 55
    :cond_5
    move p4, v1

    .line 56
    :goto_0
    and-int/lit8 v0, p3, 0x70

    .line 57
    .line 58
    xor-int/lit8 v0, v0, 0x30

    .line 59
    .line 60
    const/16 v5, 0x20

    .line 61
    .line 62
    if-le v0, v5, :cond_6

    .line 63
    .line 64
    invoke-interface {p2, p1}, LY/m;->c(I)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_7

    .line 69
    .line 70
    :cond_6
    and-int/lit8 p3, p3, 0x30

    .line 71
    .line 72
    if-ne p3, v5, :cond_8

    .line 73
    .line 74
    :cond_7
    move v1, v2

    .line 75
    :cond_8
    or-int p3, p4, v1

    .line 76
    .line 77
    invoke-interface {p2}, LY/m;->D()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p4

    .line 81
    if-nez p3, :cond_9

    .line 82
    .line 83
    sget-object p3, LY/m;->a:LY/m$a;

    .line 84
    .line 85
    invoke-virtual {p3}, LY/m$a;->a()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p3

    .line 89
    if-ne p4, p3, :cond_a

    .line 90
    .line 91
    :cond_9
    new-instance p4, LE/J$c;

    .line 92
    .line 93
    invoke-direct {p4, p0, p1}, LE/J$c;-><init>(II)V

    .line 94
    .line 95
    .line 96
    invoke-interface {p2, p4}, LY/m;->u(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    :cond_a
    move-object v6, p4

    .line 100
    check-cast v6, Lie/a;

    .line 101
    .line 102
    const/4 v8, 0x0

    .line 103
    const/4 v9, 0x4

    .line 104
    const/4 v5, 0x0

    .line 105
    move-object v7, p2

    .line 106
    invoke-static/range {v3 .. v9}, Lh0/d;->e([Ljava/lang/Object;Lh0/v;Ljava/lang/String;Lie/a;LY/m;II)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    check-cast p0, LE/I;

    .line 111
    .line 112
    invoke-static {}, LY/w;->L()Z

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-eqz p1, :cond_b

    .line 117
    .line 118
    invoke-static {}, LY/w;->T()V

    .line 119
    .line 120
    .line 121
    :cond_b
    return-object p0
.end method
