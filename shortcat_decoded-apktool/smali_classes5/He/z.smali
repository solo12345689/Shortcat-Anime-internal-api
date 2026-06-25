.class public final LHe/z;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lbf/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LHe/z$a;
    }
.end annotation


# static fields
.field public static final a:LHe/z$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LHe/z$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LHe/z$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LHe/z;->a:LHe/z$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final c(Lye/a;Lye/a;Lye/e;)Z
    .locals 7

    .line 1
    instance-of v0, p1, Lye/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_9

    .line 5
    .line 6
    instance-of v0, p2, Lye/z;

    .line 7
    .line 8
    if-eqz v0, :cond_9

    .line 9
    .line 10
    invoke-static {p2}, Lve/i;->h0(Lye/m;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto/16 :goto_2

    .line 17
    .line 18
    :cond_0
    sget-object v0, LHe/i;->o:LHe/i;

    .line 19
    .line 20
    check-cast p2, Lye/z;

    .line 21
    .line 22
    invoke-interface {p2}, Lye/J;->getName()LXe/f;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const-string v3, "getName(...)"

    .line 27
    .line 28
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2}, LHe/i;->n(LXe/f;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    sget-object v0, LHe/U;->a:LHe/U$a;

    .line 38
    .line 39
    invoke-interface {p2}, Lye/J;->getName()LXe/f;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v2}, LHe/U$a;->k(LXe/f;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    return v1

    .line 53
    :cond_1
    move-object v0, p1

    .line 54
    check-cast v0, Lye/b;

    .line 55
    .line 56
    invoke-static {v0}, LHe/T;->j(Lye/b;)Lye/b;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    instance-of v2, p1, Lye/z;

    .line 61
    .line 62
    const/4 v3, 0x0

    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    move-object v4, p1

    .line 66
    check-cast v4, Lye/z;

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    move-object v4, v3

    .line 70
    :goto_0
    const/4 v5, 0x1

    .line 71
    if-eqz v4, :cond_3

    .line 72
    .line 73
    invoke-interface {p2}, Lye/z;->D0()Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    invoke-interface {v4}, Lye/z;->D0()Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    if-ne v6, v4, :cond_3

    .line 82
    .line 83
    move v4, v5

    .line 84
    goto :goto_1

    .line 85
    :cond_3
    move v4, v1

    .line 86
    :goto_1
    if-nez v4, :cond_5

    .line 87
    .line 88
    if-eqz v0, :cond_4

    .line 89
    .line 90
    invoke-interface {p2}, Lye/z;->D0()Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-nez v4, :cond_5

    .line 95
    .line 96
    :cond_4
    return v5

    .line 97
    :cond_5
    instance-of v4, p3, LJe/c;

    .line 98
    .line 99
    if-eqz v4, :cond_9

    .line 100
    .line 101
    invoke-interface {p2}, Lye/z;->t0()Lye/z;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    if-eqz v4, :cond_6

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_6
    if-eqz v0, :cond_9

    .line 109
    .line 110
    invoke-static {p3, v0}, LHe/T;->l(Lye/e;Lye/a;)Z

    .line 111
    .line 112
    .line 113
    move-result p3

    .line 114
    if-eqz p3, :cond_7

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_7
    instance-of p3, v0, Lye/z;

    .line 118
    .line 119
    if-eqz p3, :cond_8

    .line 120
    .line 121
    if-eqz v2, :cond_8

    .line 122
    .line 123
    check-cast v0, Lye/z;

    .line 124
    .line 125
    invoke-static {v0}, LHe/i;->l(Lye/z;)Lye/z;

    .line 126
    .line 127
    .line 128
    move-result-object p3

    .line 129
    if-eqz p3, :cond_8

    .line 130
    .line 131
    const/4 p3, 0x2

    .line 132
    invoke-static {p2, v1, v1, p3, v3}, LQe/C;->c(Lye/z;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    check-cast p1, Lye/z;

    .line 137
    .line 138
    invoke-interface {p1}, Lye/z;->a()Lye/z;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    const-string v0, "getOriginal(...)"

    .line 143
    .line 144
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-static {p1, v1, v1, p3, v3}, LQe/C;->c(Lye/z;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-static {p2, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result p1

    .line 155
    if-eqz p1, :cond_8

    .line 156
    .line 157
    return v1

    .line 158
    :cond_8
    return v5

    .line 159
    :cond_9
    :goto_2
    return v1
.end method


# virtual methods
.method public a(Lye/a;Lye/a;Lye/e;)Lbf/j$b;
    .locals 1

    .line 1
    const-string v0, "superDescriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "subDescriptor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2, p3}, LHe/z;->c(Lye/a;Lye/a;Lye/e;)Z

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    if-eqz p3, :cond_0

    .line 16
    .line 17
    sget-object p1, Lbf/j$b;->b:Lbf/j$b;

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    sget-object p3, LHe/z;->a:LHe/z$a;

    .line 21
    .line 22
    invoke-virtual {p3, p1, p2}, LHe/z$a;->a(Lye/a;Lye/a;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    sget-object p1, Lbf/j$b;->b:Lbf/j$b;

    .line 29
    .line 30
    return-object p1

    .line 31
    :cond_1
    sget-object p1, Lbf/j$b;->c:Lbf/j$b;

    .line 32
    .line 33
    return-object p1
.end method

.method public b()Lbf/j$a;
    .locals 1

    .line 1
    sget-object v0, Lbf/j$a;->a:Lbf/j$a;

    .line 2
    .line 3
    return-object v0
.end method
