.class public abstract LS/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static a:Lx0/d;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final a(LR/a;)Lx0/d;
    .locals 18

    .line 1
    sget-object v0, LS/a;->a:Lx0/d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    new-instance v1, Lx0/d$a;

    .line 10
    .line 11
    const/high16 v0, 0x41c00000    # 24.0f

    .line 12
    .line 13
    invoke-static {v0}, Li1/h;->n(F)F

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-static {v0}, Li1/h;->n(F)F

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    const/16 v11, 0x60

    .line 22
    .line 23
    const/4 v12, 0x0

    .line 24
    const-string v2, "Filled.Close"

    .line 25
    .line 26
    const/high16 v5, 0x41c00000    # 24.0f

    .line 27
    .line 28
    const/high16 v6, 0x41c00000    # 24.0f

    .line 29
    .line 30
    const-wide/16 v7, 0x0

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const/4 v10, 0x0

    .line 34
    invoke-direct/range {v1 .. v12}, Lx0/d$a;-><init>(Ljava/lang/String;FFFFJIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 35
    .line 36
    .line 37
    invoke-static {}, Lx0/o;->a()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    new-instance v5, Ls0/F1;

    .line 42
    .line 43
    sget-object v0, Ls0/r0;->b:Ls0/r0$a;

    .line 44
    .line 45
    invoke-virtual {v0}, Ls0/r0$a;->a()J

    .line 46
    .line 47
    .line 48
    move-result-wide v6

    .line 49
    const/4 v0, 0x0

    .line 50
    invoke-direct {v5, v6, v7, v0}, Ls0/F1;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Ls0/G1;->a:Ls0/G1$a;

    .line 54
    .line 55
    invoke-virtual {v0}, Ls0/G1$a;->a()I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    sget-object v0, Ls0/H1;->a:Ls0/H1$a;

    .line 60
    .line 61
    invoke-virtual {v0}, Ls0/H1$a;->a()I

    .line 62
    .line 63
    .line 64
    move-result v11

    .line 65
    new-instance v0, Lx0/f;

    .line 66
    .line 67
    invoke-direct {v0}, Lx0/f;-><init>()V

    .line 68
    .line 69
    .line 70
    const/high16 v2, 0x41980000    # 19.0f

    .line 71
    .line 72
    const v4, 0x40cd1eb8    # 6.41f

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v2, v4}, Lx0/f;->i(FF)Lx0/f;

    .line 76
    .line 77
    .line 78
    const v6, 0x418cb852    # 17.59f

    .line 79
    .line 80
    .line 81
    const/high16 v7, 0x40a00000    # 5.0f

    .line 82
    .line 83
    invoke-virtual {v0, v6, v7}, Lx0/f;->g(FF)Lx0/f;

    .line 84
    .line 85
    .line 86
    const/high16 v8, 0x41400000    # 12.0f

    .line 87
    .line 88
    const v9, 0x412970a4    # 10.59f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v8, v9}, Lx0/f;->g(FF)Lx0/f;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v4, v7}, Lx0/f;->g(FF)Lx0/f;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v7, v4}, Lx0/f;->g(FF)Lx0/f;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v9, v8}, Lx0/f;->g(FF)Lx0/f;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v7, v6}, Lx0/f;->g(FF)Lx0/f;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v4, v2}, Lx0/f;->g(FF)Lx0/f;

    .line 107
    .line 108
    .line 109
    const v4, 0x41568f5c    # 13.41f

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v8, v4}, Lx0/f;->g(FF)Lx0/f;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v6, v2}, Lx0/f;->g(FF)Lx0/f;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0, v2, v6}, Lx0/f;->g(FF)Lx0/f;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v4, v8}, Lx0/f;->g(FF)Lx0/f;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Lx0/f;->a()Lx0/f;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Lx0/f;->d()Ljava/util/List;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    const/16 v16, 0x3800

    .line 132
    .line 133
    const/16 v17, 0x0

    .line 134
    .line 135
    const-string v4, ""

    .line 136
    .line 137
    const/high16 v6, 0x3f800000    # 1.0f

    .line 138
    .line 139
    const/4 v7, 0x0

    .line 140
    const/high16 v8, 0x3f800000    # 1.0f

    .line 141
    .line 142
    const/high16 v9, 0x3f800000    # 1.0f

    .line 143
    .line 144
    const/high16 v12, 0x3f800000    # 1.0f

    .line 145
    .line 146
    const/4 v13, 0x0

    .line 147
    const/4 v14, 0x0

    .line 148
    const/4 v15, 0x0

    .line 149
    invoke-static/range {v1 .. v17}, Lx0/d$a;->d(Lx0/d$a;Ljava/util/List;ILjava/lang/String;Ls0/h0;FLs0/h0;FFIIFFFFILjava/lang/Object;)Lx0/d$a;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    invoke-virtual {v0}, Lx0/d$a;->f()Lx0/d;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    sput-object v0, LS/a;->a:Lx0/d;

    .line 158
    .line 159
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    return-object v0
.end method
