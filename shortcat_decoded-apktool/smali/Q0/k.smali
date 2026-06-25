.class public final LQ0/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LQ0/c$a;


# instance fields
.field private final a:LY/C0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-static {v0, v1, v2, v1}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, LQ0/k;->a:LY/C0;

    .line 13
    .line 14
    return-void
.end method

.method private final e(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LQ0/k;->a:LY/C0;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, LQ0/k;->e(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public b()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, LQ0/k;->e(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-object v0, p0, LQ0/k;->a:LY/C0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/h2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final d(Landroid/view/View;LR0/v;LZd/i;Ljava/util/function/Consumer;)V
    .locals 11

    .line 1
    new-instance v0, La0/c;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    new-array v1, v1, [LQ0/l;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v0, v1, v2}, La0/c;-><init>([Ljava/lang/Object;I)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, LR0/v;->d()LR0/s;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    new-instance v1, LQ0/k$a;

    .line 16
    .line 17
    invoke-direct {v1, v0}, LQ0/k$a;-><init>(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    const/4 v3, 0x2

    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-static {p2, v2, v1, v3, v4}, LQ0/m;->e(LR0/s;ILkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-array p2, v3, [Lkotlin/jvm/functions/Function1;

    .line 26
    .line 27
    sget-object v1, LQ0/k$b;->a:LQ0/k$b;

    .line 28
    .line 29
    aput-object v1, p2, v2

    .line 30
    .line 31
    sget-object v1, LQ0/k$c;->a:LQ0/k$c;

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    aput-object v1, p2, v2

    .line 35
    .line 36
    invoke-static {p2}, LXd/a;->b([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {v0, p2}, La0/c;->G(Ljava/util/Comparator;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, La0/c;->p()I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-nez p2, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {v0}, La0/c;->p()I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    sub-int/2addr p2, v2

    .line 55
    iget-object v0, v0, La0/c;->a:[Ljava/lang/Object;

    .line 56
    .line 57
    aget-object v4, v0, p2

    .line 58
    .line 59
    :goto_0
    check-cast v4, LQ0/l;

    .line 60
    .line 61
    if-nez v4, :cond_1

    .line 62
    .line 63
    return-void

    .line 64
    :cond_1
    invoke-static {p3}, LGf/P;->a(LZd/i;)LGf/O;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    new-instance v5, LQ0/c;

    .line 69
    .line 70
    invoke-virtual {v4}, LQ0/l;->c()LR0/s;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-virtual {v4}, LQ0/l;->d()Li1/p;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    move-object v9, p0

    .line 79
    move-object v10, p1

    .line 80
    invoke-direct/range {v5 .. v10}, LQ0/c;-><init>(LR0/s;Li1/p;LGf/O;LQ0/c$a;Landroid/view/View;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4}, LQ0/l;->a()LI0/p;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-static {p1}, LI0/q;->b(LI0/p;)Lr0/h;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {v4}, LQ0/l;->d()Li1/p;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    invoke-virtual {p2}, Li1/p;->i()J

    .line 96
    .line 97
    .line 98
    move-result-wide p2

    .line 99
    invoke-static {p1}, Li1/q;->b(Lr0/h;)Li1/p;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {p1}, Ls0/s1;->a(Li1/p;)Landroid/graphics/Rect;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    new-instance v0, Landroid/graphics/Point;

    .line 108
    .line 109
    invoke-static {p2, p3}, Li1/n;->k(J)I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    invoke-static {p2, p3}, Li1/n;->l(J)I

    .line 114
    .line 115
    .line 116
    move-result p2

    .line 117
    invoke-direct {v0, v1, p2}, Landroid/graphics/Point;-><init>(II)V

    .line 118
    .line 119
    .line 120
    invoke-static {v5}, LQ0/i;->a(Ljava/lang/Object;)Landroid/view/ScrollCaptureCallback;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    invoke-static {v10, p1, v0, p2}, LQ0/h;->a(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Point;Landroid/view/ScrollCaptureCallback;)Landroid/view/ScrollCaptureTarget;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {v4}, LQ0/l;->d()Li1/p;

    .line 129
    .line 130
    .line 131
    move-result-object p2

    .line 132
    invoke-static {p2}, Ls0/s1;->a(Li1/p;)Landroid/graphics/Rect;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    invoke-static {p1, p2}, LQ0/j;->a(Landroid/view/ScrollCaptureTarget;Landroid/graphics/Rect;)V

    .line 137
    .line 138
    .line 139
    invoke-interface {p4, p1}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    return-void
.end method
